//
// このファイルは、JavaTM Architecture for XML Binding(JAXB) Reference Implementation、v2.2.8-b130911.1802によって生成されました 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>を参照してください 
// ソース・スキーマの再コンパイル時にこのファイルの変更は失われます。 
// 生成日: 2015.08.24 時間 02:38:24 AM JST 
//


package com.eitax.recall.rest.ebay.shopping.xsd;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 *  
 * 					Applicable to sites that support the Detailed Seller Ratings feature.
 * 					The AverageRatingDetailsType contains the average detailed seller ratings in an area. When buyers leave an overall Feedback rating (positive, neutral, or negative) for a seller, they also can leave ratings in four areas: item as described, communication, shipping time, and charges for shipping and handling. Users retrieve detailed ratings as averages of the ratings left by buyers. 
 * 			
 * 
 * <p>AverageRatingDetailsType complex typeのJavaクラス。
 * 
 * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
 * 
 * <pre>
 * &lt;complexType name="AverageRatingDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RatingDetail" type="{urn:ebay:apis:eBLBaseComponents}FeedbackRatingDetailCodeType" minOccurs="0"/>
 *         &lt;element name="Rating" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="RatingCount" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AverageRatingDetailsType", propOrder = {
    "ratingDetail",
    "rating",
    "ratingCount"
})
public class AverageRatingDetailsType {

    @XmlElement(name = "RatingDetail")
    @XmlSchemaType(name = "token")
    protected FeedbackRatingDetailCodeType ratingDetail;
    @XmlElement(name = "Rating")
    protected Double rating;
    @XmlElement(name = "RatingCount")
    protected Long ratingCount;

    /**
     * ratingDetailプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link FeedbackRatingDetailCodeType }
     *     
     */
    public FeedbackRatingDetailCodeType getRatingDetail() {
        return ratingDetail;
    }

    /**
     * ratingDetailプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link FeedbackRatingDetailCodeType }
     *     
     */
    public void setRatingDetail(FeedbackRatingDetailCodeType value) {
        this.ratingDetail = value;
    }

    /**
     * ratingプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getRating() {
        return rating;
    }

    /**
     * ratingプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setRating(Double value) {
        this.rating = value;
    }

    /**
     * ratingCountプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRatingCount() {
        return ratingCount;
    }

    /**
     * ratingCountプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRatingCount(Long value) {
        this.ratingCount = value;
    }

}
