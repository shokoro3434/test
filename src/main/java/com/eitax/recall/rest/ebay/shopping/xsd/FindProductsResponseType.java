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
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				Returns stock product information in eBay catalogs, such as
 * 				information about a particular DVD or camera. Optionally,
 * 				also returns items that match the product.
 * 			
 * 
 * <p>FindProductsResponseType complex typeのJavaクラス。
 * 
 * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
 * 
 * <pre>
 * &lt;complexType name="FindProductsResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractResponseType">
 *       &lt;sequence>
 *         &lt;element name="ApproximatePages" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="MoreResults" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="DomainHistogram" type="{urn:ebay:apis:eBLBaseComponents}DomainHistogramType" minOccurs="0"/>
 *         &lt;element name="ItemArray" type="{urn:ebay:apis:eBLBaseComponents}SimpleItemArrayType" minOccurs="0"/>
 *         &lt;element name="PageNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Product" type="{urn:ebay:apis:eBLBaseComponents}CatalogProductType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="TotalProducts" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="DuplicateItems" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FindProductsResponseType", propOrder = {
    "approximatePages",
    "moreResults",
    "domainHistogram",
    "itemArray",
    "pageNumber",
    "product",
    "totalProducts",
    "duplicateItems"
})
public class FindProductsResponseType
    extends AbstractResponseType
{

    @XmlElement(name = "ApproximatePages")
    protected Integer approximatePages;
    @XmlElement(name = "MoreResults")
    protected Boolean moreResults;
    @XmlElement(name = "DomainHistogram")
    protected DomainHistogramType domainHistogram;
    @XmlElement(name = "ItemArray")
    protected SimpleItemArrayType itemArray;
    @XmlElement(name = "PageNumber")
    protected Integer pageNumber;
    @XmlElement(name = "Product")
    protected List<CatalogProductType> product;
    @XmlElement(name = "TotalProducts")
    protected Integer totalProducts;
    @XmlElement(name = "DuplicateItems")
    protected Boolean duplicateItems;

    /**
     * approximatePagesプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getApproximatePages() {
        return approximatePages;
    }

    /**
     * approximatePagesプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setApproximatePages(Integer value) {
        this.approximatePages = value;
    }

    /**
     * moreResultsプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMoreResults() {
        return moreResults;
    }

    /**
     * moreResultsプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMoreResults(Boolean value) {
        this.moreResults = value;
    }

    /**
     * domainHistogramプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link DomainHistogramType }
     *     
     */
    public DomainHistogramType getDomainHistogram() {
        return domainHistogram;
    }

    /**
     * domainHistogramプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link DomainHistogramType }
     *     
     */
    public void setDomainHistogram(DomainHistogramType value) {
        this.domainHistogram = value;
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
     * pageNumberプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPageNumber() {
        return pageNumber;
    }

    /**
     * pageNumberプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPageNumber(Integer value) {
        this.pageNumber = value;
    }

    /**
     * Gets the value of the product property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the product property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProduct().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CatalogProductType }
     * 
     * 
     */
    public List<CatalogProductType> getProduct() {
        if (product == null) {
            product = new ArrayList<CatalogProductType>();
        }
        return this.product;
    }

    /**
     * totalProductsプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTotalProducts() {
        return totalProducts;
    }

    /**
     * totalProductsプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTotalProducts(Integer value) {
        this.totalProducts = value;
    }

    /**
     * duplicateItemsプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDuplicateItems() {
        return duplicateItems;
    }

    /**
     * duplicateItemsプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDuplicateItems(Boolean value) {
        this.duplicateItems = value;
    }

}
