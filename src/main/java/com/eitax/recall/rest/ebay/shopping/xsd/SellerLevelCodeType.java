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
 * <p>SellerLevelCodeTypeのJavaクラス。
 * 
 * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
 * <p>
 * <pre>
 * &lt;simpleType name="SellerLevelCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Bronze"/>
 *     &lt;enumeration value="Silver"/>
 *     &lt;enumeration value="Gold"/>
 *     &lt;enumeration value="Platinum"/>
 *     &lt;enumeration value="Titanium"/>
 *     &lt;enumeration value="Diamond"/>
 *     &lt;enumeration value="None"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SellerLevelCodeType")
@XmlEnum
public enum SellerLevelCodeType {


    /**
     * 
     * 						(out) Bronze
     * 					
     * 
     */
    @XmlEnumValue("Bronze")
    BRONZE("Bronze"),

    /**
     * 
     * 						(out) Silver
     * 					
     * 
     */
    @XmlEnumValue("Silver")
    SILVER("Silver"),

    /**
     * 
     * 						(out) Gold
     * 					
     * 
     */
    @XmlEnumValue("Gold")
    GOLD("Gold"),

    /**
     * 
     * 						(out) Platinum
     * 					
     * 
     */
    @XmlEnumValue("Platinum")
    PLATINUM("Platinum"),

    /**
     * 
     * 						(out) Titanium
     * 					
     * 
     */
    @XmlEnumValue("Titanium")
    TITANIUM("Titanium"),

    /**
     * 
     * 						(out) Diamond
     * 					
     * 
     */
    @XmlEnumValue("Diamond")
    DIAMOND("Diamond"),

    /**
     * 
     * 						(out) None
     * 					
     * 
     */
    @XmlEnumValue("None")
    NONE("None"),

    /**
     * 
     * 						(out) Reserved for internal or future use
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    SellerLevelCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SellerLevelCodeType fromValue(String v) {
        for (SellerLevelCodeType c: SellerLevelCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
