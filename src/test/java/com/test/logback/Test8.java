package com.test.logback;

import java.util.Random;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.MDC;

public class Test8 {

	final static Logger logger = LoggerFactory.getLogger(Test8.class);

	@Test
	public void testLog() { 
		SLF4jConfigUtil.configure("./src/main/resources/logback-test8.xml");
		logger.info("about to start 10 thread");
		
		for (int i = 0; i < 5; i++) {
			Test8Thread tt = new Test8Thread();
			Thread t = new Thread(tt);
			String id = "id=User " + i;
			tt.setId(id);
			t.start();
		}
	}
}

class Test8Thread  implements Runnable {
	
	final static Logger logger = LoggerFactory.getLogger(Test8Thread.class);
	
	private String id;
	
	public void setId(String id) {
		this.id = id;
	}

	public String getId() {
		return id;
	}
	
	public void run() {
		MDC.put("id", id);
		logger.info("Enter the thread run method");
		logger.info("Do something in the thread run method");
		try {
			int i = new Random().nextInt(100);
			if (i % 2 == 0) {
				Thread.sleep(1000);
			} else {
				Thread.sleep(5000);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		logger.info("Exit  the thread run method");
		MDC.remove("id");
	}
}
