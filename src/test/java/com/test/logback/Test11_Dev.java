package com.test.logback;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Test11_Dev {

	final static Logger logger = LoggerFactory.getLogger(Test11_Dev.class);

	@Test
	public void testLog() {

		System.setProperty("logback.config.file.name", "/logback-test11-dev.xml");
		
		String fileName = System.getProperty("logback.config.file.name");

		SLF4jConfigUtil.configureUsingClassPathResource(fileName);
		
		logger.debug("This is a debug level log message");

		logger.info("This is an info level log message");
		
		logger.warn("This is a warn level log message");

	}
}
