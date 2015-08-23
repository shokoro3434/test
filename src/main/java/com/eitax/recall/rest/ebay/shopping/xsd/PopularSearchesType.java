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
 * 				Contains search word information, as it is related to a category.
 * 			
 * 
 * <p>PopularSearchesType complex typeのJavaクラス。
 * 
 * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
 * 
 * <pre>
 * &lt;complexType name="PopularSearchesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CategoryID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CategoryParentID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="QueryKeywords" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AlternativeSearches" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RelatedSearches" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CategoryName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CategoryParentName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PopularSearchesType", propOrder = {
    "categoryID",
    "categoryParentID",
    "queryKeywords",
    "alternativeSearches",
    "relatedSearches",
    "categoryName",
    "categoryParentName"
})
public class PopularSearchesType {

    @XmlElement(name = "CategoryID")
    protected String categoryID;
    @XmlElement(name = "CategoryParentID")
    protected String categoryParentID;
    @XmlElement(name = "QueryKeywords")
    protected String queryKeywords;
    @XmlElement(name = "AlternativeSearches")
    protected String alternativeSearches;
    @XmlElement(name = "RelatedSearches")
    protected String relatedSearches;
    @XmlElement(name = "CategoryName")
    protected String categoryName;
    @XmlElement(name = "CategoryParentName")
    protected String categoryParentName;

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
     * categoryParentIDプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCategoryParentID() {
        return categoryParentID;
    }

    /**
     * categoryParentIDプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCategoryParentID(String value) {
        this.categoryParentID = value;
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
     * alternativeSearchesプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlternativeSearches() {
        return alternativeSearches;
    }

    /**
     * alternativeSearchesプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlternativeSearches(String value) {
        this.alternativeSearches = value;
    }

    /**
     * relatedSearchesプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelatedSearches() {
        return relatedSearches;
    }

    /**
     * relatedSearchesプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelatedSearches(String value) {
        this.relatedSearches = value;
    }

    /**
     * categoryNameプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCategoryName() {
        return categoryName;
    }

    /**
     * categoryNameプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCategoryName(String value) {
        this.categoryName = value;
    }

    /**
     * categoryParentNameプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCategoryParentName() {
        return categoryParentName;
    }

    /**
     * categoryParentNameプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCategoryParentName(String value) {
        this.categoryParentName = value;
    }

}
