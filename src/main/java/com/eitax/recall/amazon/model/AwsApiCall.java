package com.eitax.recall.amazon.model;

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
@Table(name = "T_AWS_API_CALL", schema="RECALL")
public class AwsApiCall {
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="T_AWS_API_CALL_SEQ") 
    @SequenceGenerator(name="T_AWS_API_CALL_SEQ", sequenceName="RECALL.T_AWS_API_CALL_SEQ" ,allocationSize=1)
    @Column(name = "AWS_API_CALL_ID")
    private Integer awsApiCallId;

    @OneToOne
    @JoinColumn(name="AWS_API_ID", referencedColumnName = "AWS_API_ID")
    private AwsApi awsApi;
    
//    @Column(name = "AWS_API_ID")
//	private Integer awsApiId;
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
