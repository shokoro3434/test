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
 * 				Container for eBay's Business User features. A business seller can choose
 * 				to offer an item exclusively to bidders and buyers that also represent businesses.
 * 				Only applicable when the item is listed in a B2B-enabled category.
 * 				Currently, the eBay Germany (DE), Austria (AT), and Switzerland (CH) sites support
 * 				B2B business features.
 * 			
 * 
 * <p>VATDetailsType complex typeのJavaクラス。
 * 
 * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
 * 
 * <pre>
 * &lt;complexType name="VATDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BusinessSeller" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="RestrictedToBusiness" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="VATPercent" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="VATSite" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VATID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VATDetailsType", propOrder = {
    "businessSeller",
    "restrictedToBusiness",
    "vatPercent",
    "vatSite",
    "vatid"
})
public class VATDetailsType {

    @XmlElement(name = "BusinessSeller")
    protected Boolean businessSeller;
    @XmlElement(name = "RestrictedToBusiness")
    protected Boolean restrictedToBusiness;
    @XmlElement(name = "VATPercent")
    protected Float vatPercent;
    @XmlElement(name = "VATSite")
    protected String vatSite;
    @XmlElement(name = "VATID")
    protected String vatid;

    /**
     * businessSellerプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBusinessSeller() {
        return businessSeller;
    }

    /**
     * businessSellerプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBusinessSeller(Boolean value) {
        this.businessSeller = value;
    }

    /**
     * restrictedToBusinessプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRestrictedToBusiness() {
        return restrictedToBusiness;
    }

    /**
     * restrictedToBusinessプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRestrictedToBusiness(Boolean value) {
        this.restrictedToBusiness = value;
    }

    /**
     * vatPercentプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getVATPercent() {
        return vatPercent;
    }

    /**
     * vatPercentプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setVATPercent(Float value) {
        this.vatPercent = value;
    }

    /**
     * vatSiteプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVATSite() {
        return vatSite;
    }

    /**
     * vatSiteプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVATSite(String value) {
        this.vatSite = value;
    }

    /**
     * vatidプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVATID() {
        return vatid;
    }

    /**
     * vatidプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVATID(String value) {
        this.vatid = value;
    }

}
