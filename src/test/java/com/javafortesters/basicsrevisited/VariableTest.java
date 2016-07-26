package com.javafortesters.basicsrevisited;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Created by Simmiah on 7/24/16.
 */
public class VariableTest {
    @Test
    public void variableNaming(){
        String $aString="bob";
        float owed=10F;
        int aMount=4;
        long Amount=5;
        String A01234567890$f="ugh";

        assertEquals(4,aMount);
        assertEquals(5,Amount);
        assertEquals(10.0F,owed,0);
        assertEquals("bob",$aString);
        assertEquals("ugh",A01234567890$f);
    }
}
