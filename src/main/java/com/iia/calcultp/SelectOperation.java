package com.iia.calcultp;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


/**
 * Static class for the switch.
 * @author kevin-pc.
 *
 */
public final class SelectOperation {

    /**Log.*/
    private static Logger logger = LogManager.getLogger(TestLog4j1.class);

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
                logger.info("Execute addition");
                result = Operation.add(number1, number2);
                logger.info(String.format("%f + %f = %f", number1, number2, result));
                break;
            case 2:
                // subtraction
                logger.info("Execute subtraction");
                result = Operation.substract(number1, number2);
                logger.info(String.format("%f - %f = %f", number1, number2, result));
                break;
            case 3:
                //multiplication
                logger.info("Execute multiplication");
                result = Operation.multiply(number1, number2);
                logger.info(String.format("%f x %f = %f", number1, number2, result));
                break;
            case 4:
                //division
                logger.info("Execute division");
                if (number2 == 0) {
                    Utils.message("Division par 0 impossible");
                    result = -1;
                    logger.info(String.format("%f / %f = %f", number1, number2, result));
                } else {
                    result = Operation.divide(number1, number2);
                    logger.info(String.format("%f / %f = %f", number1, number2, result));
                }
                break;
            case 5:
                // modulo
                logger.info("Execute modulo");
                result = Operation.modulo(number1, number2);
                break;
            default:
                // Default value
                logger.info("Execute default case");
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
                logger.info("Execute percent");
                result = Operation.pourcentage(number1);
                logger.info(String.format("%f /100 = %f", number1, result));
                break;
            case 7:
                // sin
                logger.info("Execute sinus");
                result = Math.round(Operation.sinus(number1) * 100.0) / 100.0;
                logger.info(String.format("sin(%f) = %f", number1, result));
                logger.info("sin(" + number1 + ") = " + result);
                break;
            case 8:
                // cos
                logger.info("Execute cosinus");
                result = Math.round(Operation.cosinus(number1) * 100.0) / 100.0;
                logger.info(String.format("cos(%f) = %f", number1, result));
                break;
            case 9:
                // tan
                logger.info("Execute tangente");
                result = Math.round(Operation.tangente(number1) * 100.0) / 100.0;
                logger.info(String.format("tan(%f) = %f", number1, result));
                break;
            case 10:
                // In progress
                Utils.message("En cours..");
                result = -1;
                break;
            default:
                logger.info("Execute default case");
                // Default value
                result = -1;
                Utils.message("Choix invalide");
                break;
            }
        return result;
    }
}
