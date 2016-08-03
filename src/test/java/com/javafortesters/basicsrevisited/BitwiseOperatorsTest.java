package com.javafortesters.basicsrevisited;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Created by Simmiah on 8/2/16.
 */
public class BitwiseOperatorsTest {
    @Test
    public void bitwiseOperatorsExplored(){
        assertEquals(0b0001, 0b1001 & 0b0101);
        assertEquals(0b1101, 0b1001 | 0b0101);
        assertEquals(0b1100, 0b1001 ^ 0b0101);

        int x = 0b0001;
        assertEquals("11111111111111111111111111111110", Integer.toBinaryString(~x));
    }

    @Test
    public void bitwiseAssignmentOperatorsExplored(){

    }
}
