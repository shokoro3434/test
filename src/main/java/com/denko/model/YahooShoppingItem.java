package com.denko.model;

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
@Table(name = "t_yahoo_shopping_item", schema="recall")
public class YahooShoppingItem {
    @Id 
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="t_yahoo_shopping_item_seq") 
    @SequenceGenerator(name="t_yahoo_shopping_item_seq", sequenceName="recall.T_YAHOO_shopping_ITEM_SEQ" ,allocationSize=1)
    @Column(name = "yahoo_shopping_item_id")
    private Long yahooShoppingItemId;
    @Column(name = "jan")
    private String jan;
    @Column(name = "model")
    private String model;
    @Column(name = "isbn")
    private String isbn;
    @Column(name = "store_id")
    private String storeId;
    @Column(name = "store_name")
    private String storeName;
    @Column(name = "item_name")
    private String itemName;
    @Column(name = "description")
    private String description;
    @Column(name = "url")
    private String url;
    @Column(name = "recall_id")
    private Long recallId;
    @Column(name = "price")
    private Long price;

}
