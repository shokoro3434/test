package com.eitax.recall.ebay.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "T_EBAY_API_CALL", schema="RECALL")
public class EbayApiCall {
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="T_EBAY_API_CALL_SEQ") 
    @SequenceGenerator(name="T_EBAY_API_CALL_SEQ", sequenceName="RECALL.T_EBAY_API_CALL_SEQ" ,allocationSize=1)
    @Column(name = "EBAY_API_CALL_ID")
    private Integer ebayApiCallId;

    @OneToOne
    @JoinColumn(name="ebay_Api_Id", referencedColumnName = "ebay_Api_Id")
    private EbayApi ebayApi;
    
//    @Column(name = "EBAY_API_ID")
//	private Integer ebayApiId;
    @Column(name = "YYYYMMDD")
	private String yyyymmdd;
    @Column(name = "CNT")
	private Integer cnt;
    @Column(name = "del_flag")
	private Integer delFlag;
//    @Column(name = "CREATED")
//    private String created;
    @Column(name = "UPDATED")
    private String updated;
}
