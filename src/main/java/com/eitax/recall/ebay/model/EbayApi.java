package com.eitax.recall.ebay.model;

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
@Table(name = "M_EBAY_API", schema="RECALL")
public class EbayApi {
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="M_EBAY_API_SEQ") 
    @SequenceGenerator(name="M_EBAY_API_SEQ", sequenceName="RECALL.M_EBAY_API_SEQ" ,allocationSize=1)
    @Column(name = "EBAY_API_ID")
    private Integer ebayApiId;
    @Column(name = "APPID")
	private String appid;
    @Column(name = "del_flag")
	private Integer delFlag;
}
