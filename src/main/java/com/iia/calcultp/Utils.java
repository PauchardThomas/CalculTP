/* Copyright Pauchard Thomas 07/06/20 */
package com.iia.calcultp;

/**
 * Fonction global to project.
 * 
 * @author kevin-pc
 *
 */
public final class Utils {

    /**Result if string can be parsed in int.  */
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
     * Essaie de parser une string en int.
     * 
     * @param value valeur à parser
     * @return true si parsable , false si non parsable
     */
    public static boolean tryParseInt(final String value) {
        try {
            Integer.parseInt(value);
            result = true;
        } catch (NumberFormatException e) {
            Utils.message(e.getMessage());
        }
        return result;
    }
}
