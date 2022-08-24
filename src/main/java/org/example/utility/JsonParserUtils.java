package org.example.utility;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.IOException;

public class JsonParserUtils {

    public static Logger log = LogManager.getLogger();

    /**
     * Get the Foreign Player Count Form a Team
     * @param fileName json file name
     * @return get the count in int
     * @throws IOException
     * @throws ParseException
     */
    public static int getForeignPlayerCountFromJSON(String fileName) throws IOException, ParseException {

        int foreignPlayerCount = 0;

        ////Instantiate the JSONParser class
        JSONParser jsonParser = new JSONParser();
        ////Get the json file from location
        FileReader fileReader = new FileReader(System.getProperty("user.dir")+ "/src/main/resources/" + fileName + ".json");

        ////Parsing the contents of the JSON file
        JSONObject jsonObject = (JSONObject) jsonParser.parse(fileReader);

        String teamName = (String) jsonObject.get("name");
        log.info("Team Name : " + teamName);

        ////Get the players information into a JSONArray
        JSONArray jsonArray = (JSONArray) jsonObject.get("player");

        ////Iterate through the JSONArray and get all player information/s
        for(int i = 0 ; i < jsonArray.size() ; i++){
            JSONObject player = (JSONObject) jsonArray.get(i);
            log.info("--------- " + "Player " + (i + 1) + " --------- " );
            log.info("-------------------------" );
            log.info("Name : " + player.get("name"));
            log.info("Country : " + player.get("country"));
            log.info("Role : " + player.get("role"));
            log.info("Price-in-crores : " + player.get("price-in-crores"));
            log.info(" ");
            if(!player.get("country").equals("India")){
                foreignPlayerCount++;
            }
        }

        log.info("Foreign Player Count is " + foreignPlayerCount);
        return foreignPlayerCount;
    }

    /**
     * Get the Wicket Keeper Player Count Form a Team
     * @param fileName json file name
     * @return get the count in int
     * @throws IOException
     * @throws ParseException
     */
    public static int getWicketKeeperCountFromJSON(String fileName) throws IOException, ParseException {

        int wicketKeeperCount = 0;

        ////Instantiate the JSONParser class
        JSONParser jsonParser = new JSONParser();
        ////Get the json file from location
        FileReader fileReader = new FileReader(System.getProperty("user.dir")+ "/src/main/resources/" + fileName + ".json");

        ////Parsing the contents of the JSON file
        JSONObject jsonObject = (JSONObject) jsonParser.parse(fileReader);

        String teamName = (String) jsonObject.get("name");
        log.info("Team Name : " + teamName);

        ////Get the players information into a JSONArray
        JSONArray jsonArray = (JSONArray) jsonObject.get("player");

        ////Iterate through the JSONArray and get all player information/s
        for(int i = 0 ; i < jsonArray.size() ; i++){
            JSONObject player = (JSONObject) jsonArray.get(i);
            log.info("--------- " + "Player " + (i + 1) + " --------- " );
            log.info("-------------------------" );
            log.info("Name : " + player.get("name"));
            log.info("Country : " + player.get("country"));
            log.info("Role : " + player.get("role"));
            log.info("Price-in-crores : " + player.get("price-in-crores"));
            log.info(" ");
            if(player.get("role").equals("Wicket-keeper")){
                wicketKeeperCount++;
            }
        }

        log.info("Total Wicket Keeper in count " + wicketKeeperCount);
        return wicketKeeperCount;
    }
}