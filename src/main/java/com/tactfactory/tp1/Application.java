/* Copyright Pauchard Thomas 07/06/2018 */

package com.tactfactory.tp1;

import java.util.Scanner;

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
       
        showMenu();
        
        String userInput = prompt("Veuillez saisir une option :");
        
        if ("q".equals(userInput)) {
            System.out.println("Au revoir!");
            System.exit(0);
        }else {
            if(!Utils.tryParseInt(userInput))
            {
                Utils.message("Veuillez saisir une valeur entre 1 et 8 (q = quitter)");
            }else{
                selectOption(userInput);
            }
        }
    }
    /**
     * Get User input string
     * @param promptMessage prompt description
     * @return user prompt
     */
    public static String prompt(final String promptMessage) {
        Scanner sc = new Scanner(System.in);
        System.out.println(promptMessage);
        String userInput = sc.nextLine();
        sc.close();
        return userInput;
    }
    /**
     * Show application menu
     */
    public static void showMenu()
    {
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
    /**
     * Select the option according user prompt
     * @param userInput
     */
    public static void selectOption(final String userInput)
    {
        switch (Integer.parseInt(userInput)) {
        case 1:
            // addition
            break;
        case 2:
            // soustraction
            break;
        case 3:
            //multiplication
            break;
        case 4:
            //division
            break;
        case 5:
            // modulo
            break;
        case 6:
            // pourcentage
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
