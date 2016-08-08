package com.javafortesters.basicsrevisited;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Created by Simmiah on 8/7/16.
 */
public class OperatorPrecedenceTest {
    @Test
    public void operatorPrecedence(){
        assertEquals(8, 4+2*6/3 );
        assertEquals(12, (((4+2)*6)/3) );
    }
}
