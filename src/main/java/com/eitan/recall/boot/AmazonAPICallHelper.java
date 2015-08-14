package com.eitan.recall.boot;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.SortedMap;
import java.util.TimeZone;
import java.util.TreeMap;
 
import org.apache.commons.codec.binary.Base64;
 
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
/**
 * Amazon Product Advertising APIの呼び出しをサポートする機能を提供します。
 *
 * @author Masashi Kutsuna
 */
public class AmazonAPICallHelper {
        private static final String HMAC_SHA256_ALGORITHM = "HmacSHA256";
        private static final String CHARSET = "UTF-8";
        private static final String REQUEST_METHOD = "GET";
        private static final String REQUEST_URI = "/onca/xml";
       
        private String endpoint = "webservices.amazon.co.jp";//webservices.amazon.com";
        private SecretKeySpec secretKeySpec = null;
        private Mac mac = null;
       
        /**
         * コンストラクタ
         * @throws UnsupportedEncodingException
         * @throws NoSuchAlgorithmException
         * @throws InvalidKeyException
         */
        public AmazonAPICallHelper(String dAWSSecretKey) throws UnsupportedEncodingException, NoSuchAlgorithmException, InvalidKeyException {
                byte[] secretyKeyBytes = dAWSSecretKey.getBytes(CHARSET);
                secretKeySpec = new SecretKeySpec(secretyKeyBytes, HMAC_SHA256_ALGORITHM);
                mac = Mac.getInstance(HMAC_SHA256_ALGORITHM);
                mac.init(secretKeySpec);
        }
 
        /**
         * シグネチャ付きリクエストを作成します。
         *
         * @param parameters
         * @return
         */
        public String buildRequestWithSignature(Map<String, String> parameters) {
               
//                parameters.put("AWSAccessKeyId", "xxx"); // TODO アクセスキーIDを設定ください.
//                parameters.put("AssociateTag", "xxx"); // TODO アソシエイトタグを設定ください.
//                parameters.put("Timestamp", getCurrentTimestamp());
 
                SortedMap<String, String> sortedParamMap = new TreeMap<String, String>(parameters);
                String query = buildRequestParameter(sortedParamMap);
                String toSignString = REQUEST_METHOD + "\n" + endpoint + "\n" + REQUEST_URI + "\n" + query;
 
                String hmac = encrypt(toSignString);
                String signature = encode(hmac);
                String urlRequest = "http://" + endpoint + REQUEST_URI + "?" + query + "&Signature=" + signature;
               
                return urlRequest;
        }
 
        /**
         * 指定フォーマットに従ったタイムスタンプを取得します。
         * @return
         */
        public String getCurrentTimestamp() {
                DateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");
                dateFormatter.setTimeZone(TimeZone.getTimeZone("GMT"));
                return dateFormatter.format(Calendar.getInstance().getTime());
        }
       
        /**
         * リクエストパラメータを作成する。
         *
         * @param sortedParamMap
         * @return
         */
        private String buildRequestParameter(SortedMap<String, String> sortedParamMap) {
 
                StringBuilder builder = new StringBuilder();
                Iterator<Map.Entry<String, String>> iterator = sortedParamMap.entrySet().iterator();
 
                while (iterator.hasNext()) {
                        Map.Entry<String, String> parameter = iterator.next();
                        builder
                                .append(encode(parameter.getKey()))
                                .append("=").append(encode(parameter.getValue()));
                        if (iterator.hasNext()) {
                                builder.append("&");
                        }
                }
               
                return builder.toString();
        }
       
        /**
         * URLエンコードを行ないます。
         *
         * @param value URLエンコード対象文字列
         * @return
         */
        private String encode(String value) {
                String out;
                try {
                        out = URLEncoder.encode(value, CHARSET).replace("+", "%20")
                                        .replace("*", "%2A").replace("%7E", "~");
                } catch (UnsupportedEncodingException e) {
                        out = value;
                }
                return out;
        }
 
        /**
         * HmacSHA256で認証用文字列を暗号化します。
         *
         * @param stringToSign 認証用文字列
         * @return
         */
        private String encrypt(String stringToSign) {
                String signature = null;
                byte[] data;
                byte[] rawHmac;
               
                try {
                        data = stringToSign.getBytes(CHARSET);
                        rawHmac = mac.doFinal(data);
                        Base64 encoder = new Base64();
                        signature = new String(encoder.encode(rawHmac));
                } catch (UnsupportedEncodingException e) {
                        throw new RuntimeException(CHARSET + " is unsupported!", e);
                }
                return signature;
        }
}
