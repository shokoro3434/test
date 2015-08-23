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
 * 				This type provides information about the weight, volume or other quantity measurement of a listed item so buyers can compare per-unit prices. The European Union requires listings for certain types of products to include the price per unit. eBay uses this information and the item's listed price to calculate and display the unit price on eBay EU sites. 
 * 			
 * 
 * <p>UnitInfoType complex typeのJavaクラス。
 * 
 * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
 * 
 * <pre>
 * &lt;complexType name="UnitInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="UnitType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UnitQuantity" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UnitInfoType", propOrder = {
    "unitType",
    "unitQuantity"
})
public class UnitInfoType {

    @XmlElement(name = "UnitType")
    protected String unitType;
    @XmlElement(name = "UnitQuantity")
    protected Double unitQuantity;

    /**
     * unitTypeプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnitType() {
        return unitType;
    }

    /**
     * unitTypeプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnitType(String value) {
        this.unitType = value;
    }

    /**
     * unitQuantityプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getUnitQuantity() {
        return unitQuantity;
    }

    /**
     * unitQuantityプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setUnitQuantity(Double value) {
        this.unitQuantity = value;
    }

}
