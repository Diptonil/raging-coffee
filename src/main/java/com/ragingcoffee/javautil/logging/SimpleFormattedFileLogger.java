package com.ragingcoffee.javautil.logging;

import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public final class SimpleFormattedFileLogger {
    
    private static Logger logger = Logger.getGlobal();

    public static void main(String[] args) {
        logger.setLevel(Level.FINEST);
        logger.setUseParentHandlers(false);

        SimpleFormatter simpleFormatter = new SimpleFormatter();
        try {
            FileHandler fileHandler = new FileHandler("logs.txt", true);
            fileHandler.setLevel(Level.FINEST);
            fileHandler.setFormatter(simpleFormatter);
            logger.addHandler(fileHandler);
        } catch (Exception exception) {
            logger.log(Level.INFO, "There has been some issue with the file in FileHandler resource.");
        }

        logger.fine("This is a fine log message. This goes in the file and not to the console.");
        logger.severe("This is a severe log message. This goes in the file and not to the console.");
    }
}
