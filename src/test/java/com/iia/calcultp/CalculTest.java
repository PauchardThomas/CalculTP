package com.iia.calcultp;

import org.junit.Assert;

public class CalculTest {
    
    @org.junit.Test
    public void testEval() {
        
       String str = "2*3+4";
       double result = Calcul.eval(str);
       Assert.assertEquals(result, 10,0.01);
       
       String str2 = "10/(2+3)";
       double result2 = Calcul.eval(str2);
       Assert.assertEquals(result2, 2,0.01);
       
       String str3 = "2^3";
       double result3 = Calcul.eval(str3);
       Assert.assertEquals(result3, 8,0.01);
    }
}
