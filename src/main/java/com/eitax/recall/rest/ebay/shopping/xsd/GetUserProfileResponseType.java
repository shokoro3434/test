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
 * 				Response to GetUserProfile request.
 * 			
 * 
 * <p>GetUserProfileResponseType complex typeのJavaクラス。
 * 
 * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
 * 
 * <pre>
 * &lt;complexType name="GetUserProfileResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractResponseType">
 *       &lt;sequence>
 *         &lt;element name="User" type="{urn:ebay:apis:eBLBaseComponents}SimpleUserType" minOccurs="0"/>
 *         &lt;element name="FeedbackHistory" type="{urn:ebay:apis:eBLBaseComponents}FeedbackHistoryType" minOccurs="0"/>
 *         &lt;element name="FeedbackDetails" type="{urn:ebay:apis:eBLBaseComponents}FeedbackDetailType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetUserProfileResponseType", propOrder = {
    "user",
    "feedbackHistory",
    "feedbackDetails"
})
public class GetUserProfileResponseType
    extends AbstractResponseType
{

    @XmlElement(name = "User")
    protected SimpleUserType user;
    @XmlElement(name = "FeedbackHistory")
    protected FeedbackHistoryType feedbackHistory;
    @XmlElement(name = "FeedbackDetails")
    protected List<FeedbackDetailType> feedbackDetails;

    /**
     * userプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link SimpleUserType }
     *     
     */
    public SimpleUserType getUser() {
        return user;
    }

    /**
     * userプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link SimpleUserType }
     *     
     */
    public void setUser(SimpleUserType value) {
        this.user = value;
    }

    /**
     * feedbackHistoryプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link FeedbackHistoryType }
     *     
     */
    public FeedbackHistoryType getFeedbackHistory() {
        return feedbackHistory;
    }

    /**
     * feedbackHistoryプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link FeedbackHistoryType }
     *     
     */
    public void setFeedbackHistory(FeedbackHistoryType value) {
        this.feedbackHistory = value;
    }

    /**
     * Gets the value of the feedbackDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the feedbackDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFeedbackDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FeedbackDetailType }
     * 
     * 
     */
    public List<FeedbackDetailType> getFeedbackDetails() {
        if (feedbackDetails == null) {
            feedbackDetails = new ArrayList<FeedbackDetailType>();
        }
        return this.feedbackDetails;
    }

}
