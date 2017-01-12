package com.javafortesters.arrays;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Created by Simmiah on 1/9/17.
 */
public class ArraysTest {
    @Test
    public void forEach(){
        String[] workdays = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};
        String days="";

        for(String workday : workdays){
            days = days + "|" + workday;
        }

        assertEquals("|Monday|Tuesday|Wednesday|Thursday|Friday", days);
    }

    @Test
    public void forLoop(){
        String[] workdays = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};
        String days ="";

        for(int i=0; i<5; i++){
            days = days + "|" + workdays[i];
        }

        assertEquals("|Monday|Tuesday|Wednesday|Thursday|Friday", days);
    }

    @Test
    public void forLoopNoInitialize(){
        String[] workdays = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};
        String days ="";

        int i=0;
        for(; i<5; i++){
            days = days + "|" + workdays[i];
        }

        assertEquals("|Monday|Tuesday|Wednesday|Thursday|Friday", days);
    }

    @Test
    public void forLoopNoInitNoIncrement(){
        String[] workdays = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};
        String days ="";

        int i=0;
        for(; i<5; ){
            days = days + "|" + workdays[i];
            i++;
        }

        assertEquals("|Monday|Tuesday|Wednesday|Thursday|Friday", days);
    }

    @Test
    public void forLoopNothingElse(){
        String[] workdays = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};
        String days ="";

        int i=0;
        for(; ; ){
            days = days + "|" + workdays[i];
            i++;
            if(i>=5) break;
        }

        assertEquals("|Monday|Tuesday|Wednesday|Thursday|Friday", days);
    }

    @Test
    public void forEachWithIndex(){
        String[] workdays = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};
        String days ="";

        int dayindex =0;
        for(String workday : workdays){
            days = days + "|" + workday;
            System.out.println("found " + workday + " at position " + dayindex);
            dayindex++;
        }
    }

    @Test
    public void forLoopWithLength(){
        String[] workdays = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};
        String days ="";

        for(int i=0; i<workdays.length ; i++){
            days = days + "|" + workdays[i];
        }

        assertEquals(5, workdays.length);
        assertEquals("|Monday|Tuesday|Wednesday|Thursday|Friday", days);
    }
}
