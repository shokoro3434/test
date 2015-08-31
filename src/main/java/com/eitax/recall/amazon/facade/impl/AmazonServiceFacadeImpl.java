package com.eitax.recall.amazon.facade.impl;

import java.io.IOException;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.eitax.recall.amazon.facade.AmazonServiceFacade;
import com.eitax.recall.amazon.model.AwsApi;
import com.eitax.recall.amazon.model.AwsApiCall;
import com.eitax.recall.amazon.rest.AmazonRestService;
import com.eitax.recall.amazon.service.AmazonService;
import com.eitax.recall.amazon.xsd.Item;
import com.eitax.recall.amazon.xsd.ItemLookupResponse;
import com.eitax.recall.amazon.xsd.ItemSearchResponse;
import com.eitax.recall.dao.impl.RecallDAOImpl;
import com.eitax.recall.model.Recall;

@Component
public class AmazonServiceFacadeImpl implements AmazonServiceFacade {
	@Autowired
	private RecallDAOImpl recallService;
	@Autowired
	private AmazonRestService amazonRestService;
	@Autowired
	private AmazonService amazonService;

	private static final Logger log = LoggerFactory.getLogger(AmazonServiceFacadeImpl.class);

	public void registerItems() throws IOException{
		int call = 0;
		try {
			AwsApiCall yac = amazonService.registerAwsApiCallAndFindAwsApi();
			AwsApi aa = yac.getAwsApi();
			List<Recall> recalls = recallService.findByDelFlag(0);
			for (Recall recall : recalls) {
				final int INITIAL_ITEM_PAGE = 1;
				int itemCount = amazonRestService.retrieveItemCount(recall.getRecallName(), INITIAL_ITEM_PAGE,
						aa.getAwsAccesskeyId(), aa.getAwsSecretkey(), aa.getAssociateTag(), aa.getDelay(),aa.getUserAgent());
				++ call;
				for (int i = INITIAL_ITEM_PAGE; i < itemCount; i++) {
					ItemSearchResponse isr = amazonRestService.invokeItemSearch(recall.getRecallName(), i + 1,
							aa.getAwsAccesskeyId(), aa.getAwsSecretkey(), aa.getAssociateTag(), aa.getDelay(),aa.getUserAgent());
					++ call;
					if (isr.getItems().size() <= 0) {
						break;
					}
					for (Item item : isr.getItems().get(0).getItem()) {
						ItemLookupResponse ilr = amazonRestService.invokeItemLookup(item.getASIN(), aa.getAwsAccesskeyId(),
								aa.getAwsSecretkey(), aa.getAssociateTag(), aa.getDelay(),aa.getUserAgent());
						++ call;
						amazonService.registerItems(item, ilr, recall.getRecallId());
					}
				}
			}
			amazonService.updateApiCallCount(yac.getAwsApiCallId(), call);
		} catch (IOException e) {
			e.printStackTrace();
			log.error("error : ", e);
			throw e;
		}

	}
}
