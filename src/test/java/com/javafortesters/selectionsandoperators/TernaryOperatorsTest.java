package com.javafortesters.selectionsandoperators;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by Simmiah on 8/28/16.
 */
public class TernaryOperatorsTest {
    @Test
    public void moreTernary(){
        String url = "www.eviltester.com";

        url = url.startsWith("http") ? url : addHttp(url);

        assertTrue(url.startsWith("http://"));
        assertEquals("http://www.eviltester.com", url);
    }

    private String addHttp(String url){
        return "http://" + url;
    }
}
