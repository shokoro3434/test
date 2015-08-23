//
// このファイルは、JavaTM Architecture for XML Binding(JAXB) Reference Implementation、v2.2.8-b130911.1802によって生成されました 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>を参照してください 
// ソース・スキーマの再コンパイル時にこのファイルの変更は失われます。 
// 生成日: 2015.08.24 時間 02:38:24 AM JST 
//


package com.eitax.recall.rest.ebay.shopping.xsd;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>CharityStatusCodeTypeのJavaクラス。
 * 
 * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
 * <p>
 * <pre>
 * &lt;simpleType name="CharityStatusCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Valid"/>
 *     &lt;enumeration value="NoLongerValid"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CharityStatusCodeType")
@XmlEnum
public enum CharityStatusCodeType {


    /**
     * 
     * 					  (out)	The specified nonprofit charity organization is a valid nonprofit charity organization according to the requirements of the dedicated eBay Giving Works provider.
     * 					
     * 
     */
    @XmlEnumValue("Valid")
    VALID("Valid"),

    /**
     * 
     * 					  (out)	The specified nonprofit charity organization is no longer a valid nonprofit charity organization according to the requirements of the dedicated eBay Giving Works provider.
     * 					
     * 
     */
    @XmlEnumValue("NoLongerValid")
    NO_LONGER_VALID("NoLongerValid"),

    /**
     * 
     * 						(out) Reserved for internal or future use.
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    CharityStatusCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CharityStatusCodeType fromValue(String v) {
        for (CharityStatusCodeType c: CharityStatusCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
