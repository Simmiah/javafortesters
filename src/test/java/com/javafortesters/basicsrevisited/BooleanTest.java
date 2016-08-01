package com.javafortesters.basicsrevisited;

import org.junit.Test;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by Simmiah on 7/31/16.
 */
public class BooleanTest {
    @Test
    public void BooleanType(){
        boolean truthy = true;
        boolean falsey = false;

        assertTrue(truthy);
        assertFalse(falsey);

        truthy = Boolean.TRUE;
        falsey = Boolean.FALSE;

        assertTrue(truthy);
        assertFalse(falsey);
    }
}