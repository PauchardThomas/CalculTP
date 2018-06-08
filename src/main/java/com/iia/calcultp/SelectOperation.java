package com.iia.calcultp;

import java.util.Scanner;

/**
 * Statci class for the switch
 * @author kevin-pc.
 *
 */
public final class SelectOperation {
    /**
     * Select the option according user prompt.
     * @param userInput.
     */
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
               e.printStackTrace();
           }
           break;
        case 2:
            // soustraction
            try {
                result = Operation.substract(number1, number2);
            } catch (NumberFormatException e) {
                e.printStackTrace();
            }
            break;
        case 3:
            //multiplication
            try {
                result = Operation.multiply(number1, number2);
            } catch (NumberFormatException e) {
                e.printStackTrace();
            }
            break;
        case 4:
            //division
            if(number2 == 0) {
                Utils.message("Division par 0 impossible");
                operationDone = false;
            }else {
                try {
                    result = Operation.divide(number1, number2);
                } catch (NullPointerException e) {
                    e.printStackTrace();
                }
                
            }
            break;
        case 5:
            // modulo
            try {
                result = Operation.modulo(number1, number2);
            } catch (NumberFormatException e) {
                e.printStackTrace();
            }
            break;
        case 6:
            // pourcentage
            try {
                result = Operation.pourcentage(number1);
            } catch (NullPointerException e) {
                e.printStackTrace();
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
        if(operationDone) {
            Utils.message("Résultat de l'opération : " + result);
        }
    }    
    /**
     * Add two value.
     * @return result of addition.
     */
   
	public static int getNumber() {
        String number = "";
        do
        {
            Utils.message("Saisir un nombre : ");
            try {
            	number = new Scanner(System.in).nextLine();
			} catch (Exception e) {
				continue;// TODO: handle exception
			}

        }while(!Utils.tryParseInt(number));
        
        return Integer.parseInt(number);
    }
}
