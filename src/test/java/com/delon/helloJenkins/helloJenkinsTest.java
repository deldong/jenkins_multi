package com.delon.helloJenkins;

import org.junit.*;
import static org.junit.Assert.assertEquals;

/**
 * Created by dongzheng on 2017/4/24.
 */
public class helloJenkinsTest {

    @Test
    public void testSayHello(){
        helloJenkins hw = new helloJenkins();
        String result = hw.sayHello();
        assertEquals("Hello Jenkins", result);
    }
}
