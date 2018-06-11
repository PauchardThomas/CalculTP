package com.iia.calcultp;

/**
 * 
 * @author Thomas
 *
 */
public final class Operation {
    
    private Operation() {
        super();
    }
    
    /**
     * Add two value.
     * @param number1 first value
     * @param number2 second value
     * @return result of addition
     */
    public static int add(final int number1, final int number2) {
        return number1 + number2;
    }
        
     /**
     * Substract two value.
     * @param number1 first value. 
     * @param number2 second value.
     * @return result of substract.
     */
    public static int substract(final int number1, final int number2) {
        return number1 - number2;
    }
    
    /**
     * Multiplication two value.
     * @param number1 first value
     * @param number2 second value
     * @return result of muliply
     */
    public static int multiply(final int number1, final int number2) {
        return number1 * number2;
    }
    
    /**
     * Divide two value.
     * @param number1 first value.
     * @param number2 second value.
     * @return result of divide.
     */
    public static int divide(final int number1, final int number2) {
        return number1 / number2;
    }
    /**
     * Modulo de 2 nombres.
     * @param number1 first value.
     * @param number2 second value.
     * @return modulo.
     */
    public static int modulo(final int number1, final int number2) {
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

