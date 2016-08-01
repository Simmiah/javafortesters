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
    }

    @Test
    public void aClassFieldCanChange(){
        ClassExample instance = new ClassExample();
        ClassExample.aClassField = "changed";
        assertEquals("changed",ClassExample.aClassField);
    }

    @Test
    public void aPublicFieldCanBeAccessedViaInstance(){
        // cannot be accessed via below
        // ClassExample.pubField;
        ClassExample instance = new ClassExample();
        assertEquals("a public field", instance.pubField);
    }

    @Test
    public void aPublicFieldCanChange(){
        ClassExample instance = new ClassExample();
        instance.pubField = "amended public field";
        assertEquals("amended public field", instance.pubField);
    }
}