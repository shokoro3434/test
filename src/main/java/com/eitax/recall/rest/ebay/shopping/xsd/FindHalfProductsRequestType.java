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
 * 				Searches Half.com for stock product information (stock description
 * 				and Item Specifics), such as information about a particular
 * 				kind of DVD or book. Also, retrieves up to 30 Half.com listings associated
 * 				with a product.
 * 			
 * 
 * <p>FindHalfProductsRequestType complex typeのJavaクラス。
 * 
 * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
 * 
 * <pre>
 * &lt;complexType name="FindHalfProductsRequestType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractRequestType">
 *       &lt;sequence>
 *         &lt;element name="IncludeSelector" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AvailableItemsOnly" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="DomainName" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ProductID" type="{urn:ebay:apis:eBLBaseComponents}ProductIDType" minOccurs="0"/>
 *         &lt;element name="QueryKeywords" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SellerID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProductSort" type="{urn:ebay:apis:eBLBaseComponents}ProductSortCodeType" minOccurs="0"/>
 *         &lt;element name="SortOrder" type="{urn:ebay:apis:eBLBaseComponents}SortOrderCodeType" minOccurs="0"/>
 *         &lt;element name="MaxEntries" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="PageNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FindHalfProductsRequestType", propOrder = {
    "includeSelector",
    "availableItemsOnly",
    "domainName",
    "productID",
    "queryKeywords",
    "sellerID",
    "productSort",
    "sortOrder",
    "maxEntries",
    "pageNumber"
})
public class FindHalfProductsRequestType
    extends AbstractRequestType
{

    @XmlElement(name = "IncludeSelector")
    protected String includeSelector;
    @XmlElement(name = "AvailableItemsOnly")
    protected Boolean availableItemsOnly;
    @XmlElement(name = "DomainName")
    protected List<String> domainName;
    @XmlElement(name = "ProductID")
    protected ProductIDType productID;
    @XmlElement(name = "QueryKeywords")
    protected String queryKeywords;
    @XmlElement(name = "SellerID")
    protected String sellerID;
    @XmlElement(name = "ProductSort")
    @XmlSchemaType(name = "token")
    protected ProductSortCodeType productSort;
    @XmlElement(name = "SortOrder")
    @XmlSchemaType(name = "token")
    protected SortOrderCodeType sortOrder;
    @XmlElement(name = "MaxEntries")
    protected Integer maxEntries;
    @XmlElement(name = "PageNumber")
    protected Integer pageNumber;

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

    /**
     * availableItemsOnlyプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAvailableItemsOnly() {
        return availableItemsOnly;
    }

    /**
     * availableItemsOnlyプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAvailableItemsOnly(Boolean value) {
        this.availableItemsOnly = value;
    }

    /**
     * Gets the value of the domainName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the domainName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDomainName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getDomainName() {
        if (domainName == null) {
            domainName = new ArrayList<String>();
        }
        return this.domainName;
    }

    /**
     * productIDプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link ProductIDType }
     *     
     */
    public ProductIDType getProductID() {
        return productID;
    }

    /**
     * productIDプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link ProductIDType }
     *     
     */
    public void setProductID(ProductIDType value) {
        this.productID = value;
    }

    /**
     * queryKeywordsプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQueryKeywords() {
        return queryKeywords;
    }

    /**
     * queryKeywordsプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQueryKeywords(String value) {
        this.queryKeywords = value;
    }

    /**
     * sellerIDプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSellerID() {
        return sellerID;
    }

    /**
     * sellerIDプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSellerID(String value) {
        this.sellerID = value;
    }

    /**
     * productSortプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link ProductSortCodeType }
     *     
     */
    public ProductSortCodeType getProductSort() {
        return productSort;
    }

    /**
     * productSortプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link ProductSortCodeType }
     *     
     */
    public void setProductSort(ProductSortCodeType value) {
        this.productSort = value;
    }

    /**
     * sortOrderプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link SortOrderCodeType }
     *     
     */
    public SortOrderCodeType getSortOrder() {
        return sortOrder;
    }

    /**
     * sortOrderプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link SortOrderCodeType }
     *     
     */
    public void setSortOrder(SortOrderCodeType value) {
        this.sortOrder = value;
    }

    /**
     * maxEntriesプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxEntries() {
        return maxEntries;
    }

    /**
     * maxEntriesプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxEntries(Integer value) {
        this.maxEntries = value;
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

}
