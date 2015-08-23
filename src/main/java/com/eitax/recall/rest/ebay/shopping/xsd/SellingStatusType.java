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
 * 				Contains various details about the current status of a listing. These
 * 				values are computed by eBay and cannot be specified at listing time.
 * 			
 * 
 * <p>SellingStatusType complex typeのJavaクラス。
 * 
 * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
 * 
 * <pre>
 * &lt;complexType name="SellingStatusType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ConvertedCurrentPrice" type="{urn:ebay:apis:eBLBaseComponents}AmountType" minOccurs="0"/>
 *         &lt;element name="CurrentPrice" type="{urn:ebay:apis:eBLBaseComponents}AmountType" minOccurs="0"/>
 *         &lt;element name="QuantitySold" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="QuantitySoldByPickupInStore" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SellingStatusType", propOrder = {
    "convertedCurrentPrice",
    "currentPrice",
    "quantitySold",
    "quantitySoldByPickupInStore"
})
public class SellingStatusType {

    @XmlElement(name = "ConvertedCurrentPrice")
    protected AmountType convertedCurrentPrice;
    @XmlElement(name = "CurrentPrice")
    protected AmountType currentPrice;
    @XmlElement(name = "QuantitySold")
    protected Integer quantitySold;
    @XmlElement(name = "QuantitySoldByPickupInStore")
    protected Integer quantitySoldByPickupInStore;

    /**
     * convertedCurrentPriceプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getConvertedCurrentPrice() {
        return convertedCurrentPrice;
    }

    /**
     * convertedCurrentPriceプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setConvertedCurrentPrice(AmountType value) {
        this.convertedCurrentPrice = value;
    }

    /**
     * currentPriceプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getCurrentPrice() {
        return currentPrice;
    }

    /**
     * currentPriceプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setCurrentPrice(AmountType value) {
        this.currentPrice = value;
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
     * quantitySoldByPickupInStoreプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getQuantitySoldByPickupInStore() {
        return quantitySoldByPickupInStore;
    }

    /**
     * quantitySoldByPickupInStoreプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setQuantitySoldByPickupInStore(Integer value) {
        this.quantitySoldByPickupInStore = value;
    }

}
