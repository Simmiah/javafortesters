package com.javafortesters.basicsrevisited;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Simmiah on 7/30/16.
 */
public class StaticImportsTest {
    @Test
    public void staticImportCanUseImportedMethod(){
        assertEquals(6, 3+3);
    }
}