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


/**
 * 
 * 			Find reviews and guides response type.
 * 			
 * 
 * <p>FindReviewsAndGuidesResponseType complex typeのJavaクラス。
 * 
 * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
 * 
 * <pre>
 * &lt;complexType name="FindReviewsAndGuidesResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractResponseType">
 *       &lt;sequence>
 *         &lt;element name="ReviewCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="BuyingGuideCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ReviewerRank" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="TotalHelpfulnessVotes" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ProductID" type="{urn:ebay:apis:eBLBaseComponents}ProductIDType" minOccurs="0"/>
 *         &lt;element name="ReviewsAndGuidesURL" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
 *         &lt;element name="PageNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="TotalPages" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="BuyingGuideDetails" type="{urn:ebay:apis:eBLBaseComponents}BuyingGuideDetailsType" minOccurs="0"/>
 *         &lt;element name="ReviewDetails" type="{urn:ebay:apis:eBLBaseComponents}ReviewDetailsType" minOccurs="0"/>
 *         &lt;element name="PositiveHelpfulnessVotes" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FindReviewsAndGuidesResponseType", propOrder = {
    "reviewCount",
    "buyingGuideCount",
    "reviewerRank",
    "totalHelpfulnessVotes",
    "productID",
    "reviewsAndGuidesURL",
    "pageNumber",
    "totalPages",
    "buyingGuideDetails",
    "reviewDetails",
    "positiveHelpfulnessVotes"
})
public class FindReviewsAndGuidesResponseType
    extends AbstractResponseType
{

    @XmlElement(name = "ReviewCount")
    protected Integer reviewCount;
    @XmlElement(name = "BuyingGuideCount")
    protected Integer buyingGuideCount;
    @XmlElement(name = "ReviewerRank")
    protected Integer reviewerRank;
    @XmlElement(name = "TotalHelpfulnessVotes")
    protected Integer totalHelpfulnessVotes;
    @XmlElement(name = "ProductID")
    protected ProductIDType productID;
    @XmlElement(name = "ReviewsAndGuidesURL")
    @XmlSchemaType(name = "anyURI")
    protected String reviewsAndGuidesURL;
    @XmlElement(name = "PageNumber")
    protected Integer pageNumber;
    @XmlElement(name = "TotalPages")
    protected Integer totalPages;
    @XmlElement(name = "BuyingGuideDetails")
    protected BuyingGuideDetailsType buyingGuideDetails;
    @XmlElement(name = "ReviewDetails")
    protected ReviewDetailsType reviewDetails;
    @XmlElement(name = "PositiveHelpfulnessVotes")
    protected Integer positiveHelpfulnessVotes;

    /**
     * reviewCountプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getReviewCount() {
        return reviewCount;
    }

    /**
     * reviewCountプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setReviewCount(Integer value) {
        this.reviewCount = value;
    }

    /**
     * buyingGuideCountプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBuyingGuideCount() {
        return buyingGuideCount;
    }

    /**
     * buyingGuideCountプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBuyingGuideCount(Integer value) {
        this.buyingGuideCount = value;
    }

    /**
     * reviewerRankプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getReviewerRank() {
        return reviewerRank;
    }

    /**
     * reviewerRankプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setReviewerRank(Integer value) {
        this.reviewerRank = value;
    }

    /**
     * totalHelpfulnessVotesプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTotalHelpfulnessVotes() {
        return totalHelpfulnessVotes;
    }

    /**
     * totalHelpfulnessVotesプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTotalHelpfulnessVotes(Integer value) {
        this.totalHelpfulnessVotes = value;
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
     * pageNumberプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPageNumber() {
        return pageNumber;
    }

    /**
     * pageNumberプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPageNumber(Integer value) {
        this.pageNumber = value;
    }

    /**
     * totalPagesプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTotalPages() {
        return totalPages;
    }

    /**
     * totalPagesプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTotalPages(Integer value) {
        this.totalPages = value;
    }

    /**
     * buyingGuideDetailsプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link BuyingGuideDetailsType }
     *     
     */
    public BuyingGuideDetailsType getBuyingGuideDetails() {
        return buyingGuideDetails;
    }

    /**
     * buyingGuideDetailsプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link BuyingGuideDetailsType }
     *     
     */
    public void setBuyingGuideDetails(BuyingGuideDetailsType value) {
        this.buyingGuideDetails = value;
    }

    /**
     * reviewDetailsプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link ReviewDetailsType }
     *     
     */
    public ReviewDetailsType getReviewDetails() {
        return reviewDetails;
    }

    /**
     * reviewDetailsプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link ReviewDetailsType }
     *     
     */
    public void setReviewDetails(ReviewDetailsType value) {
        this.reviewDetails = value;
    }

    /**
     * positiveHelpfulnessVotesプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPositiveHelpfulnessVotes() {
        return positiveHelpfulnessVotes;
    }

    /**
     * positiveHelpfulnessVotesプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPositiveHelpfulnessVotes(Integer value) {
        this.positiveHelpfulnessVotes = value;
    }

}
