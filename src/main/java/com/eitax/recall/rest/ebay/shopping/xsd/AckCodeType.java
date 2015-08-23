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
 * <p>AckCodeTypeのJavaクラス。
 * 
 * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
 * <p>
 * <pre>
 * &lt;simpleType name="AckCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Success"/>
 *     &lt;enumeration value="Failure"/>
 *     &lt;enumeration value="Warning"/>
 *     &lt;enumeration value="PartialFailure"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AckCodeType")
@XmlEnum
public enum AckCodeType {


    /**
     * 
     * 						(out) Request processing succeeded
     * 					
     * 
     */
    @XmlEnumValue("Success")
    SUCCESS("Success"),

    /**
     * 
     * 						(out) Request processing failed
     * 					
     * 
     */
    @XmlEnumValue("Failure")
    FAILURE("Failure"),

    /**
     * 
     * 						(out) Request processing completed with warning information
     * 						being included in the response message
     * 					 
     * 
     */
    @XmlEnumValue("Warning")
    WARNING("Warning"),

    /**
     * 
     * 						(out) Request processing completed with some failures.
     * 						See the Errors data to determine which portions of the request failed.
     * 					 
     * 
     */
    @XmlEnumValue("PartialFailure")
    PARTIAL_FAILURE("PartialFailure"),

    /**
     * 
     * 						(out) Reserved for internal or future use.
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    AckCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AckCodeType fromValue(String v) {
        for (AckCodeType c: AckCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
