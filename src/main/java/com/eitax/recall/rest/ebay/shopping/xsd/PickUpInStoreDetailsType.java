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
 * 				Complex type defining the <b>PickupInStoreDetails</b> container, that is returned in <b>GetShippingCosts</b> if the In-Store Pickup option is enabled for the listing. 
 * 				<br/><br/>
 * 				<span class="tablenote">
 * 				<strong>Note:</strong> At this time, the In-Store Pickup feature is generally only available to large retail merchants, and can only be applied to multi-quantity, fixed-price listings. 
 * 				</span> 
 * 			
 * 
 * <p>PickUpInStoreDetailsType complex typeのJavaクラス。
 * 
 * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
 * 
 * <pre>
 * &lt;complexType name="PickUpInStoreDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EligibleForPickupInStore" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PickUpInStoreDetailsType", propOrder = {
    "eligibleForPickupInStore"
})
public class PickUpInStoreDetailsType {

    @XmlElement(name = "EligibleForPickupInStore")
    protected Boolean eligibleForPickupInStore;

    /**
     * eligibleForPickupInStoreプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEligibleForPickupInStore() {
        return eligibleForPickupInStore;
    }

    /**
     * eligibleForPickupInStoreプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEligibleForPickupInStore(Boolean value) {
        this.eligibleForPickupInStore = value;
    }

}
