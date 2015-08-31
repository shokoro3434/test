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

import com.eitan.recall.rest.amazon.util.AmazonAPICallHelper;
import com.eitax.recall.amazon.rest.AmazonRestUtils;
import com.eitax.recall.amazon.rest.AmazonWebService;

@Component
public class AmazonWebServiceImpl implements AmazonWebService {
	private static final Logger log = LoggerFactory.getLogger(AmazonWebService.class);

	public String invokeItemSearch(String keywords, int tagPage) {
		HttpURLConnection con = null;
		PrintStream ps = null;
		BufferedReader br = null;

		try {
			Map<String, String> parameters = new HashMap<String, String>();

			parameters.put("Service", "AWSECommerceService");
			parameters.put("AWSAccessKeyId", System.getProperty("AWSAccessKeyId"));
			parameters.put("AssociateTag", System.getProperty("AssociateTag"));
			parameters.put("Version", "2009-11-01");

			parameters.put("Operation", "ItemSearch");
			parameters.put("SearchIndex", "All");
			parameters.put("Keywords", keywords);
			parameters.put("ItemPage", String.valueOf(tagPage));

			AmazonRestUtils aach = new AmazonRestUtils(System.getProperty("AWSSecretKey"));
			parameters.put("Timestamp", aach.getCurrentTimestamp());
			String urlx = aach.buildRequestWithSignature(parameters);

			// RestTemplate restTemplate = new RestTemplate();
			// restTemplate.setInterceptors(Collections.singletonList(new
			// XUserAgentInterceptor()));
			// String resp = restTemplate.getForObject(url, String.class);
			// System.out.println(resp);
			StringBuffer json = new StringBuffer();
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
				System.out.println(json.toString());
				return json.toString();
			} else {
				return json.toString();
			}
		} catch (Exception e) {
			log.error("exception occurred : ", e);
			return null;
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
				}

			}
			if (con != null) {
				con.disconnect();
			}
		}
	}

	public String invokeItemLookup(String itemId) {
		HttpURLConnection con = null;
		PrintStream ps = null;
		BufferedReader br = null;
		StringBuffer json = new StringBuffer();
		try {
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

			// RestTemplate restTemplate = new RestTemplate();
			// restTemplate.setInterceptors(Collections.singletonList(new
			// XUserAgentInterceptor()));
			// String resp = restTemplate.getForObject(url, String.class);
			// System.out.println(resp);
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
			log.error("exception occurred : ", e);
			return null;
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
			// error found
			InputStream is = con.getErrorStream();
			if (is != null) {
				return is;
			}
			throw ioe;
		}
	}

}
