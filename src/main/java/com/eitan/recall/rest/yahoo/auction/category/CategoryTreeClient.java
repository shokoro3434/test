package com.eitan.recall.rest.yahoo.auction.category;

import java.io.IOException;

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
import org.springframework.http.client.ClientHttpResponse;
import org.springframework.stereotype.Component;
import org.springframework.web.client.DefaultResponseErrorHandler;
import org.springframework.web.client.HttpServerErrorException;
import org.springframework.web.client.ResponseErrorHandler;
import org.springframework.web.client.RestTemplate;

import com.denko.service.YahooCategoryService;
import com.eitan.recall.model.Category;
import com.eitan.recall.service.RecallService;

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

    private void register(Integer categoryId) throws InterruptedException{
    	try{
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
	//        restTemplate.setErrorHandler(new ResponseErrorHandler(){
	//
	//			@Override
	//			public boolean hasError(ClientHttpResponse response) throws IOException {
	//				// TODO Auto-generated method stub
	//				Thread.sleep(10000);
	//				return false;
	//			}
	//
	//			@Override
	//			public void handleError(ClientHttpResponse response) throws IOException {
	//				// TODO Auto-generated method stub
	//				
	//			}
	//        });
	        ResultSet resultSet = restTemplate.getForObject(sb.toString(), ResultSet.class);
	        Result result = resultSet.getResult();
	        if (!result.getIsLeaf()){
	        	for (ChildCategory child : result.getChildCategory()){
		        	Integer yCategoryId = child.getCategoryId();
		        	Boolean isLeaf = child.getIsLeaf();
					Thread.sleep(500);
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
    	catch(HttpServerErrorException e){
    		e.printStackTrace();
			Thread.sleep(10000);
    		register(categoryId);
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

