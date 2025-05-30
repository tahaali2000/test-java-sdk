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
 * This is a model class for ApplePayPaymentToken type.
 */
public class ApplePayPaymentToken {
    private ApplePayCard card;

    /**
     * Default constructor.
     */
    public ApplePayPaymentToken() {
    }

    /**
     * Initialization constructor.
     * @param  card  ApplePayCard value for card.
     */
    public ApplePayPaymentToken(
            ApplePayCard card) {
        this.card = card;
    }

    /**
     * Getter for Card.
     * The payment card to be used to fund a payment. Can be a credit or debit card.
     * @return Returns the ApplePayCard
     */
    @JsonGetter("card")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public ApplePayCard getCard() {
        return card;
    }

    /**
     * Setter for Card.
     * The payment card to be used to fund a payment. Can be a credit or debit card.
     * @param card Value for ApplePayCard
     */
    @JsonSetter("card")
    public void setCard(ApplePayCard card) {
        this.card = card;
    }

    /**
     * Converts this ApplePayPaymentToken into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ApplePayPaymentToken [" + "card=" + card + "]";
    }

    /**
     * Builds a new {@link ApplePayPaymentToken.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ApplePayPaymentToken.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .card(getCard());
        return builder;
    }

    /**
     * Class to build instances of {@link ApplePayPaymentToken}.
     */
    public static class Builder {
        private ApplePayCard card;



        /**
         * Setter for card.
         * @param  card  ApplePayCard value for card.
         * @return Builder
         */
        public Builder card(ApplePayCard card) {
            this.card = card;
            return this;
        }

        /**
         * Builds a new {@link ApplePayPaymentToken} object using the set fields.
         * @return {@link ApplePayPaymentToken}
         */
        public ApplePayPaymentToken build() {
            return new ApplePayPaymentToken(card);
        }
    }
}
