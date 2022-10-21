package com.ragingcoffee.javautil.logging;

import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public final class FileHandlerLogger {
    
    private static Logger logger = Logger.getGlobal();

    public static void main(String[] args) {
        logger.setLevel(Level.FINEST);

        try {
            FileHandler fileHandler = new FileHandler("logs.txt", true);
            fileHandler.setLevel(Level.FINEST);
            logger.addHandler(fileHandler);
        } catch (Exception exception) {
            logger.log(Level.INFO, "There has been some issue with the file in FileHandler resource.");
        }

        Level[] levels = {Level.SEVERE, Level.WARNING, Level.INFO, Level.CONFIG, Level.FINE, Level.FINER, Level.FINEST};
        for (Level level : levels) {
            logger.log(level, "The log corresponds to the level: " + level);
        }
    }
}
