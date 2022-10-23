package com.ragingcoffee.javautil.logging;

import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.XMLFormatter;

public final class XMLFormattedConsoleLogger {
    
    private static Logger logger = Logger.getGlobal();

    public static void main(String[] args) {
        logger.setLevel(Level.FINEST);
        logger.setUseParentHandlers(false);

        XMLFormatter xmlFormatter = new XMLFormatter();
        ConsoleHandler consoleHandler = new ConsoleHandler();
        consoleHandler.setLevel(Level.FINEST);
        consoleHandler.setFormatter(xmlFormatter);
        logger.addHandler(consoleHandler);

        logger.fine("This is a fine log message.");
        logger.severe("This is a severe log message.");
    }
}
