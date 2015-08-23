//
// このファイルは、JavaTM Architecture for XML Binding(JAXB) Reference Implementation、v2.2.8-b130911.1802によって生成されました 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>を参照してください 
// ソース・スキーマの再コンパイル時にこのファイルの変更は失われます。 
// 生成日: 2015.08.24 時間 02:38:24 AM JST 
//


package com.eitax.recall.rest.ebay.shopping.xsd;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>BuyerPaymentMethodCodeTypeのJavaクラス。
 * 
 * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
 * <p>
 * <pre>
 * &lt;simpleType name="BuyerPaymentMethodCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="None"/>
 *     &lt;enumeration value="MOCC"/>
 *     &lt;enumeration value="AmEx"/>
 *     &lt;enumeration value="PaymentSeeDescription"/>
 *     &lt;enumeration value="CCAccepted"/>
 *     &lt;enumeration value="PersonalCheck"/>
 *     &lt;enumeration value="COD"/>
 *     &lt;enumeration value="VisaMC"/>
 *     &lt;enumeration value="PaisaPayAccepted"/>
 *     &lt;enumeration value="Other"/>
 *     &lt;enumeration value="PayPal"/>
 *     &lt;enumeration value="Discover"/>
 *     &lt;enumeration value="CashOnPickup"/>
 *     &lt;enumeration value="MoneyXferAccepted"/>
 *     &lt;enumeration value="MoneyXferAcceptedInCheckout"/>
 *     &lt;enumeration value="OtherOnlinePayments"/>
 *     &lt;enumeration value="Escrow"/>
 *     &lt;enumeration value="PrePayDelivery"/>
 *     &lt;enumeration value="CODPrePayDelivery"/>
 *     &lt;enumeration value="PostalTransfer"/>
 *     &lt;enumeration value="CustomCode"/>
 *     &lt;enumeration value="LoanCheck"/>
 *     &lt;enumeration value="CashInPerson"/>
 *     &lt;enumeration value="ELV"/>
 *     &lt;enumeration value="PaisaPayEscrowEMI"/>
 *     &lt;enumeration value="Moneybookers"/>
 *     &lt;enumeration value="Paymate"/>
 *     &lt;enumeration value="ProPay"/>
 *     &lt;enumeration value="StandardPayment"/>
 *     &lt;enumeration value="DirectDebit"/>
 *     &lt;enumeration value="CreditCard"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "BuyerPaymentMethodCodeType")
@XmlEnum
public enum BuyerPaymentMethodCodeType {


    /**
     * 
     * 						No payment method specified.
     * 						For example, no payment methods would be specified for Ad format listings.
     * 					
     * 
     */
    @XmlEnumValue("None")
    NONE("None"),

    /**
     * 
     * 						Money order/cashiers check.
     * 						Not applicable to US/CA eBay Motors listings.
     * 					
     * 
     */
    MOCC("MOCC"),

    /**
     * 
     * 						American Express.
     * 						Not applicable to US/CA eBay Motors listings.
     * 					
     * 
     */
    @XmlEnumValue("AmEx")
    AM_EX("AmEx"),

    /**
     * 
     * 						Payment instructions are contained in the item's description.
     * 					
     * 
     */
    @XmlEnumValue("PaymentSeeDescription")
    PAYMENT_SEE_DESCRIPTION("PaymentSeeDescription"),

    /**
     * 
     * 						Credit card.
     * 						Not applicable to Real Estate or US/CA eBay Motors listings.
     * 					
     * 
     */
    @XmlEnumValue("CCAccepted")
    CC_ACCEPTED("CCAccepted"),

    /**
     * 
     * 						Personal check.
     * 					
     * 
     */
    @XmlEnumValue("PersonalCheck")
    PERSONAL_CHECK("PersonalCheck"),

    /**
     * 
     * 						Cash on delivery.
     * 						Only applicable to the following eBay sites: AT (16), BEFR (24),
     * 						BENL (123), CH (193), DE (77), ES (186), FR (71), HK (201), IN (203),
     * 						IT (101), PL (212), and SG (216).
     * 						Not applicable to Real Estate listings.
     * 					
     * 
     */
    COD("COD"),

    /**
     * 
     * 						Visa/Mastercard. These qualify as safe payment methods.
     * 						Not applicable to US/CA eBay Motors listings.
     * 					
     * 
     */
    @XmlEnumValue("VisaMC")
    VISA_MC("VisaMC"),

    /**
     * 
     * 						PaisaPay (for India site only). This qualifies as a safe payment method.
     * 					
     * 
     */
    @XmlEnumValue("PaisaPayAccepted")
    PAISA_PAY_ACCEPTED("PaisaPayAccepted"),

    /**
     * 
     * 						Other forms of payment.
     * 						Not applicable to US/CA eBay Motors listings
     * 						(see PaymentSeeDescription instead).
     * 					
     * 
     */
    @XmlEnumValue("Other")
    OTHER("Other"),

    /**
     * 
     * 						PayPal is accepted as a payment method. This qualifies as a safe payment method. <br>
     * 						<br>
     * 						If PayPal is specified for US/CA eBay Motors vehicles, it is for
     * 						the vehicle deposit (not for purchasing the vehicle).
     * 					
     * 
     */
    @XmlEnumValue("PayPal")
    PAY_PAL("PayPal"),

    /**
     * 
     * 						Discover card.
     * 						Not applicable to US/CA eBay Motors listings.
     * 					
     * 
     */
    @XmlEnumValue("Discover")
    DISCOVER("Discover"),

    /**
     * 
     * 						This payment method is equivalent to the PayOnPickup payment method.
     * 						CashOnPickup applies even for listings on the eBay US site that refer to "Pay on pickup."
     * 					
     * 
     */
    @XmlEnumValue("CashOnPickup")
    CASH_ON_PICKUP("CashOnPickup"),

    /**
     * 
     * 						Direct transfer of money.
     * 						Not applicable to US/CA eBay Motors listings.
     * 					
     * 
     */
    @XmlEnumValue("MoneyXferAccepted")
    MONEY_XFER_ACCEPTED("MoneyXferAccepted"),

    /**
     * 
     * 						If the seller has bank account information on file, and
     * 						MoneyXferAcceptedInCheckout = true, then the bank account
     * 						information will be displayed in Checkout.
     * 					
     * 
     */
    @XmlEnumValue("MoneyXferAcceptedInCheckout")
    MONEY_XFER_ACCEPTED_IN_CHECKOUT("MoneyXferAcceptedInCheckout"),

    /**
     * 
     * 						All other online payments.
     * 						Not applicable to US/CA eBay Motors listings.
     * 					
     * 
     */
    @XmlEnumValue("OtherOnlinePayments")
    OTHER_ONLINE_PAYMENTS("OtherOnlinePayments"),

    /**
     * 
     * 				
     * 					
     * 
     */
    @XmlEnumValue("Escrow")
    ESCROW("Escrow"),

    /**
     * 
     * 					
     * 					
     * 
     */
    @XmlEnumValue("PrePayDelivery")
    PRE_PAY_DELIVERY("PrePayDelivery"),

    /**
     * 
     * 					
     * 					
     * 
     */
    @XmlEnumValue("CODPrePayDelivery")
    COD_PRE_PAY_DELIVERY("CODPrePayDelivery"),

    /**
     * 
     * 					
     * 					
     * 
     */
    @XmlEnumValue("PostalTransfer")
    POSTAL_TRANSFER("PostalTransfer"),

    /**
     * 
     * 						Placeholder value. See
     * 						<a href="http://developer.ebay.com/DevZone/shopping/docs/CallRef/types/simpleTypes.html#token">token</a>.
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode"),

    /**
     * 
     * 						Loan check option (applicable only to the US eBay Motors site,
     * 						except in the Parts and Accessories category, and the eBay Canada site for motors).
     * 					
     * 
     */
    @XmlEnumValue("LoanCheck")
    LOAN_CHECK("LoanCheck"),

    /**
     * 
     * 						Cash-in-person option. Applicable only to US and Canada eBay Motors vehicles,
     * 						(not the Parts and Accessories category).
     * 					
     * 
     */
    @XmlEnumValue("CashInPerson")
    CASH_IN_PERSON("CashInPerson"),

    /**
     * 
     * 						Elektronisches Lastschriftverfahren (direct debit).
     * 						Only applicable to Express Germany.
     * 					
     * 
     */
    ELV("ELV"),

    /**
     * 
     * 							PaisaPayEscrow EMI (Equal Monthly Installment) payment method.
     * 							The PaisaPayEscrowEMI payment method is only for the India site (site ID 203).
     * 						
     * 
     */
    @XmlEnumValue("PaisaPayEscrowEMI")
    PAISA_PAY_ESCROW_EMI("PaisaPayEscrowEMI"),

    /**
     * 
     * 						The Moneybookers payment method.
     * 						For more information, see http://www.moneybookers.com/partners/us/ebay.
     * 						Only applicable to the US site (and
     * 						to the Parts and Accessories category of the US eBay Motors site).
     * 					
     * 
     */
    @XmlEnumValue("Moneybookers")
    MONEYBOOKERS("Moneybookers"),

    /**
     * 
     * 						The Paymate payment method. For more information,
     * 						see http://www.paymate.com/eBay.
     * 						Only applicable to the US site (and
     * 						to the Parts and Accessories category of the US eBay Motors site).
     * 					
     * 
     */
    @XmlEnumValue("Paymate")
    PAYMATE("Paymate"),

    /**
     * 
     * 						The ProPay payment method. US site only. For more information,
     * 						see http://www.Propay.com/eBay.
     * 					
     * 
     */
    @XmlEnumValue("ProPay")
    PRO_PAY("ProPay"),

    /**
     * 
     * 						For all payment intermediated transactions, If the authenticated caller is a seller then Standard Payment Method is returned to as Payment Method Used to sellers.
     * 						OrderArray.Order.CheckoutStatus.PaymentMethod (GetOrders, GetOrderTransaction) and OrderArray.Order
     * 						.TransactionArray.Transaction.Status (For all the 4 APIs).
     * 					    The COD (Cash on Demand) or POP (Pay on Pickup) should be shown as is to the buyers and sellers, these payment methods are not intermediated.
     *   					
     * 
     */
    @XmlEnumValue("StandardPayment")
    STANDARD_PAYMENT("StandardPayment"),

    /**
     * 
     * 						This value indicates that a debit card is a valid payment method for the order.  For eBay Now orders, the eBay Now valet accepts debit cards as a form of payment. This value is only applicable for eBay Now orders.
     * 					
     * 
     */
    @XmlEnumValue("DirectDebit")
    DIRECT_DEBIT("DirectDebit"),

    /**
     * 
     * 						This value indicates that a credit card is a valid payment method for the order.  For eBay Now orders, the eBay Now valet accepts credit cards as a form of payment. This value is only applicable for eBay Now orders.
     * 					
     * 
     */
    @XmlEnumValue("CreditCard")
    CREDIT_CARD("CreditCard");
    private final String value;

    BuyerPaymentMethodCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BuyerPaymentMethodCodeType fromValue(String v) {
        for (BuyerPaymentMethodCodeType c: BuyerPaymentMethodCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
