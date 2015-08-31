//
// このファイルは、JavaTM Architecture for XML Binding(JAXB) Reference Implementation、v2.2.8-b130911.1802によって生成されました 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>を参照してください 
// ソース・スキーマの再コンパイル時にこのファイルの変更は失われます。 
// 生成日: 2015.08.14 時間 10:22:22 PM JST 
//


package com.eitax.recall.amazon.xsd;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>anonymous complex typeのJavaクラス。
 * 
 * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IsValid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BrowseNodeLookupRequest" type="{http://webservices.amazon.com/AWSECommerceService/2011-08-01}BrowseNodeLookupRequest" minOccurs="0"/>
 *         &lt;element name="ItemSearchRequest" type="{http://webservices.amazon.com/AWSECommerceService/2011-08-01}ItemSearchRequest" minOccurs="0"/>
 *         &lt;element name="ItemLookupRequest" type="{http://webservices.amazon.com/AWSECommerceService/2011-08-01}ItemLookupRequest" minOccurs="0"/>
 *         &lt;element name="SimilarityLookupRequest" type="{http://webservices.amazon.com/AWSECommerceService/2011-08-01}SimilarityLookupRequest" minOccurs="0"/>
 *         &lt;element name="CartGetRequest" type="{http://webservices.amazon.com/AWSECommerceService/2011-08-01}CartGetRequest" minOccurs="0"/>
 *         &lt;element name="CartAddRequest" type="{http://webservices.amazon.com/AWSECommerceService/2011-08-01}CartAddRequest" minOccurs="0"/>
 *         &lt;element name="CartCreateRequest" type="{http://webservices.amazon.com/AWSECommerceService/2011-08-01}CartCreateRequest" minOccurs="0"/>
 *         &lt;element name="CartModifyRequest" type="{http://webservices.amazon.com/AWSECommerceService/2011-08-01}CartModifyRequest" minOccurs="0"/>
 *         &lt;element name="CartClearRequest" type="{http://webservices.amazon.com/AWSECommerceService/2011-08-01}CartClearRequest" minOccurs="0"/>
 *         &lt;element ref="{http://webservices.amazon.com/AWSECommerceService/2011-08-01}Errors" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "isValid",
    "browseNodeLookupRequest",
    "itemSearchRequest",
    "itemLookupRequest",
    "similarityLookupRequest",
    "cartGetRequest",
    "cartAddRequest",
    "cartCreateRequest",
    "cartModifyRequest",
    "cartClearRequest",
    "errors"
})
@XmlRootElement(name = "Request")
public class Request {

    @XmlElement(name = "IsValid")
    protected String isValid;
    @XmlElement(name = "BrowseNodeLookupRequest")
    protected BrowseNodeLookupRequest browseNodeLookupRequest;
    @XmlElement(name = "ItemSearchRequest")
    protected ItemSearchRequest itemSearchRequest;
    @XmlElement(name = "ItemLookupRequest")
    protected ItemLookupRequest itemLookupRequest;
    @XmlElement(name = "SimilarityLookupRequest")
    protected SimilarityLookupRequest similarityLookupRequest;
    @XmlElement(name = "CartGetRequest")
    protected CartGetRequest cartGetRequest;
    @XmlElement(name = "CartAddRequest")
    protected CartAddRequest cartAddRequest;
    @XmlElement(name = "CartCreateRequest")
    protected CartCreateRequest cartCreateRequest;
    @XmlElement(name = "CartModifyRequest")
    protected CartModifyRequest cartModifyRequest;
    @XmlElement(name = "CartClearRequest")
    protected CartClearRequest cartClearRequest;
    @XmlElement(name = "Errors")
    protected Errors errors;

    /**
     * isValidプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsValid() {
        return isValid;
    }

    /**
     * isValidプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsValid(String value) {
        this.isValid = value;
    }

    /**
     * browseNodeLookupRequestプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link BrowseNodeLookupRequest }
     *     
     */
    public BrowseNodeLookupRequest getBrowseNodeLookupRequest() {
        return browseNodeLookupRequest;
    }

    /**
     * browseNodeLookupRequestプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link BrowseNodeLookupRequest }
     *     
     */
    public void setBrowseNodeLookupRequest(BrowseNodeLookupRequest value) {
        this.browseNodeLookupRequest = value;
    }

    /**
     * itemSearchRequestプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link ItemSearchRequest }
     *     
     */
    public ItemSearchRequest getItemSearchRequest() {
        return itemSearchRequest;
    }

    /**
     * itemSearchRequestプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link ItemSearchRequest }
     *     
     */
    public void setItemSearchRequest(ItemSearchRequest value) {
        this.itemSearchRequest = value;
    }

    /**
     * itemLookupRequestプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link ItemLookupRequest }
     *     
     */
    public ItemLookupRequest getItemLookupRequest() {
        return itemLookupRequest;
    }

    /**
     * itemLookupRequestプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link ItemLookupRequest }
     *     
     */
    public void setItemLookupRequest(ItemLookupRequest value) {
        this.itemLookupRequest = value;
    }

    /**
     * similarityLookupRequestプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link SimilarityLookupRequest }
     *     
     */
    public SimilarityLookupRequest getSimilarityLookupRequest() {
        return similarityLookupRequest;
    }

    /**
     * similarityLookupRequestプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link SimilarityLookupRequest }
     *     
     */
    public void setSimilarityLookupRequest(SimilarityLookupRequest value) {
        this.similarityLookupRequest = value;
    }

    /**
     * cartGetRequestプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link CartGetRequest }
     *     
     */
    public CartGetRequest getCartGetRequest() {
        return cartGetRequest;
    }

    /**
     * cartGetRequestプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link CartGetRequest }
     *     
     */
    public void setCartGetRequest(CartGetRequest value) {
        this.cartGetRequest = value;
    }

    /**
     * cartAddRequestプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link CartAddRequest }
     *     
     */
    public CartAddRequest getCartAddRequest() {
        return cartAddRequest;
    }

    /**
     * cartAddRequestプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link CartAddRequest }
     *     
     */
    public void setCartAddRequest(CartAddRequest value) {
        this.cartAddRequest = value;
    }

    /**
     * cartCreateRequestプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link CartCreateRequest }
     *     
     */
    public CartCreateRequest getCartCreateRequest() {
        return cartCreateRequest;
    }

    /**
     * cartCreateRequestプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link CartCreateRequest }
     *     
     */
    public void setCartCreateRequest(CartCreateRequest value) {
        this.cartCreateRequest = value;
    }

    /**
     * cartModifyRequestプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link CartModifyRequest }
     *     
     */
    public CartModifyRequest getCartModifyRequest() {
        return cartModifyRequest;
    }

    /**
     * cartModifyRequestプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link CartModifyRequest }
     *     
     */
    public void setCartModifyRequest(CartModifyRequest value) {
        this.cartModifyRequest = value;
    }

    /**
     * cartClearRequestプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link CartClearRequest }
     *     
     */
    public CartClearRequest getCartClearRequest() {
        return cartClearRequest;
    }

    /**
     * cartClearRequestプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link CartClearRequest }
     *     
     */
    public void setCartClearRequest(CartClearRequest value) {
        this.cartClearRequest = value;
    }

    /**
     * errorsプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link Errors }
     *     
     */
    public Errors getErrors() {
        return errors;
    }

    /**
     * errorsプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link Errors }
     *     
     */
    public void setErrors(Errors value) {
        this.errors = value;
    }

}
