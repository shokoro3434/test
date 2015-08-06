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
@Table(name = "t_yahoo_auction_item", schema="recall")
public class YahooAuctionItem {
    @Id 
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="t_yahoo_auction_item_seq") 
    @SequenceGenerator(name="t_yahoo_auction_item_seq", sequenceName="recall.T_YAHOO_AUCTION_ITEM_SEQ" ,allocationSize=1)
    @Column(name = "yahoo_auction_item_id")
    @Getter
    @Setter
    private Long yahooAuctionItemId;
    @Column(name = "title")
    @Getter
    @Setter
    private String title;
    @Column(name = "auction_id")
    @Getter
    @Setter
    private String auctionId;
    @Column(name = "category_id")
    @Getter
    @Setter
    private String categoryId;
    @Column(name = "current_price")
    @Getter
    @Setter
    private Long currentPrice;
    @Column(name = "bid_or_buy")
    @Getter
    @Setter
    private Long bidOrBuy;
    @Column(name = "end_time")
    @Getter
    @Setter
    private String endTime;
    @Column(name = "seller_id")
    @Getter
    @Setter
    private String sellerId;
    @Column(name = "auction_item_url")
    @Getter
    @Setter
    private String auctionItemUrl;
    @Column(name = "recall_id")
    @Getter
    @Setter
    private Long recallId;
    @Column(name = "store_flag")
    @Getter
    @Setter
    private Long storeFlag;
    @Column(name = "bids")
    @Getter
    @Setter
    private Long bids;

    
}
