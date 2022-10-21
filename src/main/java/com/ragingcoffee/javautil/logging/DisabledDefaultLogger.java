package com.ragingcoffee.javautil.logging;

import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public final class DisabledDefaultLogger {
    
    private static Logger logger = Logger.getGlobal();

    public static void main(String[] args) {
        logger.setLevel(Level.FINEST);
        logger.setUseParentHandlers(false);

        ConsoleHandler consoleHandler = new ConsoleHandler();
        consoleHandler.setLevel(Level.FINEST);
        logger.addHandler(consoleHandler);

        Level[] levels = {Level.SEVERE, Level.WARNING, Level.INFO, Level.CONFIG, Level.FINE, Level.FINER, Level.FINEST};
        for (Level level : levels) {
            logger.log(level, "The log corresponds to the level: " + level);
        }
    }
}
