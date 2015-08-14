package com.eitan.recall.boot;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.io.StringReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSession;
import javax.xml.bind.JAXB;

import org.joda.time.DateTime;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.http.client.ClientHttpResponse;
import org.springframework.stereotype.Component;
import org.springframework.web.client.DefaultResponseErrorHandler;
import org.springframework.web.client.HttpServerErrorException;
import org.springframework.web.client.ResponseErrorHandler;
import org.springframework.web.client.RestTemplate;

import com.eitan.recall.model.Category;
import com.eitan.recall.rest.amazon.xsd.ItemSearchResponse;
import com.eitan.recall.rest.yahoo.auction.category.ChildCategory;
import com.eitan.recall.rest.yahoo.auction.category.Result;
import com.eitan.recall.rest.yahoo.auction.category.ResultSet;
import com.eitan.recall.service.RecallService;
import com.eitan.recall.service.YahooCategoryService;

@SpringBootApplication
@ComponentScan(basePackages={"com.eitan.recall.rest.amazon.itemsearch"})
//@ComponentScan(basePackages = "com.eitan.recall.service")
@EnableJpaRepositories(basePackages = "com.eitan.recall.repository")
@EntityScan(basePackages = "com.eitan.recall.model")
public class ItemSearchClient {
	// @Autowired
	// private YahooCategoryService yahooCategoryService;
	private static final Logger log = LoggerFactory.getLogger(ItemSearchClient.class);
    public static void main(String[] args) throws Exception {
        SpringApplication.run(ItemSearchClient.class);
    }
}
