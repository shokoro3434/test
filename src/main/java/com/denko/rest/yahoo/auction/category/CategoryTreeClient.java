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

    private void register(Integer categoryId){
    	StringBuffer sb = new StringBuffer();
    	sb.append("http://auctions.yahooapis.jp/AuctionWebService/V2/categoryTree");
    	sb.append("?");
    	sb.append("appid=");
    	sb.append(System.getProperty("appid"));
    	sb.append("&");
    	sb.append("adf=1");
    	sb.append("&");
    	sb.append("category=");
    	sb.append(categoryId);
    	RestTemplate restTemplate = new RestTemplate();
        ResultSet resultSet = restTemplate.getForObject(sb.toString(), ResultSet.class);
        Result result = resultSet.getResult();
        if (!result.getIsLeaf()){
        	for (ChildCategory child : result.getChildCategory()){
	        	Integer yCategoryId = child.getCategoryId();
	        	Boolean isLeaf = child.getIsLeaf();
	        	if (isLeaf){
		        	yahooCategoryService.deleteByYCategoryId(yCategoryId);
		        	Category category = new Category();
		        	category.setCategoryName(child.getCategoryName());
		        	category.setCategoryPath(child.getCategoryPath());
		        	category.setNumOfAuctions(child.getNumOfAuctions());
		        	category.setParentCategoryId(child.getParentCategoryId());
		        	category.setYCategoryId(yCategoryId);
		        	yahooCategoryService.save(category);
	        	}
	        	else{
	        		register(yCategoryId);
	        	}
	        }
        }
    }
    
    public void invoke() throws Exception {
    	register(0);
//        for (child childCategory : rootResult.getChildCategory()){
//        	Integer yCategoryId = childCategory.getCategoryId();
//        	System.out.println(yCategoryId);
//        	yahooCategoryService.deleteByYCategoryId(yCategoryId);
//        	Category category = new Category();
//        	category.setCategoryName(childCategory.getCategoryName());
//        	category.setCategoryPath(childCategory.getCategoryPath());
//        	category.setNumOfAuctions(childCategory.getNumOfAuctions());
//        	category.setParentCategoryId(childCategory.getParentCategoryId());
//        	category.setYCategoryId(yCategoryId);
//        	yahooCategoryService.save(category);
//        	StringBuffer sb = new StringBuffer();
//        	sb.append("http://auctions.yahooapis.jp/AuctionWebService/V2/categoryTree");
//        	sb.append("?");
//        	sb.append("appid=");
//        	sb.append(System.getProperty("appid"));
//        	sb.append("&");
//        	sb.append("adf=1");
//        	sb.append("&");
//        	sb.append("category=");
//        	sb.append(yCategoryId);
//            ResultSet resultSet = restTemplate.getForObject(sb.toString(), ResultSet.class);
//            Result result = resultSet.getResult();
//            for (ChildCategory childCategory : result.getChildCategory()){
//            	
//            }
//        }
        
//        log.info(rootResultSet.toString());
//        System.out.println("########");
    }
}

