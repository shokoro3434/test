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
 * 			Information about an Half.com catalog product.
 * 			
 * 
 * <p>HalfCatalogProductType complex typeのJavaクラス。
 * 
 * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
 * 
 * <pre>
 * &lt;complexType name="HalfCatalogProductType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DetailsURL" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
 *         &lt;element name="StockPhotoURL" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
 *         &lt;element name="ShippingCostSummary" type="{urn:ebay:apis:eBLBaseComponents}ShippingCostSummaryType" minOccurs="0"/>
 *         &lt;element name="DisplayStockPhotos" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ItemCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ProductID" type="{urn:ebay:apis:eBLBaseComponents}ProductIDType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="DomainName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ItemSpecifics" type="{urn:ebay:apis:eBLBaseComponents}NameValueListArrayType" minOccurs="0"/>
 *         &lt;element name="ItemArray" type="{urn:ebay:apis:eBLBaseComponents}SimpleItemArrayType" minOccurs="0"/>
 *         &lt;element name="ReviewCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="MinPrice" type="{urn:ebay:apis:eBLBaseComponents}AmountType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HalfCatalogProductType", propOrder = {
    "title",
    "detailsURL",
    "stockPhotoURL",
    "shippingCostSummary",
    "displayStockPhotos",
    "itemCount",
    "productID",
    "domainName",
    "itemSpecifics",
    "itemArray",
    "reviewCount",
    "minPrice"
})
public class HalfCatalogProductType {

    @XmlElement(name = "Title")
    protected String title;
    @XmlElement(name = "DetailsURL")
    @XmlSchemaType(name = "anyURI")
    protected String detailsURL;
    @XmlElement(name = "StockPhotoURL")
    @XmlSchemaType(name = "anyURI")
    protected String stockPhotoURL;
    @XmlElement(name = "ShippingCostSummary")
    protected ShippingCostSummaryType shippingCostSummary;
    @XmlElement(name = "DisplayStockPhotos")
    protected Boolean displayStockPhotos;
    @XmlElement(name = "ItemCount")
    protected Integer itemCount;
    @XmlElement(name = "ProductID")
    protected List<ProductIDType> productID;
    @XmlElement(name = "DomainName")
    protected String domainName;
    @XmlElement(name = "ItemSpecifics")
    protected NameValueListArrayType itemSpecifics;
    @XmlElement(name = "ItemArray")
    protected SimpleItemArrayType itemArray;
    @XmlElement(name = "ReviewCount")
    protected Integer reviewCount;
    @XmlElement(name = "MinPrice")
    protected AmountType minPrice;

    /**
     * titleプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * titleプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * detailsURLプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDetailsURL() {
        return detailsURL;
    }

    /**
     * detailsURLプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDetailsURL(String value) {
        this.detailsURL = value;
    }

    /**
     * stockPhotoURLプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStockPhotoURL() {
        return stockPhotoURL;
    }

    /**
     * stockPhotoURLプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStockPhotoURL(String value) {
        this.stockPhotoURL = value;
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
     * displayStockPhotosプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDisplayStockPhotos() {
        return displayStockPhotos;
    }

    /**
     * displayStockPhotosプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDisplayStockPhotos(Boolean value) {
        this.displayStockPhotos = value;
    }

    /**
     * itemCountプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getItemCount() {
        return itemCount;
    }

    /**
     * itemCountプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setItemCount(Integer value) {
        this.itemCount = value;
    }

    /**
     * Gets the value of the productID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductIDType }
     * 
     * 
     */
    public List<ProductIDType> getProductID() {
        if (productID == null) {
            productID = new ArrayList<ProductIDType>();
        }
        return this.productID;
    }

    /**
     * domainNameプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDomainName() {
        return domainName;
    }

    /**
     * domainNameプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDomainName(String value) {
        this.domainName = value;
    }

    /**
     * itemSpecificsプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link NameValueListArrayType }
     *     
     */
    public NameValueListArrayType getItemSpecifics() {
        return itemSpecifics;
    }

    /**
     * itemSpecificsプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link NameValueListArrayType }
     *     
     */
    public void setItemSpecifics(NameValueListArrayType value) {
        this.itemSpecifics = value;
    }

    /**
     * itemArrayプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link SimpleItemArrayType }
     *     
     */
    public SimpleItemArrayType getItemArray() {
        return itemArray;
    }

    /**
     * itemArrayプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link SimpleItemArrayType }
     *     
     */
    public void setItemArray(SimpleItemArrayType value) {
        this.itemArray = value;
    }

    /**
     * reviewCountプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getReviewCount() {
        return reviewCount;
    }

    /**
     * reviewCountプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setReviewCount(Integer value) {
        this.reviewCount = value;
    }

    /**
     * minPriceプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getMinPrice() {
        return minPrice;
    }

    /**
     * minPriceプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setMinPrice(AmountType value) {
        this.minPrice = value;
    }

}
