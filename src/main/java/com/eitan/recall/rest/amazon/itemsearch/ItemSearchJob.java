package com.eitan.recall.rest.amazon.itemsearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.io.StringReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSession;
import javax.xml.bind.JAXB;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.eitan.recall.model.AmazonItem;
import com.eitan.recall.model.AmazonItemDetail;
import com.eitan.recall.model.Recall;
import com.eitan.recall.rest.amazon.util.AmazonAPICallHelper;
import com.eitan.recall.rest.amazon.xsd.Item;
import com.eitan.recall.rest.amazon.xsd.ItemLookupResponse;
import com.eitan.recall.rest.amazon.xsd.ItemSearchResponse;
import com.eitan.recall.rest.amazon.xsd.OfferSummary;
import com.eitan.recall.rest.amazon.xsd.Price;
import com.eitan.recall.service.AmazonItemDetailService;
import com.eitan.recall.service.AmazonItemService;
import com.eitan.recall.service.RecallService;

@Component
public class ItemSearchJob {
    @Autowired
    private RecallService recallService;
    @Autowired
    private AmazonItemService amazonItemService;
    @Autowired
    private AmazonItemDetailService amazonItemDetailService;

    private static final Logger log = LoggerFactory.getLogger(ItemSearchJob.class);

	private InputStream retrieveInputStream(HttpURLConnection con) throws IOException {
		try {
			return con.getInputStream();
		} catch (IOException ioe) {
			// error found
			InputStream is = con.getErrorStream();
			if (is != null) {
				return is;
			}
			throw ioe;
		}
	}
    @Scheduled(fixedRate = 3600000) 
	public void invoke() {
    	try{
    		System.err.println("READY");
	        Page<Recall> recalls = recallService.findByDelFlag(0, new PageRequest(0, 100));
	        for (Recall recall : recalls) {
				Thread.sleep(2000);
	    		System.err.println("1");
	    		int tagPage = 1;
	        	String xml = invokeItemSearch(recall.getRecallName(),tagPage);
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
		        	xml = invokeItemSearch(recall.getRecallName(),i+1);
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
						String lookupXML = this.invokeItemLookup(item.getASIN());
			        	if (lookupXML == null){
			        		System.out.println("###########2"+xml);
			        		continue;
			        	}
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
    
    private String invokeItemSearch (String keyword,int tagPage) throws Exception{
		Map<String, String> parameters = new HashMap<String, String>();

		parameters.put("Service", "AWSECommerceService");
		parameters.put("AWSAccessKeyId", System.getProperty("AWSAccessKeyId"));
		parameters.put("AssociateTag", System.getProperty("AssociateTag"));
		parameters.put("Version", "2009-11-01");

		parameters.put("Operation", "ItemSearch");
		parameters.put("SearchIndex", "All");
		parameters.put("Keywords", keyword);
		parameters.put("TagPage", String.valueOf(tagPage));
		
		// parameters.put("AssociateTag", "xxx"); // TODO アソシエイトタグを設定ください.
		AmazonAPICallHelper aach = new AmazonAPICallHelper(System.getProperty("AWSSecretKey"));
		parameters.put("Timestamp", aach.getCurrentTimestamp());
		String urlx = aach.buildRequestWithSignature(parameters);
		System.out.println(urlx);

		// RestTemplate restTemplate = new RestTemplate();
		// restTemplate.setInterceptors(Collections.singletonList(new
		// XUserAgentInterceptor()));
		// String resp = restTemplate.getForObject(url, String.class);
		// System.out.println(resp);
		HttpURLConnection con = null;
		PrintStream ps = null;
		BufferedReader br = null;
		StringBuffer json = new StringBuffer();
		try {
			final int timeout = 3000;
			URL url = new URL(urlx);
			con = (HttpURLConnection) url.openConnection();

			if (con instanceof HttpsURLConnection) {
				HttpsURLConnection httpsCon = (HttpsURLConnection) con;
				httpsCon.setHostnameVerifier(new HostnameVerifier() {
					public boolean verify(String hostname, SSLSession session) {
						return true;
					}
				});
				// KeyManager[] km = null;
				// TrustManager[] tm = { new X509TrustManager() {
				// public void checkClientTrusted(X509Certificate[] arg0, String
				// arg1) throws CertificateException {
				// }
				// public void checkServerTrusted(X509Certificate[] arg0, String
				// arg1) throws CertificateException {
				// }
				// public java.security.cert.X509Certificate[]
				// getAcceptedIssuers() {
				// return null;
				// }
				// }
				// };
				// SSLContext sslcontext= SSLContext.getInstance("SSL");
				// sslcontext.init(km, tm, new SecureRandom());
				// httpsCon.setSSLSocketFactory(sslcontext.getSocketFactory());

			}
			con.setDoInput(true);
			con.setDoOutput(true);
			con.setConnectTimeout(timeout);
			con.setReadTimeout(timeout);
			con.setRequestMethod("GET");
			con.setUseCaches(false);
			con.setRequestProperty("Accept", "application/xml");
			con.setRequestProperty("Accept-Language", "ja");
			con.setRequestProperty("Content-Type", "application/x-www-form-urlencoded; charset=UTF-8");
			// con.setRequestProperty("Content-Length",
			// String.valueOf(postData.getBytes().length));
			// con.setFixedLengthStreamingMode(postData.getBytes().length);
			// con.setInstanceFollowRedirects(false);
			// con.setRequestProperty("Host", "akindo.wup.shop.nintendo.net");

			// con.setRequestProperty("Accept", "application/xml");
			// con.setRequestProperty("Connection", "Keep-Alive");
			// con.setRequestProperty(
			// "Authorization",
			// toBasicAuthorizationValue(
			// args.get(ExecIOArgs.TITLE_CODE.getName()),
			// System.getProperty(Constants.VM_ARGS_TIN.getName())));
			try {
				// unsent sction
				// ps = new PrintStream(con.getOutputStream());
				// ps.print(postData.toString());
				// ps.flush();
				// ps.close();
				br = new BufferedReader(new InputStreamReader(this.retrieveInputStream(con)));
			} catch (IOException ioe) {
				// unsent
				// handshake failed or TCP error
				// System.out.println
				// (CISECashUtil.createECUnsentErrorJson(ioe.getMessage()));
				// System.out.flush();
				ioe.printStackTrace();
				return null;
			}
			// httppost is done
			final int responseCode = con.getResponseCode();
			for (;;) {
				String line = br.readLine();
				if (line == null) {
					break;
				}
				json.append(line);
			}
			if (responseCode < HttpURLConnection.HTTP_BAD_REQUEST) {
				System.out.println(json.toString());
				return json.toString();
			} else {
				// if (json.indexOf("\"error\"") == -1){
				// //todo refactor
				// //unknown error
				// System.out.println
				// (CISECashUtil.createECTimeoutErrorJson(responseCode));
				// System.out.flush();
				// }
				// else {
				System.out.println(json.toString());
				System.out.flush();
				return json.toString();
				// }
			}
		} catch (Exception e) {
			log.error("exception occurred : ",e);
			throw e;
		} finally {
			if (ps != null) {
				ps.close();
			}
			if (br != null) {
				br.close();
			}
			if (con != null) {
				con.disconnect();
			}
		}
	}
    private String invokeItemLookup (String itemId) throws Exception{
		Map<String, String> parameters = new HashMap<String, String>();

		parameters.put("Service", "AWSECommerceService");
		parameters.put("AWSAccessKeyId", System.getProperty("AWSAccessKeyId"));
		parameters.put("AssociateTag", System.getProperty("AssociateTag"));

		parameters.put("Version", "2009-11-01");
		parameters.put("Operation", "ItemLookup");
		parameters.put("Condition", "All");
		parameters.put("IdType", "ASIN");
		parameters.put("ItemId", itemId);
		parameters.put("ResponseGroup", "OfferSummary");

		AmazonAPICallHelper aach = new AmazonAPICallHelper(System.getProperty("AWSSecretKey"));
		parameters.put("Timestamp", aach.getCurrentTimestamp());
		String urlx = aach.buildRequestWithSignature(parameters);
		System.out.println(urlx);

		// RestTemplate restTemplate = new RestTemplate();
		// restTemplate.setInterceptors(Collections.singletonList(new
		// XUserAgentInterceptor()));
		// String resp = restTemplate.getForObject(url, String.class);
		// System.out.println(resp);
		HttpURLConnection con = null;
		PrintStream ps = null;
		BufferedReader br = null;
		StringBuffer json = new StringBuffer();
		try {
			final int timeout = 3000;
			URL url = new URL(urlx);
			con = (HttpURLConnection) url.openConnection();

			if (con instanceof HttpsURLConnection) {
				HttpsURLConnection httpsCon = (HttpsURLConnection) con;
				httpsCon.setHostnameVerifier(new HostnameVerifier() {
					public boolean verify(String hostname, SSLSession session) {
						return true;
					}
				});
				// KeyManager[] km = null;
				// TrustManager[] tm = { new X509TrustManager() {
				// public void checkClientTrusted(X509Certificate[] arg0, String
				// arg1) throws CertificateException {
				// }
				// public void checkServerTrusted(X509Certificate[] arg0, String
				// arg1) throws CertificateException {
				// }
				// public java.security.cert.X509Certificate[]
				// getAcceptedIssuers() {
				// return null;
				// }
				// }
				// };
				// SSLContext sslcontext= SSLContext.getInstance("SSL");
				// sslcontext.init(km, tm, new SecureRandom());
				// httpsCon.setSSLSocketFactory(sslcontext.getSocketFactory());

			}
			con.setDoInput(true);
			con.setDoOutput(true);
			con.setConnectTimeout(timeout);
			con.setReadTimeout(timeout);
			con.setRequestMethod("GET");
			con.setUseCaches(false);
			con.setRequestProperty("Accept", "application/xml");
			con.setRequestProperty("Accept-Language", "ja");
			con.setRequestProperty("Content-Type", "application/x-www-form-urlencoded; charset=UTF-8");
			// con.setRequestProperty("Content-Length",
			// String.valueOf(postData.getBytes().length));
			// con.setFixedLengthStreamingMode(postData.getBytes().length);
			// con.setInstanceFollowRedirects(false);
			// con.setRequestProperty("Host", "akindo.wup.shop.nintendo.net");

			// con.setRequestProperty("Accept", "application/xml");
			// con.setRequestProperty("Connection", "Keep-Alive");
			// con.setRequestProperty(
			// "Authorization",
			// toBasicAuthorizationValue(
			// args.get(ExecIOArgs.TITLE_CODE.getName()),
			// System.getProperty(Constants.VM_ARGS_TIN.getName())));
			try {
				// unsent sction
				// ps = new PrintStream(con.getOutputStream());
				// ps.print(postData.toString());
				// ps.flush();
				// ps.close();
				br = new BufferedReader(new InputStreamReader(this.retrieveInputStream(con)));
			} catch (IOException ioe) {
				// unsent
				// handshake failed or TCP error
				// System.out.println
				// (CISECashUtil.createECUnsentErrorJson(ioe.getMessage()));
				// System.out.flush();
				ioe.printStackTrace();
				return null;
			}
			// httppost is done
			final int responseCode = con.getResponseCode();
			for (;;) {
				String line = br.readLine();
				if (line == null) {
					break;
				}
				json.append(line);
			}
			if (responseCode < HttpURLConnection.HTTP_BAD_REQUEST) {
				System.out.println(json.toString());
				return json.toString();
			} else {
				// if (json.indexOf("\"error\"") == -1){
				// //todo refactor
				// //unknown error
				// System.out.println
				// (CISECashUtil.createECTimeoutErrorJson(responseCode));
				// System.out.flush();
				// }
				// else {
				// System.out.println(json.toString());
				// System.out.flush();
				// }
			}
			return null;
		} catch (Exception e) {
			log.error("exception occurred : ",e);
			throw e;
		} finally {
			if (ps != null) {
				ps.close();
			}
			if (br != null) {
				br.close();
			}
			if (con != null) {
				con.disconnect();
			}
		}
	}

}