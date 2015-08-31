package com.eitax.recall.boot;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.scheduling.annotation.EnableScheduling;


@EnableScheduling
@SpringBootApplication
@ComponentScan(basePackages={
		"com.eitax.recall.yahoo.job",
		"com.eitax.recall.yahoo.facade",
		"com.eitax.recall.dao"
})
@EnableJpaRepositories(basePackages={
		"com.eitan.recall.repository",
		"com.eitan.recall.yahoo.repository"
})
@EntityScan(basePackages={
		"com.eitax.recall.yahoo.model",
		"com.eitax.recall.model",
})
public class YahooAuctionApplication {

    private static final Logger log = LoggerFactory.getLogger(YahooAuctionApplication.class);


    public static void main(String[] args) throws Exception {
        SpringApplication.run(YahooAuctionApplication.class);
    }
}
