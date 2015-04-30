package com.gmail.schcrabicus;

import org.junit.Assert;
import org.junit.Test;

public class TestUtilUnitTest {

    @Test
    public void testGreet() throws Exception {
        Assert.assertEquals("Hello World", TestUtil.greet());
    }

    @Test
    public void testFailing() throws Exception {
        Assert.assertEquals("Wrong expectation", TestUtil.greet());
    }

    @Test
    public void testFailing2() throws Exception {
        Assert.assertEquals("Wrong expectation 2", TestUtil.greet());
    }
}
