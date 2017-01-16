package com.javafortesters.arrays;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Created by Simmiah on 1/15/17.
 */
public class ArraysOfArraysTest {
    @Test
    public void multi(){
        int[][] multi = new int[4][4];

        assertEquals(4, multi[0].length);
        assertEquals(0, multi[0][1]);
    }

    @Test
    public void multiInit(){
        int[][] multi = {{1,2,3,4},
                        {5,6,7,8},
                        {9,0,11,12},
                        {13,14,15,16}};

        assertEquals(1, multi[0][0]);
        assertEquals(7, multi[1][2]);
        assertEquals(12, multi[2][3]);
        assertEquals(14, multi[3][1]);
    }

    @Test
    public void multi3D(){
        int[][][] multi3d = new int[3][4][5];

        assertEquals(3, multi3d.length);
        assertEquals(4, multi3d[0].length);
        assertEquals(4, multi3d[1].length);
        assertEquals(4, multi3d[2].length);
        assertEquals(5, multi3d[0][1].length);
        assertEquals(5, multi3d[0][2].length);
        assertEquals(5, multi3d[2][3].length);
        assertEquals(0, multi3d[0][0][0]);
    }
}