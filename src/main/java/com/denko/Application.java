package com.denko;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Component;

import com.denko.model.Recall;
import com.denko.model.YahooAuctionItem;
import com.denko.model.YahooShoppingItem;
import com.denko.rest.yahoo.auction.YahooApiItemSearchClient;
import com.denko.rest.yahoo.auction.YahooApiSearchClient;
import com.denko.rest.yahoo.shopping.ItemSearchApiClient;
import com.denko.service.RecallService;
import com.denko.service.YahooAuctionItemService;
import com.denko.service.YahooShoppingItemService;
import com.denko.util.RecallUtils;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;


//@Controller
//@EnableAutoConfiguration
@SpringBootApplication
public class Application {



//    @RequestMapping("/")
//    public String home() {
//        System.out.println("[START] データベースに接続してデータを取得します。");
//        Page<Configurations> configs = configurationsRepository.findAll(new PageRequest(0, 10));
//        for (Configurations config : configs) {
//            System.out.println(config.getName() + " = " + config.getValue());
//        }
//        System.out.println("[END  ] データベースに接続してデータを取得します。");
//        return "index";
//    }

    public static void main(String[] args) throws Exception {
        try (ConfigurableApplicationContext ctx = SpringApplication.run(Application.class, args)) {
        	Application m = ctx.getBean(Application.class);
            m.sayHello();
        }
//        SpringApplication.run(Application.class, args);
//        ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
//        Application app = ctx.getBean(Application.class);
//        app.sayHello();
        

    }
    @Autowired
    private RecallService recallService;
    @Autowired
    private YahooAuctionItemService yahooAuctionItemService;
    @Autowired
    private YahooShoppingItemService yahooShoppingItemService;

    public void sayHello () throws Exception{
        Page<Recall> recalls = recallService.findByDelFlag((long)0, new PageRequest(0, 100));
        for (Recall recall : recalls) { 
//        	System.out.println (recall.getRecallId());
        	String shopping = ItemSearchApiClient.invoke(recall.getRecallName());
        	System.err.println(shopping);
        	JSONObject shoppingRoot = JSONObject.fromObject(shopping);
        	JSONObject shoppingResultSet = shoppingRoot.getJSONObject("ResultSet");
        	Long totalResultsAvailable = shoppingResultSet.getLong("totalResultsAvailable");
        	if (0 < totalResultsAvailable){
	        	JSONObject result = shoppingRoot.getJSONObject("ResultSet").getJSONObject("0").getJSONObject("Result");
	//        	JSONArray hits = result.getJSONArray("hits");
	        	JSONObject hit = result.getJSONObject("0");
	//        	for (int i = 0 ; i < hits.size() ; i ++){
	//            	JSONObject hit = hits.getJSONObject(i);
	            	YahooShoppingItem ysi = new YahooShoppingItem ();
	            	ysi.setItemName(hit.getString("Name"));
	            	ysi.setDescription(hit.getString("Description"));
	            	ysi.setUrl(hit.getString("Url"));
	            	JSONObject price = hit.getJSONObject("Price");
	            	ysi.setPrice(price.getLong("_value"));
	            	ysi.setJan(hit.getString("JanCode"));
	            	ysi.setModel(hit.getString("Model"));
	            	ysi.setIsbn(hit.getString("IsbnCode"));
	            	JSONObject store = hit.getJSONObject("Store");
	
	            	ysi.setStoreId(store.getString("Id"));
	            	ysi.setStoreName(store.getString("Name"));
	            	yahooShoppingItemService.save(ysi);
	//            	break;
	//        		
	//        	}
        	}
        	
//        	System.out.println ("#########"+shopping);
//        	System.err.println (recall.getRecallName());
//        	if (true)return;
        	String json = YahooApiSearchClient.invoke(recall.getRecallName());
        	JSONObject root = JSONObject.fromObject(json);
        	JSONObject resultSet = root.getJSONObject("ResultSet");
        	JSONObject attributes = resultSet.getJSONObject("@attributes");
        	Long available = attributes.getLong("totalResultsAvailable");
        	if (available <= 0){
        		continue;
        	}
        	else if (available <= 1){
        		JSONObject item = resultSet.getJSONObject("Result").getJSONObject("Item");
        		String auctionId = item.getString("AuctionID");
        		yahooAuctionItemService.removeByAuctionId(auctionId);
            	String itemJson = YahooApiItemSearchClient.invoke(auctionId);
            	System.err.println(itemJson);
            	JSONObject itemRoot = JSONObject.fromObject(itemJson);
            	long storeFlag = itemRoot.getJSONObject("ResultSet").getJSONObject("Result").getJSONObject("Option").has("StoreIcon") ? 1 : 0;
            	

            	YahooAuctionItem yai = new YahooAuctionItem ();
        		yai.setTitle(item.getString("Title"));
        		yai.setEndTime(item.getString("EndTime"));
        		yai.setCurrentPrice(item.getLong("CurrentPrice"));
        		yai.setAuctionId(item.getString("AuctionID"));
        		yai.setCategoryId(item.getString("CategoryId"));
        		yai.setBidOrBuy(item.has("BidOrBuy") ? item.getLong("BidOrBuy") : 0);
        		yai.setSellerId(item.getJSONObject("Seller").getString("Id"));
        		yai.setAuctionItemUrl(item.getString("AuctionItemUrl"));
        		yai.setRecallId(recall.getRecallId());
        		yai.setStoreFlag(storeFlag);
        		yai.setBids(item.getLong("Bids"));
        		yahooAuctionItemService.save(yai);
        		System.out.println(item);
        		continue;
        	}
        	else{
	        	System.out.println (json);
	        	JSONArray itemArray = resultSet.getJSONObject("Result").getJSONArray("Item");
	        	
	        	for (int i = 0 ; i < itemArray.size() ; i ++){
	        		JSONObject item = itemArray.getJSONObject(i);
	        		String auctionId = item.getString("AuctionID");
	        		yahooAuctionItemService.removeByAuctionId(auctionId);
	            	String itemJson = YahooApiItemSearchClient.invoke(auctionId);
	            	JSONObject itemRoot = JSONObject.fromObject(itemJson);
	            	long storeFlag = itemRoot.getJSONObject("ResultSet").getJSONObject("Result").getJSONObject("Option").has("StoreIcon") ? 1 : 0;
	        		YahooAuctionItem yai = new YahooAuctionItem ();
	        		yai.setTitle(item.getString("Title"));
	        		yai.setEndTime(item.getString("EndTime"));
	        		yai.setCurrentPrice(item.getLong("CurrentPrice"));
	        		yai.setAuctionId(item.getString("AuctionID"));
	        		yai.setCategoryId(item.getString("CategoryId"));
	        		yai.setBidOrBuy(item.has("BidOrBuy") ? item.getLong("BidOrBuy") : 0);
	        		yai.setSellerId(item.getJSONObject("Seller").getString("Id"));
	        		yai.setAuctionItemUrl(item.getString("AuctionItemUrl"));
	        		yai.setRecallId(recall.getRecallId());
	        		yai.setStoreFlag(storeFlag);
	        		yai.setBids(item.getLong("Bids"));
	        		yahooAuctionItemService.save(yai);
	        		System.out.println(item);
	        		System.out.println(i);
	        	}
//            System.out.println(recall.getName() + " = " + config.getValue());
        	}
        }
        System.out.println("[END  ] データベースに接続してデータを取得します。");
    	
    }

}