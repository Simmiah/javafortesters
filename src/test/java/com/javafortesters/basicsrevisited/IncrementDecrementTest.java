package com.javafortesters.basicsrevisited;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Created by Simmiah on 8/1/16.
 */
public class IncrementDecrementTest {
    @Test
    public void incrementDecrementOperatorsExplored(){
        int num = 10;
        assertEquals(11, ++num);
        assertEquals(10, --num);
        assertEquals(10, num++);
        assertEquals(11, num);
        assertEquals(11, num--);
        assertEquals(10, num);
    }
}
