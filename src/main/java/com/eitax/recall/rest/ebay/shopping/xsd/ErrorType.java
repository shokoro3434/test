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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * 
 * 				These are request errors (as opposed to system errors) that occur due to problems
 * 				with business-level data (e.g., an invalid combination of arguments) that
 * 				the application passed in.
 * 			
 * 
 * <p>ErrorType complex typeのJavaクラス。
 * 
 * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
 * 
 * <pre>
 * &lt;complexType name="ErrorType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ShortMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LongMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ErrorCode" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *         &lt;element name="UserDisplayHint" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="SeverityCode" type="{urn:ebay:apis:eBLBaseComponents}SeverityCodeType" minOccurs="0"/>
 *         &lt;element name="ErrorParameters" type="{urn:ebay:apis:eBLBaseComponents}ErrorParameterType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ErrorClassification" type="{urn:ebay:apis:eBLBaseComponents}ErrorClassificationCodeType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ErrorType", propOrder = {
    "shortMessage",
    "longMessage",
    "errorCode",
    "userDisplayHint",
    "severityCode",
    "errorParameters",
    "errorClassification"
})
public class ErrorType {

    @XmlElement(name = "ShortMessage")
    protected String shortMessage;
    @XmlElement(name = "LongMessage")
    protected String longMessage;
    @XmlElement(name = "ErrorCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String errorCode;
    @XmlElement(name = "UserDisplayHint")
    protected Boolean userDisplayHint;
    @XmlElement(name = "SeverityCode")
    @XmlSchemaType(name = "token")
    protected SeverityCodeType severityCode;
    @XmlElement(name = "ErrorParameters")
    protected List<ErrorParameterType> errorParameters;
    @XmlElement(name = "ErrorClassification")
    @XmlSchemaType(name = "token")
    protected ErrorClassificationCodeType errorClassification;

    /**
     * shortMessageプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShortMessage() {
        return shortMessage;
    }

    /**
     * shortMessageプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShortMessage(String value) {
        this.shortMessage = value;
    }

    /**
     * longMessageプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLongMessage() {
        return longMessage;
    }

    /**
     * longMessageプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLongMessage(String value) {
        this.longMessage = value;
    }

    /**
     * errorCodeプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorCode() {
        return errorCode;
    }

    /**
     * errorCodeプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorCode(String value) {
        this.errorCode = value;
    }

    /**
     * userDisplayHintプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUserDisplayHint() {
        return userDisplayHint;
    }

    /**
     * userDisplayHintプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUserDisplayHint(Boolean value) {
        this.userDisplayHint = value;
    }

    /**
     * severityCodeプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link SeverityCodeType }
     *     
     */
    public SeverityCodeType getSeverityCode() {
        return severityCode;
    }

    /**
     * severityCodeプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link SeverityCodeType }
     *     
     */
    public void setSeverityCode(SeverityCodeType value) {
        this.severityCode = value;
    }

    /**
     * Gets the value of the errorParameters property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the errorParameters property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getErrorParameters().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ErrorParameterType }
     * 
     * 
     */
    public List<ErrorParameterType> getErrorParameters() {
        if (errorParameters == null) {
            errorParameters = new ArrayList<ErrorParameterType>();
        }
        return this.errorParameters;
    }

    /**
     * errorClassificationプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link ErrorClassificationCodeType }
     *     
     */
    public ErrorClassificationCodeType getErrorClassification() {
        return errorClassification;
    }

    /**
     * errorClassificationプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link ErrorClassificationCodeType }
     *     
     */
    public void setErrorClassification(ErrorClassificationCodeType value) {
        this.errorClassification = value;
    }

}
