package com.eitax.recall.rest.ebay.shopping.batch;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.eitan.recall.batch.CronJob;
import com.eitan.recall.model.YahooApi;
import com.eitan.recall.model.YahooApiCall;
import com.eitan.recall.service.YahooApiService;
import com.eitax.recall.ebay.model.EbayApi;
import com.eitax.recall.ebay.shopping.service.EbayApiService;

@Component
public class SheduledJob {

	private static final Logger log = LoggerFactory.getLogger(CronJob.class);

	@Autowired
	private EbayApiService ebayApiService;

	@Scheduled(fixedRate = 900000)
	public void invoke() {
		List<EbayApi> ebayApiList = ebayApiService.findAll();
		for (EbayApi ea : ebayApiList){
			System.err.println(ea);
		}
	}

}
