package com.iia.calcultp;

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
     * Multiplication two value.
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
        return number1 / number2;
    }
    /**
     * Modulo de 2 nombres.
     * @param number1 first value.
     * @param number2 second value.
     * @return modulo.
     */
    public static double modulo(final double number1, final double number2) {
        return number1 % number2;
    }
    
    /**
     * Pourcentage d une valeur.
     * @param number1.
     * @return pourcentage du nombre.
     */
    public static double pourcentage(final double number1) {
        return number1 / 100;
    }
}

