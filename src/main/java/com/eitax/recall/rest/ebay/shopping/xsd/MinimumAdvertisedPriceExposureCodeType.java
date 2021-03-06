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
 * <p>MinimumAdvertisedPriceExposureCodeTypeのJavaクラス。
 * 
 * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
 * <p>
 * <pre>
 * &lt;simpleType name="MinimumAdvertisedPriceExposureCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="PreCheckout"/>
 *     &lt;enumeration value="DuringCheckout"/>
 *     &lt;enumeration value="None"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MinimumAdvertisedPriceExposureCodeType")
@XmlEnum
public enum MinimumAdvertisedPriceExposureCodeType {


    /**
     * 
     * 						PreCheckout specifies that the buyer must click a link (or a button) to navigate to a separate
     * 						page (or window) that displays the discount price.
     * 					
     * 
     */
    @XmlEnumValue("PreCheckout")
    PRE_CHECKOUT("PreCheckout"),

    /**
     * 
     * 						DuringCheckout specifies that the discounted price must be shown on the eBay checkout
     * 						flow page.
     * 					
     * 
     */
    @XmlEnumValue("DuringCheckout")
    DURING_CHECKOUT("DuringCheckout"),

    /**
     * 
     * 						None means the discount price is not shown via either PreCheckout nor DuringCheckout.
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

    MinimumAdvertisedPriceExposureCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MinimumAdvertisedPriceExposureCodeType fromValue(String v) {
        for (MinimumAdvertisedPriceExposureCodeType c: MinimumAdvertisedPriceExposureCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
