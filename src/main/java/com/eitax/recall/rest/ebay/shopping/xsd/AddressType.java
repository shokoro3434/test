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
 * 			Contains the data for one user address. This is the base type for a
 * 			number of user addresses, including seller payment address, buyer
 * 			shipping address and buyer and seller registration address.
 * 		
 * 
 * <p>AddressType complex typeのJavaクラス。
 * 
 * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
 * 
 * <pre>
 * &lt;complexType name="AddressType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Street" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Street1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Street2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CityName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="County" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StateOrProvince" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CountryName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Phone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PhoneCountryPrefix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PhoneAreaOrCityCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PhoneLocalNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Phone2CountryPrefix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Phone2AreaOrCityCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Phone2LocalNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PostalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AddressID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ExternalAddressID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InternationalName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InternationalStateAndCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InternationalStreet" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CompanyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddressType", propOrder = {
    "name",
    "street",
    "street1",
    "street2",
    "cityName",
    "county",
    "stateOrProvince",
    "countryName",
    "phone",
    "phoneCountryPrefix",
    "phoneAreaOrCityCode",
    "phoneLocalNumber",
    "phone2CountryPrefix",
    "phone2AreaOrCityCode",
    "phone2LocalNumber",
    "postalCode",
    "addressID",
    "externalAddressID",
    "internationalName",
    "internationalStateAndCity",
    "internationalStreet",
    "companyName",
    "firstName",
    "lastName"
})
public class AddressType {

    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "Street")
    protected String street;
    @XmlElement(name = "Street1")
    protected String street1;
    @XmlElement(name = "Street2")
    protected String street2;
    @XmlElement(name = "CityName")
    protected String cityName;
    @XmlElement(name = "County")
    protected String county;
    @XmlElement(name = "StateOrProvince")
    protected String stateOrProvince;
    @XmlElement(name = "CountryName")
    protected String countryName;
    @XmlElement(name = "Phone")
    protected String phone;
    @XmlElement(name = "PhoneCountryPrefix")
    protected String phoneCountryPrefix;
    @XmlElement(name = "PhoneAreaOrCityCode")
    protected String phoneAreaOrCityCode;
    @XmlElement(name = "PhoneLocalNumber")
    protected String phoneLocalNumber;
    @XmlElement(name = "Phone2CountryPrefix")
    protected String phone2CountryPrefix;
    @XmlElement(name = "Phone2AreaOrCityCode")
    protected String phone2AreaOrCityCode;
    @XmlElement(name = "Phone2LocalNumber")
    protected String phone2LocalNumber;
    @XmlElement(name = "PostalCode")
    protected String postalCode;
    @XmlElement(name = "AddressID")
    protected String addressID;
    @XmlElement(name = "ExternalAddressID")
    protected String externalAddressID;
    @XmlElement(name = "InternationalName")
    protected String internationalName;
    @XmlElement(name = "InternationalStateAndCity")
    protected String internationalStateAndCity;
    @XmlElement(name = "InternationalStreet")
    protected String internationalStreet;
    @XmlElement(name = "CompanyName")
    protected String companyName;
    @XmlElement(name = "FirstName")
    protected String firstName;
    @XmlElement(name = "LastName")
    protected String lastName;

    /**
     * nameプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * nameプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * streetプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStreet() {
        return street;
    }

    /**
     * streetプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStreet(String value) {
        this.street = value;
    }

    /**
     * street1プロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStreet1() {
        return street1;
    }

    /**
     * street1プロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStreet1(String value) {
        this.street1 = value;
    }

    /**
     * street2プロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStreet2() {
        return street2;
    }

    /**
     * street2プロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStreet2(String value) {
        this.street2 = value;
    }

    /**
     * cityNameプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCityName() {
        return cityName;
    }

    /**
     * cityNameプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCityName(String value) {
        this.cityName = value;
    }

    /**
     * countyプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCounty() {
        return county;
    }

    /**
     * countyプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCounty(String value) {
        this.county = value;
    }

    /**
     * stateOrProvinceプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStateOrProvince() {
        return stateOrProvince;
    }

    /**
     * stateOrProvinceプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStateOrProvince(String value) {
        this.stateOrProvince = value;
    }

    /**
     * countryNameプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryName() {
        return countryName;
    }

    /**
     * countryNameプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryName(String value) {
        this.countryName = value;
    }

    /**
     * phoneプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhone() {
        return phone;
    }

    /**
     * phoneプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhone(String value) {
        this.phone = value;
    }

    /**
     * phoneCountryPrefixプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhoneCountryPrefix() {
        return phoneCountryPrefix;
    }

    /**
     * phoneCountryPrefixプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhoneCountryPrefix(String value) {
        this.phoneCountryPrefix = value;
    }

    /**
     * phoneAreaOrCityCodeプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhoneAreaOrCityCode() {
        return phoneAreaOrCityCode;
    }

    /**
     * phoneAreaOrCityCodeプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhoneAreaOrCityCode(String value) {
        this.phoneAreaOrCityCode = value;
    }

    /**
     * phoneLocalNumberプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhoneLocalNumber() {
        return phoneLocalNumber;
    }

    /**
     * phoneLocalNumberプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhoneLocalNumber(String value) {
        this.phoneLocalNumber = value;
    }

    /**
     * phone2CountryPrefixプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhone2CountryPrefix() {
        return phone2CountryPrefix;
    }

    /**
     * phone2CountryPrefixプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhone2CountryPrefix(String value) {
        this.phone2CountryPrefix = value;
    }

    /**
     * phone2AreaOrCityCodeプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhone2AreaOrCityCode() {
        return phone2AreaOrCityCode;
    }

    /**
     * phone2AreaOrCityCodeプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhone2AreaOrCityCode(String value) {
        this.phone2AreaOrCityCode = value;
    }

    /**
     * phone2LocalNumberプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhone2LocalNumber() {
        return phone2LocalNumber;
    }

    /**
     * phone2LocalNumberプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhone2LocalNumber(String value) {
        this.phone2LocalNumber = value;
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
     * addressIDプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressID() {
        return addressID;
    }

    /**
     * addressIDプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressID(String value) {
        this.addressID = value;
    }

    /**
     * externalAddressIDプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalAddressID() {
        return externalAddressID;
    }

    /**
     * externalAddressIDプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalAddressID(String value) {
        this.externalAddressID = value;
    }

    /**
     * internationalNameプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInternationalName() {
        return internationalName;
    }

    /**
     * internationalNameプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInternationalName(String value) {
        this.internationalName = value;
    }

    /**
     * internationalStateAndCityプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInternationalStateAndCity() {
        return internationalStateAndCity;
    }

    /**
     * internationalStateAndCityプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInternationalStateAndCity(String value) {
        this.internationalStateAndCity = value;
    }

    /**
     * internationalStreetプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInternationalStreet() {
        return internationalStreet;
    }

    /**
     * internationalStreetプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInternationalStreet(String value) {
        this.internationalStreet = value;
    }

    /**
     * companyNameプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyName() {
        return companyName;
    }

    /**
     * companyNameプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyName(String value) {
        this.companyName = value;
    }

    /**
     * firstNameプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * firstNameプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstName(String value) {
        this.firstName = value;
    }

    /**
     * lastNameプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * lastNameプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastName(String value) {
        this.lastName = value;
    }

}
