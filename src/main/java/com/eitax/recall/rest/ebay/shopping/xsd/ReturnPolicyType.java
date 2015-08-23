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
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * 
 * 				Type for the return policy details of an item.
 * 			
 * 
 * <p>ReturnPolicyType complex typeのJavaクラス。
 * 
 * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
 * 
 * <pre>
 * &lt;complexType name="ReturnPolicyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Refund" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ReturnsWithin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ReturnsAccepted" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="WarrantyOffered" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="WarrantyType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="WarrantyDuration" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EAN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShippingCostPaidBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RestockingFeeValue" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *         &lt;element name="RestockingFeeValueOption" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReturnPolicyType", propOrder = {
    "refund",
    "returnsWithin",
    "returnsAccepted",
    "description",
    "warrantyOffered",
    "warrantyType",
    "warrantyDuration",
    "ean",
    "shippingCostPaidBy",
    "restockingFeeValue",
    "restockingFeeValueOption"
})
public class ReturnPolicyType {

    @XmlElement(name = "Refund")
    protected String refund;
    @XmlElement(name = "ReturnsWithin")
    protected String returnsWithin;
    @XmlElement(name = "ReturnsAccepted")
    protected String returnsAccepted;
    @XmlElement(name = "Description")
    protected String description;
    @XmlElement(name = "WarrantyOffered")
    protected String warrantyOffered;
    @XmlElement(name = "WarrantyType")
    protected String warrantyType;
    @XmlElement(name = "WarrantyDuration")
    protected String warrantyDuration;
    @XmlElement(name = "EAN")
    protected String ean;
    @XmlElement(name = "ShippingCostPaidBy")
    protected String shippingCostPaidBy;
    @XmlElement(name = "RestockingFeeValue")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String restockingFeeValue;
    @XmlElement(name = "RestockingFeeValueOption")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String restockingFeeValueOption;

    /**
     * refundプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefund() {
        return refund;
    }

    /**
     * refundプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefund(String value) {
        this.refund = value;
    }

    /**
     * returnsWithinプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReturnsWithin() {
        return returnsWithin;
    }

    /**
     * returnsWithinプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReturnsWithin(String value) {
        this.returnsWithin = value;
    }

    /**
     * returnsAcceptedプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReturnsAccepted() {
        return returnsAccepted;
    }

    /**
     * returnsAcceptedプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReturnsAccepted(String value) {
        this.returnsAccepted = value;
    }

    /**
     * descriptionプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * descriptionプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * warrantyOfferedプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWarrantyOffered() {
        return warrantyOffered;
    }

    /**
     * warrantyOfferedプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWarrantyOffered(String value) {
        this.warrantyOffered = value;
    }

    /**
     * warrantyTypeプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWarrantyType() {
        return warrantyType;
    }

    /**
     * warrantyTypeプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWarrantyType(String value) {
        this.warrantyType = value;
    }

    /**
     * warrantyDurationプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWarrantyDuration() {
        return warrantyDuration;
    }

    /**
     * warrantyDurationプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWarrantyDuration(String value) {
        this.warrantyDuration = value;
    }

    /**
     * eanプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEAN() {
        return ean;
    }

    /**
     * eanプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEAN(String value) {
        this.ean = value;
    }

    /**
     * shippingCostPaidByプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShippingCostPaidBy() {
        return shippingCostPaidBy;
    }

    /**
     * shippingCostPaidByプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShippingCostPaidBy(String value) {
        this.shippingCostPaidBy = value;
    }

    /**
     * restockingFeeValueプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRestockingFeeValue() {
        return restockingFeeValue;
    }

    /**
     * restockingFeeValueプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRestockingFeeValue(String value) {
        this.restockingFeeValue = value;
    }

    /**
     * restockingFeeValueOptionプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRestockingFeeValueOption() {
        return restockingFeeValueOption;
    }

    /**
     * restockingFeeValueOptionプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRestockingFeeValueOption(String value) {
        this.restockingFeeValueOption = value;
    }

}
