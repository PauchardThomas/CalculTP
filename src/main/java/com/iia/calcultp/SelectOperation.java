package com.iia.calcultp;


/**
 * Static class for the switch.
 * @author kevin-pc.
 *
 */
public final class SelectOperation {


    /**Operation result.*/
    private static double result;

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
    public static double selectOptionWithTwoNumbers(final String userInput, final double number1, final double number2) {

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
                    result = -1;
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
                result = -1;
                //Utils.message("Choix invalide");
                break;
            } 
        } catch (NumberFormatException e) {
            Utils.message(e.getMessage());
        }
        return result;
    }
    /**
     * Select option from menu.
     * @param userInput
     */
    public static double selectOption(final String userInput, final double number1) {

        switch (Integer.parseInt(userInput)) {
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
            break;
        case 8:
            // historique
            Utils.message("En construction....");
            break;
        default:
            // Choix invalide
            Utils.message("Choix invalide");
            break;
        } 
        return result;
    }
}
