package com.javafortesters.selectionsandoperators;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Created by Simmiah on 8/31/16.
 */
public class SwitchStatementTest {
    @Test
    public void switchExample(){
        assertEquals("M", likelyGenderIs("sir"));
        assertEquals("M", likelyGenderIs("mr"));
        assertEquals("F", likelyGenderIs("mrs"));
    }

    public String likelyGenderIs(String title){
        String likelyGender;

        switch(title.toLowerCase()){
            case "sir":
                likelyGender = "M";
                break;
            case "mr":
                likelyGender = "M";
                break;
            default:
                likelyGender = "F";
                break;
        }
        return likelyGender;
    }
}
