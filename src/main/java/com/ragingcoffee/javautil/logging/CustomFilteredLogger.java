package com.ragingcoffee.javautil.logging;

import java.util.logging.ConsoleHandler;
import java.util.logging.FileHandler;
import java.util.logging.Filter;
import java.util.logging.Formatter;
import java.util.logging.LogRecord;
import java.util.logging.Logger;

class CustomSubstringFormatter extends Formatter {

    @Override
    public String format(LogRecord logRecord) {
        return logRecord.getLevel() + ": " + logRecord.getMessage().substring(5);
    }
}

class CustomFilter implements Filter {

    @Override
    public boolean isLoggable(LogRecord logRecord) {
        String checkString = logRecord.getMessage().substring(0, 5);
        if (checkString.equals("FILE:")) {
            return true;
        }
        return false;
    }
}

public final class CustomFilteredLogger {
    
    private static Logger logger = Logger.getGlobal();

    public static void main(String[] args) {
        CustomSubstringFormatter customSubstringFormatter = new CustomSubstringFormatter();
        CustomFilter customFilter = new CustomFilter();
        ConsoleHandler consoleHandler = new ConsoleHandler();
        FileHandler fileHandler;

        try {
            fileHandler = new FileHandler("logs.txt");
        } catch (Exception exception) {
            System.out.print("There has been some issue with the file in FileHandler resource.");
            return;
        }

        fileHandler.setFilter(customFilter);
        fileHandler.setFormatter(customSubstringFormatter);
        logger.addHandler(consoleHandler);
        logger.addHandler(fileHandler);
        logger.setUseParentHandlers(false);

        logger.info("Log message that goes just to the console.");
        logger.info("FILE: Log message that goes to the console as well as the file.");
    }
}
