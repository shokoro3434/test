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
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				Tax-related details for a region or jurisdiction.
 * 			
 * 
 * <p>TaxJurisdictionType complex typeのJavaクラス。
 * 
 * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
 * 
 * <pre>
 * &lt;complexType name="TaxJurisdictionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="JurisdictionID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SalesTaxPercent" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="ShippingIncludedInTax" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaxJurisdictionType", propOrder = {
    "jurisdictionID",
    "salesTaxPercent",
    "shippingIncludedInTax"
})
public class TaxJurisdictionType {

    @XmlElement(name = "JurisdictionID")
    protected String jurisdictionID;
    @XmlElement(name = "SalesTaxPercent")
    protected Float salesTaxPercent;
    @XmlElement(name = "ShippingIncludedInTax")
    protected Boolean shippingIncludedInTax;

    /**
     * jurisdictionIDプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJurisdictionID() {
        return jurisdictionID;
    }

    /**
     * jurisdictionIDプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJurisdictionID(String value) {
        this.jurisdictionID = value;
    }

    /**
     * salesTaxPercentプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getSalesTaxPercent() {
        return salesTaxPercent;
    }

    /**
     * salesTaxPercentプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setSalesTaxPercent(Float value) {
        this.salesTaxPercent = value;
    }

    /**
     * shippingIncludedInTaxプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShippingIncludedInTax() {
        return shippingIncludedInTax;
    }

    /**
     * shippingIncludedInTaxプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShippingIncludedInTax(Boolean value) {
        this.shippingIncludedInTax = value;
    }

}
