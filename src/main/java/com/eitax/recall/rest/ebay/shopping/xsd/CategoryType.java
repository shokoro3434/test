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
 * 				Contains details about a category.
 * 			
 * 
 * <p>CategoryType complex typeのJavaクラス。
 * 
 * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
 * 
 * <pre>
 * &lt;complexType name="CategoryType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CategoryID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CategoryLevel" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="CategoryName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CategoryParentID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CategoryParentName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ItemCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="CategoryNamePath" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CategoryIDPath" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LeafCategory" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CategoryType", propOrder = {
    "categoryID",
    "categoryLevel",
    "categoryName",
    "categoryParentID",
    "categoryParentName",
    "itemCount",
    "categoryNamePath",
    "categoryIDPath",
    "leafCategory"
})
public class CategoryType {

    @XmlElement(name = "CategoryID")
    protected String categoryID;
    @XmlElement(name = "CategoryLevel")
    protected Integer categoryLevel;
    @XmlElement(name = "CategoryName")
    protected String categoryName;
    @XmlElement(name = "CategoryParentID")
    protected String categoryParentID;
    @XmlElement(name = "CategoryParentName")
    protected String categoryParentName;
    @XmlElement(name = "ItemCount")
    protected Integer itemCount;
    @XmlElement(name = "CategoryNamePath")
    protected String categoryNamePath;
    @XmlElement(name = "CategoryIDPath")
    protected String categoryIDPath;
    @XmlElement(name = "LeafCategory")
    protected Boolean leafCategory;

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
     * categoryLevelプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCategoryLevel() {
        return categoryLevel;
    }

    /**
     * categoryLevelプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCategoryLevel(Integer value) {
        this.categoryLevel = value;
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
     * categoryNamePathプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCategoryNamePath() {
        return categoryNamePath;
    }

    /**
     * categoryNamePathプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCategoryNamePath(String value) {
        this.categoryNamePath = value;
    }

    /**
     * categoryIDPathプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCategoryIDPath() {
        return categoryIDPath;
    }

    /**
     * categoryIDPathプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCategoryIDPath(String value) {
        this.categoryIDPath = value;
    }

    /**
     * leafCategoryプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLeafCategory() {
        return leafCategory;
    }

    /**
     * leafCategoryプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLeafCategory(Boolean value) {
        this.leafCategory = value;
    }

}
