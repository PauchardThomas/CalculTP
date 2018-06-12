/* Copyright Pauchard Thomas 07/06/20 */

package com.iia.calcultp;

import java.util.Scanner;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;


/**
 * My main Application.
 * @author Thomas
 * @version 1.0
 */
public final class Application {
    
    /**Log.*/
    private static Logger logger = LogManager.getLogger(TestLog4j1.class);
    /** Max menu number for an operation with 2 numbers. */
    private static final int MAX_TWO_NB_OPE = 5;
    /** Max menu number for an operation with 1 numbers. */
    private static final int MAX_ONE_NB_OPE = 9;
    /**User input number.*/
    private static String number = "";
    /**User input first number.*/
    private static double number1;
    /**User input second number.*/
    private static double number2;
    /** Operation result. */
    private static double result;

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
        logger.info("Start application");
        showMenu();
        manageMenu(prompt());
    }
    
    /**
     * Manage operation .
     * @param userOperationChoice user operation choice
     */
    private static void manageOperation(final int userOpeChoice) {
        if (userOpeChoice <= MAX_TWO_NB_OPE) {
            Utils.message("Saisir un nombre : ");
            number1 = getNumber();
            Utils.message("Saisir un nombre : ");
            number2 = getNumber();
            //result =  executeTwoNumbersOperation(userOpeChoice, number1, number2);
            result = SelectOperation.selectOptionWithTwoNumbers(userOpeChoice, number1, number2);
         } else {
            if (userOpeChoice <= MAX_ONE_NB_OPE) {
                Utils.message("Saisir un nombre : ");
                number1 = getNumber();
                //result = executeOneNumberOperation(userOpeChoice, number1);
                result = SelectOperation.selectOption(userOpeChoice, number1);
            }
            
         }
        displayResultOperation(result);
        showSubMenu();
        manageSubMenu(userOpeChoice, prompt());
    }
    
    /**
     * Display operation result.
     * @param result
     */
    public static void displayResultOperation(final double result) {
        if (result == -1) {
            Utils.message("Pas de résultat");
        } else {
            Utils.message("resultat de l'opération : " + result); 
        }
    }
    
    /**
     * Exit the calculator.
     */
    public static void exitApp() {
        System.out.print("Au revoir!");
        System.exit(0);
        logger.info("Exit application");
    }
    
    /**
     * Show application menu.
     */
    public static void showMenu() {
        logger.info("Show menu");
        System.out.print("\r\n*************************************** \r\n");
        System.out.print("* Bienvenue dans votre calculatrice ! * \r\n");
        System.out.print("*************************************** \r\n \r\n");
        
        System.out.print("1- Addition \r\n");
        System.out.print("2- Soustraction\r\n");
        System.out.print("3- Multiplication\r\n");
        System.out.print("4- Division\r\n");
        System.out.print("5- Modulo\r\n");
        System.out.print("6- Pourcentage\r\n");
        System.out.print("7- sin\r\n");
        System.out.print("8- cos\r\n");
        System.out.print("9- tang\r\n");
        System.out.print("10- Historique des opérations\r\n");
        logger.info("End show menu");
    }
    
    /**
     * Manage menu.
     */
    private static void manageMenu(final String userInput) {
        logger.info("User input " + userInput);
        if ("q".equals(userInput)) {
            logger.info("Start method exitApp");
            exitApp();
            logger.info("End method exitApp");
        } else {
            if (Utils.tryParseDouble(userInput)) {
                final int userNumber = Integer.parseInt(userInput);
                manageOperation(userNumber);
            } else {
                Utils.message("Veuillez saisir une valeur entre 1 et 10 (q = quitter)");
                manageMenu(prompt());
            }
        }
    }
    
    /**
     * Show submenu.
     */
    public static void showSubMenu() {
        logger.info("Start submenu");
        System.out.print("\r\n0- Retour au menu \r\n");
        System.out.print("1- Nouvelle opération\r\n");
        logger.info("End submenu");
    }
    
    /**
     * Manage submenu.
     * @param currentOperation currentOperation
     */
    private static void manageSubMenu(final int currentOperation, final String userInput) {
        if (Utils.tryParseDouble(userInput)) {
            final int userSubMenuChoice = Integer.parseInt(userInput);
            switch (userSubMenuChoice) {
            case 0:
                showMenu();
                manageMenu(prompt());
                break;
            case 1:
                manageOperation(currentOperation);
                break;
            default:
                break;
            }
        } else {
            Utils.message("Veuillez saisir une valeur entre 0 et 1");
            System.lineSeparator();
            manageSubMenu(currentOperation, prompt());
        }
    }
    
    /**
     * Get user prompt number.
     * @return user prompt number
     */
    public static double getNumber() {
        do {
           number = prompt();
           if (number.contains(",")) {
               logger.info("Get number with char ',' " + number);
               number = number.replaceAll(",", ".");
               logger.info("Get number after replace char " + number);
           }
        }while(!Utils.tryParseDouble(number));

        return Double.parseDouble(number);
    }
    /**
     * User prompt.
     * @return user prompt
     */
    public static String prompt() {
        logger.info("Start reading user input");
        final Scanner scannerInputUser = new Scanner(System.in, "UTF-8");
        logger.info("End reading user input");
        return scannerInputUser.nextLine();
    }
}
