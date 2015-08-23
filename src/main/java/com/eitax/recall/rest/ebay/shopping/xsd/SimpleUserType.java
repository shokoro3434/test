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
 * 				Type to contain the data for one eBay user. Depending on the context, the user
 * 				might be the seller or the buyer in a transaction, or the bidder or winning bidder
 * 				in a listing. An object of this type is returned by a number of calls, including
 * 				the GetUser call.
 * 			
 * 
 * <p>SimpleUserType complex typeのJavaクラス。
 * 
 * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
 * 
 * <pre>
 * &lt;complexType name="SimpleUserType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="UserID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FeedbackPrivate" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="FeedbackRatingStar" type="{urn:ebay:apis:eBLBaseComponents}FeedbackRatingStarCodeType" minOccurs="0"/>
 *         &lt;element name="FeedbackScore" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="UserAnonymized" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="NewUser" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="RegistrationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="RegistrationSite" type="{urn:ebay:apis:eBLBaseComponents}SiteCodeType" minOccurs="0"/>
 *         &lt;element name="Status" type="{urn:ebay:apis:eBLBaseComponents}UserStatusCodeType" minOccurs="0"/>
 *         &lt;element name="SellerBusinessType" type="{urn:ebay:apis:eBLBaseComponents}SellerBusinessCodeType" minOccurs="0"/>
 *         &lt;element name="StoreURL" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
 *         &lt;element name="StoreName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SellerItemsURL" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
 *         &lt;element name="AboutMeURL" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
 *         &lt;element name="MyWorldURL" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
 *         &lt;element name="MyWorldSmallImage" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
 *         &lt;element name="MyWorldLargeImage" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
 *         &lt;element name="ReviewsAndGuidesURL" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
 *         &lt;element name="FeedbackDetailsURL" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
 *         &lt;element name="PositiveFeedbackPercent" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="SellerLevel" type="{urn:ebay:apis:eBLBaseComponents}SellerLevelCodeType" minOccurs="0"/>
 *         &lt;element name="TopRatedSeller" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SimpleUserType", propOrder = {
    "userID",
    "feedbackPrivate",
    "feedbackRatingStar",
    "feedbackScore",
    "userAnonymized",
    "newUser",
    "registrationDate",
    "registrationSite",
    "status",
    "sellerBusinessType",
    "storeURL",
    "storeName",
    "sellerItemsURL",
    "aboutMeURL",
    "myWorldURL",
    "myWorldSmallImage",
    "myWorldLargeImage",
    "reviewsAndGuidesURL",
    "feedbackDetailsURL",
    "positiveFeedbackPercent",
    "sellerLevel",
    "topRatedSeller"
})
public class SimpleUserType {

    @XmlElement(name = "UserID")
    protected String userID;
    @XmlElement(name = "FeedbackPrivate")
    protected Boolean feedbackPrivate;
    @XmlElement(name = "FeedbackRatingStar")
    @XmlSchemaType(name = "token")
    protected FeedbackRatingStarCodeType feedbackRatingStar;
    @XmlElement(name = "FeedbackScore")
    protected Integer feedbackScore;
    @XmlElement(name = "UserAnonymized")
    protected Boolean userAnonymized;
    @XmlElement(name = "NewUser")
    protected Boolean newUser;
    @XmlElement(name = "RegistrationDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar registrationDate;
    @XmlElement(name = "RegistrationSite")
    @XmlSchemaType(name = "token")
    protected SiteCodeType registrationSite;
    @XmlElement(name = "Status")
    @XmlSchemaType(name = "token")
    protected UserStatusCodeType status;
    @XmlElement(name = "SellerBusinessType")
    @XmlSchemaType(name = "token")
    protected SellerBusinessCodeType sellerBusinessType;
    @XmlElement(name = "StoreURL")
    @XmlSchemaType(name = "anyURI")
    protected String storeURL;
    @XmlElement(name = "StoreName")
    protected String storeName;
    @XmlElement(name = "SellerItemsURL")
    @XmlSchemaType(name = "anyURI")
    protected String sellerItemsURL;
    @XmlElement(name = "AboutMeURL")
    @XmlSchemaType(name = "anyURI")
    protected String aboutMeURL;
    @XmlElement(name = "MyWorldURL")
    @XmlSchemaType(name = "anyURI")
    protected String myWorldURL;
    @XmlElement(name = "MyWorldSmallImage")
    @XmlSchemaType(name = "anyURI")
    protected String myWorldSmallImage;
    @XmlElement(name = "MyWorldLargeImage")
    @XmlSchemaType(name = "anyURI")
    protected String myWorldLargeImage;
    @XmlElement(name = "ReviewsAndGuidesURL")
    @XmlSchemaType(name = "anyURI")
    protected String reviewsAndGuidesURL;
    @XmlElement(name = "FeedbackDetailsURL")
    @XmlSchemaType(name = "anyURI")
    protected String feedbackDetailsURL;
    @XmlElement(name = "PositiveFeedbackPercent")
    protected Float positiveFeedbackPercent;
    @XmlElement(name = "SellerLevel")
    @XmlSchemaType(name = "token")
    protected SellerLevelCodeType sellerLevel;
    @XmlElement(name = "TopRatedSeller")
    protected Boolean topRatedSeller;

    /**
     * userIDプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserID() {
        return userID;
    }

    /**
     * userIDプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserID(String value) {
        this.userID = value;
    }

    /**
     * feedbackPrivateプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFeedbackPrivate() {
        return feedbackPrivate;
    }

    /**
     * feedbackPrivateプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFeedbackPrivate(Boolean value) {
        this.feedbackPrivate = value;
    }

    /**
     * feedbackRatingStarプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link FeedbackRatingStarCodeType }
     *     
     */
    public FeedbackRatingStarCodeType getFeedbackRatingStar() {
        return feedbackRatingStar;
    }

    /**
     * feedbackRatingStarプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link FeedbackRatingStarCodeType }
     *     
     */
    public void setFeedbackRatingStar(FeedbackRatingStarCodeType value) {
        this.feedbackRatingStar = value;
    }

    /**
     * feedbackScoreプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFeedbackScore() {
        return feedbackScore;
    }

    /**
     * feedbackScoreプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFeedbackScore(Integer value) {
        this.feedbackScore = value;
    }

    /**
     * userAnonymizedプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUserAnonymized() {
        return userAnonymized;
    }

    /**
     * userAnonymizedプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUserAnonymized(Boolean value) {
        this.userAnonymized = value;
    }

    /**
     * newUserプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNewUser() {
        return newUser;
    }

    /**
     * newUserプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNewUser(Boolean value) {
        this.newUser = value;
    }

    /**
     * registrationDateプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRegistrationDate() {
        return registrationDate;
    }

    /**
     * registrationDateプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRegistrationDate(XMLGregorianCalendar value) {
        this.registrationDate = value;
    }

    /**
     * registrationSiteプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link SiteCodeType }
     *     
     */
    public SiteCodeType getRegistrationSite() {
        return registrationSite;
    }

    /**
     * registrationSiteプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link SiteCodeType }
     *     
     */
    public void setRegistrationSite(SiteCodeType value) {
        this.registrationSite = value;
    }

    /**
     * statusプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link UserStatusCodeType }
     *     
     */
    public UserStatusCodeType getStatus() {
        return status;
    }

    /**
     * statusプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link UserStatusCodeType }
     *     
     */
    public void setStatus(UserStatusCodeType value) {
        this.status = value;
    }

    /**
     * sellerBusinessTypeプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link SellerBusinessCodeType }
     *     
     */
    public SellerBusinessCodeType getSellerBusinessType() {
        return sellerBusinessType;
    }

    /**
     * sellerBusinessTypeプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link SellerBusinessCodeType }
     *     
     */
    public void setSellerBusinessType(SellerBusinessCodeType value) {
        this.sellerBusinessType = value;
    }

    /**
     * storeURLプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStoreURL() {
        return storeURL;
    }

    /**
     * storeURLプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStoreURL(String value) {
        this.storeURL = value;
    }

    /**
     * storeNameプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStoreName() {
        return storeName;
    }

    /**
     * storeNameプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStoreName(String value) {
        this.storeName = value;
    }

    /**
     * sellerItemsURLプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSellerItemsURL() {
        return sellerItemsURL;
    }

    /**
     * sellerItemsURLプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSellerItemsURL(String value) {
        this.sellerItemsURL = value;
    }

    /**
     * aboutMeURLプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAboutMeURL() {
        return aboutMeURL;
    }

    /**
     * aboutMeURLプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAboutMeURL(String value) {
        this.aboutMeURL = value;
    }

    /**
     * myWorldURLプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMyWorldURL() {
        return myWorldURL;
    }

    /**
     * myWorldURLプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMyWorldURL(String value) {
        this.myWorldURL = value;
    }

    /**
     * myWorldSmallImageプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMyWorldSmallImage() {
        return myWorldSmallImage;
    }

    /**
     * myWorldSmallImageプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMyWorldSmallImage(String value) {
        this.myWorldSmallImage = value;
    }

    /**
     * myWorldLargeImageプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMyWorldLargeImage() {
        return myWorldLargeImage;
    }

    /**
     * myWorldLargeImageプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMyWorldLargeImage(String value) {
        this.myWorldLargeImage = value;
    }

    /**
     * reviewsAndGuidesURLプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReviewsAndGuidesURL() {
        return reviewsAndGuidesURL;
    }

    /**
     * reviewsAndGuidesURLプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReviewsAndGuidesURL(String value) {
        this.reviewsAndGuidesURL = value;
    }

    /**
     * feedbackDetailsURLプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFeedbackDetailsURL() {
        return feedbackDetailsURL;
    }

    /**
     * feedbackDetailsURLプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFeedbackDetailsURL(String value) {
        this.feedbackDetailsURL = value;
    }

    /**
     * positiveFeedbackPercentプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getPositiveFeedbackPercent() {
        return positiveFeedbackPercent;
    }

    /**
     * positiveFeedbackPercentプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setPositiveFeedbackPercent(Float value) {
        this.positiveFeedbackPercent = value;
    }

    /**
     * sellerLevelプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link SellerLevelCodeType }
     *     
     */
    public SellerLevelCodeType getSellerLevel() {
        return sellerLevel;
    }

    /**
     * sellerLevelプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link SellerLevelCodeType }
     *     
     */
    public void setSellerLevel(SellerLevelCodeType value) {
        this.sellerLevel = value;
    }

    /**
     * topRatedSellerプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTopRatedSeller() {
        return topRatedSeller;
    }

    /**
     * topRatedSellerプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTopRatedSeller(Boolean value) {
        this.topRatedSeller = value;
    }

}
