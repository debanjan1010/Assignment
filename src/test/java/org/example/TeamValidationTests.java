package org.example;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TeamValidationTests {

    @Test
    public void demoTest(){
        System.out.println("demotest method");
        Assert.assertTrue(true, "This is demo test");
    }
}
