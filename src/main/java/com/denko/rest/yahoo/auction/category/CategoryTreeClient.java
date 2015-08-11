package com.denko.rest.yahoo.auction.category;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class CategoryTreeClient {

    private static final Logger log = LoggerFactory.getLogger(CategoryTreeClient.class);

    public static void main(String args[]) throws Exception{
        try (ConfigurableApplicationContext ctx = SpringApplication.run(CategoryTreeClient.class, args)) {
        	CategoryTreeClient m = ctx.getBean(CategoryTreeClient.class);
            m.invoke();
        }
//        SpringApplication.run(CategoryTreeClient.class);
    } 

    public void invoke() throws Exception {
        RestTemplate restTemplate = new RestTemplate();
        ResultSet resultSet = restTemplate.getForObject("http://auctions.yahooapis.jp/AuctionWebService/V2/categoryTree?appid="+System.getProperty("appid"), ResultSet.class);
        
        
        log.info(resultSet.toString());
        System.out.println("########");
    }
}

