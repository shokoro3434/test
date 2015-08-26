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
@Table(name = "M_EBAY_SITE", schema="RECALL")
public class EbaySite {
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="M_EBAY_SITE_SEQ") 
    @SequenceGenerator(name="M_EBAY_SITE_SEQ", sequenceName="RECALL.M_EBAY_SITE_SEQ" ,allocationSize=1)
    @Column(name = "EBAY_SITE_ID")
    private Integer ebaySiteId;
    @Column(name = "GLOBAL_ID")
	private String globalId;
    @Column(name = "del_flag")
	private Integer delFlag;
}
