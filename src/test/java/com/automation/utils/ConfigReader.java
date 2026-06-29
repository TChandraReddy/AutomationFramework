package com.automation.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

    private final Properties properties;

    public ConfigReader(String filePath) {
        properties = new Properties();
        try (FileInputStream fis = new FileInputStream(filePath)) {
            properties.load(fis);
        } catch (IOException e) {
            throw new RuntimeException("FATAL: Config file not found at: "
                    + filePath + " — " + e.getMessage());
        }
    }

    public String getBrowser()      { return properties.getProperty("browser"); }
    public String getBaseUrl()      { return properties.getProperty("baseUrl"); }
    public String getEnvironment()  { return properties.getProperty("environment"); }
    public String getReportPath()   { return properties.getProperty("reportPath"); }
    public int    getTimeout()      { return Integer.parseInt(properties.getProperty("timeout")); }
}