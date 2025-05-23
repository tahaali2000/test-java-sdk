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
 * This is a model class for GooglePayCardResponse type.
 */
public class GooglePayCardResponse {
    private String name;
    private String lastDigits;
    private CardType type;
    private CardBrand brand;
    private Address billingAddress;
    private AuthenticationResponse authenticationResult;

    /**
     * Default constructor.
     */
    public GooglePayCardResponse() {
    }

    /**
     * Initialization constructor.
     * @param  name  String value for name.
     * @param  lastDigits  String value for lastDigits.
     * @param  type  CardType value for type.
     * @param  brand  CardBrand value for brand.
     * @param  billingAddress  Address value for billingAddress.
     * @param  authenticationResult  AuthenticationResponse value for authenticationResult.
     */
    public GooglePayCardResponse(
            String name,
            String lastDigits,
            CardType type,
            CardBrand brand,
            Address billingAddress,
            AuthenticationResponse authenticationResult) {
        this.name = name;
        this.lastDigits = lastDigits;
        this.type = type;
        this.brand = brand;
        this.billingAddress = billingAddress;
        this.authenticationResult = authenticationResult;
    }

    /**
     * Getter for Name.
     * The card holder's name as it appears on the card.
     * @return Returns the String
     */
    @JsonGetter("name")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getName() {
        return name;
    }

    /**
     * Setter for Name.
     * The card holder's name as it appears on the card.
     * @param name Value for String
     */
    @JsonSetter("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Getter for LastDigits.
     * The last digits of the payment card.
     * @return Returns the String
     */
    @JsonGetter("last_digits")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getLastDigits() {
        return lastDigits;
    }

    /**
     * Setter for LastDigits.
     * The last digits of the payment card.
     * @param lastDigits Value for String
     */
    @JsonSetter("last_digits")
    public void setLastDigits(String lastDigits) {
        this.lastDigits = lastDigits;
    }

    /**
     * Getter for Type.
     * Type of card. i.e Credit, Debit and so on.
     * @return Returns the CardType
     */
    @JsonGetter("type")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public CardType getType() {
        return type;
    }

    /**
     * Setter for Type.
     * Type of card. i.e Credit, Debit and so on.
     * @param type Value for CardType
     */
    @JsonSetter("type")
    public void setType(CardType type) {
        this.type = type;
    }

    /**
     * Getter for Brand.
     * The card network or brand. Applies to credit, debit, gift, and payment cards.
     * @return Returns the CardBrand
     */
    @JsonGetter("brand")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public CardBrand getBrand() {
        return brand;
    }

    /**
     * Setter for Brand.
     * The card network or brand. Applies to credit, debit, gift, and payment cards.
     * @param brand Value for CardBrand
     */
    @JsonSetter("brand")
    public void setBrand(CardBrand brand) {
        this.brand = brand;
    }

    /**
     * Getter for BillingAddress.
     * The portable international postal address. Maps to
     * [AddressValidationMetadata](https://github.com/googlei18n/libaddressinput/wiki/AddressValidationMetadata)
     * and HTML 5.1 [Autofilling form controls: the autocomplete
     * attribute](https://www.w3.org/TR/html51/sec-forms.html#autofilling-form-controls-the-autocomplete-attribute).
     * @return Returns the Address
     */
    @JsonGetter("billing_address")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Address getBillingAddress() {
        return billingAddress;
    }

    /**
     * Setter for BillingAddress.
     * The portable international postal address. Maps to
     * [AddressValidationMetadata](https://github.com/googlei18n/libaddressinput/wiki/AddressValidationMetadata)
     * and HTML 5.1 [Autofilling form controls: the autocomplete
     * attribute](https://www.w3.org/TR/html51/sec-forms.html#autofilling-form-controls-the-autocomplete-attribute).
     * @param billingAddress Value for Address
     */
    @JsonSetter("billing_address")
    public void setBillingAddress(Address billingAddress) {
        this.billingAddress = billingAddress;
    }

    /**
     * Getter for AuthenticationResult.
     * Results of Authentication such as 3D Secure.
     * @return Returns the AuthenticationResponse
     */
    @JsonGetter("authentication_result")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public AuthenticationResponse getAuthenticationResult() {
        return authenticationResult;
    }

    /**
     * Setter for AuthenticationResult.
     * Results of Authentication such as 3D Secure.
     * @param authenticationResult Value for AuthenticationResponse
     */
    @JsonSetter("authentication_result")
    public void setAuthenticationResult(AuthenticationResponse authenticationResult) {
        this.authenticationResult = authenticationResult;
    }

    /**
     * Converts this GooglePayCardResponse into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "GooglePayCardResponse [" + "name=" + name + ", lastDigits=" + lastDigits + ", type="
                + type + ", brand=" + brand + ", billingAddress=" + billingAddress
                + ", authenticationResult=" + authenticationResult + "]";
    }

    /**
     * Builds a new {@link GooglePayCardResponse.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link GooglePayCardResponse.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .name(getName())
                .lastDigits(getLastDigits())
                .type(getType())
                .brand(getBrand())
                .billingAddress(getBillingAddress())
                .authenticationResult(getAuthenticationResult());
        return builder;
    }

    /**
     * Class to build instances of {@link GooglePayCardResponse}.
     */
    public static class Builder {
        private String name;
        private String lastDigits;
        private CardType type;
        private CardBrand brand;
        private Address billingAddress;
        private AuthenticationResponse authenticationResult;



        /**
         * Setter for name.
         * @param  name  String value for name.
         * @return Builder
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * Setter for lastDigits.
         * @param  lastDigits  String value for lastDigits.
         * @return Builder
         */
        public Builder lastDigits(String lastDigits) {
            this.lastDigits = lastDigits;
            return this;
        }

        /**
         * Setter for type.
         * @param  type  CardType value for type.
         * @return Builder
         */
        public Builder type(CardType type) {
            this.type = type;
            return this;
        }

        /**
         * Setter for brand.
         * @param  brand  CardBrand value for brand.
         * @return Builder
         */
        public Builder brand(CardBrand brand) {
            this.brand = brand;
            return this;
        }

        /**
         * Setter for billingAddress.
         * @param  billingAddress  Address value for billingAddress.
         * @return Builder
         */
        public Builder billingAddress(Address billingAddress) {
            this.billingAddress = billingAddress;
            return this;
        }

        /**
         * Setter for authenticationResult.
         * @param  authenticationResult  AuthenticationResponse value for authenticationResult.
         * @return Builder
         */
        public Builder authenticationResult(AuthenticationResponse authenticationResult) {
            this.authenticationResult = authenticationResult;
            return this;
        }

        /**
         * Builds a new {@link GooglePayCardResponse} object using the set fields.
         * @return {@link GooglePayCardResponse}
         */
        public GooglePayCardResponse build() {
            return new GooglePayCardResponse(name, lastDigits, type, brand, billingAddress,
                    authenticationResult);
        }
    }
}
