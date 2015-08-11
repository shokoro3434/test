package com.eitank.scheduledtask;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class ScheduledApplication {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(ScheduledApplication.class);
    }
}