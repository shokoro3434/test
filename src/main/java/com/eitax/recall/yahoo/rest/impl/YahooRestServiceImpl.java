package com.eitax.recall.yahoo.rest.impl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.eitan.recall.util.RecallUtils;
import com.eitax.recall.yahoo.rest.YahooRestService;

import net.sf.json.JSONObject;

@Component
public class YahooRestServiceImpl implements YahooRestService {

	private static final Logger log = LoggerFactory.getLogger(YahooRestServiceImpl.class);

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
	public String invokeAuctionSearch(String appid, String query, int page, int delay, String userAgent, int timeout)
			throws IOException {
		StringBuffer sb = new StringBuffer();
		sb.append("http://auctions.yahooapis.jp/AuctionWebService/V2/search");
		sb.append("?");
		sb.append("appid=");
		sb.append(appid);
		sb.append("&");
		sb.append("output=json");
		sb.append("&");
		sb.append("query=");
		sb.append(URLEncoder.encode(query, "utf-8"));
		sb.append("&");
		sb.append("sort=end");
		sb.append("&");
		sb.append("order=a");
		sb.append("&");
		sb.append("page=");
		sb.append(page);
		sb.append("&");
		// sb.append("store=");
		// sb.append(2);
		sb.append("&");
		sb.append("ranking=");
		sb.append("current");
		String jsonp = this.perform(sb.toString(), delay, userAgent, timeout);
		return RecallUtils.toJson(jsonp);
	}

	@Override
	public String invokeAuctionItemSearch(String appid,String auctionId, int delay, String userAgent, int timeout)
			throws IOException {
		StringBuffer sb = new StringBuffer ();
		sb.append("http://auctions.yahooapis.jp/AuctionWebService/V2/auctionItem");
		sb.append("?");
		sb.append("appid=");
		sb.append(appid);
		sb.append("&");
		sb.append("output=json"); 
		sb.append("&");
		sb.append("auctionID=");
		sb.append(auctionId);
		String jsonp = this.perform(sb.toString(),delay,userAgent,timeout);
		return RecallUtils.toJson(jsonp);
	}

	@Override
	public int retrieveAuctionSearchCount(String appid, String query, int page, int delay, String userAgent,
			int timeout) throws IOException {
		String json = invokeAuctionSearch(appid, query, page, delay, userAgent, timeout);
		JSONObject root = JSONObject.fromObject(json);
		JSONObject resultSet = root.getJSONObject("ResultSet");
		JSONObject attributes = resultSet.getJSONObject("@attributes");
		Long available = attributes.getLong("totalResultsAvailable");
		int p = (int) Long.divideUnsigned(available, 20);
		return p;
	}
	private String perform(String urlAsString, int delay,String userAgent,int timeout) throws IOException {
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
			con.setRequestProperty("Accept", "application/json");
			con.setRequestProperty("User-Agent", userAgent);
//			con.setRequestProperty("Accept", "application/json;odata=nometadata");
//			con.setRequestProperty("DataServiceVersion", "3.0;NetFx");
//			con.setRequestProperty("MaxDataServiceVersion", "3.0;NetFx");
//			SimpleDateFormat fmt = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss", Locale.US);
//			fmt.setTimeZone(TimeZone.getTimeZone("GMT"));
//			String date = fmt.format(Calendar.getInstance().getTime()) + " GMT";
//			con.setRequestProperty("x-ms-date", date);
			try {
				br = new BufferedReader(new InputStreamReader(this.retrieveInputStream(con)));

			} catch (IOException ioe) {
				// handshake failed,timeout
				log.error( "HTTPS connection failed", ioe);
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
				log.error("HTTPS response code failed: {0},response-json: {1}",new Object[]{String.valueOf(responseCode),json.toString()});
				throw new IOException("HTTPS response code failed: " + String.valueOf(responseCode));
			} else {
				// no error found
//				String nextPartitionKeyToken = con.getHeaderField("x-ms-continuation-NextPartitionKey");
//				String nextRowKeyToken = con.getHeaderField("x-ms-continuation-NextRowKey");
				log.info(json.toString());
//				LogMF.info(logger, "json: {0}",json.toString());
//				return createAzureStorageResponse(nextPartitionKeyToken, nextRowKeyToken, json.toString());
				return json.toString();
			}
		} catch (IOException e) {
			log.error( "IOException occurred: " ,e);
			throw e;
		} 
		finally {
			if (br != null) {
				try{
					br.close();
				}
				catch(IOException e){
					log.error( "IOException occurred: " ,e);
					throw e;
				}
			}
			if (con != null) {
				con.disconnect();
			}
			try {
				Thread.sleep(delay);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
