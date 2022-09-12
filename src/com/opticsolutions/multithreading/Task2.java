package com.opticsolutions.multithreading;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.TimeUnit;

public class Task2 {
	public static void main(String[] args) throws InterruptedException {
		ByteArrayInputStream bais = new ByteArrayInputStream(new byte[] { '\n' });
		int[] latency = { 1000, 1000, 1000, 1000, 1000, 1000 };
		String[] messages = { "First message", "Second message", "Third message", "Fourth message", "Fifth message",
				"Sixth message" };
		Spam spam = new Spam(latency, messages);

		spam.startSpam();
		

		TimeUnit.SECONDS.sleep(5);
		System.setIn(bais);
	}

	static class Spam implements Runnable {

		int[] intervals;
		String[] messages;

		public Spam(int[] intervals, String[] messages) {
			if (intervals.length != messages.length) {
				throw new IllegalArgumentException("Error! Arrays of latency and messages aren't equal!!!");
			}
			this.intervals = intervals;
			this.messages = messages;
		}

		@Override
		public void run() {
			try {
				for (int i = 0; i < messages.length; i++) {
					TimeUnit.MILLISECONDS.sleep(intervals[i]);
					System.out.println(messages[i]);
				}
			} catch (InterruptedException ex) {
				ex.printStackTrace();
			}
		}

		static class Listener implements Runnable {
			/**
			 * Thread for observing.
			 */
			private Thread thread;

			/**
			 * InputStream by default.
			 */
			public static final InputStream IN_DEFAULT = System.in;

			/**
			 * Constructor. Takes another thread as a parameter to listen events in parallel
			 * and terminate another thread when event will occur.
			 * 
			 * @param thread to listen.
			 */
			public Listener(Thread thread) {
				super();
				this.thread = thread;
			}

			/**
			 * Reads from the system in and wait for the enter.
			 */
			@Override
			public void run() {
				try {
					while (true) {
						if (System.in.available() > 0 && System.in.read() == '\n') {
							System.setIn(IN_DEFAULT);
							thread.interrupt();
						}
					}
				} catch (IOException e) {
				}
			}
		}

		public void startSpam() {
			var spam = new Thread(this);
			var listener = new Thread(new Listener(spam));

			spam.start();
			listener.setDaemon(true);
		}
	}

}
