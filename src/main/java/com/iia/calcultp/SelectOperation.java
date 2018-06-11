package com.iia.calcultp;

import java.util.Scanner;

/**
 * Static class for the switch.
 * @author kevin-pc.
 *
 */
public final class SelectOperation {

    /**User input number.*/
    private static String number = "";
    /**User input first number.*/
    private static int number1;
    /**User input second number.*/
    private static int number2;
    /**Operation result.*/
    private static int result;
    /**Operation double result.*/
    private static double doubleResult;
    /**Check if operation is done.*/
    private static boolean operationDone;

    /**
     * Constructor.
     */
    private SelectOperation() {
        super();
    }

    /**
     * Select option from menu.
     * @param userInput input filed user
     */
    public static void selectOptionWithTwoNumbers(final String userInput) {

        number1 = getNumber();
        number2 = getNumber();
        operationDone = true;
        try {
            switch (Integer.parseInt(userInput)) {
            case 1:
                // addition
                result = Operation.add(number1, number2);
                break;
            case 2:
                // soustraction
                result = Operation.substract(number1, number2);
                break;
            case 3:
                //multiplication
                result = Operation.multiply(number1, number2);
                break;
            case 4:
                //division
                if (number2 == 0) {
                    Utils.message("Division par 0 impossible");
                    operationDone = false;
                } else {
                    result = Operation.divide(number1, number2);
                }
                break;
            case 5:
                // modulo
                result = Operation.modulo(number1, number2);
                break;
            default:
                // Choix invalide
                Utils.message("Choix invalide");
                operationDone = false;
                break;
            } 
        } catch (NumberFormatException e) {
            Utils.message(e.getMessage());
        }

        if (operationDone) {
            Utils.message("Résultat de l'opération : " + result);
        }
    }
    /**
     * Select option from menu.
     * @param userInput
     */
    public static void selectOption(final String userInput) {

        number1 = getNumber();
        operationDone = true;

        switch (Integer.parseInt(userInput)) {
        case 6:
            // pourcentage
            try {
                doubleResult = Operation.pourcentage((double) number1);
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
            Utils.message("Résultat de l'opération : " + doubleResult);
        }
    }

    /**
     * Get user prompt number.
     * @return user prompt number
     */

    public static int getNumber() {
        Utils.message("Saisir un nombre : ");
        final Scanner scannerInputUser = new Scanner(System.in, "UTF-8");
        do {
            try {
                number = scannerInputUser.nextLine();
            } catch (Exception e) {
                Utils.message(e.getMessage());
            }
        }while(!Utils.tryParseInt(number));

        return Integer.parseInt(number);
    }
}
