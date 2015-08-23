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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * 
 * 				Detailed feedback information for a user. Conveys the score for the
 * 				feedback, the textual comment, and other information.
 * 		  
 * 
 * <p>FeedbackDetailType complex typeのJavaクラス。
 * 
 * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
 * 
 * <pre>
 * &lt;complexType name="FeedbackDetailType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CommentingUser" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CommentingUserScore" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="CommentText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CommentTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="CommentType" type="{urn:ebay:apis:eBLBaseComponents}CommentTypeCodeType" minOccurs="0"/>
 *         &lt;element name="FeedbackResponse" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FollowUp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ItemID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Role" type="{urn:ebay:apis:eBLBaseComponents}TradingRoleCodeType" minOccurs="0"/>
 *         &lt;element name="ItemTitle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ItemPrice" type="{urn:ebay:apis:eBLBaseComponents}AmountType" minOccurs="0"/>
 *         &lt;element name="FeedbackID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TransactionID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CommentReplaced" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ResponseReplaced" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="FollowUpReplaced" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Countable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FeedbackDetailType", propOrder = {
    "commentingUser",
    "commentingUserScore",
    "commentText",
    "commentTime",
    "commentType",
    "feedbackResponse",
    "followUp",
    "itemID",
    "role",
    "itemTitle",
    "itemPrice",
    "feedbackID",
    "transactionID",
    "commentReplaced",
    "responseReplaced",
    "followUpReplaced",
    "countable"
})
public class FeedbackDetailType {

    @XmlElement(name = "CommentingUser")
    protected String commentingUser;
    @XmlElement(name = "CommentingUserScore")
    protected Integer commentingUserScore;
    @XmlElement(name = "CommentText")
    protected String commentText;
    @XmlElement(name = "CommentTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar commentTime;
    @XmlElement(name = "CommentType")
    @XmlSchemaType(name = "token")
    protected CommentTypeCodeType commentType;
    @XmlElement(name = "FeedbackResponse")
    protected String feedbackResponse;
    @XmlElement(name = "FollowUp")
    protected String followUp;
    @XmlElement(name = "ItemID")
    protected String itemID;
    @XmlElement(name = "Role")
    @XmlSchemaType(name = "token")
    protected TradingRoleCodeType role;
    @XmlElement(name = "ItemTitle")
    protected String itemTitle;
    @XmlElement(name = "ItemPrice")
    protected AmountType itemPrice;
    @XmlElement(name = "FeedbackID")
    protected String feedbackID;
    @XmlElement(name = "TransactionID")
    protected String transactionID;
    @XmlElement(name = "CommentReplaced")
    protected Boolean commentReplaced;
    @XmlElement(name = "ResponseReplaced")
    protected Boolean responseReplaced;
    @XmlElement(name = "FollowUpReplaced")
    protected Boolean followUpReplaced;
    @XmlElement(name = "Countable")
    protected Boolean countable;

    /**
     * commentingUserプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommentingUser() {
        return commentingUser;
    }

    /**
     * commentingUserプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommentingUser(String value) {
        this.commentingUser = value;
    }

    /**
     * commentingUserScoreプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCommentingUserScore() {
        return commentingUserScore;
    }

    /**
     * commentingUserScoreプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCommentingUserScore(Integer value) {
        this.commentingUserScore = value;
    }

    /**
     * commentTextプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommentText() {
        return commentText;
    }

    /**
     * commentTextプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommentText(String value) {
        this.commentText = value;
    }

    /**
     * commentTimeプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCommentTime() {
        return commentTime;
    }

    /**
     * commentTimeプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCommentTime(XMLGregorianCalendar value) {
        this.commentTime = value;
    }

    /**
     * commentTypeプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link CommentTypeCodeType }
     *     
     */
    public CommentTypeCodeType getCommentType() {
        return commentType;
    }

    /**
     * commentTypeプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link CommentTypeCodeType }
     *     
     */
    public void setCommentType(CommentTypeCodeType value) {
        this.commentType = value;
    }

    /**
     * feedbackResponseプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFeedbackResponse() {
        return feedbackResponse;
    }

    /**
     * feedbackResponseプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFeedbackResponse(String value) {
        this.feedbackResponse = value;
    }

    /**
     * followUpプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFollowUp() {
        return followUp;
    }

    /**
     * followUpプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFollowUp(String value) {
        this.followUp = value;
    }

    /**
     * itemIDプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemID() {
        return itemID;
    }

    /**
     * itemIDプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemID(String value) {
        this.itemID = value;
    }

    /**
     * roleプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link TradingRoleCodeType }
     *     
     */
    public TradingRoleCodeType getRole() {
        return role;
    }

    /**
     * roleプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link TradingRoleCodeType }
     *     
     */
    public void setRole(TradingRoleCodeType value) {
        this.role = value;
    }

    /**
     * itemTitleプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemTitle() {
        return itemTitle;
    }

    /**
     * itemTitleプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemTitle(String value) {
        this.itemTitle = value;
    }

    /**
     * itemPriceプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getItemPrice() {
        return itemPrice;
    }

    /**
     * itemPriceプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setItemPrice(AmountType value) {
        this.itemPrice = value;
    }

    /**
     * feedbackIDプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFeedbackID() {
        return feedbackID;
    }

    /**
     * feedbackIDプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFeedbackID(String value) {
        this.feedbackID = value;
    }

    /**
     * transactionIDプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionID() {
        return transactionID;
    }

    /**
     * transactionIDプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionID(String value) {
        this.transactionID = value;
    }

    /**
     * commentReplacedプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCommentReplaced() {
        return commentReplaced;
    }

    /**
     * commentReplacedプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCommentReplaced(Boolean value) {
        this.commentReplaced = value;
    }

    /**
     * responseReplacedプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isResponseReplaced() {
        return responseReplaced;
    }

    /**
     * responseReplacedプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setResponseReplaced(Boolean value) {
        this.responseReplaced = value;
    }

    /**
     * followUpReplacedプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFollowUpReplaced() {
        return followUpReplaced;
    }

    /**
     * followUpReplacedプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFollowUpReplaced(Boolean value) {
        this.followUpReplaced = value;
    }

    /**
     * countableプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCountable() {
        return countable;
    }

    /**
     * countableプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCountable(Boolean value) {
        this.countable = value;
    }

}
