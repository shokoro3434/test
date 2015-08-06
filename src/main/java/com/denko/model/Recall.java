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
import lombok.ToString;

@ToString
@Entity
@Table(name = "t_recall", schema="recall")
public class Recall {
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="t_RECALL_SEQ")
    @SequenceGenerator(name="t_RECALL_SEQ", allocationSize=25)
    @Column(name = "recall_id")
    @Getter
    @Setter
    private Long recallId;
    @Column(name = "recall_name")
    @Getter
    @Setter
	private String recallName;
    @Column(name = "opened")
    @Getter
    @Setter
	private String opemed;
    @Column(name = "maker_id")
    @Getter
    @Setter
	private Long makerId;
    @Column(name = "countermeasures_id")
    @Getter
    @Setter
	private Long countermeasuresId;
    @Column(name = "del_flag")
    @Getter
    @Setter
	private Long delFlag;
}
