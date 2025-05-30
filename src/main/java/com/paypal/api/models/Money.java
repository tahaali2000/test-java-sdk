/*
 * PayPalRESTAPIsLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.paypal.api.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * This is a model class for Money type.
 */
public class Money {
    private String currencyCode;
    private String value;

    /**
     * Default constructor.
     */
    public Money() {
    }

    /**
     * Initialization constructor.
     * @param  currencyCode  String value for currencyCode.
     * @param  value  String value for value.
     */
    public Money(
            String currencyCode,
            String value) {
        this.currencyCode = currencyCode;
        this.value = value;
    }

    /**
     * Getter for CurrencyCode.
     * The [three-character ISO-4217 currency code](/api/rest/reference/currency-codes/) that
     * identifies the currency.
     * @return Returns the String
     */
    @JsonGetter("currency_code")
    public String getCurrencyCode() {
        return currencyCode;
    }

    /**
     * Setter for CurrencyCode.
     * The [three-character ISO-4217 currency code](/api/rest/reference/currency-codes/) that
     * identifies the currency.
     * @param currencyCode Value for String
     */
    @JsonSetter("currency_code")
    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    /**
     * Getter for Value.
     * The value, which might be:&lt;ul&gt;&lt;li&gt;An integer for currencies like `JPY` that are not typically
     * fractional.&lt;/li&gt;&lt;li&gt;A decimal fraction for currencies like `TND` that are subdivided into
     * thousandths.&lt;/li&gt;&lt;/ul&gt;For the required number of decimal places for a currency code, see
     * [Currency Codes](/api/rest/reference/currency-codes/).
     * @return Returns the String
     */
    @JsonGetter("value")
    public String getValue() {
        return value;
    }

    /**
     * Setter for Value.
     * The value, which might be:&lt;ul&gt;&lt;li&gt;An integer for currencies like `JPY` that are not typically
     * fractional.&lt;/li&gt;&lt;li&gt;A decimal fraction for currencies like `TND` that are subdivided into
     * thousandths.&lt;/li&gt;&lt;/ul&gt;For the required number of decimal places for a currency code, see
     * [Currency Codes](/api/rest/reference/currency-codes/).
     * @param value Value for String
     */
    @JsonSetter("value")
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Converts this Money into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "Money [" + "currencyCode=" + currencyCode + ", value=" + value + "]";
    }

    /**
     * Builds a new {@link Money.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Money.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(currencyCode, value);
        return builder;
    }

    /**
     * Class to build instances of {@link Money}.
     */
    public static class Builder {
        private String currencyCode;
        private String value;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  currencyCode  String value for currencyCode.
         * @param  value  String value for value.
         */
        public Builder(String currencyCode, String value) {
            this.currencyCode = currencyCode;
            this.value = value;
        }

        /**
         * Setter for currencyCode.
         * @param  currencyCode  String value for currencyCode.
         * @return Builder
         */
        public Builder currencyCode(String currencyCode) {
            this.currencyCode = currencyCode;
            return this;
        }

        /**
         * Setter for value.
         * @param  value  String value for value.
         * @return Builder
         */
        public Builder value(String value) {
            this.value = value;
            return this;
        }

        /**
         * Builds a new {@link Money} object using the set fields.
         * @return {@link Money}
         */
        public Money build() {
            return new Money(currencyCode, value);
        }
    }
}
