package com.example;

import java.io.FileReader;
import org.json.simple.parser.JSONParser;

public class StatementData {

    public static void readJSON() {
        JSONParser parser = new JSONParser();
        try{
            Object obj = parser.parse(new FileReader("stock_transations-3.by.account.holder.json"));            
            System.out.println(obj.toString());
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