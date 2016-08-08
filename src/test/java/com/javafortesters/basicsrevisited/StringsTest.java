package com.javafortesters.basicsrevisited;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by Simmiah on 8/7/16.
 */
public class StringsTest {
    @Test
    public void stringsConcatenated(){
        assertEquals("123456", "12" + "34" + "56");
    }

    @Test
    public void someStringMethods(){
        String aString = "abcdef";

        assertEquals(6, aString.length());
        assertTrue(aString.compareToIgnoreCase("ABCDEF")==0);
        assertTrue(aString.contains("bcde"));
        assertTrue(aString.startsWith("abc"));
    }
}
