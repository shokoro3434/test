package com.eitan.recall.rest.yahoo.auction.category;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "ChildCategory", namespace = "urn:yahoo:jp:auc:categoryTree")
@Data
public class ChildCategory {
	@XmlElement(name="CategoryId",namespace="urn:yahoo:jp:auc:categoryTree")
	private Integer categoryId;
	@XmlElement(name="CategoryName",namespace="urn:yahoo:jp:auc:categoryTree")
	private String categoryName;
	@XmlElement(name="CategoryPath",namespace="urn:yahoo:jp:auc:categoryTree")
	private String categoryPath;
	@XmlElement(name="NumOfAuctions",namespace="urn:yahoo:jp:auc:categoryTree")
	private Integer numOfAuctions;
	@XmlElement(name="ParentCategoryId",namespace="urn:yahoo:jp:auc:categoryTree")
	private Integer parentCategoryId;
	@XmlElement(name="IsLeaf",namespace="urn:yahoo:jp:auc:categoryTree")
	private Boolean isLeaf;
	@XmlElement(name="Depth",namespace="urn:yahoo:jp:auc:categoryTree")
	private Integer depth;
	@XmlElement(name="Order",namespace="urn:yahoo:jp:auc:categoryTree")
	private Integer order;
	@XmlElement(name="IsLink",namespace="urn:yahoo:jp:auc:categoryTree")
	private Boolean isLink;
}
