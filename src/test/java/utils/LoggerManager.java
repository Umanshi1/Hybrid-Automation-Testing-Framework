package utils;


import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.log4j.FileAppender;
import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;
import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;

public class LoggerManager {

    private static final Logger logger = Logger.getLogger(LoggerManager.class);
    static {
		try {
			String timestamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
			String fileName = "logs/target_" + timestamp + ".log";
			FileAppender fileAppender = new FileAppender(
					new PatternLayout("%d{yyyy.MM.dd.HH.mm.ss} %-5p %c{1}:%L - %m%n"), fileName);
			logger.addAppender(fileAppender);
		} catch (Exception e) {
			logger.error("Failed to add appender", e);
		}
	}

    public static void trace(String message) {
        logger.trace(message);
    }

    public static void debug(String message) {
        logger.debug(message);
    }

    public static void info(String message) {
        logger.info(message);
    }

    public static void error(String message) {
        logger.error(message);
    }

}