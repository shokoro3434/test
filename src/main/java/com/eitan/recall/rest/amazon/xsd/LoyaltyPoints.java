//
// このファイルは、JavaTM Architecture for XML Binding(JAXB) Reference Implementation、v2.2.8-b130911.1802によって生成されました 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>を参照してください 
// ソース・スキーマの再コンパイル時にこのファイルの変更は失われます。 
// 生成日: 2015.08.14 時間 10:22:22 PM JST 
//


package com.eitan.recall.rest.amazon.xsd;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
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
 *         &lt;element name="Points" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
 *         &lt;element name="TypicalRedemptionValue" type="{http://webservices.amazon.com/AWSECommerceService/2011-08-01}Price" minOccurs="0"/>
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
    "points",
    "typicalRedemptionValue"
})
@XmlRootElement(name = "LoyaltyPoints")
public class LoyaltyPoints {

    @XmlElement(name = "Points")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger points;
    @XmlElement(name = "TypicalRedemptionValue")
    protected Price typicalRedemptionValue;

    /**
     * pointsプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPoints() {
        return points;
    }

    /**
     * pointsプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPoints(BigInteger value) {
        this.points = value;
    }

    /**
     * typicalRedemptionValueプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link Price }
     *     
     */
    public Price getTypicalRedemptionValue() {
        return typicalRedemptionValue;
    }

    /**
     * typicalRedemptionValueプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link Price }
     *     
     */
    public void setTypicalRedemptionValue(Price value) {
        this.typicalRedemptionValue = value;
    }

}
