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
 * 				Retrieves the words most frequently used by eBay users when searching for listings.
 * 				These keywords are generated weekly by eBay. Thus, calls retrieve static data.
 * 				FindPopularSearches is not available for the following sites: FR, HK, MY, PH, PL, SG, SE.
 * 			
 * 
 * <p>FindPopularSearchesRequestType complex typeのJavaクラス。
 * 
 * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
 * 
 * <pre>
 * &lt;complexType name="FindPopularSearchesRequestType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractRequestType">
 *       &lt;sequence>
 *         &lt;element name="CategoryID" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="QueryKeywords" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="MaxKeywords" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="MaxResultsPerPage" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="PageNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="IncludeChildCategories" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FindPopularSearchesRequestType", propOrder = {
    "categoryID",
    "queryKeywords",
    "maxKeywords",
    "maxResultsPerPage",
    "pageNumber",
    "includeChildCategories"
})
public class FindPopularSearchesRequestType
    extends AbstractRequestType
{

    @XmlElement(name = "CategoryID")
    protected List<String> categoryID;
    @XmlElement(name = "QueryKeywords")
    protected List<String> queryKeywords;
    @XmlElement(name = "MaxKeywords")
    protected Integer maxKeywords;
    @XmlElement(name = "MaxResultsPerPage")
    protected Integer maxResultsPerPage;
    @XmlElement(name = "PageNumber")
    protected Integer pageNumber;
    @XmlElement(name = "IncludeChildCategories")
    protected Boolean includeChildCategories;

    /**
     * Gets the value of the categoryID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the categoryID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCategoryID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getCategoryID() {
        if (categoryID == null) {
            categoryID = new ArrayList<String>();
        }
        return this.categoryID;
    }

    /**
     * Gets the value of the queryKeywords property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the queryKeywords property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQueryKeywords().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getQueryKeywords() {
        if (queryKeywords == null) {
            queryKeywords = new ArrayList<String>();
        }
        return this.queryKeywords;
    }

    /**
     * maxKeywordsプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxKeywords() {
        return maxKeywords;
    }

    /**
     * maxKeywordsプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxKeywords(Integer value) {
        this.maxKeywords = value;
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
     * includeChildCategoriesプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeChildCategories() {
        return includeChildCategories;
    }

    /**
     * includeChildCategoriesプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeChildCategories(Boolean value) {
        this.includeChildCategories = value;
    }

}
