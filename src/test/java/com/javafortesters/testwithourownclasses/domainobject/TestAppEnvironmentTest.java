package com.javafortesters.testwithourownclasses.domainobject;

import static com.javafortesters.domainobjects.environment.TestAppEnv.*;
import org.junit.Test;
import org.junit.Assert;

/**
 * Created by Simmiah on 5/14/15.
 */
public class TestAppEnvironmentTest {
    @Test
    public void canGetUrlStatically(){
        Assert.assertEquals("Returns Hard Coded URL", "http://192.123.0.3:67", getUrl());
    }

    @Test
    public void canGetDomainAndPortStatistically(){
        Assert.assertEquals("Just the Domain", "192.123.0.3", DOMAIN);

        Assert.assertEquals("Just the port", "67", PORT);
    }
}