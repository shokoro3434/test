package com.eitax.recall.ebay.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "T_EBAY_ITEM", schema="RECALL")
public class EbayItem {
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="T_EBAY_ITEM_SEQ") 
    @SequenceGenerator(name="T_EBAY_ITEM_SEQ", sequenceName="RECALL.T_EBAY_ITEM_SEQ" ,allocationSize=1)
    @Column(name = "EBAY_ITEM_ID")
    private Integer ebayItemId;
    @Column(name = "ITEM_ID")
    private String itemId;
    @Column(name = "TITLE")
    private String title;
    @Column(name = "GLOBAL_ID")
    private String globalId;
    @Column(name = "CATEGORY_ID")
    private String categoryId;
    @Column(name = "VIEW_ITEM_URL")
    private String viewItemUrl;
    @Column(name = "PAYMENT_METHOD")
    private String paymentMethod;
    @Column(name = "POSTAL_CODE")
    private String postalCode;
    @Column(name = "LOCATION")
    private String location;
    @Column(name = "SHIPPING_SERVICE_COST")
    private Double shippingServiceCost;
    @Column(name = "SHIPPING_TYPE")
    private String shippingType;
    @Column(name = "SHIP_TO_LOCATIONS")
    private String shipToLocations;
    @Column(name = "CONVERTED_CURRENT_PRICE")
    private Double convertedCurrentPrice;
    @Column(name = "CURRENCY_ID")
    private String currencyId;
    @Column(name = "START_TIME")
    private Date startTime;
    @Column(name = "END_TIME")
    private Date endTime;
    @Column(name = "RECALL_ID")
    private Integer recallId;
}