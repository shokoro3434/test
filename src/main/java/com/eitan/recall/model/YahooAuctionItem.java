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
@Table(name = "t_yahoo_auction_item", schema="recall")
public class YahooAuctionItem {
    @Id 
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="t_yahoo_auction_item_seq") 
    @SequenceGenerator(name="t_yahoo_auction_item_seq", sequenceName="recall.T_YAHOO_AUCTION_ITEM_SEQ" ,allocationSize=1)
    @Column(name = "yahoo_auction_item_id")
    private Integer yahooAuctionItemId;
    @Column(name = "title")
    private String title;
    @Column(name = "auction_id")
    private String auctionId;
    @Column(name = "category_id")
    private String categoryId;
    @Column(name = "current_price")
    private Integer currentPrice;
    @Column(name = "bid_or_buy")
    private Integer bidOrBuy;
    @Column(name = "end_time")
    private String endTime;
    @Column(name = "seller_id")
    private String sellerId;
    @Column(name = "auction_item_url")
    private String auctionItemUrl;
    @Column(name = "recall_id")
    private Integer recallId;
    @Column(name = "store_flag")
    private Integer storeFlag;
    @Column(name = "bids")
    private Integer bids;
    @Column(name = "start_time")
    private String startTime;
    @Column(name = "mark_id")
    private Integer markId;

    
}
