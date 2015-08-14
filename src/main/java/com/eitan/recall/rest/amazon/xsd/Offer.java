//
// このファイルは、JavaTM Architecture for XML Binding(JAXB) Reference Implementation、v2.2.8-b130911.1802によって生成されました 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>を参照してください 
// ソース・スキーマの再コンパイル時にこのファイルの変更は失われます。 
// 生成日: 2015.08.14 時間 10:22:22 PM JST 
//


package com.eitan.recall.rest.amazon.xsd;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>anonymous complex typeのJavaクラス。
 * 
 * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://webservices.amazon.com/AWSECommerceService/2011-08-01}Merchant" minOccurs="0"/>
 *         &lt;element ref="{http://webservices.amazon.com/AWSECommerceService/2011-08-01}OfferAttributes" minOccurs="0"/>
 *         &lt;element ref="{http://webservices.amazon.com/AWSECommerceService/2011-08-01}OfferListing" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://webservices.amazon.com/AWSECommerceService/2011-08-01}LoyaltyPoints" minOccurs="0"/>
 *         &lt;element ref="{http://webservices.amazon.com/AWSECommerceService/2011-08-01}Promotions" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "merchant",
    "offerAttributes",
    "offerListing",
    "loyaltyPoints",
    "promotions"
})
@XmlRootElement(name = "Offer")
public class Offer {

    @XmlElement(name = "Merchant")
    protected Merchant merchant;
    @XmlElement(name = "OfferAttributes")
    protected OfferAttributes offerAttributes;
    @XmlElement(name = "OfferListing")
    protected List<OfferListing> offerListing;
    @XmlElement(name = "LoyaltyPoints")
    protected LoyaltyPoints loyaltyPoints;
    @XmlElement(name = "Promotions")
    protected Promotions promotions;

    /**
     * merchantプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link Merchant }
     *     
     */
    public Merchant getMerchant() {
        return merchant;
    }

    /**
     * merchantプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link Merchant }
     *     
     */
    public void setMerchant(Merchant value) {
        this.merchant = value;
    }

    /**
     * offerAttributesプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link OfferAttributes }
     *     
     */
    public OfferAttributes getOfferAttributes() {
        return offerAttributes;
    }

    /**
     * offerAttributesプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link OfferAttributes }
     *     
     */
    public void setOfferAttributes(OfferAttributes value) {
        this.offerAttributes = value;
    }

    /**
     * Gets the value of the offerListing property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the offerListing property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOfferListing().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OfferListing }
     * 
     * 
     */
    public List<OfferListing> getOfferListing() {
        if (offerListing == null) {
            offerListing = new ArrayList<OfferListing>();
        }
        return this.offerListing;
    }

    /**
     * loyaltyPointsプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link LoyaltyPoints }
     *     
     */
    public LoyaltyPoints getLoyaltyPoints() {
        return loyaltyPoints;
    }

    /**
     * loyaltyPointsプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link LoyaltyPoints }
     *     
     */
    public void setLoyaltyPoints(LoyaltyPoints value) {
        this.loyaltyPoints = value;
    }

    /**
     * promotionsプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link Promotions }
     *     
     */
    public Promotions getPromotions() {
        return promotions;
    }

    /**
     * promotionsプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link Promotions }
     *     
     */
    public void setPromotions(Promotions value) {
        this.promotions = value;
    }

}
