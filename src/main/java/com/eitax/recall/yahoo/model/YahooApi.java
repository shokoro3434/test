package com.eitax.recall.yahoo.model;

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
@Table(name = "M_YAHOO_API", schema="RECALL")
public class YahooApi {
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="M_YAHOO_API_SEQ") 
    @SequenceGenerator(name="M_YAHOO_API_SEQ", sequenceName="RECALL.M_YAHOO_API_SEQ" ,allocationSize=1)
    @Column(name = "YAHOO_API_ID")
    private Integer yahooApiId;
    @Column(name = "APPID")
	private String appid;
    @Column(name = "EMAIL")
	private String email;
    @Column(name = "del_flag")
	private Integer delFlag;
    @Column(name = "delay")
	private Integer delay;
    @Column(name = "user_agent")
	private String userAgent;
    @Column(name = "timeout")
	private Integer timeout;

}
