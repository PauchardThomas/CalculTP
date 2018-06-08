/* Copyright Pauchard Thomas 07/06/2018 */

package com.tactfactory.tp1;

import org.joda.time.DateTime;

/**
 * My main Application.
 * @author Thomas
 * @version 1.0
 */
public final class Application {


    private Application() {
        super();
    }

    /**
     * Entry point of application.
     * @param args Arguments from CLI
     */
    public static void main(final String[] args) {
        System.out.print("Hello W !!");
        final DateTime dateTime = DateTime.now();
        System.out.print(dateTime);
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
}
