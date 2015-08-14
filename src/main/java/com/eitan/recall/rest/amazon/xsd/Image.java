//
// このファイルは、JavaTM Architecture for XML Binding(JAXB) Reference Implementation、v2.2.8-b130911.1802によって生成されました 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>を参照してください 
// ソース・スキーマの再コンパイル時にこのファイルの変更は失われます。 
// 生成日: 2015.08.14 時間 10:22:22 PM JST 
//


package com.eitan.recall.rest.amazon.xsd;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Image complex typeのJavaクラス。
 * 
 * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
 * 
 * <pre>
 * &lt;complexType name="Image">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="URL" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Height" type="{http://webservices.amazon.com/AWSECommerceService/2011-08-01}DecimalWithUnits"/>
 *         &lt;element name="Width" type="{http://webservices.amazon.com/AWSECommerceService/2011-08-01}DecimalWithUnits"/>
 *         &lt;element name="IsVerified" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Image", propOrder = {
    "url",
    "height",
    "width",
    "isVerified"
})
public class Image {

    @XmlElement(name = "URL", required = true)
    protected String url;
    @XmlElement(name = "Height", required = true)
    protected DecimalWithUnits height;
    @XmlElement(name = "Width", required = true)
    protected DecimalWithUnits width;
    @XmlElement(name = "IsVerified")
    protected String isVerified;

    /**
     * urlプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getURL() {
        return url;
    }

    /**
     * urlプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setURL(String value) {
        this.url = value;
    }

    /**
     * heightプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link DecimalWithUnits }
     *     
     */
    public DecimalWithUnits getHeight() {
        return height;
    }

    /**
     * heightプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link DecimalWithUnits }
     *     
     */
    public void setHeight(DecimalWithUnits value) {
        this.height = value;
    }

    /**
     * widthプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link DecimalWithUnits }
     *     
     */
    public DecimalWithUnits getWidth() {
        return width;
    }

    /**
     * widthプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link DecimalWithUnits }
     *     
     */
    public void setWidth(DecimalWithUnits value) {
        this.width = value;
    }

    /**
     * isVerifiedプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsVerified() {
        return isVerified;
    }

    /**
     * isVerifiedプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsVerified(String value) {
        this.isVerified = value;
    }

}
