//
// このファイルは、JavaTM Architecture for XML Binding(JAXB) Reference Implementation、v2.2.8-b130911.1802によって生成されました 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>を参照してください 
// ソース・スキーマの再コンパイル時にこのファイルの変更は失われます。 
// 生成日: 2015.08.14 時間 10:22:22 PM JST 
//


package com.eitan.recall.rest.amazon.xsd;

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
 *         &lt;element ref="{http://webservices.amazon.com/AWSECommerceService/2011-08-01}HTTPHeaders" minOccurs="0"/>
 *         &lt;element name="RequestId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element ref="{http://webservices.amazon.com/AWSECommerceService/2011-08-01}Arguments" minOccurs="0"/>
 *         &lt;element ref="{http://webservices.amazon.com/AWSECommerceService/2011-08-01}Errors" minOccurs="0"/>
 *         &lt;element name="RequestProcessingTime" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
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
    "httpHeaders",
    "requestId",
    "arguments",
    "errors",
    "requestProcessingTime"
})
@XmlRootElement(name = "OperationRequest")
public class OperationRequest {

    @XmlElement(name = "HTTPHeaders")
    protected HTTPHeaders httpHeaders;
    @XmlElement(name = "RequestId")
    protected String requestId;
    @XmlElement(name = "Arguments")
    protected Arguments arguments;
    @XmlElement(name = "Errors")
    protected Errors errors;
    @XmlElement(name = "RequestProcessingTime")
    protected Float requestProcessingTime;

    /**
     * httpHeadersプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link HTTPHeaders }
     *     
     */
    public HTTPHeaders getHTTPHeaders() {
        return httpHeaders;
    }

    /**
     * httpHeadersプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link HTTPHeaders }
     *     
     */
    public void setHTTPHeaders(HTTPHeaders value) {
        this.httpHeaders = value;
    }

    /**
     * requestIdプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestId() {
        return requestId;
    }

    /**
     * requestIdプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestId(String value) {
        this.requestId = value;
    }

    /**
     * argumentsプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link Arguments }
     *     
     */
    public Arguments getArguments() {
        return arguments;
    }

    /**
     * argumentsプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link Arguments }
     *     
     */
    public void setArguments(Arguments value) {
        this.arguments = value;
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

    /**
     * requestProcessingTimeプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getRequestProcessingTime() {
        return requestProcessingTime;
    }

    /**
     * requestProcessingTimeプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setRequestProcessingTime(Float value) {
        this.requestProcessingTime = value;
    }

}
