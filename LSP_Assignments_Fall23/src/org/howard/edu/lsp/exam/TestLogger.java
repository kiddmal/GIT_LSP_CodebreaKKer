package org.howard.edu.lsp.exam.problem51;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


public class TestLogger {
	private Logger logger;

	void setUp() {
		logger = Logger.getInstance();
	}
	
 	public void testDisplayLog() {
 		logger.logText("Hello World!");
 		assertEquals("Log:\nHello World!\n", logger.displayLog());  
 	}

 	public void testLoggerInstances() {
 		Logger nextLogger = Logger.getInstance();
        assertSame(logger, nextLogger);
 	}
 	
 	
 	
}
