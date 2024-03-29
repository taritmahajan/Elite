package com.ecomm.util.FileReaders;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadJson {

    JSONObject testObject;
    Object obj;
    String dataFilePath = "src/test/resources/TestData/";
    String dataFileName;


    public ReadJson(String dataFileName) {
        this.dataFileName = dataFilePath +dataFileName + ".json";
    }

    //return json object
    public JSONObject getDataFile() {

        JSONParser jsonParser = new JSONParser();
        try {
            FileReader reader = new FileReader(this.dataFileName);
            //parse json file
           this.testObject = (JSONObject) jsonParser.parse(reader);
        }catch (Exception e){
            e.printStackTrace();
        }
        return this.testObject;
    }

    public String getValue(String key){
        return (String)getDataFile().get(key);
    }

    public Object getArrayObject()  {
        JSONParser jsonParser = new JSONParser();
        try {
            FileReader reader = new FileReader(this.dataFileName);
            //parse json file
            this.obj = jsonParser.parse(reader);
        }catch (Exception e){
            e.printStackTrace();
        }
        return this.obj;
    }

}
