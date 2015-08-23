//
// このファイルは、JavaTM Architecture for XML Binding(JAXB) Reference Implementation、v2.2.8-b130911.1802によって生成されました 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>を参照してください 
// ソース・スキーマの再コンパイル時にこのファイルの変更は失われます。 
// 生成日: 2015.08.24 時間 02:38:24 AM JST 
//


package com.eitax.recall.rest.ebay.shopping.xsd;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 					Variations are multiple similar (but not identical) items in a 
 * 					single fixed-price listing. 
 * 					For example, a single listing could contain multiple items of the 
 * 					same brand and model that vary by color and size (like "Blue, Large" and "Black, Medium"). Each variation can have its own quantity and 
 * 					price. For example, a listing could include 10 "Blue, Large" 
 * 					variations and 20 "Black, Medium" variations. 
 * 			
 * 
 * <p>VariationsType complex typeのJavaクラス。
 * 
 * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
 * 
 * <pre>
 * &lt;complexType name="VariationsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Variation" type="{urn:ebay:apis:eBLBaseComponents}VariationType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Pictures" type="{urn:ebay:apis:eBLBaseComponents}PicturesType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="VariationSpecificsSet" type="{urn:ebay:apis:eBLBaseComponents}NameValueListArrayType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VariationsType", propOrder = {
    "variation",
    "pictures",
    "variationSpecificsSet"
})
public class VariationsType {

    @XmlElement(name = "Variation")
    protected List<VariationType> variation;
    @XmlElement(name = "Pictures")
    protected List<PicturesType> pictures;
    @XmlElement(name = "VariationSpecificsSet")
    protected NameValueListArrayType variationSpecificsSet;

    /**
     * Gets the value of the variation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the variation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVariation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VariationType }
     * 
     * 
     */
    public List<VariationType> getVariation() {
        if (variation == null) {
            variation = new ArrayList<VariationType>();
        }
        return this.variation;
    }

    /**
     * Gets the value of the pictures property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pictures property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPictures().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PicturesType }
     * 
     * 
     */
    public List<PicturesType> getPictures() {
        if (pictures == null) {
            pictures = new ArrayList<PicturesType>();
        }
        return this.pictures;
    }

    /**
     * variationSpecificsSetプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link NameValueListArrayType }
     *     
     */
    public NameValueListArrayType getVariationSpecificsSet() {
        return variationSpecificsSet;
    }

    /**
     * variationSpecificsSetプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link NameValueListArrayType }
     *     
     */
    public void setVariationSpecificsSet(NameValueListArrayType value) {
        this.variationSpecificsSet = value;
    }

}
