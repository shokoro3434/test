package com.eitax.recall.amazon.service;

import java.io.StringReader;
import java.util.List;

import javax.transaction.Transactional;
import javax.xml.bind.JAXB;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.eitan.recall.model.AmazonItem;
import com.eitan.recall.model.AmazonItemDetail;
import com.eitan.recall.model.Recall;
import com.eitan.recall.rest.amazon.xsd.Item;
import com.eitan.recall.rest.amazon.xsd.ItemLookupResponse;
import com.eitan.recall.rest.amazon.xsd.ItemSearchResponse;
import com.eitan.recall.rest.amazon.xsd.OfferSummary;
import com.eitan.recall.rest.amazon.xsd.Price;
import com.eitan.recall.service.AmazonItemDetailService;
import com.eitan.recall.service.AmazonItemService;
import com.eitan.recall.service.RecallService;
import com.eitax.recall.amazon.rest.AmazonWebService;

@Service
public class AmazonServiceFacade {
    @Autowired
    private RecallService recallService;
    @Autowired
    private AmazonItemService amazonItemService;
    @Autowired
    private AmazonItemDetailService amazonItemDetailService;

    @Autowired
    private AmazonWebService amazonWebService;
    
    private static final Logger log = LoggerFactory.getLogger(AmazonServiceFacade.class);

	public void registerItems(){
    	try{
    		System.err.println("READY");
	        Page<Recall> recalls = recallService.findByDelFlag(0, new PageRequest(0, 100));
	        for (Recall recall : recalls) {
				Thread.sleep(2000);
	    		System.err.println("1");
	    		int tagPage = 1;
	        	String xml = amazonWebService.invokeItemSearch(recall.getRecallName(),tagPage);
	        	if (xml == null){
	        		System.out.println("###########2"+xml);
	        		return;
	        	}
	    		System.err.println("2");
				StringReader sr = new StringReader(xml.toString());
				ItemSearchResponse isr = JAXB.unmarshal(sr, ItemSearchResponse.class);
				sr.close();
				
				if (isr.getItems().size() <= 0){
		    		System.err.println("3");
	        		return;
					
				}
				List<Item> itemList = isr.getItems().get(0).getItem();
				if (itemList.size() <= 0){
		    		System.err.println("4");
					continue;
				}
	    		System.err.println(isr.getItems().get(0).getTotalPages().intValue());
				
				for (int i = 1 ; i < isr.getItems().get(0).getTotalPages().intValue() ; i ++){
					Thread.sleep(2000);
	        		System.out.println("###########SLEEP");
		        	xml = amazonWebService.invokeItemSearch(recall.getRecallName(),i+1);
		        	if (xml == null){
		        		System.out.println("###########2"+xml);
		        		return;
		        	}
					sr = new StringReader(xml.toString());
					isr = JAXB.unmarshal(sr, ItemSearchResponse.class);
					sr.close();
					
					if (isr.getItems().size() <= 0){
		        		return;
						
					}
					itemList = isr.getItems().get(0).getItem();
					if (itemList.size() <= 0){
						continue;
					}
					for (Item item : itemList){
						String lookupXML = amazonWebService.invokeItemLookup(item.getASIN());
			        	if (lookupXML == null){
			        		System.out.println("###########2"+xml);
			        		continue;
			        	}
						Thread.sleep(2000);
						
						
						AmazonItem ai = new AmazonItem();
						ai.setAsin(item.getASIN());
						ai.setDetailPageUrl(item.getDetailPageURL());
						ai.setManufacturer(item.getItemAttributes().getManufacturer());
						ai.setTITLE(item.getItemAttributes().getTitle());
						ai.setIsbn(item.getItemAttributes().getISBN());
						ai.setRecallId(recall.getRecallId());
						AmazonItem ret = amazonItemService.save(ai);
						if (item == null || item.getASIN() == null){
							throw new RuntimeException("ERR");
						}
						else{
						}
//						String lookupXML = amazonWebService.invokeItemLookup(item.getASIN());
//			        	if (lookupXML == null){
//			        		System.out.println("###########2"+xml);
//			        		continue;
//			        	}
						StringReader sr2 = new StringReader(lookupXML.toString());
						ItemLookupResponse ilr = JAXB.unmarshal(sr2, ItemLookupResponse.class);
						sr2.close();
	
						AmazonItemDetail aid = new AmazonItemDetail ();
						aid.setAmazonItemId(ret.getAmazonItemId());
						
						OfferSummary os = ilr.getItems().get(0).getItem().get(0).getOfferSummary();
						if (os != null){
							Price lnp = os.getLowestNewPrice();
							if (lnp != null){
								aid.setNewAmount(lnp.getAmount().intValue());
							}
							Price lup = os.getLowestUsedPrice();
							if (lup != null){
								aid.setUsedAmount(lup.getAmount().intValue());
							}
							aid.setTotalNew(Integer.valueOf(os.getTotalNew()));
							aid.setTotalNew(Integer.valueOf(os.getTotalUsed()));
						}
						amazonItemDetailService.save(aid);
					}
				}
	        }
    	}
    	catch(Exception e){
    		e.printStackTrace();
    		log.error("error : ",e);
    	}
	
	}
	@Transactional
	private void registerItem(Item item,Integer recallId,ItemLookupResponse ilr){
		AmazonItem ai = new AmazonItem();
		ai.setAsin(item.getASIN());
		ai.setDetailPageUrl(item.getDetailPageURL());
		ai.setManufacturer(item.getItemAttributes().getManufacturer());
		ai.setTITLE(item.getItemAttributes().getTitle());
		ai.setIsbn(item.getItemAttributes().getISBN());
		ai.setRecallId(recallId);
		AmazonItem ret = amazonItemService.save(ai);
	}
}
