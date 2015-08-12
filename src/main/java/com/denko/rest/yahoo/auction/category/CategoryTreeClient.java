package com.denko.rest.yahoo.auction.category;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.denko.model.Category;
import com.denko.service.RecallService;
import com.denko.service.YahooCategoryService;

@SpringBootApplication
@ComponentScan(basePackages="com.denko.service")
@EnableJpaRepositories(basePackages="com.denko.repository")
@EntityScan(basePackages="com.denko.model")
public class CategoryTreeClient {
    @Autowired
    private YahooCategoryService yahooCategoryService;

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
        Result result = resultSet.getResult();
        for (ChildCategory childCategory : result.getChildCategory()){
        	Integer yCategoryId = childCategory.getCategoryId();
        	System.out.println(yCategoryId);
        	yahooCategoryService.deleteByYCategoryId(yCategoryId);
        	Category category = new Category();
        	category.setCategoryName(childCategory.getCategoryName());
        	category.setCategoryPath(childCategory.getCategoryPath());
        	category.setNumOfAuctions(childCategory.getNumOfAuctions());
        	category.setParentCategoryId(childCategory.getParentCategoryId());
        	category.setYCategoryId(yCategoryId);
        	yahooCategoryService.save(category);
        }
        
        log.info(resultSet.toString());
        System.out.println("########");
    }
}

