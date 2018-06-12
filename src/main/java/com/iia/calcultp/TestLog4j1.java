package com.iia.calcultp;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Running log4j2
 * @author kevin-pc
 *
 */
public class TestLog4j1 {
    
    private static Logger logger = LogManager.getLogger(TestLog4j1.class);

    public static void main(String[] args) {
        logger.debug("msg de debogage");
        logger.info("msg d'information");
        logger.warn("msg d'avertissement");
        logger.error("msg d'erreur");
        logger.fatal("msg d'erreur fatale");

    }

}
