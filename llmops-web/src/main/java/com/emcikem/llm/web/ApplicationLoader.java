package com.emcikem.llm.web;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Create with Emcikem on ${DATE}
 * 
 * @author Emcikem
 * @version 1.0.0
 */
@Slf4j
@SpringBootApplication(scanBasePackages = "com.emcikem.llm")
public class ApplicationLoader {
    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(ApplicationLoader.class);
//        application.setAdditionalProfiles();
        application.run(args);
        log.info("-------------------------------------------------------------------------------");
        log.info("|                                      |                                      |");
        log.info("|                                --====|====--                                |");
        log.info("|                                      |                                      |");
        log.info("|                                                                             |");
        log.info("|                                  .-'''''-.                                  |");
        log.info("|                                .'_________'.                                |");
        log.info("|                               /_/_|__|__|_\\_\\                               |");
        log.info("|                              ;'-._       _.-';                              |");
        log.info("|         ,--------------------|    `-. .-'    |--------------------,         |");
        log.info("|          ``''--..__    ___   ;       '       ;   ___    __..--''``          |");
        log.info("|                    `'-// \\\\.._\\             /_..// \\\\- '`                   |");
        log.info("|                       \\\\_//    '._       _.'      \\\\_//                     |");
        log.info("-------------------------------------------------------------------------------");
    }
}