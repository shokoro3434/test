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
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * 
 * 				Shipping costs and options related to a domestic shipping service.
 * 			
 * 
 * <p>ShippingServiceOptionType complex typeのJavaクラス。
 * 
 * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
 * 
 * <pre>
 * &lt;complexType name="ShippingServiceOptionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ShippingInsuranceCost" type="{urn:ebay:apis:eBLBaseComponents}AmountType" minOccurs="0"/>
 *         &lt;element name="ShippingServiceName" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *         &lt;element name="LogisticPlanType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShippingServiceCost" type="{urn:ebay:apis:eBLBaseComponents}AmountType" minOccurs="0"/>
 *         &lt;element name="ShippingServiceAdditionalCost" type="{urn:ebay:apis:eBLBaseComponents}AmountType" minOccurs="0"/>
 *         &lt;element name="ShippingServicePriority" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ExpeditedService" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ShippingTimeMin" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ShippingTimeMax" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ShippingSurcharge" type="{urn:ebay:apis:eBLBaseComponents}AmountType" minOccurs="0"/>
 *         &lt;element name="ShipsTo" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="EstimatedDeliveryMinTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="EstimatedDeliveryMaxTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="FastAndFree" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ShippingServiceCutOffTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ShippingServiceOptionType", propOrder = {
    "shippingInsuranceCost",
    "shippingServiceName",
    "logisticPlanType",
    "shippingServiceCost",
    "shippingServiceAdditionalCost",
    "shippingServicePriority",
    "expeditedService",
    "shippingTimeMin",
    "shippingTimeMax",
    "shippingSurcharge",
    "shipsTo",
    "estimatedDeliveryMinTime",
    "estimatedDeliveryMaxTime",
    "fastAndFree",
    "shippingServiceCutOffTime"
})
public class ShippingServiceOptionType {

    @XmlElement(name = "ShippingInsuranceCost")
    protected AmountType shippingInsuranceCost;
    @XmlElement(name = "ShippingServiceName")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String shippingServiceName;
    @XmlElement(name = "LogisticPlanType")
    protected String logisticPlanType;
    @XmlElement(name = "ShippingServiceCost")
    protected AmountType shippingServiceCost;
    @XmlElement(name = "ShippingServiceAdditionalCost")
    protected AmountType shippingServiceAdditionalCost;
    @XmlElement(name = "ShippingServicePriority")
    protected Integer shippingServicePriority;
    @XmlElement(name = "ExpeditedService")
    protected Boolean expeditedService;
    @XmlElement(name = "ShippingTimeMin")
    protected Integer shippingTimeMin;
    @XmlElement(name = "ShippingTimeMax")
    protected Integer shippingTimeMax;
    @XmlElement(name = "ShippingSurcharge")
    protected AmountType shippingSurcharge;
    @XmlElement(name = "ShipsTo")
    protected List<String> shipsTo;
    @XmlElement(name = "EstimatedDeliveryMinTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar estimatedDeliveryMinTime;
    @XmlElement(name = "EstimatedDeliveryMaxTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar estimatedDeliveryMaxTime;
    @XmlElement(name = "FastAndFree")
    protected Boolean fastAndFree;
    @XmlElement(name = "ShippingServiceCutOffTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar shippingServiceCutOffTime;

    /**
     * shippingInsuranceCostプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getShippingInsuranceCost() {
        return shippingInsuranceCost;
    }

    /**
     * shippingInsuranceCostプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setShippingInsuranceCost(AmountType value) {
        this.shippingInsuranceCost = value;
    }

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
     * shippingServiceAdditionalCostプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getShippingServiceAdditionalCost() {
        return shippingServiceAdditionalCost;
    }

    /**
     * shippingServiceAdditionalCostプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setShippingServiceAdditionalCost(AmountType value) {
        this.shippingServiceAdditionalCost = value;
    }

    /**
     * shippingServicePriorityプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getShippingServicePriority() {
        return shippingServicePriority;
    }

    /**
     * shippingServicePriorityプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setShippingServicePriority(Integer value) {
        this.shippingServicePriority = value;
    }

    /**
     * expeditedServiceプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isExpeditedService() {
        return expeditedService;
    }

    /**
     * expeditedServiceプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExpeditedService(Boolean value) {
        this.expeditedService = value;
    }

    /**
     * shippingTimeMinプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getShippingTimeMin() {
        return shippingTimeMin;
    }

    /**
     * shippingTimeMinプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setShippingTimeMin(Integer value) {
        this.shippingTimeMin = value;
    }

    /**
     * shippingTimeMaxプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getShippingTimeMax() {
        return shippingTimeMax;
    }

    /**
     * shippingTimeMaxプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setShippingTimeMax(Integer value) {
        this.shippingTimeMax = value;
    }

    /**
     * shippingSurchargeプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getShippingSurcharge() {
        return shippingSurcharge;
    }

    /**
     * shippingSurchargeプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setShippingSurcharge(AmountType value) {
        this.shippingSurcharge = value;
    }

    /**
     * Gets the value of the shipsTo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the shipsTo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getShipsTo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getShipsTo() {
        if (shipsTo == null) {
            shipsTo = new ArrayList<String>();
        }
        return this.shipsTo;
    }

    /**
     * estimatedDeliveryMinTimeプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEstimatedDeliveryMinTime() {
        return estimatedDeliveryMinTime;
    }

    /**
     * estimatedDeliveryMinTimeプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEstimatedDeliveryMinTime(XMLGregorianCalendar value) {
        this.estimatedDeliveryMinTime = value;
    }

    /**
     * estimatedDeliveryMaxTimeプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEstimatedDeliveryMaxTime() {
        return estimatedDeliveryMaxTime;
    }

    /**
     * estimatedDeliveryMaxTimeプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEstimatedDeliveryMaxTime(XMLGregorianCalendar value) {
        this.estimatedDeliveryMaxTime = value;
    }

    /**
     * fastAndFreeプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFastAndFree() {
        return fastAndFree;
    }

    /**
     * fastAndFreeプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFastAndFree(Boolean value) {
        this.fastAndFree = value;
    }

    /**
     * shippingServiceCutOffTimeプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getShippingServiceCutOffTime() {
        return shippingServiceCutOffTime;
    }

    /**
     * shippingServiceCutOffTimeプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setShippingServiceCutOffTime(XMLGregorianCalendar value) {
        this.shippingServiceCutOffTime = value;
    }

}
