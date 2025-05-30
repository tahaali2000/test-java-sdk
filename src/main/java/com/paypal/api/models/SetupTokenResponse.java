/*
 * PayPalRESTAPIsLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.paypal.api.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import java.util.List;

/**
 * This is a model class for SetupTokenResponse type.
 */
public class SetupTokenResponse {
    private String id;
    private Integer ordinal;
    private CustomerRequest customer;
    private String status;
    private SetupTokenResponsePaymentSource paymentSource;
    private List<LinkDescription> links;

    /**
     * Default constructor.
     */
    public SetupTokenResponse() {
        status = "CREATED";
    }

    /**
     * Initialization constructor.
     * @param  id  String value for id.
     * @param  ordinal  Integer value for ordinal.
     * @param  customer  CustomerRequest value for customer.
     * @param  status  String value for status.
     * @param  paymentSource  SetupTokenResponsePaymentSource value for paymentSource.
     * @param  links  List of LinkDescription value for links.
     */
    public SetupTokenResponse(
            String id,
            Integer ordinal,
            CustomerRequest customer,
            String status,
            SetupTokenResponsePaymentSource paymentSource,
            List<LinkDescription> links) {
        this.id = id;
        this.ordinal = ordinal;
        this.customer = customer;
        this.status = status;
        this.paymentSource = paymentSource;
        this.links = links;
    }

    /**
     * Getter for Id.
     * The PayPal-generated ID for the vault token.
     * @return Returns the String
     */
    @JsonGetter("id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getId() {
        return id;
    }

    /**
     * Setter for Id.
     * The PayPal-generated ID for the vault token.
     * @param id Value for String
     */
    @JsonSetter("id")
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Getter for Ordinal.
     * Ordinal number for sorting.
     * @return Returns the Integer
     */
    @JsonGetter("ordinal")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getOrdinal() {
        return ordinal;
    }

    /**
     * Setter for Ordinal.
     * Ordinal number for sorting.
     * @param ordinal Value for Integer
     */
    @JsonSetter("ordinal")
    public void setOrdinal(Integer ordinal) {
        this.ordinal = ordinal;
    }

    /**
     * Getter for Customer.
     * Customer in merchant's or partner's system of records.
     * @return Returns the CustomerRequest
     */
    @JsonGetter("customer")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public CustomerRequest getCustomer() {
        return customer;
    }

    /**
     * Setter for Customer.
     * Customer in merchant's or partner's system of records.
     * @param customer Value for CustomerRequest
     */
    @JsonSetter("customer")
    public void setCustomer(CustomerRequest customer) {
        this.customer = customer;
    }

    /**
     * Getter for Status.
     * The status of the payment token.
     * @return Returns the String
     */
    @JsonGetter("status")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getStatus() {
        return status;
    }

    /**
     * Setter for Status.
     * The status of the payment token.
     * @param status Value for String
     */
    @JsonSetter("status")
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * Getter for PaymentSource.
     * The setup payment method details.
     * @return Returns the SetupTokenResponsePaymentSource
     */
    @JsonGetter("payment_source")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public SetupTokenResponsePaymentSource getPaymentSource() {
        return paymentSource;
    }

    /**
     * Setter for PaymentSource.
     * The setup payment method details.
     * @param paymentSource Value for SetupTokenResponsePaymentSource
     */
    @JsonSetter("payment_source")
    public void setPaymentSource(SetupTokenResponsePaymentSource paymentSource) {
        this.paymentSource = paymentSource;
    }

    /**
     * Getter for Links.
     * An array of related [HATEOAS links](/api/rest/responses/#hateoas).
     * @return Returns the List of LinkDescription
     */
    @JsonGetter("links")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<LinkDescription> getLinks() {
        return links;
    }

    /**
     * Setter for Links.
     * An array of related [HATEOAS links](/api/rest/responses/#hateoas).
     * @param links Value for List of LinkDescription
     */
    @JsonSetter("links")
    public void setLinks(List<LinkDescription> links) {
        this.links = links;
    }

    /**
     * Converts this SetupTokenResponse into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "SetupTokenResponse [" + "id=" + id + ", ordinal=" + ordinal + ", customer="
                + customer + ", status=" + status + ", paymentSource=" + paymentSource + ", links="
                + links + "]";
    }

    /**
     * Builds a new {@link SetupTokenResponse.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link SetupTokenResponse.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .id(getId())
                .ordinal(getOrdinal())
                .customer(getCustomer())
                .status(getStatus())
                .paymentSource(getPaymentSource())
                .links(getLinks());
        return builder;
    }

    /**
     * Class to build instances of {@link SetupTokenResponse}.
     */
    public static class Builder {
        private String id;
        private Integer ordinal;
        private CustomerRequest customer;
        private String status = "CREATED";
        private SetupTokenResponsePaymentSource paymentSource;
        private List<LinkDescription> links;



        /**
         * Setter for id.
         * @param  id  String value for id.
         * @return Builder
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }

        /**
         * Setter for ordinal.
         * @param  ordinal  Integer value for ordinal.
         * @return Builder
         */
        public Builder ordinal(Integer ordinal) {
            this.ordinal = ordinal;
            return this;
        }

        /**
         * Setter for customer.
         * @param  customer  CustomerRequest value for customer.
         * @return Builder
         */
        public Builder customer(CustomerRequest customer) {
            this.customer = customer;
            return this;
        }

        /**
         * Setter for status.
         * @param  status  String value for status.
         * @return Builder
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * Setter for paymentSource.
         * @param  paymentSource  SetupTokenResponsePaymentSource value for paymentSource.
         * @return Builder
         */
        public Builder paymentSource(SetupTokenResponsePaymentSource paymentSource) {
            this.paymentSource = paymentSource;
            return this;
        }

        /**
         * Setter for links.
         * @param  links  List of LinkDescription value for links.
         * @return Builder
         */
        public Builder links(List<LinkDescription> links) {
            this.links = links;
            return this;
        }

        /**
         * Builds a new {@link SetupTokenResponse} object using the set fields.
         * @return {@link SetupTokenResponse}
         */
        public SetupTokenResponse build() {
            return new SetupTokenResponse(id, ordinal, customer, status, paymentSource, links);
        }
    }
}
