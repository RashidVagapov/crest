package com.crest.test;

import java.util.Properties;

public class Constants {
    public static String serverPort;
    public static String tcpAddress;
    public static String tcpPort;

    public static void init(Properties properties){
        serverPort = properties.getProperty("http.port");
        tcpAddress = properties.getProperty("tcp.dest.addr");
        tcpPort = properties.getProperty("tcp.dest.port");
    }

}
