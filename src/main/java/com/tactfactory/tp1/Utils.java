/* Copyright Pauchard Thomas 07/06/20 */
package com.tactfactory.tp1;

/**
 * Fonction global to project.
 * @author kevin-pc
 *
 */
public final class Utils {

	/**
	 * Print message in console.
	 * @param message
	 */
    public static void message(final String message)
    {
        System.out.print("\r\n" + message);
    }
    public static boolean tryParseInt(String value) {  
        try {  
            Integer.parseInt(value);  
            return true;  
         } catch (NumberFormatException e) {  
            return false;  
         }  
   }
}
