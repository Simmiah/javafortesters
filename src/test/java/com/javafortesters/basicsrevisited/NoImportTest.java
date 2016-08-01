package com.javafortesters.basicsrevisited;

/**
 * Created by Simmiah on 7/30/16.
 */
public class NoImportTest {
    // this is harder to read
    @org.junit.Test
    public void nonImportTest(){
        org.junit.Assert.assertEquals(3, 2+1);
    }
}
