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
 * <p>ProductSortCodeTypeのJavaクラス。
 * 
 * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
 * <p>
 * <pre>
 * &lt;simpleType name="ProductSortCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Popularity"/>
 *     &lt;enumeration value="Rating"/>
 *     &lt;enumeration value="ReviewCount"/>
 *     &lt;enumeration value="ItemCount"/>
 *     &lt;enumeration value="Title"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ProductSortCodeType")
@XmlEnum
public enum ProductSortCodeType {


    /**
     * 
     * 						Sort by product popularity (as determined by eBay).
     * 						(This is the default sort order.)
     * 					
     * 
     */
    @XmlEnumValue("Popularity")
    POPULARITY("Popularity"),

    /**
     * 
     * 						Sort by average rating.
     * 					
     * 
     */
    @XmlEnumValue("Rating")
    RATING("Rating"),

    /**
     * 
     * 						Sort by the number of reviews on eBay.
     * 					
     * 
     */
    @XmlEnumValue("ReviewCount")
    REVIEW_COUNT("ReviewCount"),

    /**
     * 
     * 						Sort by the number of active items listed with this product.
     * 					
     * 
     */
    @XmlEnumValue("ItemCount")
    ITEM_COUNT("ItemCount"),

    /**
     * 
     * 						Sort by the product title.
     * 					
     * 
     */
    @XmlEnumValue("Title")
    TITLE("Title"),

    /**
     * 
     * 						Reserved for values that are not available in the version of the schema
     * 						you are using. This means if in a newer version of the API eBay adds a new value to <b>ProductSortCodeList</b> type and the request was using a <i>lower</i> version, 'CustomCode' is returned instead of the new value.
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    ProductSortCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ProductSortCodeType fromValue(String v) {
        for (ProductSortCodeType c: ProductSortCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
