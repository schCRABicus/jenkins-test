package com.gmail.schcrabicus;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

public class TestUtilUnitTest {

    @Test
    public void testGreet() throws Exception {
        Assert.assertEquals("Hello World", TestUtil.greet());
    }

    @Test
    @Ignore
    public void testIgnoredFailing() throws Exception {
        Assert.assertEquals("Wrong expectation", TestUtil.greet());
    }

    @Test
    public void testFailing() throws Exception {
        Assert.assertEquals("Wrong expectation", TestUtil.greet());
        //Assert.assertEquals("Hello World", TestUtil.greet());
    }

    @Test
    public void testPassing() throws Exception {
        Assert.assertEquals("Hello World", TestUtil.greet());
    }
}
