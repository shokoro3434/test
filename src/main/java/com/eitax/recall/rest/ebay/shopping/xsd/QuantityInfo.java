//
// このファイルは、JavaTM Architecture for XML Binding(JAXB) Reference Implementation、v2.2.8-b130911.1802によって生成されました 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>を参照してください 
// ソース・スキーマの再コンパイル時にこのファイルの変更は失われます。 
// 生成日: 2015.08.24 時間 02:38:24 AM JST 
//


package com.eitax.recall.rest.ebay.shopping.xsd;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				Type defining the <b>QuantityInfo</b> container, which consists of the 
 * 				<b>MinimumRemnantSet</b> field, which sets the minimum amount of event tickets that can
 * 				remain in the fixed-price listing's inventory after a buyer purchases one or more tickets (but
 * 				not all) from the listing.
 * 			
 * 
 * <p>QuantityInfo complex typeのJavaクラス。
 * 
 * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
 * 
 * <pre>
 * &lt;complexType name="QuantityInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MinimumRemnantSet" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QuantityInfo", propOrder = {
    "minimumRemnantSet"
})
public class QuantityInfo {

    @XmlElement(name = "MinimumRemnantSet")
    protected Integer minimumRemnantSet;

    /**
     * minimumRemnantSetプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMinimumRemnantSet() {
        return minimumRemnantSet;
    }

    /**
     * minimumRemnantSetプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMinimumRemnantSet(Integer value) {
        this.minimumRemnantSet = value;
    }

}
