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
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * 
 * 				Contains the category data for the eBay site specified as input. The category
 * 				data is returned as a CategoryArrayType object, that contains zero, one, or
 * 				multiple CategoryType objects. Each CategoryType object contains the detail data
 * 				for one category. Other fields indicate how many categories are returned in a call, when the category hierarchy was last updated, and the version of the category hierarchy (all three of which can differ from one eBay site to the next).
 * 			
 * 
 * <p>GetCategoryInfoResponseType complex typeのJavaクラス。
 * 
 * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
 * 
 * <pre>
 * &lt;complexType name="GetCategoryInfoResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractResponseType">
 *       &lt;sequence>
 *         &lt;element name="CategoryArray" type="{urn:ebay:apis:eBLBaseComponents}CategoryArrayType" minOccurs="0"/>
 *         &lt;element name="CategoryCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="UpdateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="CategoryVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetCategoryInfoResponseType", propOrder = {
    "categoryArray",
    "categoryCount",
    "updateTime",
    "categoryVersion"
})
public class GetCategoryInfoResponseType
    extends AbstractResponseType
{

    @XmlElement(name = "CategoryArray")
    protected CategoryArrayType categoryArray;
    @XmlElement(name = "CategoryCount")
    protected Integer categoryCount;
    @XmlElement(name = "UpdateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar updateTime;
    @XmlElement(name = "CategoryVersion")
    protected String categoryVersion;

    /**
     * categoryArrayプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link CategoryArrayType }
     *     
     */
    public CategoryArrayType getCategoryArray() {
        return categoryArray;
    }

    /**
     * categoryArrayプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link CategoryArrayType }
     *     
     */
    public void setCategoryArray(CategoryArrayType value) {
        this.categoryArray = value;
    }

    /**
     * categoryCountプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCategoryCount() {
        return categoryCount;
    }

    /**
     * categoryCountプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCategoryCount(Integer value) {
        this.categoryCount = value;
    }

    /**
     * updateTimeプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getUpdateTime() {
        return updateTime;
    }

    /**
     * updateTimeプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setUpdateTime(XMLGregorianCalendar value) {
        this.updateTime = value;
    }

    /**
     * categoryVersionプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCategoryVersion() {
        return categoryVersion;
    }

    /**
     * categoryVersionプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCategoryVersion(String value) {
        this.categoryVersion = value;
    }

}
