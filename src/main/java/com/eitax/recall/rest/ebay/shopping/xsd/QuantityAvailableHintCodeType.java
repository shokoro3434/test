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
 * <p>QuantityAvailableHintCodeTypeのJavaクラス。
 * 
 * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
 * <p>
 * <pre>
 * &lt;simpleType name="QuantityAvailableHintCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Limited"/>
 *     &lt;enumeration value="MoreThan"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "QuantityAvailableHintCodeType")
@XmlEnum
public enum QuantityAvailableHintCodeType {


    /**
     * 
     * 						(out) The message "Limited quantity available" is shown in the web
     * 						flow (e.g., for a flash sale or a Daily Deal).
     * 					
     * 
     */
    @XmlEnumValue("Limited")
    LIMITED("Limited"),

    /**
     * 
     * 						(out) The message "More than 10 available" is shown in the web flow.
     * 						10 is the value of QuantityThreshold tag based on the seller's
     * 						preference.
     * 					
     * 
     */
    @XmlEnumValue("MoreThan")
    MORE_THAN("MoreThan"),

    /**
     * 
     * 						Reserved for internal or future use.
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    QuantityAvailableHintCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static QuantityAvailableHintCodeType fromValue(String v) {
        for (QuantityAvailableHintCodeType c: QuantityAvailableHintCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
