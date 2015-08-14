package com.eitan.recall.model;

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
@Table(name = "AMAZON_ITEM_ID", schema="recall")
public class AmazonItem {

    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="T_AMAZON_ITEM_SEQ") 
    @SequenceGenerator(name="T_AMAZON_ITEM_SEQ", sequenceName="recall.T_AMAZON_ITEM_SEQ" ,allocationSize=1)
    @Column(name = "AMAZON_ITEM_ID")
    private Integer amazonItemId;
    @Column(name = "ASIN")
	private String asin;
    @Column(name = "DETAIL_PAGE_URL")
	private String detailPageUrl;
    @Column(name = "MANUFACTURER")
	private String manufacturer;
    @Column(name = "TITLE")
	private String TITLE;
    @Column(name = "ISBN")
	private String isbn;

}
