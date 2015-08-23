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
 * <p>ExternalProductCodeTypeのJavaクラス。
 * 
 * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
 * <p>
 * <pre>
 * &lt;simpleType name="ExternalProductCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="ISBN"/>
 *     &lt;enumeration value="UPC"/>
 *     &lt;enumeration value="ProductID"/>
 *     &lt;enumeration value="EAN"/>
 *     &lt;enumeration value="Keywords"/>
 *     &lt;enumeration value="MPN"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ExternalProductCodeType")
@XmlEnum
public enum ExternalProductCodeType {


    /**
     * 
     * 						ExternalProductID.Value contains an ISBN value.
     * 						Required when you pass an ISBN as the external product ID.
     * 						(This value is also applicable to Half.com listings.)
     * 					
     * 
     */
    ISBN("ISBN"),

    /**
     * 
     * 						ExternalProductID.Value contains a UPC value.
     * 						Required when you pass a UPC as the external product ID.
     * 						(This value is also applicable to Half.com listings.)
     * 					
     * 
     */
    UPC("UPC"),

    /**
     * 
     * 						ExternalProductID.Value contains an eBay catalog product ID.
     * 						Required when you pass an eBay product ID
     * 						as the external product ID.
     * 						Not applicable with FindItemsAdvanced or FindProducts.
     * 					
     * 
     */
    @XmlEnumValue("ProductID")
    PRODUCT_ID("ProductID"),

    /**
     * 
     * 						ExternalProductID.Value contains an EAN value.
     * 						Required when you pass an EAN as the external product ID.
     * 					
     * 
     */
    EAN("EAN"),

    /**
     * 
     * 						ExternalProductID.Value contains a set of keywords that uniquely identify the product.
     * 						Only applicable when listing event ticket.
     * 						See the eBay Features Guide for information about valid
     * 						ticket keywords for an external product ID.
     * 						Required when you pass a set of keywords as the external product ID.
     * 						Not applicable with FindItemsAdvanced or FindProducts. 
     * 						With FindItemsAdvanced, use TicketFinder instead.
     * 					
     * 
     */
    @XmlEnumValue("Keywords")
    KEYWORDS("Keywords"),

    /**
     * 
     * 						Reserved for future use.
     * 					
     * 
     */
    MPN("MPN"),

    /**
     * 
     * 						Reserved for internal or future use
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    ExternalProductCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ExternalProductCodeType fromValue(String v) {
        for (ExternalProductCodeType c: ExternalProductCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
