package com.example;

import java.io.FileReader;

import javax.swing.text.html.parser.Parser;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class App 
{
    public static void main( String[] args )
    {
        
    }
    
    public static void readJSON() {
        try{
            JSONParser parser = new JSONParser();
            Object obj = parser.parse(new FileReader("stockstatementgenerator/stock_transations-3.by.account.holder.json"));
            JSONObject jsonObject = (JSONObject)obj;
            // Insert variables here to pull from JSON file
            String account5 = (String)JSONObject.get("account_number");
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
