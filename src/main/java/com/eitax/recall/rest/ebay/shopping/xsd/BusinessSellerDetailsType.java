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
 * 			  Displays the seller's information (in a business card format) 
 * 			  as part of the data returned in the GetSingleItem call if the 
 * 			  seller's SellerBusinessCodeType is set to 'Commercial'. Note 
 * 			  that this option is only available for sites that have 
 * 			  Business Seller options enabled.
 * 			
 * 
 * <p>BusinessSellerDetailsType complex typeのJavaクラス。
 * 
 * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
 * 
 * <pre>
 * &lt;complexType name="BusinessSellerDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Address" type="{urn:ebay:apis:eBLBaseComponents}AddressType" minOccurs="0"/>
 *         &lt;element name="Fax" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AdditionalContactInformation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TradeRegistrationNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LegalInvoice" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="TermsAndConditions" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VATDetails" type="{urn:ebay:apis:eBLBaseComponents}VATDetailsType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BusinessSellerDetailsType", propOrder = {
    "address",
    "fax",
    "email",
    "additionalContactInformation",
    "tradeRegistrationNumber",
    "legalInvoice",
    "termsAndConditions",
    "vatDetails"
})
public class BusinessSellerDetailsType {

    @XmlElement(name = "Address")
    protected AddressType address;
    @XmlElement(name = "Fax")
    protected String fax;
    @XmlElement(name = "Email")
    protected String email;
    @XmlElement(name = "AdditionalContactInformation")
    protected String additionalContactInformation;
    @XmlElement(name = "TradeRegistrationNumber")
    protected String tradeRegistrationNumber;
    @XmlElement(name = "LegalInvoice")
    protected Boolean legalInvoice;
    @XmlElement(name = "TermsAndConditions")
    protected String termsAndConditions;
    @XmlElement(name = "VATDetails")
    protected VATDetailsType vatDetails;

    /**
     * addressプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link AddressType }
     *     
     */
    public AddressType getAddress() {
        return address;
    }

    /**
     * addressプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link AddressType }
     *     
     */
    public void setAddress(AddressType value) {
        this.address = value;
    }

    /**
     * faxプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFax() {
        return fax;
    }

    /**
     * faxプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFax(String value) {
        this.fax = value;
    }

    /**
     * emailプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * emailプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * additionalContactInformationプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdditionalContactInformation() {
        return additionalContactInformation;
    }

    /**
     * additionalContactInformationプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdditionalContactInformation(String value) {
        this.additionalContactInformation = value;
    }

    /**
     * tradeRegistrationNumberプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTradeRegistrationNumber() {
        return tradeRegistrationNumber;
    }

    /**
     * tradeRegistrationNumberプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTradeRegistrationNumber(String value) {
        this.tradeRegistrationNumber = value;
    }

    /**
     * legalInvoiceプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLegalInvoice() {
        return legalInvoice;
    }

    /**
     * legalInvoiceプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLegalInvoice(Boolean value) {
        this.legalInvoice = value;
    }

    /**
     * termsAndConditionsプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTermsAndConditions() {
        return termsAndConditions;
    }

    /**
     * termsAndConditionsプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTermsAndConditions(String value) {
        this.termsAndConditions = value;
    }

    /**
     * vatDetailsプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link VATDetailsType }
     *     
     */
    public VATDetailsType getVATDetails() {
        return vatDetails;
    }

    /**
     * vatDetailsプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link VATDetailsType }
     *     
     */
    public void setVATDetails(VATDetailsType value) {
        this.vatDetails = value;
    }

}
