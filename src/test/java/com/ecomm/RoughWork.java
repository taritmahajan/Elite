package com.ecomm;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.ecomm.util.FileReaders.ReadJson;
import com.ecomm.util.Support.ExtentManager;
import jdk.nashorn.internal.scripts.JS;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.IOException;

public class RoughWork {

    public static void main(String[] args) throws IOException, ParseException {
        ReadJson readJson = new ReadJson("Merchant");
        //System.out.println(readJson.getDataFile().get("name"));

        JSONArray searchQueries = (JSONArray) readJson.getArrayObject();
        System.out.println(searchQueries);

        JSONObject users = (JSONObject) searchQueries.get(1);
        System.out.println(users);
    }
}
