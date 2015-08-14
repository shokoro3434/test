//
// このファイルは、JavaTM Architecture for XML Binding(JAXB) Reference Implementation、v2.2.8-b130911.1802によって生成されました 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>を参照してください 
// ソース・スキーマの再コンパイル時にこのファイルの変更は失われます。 
// 生成日: 2015.08.14 時間 10:22:22 PM JST 
//


package com.eitan.recall.rest.amazon.xsd;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>anonymous complex typeのJavaクラス。
 * 
 * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SwatchImage" type="{http://webservices.amazon.com/AWSECommerceService/2011-08-01}Image" minOccurs="0"/>
 *         &lt;element name="SmallImage" type="{http://webservices.amazon.com/AWSECommerceService/2011-08-01}Image" minOccurs="0"/>
 *         &lt;element name="ThumbnailImage" type="{http://webservices.amazon.com/AWSECommerceService/2011-08-01}Image" minOccurs="0"/>
 *         &lt;element name="TinyImage" type="{http://webservices.amazon.com/AWSECommerceService/2011-08-01}Image" minOccurs="0"/>
 *         &lt;element name="MediumImage" type="{http://webservices.amazon.com/AWSECommerceService/2011-08-01}Image" minOccurs="0"/>
 *         &lt;element name="LargeImage" type="{http://webservices.amazon.com/AWSECommerceService/2011-08-01}Image" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Category" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "swatchImage",
    "smallImage",
    "thumbnailImage",
    "tinyImage",
    "mediumImage",
    "largeImage"
})
@XmlRootElement(name = "ImageSet")
public class ImageSet {

    @XmlElement(name = "SwatchImage")
    protected Image swatchImage;
    @XmlElement(name = "SmallImage")
    protected Image smallImage;
    @XmlElement(name = "ThumbnailImage")
    protected Image thumbnailImage;
    @XmlElement(name = "TinyImage")
    protected Image tinyImage;
    @XmlElement(name = "MediumImage")
    protected Image mediumImage;
    @XmlElement(name = "LargeImage")
    protected Image largeImage;
    @XmlAttribute(name = "Category")
    protected String category;

    /**
     * swatchImageプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link Image }
     *     
     */
    public Image getSwatchImage() {
        return swatchImage;
    }

    /**
     * swatchImageプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link Image }
     *     
     */
    public void setSwatchImage(Image value) {
        this.swatchImage = value;
    }

    /**
     * smallImageプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link Image }
     *     
     */
    public Image getSmallImage() {
        return smallImage;
    }

    /**
     * smallImageプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link Image }
     *     
     */
    public void setSmallImage(Image value) {
        this.smallImage = value;
    }

    /**
     * thumbnailImageプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link Image }
     *     
     */
    public Image getThumbnailImage() {
        return thumbnailImage;
    }

    /**
     * thumbnailImageプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link Image }
     *     
     */
    public void setThumbnailImage(Image value) {
        this.thumbnailImage = value;
    }

    /**
     * tinyImageプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link Image }
     *     
     */
    public Image getTinyImage() {
        return tinyImage;
    }

    /**
     * tinyImageプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link Image }
     *     
     */
    public void setTinyImage(Image value) {
        this.tinyImage = value;
    }

    /**
     * mediumImageプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link Image }
     *     
     */
    public Image getMediumImage() {
        return mediumImage;
    }

    /**
     * mediumImageプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link Image }
     *     
     */
    public void setMediumImage(Image value) {
        this.mediumImage = value;
    }

    /**
     * largeImageプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link Image }
     *     
     */
    public Image getLargeImage() {
        return largeImage;
    }

    /**
     * largeImageプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link Image }
     *     
     */
    public void setLargeImage(Image value) {
        this.largeImage = value;
    }

    /**
     * categoryプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCategory() {
        return category;
    }

    /**
     * categoryプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCategory(String value) {
        this.category = value;
    }

}
