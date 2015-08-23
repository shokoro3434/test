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


/**
 * 
 * 				Contains an ISBN value, EAN value, UPC value, ticket keywords, or eBay
 * 				catalog product ID, plus other meta-data. For event tickets, this type
 * 				can contain a set of keywords that uniquely identify the product. Only
 * 				applicable to certain categories that support Pre-filled Item
 * 				Information.
 * 			
 * 
 * <p>ExternalProductIDType complex typeのJavaクラス。
 * 
 * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
 * 
 * <pre>
 * &lt;complexType name="ExternalProductIDType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Value" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ReturnSearchResultOnDuplicates" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Type" type="{urn:ebay:apis:eBLBaseComponents}ExternalProductCodeType" minOccurs="0"/>
 *         &lt;element name="AlternateValue" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExternalProductIDType", propOrder = {
    "value",
    "returnSearchResultOnDuplicates",
    "type",
    "alternateValue"
})
public class ExternalProductIDType {

    @XmlElement(name = "Value")
    protected String value;
    @XmlElement(name = "ReturnSearchResultOnDuplicates")
    protected Boolean returnSearchResultOnDuplicates;
    @XmlElement(name = "Type")
    @XmlSchemaType(name = "token")
    protected ExternalProductCodeType type;
    @XmlElement(name = "AlternateValue")
    protected List<String> alternateValue;

    /**
     * valueプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * valueプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * returnSearchResultOnDuplicatesプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReturnSearchResultOnDuplicates() {
        return returnSearchResultOnDuplicates;
    }

    /**
     * returnSearchResultOnDuplicatesプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReturnSearchResultOnDuplicates(Boolean value) {
        this.returnSearchResultOnDuplicates = value;
    }

    /**
     * typeプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link ExternalProductCodeType }
     *     
     */
    public ExternalProductCodeType getType() {
        return type;
    }

    /**
     * typeプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link ExternalProductCodeType }
     *     
     */
    public void setType(ExternalProductCodeType value) {
        this.type = value;
    }

    /**
     * Gets the value of the alternateValue property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the alternateValue property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAlternateValue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getAlternateValue() {
        if (alternateValue == null) {
            alternateValue = new ArrayList<String>();
        }
        return this.alternateValue;
    }

}
