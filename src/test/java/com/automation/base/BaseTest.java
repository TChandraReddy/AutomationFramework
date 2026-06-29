package com.automation.base;

import com.automation.utils.ConfigReader;

public class BaseTest {

    protected ConfigReader config =
            new ConfigReader("src/test/resources/config.properties");

    public void setUp() {
        System.out.println("Setting up test...");
        System.out.println("Browser: " + config.getBrowser());
        System.out.println("URL: " + config.getBaseUrl());
    }

    public void tearDown() {
        System.out.println("Tearing down test...");
    }
}