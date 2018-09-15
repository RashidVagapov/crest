package com.crest.test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Config {
    public static Properties getConfig(String configPath) throws IOException {
        FileInputStream fileInputStream;
        Properties properties = new Properties();

        fileInputStream = new FileInputStream(configPath);
        properties.load(fileInputStream);

        return properties;
    }
}
