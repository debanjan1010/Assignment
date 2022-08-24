package org.example;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TeamValidationTests {

    @Test
    public void demoTest(){
        System.out.println("demo test method");
        Assert.assertTrue(true, "This is demo test");
    }

    @Test(groups = "teamMemberValidation")
    public void foreignPlayersValidationTest(){

    }

    @Test(groups = "teamMemberValidation")
    public void wicketKeeperValidationTest(){

    }
}
