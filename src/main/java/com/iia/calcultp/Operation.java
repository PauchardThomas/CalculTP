package com.iia.calcultp;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * 
 * @author Thomas
 *
 */
public final class Operation {
    
    /**
     * Constructor.
     */
    private Operation() {
        super();
    }
    
    /**
     * Add two value.
     * @param number1 first value
     * @param number2 second value
     * @return result of addition
     */
    public static double add(final double number1, final double number2) {
        return number1 + number2;
    }
        
     /**
     * Substract two value.
     * @param number1 first value. 
     * @param number2 second value.
     * @return result of substract.
     */
    public static double substract(final double number1, final double number2) {
        return number1 - number2;
    }
    
    /**
     * Multiply two value.
     * @param number1 first value
     * @param number2 second value
     * @return result of muliply
     */
    public static double multiply(final double number1, final double number2) {
        return number1 * number2;
    }
    
    /**
     * Divide two value.
     * @param number1 first value.
     * @param number2 second value.
     * @return result of divide.
     */
    public static double divide(final double number1, final double number2) {
        if (number2 == 0) {
            Utils.message("Impossible de diviser par 0");
            throw new ArithmeticException("Le dénominateur ne peut pas être égal à 0");
        }
        return number1 / number2;
    }
    /**
     * Modulo 2 numbers.
     * @param number1 first value.
     * @param number2 second value.
     * @return modulo.
     */
    public static double modulo(final double number1, final double number2) {
        return number1 % number2;
    }
    
    /**
     * Percentage.
     * @param number1.
     * @return number percentage.
     */
    public static double pourcentage(final double number1) {
        return number1 / 100;
    }
    
    /**
     * Calcul sinus.
     * @param number1.
     * @return sinus du nombre.
     */
    public static double sinus(final double number1) {
        return Math.sin(number1);
    }
    /**
     * Calcul cosine.
     * @param number1
     * @return
     */
    public static double cosinus(final double number1) {
        return Math.cos(number1);
    }
    /**
     * Calcul tangent.
     * @param number1
     * @return
     */
    public static double tangente(final double number1) {
        return Math.tan(number1);
    }
}

