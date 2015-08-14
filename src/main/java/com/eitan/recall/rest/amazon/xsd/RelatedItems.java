//
// このファイルは、JavaTM Architecture for XML Binding(JAXB) Reference Implementation、v2.2.8-b130911.1802によって生成されました 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>を参照してください 
// ソース・スキーマの再コンパイル時にこのファイルの変更は失われます。 
// 生成日: 2015.08.14 時間 10:22:22 PM JST 
//


package com.eitan.recall.rest.amazon.xsd;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>anonymous complex typeのJavaクラス。
 * 
 * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Relationship" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="Parents"/>
 *               &lt;enumeration value="Children"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="RelationshipType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RelatedItemCount" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
 *         &lt;element name="RelatedItemPageCount" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
 *         &lt;element name="RelatedItemPage" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
 *         &lt;element ref="{http://webservices.amazon.com/AWSECommerceService/2011-08-01}RelatedItem" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "relationship",
    "relationshipType",
    "relatedItemCount",
    "relatedItemPageCount",
    "relatedItemPage",
    "relatedItem"
})
@XmlRootElement(name = "RelatedItems")
public class RelatedItems {

    @XmlElement(name = "Relationship")
    protected String relationship;
    @XmlElement(name = "RelationshipType")
    protected String relationshipType;
    @XmlElement(name = "RelatedItemCount")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger relatedItemCount;
    @XmlElement(name = "RelatedItemPageCount")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger relatedItemPageCount;
    @XmlElement(name = "RelatedItemPage")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger relatedItemPage;
    @XmlElement(name = "RelatedItem")
    protected List<RelatedItem> relatedItem;

    /**
     * relationshipプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelationship() {
        return relationship;
    }

    /**
     * relationshipプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelationship(String value) {
        this.relationship = value;
    }

    /**
     * relationshipTypeプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelationshipType() {
        return relationshipType;
    }

    /**
     * relationshipTypeプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelationshipType(String value) {
        this.relationshipType = value;
    }

    /**
     * relatedItemCountプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRelatedItemCount() {
        return relatedItemCount;
    }

    /**
     * relatedItemCountプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRelatedItemCount(BigInteger value) {
        this.relatedItemCount = value;
    }

    /**
     * relatedItemPageCountプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRelatedItemPageCount() {
        return relatedItemPageCount;
    }

    /**
     * relatedItemPageCountプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRelatedItemPageCount(BigInteger value) {
        this.relatedItemPageCount = value;
    }

    /**
     * relatedItemPageプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRelatedItemPage() {
        return relatedItemPage;
    }

    /**
     * relatedItemPageプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRelatedItemPage(BigInteger value) {
        this.relatedItemPage = value;
    }

    /**
     * Gets the value of the relatedItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the relatedItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRelatedItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RelatedItem }
     * 
     * 
     */
    public List<RelatedItem> getRelatedItem() {
        if (relatedItem == null) {
            relatedItem = new ArrayList<RelatedItem>();
        }
        return this.relatedItem;
    }

}
