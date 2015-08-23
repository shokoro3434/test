//
// このファイルは、JavaTM Architecture for XML Binding(JAXB) Reference Implementation、v2.2.8-b130911.1802によって生成されました 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>を参照してください 
// ソース・スキーマの再コンパイル時にこのファイルの変更は失われます。 
// 生成日: 2015.08.24 時間 02:38:24 AM JST 
//


package com.eitax.recall.rest.ebay.shopping.xsd;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ListingTypeCodeTypeのJavaクラス。
 * 
 * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
 * <p>
 * <pre>
 * &lt;simpleType name="ListingTypeCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Unknown"/>
 *     &lt;enumeration value="Chinese"/>
 *     &lt;enumeration value="Dutch"/>
 *     &lt;enumeration value="Live"/>
 *     &lt;enumeration value="Auction"/>
 *     &lt;enumeration value="AdType"/>
 *     &lt;enumeration value="StoresFixedPrice"/>
 *     &lt;enumeration value="PersonalOffer"/>
 *     &lt;enumeration value="FixedPriceItem"/>
 *     &lt;enumeration value="Half"/>
 *     &lt;enumeration value="LeadGeneration"/>
 *     &lt;enumeration value="Express"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ListingTypeCodeType")
@XmlEnum
public enum ListingTypeCodeType {


    /**
     * 
     * 						Unknown auction type. (This is not normally used.)
     * 					
     * 
     */
    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown"),

    /**
     * 
     * 						Single-quantity online auction format.
     * 						A Chinese auction has a Quantity of 1. Buyers engage in competitive bidding,
     * 						although Buy It Now may be offered as long as no bids have been placed.
     * 						Online auctions are listed on eBay.com, and they are also listed in
     * 						the seller's eBay Store if the seller is a Store owner.
     * 					
     * 
     */
    @XmlEnumValue("Chinese")
    CHINESE("Chinese"),

    /**
     * 
     * 					This value is no longer applicable.
     * 					
     * 					
     * 
     */
    @XmlEnumValue("Dutch")
    DUTCH("Dutch"),

    /**
     * 
     * 						Live auction, on-site auction that can include non-eBay bidders. Live auctions
     * 						are listed on the eBay Live Auctions site, in live auction categories. They can
     * 						also appear on eBay if the seller lists the lot in a secondary, eBay category.
     * 					
     * 
     */
    @XmlEnumValue("Live")
    LIVE("Live"),

    /**
     * 
     * 						Reserved for future use.
     * 					
     * 
     */
    @XmlEnumValue("Auction")
    AUCTION("Auction"),

    /**
     * 
     * 						Advertisement to solicit inquiries on listings such as real estate. Permits no
     * 						bidding on that item, service, or property. To express interest, a buyer fills
     * 						out a contact form that eBay forwards to the seller as a lead. This format
     * 						does not enable buyers and sellers to transact online through eBay, and eBay
     * 						Feedback is not available for ad format listings.
     * 					
     * 
     */
    @XmlEnumValue("AdType")
    AD_TYPE("AdType"),

    /**
     * 
     * 						This value is no longer applicable. 
     * 						
     * 					
     * 
     */
    @XmlEnumValue("StoresFixedPrice")
    STORES_FIXED_PRICE("StoresFixedPrice"),

    /**
     * 
     * 						Second chance offer made to a non-winning bidder on an ended listing. A seller
     * 						can make an offer to a non-winning bidder when either the winning bidder has
     * 						failed to pay for an item or the seller has a duplicate of the item. Second-
     * 						chance offer items are on eBay, but they do not appear when browsing or
     * 						searching listings. You need to already know the item ID in order to retrieve a
     * 						second-chance offer.
     * 					
     * 
     */
    @XmlEnumValue("PersonalOffer")
    PERSONAL_OFFER("PersonalOffer"),

    /**
     * 
     * 						A basic fixed-price listing with a Quantity of 1. Allows no auction-style
     * 						bidding. Also known as Buy It Now Only on some sites, this should not to be
     * 						confused with the BuyItNow option that is available for competitive-bid
     * 						auctions. Fixed-price listings appear on eBay.com. They are also listed in a
     * 						seller's eBay Store if the seller is a Store owner.
     * 					
     * 
     */
    @XmlEnumValue("FixedPriceItem")
    FIXED_PRICE_ITEM("FixedPriceItem"),

    /**
     * 
     * 						Half.com listing (item is listed on Half.com, not on eBay).
     * 						Reserved for future use.
     * 					
     * 
     */
    @XmlEnumValue("Half")
    HALF("Half"),

    /**
     * 
     * 						Lead Generation format (advertisement-style listing to solicit
     * 						inquiries or offers, no bidding or fixed price, listed on eBay).
     * 					
     * 
     */
    @XmlEnumValue("LeadGeneration")
    LEAD_GENERATION("LeadGeneration"),

    /**
     * 
     * 					This value is no longer applicable.
     * 						
     * 					
     * 
     */
    @XmlEnumValue("Express")
    EXPRESS("Express"),

    /**
     * 
     * 						Placeholder value. See
     * 						<a href="http://developer.ebay.com/DevZone/shopping/docs/CallRef/types/simpleTypes.html#token">token</a>.
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    ListingTypeCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ListingTypeCodeType fromValue(String v) {
        for (ListingTypeCodeType c: ListingTypeCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
