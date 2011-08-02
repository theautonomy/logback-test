package com.test.logback;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Test3 {
	
	final static Logger logger = LoggerFactory.getLogger(SLF4jConfigUtil.class);
	
	public static void main(String[] args) {
		
		SLF4jConfigUtil.configure("./src/main/resources/logback-test3.xml");
		
		logger.debug("test pass config file");
	}
}
