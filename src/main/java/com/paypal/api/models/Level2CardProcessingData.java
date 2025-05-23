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
 * This is a model class for Level2CardProcessingData type.
 */
public class Level2CardProcessingData {
    private String invoiceId;
    private Money taxTotal;

    /**
     * Default constructor.
     */
    public Level2CardProcessingData() {
    }

    /**
     * Initialization constructor.
     * @param  invoiceId  String value for invoiceId.
     * @param  taxTotal  Money value for taxTotal.
     */
    public Level2CardProcessingData(
            String invoiceId,
            Money taxTotal) {
        this.invoiceId = invoiceId;
        this.taxTotal = taxTotal;
    }

    /**
     * Getter for InvoiceId.
     * Use this field to pass a purchase identification value of up to 12 ASCII characters for AIB
     * and 17 ASCII characters for all other processors.
     * @return Returns the String
     */
    @JsonGetter("invoice_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getInvoiceId() {
        return invoiceId;
    }

    /**
     * Setter for InvoiceId.
     * Use this field to pass a purchase identification value of up to 12 ASCII characters for AIB
     * and 17 ASCII characters for all other processors.
     * @param invoiceId Value for String
     */
    @JsonSetter("invoice_id")
    public void setInvoiceId(String invoiceId) {
        this.invoiceId = invoiceId;
    }

    /**
     * Getter for TaxTotal.
     * The currency and amount for a financial transaction, such as a balance or payment due.
     * @return Returns the Money
     */
    @JsonGetter("tax_total")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Money getTaxTotal() {
        return taxTotal;
    }

    /**
     * Setter for TaxTotal.
     * The currency and amount for a financial transaction, such as a balance or payment due.
     * @param taxTotal Value for Money
     */
    @JsonSetter("tax_total")
    public void setTaxTotal(Money taxTotal) {
        this.taxTotal = taxTotal;
    }

    /**
     * Converts this Level2CardProcessingData into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "Level2CardProcessingData [" + "invoiceId=" + invoiceId + ", taxTotal=" + taxTotal
                + "]";
    }

    /**
     * Builds a new {@link Level2CardProcessingData.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Level2CardProcessingData.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .invoiceId(getInvoiceId())
                .taxTotal(getTaxTotal());
        return builder;
    }

    /**
     * Class to build instances of {@link Level2CardProcessingData}.
     */
    public static class Builder {
        private String invoiceId;
        private Money taxTotal;



        /**
         * Setter for invoiceId.
         * @param  invoiceId  String value for invoiceId.
         * @return Builder
         */
        public Builder invoiceId(String invoiceId) {
            this.invoiceId = invoiceId;
            return this;
        }

        /**
         * Setter for taxTotal.
         * @param  taxTotal  Money value for taxTotal.
         * @return Builder
         */
        public Builder taxTotal(Money taxTotal) {
            this.taxTotal = taxTotal;
            return this;
        }

        /**
         * Builds a new {@link Level2CardProcessingData} object using the set fields.
         * @return {@link Level2CardProcessingData}
         */
        public Level2CardProcessingData build() {
            return new Level2CardProcessingData(invoiceId, taxTotal);
        }
    }
}
