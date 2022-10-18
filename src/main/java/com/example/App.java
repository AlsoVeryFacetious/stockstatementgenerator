package com.example;

import java.io.FileReader;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class App 
{
    public static void main( String[] args )
    {
        readJSON();
    }
    
    public static void readJSON() {
        JSONParser parser = new JSONParser();
        try{
            Object obj = parser.parse(new FileReader("stock_transations-3.by.account.holder.json"));
            JSONArray array = new JSONArray();
            String fname = (String)array.get("first_name");
            System.out.println(fname);
        } catch(Exception e) {
            e.printStackTrace();
        }
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
