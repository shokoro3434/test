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
@Table(name = "m_category", schema="recall")
public class Category {
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="M_CATEGORY_SEQ") 
    @SequenceGenerator(name="M_CATEGORY_SEQ", sequenceName="recall.M_CATEGORY_SEQ" ,allocationSize=1)
    @Column(name = "category_id")
    private Integer categoryId;
    @Column(name = "CATEGORY_NAME")
	private String categoryName;
    @Column(name = "CATEGORY_PATH")
	private String categoryPath;
    @Column(name = "NUM_OF_AUCTIONS")
    private Integer numOfAuctions;
    @Column(name = "PARENT_CATEGORY_ID")
    private Integer parentCategoryId;
    @Column(name = "IS_LEAF")
    private Integer isLeaf;
    @Column(name = "DEPTH")
    private Integer depth;
    @Column(name = "IDX")
    private Integer idx;
    @Column(name = "IS_LINK")
    private Integer isLink;
    @Column(name = "IS_ADULT")
    private Integer isAdult;
    @Column(name = "IS_LEAF_TO_LINK")
    private Integer isLeafToLink;
    @Column(name = "Y_CATEGORY_ID")
    private Integer yCategoryId;
    

}
