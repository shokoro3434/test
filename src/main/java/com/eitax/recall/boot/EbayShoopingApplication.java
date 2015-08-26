package com.eitax.recall.boot;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
@ComponentScan(basePackages={"com.eitan.recall.service","com.eitax.recall.rest.ebay.shopping.batch","com.eitax.recall.ebay.shopping.service"})
@EnableJpaRepositories(basePackages={"com.eitan.recall.repository","com.eitax.recall.ebay.repository"})
@EntityScan(basePackages={"com.eitan.recall.model","com.eitax.recall.ebay.model"})
public class EbayShoopingApplication {

    private static final Logger log = LoggerFactory.getLogger(EbayShoopingApplication.class);

    public static void main(String[] args) throws Exception {
        SpringApplication.run(EbayShoopingApplication.class);
    }
}
