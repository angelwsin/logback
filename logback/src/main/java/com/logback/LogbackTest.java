package com.logback;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogbackTest {
    
    private static Logger log = LoggerFactory.getLogger(LogbackTest.class); 
    
    
    public static void main(String[] args) {
        log.info("x");
    }
    

}
