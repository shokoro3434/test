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
 * 			Returns stock product information in Half.com catalogs, such as
 * 			information about a particular DVD or book. Optionally,
 * 			also returns items that match the product.
 * 			
 * 
 * <p>FindHalfProductsResponseType complex typeのJavaクラス。
 * 
 * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
 * 
 * <pre>
 * &lt;complexType name="FindHalfProductsResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractResponseType">
 *       &lt;sequence>
 *         &lt;element name="DomainHistogram" type="{urn:ebay:apis:eBLBaseComponents}DomainHistogramType" minOccurs="0"/>
 *         &lt;element name="PageNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ApproximatePages" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="MoreResults" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="TotalProducts" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Products" type="{urn:ebay:apis:eBLBaseComponents}HalfProductsType" minOccurs="0"/>
 *         &lt;element name="ProductSearchURL" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FindHalfProductsResponseType", propOrder = {
    "domainHistogram",
    "pageNumber",
    "approximatePages",
    "moreResults",
    "totalProducts",
    "products",
    "productSearchURL"
})
public class FindHalfProductsResponseType
    extends AbstractResponseType
{

    @XmlElement(name = "DomainHistogram")
    protected DomainHistogramType domainHistogram;
    @XmlElement(name = "PageNumber")
    protected Integer pageNumber;
    @XmlElement(name = "ApproximatePages")
    protected Integer approximatePages;
    @XmlElement(name = "MoreResults")
    protected Boolean moreResults;
    @XmlElement(name = "TotalProducts")
    protected Integer totalProducts;
    @XmlElement(name = "Products")
    protected HalfProductsType products;
    @XmlElement(name = "ProductSearchURL")
    @XmlSchemaType(name = "anyURI")
    protected String productSearchURL;

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
     * productsプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link HalfProductsType }
     *     
     */
    public HalfProductsType getProducts() {
        return products;
    }

    /**
     * productsプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link HalfProductsType }
     *     
     */
    public void setProducts(HalfProductsType value) {
        this.products = value;
    }

    /**
     * productSearchURLプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductSearchURL() {
        return productSearchURL;
    }

    /**
     * productSearchURLプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductSearchURL(String value) {
        this.productSearchURL = value;
    }

}
