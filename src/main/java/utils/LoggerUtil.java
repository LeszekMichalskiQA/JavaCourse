package utils;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.List;

public class LoggerUtil {
    private static final Logger logger = LogManager.getLogger(LoggerUtil.class);

    private LoggerUtil() {
    }

    public static void logInfo(String message) {
        logger.info(String.format(message));
    }

    public static void logInfo(boolean value) {
        logger.info(value);
    }

    public static void logInfo(String message, List<Integer> values) {
        logger.info(message, values);
    }

    public static void logInfo(String message, int value) {
        logger.info(String.format(message, value));
    }

    public static void logError(String message, int value) {
        logger.error(String.format(message, value));
    }
}
