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
 * <p>InsuranceOptionCodeTypeのJavaクラス。
 * 
 * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
 * <p>
 * <pre>
 * &lt;simpleType name="InsuranceOptionCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Optional"/>
 *     &lt;enumeration value="Required"/>
 *     &lt;enumeration value="NotOffered"/>
 *     &lt;enumeration value="IncludedInShippingHandling"/>
 *     &lt;enumeration value="NotOfferedOnSite"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "InsuranceOptionCodeType")
@XmlEnum
public enum InsuranceOptionCodeType {


    /**
     * 
     * 						The seller offers the buyer the choice of paying
     * 						for shipping insurance or not.
     * 					
     * 
     */
    @XmlEnumValue("Optional")
    OPTIONAL("Optional"),

    /**
     * 
     * 						The seller requires that the buyer pay for
     * 						shipping insurance.
     * 					
     * 
     */
    @XmlEnumValue("Required")
    REQUIRED("Required"),

    /**
     * 
     * 						The seller does not offer shipping insurance to the buyer.
     * 					
     * 
     */
    @XmlEnumValue("NotOffered")
    NOT_OFFERED("NotOffered"),

    /**
     * 
     * 						The seller is not charging separately for shipping
     * 						insurance costs; any insurance is already included in the
     * 						base shipping cost.
     * 					
     * 
     */
    @XmlEnumValue("IncludedInShippingHandling")
    INCLUDED_IN_SHIPPING_HANDLING("IncludedInShippingHandling"),

    /**
     * 
     * 						Shipping insurance is not offered as a separate option on the site
     * 						where the item is listed. (Some shipping services, such as
     * 						DE_InsuredExpressOrCourier, include insurance as part of the service.) If
     * 						another insurance option is specified in the listing request and the site does
     * 						not support shipping insurance as a separate option, eBay will reset the
     * 						insurance option to this value. At the time of this writing, this option is
     * 						only meaningful for the eBay Germany, Austria, and Switzerland sites.
     * 					
     * 
     */
    @XmlEnumValue("NotOfferedOnSite")
    NOT_OFFERED_ON_SITE("NotOfferedOnSite"),

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

    InsuranceOptionCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static InsuranceOptionCodeType fromValue(String v) {
        for (InsuranceOptionCodeType c: InsuranceOptionCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
