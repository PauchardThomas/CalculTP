package com.iia.calcultp;

import org.junit.Assert;

import com.iia.calcultp.Utils;

public final class UtilsTest {
    
    

    @org.junit.Test
    public void testTryParseIntWithInt() {
        String str = "1";
        
        boolean isInt = Utils.tryParseInt(str);
        Assert.assertEquals(isInt,true);
    }
    
    @org.junit.Test
    public void testTryParseIntWithString() {
        String str = "a";
        
        boolean isInt = Utils.tryParseInt(str);
        Assert.assertEquals(isInt,false);
    }
    
}
