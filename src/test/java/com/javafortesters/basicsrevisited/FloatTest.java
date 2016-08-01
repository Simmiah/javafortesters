package com.javafortesters.basicsrevisited;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Simmiah on 7/31/16.
 */
public class FloatTest {
    @Test
    public void FloatingPointType(){
        float singlePrecision32bit;
        double doublePrecision64bit;

        System.out.println("* 'float' range: " +
                Float.MIN_VALUE + " to " +
                Float.MAX_VALUE);

        System.out.println("* 'double' range: " +
                Double.MIN_VALUE + " to " +
                Double.MAX_VALUE);

        singlePrecision32bit = 10.0F; //suffix F for float
        assertEquals(10F, singlePrecision32bit, 0);

        doublePrecision64bit = 20.0; //defaults to double
        assertEquals(20D, doublePrecision64bit, 0);
    }
}
