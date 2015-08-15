package com.eitan.recall.boot;

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
@ComponentScan(basePackages={"com.eitan.recall.rest.amazon.itemsearch","com.eitan.recall.service"})
@EnableJpaRepositories(basePackages = "com.eitan.recall.repository")
@EntityScan(basePackages = "com.eitan.recall.model")
public class ItemSearchClient {
	// @Autowired
	// private YahooCategoryService yahooCategoryService;
	private static final Logger log = LoggerFactory.getLogger(ItemSearchClient.class);
    public static void main(String[] args) throws Exception {
        SpringApplication.run(ItemSearchClient.class);
    }
}
