package com.javafortesters.basicsrevisited;

import com.javafortesters.basicsrevisited.ClassExample;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Created by Simmiah on 7/24/16.
 */
public class ClassExampleTest {
    @Test
    public void aClassField(){
        assertEquals("a class field",ClassExample.aClassField);

        ClassExample instance = new ClassExample();
        instance.aClassField = "changed";

        assertEquals("changed",instance.aClassField);
    }
}