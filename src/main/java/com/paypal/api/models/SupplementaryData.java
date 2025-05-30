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
 * This is a model class for SupplementaryData type.
 */
public class SupplementaryData {
    private CardSupplementaryData card;

    /**
     * Default constructor.
     */
    public SupplementaryData() {
    }

    /**
     * Initialization constructor.
     * @param  card  CardSupplementaryData value for card.
     */
    public SupplementaryData(
            CardSupplementaryData card) {
        this.card = card;
    }

    /**
     * Getter for Card.
     * Merchants and partners can add Level 2 and 3 data to payments to reduce risk and payment
     * processing costs. For more information about processing payments, see &lt;a
     * href="https://developer.paypal.com/docs/checkout/advanced/processing/"&gt;checkout&lt;/a&gt; or &lt;a
     * href="https://developer.paypal.com/docs/multiparty/checkout/advanced/processing/"&gt;multiparty
     * checkout&lt;/a&gt;.
     * @return Returns the CardSupplementaryData
     */
    @JsonGetter("card")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public CardSupplementaryData getCard() {
        return card;
    }

    /**
     * Setter for Card.
     * Merchants and partners can add Level 2 and 3 data to payments to reduce risk and payment
     * processing costs. For more information about processing payments, see &lt;a
     * href="https://developer.paypal.com/docs/checkout/advanced/processing/"&gt;checkout&lt;/a&gt; or &lt;a
     * href="https://developer.paypal.com/docs/multiparty/checkout/advanced/processing/"&gt;multiparty
     * checkout&lt;/a&gt;.
     * @param card Value for CardSupplementaryData
     */
    @JsonSetter("card")
    public void setCard(CardSupplementaryData card) {
        this.card = card;
    }

    /**
     * Converts this SupplementaryData into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "SupplementaryData [" + "card=" + card + "]";
    }

    /**
     * Builds a new {@link SupplementaryData.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link SupplementaryData.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .card(getCard());
        return builder;
    }

    /**
     * Class to build instances of {@link SupplementaryData}.
     */
    public static class Builder {
        private CardSupplementaryData card;



        /**
         * Setter for card.
         * @param  card  CardSupplementaryData value for card.
         * @return Builder
         */
        public Builder card(CardSupplementaryData card) {
            this.card = card;
            return this;
        }

        /**
         * Builds a new {@link SupplementaryData} object using the set fields.
         * @return {@link SupplementaryData}
         */
        public SupplementaryData build() {
            return new SupplementaryData(card);
        }
    }
}
