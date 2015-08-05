package com.denko.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "t_recall", schema="recall")
public class Recall {
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="t_RECALL_SEQ")
    @SequenceGenerator(name="t_RECALL_SEQ", allocationSize=25)
    @Column(name = "recall_id")
    private Long recallId;
    @Column(name = "recall_name")
	private String recallName;
    @Column(name = "opened")
	private String opemed;
    @Column(name = "maker_id")
	private Long makerId;
    @Column(name = "countermeasures_id")
	private Long countermeasuresId;
    @Column(name = "del_flag")
    @Getter
    @Setter
	private Long delFlag;

	public Long getRecallId() {
		return recallId;
	}
	public void setRecallId(Long recallId) {
		this.recallId = recallId;
	}
	public String getRecallName() {
		return recallName;
	}
	public void setRecallName(String recallName) {
		this.recallName = recallName;
	}
	public String getOpemed() {
		return opemed;
	}
	public void setOpemed(String opemed) {
		this.opemed = opemed;
	}
	public Long getMakerId() {
		return makerId;
	}
	public void setMakerId(Long makerId) {
		this.makerId = makerId;
	}
	public Long getCountermeasuresId() {
		return countermeasuresId;
	}
	public void setCountermeasuresId(Long countermeasuresId) {
		this.countermeasuresId = countermeasuresId;
	}

    
}
