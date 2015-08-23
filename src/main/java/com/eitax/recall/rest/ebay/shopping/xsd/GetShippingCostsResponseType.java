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
 * 				Response to call of GetShippingCosts.
 * 			
 * 
 * <p>GetShippingCostsResponseType complex typeのJavaクラス。
 * 
 * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
 * 
 * <pre>
 * &lt;complexType name="GetShippingCostsResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractResponseType">
 *       &lt;sequence>
 *         &lt;element name="ShippingDetails" type="{urn:ebay:apis:eBLBaseComponents}ShippingDetailsType" minOccurs="0"/>
 *         &lt;element name="ShippingCostSummary" type="{urn:ebay:apis:eBLBaseComponents}ShippingCostSummaryType" minOccurs="0"/>
 *         &lt;element name="PickUpInStoreDetails" type="{urn:ebay:apis:eBLBaseComponents}PickUpInStoreDetailsType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetShippingCostsResponseType", propOrder = {
    "shippingDetails",
    "shippingCostSummary",
    "pickUpInStoreDetails"
})
public class GetShippingCostsResponseType
    extends AbstractResponseType
{

    @XmlElement(name = "ShippingDetails")
    protected ShippingDetailsType shippingDetails;
    @XmlElement(name = "ShippingCostSummary")
    protected ShippingCostSummaryType shippingCostSummary;
    @XmlElement(name = "PickUpInStoreDetails")
    protected PickUpInStoreDetailsType pickUpInStoreDetails;

    /**
     * shippingDetailsプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link ShippingDetailsType }
     *     
     */
    public ShippingDetailsType getShippingDetails() {
        return shippingDetails;
    }

    /**
     * shippingDetailsプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link ShippingDetailsType }
     *     
     */
    public void setShippingDetails(ShippingDetailsType value) {
        this.shippingDetails = value;
    }

    /**
     * shippingCostSummaryプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link ShippingCostSummaryType }
     *     
     */
    public ShippingCostSummaryType getShippingCostSummary() {
        return shippingCostSummary;
    }

    /**
     * shippingCostSummaryプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link ShippingCostSummaryType }
     *     
     */
    public void setShippingCostSummary(ShippingCostSummaryType value) {
        this.shippingCostSummary = value;
    }

    /**
     * pickUpInStoreDetailsプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link PickUpInStoreDetailsType }
     *     
     */
    public PickUpInStoreDetailsType getPickUpInStoreDetails() {
        return pickUpInStoreDetails;
    }

    /**
     * pickUpInStoreDetailsプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link PickUpInStoreDetailsType }
     *     
     */
    public void setPickUpInStoreDetails(PickUpInStoreDetailsType value) {
        this.pickUpInStoreDetails = value;
    }

}
