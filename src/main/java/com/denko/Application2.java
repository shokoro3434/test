package com.denko;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class Application2 {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(Application2.class);
    }
}
