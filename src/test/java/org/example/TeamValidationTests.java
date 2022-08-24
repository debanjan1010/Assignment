package org.example;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.example.utility.JsonParserUtils;
import org.json.simple.parser.ParseException;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class TeamValidationTests {

    public static Logger log = LogManager.getLogger();

    @Test
    public void demoTest() {
        System.out.println("demo test method");
        Assert.assertTrue(true, "This is demo test");
    }

    @Test(groups = "teamMemberValidation")
    public void foreignPlayersValidationTest() throws IOException, ParseException {
        log.info("--- TEST CASE : To Verify that Foreign Player Should be 4 ---");
        int foreignPlayerCount = JsonParserUtils.getForeignPlayerCountFromJSON("TeamRCB");
        Assert.assertEquals(foreignPlayerCount,4 , " Foreign Player Should be 4");
    }

    @Test(groups = "teamMemberValidation")
    public void wicketKeeperValidationTest() throws IOException, ParseException {
        log.info("--- TEST CASE : To Verify that there should be at least one wicket keeper ---");
        int wicketKeeperCount = JsonParserUtils.getWicketKeeperCountFromJSON("TeamRCB");
        Assert.assertTrue(wicketKeeperCount >= 1 , "There should be at least one wicket keeper");
    }
}
