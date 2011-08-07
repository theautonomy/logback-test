## Introduction 

If you have used log4j before, switching to logback will be smooth. 
All you need to do are:

* Add logback-classic-0.9.29.jar, logback-core-0.9.29.jar and slf4japi-1.6.1.jar into the classpath;
* Prepare a logback configuration file.  Othwise, the default logback configuration will be used;

   According to this [manual](http://logback.qos.ch/manual/configuration.html),
   <pre>
    The initialization steps that logback follows to try to configure itself:
    Logback tries to find a file called logback.groovy in the classpath.
    If no such file is found, logback tries to find a file called logback-test.xml in the classpath.
    If no such file is found, it checks for the file logback.xml in the classpath..
    If neither file is found, logback configures itself automatically using the BasicConfigurator which will cause logging output to be directed to the console.
   </pre>
   
   Stay assured, logback allows you specify configuration file through as system property such as:
    java -Dlogback.configurationFile=/path/to/config.xml ....
    
   You can also load configuration file programmatically. 
   <pre>
  	    LoggerContext lc = (LoggerContext)LoggerFactory.getILoggerFactory();
		JoranConfigurator config = new JoranConfigurator();
		config.setContext(lc);
		lc.reset();
		try {
			config.doConfigure(new File("./src/main/resources/logback-test2.xml"));
		} catch (JoranException e) {
			e.printStackTrace();
		}
		logger.debug("test pass config file"); 
   </pre> 


## Examples 

* com.test.logback.Test1.java - use the configuration file logback-test.xml found in class
* com.test.logback.Test2.java - programmatically pass in configuration file location 


