package com.gmail.schcrabicus;

import org.junit.Assert;
import org.junit.Test;

public class TestUtilUnitTest {

    @Test
    public void testGreet() throws Exception {
        Assert.assertEquals("Hello World", TestUtil.greet());
    }
}
