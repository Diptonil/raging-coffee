package com.ragingcoffee.javautil.logging;

import java.util.logging.ConsoleHandler;
import java.util.logging.Formatter;
import java.util.logging.Logger;
import java.util.logging.LogRecord;

class CustomFormatter extends Formatter {

    @Override
    public String format(LogRecord logRecord) {
        return logRecord.getLevel() + ": " + logRecord.getMessage();
    }
}

public final class CustomFormattedLogger {

    private static Logger logger = Logger.getGlobal();
    
    public static void main(String[] args) {
        CustomFormatter customFormatter = new CustomFormatter();
        ConsoleHandler consoleHandler = new ConsoleHandler();
        consoleHandler.setFormatter(customFormatter);
        logger.addHandler(consoleHandler);
        logger.setUseParentHandlers(false);

        logger.info("Log message that has been customized.");
    }
}
