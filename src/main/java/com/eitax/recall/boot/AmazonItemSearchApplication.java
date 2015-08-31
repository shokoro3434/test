package com.eitax.recall.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
@ComponentScan(basePackages = { 
		"com.eitax.recall.service",
		"com.eitax.recall.dao",
		"com.eitax.recall.amazon.job", 
		"com.eitax.recall.amazon.facade",
		"com.eitax.recall.amazon.rest",
		"com.eitax.recall.amazon.service", 
		"com.eitax.recall.amazon.dao"
		})
@EnableJpaRepositories(basePackages = { 
		"com.eitax.recall.repository" ,
		"com.eitax.recall.amazon.repository"
		})
@EntityScan(basePackages = { 
		"com.eitax.recall.model" ,
		"com.eitax.recall.amazon.model" ,
		})
public class AmazonItemSearchApplication {
	public static void main(String[] args) throws Exception {
		SpringApplication.run(AmazonItemSearchApplication.class);
	}
}
