package com.test;

import junit.framework.TestCase;
import org.junit.Assert;

public class MyServiceTest extends TestCase {

    public void testTest1() {
        MyService service = new MyService();
        String helo = service.test("hello");
        Assert.assertEquals("Hello", helo);
    }
}