package com.eitan.recall.boot;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.scheduling.annotation.EnableScheduling;

import com.eitax.recall.yahoo.dao.impl.YahooCategoryDAOImpl;

@EnableScheduling
@SpringBootApplication
@ComponentScan(basePackages={"com.eitan.recall.batch","com.eitan.recall.service"})
@EnableJpaRepositories(basePackages="com.eitan.recall.repository")
@EntityScan(basePackages="com.eitan.recall.model")
public class Application2 {

    private static final Logger log = LoggerFactory.getLogger(CategoryTreeClient.class);


    public static void main(String[] args) throws Exception {
        SpringApplication.run(Application2.class);
    }
}
