package com.aerospike.load;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by rukong on 2/1/16.
 */
public class UtilsTest {

    @Test
    public void testIsDouble() throws Exception {
        String v = "1.0";
        assertTrue(Utils.isDouble(v));
    }

    @Test
    public void testNotDouble() throws Exception {
        String v = "23";
        assertFalse(Utils.isDouble(v));
    }

}