package com.iia.calcultp;

import java.util.Scanner;

/**
 * Static class for the switch.
 * @author kevin-pc.
 *
 */
public final class SelectOperation {
    /**
     * Select the option according user prompt.
     * @param userInput.
     */
    
    private static String number = "";
    
    public static void selectOption(final String userInput) {
        
        final int number1 = getNumber();
        final int number2 = getNumber();
        int result = 0;
        boolean operationDone = true;
        
        switch (Integer.parseInt(userInput)) {
        case 1:
            // addition
           try {
               result = Operation.add(number1, number2);
           } catch (NumberFormatException e) {
               Utils.message(e.getMessage());
           }
           break;
        case 2:
            // soustraction
            try {
                result = Operation.substract(number1, number2);
            } catch (NumberFormatException e) {
                Utils.message(e.getMessage());
            }
            break;
        case 3:
            //multiplication
            try {
                result = Operation.multiply(number1, number2);
            } catch (NumberFormatException e) {
                Utils.message(e.getMessage());
            }
            break;
        case 4:
            //division
            if (number2 == 0) {
                Utils.message("Division par 0 impossible");
                operationDone = false;
            } else {
                try {
                    result = Operation.divide(number1, number2);
                } catch (NullPointerException e) {
                    Utils.message(e.getMessage());
                }
                
            }
            break;
        case 5:
            // modulo
            try {
                result = Operation.modulo(number1, number2);
            } catch (NumberFormatException e) {
                Utils.message(e.getMessage());
            }
            break;
        case 6:
            // pourcentage
            try {
                result = Operation.pourcentage(number1);
            } catch (NullPointerException e) {
                Utils.message(e.getMessage());
            }
            break;
        case 7:
            // sin cos tang
            Utils.message("En construction...");
            operationDone = false;
            break;
        case 8:
            // historique
            Utils.message("En construction....");
            operationDone = false;
            break;
        default:
            // Choix invalide
            Utils.message("Choix invalide");
            operationDone = false;
            break;
        } 
        if (operationDone) {
            Utils.message("Résultat de l'opération : " + result);
        }
    }
    
    /**
     * Get user prompt number.
     * @return user prompt number
     */
   
    public static int getNumber() {
        Utils.message("Saisir un nombre : ");
        do {
            try {
                number = new Scanner(System.in, "UTF-8").nextLine();
            } catch (Exception e) {
                Utils.message(e.getMessage());
            }
        }while(!Utils.tryParseInt(number));
        
        return Integer.parseInt(number);
    }
}
