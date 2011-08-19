package com.test.logback;

import org.junit.Test;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

import com.sun.xml.internal.ws.developer.UsesJAXBContext;

public class Test1 {

	@Test
	public void testLog() { 
		Logger logger = LoggerFactory.getLogger(Test1.class);
		logger.debug("this is a test");
	}
}
