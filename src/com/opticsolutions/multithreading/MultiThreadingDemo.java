package com.opticsolutions.multithreading;

public class MultiThreadingDemo {
	
	
	//  main method
	public static void main(String[] args) {
		Thread thread1 = new Thread(new MyThread());
		Thread thread2 = new ChildThread();
		Thread thread3 = new Thread(()-> System.out.println("Thread with name "+ Thread.currentThread().getName()));
		Thread thread4 = new Thread(MultiThreadingDemo::printThreadName);
		
		thread1.start();
		thread2.start();
		thread3.start();
		thread4.start();
	}
	
	
	
	public static void printThreadName() {
		System.out.println("Thread with name "+ Thread.currentThread().getName());
	}
}

class MyThread implements Runnable{
	@Override
	public void run() {
		System.out.println("Thread with name "+ Thread.currentThread().getName());
	}
	
}

class ChildThread  extends Thread{
	
	public ChildThread() {
		super();
	}

	@Override
	public void run() {
		System.out.println("Thread with name "+ Thread.currentThread().getName());
	}
	
}
