package com.javafortesters.basicsrevisited;

import org.junit.Test;
import static org.junit.Assert.assertTrue;

/**
 * Created by Simmiah on 7/21/16.
 */
public class CommentsTest {
    @Test
    public void aJavaDocComment(){
        assertTrue(addTwoNumbers(4,3)==7);
    }

    /**
     * Adds 2 integers and return an int
     *
     * There is a risk of overflow since two big
     * integers would max out the return int
     *
     * @param a is the first integer to add
     * @param b is the second number to add
     * @return a+b as an int
     */

    public int addTwoNumbers(int a, int b){
        return a+b;
    }
}
