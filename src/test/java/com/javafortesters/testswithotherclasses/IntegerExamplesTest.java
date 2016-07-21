package com.javafortesters.testswithotherclasses;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Simmiah on 3/27/15.
 */
public class IntegerExamplesTest {
    @Test
    public void integerExploration(){
        Integer four = new Integer(4);
        assertEquals("intValue returns int 4", 4, four.intValue());

        Integer five = new Integer("5");
        assertEquals("intValue returns int 5", 5, five.intValue());

        Integer six = 6;
        assertEquals("autoboxing assignment for 6", 6, six.intValue());
    }

    @Test
    public void toHexString(){
        Integer eleven = 11;
        assertEquals("toHexString returns hex b", "b", eleven.toHexString(eleven));

        Integer ten = 10;
        assertEquals("toHexString returns hex a", "a", ten.toHexString(ten));

        Integer three = 3;
        assertEquals("toHexString returns hex 3", "3", three.toHexString(three));

        Integer twentyone = 21;
        assertEquals("toHexString returns hex 15", "15", twentyone.toHexString(twentyone));
    }

    @Test
    public void areConstants(){
        assertEquals("Integer.MIN_VALUE returns -2147483648", -2147483648, Integer.MIN_VALUE);

        assertEquals("Integer.MAX_VALUE returns 2147483648", 2147483647, Integer.MAX_VALUE);
    }
}
