package com.test.logback;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Test5 {

	final static Logger logger = LoggerFactory.getLogger(Test5.class);

	public static void main(String[] args) throws InterruptedException {

		SLF4jConfigUtil.configure("./src/main/resources/logback-test5.xml");

		logger.debug("DEBUG - test pass config file {}");
		
		logger.info("INFO - test pass config file {}");

	}
}
