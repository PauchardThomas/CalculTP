/* Copyright Pauchard Thomas 07/06/20 */
package com.iia.calcultp;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * project global function.
 * 
 * @author kevin-pc
 *
 */
public final class Utils {

    /**Log.*/
    private static Logger logger = LogManager.getLogger(TestLog4j1.class);
    /**Result if string can be parsed in double.  */
    private static boolean result;
    /**
     * Constructor.
     */
    private Utils() {
        super();
    }
    
    /**
     * Print message in console.
     * 
     * @param message
     */
    public static void message(final String message) {
        System.out.print("\r\n" + message);
    }

    /**
     * Essaie de parser une string en double.
     * 
     * @param value valeur � parser
     * @return true si parsable , false si non parsable
     */
    public static boolean tryParseDouble(final String value) {
        try {
            Double.parseDouble(value);
            result = true;
        } catch (NumberFormatException e) {
            Utils.message("La valeur " + value + " est incorrecte. Veuillez insérer une valeur valide : ");
            logger.fatal("the built-in FATAL level");
            result = false;
        }
        return result;
    }
}
