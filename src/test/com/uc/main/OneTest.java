package com.uc.main;

import static org.junit.Assert.*;

/**
 * Created by lvrh on 15/10/18.
 */
public class OneTest {

    @org.junit.Test
    public void testM() throws Exception {
        One o = new One();
        o.m();
        assertEquals(1.0, 2.0, 3);
    }
}