package com.example;

import java.io.FileReader;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class StatementData {

    public static void readJSON() {
        JSONParser parser = new JSONParser();
        try {
            JSONArray obj = (JSONArray) parser.parse(new FileReader("stock_transations-3.by.account.holder.json"));
            for (Object object : obj) {
                JSONObject jsonObj = (JSONObject) object;
                jsonObj.get("stock_trades"); 
                jsonObj.get(obj);
                jsonObj.get(obj);
                jsonObj.get(obj);
                jsonObj.get(obj);
                jsonObj.get(obj);
            }

        } catch(Exception e) {
            e.printStackTrace();
        }
    }    

    public static void parsePerson(JSONObject person) {
        JSONObject personObj = (JSONObject) person.get("account_number");

        String fName = (String) personObj.get("first_name");
        System.out.println(fName);
    }

    public int totalCashValue(double cashstart, double stockstart) {
        int totalval = 0;
        return totalval;
    }

    public int totalStockValue() {
        int totalval = 0;
        return totalval;
    }
}