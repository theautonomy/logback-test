package com.test.logback;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Test3 {

	final static Logger logger = LoggerFactory.getLogger(Test3.class);

	public static void main(String[] args) throws InterruptedException {

		SLF4jConfigUtil.configure("./src/main/resources/logback-test3.xml");

		int i = 0;
		while (true) {
			logger.debug("test pass config file {}", i);
			i++;
			Thread.sleep(2000);
		}

	}
}
