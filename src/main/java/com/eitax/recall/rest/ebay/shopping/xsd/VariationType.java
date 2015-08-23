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
 * 			This element hold the values that define the SKU, StartPrice, Quantity, VariationDetails, and VariationSpecifics.
 * 			
 * 
 * <p>VariationType complex typeのJavaクラス。
 * 
 * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
 * 
 * <pre>
 * &lt;complexType name="VariationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SKU" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StartPrice" type="{urn:ebay:apis:eBLBaseComponents}AmountType" minOccurs="0"/>
 *         &lt;element name="Quantity" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="VariationSpecifics" type="{urn:ebay:apis:eBLBaseComponents}NameValueListArrayType" minOccurs="0"/>
 *         &lt;element name="QuantitySold" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="SellingStatus" type="{urn:ebay:apis:eBLBaseComponents}SellingStatusType" minOccurs="0"/>
 *         &lt;element name="DiscountPriceInfo" type="{urn:ebay:apis:eBLBaseComponents}DiscountPriceInfoType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VariationType", propOrder = {
    "sku",
    "startPrice",
    "quantity",
    "variationSpecifics",
    "quantitySold",
    "sellingStatus",
    "discountPriceInfo"
})
public class VariationType {

    @XmlElement(name = "SKU")
    protected String sku;
    @XmlElement(name = "StartPrice")
    protected AmountType startPrice;
    @XmlElement(name = "Quantity")
    protected Integer quantity;
    @XmlElement(name = "VariationSpecifics")
    protected NameValueListArrayType variationSpecifics;
    @XmlElement(name = "QuantitySold")
    protected Integer quantitySold;
    @XmlElement(name = "SellingStatus")
    protected SellingStatusType sellingStatus;
    @XmlElement(name = "DiscountPriceInfo")
    protected DiscountPriceInfoType discountPriceInfo;

    /**
     * skuプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSKU() {
        return sku;
    }

    /**
     * skuプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSKU(String value) {
        this.sku = value;
    }

    /**
     * startPriceプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getStartPrice() {
        return startPrice;
    }

    /**
     * startPriceプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setStartPrice(AmountType value) {
        this.startPrice = value;
    }

    /**
     * quantityプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getQuantity() {
        return quantity;
    }

    /**
     * quantityプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setQuantity(Integer value) {
        this.quantity = value;
    }

    /**
     * variationSpecificsプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link NameValueListArrayType }
     *     
     */
    public NameValueListArrayType getVariationSpecifics() {
        return variationSpecifics;
    }

    /**
     * variationSpecificsプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link NameValueListArrayType }
     *     
     */
    public void setVariationSpecifics(NameValueListArrayType value) {
        this.variationSpecifics = value;
    }

    /**
     * quantitySoldプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getQuantitySold() {
        return quantitySold;
    }

    /**
     * quantitySoldプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setQuantitySold(Integer value) {
        this.quantitySold = value;
    }

    /**
     * sellingStatusプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link SellingStatusType }
     *     
     */
    public SellingStatusType getSellingStatus() {
        return sellingStatus;
    }

    /**
     * sellingStatusプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link SellingStatusType }
     *     
     */
    public void setSellingStatus(SellingStatusType value) {
        this.sellingStatus = value;
    }

    /**
     * discountPriceInfoプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link DiscountPriceInfoType }
     *     
     */
    public DiscountPriceInfoType getDiscountPriceInfo() {
        return discountPriceInfo;
    }

    /**
     * discountPriceInfoプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link DiscountPriceInfoType }
     *     
     */
    public void setDiscountPriceInfo(DiscountPriceInfoType value) {
        this.discountPriceInfo = value;
    }

}
