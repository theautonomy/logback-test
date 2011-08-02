package com.test.logback;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

public class Test1 {

	public static void main(String[] args) {
		
		Logger logger = LoggerFactory.getLogger(Test1.class);
		logger.debug("this is a test");

	}

}
