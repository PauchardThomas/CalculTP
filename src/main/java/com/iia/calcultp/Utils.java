/* Copyright Pauchard Thomas 07/06/20 */
package com.iia.calcultp;

/**
 * project global function.
 * 
 * @author kevin-pc
 *
 */
public final class Utils {

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
     * @param value valeur à parser
     * @return true si parsable , false si non parsable
     */
    public static boolean tryParseDouble(final String value) {
        try {
            Double.parseDouble(value);
            result = true;
        } catch (NumberFormatException e) {
            Utils.message(e.getMessage());
            result = false;
        }
        return result;
    }
}
