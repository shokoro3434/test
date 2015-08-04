package com.denko.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "t_yahoo_auction_item", schema="recall")
public class YahooAuctionItem {
    @Id 
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="t_yahoo_auction_item_seq") 
    @SequenceGenerator(name="t_yahoo_auction_item_seq", sequenceName="recall.T_YAHOO_AUCTION_ITEM_SEQ" ,allocationSize=1)
    @Column(name = "yahoo_auction_item_id")
    private Long yahooAuctionItemId;
    @Column(name = "title")
    private String title;
    @Column(name = "auction_id")
    private String auctionId;
    @Column(name = "category_id")
    private String categoryId;
    @Column(name = "current_price")
    private Long currentPrice;
    @Column(name = "bid_or_buy")
    private Long bidOrBuy;
    @Column(name = "end_time")
    private String endTime;
    @Column(name = "seller_id")
    private String sellerId;
    @Column(name = "auction_item_url")
    private String auctionItemUrl;
    @Column(name = "recall_id")
    private Long recallId;

    public Long getRecallId() {
		return recallId;
	}
	public void setRecallId(Long recallId) {
		this.recallId = recallId;
	}
	public String getAuctionItemUrl() {
		return auctionItemUrl;
	}
	public void setAuctionItemUrl(String auctionItemUrl) {
		this.auctionItemUrl = auctionItemUrl;
	}
	public String getSellerId() {
		return sellerId;
	}
	public void setSellerId(String sellerId) {
		this.sellerId = sellerId;
	}

	public Long getBidOrBuy() {
		return bidOrBuy;
	}
	public void setBidOrBuy(Long bidOrBuy) {
		this.bidOrBuy = bidOrBuy;
	}
	public String getEndTime() {
		return endTime;
	}
	public Long getCurrentPrice() {
		return currentPrice;
	}
	public void setCurrentPrice(Long currentPrice) {
		this.currentPrice = currentPrice;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}
	public Long getYahooAuctionItemId() {
		return yahooAuctionItemId;
	}
	public void setYahooAuctionItemId(Long yahooAuctionItemId) {
		this.yahooAuctionItemId = yahooAuctionItemId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuctionId() {
		return auctionId;
	}
	public void setAuctionId(String auctionId) {
		this.auctionId = auctionId;
	}
	public String getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}
    
}
