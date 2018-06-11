/* Copyright Pauchard Thomas 07/06/20 */

package com.iia.calcultp;

import java.util.Scanner;

/**
 * My main Application.
 * @author Thomas
 * @version 1.0
 */
public final class Application {

    /** Max menu number for an operation with 2 numbers. */
    private static final int MAX_NUMBER_MENU = 5;

    /**
     * Constructor.
     */
    private Application() {
        super();
    }

    /**
     * Entry point of application.
     * @param args Arguments from CLI.
     */
    public static void main(final String[] args) {
       
        showMenu();
        
        Utils.message("Veuillez saisir une option : ");
        final String userInput = new Scanner(System.in, "UTF-8").nextLine();
        
        if ("q".equals(userInput)) {
            System.out.print("Au revoir!");
            System.exit(0);
        } else {
            if (Utils.tryParseInt(userInput)) {
                final int userNumber = Integer.parseInt(userInput);
                if (userNumber <= MAX_NUMBER_MENU) {
                    SelectOperation.selectOptionWithTwoNumbers(userInput);
                } else {
                    SelectOperation.selectOption(userInput);
                }
            } else {
                Utils.message("Veuillez saisir une valeur entre 1 et 8 (q = quitter)");
            }
        }
    }
    /**
     * Show application menu.
     */
    public static void showMenu() {
        System.out.print("\r\n*************************************** \r\n");
        System.out.print("* Bienvenue dans votre calculatrice ! * \r\n");
        System.out.print("*************************************** \r\n \r\n");
        
        System.out.print("1- Addition \r\n");
        System.out.print("2- Soustraction\r\n");
        System.out.print("3- Multiplication\r\n");
        System.out.print("4- Division\r\n");
        System.out.print("5- Modulo\r\n");
        System.out.print("6- Pourcentage\r\n");
        System.out.print("7- sin cos tang\r\n");
        System.out.print("8- Historique des opérations\r\n");
    }
    
}
