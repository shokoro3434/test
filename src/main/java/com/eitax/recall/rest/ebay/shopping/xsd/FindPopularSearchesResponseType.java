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
 * 				Contains the keyword data for the requested categories. A category's data are contained
 * 				in a CategoryArrayType object if there is no error (one or more CategoryType objects).
 * 				Returns category data as well as related search data.
 * 			
 * 
 * <p>FindPopularSearchesResponseType complex typeのJavaクラス。
 * 
 * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
 * 
 * <pre>
 * &lt;complexType name="FindPopularSearchesResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractResponseType">
 *       &lt;sequence>
 *         &lt;element name="PopularSearchResult" type="{urn:ebay:apis:eBLBaseComponents}PopularSearchesType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PageNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="TotalPages" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FindPopularSearchesResponseType", propOrder = {
    "popularSearchResult",
    "pageNumber",
    "totalPages"
})
public class FindPopularSearchesResponseType
    extends AbstractResponseType
{

    @XmlElement(name = "PopularSearchResult")
    protected List<PopularSearchesType> popularSearchResult;
    @XmlElement(name = "PageNumber")
    protected Integer pageNumber;
    @XmlElement(name = "TotalPages")
    protected Integer totalPages;

    /**
     * Gets the value of the popularSearchResult property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the popularSearchResult property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPopularSearchResult().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PopularSearchesType }
     * 
     * 
     */
    public List<PopularSearchesType> getPopularSearchResult() {
        if (popularSearchResult == null) {
            popularSearchResult = new ArrayList<PopularSearchesType>();
        }
        return this.popularSearchResult;
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
     * totalPagesプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTotalPages() {
        return totalPages;
    }

    /**
     * totalPagesプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTotalPages(Integer value) {
        this.totalPages = value;
    }

}
