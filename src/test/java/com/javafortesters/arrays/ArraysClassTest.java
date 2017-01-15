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

    @Test
    public void copyOfRange(){
        String[] weekDays = Arrays.copyOfRange(workdays, 2, 5);

        assertEquals("Wednesday", weekDays[0]);
        assertEquals("Thursday", weekDays[1]);
        assertEquals("Friday", weekDays[2]);

        assertEquals(weekDays[0], workdays[2]);
        assertEquals(weekDays[1], workdays[3]);
        assertEquals(weekDays[2], workdays[4]);
    }

    @Test
    public void copyOfRangeIncrease(){
        String[] weekDays = Arrays.copyOfRange(workdays, 2, 7);

        assertEquals(5, weekDays.length);
        assertEquals("Wednesday", weekDays[0]);
        assertEquals("Thursday", weekDays[1]);
        assertEquals("Friday", weekDays[2]);
        assertEquals(null, weekDays[3]);
        assertEquals(null, weekDays[4]);
    }

    @Test
    public void fill(){
        int[] tenItems = {0,0,0,0,0,1,1,1,1,1};

        Arrays.fill(tenItems,5,10,2);

        assertEquals(0, tenItems[4]);
        assertEquals(2, tenItems[5]);
        assertEquals(2, tenItems[6]);
        assertEquals(2, tenItems[7]);
        assertEquals(2, tenItems[8]);
        assertEquals(2, tenItems[9]);
    }

    @Test
    public void sort(){
        int[] outOfOrder = {9,7,8,2,4,3,6,1,5,0};

        Arrays.sort(outOfOrder);

        assertEquals(0, outOfOrder[0]);
        assertEquals(1, outOfOrder[1]);
        assertEquals(2, outOfOrder[2]);
        assertEquals(3, outOfOrder[3]);
        assertEquals(4, outOfOrder[4]);
        assertEquals(5, outOfOrder[5]);
        assertEquals(6, outOfOrder[6]);
        assertEquals(7, outOfOrder[7]);
        assertEquals(8, outOfOrder[8]);
        assertEquals(9, outOfOrder[9]);
    }
}
