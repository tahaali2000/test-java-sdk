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
 * This is a model class for SellerProtection type.
 */
public class SellerProtection {
    private SellerProtectionStatus status;
    private List<DisputeCategory> disputeCategories;

    /**
     * Default constructor.
     */
    public SellerProtection() {
    }

    /**
     * Initialization constructor.
     * @param  status  SellerProtectionStatus value for status.
     * @param  disputeCategories  List of DisputeCategory value for disputeCategories.
     */
    public SellerProtection(
            SellerProtectionStatus status,
            List<DisputeCategory> disputeCategories) {
        this.status = status;
        this.disputeCategories = disputeCategories;
    }

    /**
     * Getter for Status.
     * Indicates whether the transaction is eligible for seller protection. For information, see
     * [PayPal Seller Protection for
     * Merchants](https://www.paypal.com/us/webapps/mpp/security/seller-protection).
     * @return Returns the SellerProtectionStatus
     */
    @JsonGetter("status")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public SellerProtectionStatus getStatus() {
        return status;
    }

    /**
     * Setter for Status.
     * Indicates whether the transaction is eligible for seller protection. For information, see
     * [PayPal Seller Protection for
     * Merchants](https://www.paypal.com/us/webapps/mpp/security/seller-protection).
     * @param status Value for SellerProtectionStatus
     */
    @JsonSetter("status")
    public void setStatus(SellerProtectionStatus status) {
        this.status = status;
    }

    /**
     * Getter for DisputeCategories.
     * An array of conditions that are covered for the transaction.
     * @return Returns the List of DisputeCategory
     */
    @JsonGetter("dispute_categories")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<DisputeCategory> getDisputeCategories() {
        return disputeCategories;
    }

    /**
     * Setter for DisputeCategories.
     * An array of conditions that are covered for the transaction.
     * @param disputeCategories Value for List of DisputeCategory
     */
    @JsonSetter("dispute_categories")
    public void setDisputeCategories(List<DisputeCategory> disputeCategories) {
        this.disputeCategories = disputeCategories;
    }

    /**
     * Converts this SellerProtection into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "SellerProtection [" + "status=" + status + ", disputeCategories="
                + disputeCategories + "]";
    }

    /**
     * Builds a new {@link SellerProtection.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link SellerProtection.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .status(getStatus())
                .disputeCategories(getDisputeCategories());
        return builder;
    }

    /**
     * Class to build instances of {@link SellerProtection}.
     */
    public static class Builder {
        private SellerProtectionStatus status;
        private List<DisputeCategory> disputeCategories;



        /**
         * Setter for status.
         * @param  status  SellerProtectionStatus value for status.
         * @return Builder
         */
        public Builder status(SellerProtectionStatus status) {
            this.status = status;
            return this;
        }

        /**
         * Setter for disputeCategories.
         * @param  disputeCategories  List of DisputeCategory value for disputeCategories.
         * @return Builder
         */
        public Builder disputeCategories(List<DisputeCategory> disputeCategories) {
            this.disputeCategories = disputeCategories;
            return this;
        }

        /**
         * Builds a new {@link SellerProtection} object using the set fields.
         * @return {@link SellerProtection}
         */
        public SellerProtection build() {
            return new SellerProtection(status, disputeCategories);
        }
    }
}
