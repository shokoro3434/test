package com.denko.di;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "recall", schema="admin")
public class Recall {
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="RECALL_SEQ")
    @SequenceGenerator(name="RECALL_SEQ", allocationSize=25)
    @Column(name = "recall_id")
    private Integer recallId;
    @Column(name = "recall_name")
	private String recallName;

    public Integer getRecallId() {
		return recallId;
	}
	public void setRecallId(Integer recallId) {
		this.recallId = recallId;
	}
	public String getRecallName() {
		return recallName;
	}
	public void setRecallName(String recallName) {
		this.recallName = recallName;
	}

    
}
