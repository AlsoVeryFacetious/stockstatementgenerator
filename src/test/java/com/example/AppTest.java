package com.example;

import java.io.File;

import org.junit.Test;

/**
 * Unit test for methods 
 */
public class AppTest 
{
    @Test
    public void testFileValidation() throws Exception {        
        File f = new File("stock_transations-3.by.account.holder.json");
        f.exists();
    }
}
