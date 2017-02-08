package com.javafortesters.arrays;

/**
 * Created by Simmiah on 1/16/17.
 */
public class Print2DIntArray {


    public void print2DIntArray(int[][]multi){
        for(int[] outer : multi){
            if(outer==null){
                System.out.print("null");
            }else{
                for(int inner : outer){
                    System.out.print(inner + ",");
                }
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        int[][] ragged = {{0}, {0,1}, {0, 1, 2}, {0, 1, 2, 3}, {0, 1, 2, 3, 4}, {0, 1, 2, 3, 4, 5}};

        Print2DIntArray printing = new Print2DIntArray();
        printing.print2DIntArray(ragged);
    }
}
