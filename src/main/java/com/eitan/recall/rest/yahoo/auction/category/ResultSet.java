package com.eitan.recall.rest.yahoo.auction.category;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "ResultSet", namespace = "urn:yahoo:jp:auc:categoryTree")
@Data
public class ResultSet {
	@XmlAttribute
	private Integer firstResultPosition;
	@XmlAttribute
	private Integer totalResultsReturned;
	@XmlAttribute
	private Integer totalResultsAvailable;
	@XmlElement(name="Result",namespace="urn:yahoo:jp:auc:categoryTree")
	private Result result;
}

