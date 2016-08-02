package com.javafortesters.basicsrevisited;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Created by Simmiah on 8/1/16.
 */
public class OperatorsTest {
    @Test
    public void traditionalOperatorsExplored(){
        assertEquals(4, 2+2);
        assertEquals(5L, 10L-5L);
        assertEquals(25.0F, 12.5F * 2F, 0);
        assertEquals(30.2D, 120.8D / 4D, 0);
        assertEquals("abcd", "ab" + "cd");
        assertEquals(1, 9%2);
    }
}
