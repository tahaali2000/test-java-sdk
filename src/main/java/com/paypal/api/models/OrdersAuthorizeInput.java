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
 * This is a model class for OrdersAuthorizeInput type.
 */
public class OrdersAuthorizeInput {
    private String id;
    private String contentType;
    private String payPalRequestId;
    private String prefer;
    private String payPalClientMetadataId;
    private String payPalAuthAssertion;
    private OrderAuthorizeRequest body;

    /**
     * Default constructor.
     */
    public OrdersAuthorizeInput() {
        contentType = "application/json";
        prefer = "return=minimal";
    }

    /**
     * Initialization constructor.
     * @param  id  String value for id.
     * @param  contentType  String value for contentType.
     * @param  payPalRequestId  String value for payPalRequestId.
     * @param  prefer  String value for prefer.
     * @param  payPalClientMetadataId  String value for payPalClientMetadataId.
     * @param  payPalAuthAssertion  String value for payPalAuthAssertion.
     * @param  body  OrderAuthorizeRequest value for body.
     */
    public OrdersAuthorizeInput(
            String id,
            String contentType,
            String payPalRequestId,
            String prefer,
            String payPalClientMetadataId,
            String payPalAuthAssertion,
            OrderAuthorizeRequest body) {
        this.id = id;
        this.contentType = contentType;
        this.payPalRequestId = payPalRequestId;
        this.prefer = prefer;
        this.payPalClientMetadataId = payPalClientMetadataId;
        this.payPalAuthAssertion = payPalAuthAssertion;
        this.body = body;
    }

    /**
     * Getter for Id.
     * The ID of the order for which to authorize.
     * @return Returns the String
     */
    @JsonGetter("id")
    public String getId() {
        return id;
    }

    /**
     * Setter for Id.
     * The ID of the order for which to authorize.
     * @param id Value for String
     */
    @JsonSetter("id")
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Getter for ContentType.
     * @return Returns the String
     */
    @JsonGetter("Content-Type")
    public String getContentType() {
        return contentType;
    }

    /**
     * Setter for ContentType.
     * @param contentType Value for String
     */
    @JsonSetter("Content-Type")
    private void setContentType(String contentType) {
        this.contentType = contentType;
    }

    /**
     * Getter for PayPalRequestId.
     * The server stores keys for 6 hours. The API callers can request the times to up to 72 hours
     * by speaking to their Account Manager.
     * @return Returns the String
     */
    @JsonGetter("PayPal-Request-Id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getPayPalRequestId() {
        return payPalRequestId;
    }

    /**
     * Setter for PayPalRequestId.
     * The server stores keys for 6 hours. The API callers can request the times to up to 72 hours
     * by speaking to their Account Manager.
     * @param payPalRequestId Value for String
     */
    @JsonSetter("PayPal-Request-Id")
    public void setPayPalRequestId(String payPalRequestId) {
        this.payPalRequestId = payPalRequestId;
    }

    /**
     * Getter for Prefer.
     * The preferred server response upon successful completion of the request. Value
     * is:&lt;ul&gt;&lt;li&gt;&lt;code&gt;return=minimal&lt;/code&gt;. The server returns a minimal response to optimize
     * communication between the API caller and the server. A minimal response includes the
     * &lt;code&gt;id&lt;/code&gt;, &lt;code&gt;status&lt;/code&gt; and HATEOAS
     * links.&lt;/li&gt;&lt;li&gt;&lt;code&gt;return=representation&lt;/code&gt;. The server returns a complete resource
     * representation, including the current state of the resource.&lt;/li&gt;&lt;/ul&gt;
     * @return Returns the String
     */
    @JsonGetter("Prefer")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getPrefer() {
        return prefer;
    }

    /**
     * Setter for Prefer.
     * The preferred server response upon successful completion of the request. Value
     * is:&lt;ul&gt;&lt;li&gt;&lt;code&gt;return=minimal&lt;/code&gt;. The server returns a minimal response to optimize
     * communication between the API caller and the server. A minimal response includes the
     * &lt;code&gt;id&lt;/code&gt;, &lt;code&gt;status&lt;/code&gt; and HATEOAS
     * links.&lt;/li&gt;&lt;li&gt;&lt;code&gt;return=representation&lt;/code&gt;. The server returns a complete resource
     * representation, including the current state of the resource.&lt;/li&gt;&lt;/ul&gt;
     * @param prefer Value for String
     */
    @JsonSetter("Prefer")
    public void setPrefer(String prefer) {
        this.prefer = prefer;
    }

    /**
     * Getter for PayPalClientMetadataId.
     * @return Returns the String
     */
    @JsonGetter("PayPal-Client-Metadata-Id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getPayPalClientMetadataId() {
        return payPalClientMetadataId;
    }

    /**
     * Setter for PayPalClientMetadataId.
     * @param payPalClientMetadataId Value for String
     */
    @JsonSetter("PayPal-Client-Metadata-Id")
    public void setPayPalClientMetadataId(String payPalClientMetadataId) {
        this.payPalClientMetadataId = payPalClientMetadataId;
    }

    /**
     * Getter for PayPalAuthAssertion.
     * An API-caller-provided JSON Web Token (JWT) assertion that identifies the merchant. For
     * details, see &lt;a href="/api/rest/requests/#paypal-auth-assertion"&gt;PayPal-Auth-Assertion&lt;/a&gt;.
     * @return Returns the String
     */
    @JsonGetter("PayPal-Auth-Assertion")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getPayPalAuthAssertion() {
        return payPalAuthAssertion;
    }

    /**
     * Setter for PayPalAuthAssertion.
     * An API-caller-provided JSON Web Token (JWT) assertion that identifies the merchant. For
     * details, see &lt;a href="/api/rest/requests/#paypal-auth-assertion"&gt;PayPal-Auth-Assertion&lt;/a&gt;.
     * @param payPalAuthAssertion Value for String
     */
    @JsonSetter("PayPal-Auth-Assertion")
    public void setPayPalAuthAssertion(String payPalAuthAssertion) {
        this.payPalAuthAssertion = payPalAuthAssertion;
    }

    /**
     * Getter for Body.
     * @return Returns the OrderAuthorizeRequest
     */
    @JsonGetter("body")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public OrderAuthorizeRequest getBody() {
        return body;
    }

    /**
     * Setter for Body.
     * @param body Value for OrderAuthorizeRequest
     */
    @JsonSetter("body")
    public void setBody(OrderAuthorizeRequest body) {
        this.body = body;
    }

    /**
     * Converts this OrdersAuthorizeInput into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "OrdersAuthorizeInput [" + "id=" + id + ", contentType=" + contentType
                + ", payPalRequestId=" + payPalRequestId + ", prefer=" + prefer
                + ", payPalClientMetadataId=" + payPalClientMetadataId + ", payPalAuthAssertion="
                + payPalAuthAssertion + ", body=" + body + "]";
    }

    /**
     * Builds a new {@link OrdersAuthorizeInput.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link OrdersAuthorizeInput.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(id, contentType)
                .payPalRequestId(getPayPalRequestId())
                .prefer(getPrefer())
                .payPalClientMetadataId(getPayPalClientMetadataId())
                .payPalAuthAssertion(getPayPalAuthAssertion())
                .body(getBody());
        return builder;
    }

    /**
     * Class to build instances of {@link OrdersAuthorizeInput}.
     */
    public static class Builder {
        private String id;
        private String contentType = "application/json";
        private String payPalRequestId;
        private String prefer = "return=minimal";
        private String payPalClientMetadataId;
        private String payPalAuthAssertion;
        private OrderAuthorizeRequest body;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  id  String value for id.
         * @param  contentType  String value for contentType.
         */
        public Builder(String id, String contentType) {
            this.id = id;
            this.contentType = contentType;
        }

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
         * Setter for contentType.
         * @param  contentType  String value for contentType.
         * @return Builder
         */
        public Builder contentType(String contentType) {
            this.contentType = contentType;
            return this;
        }

        /**
         * Setter for payPalRequestId.
         * @param  payPalRequestId  String value for payPalRequestId.
         * @return Builder
         */
        public Builder payPalRequestId(String payPalRequestId) {
            this.payPalRequestId = payPalRequestId;
            return this;
        }

        /**
         * Setter for prefer.
         * @param  prefer  String value for prefer.
         * @return Builder
         */
        public Builder prefer(String prefer) {
            this.prefer = prefer;
            return this;
        }

        /**
         * Setter for payPalClientMetadataId.
         * @param  payPalClientMetadataId  String value for payPalClientMetadataId.
         * @return Builder
         */
        public Builder payPalClientMetadataId(String payPalClientMetadataId) {
            this.payPalClientMetadataId = payPalClientMetadataId;
            return this;
        }

        /**
         * Setter for payPalAuthAssertion.
         * @param  payPalAuthAssertion  String value for payPalAuthAssertion.
         * @return Builder
         */
        public Builder payPalAuthAssertion(String payPalAuthAssertion) {
            this.payPalAuthAssertion = payPalAuthAssertion;
            return this;
        }

        /**
         * Setter for body.
         * @param  body  OrderAuthorizeRequest value for body.
         * @return Builder
         */
        public Builder body(OrderAuthorizeRequest body) {
            this.body = body;
            return this;
        }

        /**
         * Builds a new {@link OrdersAuthorizeInput} object using the set fields.
         * @return {@link OrdersAuthorizeInput}
         */
        public OrdersAuthorizeInput build() {
            return new OrdersAuthorizeInput(id, contentType, payPalRequestId, prefer,
                    payPalClientMetadataId, payPalAuthAssertion, body);
        }
    }
}
