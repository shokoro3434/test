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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				Base type definition of the request payload, which can carry any type
 * 				of payload content plus optional versioning information and detail level requirements.
 * 				All concrete request types are derived from the abstract request type.
 * 				The naming convention we use for the concrete type names is the name of the service
 * 				(the verb or call name) followed by "RequestType": VerbNameRequestType
 * 			
 * 
 * <p>AbstractRequestType complex typeのJavaクラス。
 * 
 * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
 * 
 * <pre>
 * &lt;complexType name="AbstractRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MessageID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbstractRequestType", propOrder = {
    "messageID"
})
@XmlSeeAlso({
    GetUserProfileRequestType.class,
    FindHalfProductsRequestType.class,
    GetItemStatusRequestType.class,
    GeteBayTimeRequestType.class,
    FindPopularSearchesRequestType.class,
    FindPopularItemsRequestType.class,
    FindReviewsAndGuidesRequestType.class,
    GetCategoryInfoRequestType.class,
    GetMultipleItemsRequestType.class,
    FindProductsRequestType.class,
    GetShippingCostsRequestType.class,
    GetSingleItemRequestType.class
})
public abstract class AbstractRequestType {

    @XmlElement(name = "MessageID")
    protected String messageID;

    /**
     * messageIDプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageID() {
        return messageID;
    }

    /**
     * messageIDプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessageID(String value) {
        this.messageID = value;
    }

}
