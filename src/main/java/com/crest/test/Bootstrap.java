package com.crest.test;

import org.apache.log4j.Logger;

import java.io.IOException;

public class Bootstrap {
    private final static Logger logger = Logger.getLogger(Bootstrap.class);

    public static void main(String[] args) {
        try {
            Constants.init(Config.getConfig("src/main/resources/config.properties"));
            JettyServer.start(Integer.valueOf(Constants.serverPort));
        } catch (IOException e) {
            logger.error("Ошибка чтения файла конфигурации");
        } catch (Exception e) {
            logger.error("Параметр Server Port задан неверно");
        }
    }
}
