package com.iia.calcultp;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;

import org.junit.Assert;

public class ApplicationTest {

    @org.junit.Test
    public void testShowmennu() {
        
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
}
