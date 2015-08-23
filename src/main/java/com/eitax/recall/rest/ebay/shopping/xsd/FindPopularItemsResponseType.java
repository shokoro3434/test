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
 * 				Popular items, detail level is default for simple item type. addition with WatchCount.
 * 			
 * 
 * <p>FindPopularItemsResponseType complex typeのJavaクラス。
 * 
 * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
 * 
 * <pre>
 * &lt;complexType name="FindPopularItemsResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractResponseType">
 *       &lt;sequence>
 *         &lt;element name="ItemArray" type="{urn:ebay:apis:eBLBaseComponents}SimpleItemArrayType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FindPopularItemsResponseType", propOrder = {
    "itemArray"
})
public class FindPopularItemsResponseType
    extends AbstractResponseType
{

    @XmlElement(name = "ItemArray")
    protected SimpleItemArrayType itemArray;

    /**
     * itemArrayプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link SimpleItemArrayType }
     *     
     */
    public SimpleItemArrayType getItemArray() {
        return itemArray;
    }

    /**
     * itemArrayプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link SimpleItemArrayType }
     *     
     */
    public void setItemArray(SimpleItemArrayType value) {
        this.itemArray = value;
    }

}
