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
    public static double selectOptionWithTwoNumbers(final int userInput, 
            final double number1, final double number2) {

            switch (userInput) {
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
                // Default value
                result = -1;
                Utils.message("Choix invalide");
                break;
            } 
        return result;
    }
    /**
     * Select option from menu.
     * @param userInput
     */
    public static double selectOption(final int userInput, final double number1) {

            switch (userInput) {
            case 6:
                // Percent
                result = Operation.pourcentage(number1);
                break;
            case 7:
                // sin
                result = Math.round(Operation.sinus(number1) * 100.0) / 100.0;
                break;
            case 8:
                // cos
                result = Math.round(Operation.cosinus(number1) * 100.0) / 100.0;
                break;
            case 9:
                // tan
                result = Math.round(Operation.tangente(number1) * 100.0) / 100.0;
                break;
            case 10:
                // In progress
                Utils.message("En cours..");
                break;
            default:
                // Default value
                result = -1;
                Utils.message("Choix invalide");
                break;
            }
        return result;
    }
}
