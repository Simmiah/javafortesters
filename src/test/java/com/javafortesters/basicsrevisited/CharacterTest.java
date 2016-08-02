package com.javafortesters.basicsrevisited;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Created by Simmiah on 8/1/16.
 */
public class CharacterTest {
    @Test
    public void CharacterType(){
        char aChar = '\u0026'; //cannot use "" as "\u0026" is considered a string
        assertEquals(aChar, '&');
    }
}
