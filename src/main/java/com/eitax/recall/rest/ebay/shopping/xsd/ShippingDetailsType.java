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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				Type for the shipping-related details for an item or transaction.
 * 			
 * 
 * <p>ShippingDetailsType complex typeのJavaクラス。
 * 
 * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
 * 
 * <pre>
 * &lt;complexType name="ShippingDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GetItFast" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="InsuranceCost" type="{urn:ebay:apis:eBLBaseComponents}AmountType" minOccurs="0"/>
 *         &lt;element name="InsuranceOption" type="{urn:ebay:apis:eBLBaseComponents}InsuranceOptionCodeType" minOccurs="0"/>
 *         &lt;element name="InternationalShippingServiceOption" type="{urn:ebay:apis:eBLBaseComponents}InternationalShippingServiceOptionType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="SalesTax" type="{urn:ebay:apis:eBLBaseComponents}SalesTaxType" minOccurs="0"/>
 *         &lt;element name="ShippingRateErrorMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShippingServiceOption" type="{urn:ebay:apis:eBLBaseComponents}ShippingServiceOptionType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="TaxTable" type="{urn:ebay:apis:eBLBaseComponents}TaxTableType" minOccurs="0"/>
 *         &lt;element name="InternationalInsuranceCost" type="{urn:ebay:apis:eBLBaseComponents}AmountType" minOccurs="0"/>
 *         &lt;element name="InternationalInsuranceOption" type="{urn:ebay:apis:eBLBaseComponents}InsuranceOptionCodeType" minOccurs="0"/>
 *         &lt;element name="CODCost" type="{urn:ebay:apis:eBLBaseComponents}AmountType" minOccurs="0"/>
 *         &lt;element name="ExcludeShipToLocation" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ShippingDetailsType", propOrder = {
    "getItFast",
    "insuranceCost",
    "insuranceOption",
    "internationalShippingServiceOption",
    "salesTax",
    "shippingRateErrorMessage",
    "shippingServiceOption",
    "taxTable",
    "internationalInsuranceCost",
    "internationalInsuranceOption",
    "codCost",
    "excludeShipToLocation"
})
public class ShippingDetailsType {

    @XmlElement(name = "GetItFast")
    protected Boolean getItFast;
    @XmlElement(name = "InsuranceCost")
    protected AmountType insuranceCost;
    @XmlElement(name = "InsuranceOption")
    @XmlSchemaType(name = "token")
    protected InsuranceOptionCodeType insuranceOption;
    @XmlElement(name = "InternationalShippingServiceOption")
    protected List<InternationalShippingServiceOptionType> internationalShippingServiceOption;
    @XmlElement(name = "SalesTax")
    protected SalesTaxType salesTax;
    @XmlElement(name = "ShippingRateErrorMessage")
    protected String shippingRateErrorMessage;
    @XmlElement(name = "ShippingServiceOption")
    protected List<ShippingServiceOptionType> shippingServiceOption;
    @XmlElement(name = "TaxTable")
    protected TaxTableType taxTable;
    @XmlElement(name = "InternationalInsuranceCost")
    protected AmountType internationalInsuranceCost;
    @XmlElement(name = "InternationalInsuranceOption")
    @XmlSchemaType(name = "token")
    protected InsuranceOptionCodeType internationalInsuranceOption;
    @XmlElement(name = "CODCost")
    protected AmountType codCost;
    @XmlElement(name = "ExcludeShipToLocation")
    protected List<String> excludeShipToLocation;

    /**
     * getItFastプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isGetItFast() {
        return getItFast;
    }

    /**
     * getItFastプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setGetItFast(Boolean value) {
        this.getItFast = value;
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
     * Gets the value of the internationalShippingServiceOption property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the internationalShippingServiceOption property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInternationalShippingServiceOption().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InternationalShippingServiceOptionType }
     * 
     * 
     */
    public List<InternationalShippingServiceOptionType> getInternationalShippingServiceOption() {
        if (internationalShippingServiceOption == null) {
            internationalShippingServiceOption = new ArrayList<InternationalShippingServiceOptionType>();
        }
        return this.internationalShippingServiceOption;
    }

    /**
     * salesTaxプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link SalesTaxType }
     *     
     */
    public SalesTaxType getSalesTax() {
        return salesTax;
    }

    /**
     * salesTaxプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link SalesTaxType }
     *     
     */
    public void setSalesTax(SalesTaxType value) {
        this.salesTax = value;
    }

    /**
     * shippingRateErrorMessageプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShippingRateErrorMessage() {
        return shippingRateErrorMessage;
    }

    /**
     * shippingRateErrorMessageプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShippingRateErrorMessage(String value) {
        this.shippingRateErrorMessage = value;
    }

    /**
     * Gets the value of the shippingServiceOption property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the shippingServiceOption property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getShippingServiceOption().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ShippingServiceOptionType }
     * 
     * 
     */
    public List<ShippingServiceOptionType> getShippingServiceOption() {
        if (shippingServiceOption == null) {
            shippingServiceOption = new ArrayList<ShippingServiceOptionType>();
        }
        return this.shippingServiceOption;
    }

    /**
     * taxTableプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link TaxTableType }
     *     
     */
    public TaxTableType getTaxTable() {
        return taxTable;
    }

    /**
     * taxTableプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link TaxTableType }
     *     
     */
    public void setTaxTable(TaxTableType value) {
        this.taxTable = value;
    }

    /**
     * internationalInsuranceCostプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getInternationalInsuranceCost() {
        return internationalInsuranceCost;
    }

    /**
     * internationalInsuranceCostプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setInternationalInsuranceCost(AmountType value) {
        this.internationalInsuranceCost = value;
    }

    /**
     * internationalInsuranceOptionプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link InsuranceOptionCodeType }
     *     
     */
    public InsuranceOptionCodeType getInternationalInsuranceOption() {
        return internationalInsuranceOption;
    }

    /**
     * internationalInsuranceOptionプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link InsuranceOptionCodeType }
     *     
     */
    public void setInternationalInsuranceOption(InsuranceOptionCodeType value) {
        this.internationalInsuranceOption = value;
    }

    /**
     * codCostプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getCODCost() {
        return codCost;
    }

    /**
     * codCostプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setCODCost(AmountType value) {
        this.codCost = value;
    }

    /**
     * Gets the value of the excludeShipToLocation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the excludeShipToLocation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExcludeShipToLocation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getExcludeShipToLocation() {
        if (excludeShipToLocation == null) {
            excludeShipToLocation = new ArrayList<String>();
        }
        return this.excludeShipToLocation;
    }

}
