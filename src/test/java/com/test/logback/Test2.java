package com.test.logback;

import java.io.File;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.classic.joran.JoranConfigurator;
import ch.qos.logback.core.joran.spi.JoranException;

public class Test2 {
	
	final static Logger logger = LoggerFactory.getLogger(Test2.class);
	
	public static void main(String[] args) {
		LoggerContext lc = (LoggerContext)LoggerFactory.getILoggerFactory();
		JoranConfigurator config = new JoranConfigurator();
		config.setContext(lc);
		lc.reset();
		try {
			config.doConfigure(new File("./src/main/resources/logback-test2.xml"));
		} catch (JoranException e) {
			e.printStackTrace();
		}
		logger.debug("test pass config file");
	}
}
