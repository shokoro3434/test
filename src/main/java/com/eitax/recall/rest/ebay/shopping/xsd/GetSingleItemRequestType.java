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
 * 					Retrieves publicly available data for a single listing.
 * 					Use this call to retrieve most of the information that is visible
 * 					on a listing's View Item page on the eBay Web site,
 * 					such as title, description, prices, basic seller and bidder information,
 * 					and other details about the listing.Also returns basic
 * 					shipping costs. For more shipping details, use GetShippingCosts.
 * 			
 * 
 * <p>GetSingleItemRequestType complex typeのJavaクラス。
 * 
 * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
 * 
 * <pre>
 * &lt;complexType name="GetSingleItemRequestType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractRequestType">
 *       &lt;sequence>
 *         &lt;element name="ItemID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VariationSKU" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VariationSpecifics" type="{urn:ebay:apis:eBLBaseComponents}NameValueListArrayType" minOccurs="0"/>
 *         &lt;element name="IncludeSelector" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetSingleItemRequestType", propOrder = {
    "itemID",
    "variationSKU",
    "variationSpecifics",
    "includeSelector"
})
public class GetSingleItemRequestType
    extends AbstractRequestType
{

    @XmlElement(name = "ItemID")
    protected String itemID;
    @XmlElement(name = "VariationSKU")
    protected String variationSKU;
    @XmlElement(name = "VariationSpecifics")
    protected NameValueListArrayType variationSpecifics;
    @XmlElement(name = "IncludeSelector")
    protected String includeSelector;

    /**
     * itemIDプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemID() {
        return itemID;
    }

    /**
     * itemIDプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemID(String value) {
        this.itemID = value;
    }

    /**
     * variationSKUプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVariationSKU() {
        return variationSKU;
    }

    /**
     * variationSKUプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVariationSKU(String value) {
        this.variationSKU = value;
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
     * includeSelectorプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIncludeSelector() {
        return includeSelector;
    }

    /**
     * includeSelectorプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIncludeSelector(String value) {
        this.includeSelector = value;
    }

}
