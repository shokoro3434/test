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
 * <p>PricingTreatmentCodeTypeのJavaクラス。
 * 
 * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
 * <p>
 * <pre>
 * &lt;simpleType name="PricingTreatmentCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="STP"/>
 *     &lt;enumeration value="MAP"/>
 *     &lt;enumeration value="None"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PricingTreatmentCodeType")
@XmlEnum
public enum PricingTreatmentCodeType {


    /**
     * 
     * 						STP stands for Strikethrough Pricing.
     * 					
     * 
     */
    STP("STP"),

    /**
     * 
     * 						MAP stands for Minimum Advertised Price.
     * 					
     * 
     */
    MAP("MAP"),

    /**
     * 
     * 						None means the item does not qualify for either STP or MAP pricing.
     * 					
     * 
     */
    @XmlEnumValue("None")
    NONE("None"),

    /**
     * 
     * 						Reserved for future use.
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    PricingTreatmentCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PricingTreatmentCodeType fromValue(String v) {
        for (PricingTreatmentCodeType c: PricingTreatmentCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
