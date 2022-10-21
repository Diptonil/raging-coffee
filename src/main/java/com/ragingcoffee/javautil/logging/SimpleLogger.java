package com.ragingcoffee.javautil.logging;

import java.util.logging.Level;
import java.util.logging.Logger;

public final class SimpleLogger {
    
    private static Logger logger = Logger.getGlobal();
    
	public static void main(String[] args) {
		logger.severe("This is a severe message using the specialized logging method.");
		logger.warning("This is a warning message using the specialized logging method.");
		logger.info("This is an informatory message using the specialized logging method.");

        logger.log(Level.SEVERE, "This is a severe message using the standard logging method.");
        logger.log(Level.WARNING, "This is a warning message using the standard logging method.");
        logger.log(Level.INFO, "This is a informatory message using the standard logging method.");
	}
}
