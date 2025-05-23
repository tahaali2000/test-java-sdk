/*
 * PayPalRESTAPIsLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.paypal.api.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * This is a model class for PaymentSource type.
 */
public class PaymentSource {
    private CardRequest card;
    private Token token;
    private PayPalWallet paypal;
    private BancontactPaymentRequest bancontact;
    private BLIKPaymentRequest blik;
    private EPSPaymentRequest eps;
    private GiropayPaymentRequest giropay;
    private IDEALPaymentRequest ideal;
    private MyBankPaymentRequest mybank;
    private P24PaymentRequest p24;
    private SofortPaymentRequest sofort;
    private TrustlyPaymentRequest trustly;
    private ApplePayRequest applePay;
    private GooglePayRequest googlePay;
    private VenmoWalletRequest venmo;

    /**
     * Default constructor.
     */
    public PaymentSource() {
    }

    /**
     * Initialization constructor.
     * @param  card  CardRequest value for card.
     * @param  token  Token value for token.
     * @param  paypal  PayPalWallet value for paypal.
     * @param  bancontact  BancontactPaymentRequest value for bancontact.
     * @param  blik  BLIKPaymentRequest value for blik.
     * @param  eps  EPSPaymentRequest value for eps.
     * @param  giropay  GiropayPaymentRequest value for giropay.
     * @param  ideal  IDEALPaymentRequest value for ideal.
     * @param  mybank  MyBankPaymentRequest value for mybank.
     * @param  p24  P24PaymentRequest value for p24.
     * @param  sofort  SofortPaymentRequest value for sofort.
     * @param  trustly  TrustlyPaymentRequest value for trustly.
     * @param  applePay  ApplePayRequest value for applePay.
     * @param  googlePay  GooglePayRequest value for googlePay.
     * @param  venmo  VenmoWalletRequest value for venmo.
     */
    public PaymentSource(
            CardRequest card,
            Token token,
            PayPalWallet paypal,
            BancontactPaymentRequest bancontact,
            BLIKPaymentRequest blik,
            EPSPaymentRequest eps,
            GiropayPaymentRequest giropay,
            IDEALPaymentRequest ideal,
            MyBankPaymentRequest mybank,
            P24PaymentRequest p24,
            SofortPaymentRequest sofort,
            TrustlyPaymentRequest trustly,
            ApplePayRequest applePay,
            GooglePayRequest googlePay,
            VenmoWalletRequest venmo) {
        this.card = card;
        this.token = token;
        this.paypal = paypal;
        this.bancontact = bancontact;
        this.blik = blik;
        this.eps = eps;
        this.giropay = giropay;
        this.ideal = ideal;
        this.mybank = mybank;
        this.p24 = p24;
        this.sofort = sofort;
        this.trustly = trustly;
        this.applePay = applePay;
        this.googlePay = googlePay;
        this.venmo = venmo;
    }

    /**
     * Getter for Card.
     * The payment card to use to fund a payment. Can be a credit or debit
     * card.&lt;blockquote&gt;&lt;strong&gt;Note:&lt;/strong&gt; Passing card number, cvv and expiry directly via the
     * API requires &lt;a
     * href="https://www.pcisecuritystandards.org/pci_security/completing_self_assessment"&gt; PCI SAQ
     * D compliance&lt;/a&gt;. &lt;br&gt;*PayPal offers a mechanism by which you do not have to take on the
     * &lt;strong&gt;PCI SAQ D&lt;/strong&gt; burden by using hosted fields - refer to &lt;a
     * href="https://developer.paypal.com/docs/checkout/advanced/integrate/"&gt;this Integration
     * Guide&lt;/a&gt;*.&lt;/blockquote&gt;
     * @return Returns the CardRequest
     */
    @JsonGetter("card")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public CardRequest getCard() {
        return card;
    }

    /**
     * Setter for Card.
     * The payment card to use to fund a payment. Can be a credit or debit
     * card.&lt;blockquote&gt;&lt;strong&gt;Note:&lt;/strong&gt; Passing card number, cvv and expiry directly via the
     * API requires &lt;a
     * href="https://www.pcisecuritystandards.org/pci_security/completing_self_assessment"&gt; PCI SAQ
     * D compliance&lt;/a&gt;. &lt;br&gt;*PayPal offers a mechanism by which you do not have to take on the
     * &lt;strong&gt;PCI SAQ D&lt;/strong&gt; burden by using hosted fields - refer to &lt;a
     * href="https://developer.paypal.com/docs/checkout/advanced/integrate/"&gt;this Integration
     * Guide&lt;/a&gt;*.&lt;/blockquote&gt;
     * @param card Value for CardRequest
     */
    @JsonSetter("card")
    public void setCard(CardRequest card) {
        this.card = card;
    }

    /**
     * Getter for Token.
     * The tokenized payment source to fund a payment.
     * @return Returns the Token
     */
    @JsonGetter("token")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Token getToken() {
        return token;
    }

    /**
     * Setter for Token.
     * The tokenized payment source to fund a payment.
     * @param token Value for Token
     */
    @JsonSetter("token")
    public void setToken(Token token) {
        this.token = token;
    }

    /**
     * Getter for Paypal.
     * A resource that identifies a PayPal Wallet is used for payment.
     * @return Returns the PayPalWallet
     */
    @JsonGetter("paypal")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public PayPalWallet getPaypal() {
        return paypal;
    }

    /**
     * Setter for Paypal.
     * A resource that identifies a PayPal Wallet is used for payment.
     * @param paypal Value for PayPalWallet
     */
    @JsonSetter("paypal")
    public void setPaypal(PayPalWallet paypal) {
        this.paypal = paypal;
    }

    /**
     * Getter for Bancontact.
     * Information needed to pay using Bancontact.
     * @return Returns the BancontactPaymentRequest
     */
    @JsonGetter("bancontact")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public BancontactPaymentRequest getBancontact() {
        return bancontact;
    }

    /**
     * Setter for Bancontact.
     * Information needed to pay using Bancontact.
     * @param bancontact Value for BancontactPaymentRequest
     */
    @JsonSetter("bancontact")
    public void setBancontact(BancontactPaymentRequest bancontact) {
        this.bancontact = bancontact;
    }

    /**
     * Getter for Blik.
     * Information needed to pay using BLIK.
     * @return Returns the BLIKPaymentRequest
     */
    @JsonGetter("blik")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public BLIKPaymentRequest getBlik() {
        return blik;
    }

    /**
     * Setter for Blik.
     * Information needed to pay using BLIK.
     * @param blik Value for BLIKPaymentRequest
     */
    @JsonSetter("blik")
    public void setBlik(BLIKPaymentRequest blik) {
        this.blik = blik;
    }

    /**
     * Getter for Eps.
     * Information needed to pay using eps.
     * @return Returns the EPSPaymentRequest
     */
    @JsonGetter("eps")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public EPSPaymentRequest getEps() {
        return eps;
    }

    /**
     * Setter for Eps.
     * Information needed to pay using eps.
     * @param eps Value for EPSPaymentRequest
     */
    @JsonSetter("eps")
    public void setEps(EPSPaymentRequest eps) {
        this.eps = eps;
    }

    /**
     * Getter for Giropay.
     * Information needed to pay using giropay.
     * @return Returns the GiropayPaymentRequest
     */
    @JsonGetter("giropay")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public GiropayPaymentRequest getGiropay() {
        return giropay;
    }

    /**
     * Setter for Giropay.
     * Information needed to pay using giropay.
     * @param giropay Value for GiropayPaymentRequest
     */
    @JsonSetter("giropay")
    public void setGiropay(GiropayPaymentRequest giropay) {
        this.giropay = giropay;
    }

    /**
     * Getter for Ideal.
     * Information needed to pay using iDEAL.
     * @return Returns the IDEALPaymentRequest
     */
    @JsonGetter("ideal")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public IDEALPaymentRequest getIdeal() {
        return ideal;
    }

    /**
     * Setter for Ideal.
     * Information needed to pay using iDEAL.
     * @param ideal Value for IDEALPaymentRequest
     */
    @JsonSetter("ideal")
    public void setIdeal(IDEALPaymentRequest ideal) {
        this.ideal = ideal;
    }

    /**
     * Getter for Mybank.
     * Information needed to pay using MyBank.
     * @return Returns the MyBankPaymentRequest
     */
    @JsonGetter("mybank")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public MyBankPaymentRequest getMybank() {
        return mybank;
    }

    /**
     * Setter for Mybank.
     * Information needed to pay using MyBank.
     * @param mybank Value for MyBankPaymentRequest
     */
    @JsonSetter("mybank")
    public void setMybank(MyBankPaymentRequest mybank) {
        this.mybank = mybank;
    }

    /**
     * Getter for P24.
     * Information needed to pay using P24 (Przelewy24).
     * @return Returns the P24PaymentRequest
     */
    @JsonGetter("p24")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public P24PaymentRequest getP24() {
        return p24;
    }

    /**
     * Setter for P24.
     * Information needed to pay using P24 (Przelewy24).
     * @param p24 Value for P24PaymentRequest
     */
    @JsonSetter("p24")
    public void setP24(P24PaymentRequest p24) {
        this.p24 = p24;
    }

    /**
     * Getter for Sofort.
     * Information needed to pay using Sofort.
     * @return Returns the SofortPaymentRequest
     */
    @JsonGetter("sofort")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public SofortPaymentRequest getSofort() {
        return sofort;
    }

    /**
     * Setter for Sofort.
     * Information needed to pay using Sofort.
     * @param sofort Value for SofortPaymentRequest
     */
    @JsonSetter("sofort")
    public void setSofort(SofortPaymentRequest sofort) {
        this.sofort = sofort;
    }

    /**
     * Getter for Trustly.
     * Information needed to pay using Trustly.
     * @return Returns the TrustlyPaymentRequest
     */
    @JsonGetter("trustly")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public TrustlyPaymentRequest getTrustly() {
        return trustly;
    }

    /**
     * Setter for Trustly.
     * Information needed to pay using Trustly.
     * @param trustly Value for TrustlyPaymentRequest
     */
    @JsonSetter("trustly")
    public void setTrustly(TrustlyPaymentRequest trustly) {
        this.trustly = trustly;
    }

    /**
     * Getter for ApplePay.
     * Information needed to pay using ApplePay.
     * @return Returns the ApplePayRequest
     */
    @JsonGetter("apple_pay")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public ApplePayRequest getApplePay() {
        return applePay;
    }

    /**
     * Setter for ApplePay.
     * Information needed to pay using ApplePay.
     * @param applePay Value for ApplePayRequest
     */
    @JsonSetter("apple_pay")
    public void setApplePay(ApplePayRequest applePay) {
        this.applePay = applePay;
    }

    /**
     * Getter for GooglePay.
     * Information needed to pay using Google Pay.
     * @return Returns the GooglePayRequest
     */
    @JsonGetter("google_pay")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public GooglePayRequest getGooglePay() {
        return googlePay;
    }

    /**
     * Setter for GooglePay.
     * Information needed to pay using Google Pay.
     * @param googlePay Value for GooglePayRequest
     */
    @JsonSetter("google_pay")
    public void setGooglePay(GooglePayRequest googlePay) {
        this.googlePay = googlePay;
    }

    /**
     * Getter for Venmo.
     * Information needed to pay using Venmo.
     * @return Returns the VenmoWalletRequest
     */
    @JsonGetter("venmo")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public VenmoWalletRequest getVenmo() {
        return venmo;
    }

    /**
     * Setter for Venmo.
     * Information needed to pay using Venmo.
     * @param venmo Value for VenmoWalletRequest
     */
    @JsonSetter("venmo")
    public void setVenmo(VenmoWalletRequest venmo) {
        this.venmo = venmo;
    }

    /**
     * Converts this PaymentSource into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "PaymentSource [" + "card=" + card + ", token=" + token + ", paypal=" + paypal
                + ", bancontact=" + bancontact + ", blik=" + blik + ", eps=" + eps + ", giropay="
                + giropay + ", ideal=" + ideal + ", mybank=" + mybank + ", p24=" + p24 + ", sofort="
                + sofort + ", trustly=" + trustly + ", applePay=" + applePay + ", googlePay="
                + googlePay + ", venmo=" + venmo + "]";
    }

    /**
     * Builds a new {@link PaymentSource.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link PaymentSource.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .card(getCard())
                .token(getToken())
                .paypal(getPaypal())
                .bancontact(getBancontact())
                .blik(getBlik())
                .eps(getEps())
                .giropay(getGiropay())
                .ideal(getIdeal())
                .mybank(getMybank())
                .p24(getP24())
                .sofort(getSofort())
                .trustly(getTrustly())
                .applePay(getApplePay())
                .googlePay(getGooglePay())
                .venmo(getVenmo());
        return builder;
    }

    /**
     * Class to build instances of {@link PaymentSource}.
     */
    public static class Builder {
        private CardRequest card;
        private Token token;
        private PayPalWallet paypal;
        private BancontactPaymentRequest bancontact;
        private BLIKPaymentRequest blik;
        private EPSPaymentRequest eps;
        private GiropayPaymentRequest giropay;
        private IDEALPaymentRequest ideal;
        private MyBankPaymentRequest mybank;
        private P24PaymentRequest p24;
        private SofortPaymentRequest sofort;
        private TrustlyPaymentRequest trustly;
        private ApplePayRequest applePay;
        private GooglePayRequest googlePay;
        private VenmoWalletRequest venmo;



        /**
         * Setter for card.
         * @param  card  CardRequest value for card.
         * @return Builder
         */
        public Builder card(CardRequest card) {
            this.card = card;
            return this;
        }

        /**
         * Setter for token.
         * @param  token  Token value for token.
         * @return Builder
         */
        public Builder token(Token token) {
            this.token = token;
            return this;
        }

        /**
         * Setter for paypal.
         * @param  paypal  PayPalWallet value for paypal.
         * @return Builder
         */
        public Builder paypal(PayPalWallet paypal) {
            this.paypal = paypal;
            return this;
        }

        /**
         * Setter for bancontact.
         * @param  bancontact  BancontactPaymentRequest value for bancontact.
         * @return Builder
         */
        public Builder bancontact(BancontactPaymentRequest bancontact) {
            this.bancontact = bancontact;
            return this;
        }

        /**
         * Setter for blik.
         * @param  blik  BLIKPaymentRequest value for blik.
         * @return Builder
         */
        public Builder blik(BLIKPaymentRequest blik) {
            this.blik = blik;
            return this;
        }

        /**
         * Setter for eps.
         * @param  eps  EPSPaymentRequest value for eps.
         * @return Builder
         */
        public Builder eps(EPSPaymentRequest eps) {
            this.eps = eps;
            return this;
        }

        /**
         * Setter for giropay.
         * @param  giropay  GiropayPaymentRequest value for giropay.
         * @return Builder
         */
        public Builder giropay(GiropayPaymentRequest giropay) {
            this.giropay = giropay;
            return this;
        }

        /**
         * Setter for ideal.
         * @param  ideal  IDEALPaymentRequest value for ideal.
         * @return Builder
         */
        public Builder ideal(IDEALPaymentRequest ideal) {
            this.ideal = ideal;
            return this;
        }

        /**
         * Setter for mybank.
         * @param  mybank  MyBankPaymentRequest value for mybank.
         * @return Builder
         */
        public Builder mybank(MyBankPaymentRequest mybank) {
            this.mybank = mybank;
            return this;
        }

        /**
         * Setter for p24.
         * @param  p24  P24PaymentRequest value for p24.
         * @return Builder
         */
        public Builder p24(P24PaymentRequest p24) {
            this.p24 = p24;
            return this;
        }

        /**
         * Setter for sofort.
         * @param  sofort  SofortPaymentRequest value for sofort.
         * @return Builder
         */
        public Builder sofort(SofortPaymentRequest sofort) {
            this.sofort = sofort;
            return this;
        }

        /**
         * Setter for trustly.
         * @param  trustly  TrustlyPaymentRequest value for trustly.
         * @return Builder
         */
        public Builder trustly(TrustlyPaymentRequest trustly) {
            this.trustly = trustly;
            return this;
        }

        /**
         * Setter for applePay.
         * @param  applePay  ApplePayRequest value for applePay.
         * @return Builder
         */
        public Builder applePay(ApplePayRequest applePay) {
            this.applePay = applePay;
            return this;
        }

        /**
         * Setter for googlePay.
         * @param  googlePay  GooglePayRequest value for googlePay.
         * @return Builder
         */
        public Builder googlePay(GooglePayRequest googlePay) {
            this.googlePay = googlePay;
            return this;
        }

        /**
         * Setter for venmo.
         * @param  venmo  VenmoWalletRequest value for venmo.
         * @return Builder
         */
        public Builder venmo(VenmoWalletRequest venmo) {
            this.venmo = venmo;
            return this;
        }

        /**
         * Builds a new {@link PaymentSource} object using the set fields.
         * @return {@link PaymentSource}
         */
        public PaymentSource build() {
            return new PaymentSource(card, token, paypal, bancontact, blik, eps, giropay, ideal,
                    mybank, p24, sofort, trustly, applePay, googlePay, venmo);
        }
    }
}
