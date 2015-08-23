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
 * <p>SellerBusinessCodeTypeのJavaクラス。
 * 
 * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
 * <p>
 * <pre>
 * &lt;simpleType name="SellerBusinessCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Undefined"/>
 *     &lt;enumeration value="Private"/>
 *     &lt;enumeration value="Commercial"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SellerBusinessCodeType")
@XmlEnum
public enum SellerBusinessCodeType {


    /**
     * 
     * 							Type of seller account not defined.
     * 						
     * 
     */
    @XmlEnumValue("Undefined")
    UNDEFINED("Undefined"),

    /**
     * 
     * 							Private seller account.
     * 						
     * 
     */
    @XmlEnumValue("Private")
    PRIVATE("Private"),

    /**
     * 
     * 							Commercial seller account.
     * 						
     * 
     */
    @XmlEnumValue("Commercial")
    COMMERCIAL("Commercial"),

    /**
     * 
     * 							(out) Reserved for internal or future use.
     * 						
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    SellerBusinessCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SellerBusinessCodeType fromValue(String v) {
        for (SellerBusinessCodeType c: SellerBusinessCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
