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
 * This is a model class for RelatedIdentifiers type.
 */
public class RelatedIdentifiers {
    private String orderId;
    private String authorizationId;
    private String captureId;

    /**
     * Default constructor.
     */
    public RelatedIdentifiers() {
    }

    /**
     * Initialization constructor.
     * @param  orderId  String value for orderId.
     * @param  authorizationId  String value for authorizationId.
     * @param  captureId  String value for captureId.
     */
    public RelatedIdentifiers(
            String orderId,
            String authorizationId,
            String captureId) {
        this.orderId = orderId;
        this.authorizationId = authorizationId;
        this.captureId = captureId;
    }

    /**
     * Getter for OrderId.
     * Order ID related to the resource.
     * @return Returns the String
     */
    @JsonGetter("order_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getOrderId() {
        return orderId;
    }

    /**
     * Setter for OrderId.
     * Order ID related to the resource.
     * @param orderId Value for String
     */
    @JsonSetter("order_id")
    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    /**
     * Getter for AuthorizationId.
     * Authorization ID related to the resource.
     * @return Returns the String
     */
    @JsonGetter("authorization_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getAuthorizationId() {
        return authorizationId;
    }

    /**
     * Setter for AuthorizationId.
     * Authorization ID related to the resource.
     * @param authorizationId Value for String
     */
    @JsonSetter("authorization_id")
    public void setAuthorizationId(String authorizationId) {
        this.authorizationId = authorizationId;
    }

    /**
     * Getter for CaptureId.
     * Capture ID related to the resource.
     * @return Returns the String
     */
    @JsonGetter("capture_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getCaptureId() {
        return captureId;
    }

    /**
     * Setter for CaptureId.
     * Capture ID related to the resource.
     * @param captureId Value for String
     */
    @JsonSetter("capture_id")
    public void setCaptureId(String captureId) {
        this.captureId = captureId;
    }

    /**
     * Converts this RelatedIdentifiers into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "RelatedIdentifiers [" + "orderId=" + orderId + ", authorizationId="
                + authorizationId + ", captureId=" + captureId + "]";
    }

    /**
     * Builds a new {@link RelatedIdentifiers.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link RelatedIdentifiers.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .orderId(getOrderId())
                .authorizationId(getAuthorizationId())
                .captureId(getCaptureId());
        return builder;
    }

    /**
     * Class to build instances of {@link RelatedIdentifiers}.
     */
    public static class Builder {
        private String orderId;
        private String authorizationId;
        private String captureId;



        /**
         * Setter for orderId.
         * @param  orderId  String value for orderId.
         * @return Builder
         */
        public Builder orderId(String orderId) {
            this.orderId = orderId;
            return this;
        }

        /**
         * Setter for authorizationId.
         * @param  authorizationId  String value for authorizationId.
         * @return Builder
         */
        public Builder authorizationId(String authorizationId) {
            this.authorizationId = authorizationId;
            return this;
        }

        /**
         * Setter for captureId.
         * @param  captureId  String value for captureId.
         * @return Builder
         */
        public Builder captureId(String captureId) {
            this.captureId = captureId;
            return this;
        }

        /**
         * Builds a new {@link RelatedIdentifiers} object using the set fields.
         * @return {@link RelatedIdentifiers}
         */
        public RelatedIdentifiers build() {
            return new RelatedIdentifiers(orderId, authorizationId, captureId);
        }
    }
}
