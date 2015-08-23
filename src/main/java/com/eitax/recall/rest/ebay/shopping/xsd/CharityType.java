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
 * 				Identifies a Giving Works listing and benefiting nonprofit charity organization.
 * 				Currently supported through the US and eBay Motors sites only. The Ad Format and
 * 				Mature Audiences categories are not supported.
 * 				Not applicable for US eBay Motors, international, Real Estate, and Tickets.
 * 			
 * 
 * <p>CharityType complex typeのJavaクラス。
 * 
 * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
 * 
 * <pre>
 * &lt;complexType name="CharityType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CharityID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CharityName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CharityNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="DonationPercent" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="Mission" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LogoURL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CharityListing" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Status" type="{urn:ebay:apis:eBLBaseComponents}CharityStatusCodeType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CharityType", propOrder = {
    "charityID",
    "charityName",
    "charityNumber",
    "donationPercent",
    "mission",
    "logoURL",
    "charityListing",
    "status"
})
public class CharityType {

    @XmlElement(name = "CharityID")
    protected String charityID;
    @XmlElement(name = "CharityName")
    protected String charityName;
    @XmlElement(name = "CharityNumber")
    protected Integer charityNumber;
    @XmlElement(name = "DonationPercent")
    protected Float donationPercent;
    @XmlElement(name = "Mission")
    protected String mission;
    @XmlElement(name = "LogoURL")
    protected String logoURL;
    @XmlElement(name = "CharityListing")
    protected Boolean charityListing;
    @XmlElement(name = "Status")
    @XmlSchemaType(name = "token")
    protected CharityStatusCodeType status;

    /**
     * charityIDプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCharityID() {
        return charityID;
    }

    /**
     * charityIDプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCharityID(String value) {
        this.charityID = value;
    }

    /**
     * charityNameプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCharityName() {
        return charityName;
    }

    /**
     * charityNameプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCharityName(String value) {
        this.charityName = value;
    }

    /**
     * charityNumberプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCharityNumber() {
        return charityNumber;
    }

    /**
     * charityNumberプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCharityNumber(Integer value) {
        this.charityNumber = value;
    }

    /**
     * donationPercentプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getDonationPercent() {
        return donationPercent;
    }

    /**
     * donationPercentプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setDonationPercent(Float value) {
        this.donationPercent = value;
    }

    /**
     * missionプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMission() {
        return mission;
    }

    /**
     * missionプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMission(String value) {
        this.mission = value;
    }

    /**
     * logoURLプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLogoURL() {
        return logoURL;
    }

    /**
     * logoURLプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLogoURL(String value) {
        this.logoURL = value;
    }

    /**
     * charityListingプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCharityListing() {
        return charityListing;
    }

    /**
     * charityListingプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCharityListing(Boolean value) {
        this.charityListing = value;
    }

    /**
     * statusプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link CharityStatusCodeType }
     *     
     */
    public CharityStatusCodeType getStatus() {
        return status;
    }

    /**
     * statusプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link CharityStatusCodeType }
     *     
     */
    public void setStatus(CharityStatusCodeType value) {
        this.status = value;
    }

}
