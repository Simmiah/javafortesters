package com.javafortesters.basicsrevisited;

import org.junit.Test;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by Simmiah on 8/1/16.
 */
public class ConditionalOperatorsTest {
    @Test
    public void conditionalOperatorsExplored(){
        assertTrue(true && true);
        assertTrue(true || false);
        assertTrue(false || true);
        assertFalse(false || false);
        assertFalse(false && true);
    }
}
