package com.javafortesters.arrays;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import java.util.Arrays;

/**
 * Created by Simmiah on 1/11/17.
 */
public class ArraysClassTest {

    private String[] workdays = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};

    @Test
    public void copyOf(){
        String[] weekDays;
        weekDays = Arrays.copyOf(workdays, 7);

        assertEquals(null, weekDays[5]);
        assertEquals(null, weekDays[6]);
    }

    @Test
    public void copyOfTruncate(){
        String[] weekDays;
        weekDays = Arrays.copyOf(workdays, 3);

        assertEquals(3, weekDays.length);
        assertEquals("Monday,Tuesday,Wednesday", weekDays[0] + "," + weekDays[1] + "," + weekDays[2]);
    }
}
