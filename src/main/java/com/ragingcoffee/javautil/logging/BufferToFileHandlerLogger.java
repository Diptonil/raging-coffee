package com.ragingcoffee.javautil.logging;

import java.util.logging.ConsoleHandler;
import java.util.logging.MemoryHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public final class BufferToFileHandlerLogger {

    private static Logger logger = Logger.getGlobal();
    
    public static void main(String[] args) {
        logger.setLevel(Level.FINEST);

        try {
            ConsoleHandler consoleHandler = new ConsoleHandler();
            consoleHandler.setLevel(Level.FINEST);
            MemoryHandler memoryHandler = new MemoryHandler(consoleHandler, 4, Level.FINER);
            logger.addHandler(memoryHandler);
        } catch (Exception exception) {
            logger.log(Level.INFO, "There has been some issue with the file in FileHandler resource.");
        }

        logger.finest("First log. Will not be seen in the console due to buffer limits.");
        logger.finest("Second log.");
        logger.finest("Third log.");
        logger.finest("Fourth log. This is the last log that can stay in buffer. Next entry would clear off the buffer by sending all these four logs to the parameterized Handler which, in this case, is ConsoleHandler.");
        logger.finer("Fifth log. Since level is set to 'FINER' Most recent four logs (including this) will flush to console.");
        logger.finest("Sixth log. Will stay in buffer and not come to console since there are no preceding statements with 'FINER' level.");
    }
}
