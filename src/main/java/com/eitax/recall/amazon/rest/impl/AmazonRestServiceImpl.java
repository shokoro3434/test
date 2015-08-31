package com.eitax.recall.amazon.rest.impl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.eitax.recall.amazon.rest.AmazonRestUtils;
import com.eitax.recall.amazon.rest.AmazonRestUtils2;
import com.eitax.recall.amazon.xsd.ItemLookupResponse;
import com.eitax.recall.amazon.xsd.ItemSearchResponse;
import com.eitax.recall.amazon.rest.AmazonRestService;

@Component
public class AmazonRestServiceImpl implements AmazonRestService {
	private static final Logger log = LoggerFactory.getLogger(AmazonRestService.class);

	public ItemSearchResponse invokeItemSearch(String keywords, int tagPage,String aWSAccessKeyId,String aWSSecretKey,String associateTag,int delay,String userAgent) throws IOException{
		HttpURLConnection con = null;
		PrintStream ps = null;
		BufferedReader br = null;

		try {
			Map<String, String> parameters = new HashMap<String, String>();

			parameters.put("Service", "AWSECommerceService");
			parameters.put("AWSAccessKeyId", aWSAccessKeyId);
			parameters.put("AssociateTag", associateTag);
			parameters.put("Version", "2009-11-01");

			parameters.put("Operation", "ItemSearch");
			parameters.put("SearchIndex", "All");
			parameters.put("Keywords", keywords);
			parameters.put("ItemPage", String.valueOf(tagPage));

			AmazonRestUtils aach = new AmazonRestUtils(aWSSecretKey);
			parameters.put("Timestamp", aach.getCurrentTimestamp());
			String urlx = aach.buildRequestWithSignature(parameters);

			// RestTemplate restTemplate = new RestTemplate();
			// restTemplate.setInterceptors(Collections.singletonList(new
			// XUserAgentInterceptor()));
			// String resp = restTemplate.getForObject(url, String.class);
			// System.out.println(resp);
			StringBuffer json = new StringBuffer();
			final int timeout = 30000;
			URL url = new URL(urlx);
			con = (HttpURLConnection) url.openConnection();

			if (con instanceof HttpsURLConnection) {
				HttpsURLConnection httpsCon = (HttpsURLConnection) con;
				httpsCon.setHostnameVerifier(new HostnameVerifier() {
					public boolean verify(String hostname, SSLSession session) {
						return true;
					}
				});
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
			con.setRequestProperty("User-Agent", userAgent);
			try {
				br = new BufferedReader(new InputStreamReader(this.retrieveInputStream(con)));
			} catch (IOException ioe) {
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
				log.info(json.toString());
				return AmazonRestUtils2.unmarshal(json.toString(), ItemSearchResponse.class);
			} else {
				log.error(json.toString());
				throw new IOException (json.toString());
			}
		} catch (IOException e) {
			log.error("exception occurred : ", e);
			throw e;
		} finally {
			if (ps != null) {
				ps.close();
			}
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					throw e;
				}

			}
			if (con != null) {
				con.disconnect();
			}
			try {
				Thread.sleep(delay);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public ItemLookupResponse invokeItemLookup(String itemId,String aWSAccessKeyId,String aWSSecretKey,String associateTag,int delay,String userAgent)  throws IOException{
		HttpURLConnection con = null;
		PrintStream ps = null;
		BufferedReader br = null;
		StringBuffer json = new StringBuffer();
		try {
			Map<String, String> parameters = new HashMap<String, String>();

			parameters.put("Service", "AWSECommerceService");
			parameters.put("AWSAccessKeyId", aWSAccessKeyId);
			parameters.put("AssociateTag", associateTag);

			parameters.put("Version", "2009-11-01");
			parameters.put("Operation", "ItemLookup");
			parameters.put("Condition", "All");
			parameters.put("IdType", "ASIN");
			parameters.put("ItemId", itemId);
			parameters.put("ResponseGroup", "OfferSummary");

			AmazonRestUtils aach = new AmazonRestUtils(aWSSecretKey);
			parameters.put("Timestamp", aach.getCurrentTimestamp());
			String urlx = aach.buildRequestWithSignature(parameters);

			// RestTemplate restTemplate = new RestTemplate();
			// restTemplate.setInterceptors(Collections.singletonList(new
			// XUserAgentInterceptor()));
			// String resp = restTemplate.getForObject(url, String.class);
			// System.out.println(resp);
			final int timeout = 30000;
			URL url = new URL(urlx);
			con = (HttpURLConnection) url.openConnection();

			if (con instanceof HttpsURLConnection) {
				HttpsURLConnection httpsCon = (HttpsURLConnection) con;
				httpsCon.setHostnameVerifier(new HostnameVerifier() {
					public boolean verify(String hostname, SSLSession session) {
						return true;
					}
				});
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
			con.setRequestProperty("User-Agent", userAgent);
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
				throw ioe;
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
				log.info(json.toString());
				return AmazonRestUtils2.unmarshal(json.toString(), ItemLookupResponse.class);
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
				throw new IOException (json.toString());
			}
		} catch (IOException e) {
			log.error("exception occurred : ", e);
			throw e;
		} finally {
			if (ps != null) {
				ps.close();
			}
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					throw e;
				}
			}
			if (con != null) {
				con.disconnect();
			}
			try {
				Thread.sleep(delay);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

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

	@Override
	public int retrieveItemCount(String keywords, int tagPage, String aWSAccessKeyId, String aWSSecretKey,
			String associateTag,int delay,String userAgent) throws IOException{
		ItemSearchResponse isr = invokeItemSearch(keywords,tagPage,aWSAccessKeyId,aWSSecretKey,associateTag,delay,userAgent);
		if (isr.getItems().size() <= 0){
    		return 0;
		}
		final int LIMIT = 5;
		return LIMIT <= isr.getItems().get(0).getTotalPages().intValue() ? LIMIT : isr.getItems().get(0).getTotalPages().intValue();
	}

}
