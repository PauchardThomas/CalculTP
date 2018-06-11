package com.iia.calcultp;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;

import org.junit.Assert;

import com.iia.calcultp.Utils;

public final class UtilsTest {
    
    

    @org.junit.Test
    public void testTryParseDoubleWithInt() {
        String str = "1";
        
        boolean isDouble = Utils.tryParseDouble(str);
        Assert.assertEquals(isDouble,true);
    }
    
    @org.junit.Test
    public void testTryParseDoubleWithString() {
        String str = "abcdef";
        
        boolean isDouble = Utils.tryParseDouble(str);
        Assert.assertEquals(isDouble,false);
    }
    
    @org.junit.Test
    public void testMessage() {
        
        OutputStream os = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(os);
        System.setOut(ps);
        
        final String message = "Message test";
        
        Utils.message(message);
        
        Assert.assertEquals("\r\nMessage test", os.toString());
    }
    
}
