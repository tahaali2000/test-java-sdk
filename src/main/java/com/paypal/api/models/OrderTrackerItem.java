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
 * This is a model class for OrderTrackerItem type.
 */
public class OrderTrackerItem {
    private String name;
    private String quantity;
    private String sku;
    private String url;
    private String imageUrl;
    private UniversalProductCode upc;

    /**
     * Default constructor.
     */
    public OrderTrackerItem() {
    }

    /**
     * Initialization constructor.
     * @param  name  String value for name.
     * @param  quantity  String value for quantity.
     * @param  sku  String value for sku.
     * @param  url  String value for url.
     * @param  imageUrl  String value for imageUrl.
     * @param  upc  UniversalProductCode value for upc.
     */
    public OrderTrackerItem(
            String name,
            String quantity,
            String sku,
            String url,
            String imageUrl,
            UniversalProductCode upc) {
        this.name = name;
        this.quantity = quantity;
        this.sku = sku;
        this.url = url;
        this.imageUrl = imageUrl;
        this.upc = upc;
    }

    /**
     * Getter for Name.
     * The item name or title.
     * @return Returns the String
     */
    @JsonGetter("name")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getName() {
        return name;
    }

    /**
     * Setter for Name.
     * The item name or title.
     * @param name Value for String
     */
    @JsonSetter("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Getter for Quantity.
     * The item quantity. Must be a whole number.
     * @return Returns the String
     */
    @JsonGetter("quantity")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getQuantity() {
        return quantity;
    }

    /**
     * Setter for Quantity.
     * The item quantity. Must be a whole number.
     * @param quantity Value for String
     */
    @JsonSetter("quantity")
    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    /**
     * Getter for Sku.
     * The stock keeping unit (SKU) for the item. This can contain unicode characters.
     * @return Returns the String
     */
    @JsonGetter("sku")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getSku() {
        return sku;
    }

    /**
     * Setter for Sku.
     * The stock keeping unit (SKU) for the item. This can contain unicode characters.
     * @param sku Value for String
     */
    @JsonSetter("sku")
    public void setSku(String sku) {
        this.sku = sku;
    }

    /**
     * Getter for Url.
     * The URL to the item being purchased. Visible to buyer and used in buyer experiences.
     * @return Returns the String
     */
    @JsonGetter("url")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getUrl() {
        return url;
    }

    /**
     * Setter for Url.
     * The URL to the item being purchased. Visible to buyer and used in buyer experiences.
     * @param url Value for String
     */
    @JsonSetter("url")
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * Getter for ImageUrl.
     * The URL of the item's image. File type and size restrictions apply. An image that violates
     * these restrictions will not be honored.
     * @return Returns the String
     */
    @JsonGetter("image_url")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getImageUrl() {
        return imageUrl;
    }

    /**
     * Setter for ImageUrl.
     * The URL of the item's image. File type and size restrictions apply. An image that violates
     * these restrictions will not be honored.
     * @param imageUrl Value for String
     */
    @JsonSetter("image_url")
    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    /**
     * Getter for Upc.
     * The Universal Product Code of the item.
     * @return Returns the UniversalProductCode
     */
    @JsonGetter("upc")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public UniversalProductCode getUpc() {
        return upc;
    }

    /**
     * Setter for Upc.
     * The Universal Product Code of the item.
     * @param upc Value for UniversalProductCode
     */
    @JsonSetter("upc")
    public void setUpc(UniversalProductCode upc) {
        this.upc = upc;
    }

    /**
     * Converts this OrderTrackerItem into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "OrderTrackerItem [" + "name=" + name + ", quantity=" + quantity + ", sku=" + sku
                + ", url=" + url + ", imageUrl=" + imageUrl + ", upc=" + upc + "]";
    }

    /**
     * Builds a new {@link OrderTrackerItem.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link OrderTrackerItem.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .name(getName())
                .quantity(getQuantity())
                .sku(getSku())
                .url(getUrl())
                .imageUrl(getImageUrl())
                .upc(getUpc());
        return builder;
    }

    /**
     * Class to build instances of {@link OrderTrackerItem}.
     */
    public static class Builder {
        private String name;
        private String quantity;
        private String sku;
        private String url;
        private String imageUrl;
        private UniversalProductCode upc;



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
         * Setter for quantity.
         * @param  quantity  String value for quantity.
         * @return Builder
         */
        public Builder quantity(String quantity) {
            this.quantity = quantity;
            return this;
        }

        /**
         * Setter for sku.
         * @param  sku  String value for sku.
         * @return Builder
         */
        public Builder sku(String sku) {
            this.sku = sku;
            return this;
        }

        /**
         * Setter for url.
         * @param  url  String value for url.
         * @return Builder
         */
        public Builder url(String url) {
            this.url = url;
            return this;
        }

        /**
         * Setter for imageUrl.
         * @param  imageUrl  String value for imageUrl.
         * @return Builder
         */
        public Builder imageUrl(String imageUrl) {
            this.imageUrl = imageUrl;
            return this;
        }

        /**
         * Setter for upc.
         * @param  upc  UniversalProductCode value for upc.
         * @return Builder
         */
        public Builder upc(UniversalProductCode upc) {
            this.upc = upc;
            return this;
        }

        /**
         * Builds a new {@link OrderTrackerItem} object using the set fields.
         * @return {@link OrderTrackerItem}
         */
        public OrderTrackerItem build() {
            return new OrderTrackerItem(name, quantity, sku, url, imageUrl, upc);
        }
    }
}
