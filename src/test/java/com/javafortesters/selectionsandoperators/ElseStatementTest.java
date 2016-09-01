package com.javafortesters.selectionsandoperators;

import org.junit.Test;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

/**
 * Created by Simmiah on 8/30/16.
 */
public class ElseStatementTest {
    @Test
    public void ifElseAddHttp(){
        String url = "www.seleniumsimplified.com";
        if(url.startsWith("http")){
            //do nothing the url is fine
        }else{
            url = addHttp(url);
        }
        assertTrue(url.startsWith("http://"));
        assertEquals("http://www.seleniumsimplified.com", url);
    }

    private String addHttp(String url){
        return "http://" + url;
    }
}
