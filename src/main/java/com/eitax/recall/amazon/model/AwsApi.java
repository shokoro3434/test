package com.eitax.recall.amazon.model;

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
@Table(name = "M_AWS_API", schema="recall")
public class AwsApi {
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="M_AWS_API_SEQ") 
    @SequenceGenerator(name="M_AWS_API_SEQ", sequenceName="recall.M_AWS_API_SEQ" ,allocationSize=1)
    @Column(name = "AWS_API_ID")
    private Integer aWSApiId;
    @Column(name = "AWS_ACCESSKEY_ID")
	private String awsAccesskeyId;
    @Column(name = "AWS_SECRETKEY")
	private String awsSecretkey;
    @Column(name = "ASSOCIATE_TAG")
	private String associateTag;
    @Column(name = "DELAY")
	private Integer delay;
    @Column(name = "USER_AGENT")
	private String userAgent;
}
