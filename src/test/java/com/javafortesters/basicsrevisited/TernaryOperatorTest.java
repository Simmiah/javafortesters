package com.javafortesters.basicsrevisited;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by Simmiah on 8/2/16.
 */
public class TernaryOperatorTest {
    @Test
    public void ternaryOperatorsExplored(){
        int x;
        x = 4>3 ? 2 : 1;
        assertEquals(2, x);

        assertTrue( 5>=4? true : false );
    }
}
