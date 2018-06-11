package com.iia.calcultp;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;

import org.junit.Assert;

public class ApplicationTest {

    @org.junit.Test
    public void testShowmenu() {
        
        OutputStream os = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(os);
        System.setOut(ps);

        Application.showMenu();
        Assert.assertEquals("\r\n*************************************** \r\n"
                + "* Bienvenue dans votre calculatrice ! * \r\n"
                + "*************************************** \r\n \r\n"
                + "1- Addition \r\n"
                + "2- Soustraction\r\n"
                + "3- Multiplication\r\n"
                + "4- Division\r\n"
                + "5- Modulo\r\n"
                + "6- Pourcentage\r\n"
                + "7- sin cos tang\r\n"
                + "8- Historique des opérations\r\n", os.toString());
    }
    
    @org.junit.Test
    public void testShowSubMenu() {
        
        OutputStream os = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(os);
        System.setOut(ps);

        Application.showSubMenu();
        Assert.assertEquals("\r\n0- Retour au menu \r\n"
                + "1- Nouvelle opération\r\n", os.toString());
    }
    
    @org.junit.Test
    public void testDisplayResultOperation() {
        
        OutputStream os = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(os);
        System.setOut(ps);
        
        final double result = 10;
        
        Application.displayResultOperation(result);
        
        Assert.assertEquals("\r\nresultat de l'opération : " + result, os.toString());
    }
    
    @org.junit.Test
    public void testExecuteTwoNumbersOperation() {
        
       int userChoice = 1;
       int number1 = 2 ,  number2 = 3;
       double result = Application.executeTwoNumbersOperation(userChoice,number1,number2);
        
        Assert.assertEquals(result,5,0.01);
    }
    
    @org.junit.Test
    public void testExecuteOneNumbersOperation() {
        
       int userChoice = 6;
       int number1 = 20;
       double result = Application.executeOneNumberOperation(userChoice,number1);
        
        Assert.assertEquals(result,0.2,0.01);
    }
    
    @org.junit.Test
    public void testGetNumber() {
        
       String userPromptNumber = "6";
       double result = Application.getNumber(userPromptNumber);
        
        Assert.assertEquals(result,6,0.01);
    }
}
