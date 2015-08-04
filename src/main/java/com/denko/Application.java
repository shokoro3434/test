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

import com.denko.api.YahooApiSearchClient;
import com.denko.dao.RecallService;
import com.denko.dao.YahooAuctionItemService;
import com.denko.model.Recall;
import com.denko.model.YahooAuctionItem;
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

    public void sayHello () throws Exception{
        Page<Recall> recalls = recallService.findAll(new PageRequest(0, 10));
        for (Recall recall : recalls) {
//        	System.out.println (recall.getRecallId());
        	System.out.println (recall.getRecallName());
        	String jsonp = YahooApiSearchClient.invoke(recall.getRecallName());
        	System.out.println (jsonp);
        	JSONObject json = JSONObject.fromObject(RecallUtils.toJson(jsonp));
        	JSONObject resultSet = json.getJSONObject("ResultSet");
        	JSONObject attributes = resultSet.getJSONObject("@attributes");
        	if (attributes.getLong("totalResultsAvailable") <= 1){
        		continue;
        	}
        	System.out.println (json);
        	JSONArray itemArray = resultSet.getJSONObject("Result").getJSONArray("Item");
        	
        	for (int i = 0 ; i < itemArray.size() ; i ++){
        		JSONObject item = itemArray.getJSONObject(i);
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
        		yahooAuctionItemService.save(yai);
        		System.out.println(item);
        		System.out.println(i);
        	}
//            System.out.println(recall.getName() + " = " + config.getValue());
        }
        System.out.println("[END  ] データベースに接続してデータを取得します。");
    	
    }

}