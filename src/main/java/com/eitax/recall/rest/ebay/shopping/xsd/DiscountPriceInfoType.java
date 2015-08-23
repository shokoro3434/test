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
 * 				Contains the discount pricing details for an item, including the original
 * 				retail price and the display treatment to be used for the item. The pricing
 * 				treatment displayed for a discounted item depends on the values specified
 * 				in this container when the item is listed. Discount pricing treatments
 * 				(Strikethrough Pricing and Minimum Advertised Price) apply to only fixed
 * 				price, BIN items. Sellers can apply Discount Pricing to both MSKU and
 * 				Non-MSKU items.
 * 			
 * 
 * <p>DiscountPriceInfoType complex typeのJavaクラス。
 * 
 * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
 * 
 * <pre>
 * &lt;complexType name="DiscountPriceInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OriginalRetailPrice" type="{urn:ebay:apis:eBLBaseComponents}AmountType" minOccurs="0"/>
 *         &lt;element name="MinimumAdvertisedPrice" type="{urn:ebay:apis:eBLBaseComponents}AmountType" minOccurs="0"/>
 *         &lt;element name="MinimumAdvertisedPriceExposure" type="{urn:ebay:apis:eBLBaseComponents}MinimumAdvertisedPriceExposureCodeType" minOccurs="0"/>
 *         &lt;element name="PricingTreatment" type="{urn:ebay:apis:eBLBaseComponents}PricingTreatmentCodeType" minOccurs="0"/>
 *         &lt;element name="SoldOneBay" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="SoldOffeBay" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DiscountPriceInfoType", propOrder = {
    "originalRetailPrice",
    "minimumAdvertisedPrice",
    "minimumAdvertisedPriceExposure",
    "pricingTreatment",
    "soldOneBay",
    "soldOffeBay"
})
public class DiscountPriceInfoType {

    @XmlElement(name = "OriginalRetailPrice")
    protected AmountType originalRetailPrice;
    @XmlElement(name = "MinimumAdvertisedPrice")
    protected AmountType minimumAdvertisedPrice;
    @XmlElement(name = "MinimumAdvertisedPriceExposure")
    @XmlSchemaType(name = "token")
    protected MinimumAdvertisedPriceExposureCodeType minimumAdvertisedPriceExposure;
    @XmlElement(name = "PricingTreatment")
    @XmlSchemaType(name = "token")
    protected PricingTreatmentCodeType pricingTreatment;
    @XmlElement(name = "SoldOneBay", defaultValue = "false")
    protected Boolean soldOneBay;
    @XmlElement(name = "SoldOffeBay", defaultValue = "false")
    protected Boolean soldOffeBay;

    /**
     * originalRetailPriceプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getOriginalRetailPrice() {
        return originalRetailPrice;
    }

    /**
     * originalRetailPriceプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setOriginalRetailPrice(AmountType value) {
        this.originalRetailPrice = value;
    }

    /**
     * minimumAdvertisedPriceプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getMinimumAdvertisedPrice() {
        return minimumAdvertisedPrice;
    }

    /**
     * minimumAdvertisedPriceプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setMinimumAdvertisedPrice(AmountType value) {
        this.minimumAdvertisedPrice = value;
    }

    /**
     * minimumAdvertisedPriceExposureプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link MinimumAdvertisedPriceExposureCodeType }
     *     
     */
    public MinimumAdvertisedPriceExposureCodeType getMinimumAdvertisedPriceExposure() {
        return minimumAdvertisedPriceExposure;
    }

    /**
     * minimumAdvertisedPriceExposureプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link MinimumAdvertisedPriceExposureCodeType }
     *     
     */
    public void setMinimumAdvertisedPriceExposure(MinimumAdvertisedPriceExposureCodeType value) {
        this.minimumAdvertisedPriceExposure = value;
    }

    /**
     * pricingTreatmentプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link PricingTreatmentCodeType }
     *     
     */
    public PricingTreatmentCodeType getPricingTreatment() {
        return pricingTreatment;
    }

    /**
     * pricingTreatmentプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link PricingTreatmentCodeType }
     *     
     */
    public void setPricingTreatment(PricingTreatmentCodeType value) {
        this.pricingTreatment = value;
    }

    /**
     * soldOneBayプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSoldOneBay() {
        return soldOneBay;
    }

    /**
     * soldOneBayプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSoldOneBay(Boolean value) {
        this.soldOneBay = value;
    }

    /**
     * soldOffeBayプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSoldOffeBay() {
        return soldOffeBay;
    }

    /**
     * soldOffeBayプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSoldOffeBay(Boolean value) {
        this.soldOffeBay = value;
    }

}
