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
@Table(name = "T_AMAZON_ITEM_DETAIL", schema="recall")
public class AmazonItemDetail {
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="T_AMAZON_ITEM_DETAIL_SEQ") 
    @SequenceGenerator(name="T_AMAZON_ITEM_DETAIL_SEQ", sequenceName="recall.T_AMAZON_ITEM_DETAIL_SEQ" ,allocationSize=1)
    @Column(name = "AMAZON_ITEM_DETAIL_ID")
    private Integer amazonItemDetailId;
    @Column(name = "AMAZON_ITEM_ID")
	private Integer amazonItemId;
    @Column(name = "NEW_AMOUNT")
	private Integer newAmount;
    @Column(name = "USED_AMOUNT")
	private Integer usedAmount;
    @Column(name = "CURRENCY_CODE")
	private Integer currencyCode;
    @Column(name = "TOTAL_NEW")
	private Integer totalNew;
    @Column(name = "TOTAL_USED")
	private Integer totalUsed;
}
