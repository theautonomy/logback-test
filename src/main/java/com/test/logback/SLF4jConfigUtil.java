package com.test.logback;

import java.io.File;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.classic.joran.JoranConfigurator;
import ch.qos.logback.core.joran.spi.JoranException;

public abstract class SLF4jConfigUtil {
	
	public static void configure(String loggerConigFile) {
		LoggerContext lc = (LoggerContext)LoggerFactory.getILoggerFactory();
		JoranConfigurator config = new JoranConfigurator();
		config.setContext(lc);
		lc.reset();
		try {
			config.doConfigure(new File(loggerConigFile));
		} catch (JoranException e) {
			e.printStackTrace();
		}
	}
}
