package com.sincs.jx3bot.starter;

import love.forte.simboot.spring.autoconfigure.EnableSimbot;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@EnableSimbot
@SpringBootApplication
@ComponentScan("com.sincs.jx3bot")
public class Jx3botApplication {

    public static void main(String[] args) {
        SpringApplication.run(Jx3botApplication.class, args);
    }


}
