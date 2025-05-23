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
 * This is a model class for OrderRequest type.
 */
public class OrderRequest {
    private CheckoutPaymentIntent intent;
    private Payer payer;
    private List<PurchaseUnitRequest> purchaseUnits;
    private PaymentSource paymentSource;
    private OrderApplicationContext applicationContext;

    /**
     * Default constructor.
     */
    public OrderRequest() {
    }

    /**
     * Initialization constructor.
     * @param  intent  CheckoutPaymentIntent value for intent.
     * @param  purchaseUnits  List of PurchaseUnitRequest value for purchaseUnits.
     * @param  payer  Payer value for payer.
     * @param  paymentSource  PaymentSource value for paymentSource.
     * @param  applicationContext  OrderApplicationContext value for applicationContext.
     */
    public OrderRequest(
            CheckoutPaymentIntent intent,
            List<PurchaseUnitRequest> purchaseUnits,
            Payer payer,
            PaymentSource paymentSource,
            OrderApplicationContext applicationContext) {
        this.intent = intent;
        this.payer = payer;
        this.purchaseUnits = purchaseUnits;
        this.paymentSource = paymentSource;
        this.applicationContext = applicationContext;
    }

    /**
     * Getter for Intent.
     * The intent to either capture payment immediately or authorize a payment for an order after
     * order creation.
     * @return Returns the CheckoutPaymentIntent
     */
    @JsonGetter("intent")
    public CheckoutPaymentIntent getIntent() {
        return intent;
    }

    /**
     * Setter for Intent.
     * The intent to either capture payment immediately or authorize a payment for an order after
     * order creation.
     * @param intent Value for CheckoutPaymentIntent
     */
    @JsonSetter("intent")
    public void setIntent(CheckoutPaymentIntent intent) {
        this.intent = intent;
    }

    /**
     * Getter for Payer.
     * @return Returns the Payer
     */
    @JsonGetter("payer")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Payer getPayer() {
        return payer;
    }

    /**
     * Setter for Payer.
     * @param payer Value for Payer
     */
    @JsonSetter("payer")
    public void setPayer(Payer payer) {
        this.payer = payer;
    }

    /**
     * Getter for PurchaseUnits.
     * An array of purchase units. Each purchase unit establishes a contract between a payer and the
     * payee. Each purchase unit represents either a full or partial order that the payer intends to
     * purchase from the payee.
     * @return Returns the List of PurchaseUnitRequest
     */
    @JsonGetter("purchase_units")
    public List<PurchaseUnitRequest> getPurchaseUnits() {
        return purchaseUnits;
    }

    /**
     * Setter for PurchaseUnits.
     * An array of purchase units. Each purchase unit establishes a contract between a payer and the
     * payee. Each purchase unit represents either a full or partial order that the payer intends to
     * purchase from the payee.
     * @param purchaseUnits Value for List of PurchaseUnitRequest
     */
    @JsonSetter("purchase_units")
    public void setPurchaseUnits(List<PurchaseUnitRequest> purchaseUnits) {
        this.purchaseUnits = purchaseUnits;
    }

    /**
     * Getter for PaymentSource.
     * The payment source definition.
     * @return Returns the PaymentSource
     */
    @JsonGetter("payment_source")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public PaymentSource getPaymentSource() {
        return paymentSource;
    }

    /**
     * Setter for PaymentSource.
     * The payment source definition.
     * @param paymentSource Value for PaymentSource
     */
    @JsonSetter("payment_source")
    public void setPaymentSource(PaymentSource paymentSource) {
        this.paymentSource = paymentSource;
    }

    /**
     * Getter for ApplicationContext.
     * Customizes the payer experience during the approval process for the payment with
     * PayPal.&lt;blockquote&gt;&lt;strong&gt;Note:&lt;/strong&gt; Partners and Marketplaces might configure
     * &lt;code&gt;brand_name&lt;/code&gt; and &lt;code&gt;shipping_preference&lt;/code&gt; during partner account setup,
     * which overrides the request values.&lt;/blockquote&gt;
     * @return Returns the OrderApplicationContext
     */
    @JsonGetter("application_context")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public OrderApplicationContext getApplicationContext() {
        return applicationContext;
    }

    /**
     * Setter for ApplicationContext.
     * Customizes the payer experience during the approval process for the payment with
     * PayPal.&lt;blockquote&gt;&lt;strong&gt;Note:&lt;/strong&gt; Partners and Marketplaces might configure
     * &lt;code&gt;brand_name&lt;/code&gt; and &lt;code&gt;shipping_preference&lt;/code&gt; during partner account setup,
     * which overrides the request values.&lt;/blockquote&gt;
     * @param applicationContext Value for OrderApplicationContext
     */
    @JsonSetter("application_context")
    public void setApplicationContext(OrderApplicationContext applicationContext) {
        this.applicationContext = applicationContext;
    }

    /**
     * Converts this OrderRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "OrderRequest [" + "intent=" + intent + ", purchaseUnits=" + purchaseUnits
                + ", payer=" + payer + ", paymentSource=" + paymentSource + ", applicationContext="
                + applicationContext + "]";
    }

    /**
     * Builds a new {@link OrderRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link OrderRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(intent, purchaseUnits)
                .payer(getPayer())
                .paymentSource(getPaymentSource())
                .applicationContext(getApplicationContext());
        return builder;
    }

    /**
     * Class to build instances of {@link OrderRequest}.
     */
    public static class Builder {
        private CheckoutPaymentIntent intent;
        private List<PurchaseUnitRequest> purchaseUnits;
        private Payer payer;
        private PaymentSource paymentSource;
        private OrderApplicationContext applicationContext;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  intent  CheckoutPaymentIntent value for intent.
         * @param  purchaseUnits  List of PurchaseUnitRequest value for purchaseUnits.
         */
        public Builder(CheckoutPaymentIntent intent, List<PurchaseUnitRequest> purchaseUnits) {
            this.intent = intent;
            this.purchaseUnits = purchaseUnits;
        }

        /**
         * Setter for intent.
         * @param  intent  CheckoutPaymentIntent value for intent.
         * @return Builder
         */
        public Builder intent(CheckoutPaymentIntent intent) {
            this.intent = intent;
            return this;
        }

        /**
         * Setter for purchaseUnits.
         * @param  purchaseUnits  List of PurchaseUnitRequest value for purchaseUnits.
         * @return Builder
         */
        public Builder purchaseUnits(List<PurchaseUnitRequest> purchaseUnits) {
            this.purchaseUnits = purchaseUnits;
            return this;
        }

        /**
         * Setter for payer.
         * @param  payer  Payer value for payer.
         * @return Builder
         */
        public Builder payer(Payer payer) {
            this.payer = payer;
            return this;
        }

        /**
         * Setter for paymentSource.
         * @param  paymentSource  PaymentSource value for paymentSource.
         * @return Builder
         */
        public Builder paymentSource(PaymentSource paymentSource) {
            this.paymentSource = paymentSource;
            return this;
        }

        /**
         * Setter for applicationContext.
         * @param  applicationContext  OrderApplicationContext value for applicationContext.
         * @return Builder
         */
        public Builder applicationContext(OrderApplicationContext applicationContext) {
            this.applicationContext = applicationContext;
            return this;
        }

        /**
         * Builds a new {@link OrderRequest} object using the set fields.
         * @return {@link OrderRequest}
         */
        public OrderRequest build() {
            return new OrderRequest(intent, purchaseUnits, payer, paymentSource,
                    applicationContext);
        }
    }
}
