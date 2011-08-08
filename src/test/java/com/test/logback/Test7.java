package com.test.logback;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Test7 {

	final static Logger logger = LoggerFactory.getLogger(Test7.class);

	public static void main(String[] args) throws InterruptedException {

		SLF4jConfigUtil.configure("./src/main/resources/logback-test7.xml");

		int i = 0;
		while (true) {
			logger.debug("DEBUG - test pass config file {}", i);
			logger.info("INFO - test pass config file {}", i);
			i++;
			Thread.sleep(500);
		}

	}
}
