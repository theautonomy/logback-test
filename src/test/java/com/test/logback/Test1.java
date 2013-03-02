package com.test.logback;

import org.junit.Test;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;


public class Test1 {

	@Test
	public void testLog() { 
		Logger logger = LoggerFactory.getLogger(Test1.class);
		logger.debug("this is a test");
	}
}
