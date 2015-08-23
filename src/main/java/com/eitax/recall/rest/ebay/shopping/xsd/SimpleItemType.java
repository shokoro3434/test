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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * 
 * 				Contains information for an item.
 * 			
 * 
 * <p>SimpleItemType complex typeのJavaクラス。
 * 
 * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
 * 
 * <pre>
 * &lt;complexType name="SimpleItemType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BestOfferEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="BuyItNowPrice" type="{urn:ebay:apis:eBLBaseComponents}AmountType" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ItemID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BuyItNowAvailable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ConvertedBuyItNowPrice" type="{urn:ebay:apis:eBLBaseComponents}AmountType" minOccurs="0"/>
 *         &lt;element name="EndTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="StartTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="ViewItemURLForNaturalSearch" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
 *         &lt;element name="ListingType" type="{urn:ebay:apis:eBLBaseComponents}ListingTypeCodeType" minOccurs="0"/>
 *         &lt;element name="Location" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PaymentMethods" type="{urn:ebay:apis:eBLBaseComponents}BuyerPaymentMethodCodeType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="GalleryURL" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
 *         &lt;element name="PictureURL" type="{http://www.w3.org/2001/XMLSchema}anyURI" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PostalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrimaryCategoryID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrimaryCategoryName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Quantity" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Seller" type="{urn:ebay:apis:eBLBaseComponents}SimpleUserType" minOccurs="0"/>
 *         &lt;element name="BidCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ConvertedCurrentPrice" type="{urn:ebay:apis:eBLBaseComponents}AmountType" minOccurs="0"/>
 *         &lt;element name="CurrentPrice" type="{urn:ebay:apis:eBLBaseComponents}AmountType" minOccurs="0"/>
 *         &lt;element name="HighBidder" type="{urn:ebay:apis:eBLBaseComponents}SimpleUserType" minOccurs="0"/>
 *         &lt;element name="ListingStatus" type="{urn:ebay:apis:eBLBaseComponents}ListingStatusCodeType" minOccurs="0"/>
 *         &lt;element name="QuantitySold" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ReserveMet" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ShipToLocations" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Site" type="{urn:ebay:apis:eBLBaseComponents}SiteCodeType" minOccurs="0"/>
 *         &lt;element name="TimeLeft" type="{http://www.w3.org/2001/XMLSchema}duration" minOccurs="0"/>
 *         &lt;element name="Title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShippingCostSummary" type="{urn:ebay:apis:eBLBaseComponents}ShippingCostSummaryType" minOccurs="0"/>
 *         &lt;element name="ItemSpecifics" type="{urn:ebay:apis:eBLBaseComponents}NameValueListArrayType" minOccurs="0"/>
 *         &lt;element name="HitCount" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="Subtitle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrimaryCategoryIDPath" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SecondaryCategoryID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SecondaryCategoryName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SecondaryCategoryIDPath" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Charity" type="{urn:ebay:apis:eBLBaseComponents}CharityType" minOccurs="0"/>
 *         &lt;element name="GermanMotorsSearchable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="GetItFast" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Gift" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PictureExists" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="RecentListing" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Storefront" type="{urn:ebay:apis:eBLBaseComponents}StorefrontType" minOccurs="0"/>
 *         &lt;element name="DistanceFromBuyer" type="{urn:ebay:apis:eBLBaseComponents}DistanceType" minOccurs="0"/>
 *         &lt;element name="Country" type="{urn:ebay:apis:eBLBaseComponents}CountryCodeType" minOccurs="0"/>
 *         &lt;element name="WatchCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="HalfItemCondition" type="{urn:ebay:apis:eBLBaseComponents}HalfItemConditionCodeType" minOccurs="0"/>
 *         &lt;element name="SellerComments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ReturnPolicy" type="{urn:ebay:apis:eBLBaseComponents}ReturnPolicyType" minOccurs="0"/>
 *         &lt;element name="MinimumToBid" type="{urn:ebay:apis:eBLBaseComponents}AmountType" minOccurs="0"/>
 *         &lt;element name="ProductID" type="{urn:ebay:apis:eBLBaseComponents}ProductIDType" minOccurs="0"/>
 *         &lt;element name="AutoPay" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="BusinessSellerDetails" type="{urn:ebay:apis:eBLBaseComponents}BusinessSellerDetailsType" minOccurs="0"/>
 *         &lt;element name="PaymentAllowedSite" type="{urn:ebay:apis:eBLBaseComponents}SiteCodeType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="IntegratedMerchantCreditCardEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Variations" type="{urn:ebay:apis:eBLBaseComponents}VariationsType" minOccurs="0"/>
 *         &lt;element name="HandlingTime" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="LotSize" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ConditionID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ConditionDisplayName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="QuantityAvailableHint" type="{urn:ebay:apis:eBLBaseComponents}QuantityAvailableHintCodeType" minOccurs="0"/>
 *         &lt;element name="QuantityThreshold" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="DiscountPriceInfo" type="{urn:ebay:apis:eBLBaseComponents}DiscountPriceInfoType" minOccurs="0"/>
 *         &lt;element name="ExcludeShipToLocation" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="TopRatedListing" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="VhrUrl" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
 *         &lt;element name="VhrAvailable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="QuantityInfo" type="{urn:ebay:apis:eBLBaseComponents}QuantityInfo" minOccurs="0"/>
 *         &lt;element name="UnitInfo" type="{urn:ebay:apis:eBLBaseComponents}UnitInfoType" minOccurs="0"/>
 *         &lt;element name="GlobalShipping" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ConditionDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ItemCompatibilityCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ItemCompatibilityList" type="{urn:ebay:apis:eBLBaseComponents}ItemCompatibilityListType" minOccurs="0"/>
 *         &lt;element name="QuantitySoldByPickupInStore" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="SKU" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NewBestOffer" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="eBayNowEligible" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="eBayNowAvailable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IgnoreQuantity" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="AvailableForPickupDropOff" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="EligibleForPickupDropOff" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SimpleItemType", propOrder = {
    "bestOfferEnabled",
    "buyItNowPrice",
    "description",
    "itemID",
    "buyItNowAvailable",
    "convertedBuyItNowPrice",
    "endTime",
    "startTime",
    "viewItemURLForNaturalSearch",
    "listingType",
    "location",
    "paymentMethods",
    "galleryURL",
    "pictureURL",
    "postalCode",
    "primaryCategoryID",
    "primaryCategoryName",
    "quantity",
    "seller",
    "bidCount",
    "convertedCurrentPrice",
    "currentPrice",
    "highBidder",
    "listingStatus",
    "quantitySold",
    "reserveMet",
    "shipToLocations",
    "site",
    "timeLeft",
    "title",
    "shippingCostSummary",
    "itemSpecifics",
    "hitCount",
    "subtitle",
    "primaryCategoryIDPath",
    "secondaryCategoryID",
    "secondaryCategoryName",
    "secondaryCategoryIDPath",
    "charity",
    "germanMotorsSearchable",
    "getItFast",
    "gift",
    "pictureExists",
    "recentListing",
    "storefront",
    "distanceFromBuyer",
    "country",
    "watchCount",
    "halfItemCondition",
    "sellerComments",
    "returnPolicy",
    "minimumToBid",
    "productID",
    "autoPay",
    "businessSellerDetails",
    "paymentAllowedSite",
    "integratedMerchantCreditCardEnabled",
    "variations",
    "handlingTime",
    "lotSize",
    "conditionID",
    "conditionDisplayName",
    "quantityAvailableHint",
    "quantityThreshold",
    "discountPriceInfo",
    "excludeShipToLocation",
    "topRatedListing",
    "vhrUrl",
    "vhrAvailable",
    "quantityInfo",
    "unitInfo",
    "globalShipping",
    "conditionDescription",
    "itemCompatibilityCount",
    "itemCompatibilityList",
    "quantitySoldByPickupInStore",
    "sku",
    "newBestOffer",
    "eBayNowEligible",
    "eBayNowAvailable",
    "ignoreQuantity",
    "availableForPickupDropOff",
    "eligibleForPickupDropOff"
})
public class SimpleItemType {

    @XmlElement(name = "BestOfferEnabled")
    protected Boolean bestOfferEnabled;
    @XmlElement(name = "BuyItNowPrice")
    protected AmountType buyItNowPrice;
    @XmlElement(name = "Description")
    protected String description;
    @XmlElement(name = "ItemID")
    protected String itemID;
    @XmlElement(name = "BuyItNowAvailable")
    protected Boolean buyItNowAvailable;
    @XmlElement(name = "ConvertedBuyItNowPrice")
    protected AmountType convertedBuyItNowPrice;
    @XmlElement(name = "EndTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar endTime;
    @XmlElement(name = "StartTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startTime;
    @XmlElement(name = "ViewItemURLForNaturalSearch")
    @XmlSchemaType(name = "anyURI")
    protected String viewItemURLForNaturalSearch;
    @XmlElement(name = "ListingType")
    @XmlSchemaType(name = "token")
    protected ListingTypeCodeType listingType;
    @XmlElement(name = "Location")
    protected String location;
    @XmlElement(name = "PaymentMethods")
    @XmlSchemaType(name = "token")
    protected List<BuyerPaymentMethodCodeType> paymentMethods;
    @XmlElement(name = "GalleryURL")
    @XmlSchemaType(name = "anyURI")
    protected String galleryURL;
    @XmlElement(name = "PictureURL")
    @XmlSchemaType(name = "anyURI")
    protected List<String> pictureURL;
    @XmlElement(name = "PostalCode")
    protected String postalCode;
    @XmlElement(name = "PrimaryCategoryID")
    protected String primaryCategoryID;
    @XmlElement(name = "PrimaryCategoryName")
    protected String primaryCategoryName;
    @XmlElement(name = "Quantity")
    protected Integer quantity;
    @XmlElement(name = "Seller")
    protected SimpleUserType seller;
    @XmlElement(name = "BidCount")
    protected Integer bidCount;
    @XmlElement(name = "ConvertedCurrentPrice")
    protected AmountType convertedCurrentPrice;
    @XmlElement(name = "CurrentPrice")
    protected AmountType currentPrice;
    @XmlElement(name = "HighBidder")
    protected SimpleUserType highBidder;
    @XmlElement(name = "ListingStatus")
    @XmlSchemaType(name = "token")
    protected ListingStatusCodeType listingStatus;
    @XmlElement(name = "QuantitySold")
    protected Integer quantitySold;
    @XmlElement(name = "ReserveMet")
    protected Boolean reserveMet;
    @XmlElement(name = "ShipToLocations")
    protected List<String> shipToLocations;
    @XmlElement(name = "Site")
    @XmlSchemaType(name = "token")
    protected SiteCodeType site;
    @XmlElement(name = "TimeLeft")
    protected Duration timeLeft;
    @XmlElement(name = "Title")
    protected String title;
    @XmlElement(name = "ShippingCostSummary")
    protected ShippingCostSummaryType shippingCostSummary;
    @XmlElement(name = "ItemSpecifics")
    protected NameValueListArrayType itemSpecifics;
    @XmlElement(name = "HitCount")
    protected Long hitCount;
    @XmlElement(name = "Subtitle")
    protected String subtitle;
    @XmlElement(name = "PrimaryCategoryIDPath")
    protected String primaryCategoryIDPath;
    @XmlElement(name = "SecondaryCategoryID")
    protected String secondaryCategoryID;
    @XmlElement(name = "SecondaryCategoryName")
    protected String secondaryCategoryName;
    @XmlElement(name = "SecondaryCategoryIDPath")
    protected String secondaryCategoryIDPath;
    @XmlElement(name = "Charity")
    protected CharityType charity;
    @XmlElement(name = "GermanMotorsSearchable")
    protected Boolean germanMotorsSearchable;
    @XmlElement(name = "GetItFast")
    protected Boolean getItFast;
    @XmlElement(name = "Gift")
    protected Boolean gift;
    @XmlElement(name = "PictureExists")
    protected Boolean pictureExists;
    @XmlElement(name = "RecentListing")
    protected Boolean recentListing;
    @XmlElement(name = "Storefront")
    protected StorefrontType storefront;
    @XmlElement(name = "DistanceFromBuyer")
    protected DistanceType distanceFromBuyer;
    @XmlElement(name = "Country")
    @XmlSchemaType(name = "token")
    protected CountryCodeType country;
    @XmlElement(name = "WatchCount")
    protected Integer watchCount;
    @XmlElement(name = "HalfItemCondition")
    @XmlSchemaType(name = "token")
    protected HalfItemConditionCodeType halfItemCondition;
    @XmlElement(name = "SellerComments")
    protected String sellerComments;
    @XmlElement(name = "ReturnPolicy")
    protected ReturnPolicyType returnPolicy;
    @XmlElement(name = "MinimumToBid")
    protected AmountType minimumToBid;
    @XmlElement(name = "ProductID")
    protected ProductIDType productID;
    @XmlElement(name = "AutoPay")
    protected Boolean autoPay;
    @XmlElement(name = "BusinessSellerDetails")
    protected BusinessSellerDetailsType businessSellerDetails;
    @XmlElement(name = "PaymentAllowedSite")
    @XmlSchemaType(name = "token")
    protected List<SiteCodeType> paymentAllowedSite;
    @XmlElement(name = "IntegratedMerchantCreditCardEnabled")
    protected Boolean integratedMerchantCreditCardEnabled;
    @XmlElement(name = "Variations")
    protected VariationsType variations;
    @XmlElement(name = "HandlingTime")
    protected Integer handlingTime;
    @XmlElement(name = "LotSize")
    protected Integer lotSize;
    @XmlElement(name = "ConditionID")
    protected Integer conditionID;
    @XmlElement(name = "ConditionDisplayName")
    protected String conditionDisplayName;
    @XmlElement(name = "QuantityAvailableHint")
    @XmlSchemaType(name = "token")
    protected QuantityAvailableHintCodeType quantityAvailableHint;
    @XmlElement(name = "QuantityThreshold")
    protected Integer quantityThreshold;
    @XmlElement(name = "DiscountPriceInfo")
    protected DiscountPriceInfoType discountPriceInfo;
    @XmlElement(name = "ExcludeShipToLocation")
    protected List<String> excludeShipToLocation;
    @XmlElement(name = "TopRatedListing")
    protected Boolean topRatedListing;
    @XmlElement(name = "VhrUrl")
    @XmlSchemaType(name = "anyURI")
    protected String vhrUrl;
    @XmlElement(name = "VhrAvailable")
    protected Boolean vhrAvailable;
    @XmlElement(name = "QuantityInfo")
    protected QuantityInfo quantityInfo;
    @XmlElement(name = "UnitInfo")
    protected UnitInfoType unitInfo;
    @XmlElement(name = "GlobalShipping")
    protected Boolean globalShipping;
    @XmlElement(name = "ConditionDescription")
    protected String conditionDescription;
    @XmlElement(name = "ItemCompatibilityCount")
    protected Integer itemCompatibilityCount;
    @XmlElement(name = "ItemCompatibilityList")
    protected ItemCompatibilityListType itemCompatibilityList;
    @XmlElement(name = "QuantitySoldByPickupInStore")
    protected Integer quantitySoldByPickupInStore;
    @XmlElement(name = "SKU")
    protected String sku;
    @XmlElement(name = "NewBestOffer")
    protected Boolean newBestOffer;
    protected Boolean eBayNowEligible;
    protected Boolean eBayNowAvailable;
    @XmlElement(name = "IgnoreQuantity")
    protected Boolean ignoreQuantity;
    @XmlElement(name = "AvailableForPickupDropOff")
    protected Boolean availableForPickupDropOff;
    @XmlElement(name = "EligibleForPickupDropOff")
    protected Boolean eligibleForPickupDropOff;

    /**
     * bestOfferEnabledプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBestOfferEnabled() {
        return bestOfferEnabled;
    }

    /**
     * bestOfferEnabledプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBestOfferEnabled(Boolean value) {
        this.bestOfferEnabled = value;
    }

    /**
     * buyItNowPriceプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getBuyItNowPrice() {
        return buyItNowPrice;
    }

    /**
     * buyItNowPriceプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setBuyItNowPrice(AmountType value) {
        this.buyItNowPrice = value;
    }

    /**
     * descriptionプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * descriptionプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
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
     * buyItNowAvailableプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBuyItNowAvailable() {
        return buyItNowAvailable;
    }

    /**
     * buyItNowAvailableプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBuyItNowAvailable(Boolean value) {
        this.buyItNowAvailable = value;
    }

    /**
     * convertedBuyItNowPriceプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getConvertedBuyItNowPrice() {
        return convertedBuyItNowPrice;
    }

    /**
     * convertedBuyItNowPriceプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setConvertedBuyItNowPrice(AmountType value) {
        this.convertedBuyItNowPrice = value;
    }

    /**
     * endTimeプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndTime() {
        return endTime;
    }

    /**
     * endTimeプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndTime(XMLGregorianCalendar value) {
        this.endTime = value;
    }

    /**
     * startTimeプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartTime() {
        return startTime;
    }

    /**
     * startTimeプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartTime(XMLGregorianCalendar value) {
        this.startTime = value;
    }

    /**
     * viewItemURLForNaturalSearchプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getViewItemURLForNaturalSearch() {
        return viewItemURLForNaturalSearch;
    }

    /**
     * viewItemURLForNaturalSearchプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setViewItemURLForNaturalSearch(String value) {
        this.viewItemURLForNaturalSearch = value;
    }

    /**
     * listingTypeプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link ListingTypeCodeType }
     *     
     */
    public ListingTypeCodeType getListingType() {
        return listingType;
    }

    /**
     * listingTypeプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link ListingTypeCodeType }
     *     
     */
    public void setListingType(ListingTypeCodeType value) {
        this.listingType = value;
    }

    /**
     * locationプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocation() {
        return location;
    }

    /**
     * locationプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocation(String value) {
        this.location = value;
    }

    /**
     * Gets the value of the paymentMethods property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paymentMethods property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPaymentMethods().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BuyerPaymentMethodCodeType }
     * 
     * 
     */
    public List<BuyerPaymentMethodCodeType> getPaymentMethods() {
        if (paymentMethods == null) {
            paymentMethods = new ArrayList<BuyerPaymentMethodCodeType>();
        }
        return this.paymentMethods;
    }

    /**
     * galleryURLプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGalleryURL() {
        return galleryURL;
    }

    /**
     * galleryURLプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGalleryURL(String value) {
        this.galleryURL = value;
    }

    /**
     * Gets the value of the pictureURL property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pictureURL property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPictureURL().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getPictureURL() {
        if (pictureURL == null) {
            pictureURL = new ArrayList<String>();
        }
        return this.pictureURL;
    }

    /**
     * postalCodeプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostalCode() {
        return postalCode;
    }

    /**
     * postalCodeプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostalCode(String value) {
        this.postalCode = value;
    }

    /**
     * primaryCategoryIDプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryCategoryID() {
        return primaryCategoryID;
    }

    /**
     * primaryCategoryIDプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryCategoryID(String value) {
        this.primaryCategoryID = value;
    }

    /**
     * primaryCategoryNameプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryCategoryName() {
        return primaryCategoryName;
    }

    /**
     * primaryCategoryNameプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryCategoryName(String value) {
        this.primaryCategoryName = value;
    }

    /**
     * quantityプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getQuantity() {
        return quantity;
    }

    /**
     * quantityプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setQuantity(Integer value) {
        this.quantity = value;
    }

    /**
     * sellerプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link SimpleUserType }
     *     
     */
    public SimpleUserType getSeller() {
        return seller;
    }

    /**
     * sellerプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link SimpleUserType }
     *     
     */
    public void setSeller(SimpleUserType value) {
        this.seller = value;
    }

    /**
     * bidCountプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBidCount() {
        return bidCount;
    }

    /**
     * bidCountプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBidCount(Integer value) {
        this.bidCount = value;
    }

    /**
     * convertedCurrentPriceプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getConvertedCurrentPrice() {
        return convertedCurrentPrice;
    }

    /**
     * convertedCurrentPriceプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setConvertedCurrentPrice(AmountType value) {
        this.convertedCurrentPrice = value;
    }

    /**
     * currentPriceプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getCurrentPrice() {
        return currentPrice;
    }

    /**
     * currentPriceプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setCurrentPrice(AmountType value) {
        this.currentPrice = value;
    }

    /**
     * highBidderプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link SimpleUserType }
     *     
     */
    public SimpleUserType getHighBidder() {
        return highBidder;
    }

    /**
     * highBidderプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link SimpleUserType }
     *     
     */
    public void setHighBidder(SimpleUserType value) {
        this.highBidder = value;
    }

    /**
     * listingStatusプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link ListingStatusCodeType }
     *     
     */
    public ListingStatusCodeType getListingStatus() {
        return listingStatus;
    }

    /**
     * listingStatusプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link ListingStatusCodeType }
     *     
     */
    public void setListingStatus(ListingStatusCodeType value) {
        this.listingStatus = value;
    }

    /**
     * quantitySoldプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getQuantitySold() {
        return quantitySold;
    }

    /**
     * quantitySoldプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setQuantitySold(Integer value) {
        this.quantitySold = value;
    }

    /**
     * reserveMetプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReserveMet() {
        return reserveMet;
    }

    /**
     * reserveMetプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReserveMet(Boolean value) {
        this.reserveMet = value;
    }

    /**
     * Gets the value of the shipToLocations property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the shipToLocations property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getShipToLocations().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getShipToLocations() {
        if (shipToLocations == null) {
            shipToLocations = new ArrayList<String>();
        }
        return this.shipToLocations;
    }

    /**
     * siteプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link SiteCodeType }
     *     
     */
    public SiteCodeType getSite() {
        return site;
    }

    /**
     * siteプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link SiteCodeType }
     *     
     */
    public void setSite(SiteCodeType value) {
        this.site = value;
    }

    /**
     * timeLeftプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getTimeLeft() {
        return timeLeft;
    }

    /**
     * timeLeftプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setTimeLeft(Duration value) {
        this.timeLeft = value;
    }

    /**
     * titleプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * titleプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * shippingCostSummaryプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link ShippingCostSummaryType }
     *     
     */
    public ShippingCostSummaryType getShippingCostSummary() {
        return shippingCostSummary;
    }

    /**
     * shippingCostSummaryプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link ShippingCostSummaryType }
     *     
     */
    public void setShippingCostSummary(ShippingCostSummaryType value) {
        this.shippingCostSummary = value;
    }

    /**
     * itemSpecificsプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link NameValueListArrayType }
     *     
     */
    public NameValueListArrayType getItemSpecifics() {
        return itemSpecifics;
    }

    /**
     * itemSpecificsプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link NameValueListArrayType }
     *     
     */
    public void setItemSpecifics(NameValueListArrayType value) {
        this.itemSpecifics = value;
    }

    /**
     * hitCountプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getHitCount() {
        return hitCount;
    }

    /**
     * hitCountプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setHitCount(Long value) {
        this.hitCount = value;
    }

    /**
     * subtitleプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubtitle() {
        return subtitle;
    }

    /**
     * subtitleプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubtitle(String value) {
        this.subtitle = value;
    }

    /**
     * primaryCategoryIDPathプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryCategoryIDPath() {
        return primaryCategoryIDPath;
    }

    /**
     * primaryCategoryIDPathプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryCategoryIDPath(String value) {
        this.primaryCategoryIDPath = value;
    }

    /**
     * secondaryCategoryIDプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecondaryCategoryID() {
        return secondaryCategoryID;
    }

    /**
     * secondaryCategoryIDプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecondaryCategoryID(String value) {
        this.secondaryCategoryID = value;
    }

    /**
     * secondaryCategoryNameプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecondaryCategoryName() {
        return secondaryCategoryName;
    }

    /**
     * secondaryCategoryNameプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecondaryCategoryName(String value) {
        this.secondaryCategoryName = value;
    }

    /**
     * secondaryCategoryIDPathプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecondaryCategoryIDPath() {
        return secondaryCategoryIDPath;
    }

    /**
     * secondaryCategoryIDPathプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecondaryCategoryIDPath(String value) {
        this.secondaryCategoryIDPath = value;
    }

    /**
     * charityプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link CharityType }
     *     
     */
    public CharityType getCharity() {
        return charity;
    }

    /**
     * charityプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link CharityType }
     *     
     */
    public void setCharity(CharityType value) {
        this.charity = value;
    }

    /**
     * germanMotorsSearchableプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isGermanMotorsSearchable() {
        return germanMotorsSearchable;
    }

    /**
     * germanMotorsSearchableプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setGermanMotorsSearchable(Boolean value) {
        this.germanMotorsSearchable = value;
    }

    /**
     * getItFastプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isGetItFast() {
        return getItFast;
    }

    /**
     * getItFastプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setGetItFast(Boolean value) {
        this.getItFast = value;
    }

    /**
     * giftプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isGift() {
        return gift;
    }

    /**
     * giftプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setGift(Boolean value) {
        this.gift = value;
    }

    /**
     * pictureExistsプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPictureExists() {
        return pictureExists;
    }

    /**
     * pictureExistsプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPictureExists(Boolean value) {
        this.pictureExists = value;
    }

    /**
     * recentListingプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRecentListing() {
        return recentListing;
    }

    /**
     * recentListingプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRecentListing(Boolean value) {
        this.recentListing = value;
    }

    /**
     * storefrontプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link StorefrontType }
     *     
     */
    public StorefrontType getStorefront() {
        return storefront;
    }

    /**
     * storefrontプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link StorefrontType }
     *     
     */
    public void setStorefront(StorefrontType value) {
        this.storefront = value;
    }

    /**
     * distanceFromBuyerプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link DistanceType }
     *     
     */
    public DistanceType getDistanceFromBuyer() {
        return distanceFromBuyer;
    }

    /**
     * distanceFromBuyerプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link DistanceType }
     *     
     */
    public void setDistanceFromBuyer(DistanceType value) {
        this.distanceFromBuyer = value;
    }

    /**
     * countryプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link CountryCodeType }
     *     
     */
    public CountryCodeType getCountry() {
        return country;
    }

    /**
     * countryプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link CountryCodeType }
     *     
     */
    public void setCountry(CountryCodeType value) {
        this.country = value;
    }

    /**
     * watchCountプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getWatchCount() {
        return watchCount;
    }

    /**
     * watchCountプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setWatchCount(Integer value) {
        this.watchCount = value;
    }

    /**
     * halfItemConditionプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link HalfItemConditionCodeType }
     *     
     */
    public HalfItemConditionCodeType getHalfItemCondition() {
        return halfItemCondition;
    }

    /**
     * halfItemConditionプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link HalfItemConditionCodeType }
     *     
     */
    public void setHalfItemCondition(HalfItemConditionCodeType value) {
        this.halfItemCondition = value;
    }

    /**
     * sellerCommentsプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSellerComments() {
        return sellerComments;
    }

    /**
     * sellerCommentsプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSellerComments(String value) {
        this.sellerComments = value;
    }

    /**
     * returnPolicyプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link ReturnPolicyType }
     *     
     */
    public ReturnPolicyType getReturnPolicy() {
        return returnPolicy;
    }

    /**
     * returnPolicyプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link ReturnPolicyType }
     *     
     */
    public void setReturnPolicy(ReturnPolicyType value) {
        this.returnPolicy = value;
    }

    /**
     * minimumToBidプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getMinimumToBid() {
        return minimumToBid;
    }

    /**
     * minimumToBidプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setMinimumToBid(AmountType value) {
        this.minimumToBid = value;
    }

    /**
     * productIDプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link ProductIDType }
     *     
     */
    public ProductIDType getProductID() {
        return productID;
    }

    /**
     * productIDプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link ProductIDType }
     *     
     */
    public void setProductID(ProductIDType value) {
        this.productID = value;
    }

    /**
     * autoPayプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAutoPay() {
        return autoPay;
    }

    /**
     * autoPayプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAutoPay(Boolean value) {
        this.autoPay = value;
    }

    /**
     * businessSellerDetailsプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link BusinessSellerDetailsType }
     *     
     */
    public BusinessSellerDetailsType getBusinessSellerDetails() {
        return businessSellerDetails;
    }

    /**
     * businessSellerDetailsプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessSellerDetailsType }
     *     
     */
    public void setBusinessSellerDetails(BusinessSellerDetailsType value) {
        this.businessSellerDetails = value;
    }

    /**
     * Gets the value of the paymentAllowedSite property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paymentAllowedSite property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPaymentAllowedSite().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SiteCodeType }
     * 
     * 
     */
    public List<SiteCodeType> getPaymentAllowedSite() {
        if (paymentAllowedSite == null) {
            paymentAllowedSite = new ArrayList<SiteCodeType>();
        }
        return this.paymentAllowedSite;
    }

    /**
     * integratedMerchantCreditCardEnabledプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIntegratedMerchantCreditCardEnabled() {
        return integratedMerchantCreditCardEnabled;
    }

    /**
     * integratedMerchantCreditCardEnabledプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIntegratedMerchantCreditCardEnabled(Boolean value) {
        this.integratedMerchantCreditCardEnabled = value;
    }

    /**
     * variationsプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link VariationsType }
     *     
     */
    public VariationsType getVariations() {
        return variations;
    }

    /**
     * variationsプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link VariationsType }
     *     
     */
    public void setVariations(VariationsType value) {
        this.variations = value;
    }

    /**
     * handlingTimeプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getHandlingTime() {
        return handlingTime;
    }

    /**
     * handlingTimeプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setHandlingTime(Integer value) {
        this.handlingTime = value;
    }

    /**
     * lotSizeプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLotSize() {
        return lotSize;
    }

    /**
     * lotSizeプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLotSize(Integer value) {
        this.lotSize = value;
    }

    /**
     * conditionIDプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getConditionID() {
        return conditionID;
    }

    /**
     * conditionIDプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setConditionID(Integer value) {
        this.conditionID = value;
    }

    /**
     * conditionDisplayNameプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConditionDisplayName() {
        return conditionDisplayName;
    }

    /**
     * conditionDisplayNameプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConditionDisplayName(String value) {
        this.conditionDisplayName = value;
    }

    /**
     * quantityAvailableHintプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link QuantityAvailableHintCodeType }
     *     
     */
    public QuantityAvailableHintCodeType getQuantityAvailableHint() {
        return quantityAvailableHint;
    }

    /**
     * quantityAvailableHintプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link QuantityAvailableHintCodeType }
     *     
     */
    public void setQuantityAvailableHint(QuantityAvailableHintCodeType value) {
        this.quantityAvailableHint = value;
    }

    /**
     * quantityThresholdプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getQuantityThreshold() {
        return quantityThreshold;
    }

    /**
     * quantityThresholdプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setQuantityThreshold(Integer value) {
        this.quantityThreshold = value;
    }

    /**
     * discountPriceInfoプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link DiscountPriceInfoType }
     *     
     */
    public DiscountPriceInfoType getDiscountPriceInfo() {
        return discountPriceInfo;
    }

    /**
     * discountPriceInfoプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link DiscountPriceInfoType }
     *     
     */
    public void setDiscountPriceInfo(DiscountPriceInfoType value) {
        this.discountPriceInfo = value;
    }

    /**
     * Gets the value of the excludeShipToLocation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the excludeShipToLocation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExcludeShipToLocation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getExcludeShipToLocation() {
        if (excludeShipToLocation == null) {
            excludeShipToLocation = new ArrayList<String>();
        }
        return this.excludeShipToLocation;
    }

    /**
     * topRatedListingプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTopRatedListing() {
        return topRatedListing;
    }

    /**
     * topRatedListingプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTopRatedListing(Boolean value) {
        this.topRatedListing = value;
    }

    /**
     * vhrUrlプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVhrUrl() {
        return vhrUrl;
    }

    /**
     * vhrUrlプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVhrUrl(String value) {
        this.vhrUrl = value;
    }

    /**
     * vhrAvailableプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isVhrAvailable() {
        return vhrAvailable;
    }

    /**
     * vhrAvailableプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setVhrAvailable(Boolean value) {
        this.vhrAvailable = value;
    }

    /**
     * quantityInfoプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link QuantityInfo }
     *     
     */
    public QuantityInfo getQuantityInfo() {
        return quantityInfo;
    }

    /**
     * quantityInfoプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link QuantityInfo }
     *     
     */
    public void setQuantityInfo(QuantityInfo value) {
        this.quantityInfo = value;
    }

    /**
     * unitInfoプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link UnitInfoType }
     *     
     */
    public UnitInfoType getUnitInfo() {
        return unitInfo;
    }

    /**
     * unitInfoプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link UnitInfoType }
     *     
     */
    public void setUnitInfo(UnitInfoType value) {
        this.unitInfo = value;
    }

    /**
     * globalShippingプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isGlobalShipping() {
        return globalShipping;
    }

    /**
     * globalShippingプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setGlobalShipping(Boolean value) {
        this.globalShipping = value;
    }

    /**
     * conditionDescriptionプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConditionDescription() {
        return conditionDescription;
    }

    /**
     * conditionDescriptionプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConditionDescription(String value) {
        this.conditionDescription = value;
    }

    /**
     * itemCompatibilityCountプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getItemCompatibilityCount() {
        return itemCompatibilityCount;
    }

    /**
     * itemCompatibilityCountプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setItemCompatibilityCount(Integer value) {
        this.itemCompatibilityCount = value;
    }

    /**
     * itemCompatibilityListプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link ItemCompatibilityListType }
     *     
     */
    public ItemCompatibilityListType getItemCompatibilityList() {
        return itemCompatibilityList;
    }

    /**
     * itemCompatibilityListプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link ItemCompatibilityListType }
     *     
     */
    public void setItemCompatibilityList(ItemCompatibilityListType value) {
        this.itemCompatibilityList = value;
    }

    /**
     * quantitySoldByPickupInStoreプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getQuantitySoldByPickupInStore() {
        return quantitySoldByPickupInStore;
    }

    /**
     * quantitySoldByPickupInStoreプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setQuantitySoldByPickupInStore(Integer value) {
        this.quantitySoldByPickupInStore = value;
    }

    /**
     * skuプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSKU() {
        return sku;
    }

    /**
     * skuプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSKU(String value) {
        this.sku = value;
    }

    /**
     * newBestOfferプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNewBestOffer() {
        return newBestOffer;
    }

    /**
     * newBestOfferプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNewBestOffer(Boolean value) {
        this.newBestOffer = value;
    }

    /**
     * eBayNowEligibleプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEBayNowEligible() {
        return eBayNowEligible;
    }

    /**
     * eBayNowEligibleプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEBayNowEligible(Boolean value) {
        this.eBayNowEligible = value;
    }

    /**
     * eBayNowAvailableプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEBayNowAvailable() {
        return eBayNowAvailable;
    }

    /**
     * eBayNowAvailableプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEBayNowAvailable(Boolean value) {
        this.eBayNowAvailable = value;
    }

    /**
     * ignoreQuantityプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIgnoreQuantity() {
        return ignoreQuantity;
    }

    /**
     * ignoreQuantityプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIgnoreQuantity(Boolean value) {
        this.ignoreQuantity = value;
    }

    /**
     * availableForPickupDropOffプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAvailableForPickupDropOff() {
        return availableForPickupDropOff;
    }

    /**
     * availableForPickupDropOffプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAvailableForPickupDropOff(Boolean value) {
        this.availableForPickupDropOff = value;
    }

    /**
     * eligibleForPickupDropOffプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEligibleForPickupDropOff() {
        return eligibleForPickupDropOff;
    }

    /**
     * eligibleForPickupDropOffプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEligibleForPickupDropOff(Boolean value) {
        this.eligibleForPickupDropOff = value;
    }

}
