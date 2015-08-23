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
 * 				A list of compatible applications specified as name and value pairs. Describes assemblies with which a part is compatible (i.e., compatibility by application). For example, to specify a part's compatibility with a vehicle, the name would map to standard vehicle characteristics (e.g., Year, Make, Model, Trim, and Engine). The values describe the specific vehicle, such as a 2006 Honda Accord.
 * 				<br><br>
 * 				Parts Compatibility is supported in limited Parts & Accessories categories, on the eBay Motors (US) site (site ID 100) only.
 * 			
 * 
 * <p>ItemCompatibilityListType complex typeのJavaクラス。
 * 
 * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
 * 
 * <pre>
 * &lt;complexType name="ItemCompatibilityListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Compatibility" type="{urn:ebay:apis:eBLBaseComponents}ItemCompatibilityType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ItemCompatibilityListType", propOrder = {
    "compatibility"
})
public class ItemCompatibilityListType {

    @XmlElement(name = "Compatibility")
    protected List<ItemCompatibilityType> compatibility;

    /**
     * Gets the value of the compatibility property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the compatibility property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCompatibility().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ItemCompatibilityType }
     * 
     * 
     */
    public List<ItemCompatibilityType> getCompatibility() {
        if (compatibility == null) {
            compatibility = new ArrayList<ItemCompatibilityType>();
        }
        return this.compatibility;
    }

}
