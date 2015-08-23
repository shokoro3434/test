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
 * <p>CommentTypeCodeTypeのJavaクラス。
 * 
 * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
 * <p>
 * <pre>
 * &lt;simpleType name="CommentTypeCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Positive"/>
 *     &lt;enumeration value="Neutral"/>
 *     &lt;enumeration value="Negative"/>
 *     &lt;enumeration value="Withdrawn"/>
 *     &lt;enumeration value="IndependentlyWithdrawn"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CommentTypeCodeType")
@XmlEnum
public enum CommentTypeCodeType {


    /**
     * 
     * 								Positive feedback. Increases total feedback score.
     * 					
     * 
     */
    @XmlEnumValue("Positive")
    POSITIVE("Positive"),

    /**
     * 
     * 								Neutral feedback. No effect on total feedback score.
     * 					
     * 
     */
    @XmlEnumValue("Neutral")
    NEUTRAL("Neutral"),

    /**
     * 
     * 								Negative feedback. Decreases total feedback score.
     * 					
     * 
     */
    @XmlEnumValue("Negative")
    NEGATIVE("Negative"),

    /**
     * 
     * 								Withdrawn feedback. Removes the effect of the original
     * 								feedback on total feedback score. Comments from withdrawn feedback
     * 								are still visible.
     * 					
     * 
     */
    @XmlEnumValue("Withdrawn")
    WITHDRAWN("Withdrawn"),

    /**
     * 
     * 								Applies to the eBay Motors site only. Feedback is withdrawn based on
     * 								the decision of a third party.
     * 					
     * 
     */
    @XmlEnumValue("IndependentlyWithdrawn")
    INDEPENDENTLY_WITHDRAWN("IndependentlyWithdrawn"),

    /**
     * 
     * 								Reserved for internal or future use.
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    CommentTypeCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CommentTypeCodeType fromValue(String v) {
        for (CommentTypeCodeType c: CommentTypeCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
