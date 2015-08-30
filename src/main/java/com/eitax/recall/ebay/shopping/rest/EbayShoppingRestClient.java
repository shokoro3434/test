package com.eitax.recall.ebay.shopping.rest;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;

import org.apache.log4j.LogMF;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import com.eitan.recall.util.RecallUtils;

import net.sf.json.JSONArray;

//import org.apache.log4j.LogMF;
//
//import com.mcdonalds.bdh.CRMApiClient;
//import com.mcdonalds.bdh.CRMUtils;
//import com.mcdonalds.bdh.CRMApiClient.RequierdProperty;
//import com.mcdonalds.bdh.CRMApiClient.VMobAPIProperties;

public class EbayShoppingRestClient {

	private static final Logger logger = LogManager.getLogger(EbayShoppingRestClient.class);

	private EbayShoppingRestClient(){
		
	}
	
	public static String invoke (String appid,String keywords) throws Exception{
		try {
			EbayShoppingRestClient client = new EbayShoppingRestClient();
			StringBuffer sb = new StringBuffer ();
			sb.append("http://svcs.ebay.com/services/search/FindingService/v1");
			sb.append("?");
			sb.append("OPERATION-NAME=findItemsByKeywords");
			sb.append("&");
			sb.append("SERVICE-VERSION=1.13.0");
			sb.append("&");
			sb.append("SECURITY-APPNAME="+appid);
			sb.append("&");
			sb.append("RESPONSE-DATA-FORMAT=XML");
			sb.append("&");
			sb.append("keywords="+URLEncoder.encode(keywords,"utf-8"));
			System.out.println(sb.toString());
			String resp = client.perform(sb.toString(), 30000);
			return resp;
//			if (!client.validate(RequierdProperty.values(), System.getProperties())){
//				throw new IllegalArgumentException();
//			}
			// connection phase
//			List<byte []> binaryList = client.retrieveConsumers(
//			createURLAsString(vmob.getAzureEndpoint(), vmob.getAzureSV(), vmob.getAzureTN(),
//					vmob.getAzureSIG(), vmob.getAzureSE(), vmob.getAzureSP(), vmob.getAzureFilter(),
//					vmob.getAzureTop()), Integer.valueOf(vmob.getTimeout()));
//			
//			JSONArray value = (JSONArray)CRMUtils.uncompress(binaryList.get(0));
//			if (value.size() <= 0) {
//				logger.warn("no data found");
//			}
//
//			logger.info( "HTTPS connection phase has been successfully.");
//			// output phase
//			int wc = client.createTSVFile(binaryList, tsv);
//			LogMF.info(logger, "TSV output phase has been successfully.<<wc: {0}>>", String.valueOf(wc));
		} catch (Exception e) {
//			logger.error( "critical error occurred.", e);
			throw e;
		}
		
	}
	private String perform(String urlAsString, int timeout) throws IOException {
		HttpURLConnection con = null;
		BufferedReader br = null;
		try {
			URL url = new URL(urlAsString);
			con = (HttpURLConnection) url.openConnection();
			con.setDoInput(true);
			// con.setDoOutput(true); POST
			con.setConnectTimeout(timeout);
			con.setReadTimeout(timeout);
			con.setRequestMethod("GET");
			con.setUseCaches(false);
//			con.setRequestProperty("Accept", "application/json;odata=fullmetadata");
//			con.setRequestProperty("Accept", "application/json;odata=nometadata");
//			con.setRequestProperty("DataServiceVersion", "3.0;NetFx");
//			con.setRequestProperty("MaxDataServiceVersion", "3.0;NetFx");
//			con.setRequestProperty("User-Agent", "");
//			SimpleDateFormat fmt = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss", Locale.US);
//			fmt.setTimeZone(TimeZone.getTimeZone("GMT"));
//			String date = fmt.format(Calendar.getInstance().getTime()) + " GMT";
//			con.setRequestProperty("x-ms-date", date);
			try {
				br = new BufferedReader(new InputStreamReader(this.retrieveInputStream(con)));

			} catch (IOException ioe) {
				// handshake failed,timeout
				logger.error( "HTTPS connection failed", ioe);
				throw ioe;
			}

			final int responseCode = con.getResponseCode();
			StringBuffer json = new StringBuffer();
			for (;;) {
	            String line = br.readLine();
				if (line == null) {
					break;
				}
				json.append(line);
			}
			if (responseCode != HttpURLConnection.HTTP_OK) {
				if (responseCode == 503){
					try {
						Thread.sleep(10000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					perform(urlAsString,timeout);
				}
				LogMF.error(logger, "HTTPS response code failed: {0},response-json: {1}",new Object[]{String.valueOf(responseCode),json.toString()});
				throw new IOException("HTTPS response code failed: " + String.valueOf(responseCode));
			} else {
				// no error found
//				String nextPartitionKeyToken = con.getHeaderField("x-ms-continuation-NextPartitionKey");
//				String nextRowKeyToken = con.getHeaderField("x-ms-continuation-NextRowKey");
				System.out.println(json.toString());
//				LogMF.info(logger, "json: {0}",json.toString());
//				return createAzureStorageResponse(nextPartitionKeyToken, nextRowKeyToken, json.toString());
				return json.toString();
			}
		} catch (IOException e) {
			logger.error( "IOException occurred: " ,e);
			throw e;
		} 
		finally {
			if (br != null) {
				try{
					br.close();
				}
				catch(IOException e){
					logger.error( "IOException occurred: " ,e);
					throw e;
				}
			}
			if (con != null) {
				con.disconnect();
			}
		}
	}
	private InputStream retrieveInputStream(HttpURLConnection con) throws IOException {
		try {
			return con.getInputStream();
		} catch (IOException ioe) {
			InputStream is = con.getErrorStream();// dead lock avoidance
			if (is != null) {
				return is;
			}
			throw ioe;
		}
	}

}
