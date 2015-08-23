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
 * 				Type for the shipping-related details for an item or transaction.
 * 				<br/><br/>
 * 				<span class="tablenote">
 * 				<strong>Note:</strong> This type and its fields do not provide reliable shipping cost information when returned by the FindPopularItems, FindProducts, GetMultipleItems and GetSingleItem calls. If a listing has shipping costs, use the GetShippingCosts call to get more details about the services and costs that the seller is offering.
 * 				</span>
 * 			
 * 
 * <p>ShippingCostSummaryType complex typeのJavaクラス。
 * 
 * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
 * 
 * <pre>
 * &lt;complexType name="ShippingCostSummaryType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ShippingServiceName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShippingServiceCost" type="{urn:ebay:apis:eBLBaseComponents}AmountType" minOccurs="0"/>
 *         &lt;element name="InsuranceCost" type="{urn:ebay:apis:eBLBaseComponents}AmountType" minOccurs="0"/>
 *         &lt;element name="ShippingType" type="{urn:ebay:apis:eBLBaseComponents}ShippingTypeCodeType" minOccurs="0"/>
 *         &lt;element name="LocalPickup" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="InsuranceOption" type="{urn:ebay:apis:eBLBaseComponents}InsuranceOptionCodeType" minOccurs="0"/>
 *         &lt;element name="ListedShippingServiceCost" type="{urn:ebay:apis:eBLBaseComponents}AmountType" minOccurs="0"/>
 *         &lt;element name="ImportCharge" type="{urn:ebay:apis:eBLBaseComponents}AmountType" minOccurs="0"/>
 *         &lt;element name="LogisticPlanType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ShippingCostSummaryType", propOrder = {
    "shippingServiceName",
    "shippingServiceCost",
    "insuranceCost",
    "shippingType",
    "localPickup",
    "insuranceOption",
    "listedShippingServiceCost",
    "importCharge",
    "logisticPlanType"
})
public class ShippingCostSummaryType {

    @XmlElement(name = "ShippingServiceName")
    protected String shippingServiceName;
    @XmlElement(name = "ShippingServiceCost")
    protected AmountType shippingServiceCost;
    @XmlElement(name = "InsuranceCost")
    protected AmountType insuranceCost;
    @XmlElement(name = "ShippingType")
    @XmlSchemaType(name = "token")
    protected ShippingTypeCodeType shippingType;
    @XmlElement(name = "LocalPickup")
    protected Boolean localPickup;
    @XmlElement(name = "InsuranceOption")
    @XmlSchemaType(name = "token")
    protected InsuranceOptionCodeType insuranceOption;
    @XmlElement(name = "ListedShippingServiceCost")
    protected AmountType listedShippingServiceCost;
    @XmlElement(name = "ImportCharge")
    protected AmountType importCharge;
    @XmlElement(name = "LogisticPlanType")
    protected String logisticPlanType;

    /**
     * shippingServiceNameプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShippingServiceName() {
        return shippingServiceName;
    }

    /**
     * shippingServiceNameプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShippingServiceName(String value) {
        this.shippingServiceName = value;
    }

    /**
     * shippingServiceCostプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getShippingServiceCost() {
        return shippingServiceCost;
    }

    /**
     * shippingServiceCostプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setShippingServiceCost(AmountType value) {
        this.shippingServiceCost = value;
    }

    /**
     * insuranceCostプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getInsuranceCost() {
        return insuranceCost;
    }

    /**
     * insuranceCostプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setInsuranceCost(AmountType value) {
        this.insuranceCost = value;
    }

    /**
     * shippingTypeプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link ShippingTypeCodeType }
     *     
     */
    public ShippingTypeCodeType getShippingType() {
        return shippingType;
    }

    /**
     * shippingTypeプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link ShippingTypeCodeType }
     *     
     */
    public void setShippingType(ShippingTypeCodeType value) {
        this.shippingType = value;
    }

    /**
     * localPickupプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLocalPickup() {
        return localPickup;
    }

    /**
     * localPickupプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLocalPickup(Boolean value) {
        this.localPickup = value;
    }

    /**
     * insuranceOptionプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link InsuranceOptionCodeType }
     *     
     */
    public InsuranceOptionCodeType getInsuranceOption() {
        return insuranceOption;
    }

    /**
     * insuranceOptionプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link InsuranceOptionCodeType }
     *     
     */
    public void setInsuranceOption(InsuranceOptionCodeType value) {
        this.insuranceOption = value;
    }

    /**
     * listedShippingServiceCostプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getListedShippingServiceCost() {
        return listedShippingServiceCost;
    }

    /**
     * listedShippingServiceCostプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setListedShippingServiceCost(AmountType value) {
        this.listedShippingServiceCost = value;
    }

    /**
     * importChargeプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getImportCharge() {
        return importCharge;
    }

    /**
     * importChargeプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setImportCharge(AmountType value) {
        this.importCharge = value;
    }

    /**
     * logisticPlanTypeプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLogisticPlanType() {
        return logisticPlanType;
    }

    /**
     * logisticPlanTypeプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLogisticPlanType(String value) {
        this.logisticPlanType = value;
    }

}
