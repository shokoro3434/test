package com.eitax.recall.model;

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
@Table(name = "t_recall", schema="recall")
public class Recall {
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="t_RECALL_SEQ") 
    @SequenceGenerator(name="t_RECALL_SEQ", sequenceName="recall.t_RECALL_SEQ" ,allocationSize=1)
    @Column(name = "recall_id")
    private Integer recallId;
    @Column(name = "recall_name")
	private String recallName;
    @Column(name = "opened")
	private String opemed;
    @Column(name = "maker_id")
	private Integer makerId;
    @Column(name = "countermeasures_id")
	private Integer countermeasuresId;
    @Column(name = "del_flag")
	private Integer delFlag;
    @Column(name = "ebay_flag")
	private Integer ebayFlag;
}
