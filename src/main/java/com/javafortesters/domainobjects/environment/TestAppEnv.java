package com.javafortesters.domainobjects.environment;

/**
 * Created by Simmiah on 7/15/16.
 */
public class TestAppEnv {

    public static final String DOMAIN = "192.123.0.3";
    public static final String PORT = "67";

    public static String getUrl() {
        return "http://" + DOMAIN + ":" + PORT;
    }
}
