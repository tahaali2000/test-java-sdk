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
 * This is a model class for OrderAuthorizeResponsePaymentSource type.
 */
public class OrderAuthorizeResponsePaymentSource {
    private CardResponse card;
    private PayPalWalletResponse paypal;
    private ApplePayPaymentObject applePay;
    private GooglePayWalletResponse googlePay;
    private VenmoWalletResponse venmo;

    /**
     * Default constructor.
     */
    public OrderAuthorizeResponsePaymentSource() {
    }

    /**
     * Initialization constructor.
     * @param  card  CardResponse value for card.
     * @param  paypal  PayPalWalletResponse value for paypal.
     * @param  applePay  ApplePayPaymentObject value for applePay.
     * @param  googlePay  GooglePayWalletResponse value for googlePay.
     * @param  venmo  VenmoWalletResponse value for venmo.
     */
    public OrderAuthorizeResponsePaymentSource(
            CardResponse card,
            PayPalWalletResponse paypal,
            ApplePayPaymentObject applePay,
            GooglePayWalletResponse googlePay,
            VenmoWalletResponse venmo) {
        this.card = card;
        this.paypal = paypal;
        this.applePay = applePay;
        this.googlePay = googlePay;
        this.venmo = venmo;
    }

    /**
     * Getter for Card.
     * The payment card to use to fund a payment. Card can be a credit or debit card.
     * @return Returns the CardResponse
     */
    @JsonGetter("card")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public CardResponse getCard() {
        return card;
    }

    /**
     * Setter for Card.
     * The payment card to use to fund a payment. Card can be a credit or debit card.
     * @param card Value for CardResponse
     */
    @JsonSetter("card")
    public void setCard(CardResponse card) {
        this.card = card;
    }

    /**
     * Getter for Paypal.
     * The PayPal Wallet response.
     * @return Returns the PayPalWalletResponse
     */
    @JsonGetter("paypal")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public PayPalWalletResponse getPaypal() {
        return paypal;
    }

    /**
     * Setter for Paypal.
     * The PayPal Wallet response.
     * @param paypal Value for PayPalWalletResponse
     */
    @JsonSetter("paypal")
    public void setPaypal(PayPalWalletResponse paypal) {
        this.paypal = paypal;
    }

    /**
     * Getter for ApplePay.
     * Information needed to pay using ApplePay.
     * @return Returns the ApplePayPaymentObject
     */
    @JsonGetter("apple_pay")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public ApplePayPaymentObject getApplePay() {
        return applePay;
    }

    /**
     * Setter for ApplePay.
     * Information needed to pay using ApplePay.
     * @param applePay Value for ApplePayPaymentObject
     */
    @JsonSetter("apple_pay")
    public void setApplePay(ApplePayPaymentObject applePay) {
        this.applePay = applePay;
    }

    /**
     * Getter for GooglePay.
     * Google Pay Wallet payment data.
     * @return Returns the GooglePayWalletResponse
     */
    @JsonGetter("google_pay")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public GooglePayWalletResponse getGooglePay() {
        return googlePay;
    }

    /**
     * Setter for GooglePay.
     * Google Pay Wallet payment data.
     * @param googlePay Value for GooglePayWalletResponse
     */
    @JsonSetter("google_pay")
    public void setGooglePay(GooglePayWalletResponse googlePay) {
        this.googlePay = googlePay;
    }

    /**
     * Getter for Venmo.
     * Venmo wallet response.
     * @return Returns the VenmoWalletResponse
     */
    @JsonGetter("venmo")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public VenmoWalletResponse getVenmo() {
        return venmo;
    }

    /**
     * Setter for Venmo.
     * Venmo wallet response.
     * @param venmo Value for VenmoWalletResponse
     */
    @JsonSetter("venmo")
    public void setVenmo(VenmoWalletResponse venmo) {
        this.venmo = venmo;
    }

    /**
     * Converts this OrderAuthorizeResponsePaymentSource into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "OrderAuthorizeResponsePaymentSource [" + "card=" + card + ", paypal=" + paypal
                + ", applePay=" + applePay + ", googlePay=" + googlePay + ", venmo=" + venmo + "]";
    }

    /**
     * Builds a new {@link OrderAuthorizeResponsePaymentSource.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link OrderAuthorizeResponsePaymentSource.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .card(getCard())
                .paypal(getPaypal())
                .applePay(getApplePay())
                .googlePay(getGooglePay())
                .venmo(getVenmo());
        return builder;
    }

    /**
     * Class to build instances of {@link OrderAuthorizeResponsePaymentSource}.
     */
    public static class Builder {
        private CardResponse card;
        private PayPalWalletResponse paypal;
        private ApplePayPaymentObject applePay;
        private GooglePayWalletResponse googlePay;
        private VenmoWalletResponse venmo;



        /**
         * Setter for card.
         * @param  card  CardResponse value for card.
         * @return Builder
         */
        public Builder card(CardResponse card) {
            this.card = card;
            return this;
        }

        /**
         * Setter for paypal.
         * @param  paypal  PayPalWalletResponse value for paypal.
         * @return Builder
         */
        public Builder paypal(PayPalWalletResponse paypal) {
            this.paypal = paypal;
            return this;
        }

        /**
         * Setter for applePay.
         * @param  applePay  ApplePayPaymentObject value for applePay.
         * @return Builder
         */
        public Builder applePay(ApplePayPaymentObject applePay) {
            this.applePay = applePay;
            return this;
        }

        /**
         * Setter for googlePay.
         * @param  googlePay  GooglePayWalletResponse value for googlePay.
         * @return Builder
         */
        public Builder googlePay(GooglePayWalletResponse googlePay) {
            this.googlePay = googlePay;
            return this;
        }

        /**
         * Setter for venmo.
         * @param  venmo  VenmoWalletResponse value for venmo.
         * @return Builder
         */
        public Builder venmo(VenmoWalletResponse venmo) {
            this.venmo = venmo;
            return this;
        }

        /**
         * Builds a new {@link OrderAuthorizeResponsePaymentSource} object using the set fields.
         * @return {@link OrderAuthorizeResponsePaymentSource}
         */
        public OrderAuthorizeResponsePaymentSource build() {
            return new OrderAuthorizeResponsePaymentSource(card, paypal, applePay, googlePay,
                    venmo);
        }
    }
}
