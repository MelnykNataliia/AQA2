package utils;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Log {

    // Create a Logger
    public static void logger() {
        Logger logger = Logger.getLogger(Log.class.getName());

        // Set logging level to WARNING
        logger.setLevel(Level.WARNING);

        // Set logging level to INFO
        logger.setLevel(Level.INFO);

        // Log a warning level msg
        logger.warning("This is level warning logging");

        // Log a info level msg
        logger.info("This is level info logging");
    }
}
