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
 * 				Sales tax details for zero or more jurisdictions (states,
 * 				provinces, etc).
 * 			
 * 
 * <p>TaxTableType complex typeのJavaクラス。
 * 
 * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
 * 
 * <pre>
 * &lt;complexType name="TaxTableType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TaxJurisdiction" type="{urn:ebay:apis:eBLBaseComponents}TaxJurisdictionType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaxTableType", propOrder = {
    "taxJurisdiction"
})
public class TaxTableType {

    @XmlElement(name = "TaxJurisdiction")
    protected List<TaxJurisdictionType> taxJurisdiction;

    /**
     * Gets the value of the taxJurisdiction property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the taxJurisdiction property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTaxJurisdiction().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TaxJurisdictionType }
     * 
     * 
     */
    public List<TaxJurisdictionType> getTaxJurisdiction() {
        if (taxJurisdiction == null) {
            taxJurisdiction = new ArrayList<TaxJurisdictionType>();
        }
        return this.taxJurisdiction;
    }

}
