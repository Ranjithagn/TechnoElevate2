package com.te.logger;

import java.io.IOException;
import java.util.logging.ConsoleHandler;
import java.util.logging.FileHandler;
import java.util.logging.Formatter;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MyLogger {
	public static final	Logger  LOGGER = Logger.getLogger(MyLogger.class.getName());

	public static void main(String[] args)throws Exception,IOException {
	//ConsoleHandler consoleHandler = new ConsoleHandler();
	//consoleHandler.setLevel(Level.FINE);
	
	//LOGGER.addHandler(consoleHandler);
	FileHandler fileHandler = new FileHandler("C:\\Users\\Ranjitha\\Desktop\\a.log");
		Formatter myFormatter = new MyFormatter();
		fileHandler.setFormatter(myFormatter);
		LOGGER.addHandler(fileHandler);
	LOGGER.setLevel(Level.FINE);
	
	LOGGER.finest("i am from the finest");
	LOGGER.finer("i am from the finer");
	LOGGER.fine("i am from the fine");
	LOGGER.config("i am from the config");
	LOGGER.info("i am from the info");
	LOGGER.warning("i am from the warning");
	LOGGER.severe("i am from the severe");
	
	
	
	}

}
