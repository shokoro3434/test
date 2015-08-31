package com.eitax.recall.amazon.service.impl;

import java.io.StringReader;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.eitan.recall.model.AmazonItem;
import com.eitan.recall.model.AmazonItemDetail;
import com.eitan.recall.rest.amazon.xsd.Item;
import com.eitan.recall.rest.amazon.xsd.ItemLookupResponse;
import com.eitan.recall.rest.amazon.xsd.OfferSummary;
import com.eitan.recall.rest.amazon.xsd.Price;
import com.eitax.recall.amazon.dao.AmazonItemDAO;
import com.eitax.recall.amazon.dao.AmazonItemDetailDAO;
import com.eitax.recall.amazon.service.AmazonService;

@Component
public class AmazonServiceImpl implements AmazonService {
    @Autowired
    private AmazonItemDAO amazonItemDAO;
    @Autowired
    private AmazonItemDetailDAO amazonItemDetailDAO;

	@Override
	@Transactional
	public void registerItems(Item item, ItemLookupResponse ilr, Integer recallId) {
		List<AmazonItem> items = amazonItemDAO.deleteByAsin(item.getASIN());
		for (AmazonItem ai : items){
			amazonItemDetailDAO.deleteByAmazonItemId(ai.getAmazonItemId());
		}
		
		AmazonItem ai = new AmazonItem();
		ai.setAsin(item.getASIN());
		ai.setDetailPageUrl(item.getDetailPageURL());
		ai.setManufacturer(item.getItemAttributes().getManufacturer());
		ai.setTITLE(item.getItemAttributes().getTitle());
		ai.setIsbn(item.getItemAttributes().getISBN());
		ai.setRecallId(recallId);
		AmazonItem ret = amazonItemDAO.save(ai);

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
		amazonItemDetailDAO.save(aid);
	}

}
