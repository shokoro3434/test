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
import com.eitax.recall.amazon.rest.AmazonRestService;
import com.eitax.recall.amazon.service.AmazonService;

@Component
public class AmazonServiceFacadeImpl implements AmazonServiceFacade{
    @Autowired
    private RecallService recallService;
    @Autowired
    private AmazonRestService amazonRestService;
    @Autowired
    private AmazonService amazonService;
    
    private static final Logger log = LoggerFactory.getLogger(AmazonServiceFacadeImpl.class);

	public void registerItems(){
    	try{
    		AwsApi aa = amazonService.registerAwsApiCallAndFindAwsApi();
	        Page<Recall> recalls = recallService.findByDelFlag(0, new PageRequest(0, 100));
	        for (Recall recall : recalls) {
	    		final int INITIAL_ITEM_PAGE = 1;
	    		int itemCount = amazonRestService.retrieveItemCount(recall.getRecallName(),INITIAL_ITEM_PAGE,aa.getAwsAccesskeyId(),aa.getAwsSecretkey(),aa.getAssociateTag(),aa.getDelay());
				for (int i = INITIAL_ITEM_PAGE ; i < itemCount ; i ++){
		        	String xml = amazonRestService.invokeItemSearch(recall.getRecallName(),i+1,aa.getAwsAccesskeyId(),aa.getAwsSecretkey(),aa.getAssociateTag(),aa.getDelay());
		        	if (xml == null){
		        		break;
		        	}
					ItemSearchResponse isr = AmazonRestUtils2.unmarshal(xml, ItemSearchResponse.class);
					if (isr.getItems().size() <= 0){
		        		break;
					}
					List<Item> itemList = isr.getItems().get(0).getItem();
//					if (itemList.size() <= 0){
//						break;
//					}
					for (Item item : itemList){
						String lookupXML = amazonRestService.invokeItemLookup(item.getASIN(),aa.getAwsAccesskeyId(),aa.getAwsSecretkey(),aa.getAssociateTag(),aa.getDelay());
			        	if (lookupXML == null){
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
