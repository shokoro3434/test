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
 * 				Gets shipping costs for an item. This is one of the ways a buyer or seller
 * 				can obtain shipping cost information for an existing item (for which the caller is
 * 				either the buyer or seller) at any point in the life of the listing, before or
 * 				after a buyer has committed to purchasing the item(s). This call works for
 * 				both flat rate shipping and calculated shipping. Flat rate shipping costs are
 * 				established by the seller before bidding occurs. Calculated shipping costs
 * 				are calculated by eBay with its shipping partners based on postal code, but note
 * 				that insurance cost can only be determined once the final item price is known
 * 				when the listing ends. To determine whether a listing has ended, use GetSingleItem.
 * 				It is best to call GetShippingCosts only after determining via GetSingleItem
 * 				or findItemsAdvanced (<a 
 * 				href="http://www.developer.ebay.com/DevZone/finding/CallRef/index.html" 
 * 				>Finding API</a>) that the item actually has shipping cost information.
 * 			
 * 
 * <p>GetShippingCostsRequestType complex typeのJavaクラス。
 * 
 * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
 * 
 * <pre>
 * &lt;complexType name="GetShippingCostsRequestType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractRequestType">
 *       &lt;sequence>
 *         &lt;element name="ItemID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="QuantitySold" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="DestinationPostalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DestinationCountryCode" type="{urn:ebay:apis:eBLBaseComponents}CountryCodeType" minOccurs="0"/>
 *         &lt;element name="IncludeDetails" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetShippingCostsRequestType", propOrder = {
    "itemID",
    "quantitySold",
    "destinationPostalCode",
    "destinationCountryCode",
    "includeDetails"
})
public class GetShippingCostsRequestType
    extends AbstractRequestType
{

    @XmlElement(name = "ItemID")
    protected String itemID;
    @XmlElement(name = "QuantitySold")
    protected Integer quantitySold;
    @XmlElement(name = "DestinationPostalCode")
    protected String destinationPostalCode;
    @XmlElement(name = "DestinationCountryCode")
    @XmlSchemaType(name = "token")
    protected CountryCodeType destinationCountryCode;
    @XmlElement(name = "IncludeDetails")
    protected Boolean includeDetails;

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
     * destinationPostalCodeプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestinationPostalCode() {
        return destinationPostalCode;
    }

    /**
     * destinationPostalCodeプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestinationPostalCode(String value) {
        this.destinationPostalCode = value;
    }

    /**
     * destinationCountryCodeプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link CountryCodeType }
     *     
     */
    public CountryCodeType getDestinationCountryCode() {
        return destinationCountryCode;
    }

    /**
     * destinationCountryCodeプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link CountryCodeType }
     *     
     */
    public void setDestinationCountryCode(CountryCodeType value) {
        this.destinationCountryCode = value;
    }

    /**
     * includeDetailsプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeDetails() {
        return includeDetails;
    }

    /**
     * includeDetailsプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeDetails(Boolean value) {
        this.includeDetails = value;
    }

}
