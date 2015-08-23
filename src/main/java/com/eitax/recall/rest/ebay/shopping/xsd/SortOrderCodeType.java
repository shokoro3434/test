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
 * <p>SortOrderCodeTypeのJavaクラス。
 * 
 * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
 * <p>
 * <pre>
 * &lt;simpleType name="SortOrderCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Ascending"/>
 *     &lt;enumeration value="Descending"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SortOrderCodeType")
@XmlEnum
public enum SortOrderCodeType {


    /**
     * 
     * 						Sorts results in ascending (low to high) order.
     * 					
     * 
     */
    @XmlEnumValue("Ascending")
    ASCENDING("Ascending"),

    /**
     * 
     * 						Sorts results in descending (high to low) order.
     * 					
     * 
     */
    @XmlEnumValue("Descending")
    DESCENDING("Descending"),

    /**
     * 
     * 						Placeholder value. See
     * 						<a href="http://developer.ebay.com/DevZone/shopping/docs/CallRef/types/simpleTypes.html#token">token</a>.
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    SortOrderCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SortOrderCodeType fromValue(String v) {
        for (SortOrderCodeType c: SortOrderCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
