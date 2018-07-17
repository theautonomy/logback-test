package com.test.logback;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Test10_prod {

	final static Logger logger = LoggerFactory.getLogger(Test10_prod.class);

	@Test
	public void testLog() {

		System.setProperty("ENV", "prod");
		SLF4jConfigUtil.configure("./src/main/resources/logback-test10.xml");

		logger.debug("This is a debug level log message");

		logger.info("This is an info level log message");
		
		logger.warn("This is a warn level log message");

	}
}
