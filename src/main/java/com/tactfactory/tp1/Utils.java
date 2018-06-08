package com.tactfactory.tp1;

public final class Utils {

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
