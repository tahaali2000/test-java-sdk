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
 * This is a model class for CustomerPaymentTokensGetInput type.
 */
public class CustomerPaymentTokensGetInput {
    private String customerId;
    private Integer pageSize;
    private Integer page;
    private Boolean totalRequired;

    /**
     * Default constructor.
     */
    public CustomerPaymentTokensGetInput() {
        pageSize = 5;
        page = 1;
        totalRequired = false;
    }

    /**
     * Initialization constructor.
     * @param  customerId  String value for customerId.
     * @param  pageSize  Integer value for pageSize.
     * @param  page  Integer value for page.
     * @param  totalRequired  Boolean value for totalRequired.
     */
    public CustomerPaymentTokensGetInput(
            String customerId,
            Integer pageSize,
            Integer page,
            Boolean totalRequired) {
        this.customerId = customerId;
        this.pageSize = pageSize;
        this.page = page;
        this.totalRequired = totalRequired;
    }

    /**
     * Getter for CustomerId.
     * A unique identifier representing a specific customer in merchant's/partner's system or
     * records.
     * @return Returns the String
     */
    @JsonGetter("customer_id")
    public String getCustomerId() {
        return customerId;
    }

    /**
     * Setter for CustomerId.
     * A unique identifier representing a specific customer in merchant's/partner's system or
     * records.
     * @param customerId Value for String
     */
    @JsonSetter("customer_id")
    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    /**
     * Getter for PageSize.
     * A non-negative, non-zero integer indicating the maximum number of results to return at one
     * time.
     * @return Returns the Integer
     */
    @JsonGetter("page_size")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getPageSize() {
        return pageSize;
    }

    /**
     * Setter for PageSize.
     * A non-negative, non-zero integer indicating the maximum number of results to return at one
     * time.
     * @param pageSize Value for Integer
     */
    @JsonSetter("page_size")
    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    /**
     * Getter for Page.
     * A non-negative, non-zero integer representing the page of the results.
     * @return Returns the Integer
     */
    @JsonGetter("page")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getPage() {
        return page;
    }

    /**
     * Setter for Page.
     * A non-negative, non-zero integer representing the page of the results.
     * @param page Value for Integer
     */
    @JsonSetter("page")
    public void setPage(Integer page) {
        this.page = page;
    }

    /**
     * Getter for TotalRequired.
     * A boolean indicating total number of items (total_items) and pages (total_pages) are expected
     * to be returned in the response.
     * @return Returns the Boolean
     */
    @JsonGetter("total_required")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getTotalRequired() {
        return totalRequired;
    }

    /**
     * Setter for TotalRequired.
     * A boolean indicating total number of items (total_items) and pages (total_pages) are expected
     * to be returned in the response.
     * @param totalRequired Value for Boolean
     */
    @JsonSetter("total_required")
    public void setTotalRequired(Boolean totalRequired) {
        this.totalRequired = totalRequired;
    }

    /**
     * Converts this CustomerPaymentTokensGetInput into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "CustomerPaymentTokensGetInput [" + "customerId=" + customerId + ", pageSize="
                + pageSize + ", page=" + page + ", totalRequired=" + totalRequired + "]";
    }

    /**
     * Builds a new {@link CustomerPaymentTokensGetInput.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link CustomerPaymentTokensGetInput.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(customerId)
                .pageSize(getPageSize())
                .page(getPage())
                .totalRequired(getTotalRequired());
        return builder;
    }

    /**
     * Class to build instances of {@link CustomerPaymentTokensGetInput}.
     */
    public static class Builder {
        private String customerId;
        private Integer pageSize = 5;
        private Integer page = 1;
        private Boolean totalRequired = false;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  customerId  String value for customerId.
         */
        public Builder(String customerId) {
            this.customerId = customerId;
        }

        /**
         * Setter for customerId.
         * @param  customerId  String value for customerId.
         * @return Builder
         */
        public Builder customerId(String customerId) {
            this.customerId = customerId;
            return this;
        }

        /**
         * Setter for pageSize.
         * @param  pageSize  Integer value for pageSize.
         * @return Builder
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * Setter for page.
         * @param  page  Integer value for page.
         * @return Builder
         */
        public Builder page(Integer page) {
            this.page = page;
            return this;
        }

        /**
         * Setter for totalRequired.
         * @param  totalRequired  Boolean value for totalRequired.
         * @return Builder
         */
        public Builder totalRequired(Boolean totalRequired) {
            this.totalRequired = totalRequired;
            return this;
        }

        /**
         * Builds a new {@link CustomerPaymentTokensGetInput} object using the set fields.
         * @return {@link CustomerPaymentTokensGetInput}
         */
        public CustomerPaymentTokensGetInput build() {
            return new CustomerPaymentTokensGetInput(customerId, pageSize, page, totalRequired);
        }
    }
}
