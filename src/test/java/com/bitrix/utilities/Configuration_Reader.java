package com.bitrix.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Configuration_Reader {
    //1- we created properties object
    private static Properties properties = new Properties();

    //Our own custom method to read and get values from configuration.properties file

    public static String getProperty(String keyWord) {

        return properties.getProperty(keyWord);
    }

    static {
        //2- get the path and store in String, or directly pass into fileInputStream obj
        String path = "configuration.properties";//(path of configuration.properties )

        try {
            //3- we need to open the file in JVM memory
            FileInputStream file = new FileInputStream(path);

            //4- we need to load the file to properties object
            properties.load(file);

            //5- close.file in the JVM memory
            file.close();

        } catch (IOException e) {
            System.out.println("Properties file not found.");
        }
    }
}
