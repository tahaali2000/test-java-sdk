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
 * This is a model class for AuthorizationStatusWithDetails type.
 */
public class AuthorizationStatusWithDetails {
    private AuthorizationStatus status;
    private AuthorizationStatusDetails statusDetails;

    /**
     * Default constructor.
     */
    public AuthorizationStatusWithDetails() {
    }

    /**
     * Initialization constructor.
     * @param  status  AuthorizationStatus value for status.
     * @param  statusDetails  AuthorizationStatusDetails value for statusDetails.
     */
    public AuthorizationStatusWithDetails(
            AuthorizationStatus status,
            AuthorizationStatusDetails statusDetails) {
        this.status = status;
        this.statusDetails = statusDetails;
    }

    /**
     * Getter for Status.
     * The status for the authorized payment.
     * @return Returns the AuthorizationStatus
     */
    @JsonGetter("status")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public AuthorizationStatus getStatus() {
        return status;
    }

    /**
     * Setter for Status.
     * The status for the authorized payment.
     * @param status Value for AuthorizationStatus
     */
    @JsonSetter("status")
    public void setStatus(AuthorizationStatus status) {
        this.status = status;
    }

    /**
     * Getter for StatusDetails.
     * The details of the authorized payment status.
     * @return Returns the AuthorizationStatusDetails
     */
    @JsonGetter("status_details")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public AuthorizationStatusDetails getStatusDetails() {
        return statusDetails;
    }

    /**
     * Setter for StatusDetails.
     * The details of the authorized payment status.
     * @param statusDetails Value for AuthorizationStatusDetails
     */
    @JsonSetter("status_details")
    public void setStatusDetails(AuthorizationStatusDetails statusDetails) {
        this.statusDetails = statusDetails;
    }

    /**
     * Converts this AuthorizationStatusWithDetails into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "AuthorizationStatusWithDetails [" + "status=" + status + ", statusDetails="
                + statusDetails + "]";
    }

    /**
     * Builds a new {@link AuthorizationStatusWithDetails.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link AuthorizationStatusWithDetails.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .status(getStatus())
                .statusDetails(getStatusDetails());
        return builder;
    }

    /**
     * Class to build instances of {@link AuthorizationStatusWithDetails}.
     */
    public static class Builder {
        private AuthorizationStatus status;
        private AuthorizationStatusDetails statusDetails;



        /**
         * Setter for status.
         * @param  status  AuthorizationStatus value for status.
         * @return Builder
         */
        public Builder status(AuthorizationStatus status) {
            this.status = status;
            return this;
        }

        /**
         * Setter for statusDetails.
         * @param  statusDetails  AuthorizationStatusDetails value for statusDetails.
         * @return Builder
         */
        public Builder statusDetails(AuthorizationStatusDetails statusDetails) {
            this.statusDetails = statusDetails;
            return this;
        }

        /**
         * Builds a new {@link AuthorizationStatusWithDetails} object using the set fields.
         * @return {@link AuthorizationStatusWithDetails}
         */
        public AuthorizationStatusWithDetails build() {
            return new AuthorizationStatusWithDetails(status, statusDetails);
        }
    }
}
