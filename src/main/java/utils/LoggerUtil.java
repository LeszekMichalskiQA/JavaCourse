package utils;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LoggerUtil {
    private static final Logger logger = LogManager.getLogger(LoggerUtil.class);

    private LoggerUtil() {
    }

    public static void logInfo(String message) {
        logger.info(message);

    }

    public static void logInfo(boolean value) {
        logger.info(value);
    }

    public static void logError(String message) {
        logger.error(message);
    }
}
