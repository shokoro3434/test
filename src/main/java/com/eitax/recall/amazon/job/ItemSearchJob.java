package com.eitax.recall.amazon.job;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.eitax.recall.amazon.facade.AmazonServiceFacade;

@Component
public class ItemSearchJob {
	  @Autowired
	  private AmazonServiceFacade amazonServiceFacade;
	  
	  private static final Logger log = LoggerFactory.getLogger(ItemSearchJob.class);

//	  @Scheduled(fixedRate = 3600000) 
	  @Scheduled(fixedDelay = 60000) 
	  public void invoke() throws IOException{
		  try {
			log.info("READY");
			amazonServiceFacade.registerItems();
			log.info("DONE");
		} catch (IOException e) {
			e.printStackTrace();
			throw e;
		}
	  }
}