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
 * 				Splitting include reviews and guides from GetProducts.
 * 			
 * 
 * <p>FindReviewsAndGuidesRequestType complex typeのJavaクラス。
 * 
 * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
 * 
 * <pre>
 * &lt;complexType name="FindReviewsAndGuidesRequestType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractRequestType">
 *       &lt;sequence>
 *         &lt;element name="ProductID" type="{urn:ebay:apis:eBLBaseComponents}ProductIDType" minOccurs="0"/>
 *         &lt;element name="UserID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CategoryID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MaxResultsPerPage" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="PageNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ReviewSort" type="{urn:ebay:apis:eBLBaseComponents}ReviewSortCodeType" minOccurs="0"/>
 *         &lt;element name="SortOrder" type="{urn:ebay:apis:eBLBaseComponents}SortOrderCodeType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FindReviewsAndGuidesRequestType", propOrder = {
    "productID",
    "userID",
    "categoryID",
    "maxResultsPerPage",
    "pageNumber",
    "reviewSort",
    "sortOrder"
})
public class FindReviewsAndGuidesRequestType
    extends AbstractRequestType
{

    @XmlElement(name = "ProductID")
    protected ProductIDType productID;
    @XmlElement(name = "UserID")
    protected String userID;
    @XmlElement(name = "CategoryID")
    protected String categoryID;
    @XmlElement(name = "MaxResultsPerPage")
    protected Integer maxResultsPerPage;
    @XmlElement(name = "PageNumber")
    protected Integer pageNumber;
    @XmlElement(name = "ReviewSort")
    @XmlSchemaType(name = "token")
    protected ReviewSortCodeType reviewSort;
    @XmlElement(name = "SortOrder")
    @XmlSchemaType(name = "token")
    protected SortOrderCodeType sortOrder;

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
     * userIDプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserID() {
        return userID;
    }

    /**
     * userIDプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserID(String value) {
        this.userID = value;
    }

    /**
     * categoryIDプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCategoryID() {
        return categoryID;
    }

    /**
     * categoryIDプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCategoryID(String value) {
        this.categoryID = value;
    }

    /**
     * maxResultsPerPageプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxResultsPerPage() {
        return maxResultsPerPage;
    }

    /**
     * maxResultsPerPageプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxResultsPerPage(Integer value) {
        this.maxResultsPerPage = value;
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
     * reviewSortプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link ReviewSortCodeType }
     *     
     */
    public ReviewSortCodeType getReviewSort() {
        return reviewSort;
    }

    /**
     * reviewSortプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link ReviewSortCodeType }
     *     
     */
    public void setReviewSort(ReviewSortCodeType value) {
        this.reviewSort = value;
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

}
