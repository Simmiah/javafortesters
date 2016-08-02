package com.javafortesters.basicsrevisited;

import org.junit.Test;
import static org.junit.Assert.assertTrue;

/**
 * Created by Simmiah on 8/1/16.
 */
public class BooleanOperatorsTest {
    @Test
    public void booleanOperatorsExplored(){
        assertTrue(4 == 4);
        assertTrue(4 != 5);
        assertTrue(3 < 4);
        assertTrue(5 > 4);
        assertTrue(6 >= 6);
        assertTrue(7 >= 6);
        assertTrue(8 <= 8);
        assertTrue(8 <= 9);
    }
}
