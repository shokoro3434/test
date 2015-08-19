package com.eitan.recall.batch;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.eitan.recall.model.Recall;
import com.eitan.recall.model.YahooAuctionItem;
import com.eitan.recall.model.YahooShoppingItem;
import com.eitan.recall.rest.yahoo.auction.YahooApiItemSearchClient;
import com.eitan.recall.rest.yahoo.auction.YahooApiSearchClient;
import com.eitan.recall.rest.yahoo.shopping.ItemSearchApiClient;
import com.eitan.recall.service.RecallService;
import com.eitan.recall.service.YahooAuctionItemService;
import com.eitan.recall.service.YahooShoppingItemService;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

@Component
public class CronJob {
    @Autowired
    private RecallService recallService;
    @Autowired
    private YahooAuctionItemService yahooAuctionItemService;
    @Autowired
    private YahooShoppingItemService yahooShoppingItemService;

    @Scheduled(fixedRate = 900000)
    public void invoke() {
    	try{
	    	int ret = 0;
	        Page<Recall> recalls = recallService.findByDelFlag(0, new PageRequest(0, 100));
	        for (Recall recall : recalls) {
	        	Thread.sleep(500);
	        	System.out.println ("########"+recall.getRecallName());
	        	String shopping = ItemSearchApiClient.invoke(recall.getRecallName());
	        	System.err.println(shopping);
	        	JSONObject shoppingRoot = JSONObject.fromObject(shopping);
	        	JSONObject shoppingResultSet = shoppingRoot.getJSONObject("ResultSet");
	        	Long totalResultsAvailable = shoppingResultSet.getLong("totalResultsAvailable");
	        	if (0 < totalResultsAvailable){
		        	JSONObject result = shoppingRoot.getJSONObject("ResultSet").getJSONObject("0").getJSONObject("Result");
		        	JSONObject hit = result.getJSONObject("0");
		            	YahooShoppingItem ysi = new YahooShoppingItem ();
		            	ysi.setItemName(hit.getString("Name"));
		            	ysi.setDescription(hit.getString("Description"));
		            	ysi.setUrl(hit.getString("Url"));
		            	JSONObject price = hit.getJSONObject("Price");
		            	ysi.setPrice(price.getInt("_value"));
		            	ysi.setJan(hit.getString("JanCode"));
		            	ysi.setModel(hit.getString("Model"));
		            	ysi.setIsbn(hit.getString("IsbnCode"));
		            	JSONObject store = hit.getJSONObject("Store");
		
		            	ysi.setStoreId(store.getString("Id"));
		            	ysi.setStoreName(store.getString("Name"));
		        		ysi.setRecallId(recall.getRecallId());
	
		            	yahooShoppingItemService.save(ysi);
	        	}
	        	
	//        	System.out.println ("#########"+shopping);
	//        	System.err.println (recall.getRecallName());
	//        	if (true)return;
	        	String json = YahooApiSearchClient.invoke(recall.getRecallName(),1);
	        	JSONObject root = JSONObject.fromObject(json);
	        	JSONObject resultSet = root.getJSONObject("ResultSet");
	        	JSONObject attributes = resultSet.getJSONObject("@attributes");
	        	Long available = attributes.getLong("totalResultsAvailable");
	        	int page = (int)Long.divideUnsigned(available, 20);
	        	
	        	
	        	
	        	
	        	for (int i = 0 ; i < page ; i ++){
	        		if (3 <= i){
	        			break;
	        		}
		        	json = YahooApiSearchClient.invoke(recall.getRecallName(),i+1);
		        	root = JSONObject.fromObject(json);
		        	resultSet = root.getJSONObject("ResultSet");
		        	attributes = resultSet.getJSONObject("@attributes");
		        	available = attributes.getLong("totalResultsAvailable");

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
		            	int storeFlag = itemRoot.getJSONObject("ResultSet").getJSONObject("Result").getJSONObject("Option").has("StoreIcon") ? 1 : 0;
		            	
		
		            	YahooAuctionItem yai = new YahooAuctionItem ();
		        		yai.setTitle(item.getString("Title"));
		        		yai.setEndTime(item.getString("EndTime"));
		        		yai.setCurrentPrice(item.getInt("CurrentPrice"));
		        		yai.setAuctionId(item.getString("AuctionID"));
		        		yai.setCategoryId(item.getString("CategoryId"));
		        		yai.setBidOrBuy(item.has("BidOrBuy") ? item.getInt("BidOrBuy") : 0);
		        		yai.setSellerId(item.getJSONObject("Seller").getString("Id"));
		        		yai.setAuctionItemUrl(item.getString("AuctionItemUrl"));
		        		yai.setRecallId(recall.getRecallId());
		        		yai.setStoreFlag(storeFlag);
		        		yai.setBids(item.getInt("Bids"));
		        		yahooAuctionItemService.save(yai);
		        		++ret;
		        		System.out.println(item);
		        		continue;
		        	}
		        	else{
			        	System.out.println (json);
			        	JSONArray itemArray = resultSet.getJSONObject("Result").getJSONArray("Item");
			        	
			        	for (int j = 0 ; j < itemArray.size() ; j ++){
				        	Thread.sleep(1000);
			        		JSONObject item = itemArray.getJSONObject(j);
			        		String auctionId = item.getString("AuctionID");
			        		yahooAuctionItemService.removeByAuctionId(auctionId);
			            	String itemJson = YahooApiItemSearchClient.invoke(auctionId);
			            	JSONObject itemRoot = JSONObject.fromObject(itemJson);
			            	int storeFlag = itemRoot.getJSONObject("ResultSet").getJSONObject("Result").getJSONObject("Option").has("StoreIcon") ? 1 : 0;
			        		YahooAuctionItem yai = new YahooAuctionItem ();
			        		yai.setTitle(item.getString("Title"));
			        		yai.setEndTime(item.getString("EndTime"));
			        		yai.setStartTime(itemRoot.getJSONObject("ResultSet").getJSONObject("Result").getString("StartTime"));
			        		yai.setCurrentPrice(item.getInt("CurrentPrice"));
			        		yai.setAuctionId(item.getString("AuctionID"));
			        		yai.setCategoryId(item.getString("CategoryId"));
			        		yai.setBidOrBuy(item.has("BidOrBuy") ? item.getInt("BidOrBuy") : 0);
			        		yai.setSellerId(item.getJSONObject("Seller").getString("Id"));
			        		yai.setAuctionItemUrl(item.getString("AuctionItemUrl"));
			        		yai.setRecallId(recall.getRecallId());
			        		yai.setStoreFlag(storeFlag);
			        		yai.setBids(item.getInt("Bids"));
			        		yahooAuctionItemService.save(yai);
			        		++ret;
			        		System.out.println(item);
			        		System.out.println(j);
			        	}
		//            System.out.println(recall.getName() + " = " + config.getValue());
		        	}
	        	}
	        }
	        System.out.println("[END  ] データベースに接続してデータを取得します。>>>"+ret);
    	}
    	catch(Exception e){
    		e.printStackTrace();
    	}
    }
}
