package com.eitax.recall.amazon.facade.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Component;

import com.eitan.recall.model.AwsApi;
import com.eitan.recall.model.Recall;
import com.eitan.recall.rest.amazon.xsd.Item;
import com.eitan.recall.rest.amazon.xsd.ItemLookupResponse;
import com.eitan.recall.rest.amazon.xsd.ItemSearchResponse;
import com.eitan.recall.service.RecallService;
import com.eitax.recall.amazon.facade.AmazonServiceFacade;
import com.eitax.recall.amazon.rest.AmazonRestUtils2;
import com.eitax.recall.amazon.rest.AmazonWebService;
import com.eitax.recall.amazon.service.AmazonService;

@Component
public class AmazonServiceFacadeImpl implements AmazonServiceFacade{
    @Autowired
    private RecallService recallService;
    @Autowired
    private AmazonWebService amazonWebService;
    @Autowired
    private AmazonService amazonService;
    
    private static final Logger log = LoggerFactory.getLogger(AmazonServiceFacadeImpl.class);

	public void registerItems(){
    	try{
    		AwsApi aa = amazonService.registerAwsApiCallAndFindAwsApi();
	        Page<Recall> recalls = recallService.findByDelFlag(0, new PageRequest(0, 100));
	        for (Recall recall : recalls) {
				Thread.sleep(2000);
	    		System.err.println("1");
	    		//retrieve count
	    		int tagPage = 1;
	        	String initialxml = amazonWebService.invokeItemSearch(recall.getRecallName(),tagPage,aa.getAwsAccesskeyId(),aa.getAwsSecretkey(),aa.getAssociateTag());
	        	if (initialxml == null){
	        		System.out.println("###########2"+initialxml);
	        		continue;
	        	}
				ItemSearchResponse isr = AmazonRestUtils2.unmarshal(initialxml, ItemSearchResponse.class);
				if (isr.getItems().size() <= 0){
		    		System.err.println("3");
	        		continue;
				}
				for (int i = 1 ; i < isr.getItems().get(0).getTotalPages().intValue() ; i ++){
					Thread.sleep(2000);
		        	String xml = amazonWebService.invokeItemSearch(recall.getRecallName(),i+1,aa.getAwsAccesskeyId(),aa.getAwsSecretkey(),aa.getAssociateTag());
		        	if (xml == null){
		        		System.out.println("###########3"+xml);
		        		break;
		        	}
					ItemSearchResponse isr2 = AmazonRestUtils2.unmarshal(xml, ItemSearchResponse.class);
					if (isr2.getItems().size() <= 0){
		        		System.err.println("###########0");
		        		break;
						
					}
					List<Item> itemList = isr2.getItems().get(0).getItem();
					if (itemList.size() <= 0){
		        		System.err.println("###########1");
						break;
					}
					for (Item item : itemList){
						Thread.sleep(2000);
						String lookupXML = amazonWebService.invokeItemLookup(item.getASIN(),aa.getAwsAccesskeyId(),aa.getAwsSecretkey(),aa.getAssociateTag());
			        	if (lookupXML == null){
			        		System.err.println("###########2"+xml);
			        		break;
			        	}
						ItemLookupResponse ilr = AmazonRestUtils2.unmarshal(lookupXML, ItemLookupResponse.class);
						amazonService.registerItems(item, ilr, recall.getRecallId());
						
					}
				}
	        }
    	}
    	catch(Exception e){
    		e.printStackTrace();
    		log.error("error : ",e);
    	}
	
	}
}
