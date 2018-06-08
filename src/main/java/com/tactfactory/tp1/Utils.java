/* Copyright Pauchard Thomas 07/06/20 */
package com.tactfactory.tp1;

/**
 * Fonction global to project.
 * @author kevin-pc
 *
 */
public final class Utils {

    private Utils() {
        super();
    }
    
    /**
     * Print message in console.
     *  @param message message a afficher
     */
    public static void message(final String message) {
        System.out.print("\r\n" + message);
    }
    
    /**
     * Essaie de parser une string en int.
     * @param value valeur à parser
     * @return
     */
    public static boolean tryParseInt(String value) {  
        boolean result = false;
    	try {  
            Integer.parseInt(value);  
            result =  true;  
         } catch (NumberFormatException e) {  
            result = false;  
         } 
        return result;
   }
}
