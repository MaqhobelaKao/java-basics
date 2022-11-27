package com.opticsolutions.logging;

import java.io.IOException;
import java.util.logging.ConsoleHandler;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class LoggingExample {
	final private static Logger logger = Logger.getLogger(LoggingExample.class.getName()) ;

	public static void main(String[] args) throws SecurityException, IOException {
		// Disabling the default logging behavoir
		LogManager.getLogManager().reset();
		logger.setLevel(Level.ALL);
		
		ConsoleHandler ch = new ConsoleHandler();
		ch.setLevel(Level.SEVERE);
		logger.addHandler(ch);
		
		FileHandler fh = new FileHandler("mylogger.log");
		fh.setLevel(Level.FINE);
		logger.addHandler(fh);
		
		logger.log(Level.FINE, "My first logging example MAN");
	}

}
