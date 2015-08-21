package com.eitan.recall.model;

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
@Table(name = "T_YAHOO_API_CALL", schema="RECALL")
public class YahooApiCall {
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="T_YAHOO_API_CALL_SEQ") 
    @SequenceGenerator(name="T_YAHOO_API_CALL_SEQ", sequenceName="RECALL.T_YAHOO_API_CALL_SEQ" ,allocationSize=1)
    @Column(name = "YAHOO_API_CALL_ID")
    private Integer yahooApiCallId;

    @OneToOne
    @JoinColumn(name="yahoo_Api_Id", referencedColumnName = "yahoo_Api_Id")
    private YahooApi yahooApi;
    
//    @Column(name = "YAHOO_API_ID")
//	private Integer yahooApiId;
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
