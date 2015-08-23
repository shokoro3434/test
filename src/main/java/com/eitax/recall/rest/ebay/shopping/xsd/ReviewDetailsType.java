//
// このファイルは、JavaTM Architecture for XML Binding(JAXB) Reference Implementation、v2.2.8-b130911.1802によって生成されました 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>を参照してください 
// ソース・スキーマの再コンパイル時にこのファイルの変更は失われます。 
// 生成日: 2015.08.24 時間 02:38:24 AM JST 
//


package com.eitax.recall.rest.ebay.shopping.xsd;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				Contains product reviews written by eBay members.
 * 			 
 * 
 * <p>ReviewDetailsType complex typeのJavaクラス。
 * 
 * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
 * 
 * <pre>
 * &lt;complexType name="ReviewDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AverageRating" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="Review" type="{urn:ebay:apis:eBLBaseComponents}ReviewType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReviewDetailsType", propOrder = {
    "averageRating",
    "review"
})
public class ReviewDetailsType {

    @XmlElement(name = "AverageRating")
    protected Float averageRating;
    @XmlElement(name = "Review")
    protected List<ReviewType> review;

    /**
     * averageRatingプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getAverageRating() {
        return averageRating;
    }

    /**
     * averageRatingプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setAverageRating(Float value) {
        this.averageRating = value;
    }

    /**
     * Gets the value of the review property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the review property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReview().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReviewType }
     * 
     * 
     */
    public List<ReviewType> getReview() {
        if (review == null) {
            review = new ArrayList<ReviewType>();
        }
        return this.review;
    }

}
