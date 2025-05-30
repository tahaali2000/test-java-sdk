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
 * This is a model class for OrderTrackerResponse type.
 */
public class OrderTrackerResponse {
    private String id;
    private OrderTrackerStatus status;
    private List<OrderTrackerItem> items;
    private List<LinkDescription> links;
    private String createTime;
    private String updateTime;

    /**
     * Default constructor.
     */
    public OrderTrackerResponse() {
    }

    /**
     * Initialization constructor.
     * @param  id  String value for id.
     * @param  status  OrderTrackerStatus value for status.
     * @param  items  List of OrderTrackerItem value for items.
     * @param  links  List of LinkDescription value for links.
     * @param  createTime  String value for createTime.
     * @param  updateTime  String value for updateTime.
     */
    public OrderTrackerResponse(
            String id,
            OrderTrackerStatus status,
            List<OrderTrackerItem> items,
            List<LinkDescription> links,
            String createTime,
            String updateTime) {
        this.id = id;
        this.status = status;
        this.items = items;
        this.links = links;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    /**
     * Getter for Id.
     * The tracker id.
     * @return Returns the String
     */
    @JsonGetter("id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getId() {
        return id;
    }

    /**
     * Setter for Id.
     * The tracker id.
     * @param id Value for String
     */
    @JsonSetter("id")
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Getter for Status.
     * The status of the item shipment.
     * @return Returns the OrderTrackerStatus
     */
    @JsonGetter("status")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public OrderTrackerStatus getStatus() {
        return status;
    }

    /**
     * Setter for Status.
     * The status of the item shipment.
     * @param status Value for OrderTrackerStatus
     */
    @JsonSetter("status")
    public void setStatus(OrderTrackerStatus status) {
        this.status = status;
    }

    /**
     * Getter for Items.
     * An array of details of items in the shipment.
     * @return Returns the List of OrderTrackerItem
     */
    @JsonGetter("items")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<OrderTrackerItem> getItems() {
        return items;
    }

    /**
     * Setter for Items.
     * An array of details of items in the shipment.
     * @param items Value for List of OrderTrackerItem
     */
    @JsonSetter("items")
    public void setItems(List<OrderTrackerItem> items) {
        this.items = items;
    }

    /**
     * Getter for Links.
     * An array of request-related HATEOAS links.
     * @return Returns the List of LinkDescription
     */
    @JsonGetter("links")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<LinkDescription> getLinks() {
        return links;
    }

    /**
     * Setter for Links.
     * An array of request-related HATEOAS links.
     * @param links Value for List of LinkDescription
     */
    @JsonSetter("links")
    public void setLinks(List<LinkDescription> links) {
        this.links = links;
    }

    /**
     * Getter for CreateTime.
     * The date and time, in [Internet date and time
     * format](https://tools.ietf.org/html/rfc3339#section-5.6). Seconds are required while
     * fractional seconds are optional.&lt;blockquote&gt;&lt;strong&gt;Note:&lt;/strong&gt; The regular expression
     * provides guidance but does not reject all invalid dates.&lt;/blockquote&gt;
     * @return Returns the String
     */
    @JsonGetter("create_time")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getCreateTime() {
        return createTime;
    }

    /**
     * Setter for CreateTime.
     * The date and time, in [Internet date and time
     * format](https://tools.ietf.org/html/rfc3339#section-5.6). Seconds are required while
     * fractional seconds are optional.&lt;blockquote&gt;&lt;strong&gt;Note:&lt;/strong&gt; The regular expression
     * provides guidance but does not reject all invalid dates.&lt;/blockquote&gt;
     * @param createTime Value for String
     */
    @JsonSetter("create_time")
    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    /**
     * Getter for UpdateTime.
     * The date and time, in [Internet date and time
     * format](https://tools.ietf.org/html/rfc3339#section-5.6). Seconds are required while
     * fractional seconds are optional.&lt;blockquote&gt;&lt;strong&gt;Note:&lt;/strong&gt; The regular expression
     * provides guidance but does not reject all invalid dates.&lt;/blockquote&gt;
     * @return Returns the String
     */
    @JsonGetter("update_time")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getUpdateTime() {
        return updateTime;
    }

    /**
     * Setter for UpdateTime.
     * The date and time, in [Internet date and time
     * format](https://tools.ietf.org/html/rfc3339#section-5.6). Seconds are required while
     * fractional seconds are optional.&lt;blockquote&gt;&lt;strong&gt;Note:&lt;/strong&gt; The regular expression
     * provides guidance but does not reject all invalid dates.&lt;/blockquote&gt;
     * @param updateTime Value for String
     */
    @JsonSetter("update_time")
    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * Converts this OrderTrackerResponse into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "OrderTrackerResponse [" + "id=" + id + ", status=" + status + ", items=" + items
                + ", links=" + links + ", createTime=" + createTime + ", updateTime=" + updateTime
                + "]";
    }

    /**
     * Builds a new {@link OrderTrackerResponse.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link OrderTrackerResponse.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .id(getId())
                .status(getStatus())
                .items(getItems())
                .links(getLinks())
                .createTime(getCreateTime())
                .updateTime(getUpdateTime());
        return builder;
    }

    /**
     * Class to build instances of {@link OrderTrackerResponse}.
     */
    public static class Builder {
        private String id;
        private OrderTrackerStatus status;
        private List<OrderTrackerItem> items;
        private List<LinkDescription> links;
        private String createTime;
        private String updateTime;



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
         * Setter for status.
         * @param  status  OrderTrackerStatus value for status.
         * @return Builder
         */
        public Builder status(OrderTrackerStatus status) {
            this.status = status;
            return this;
        }

        /**
         * Setter for items.
         * @param  items  List of OrderTrackerItem value for items.
         * @return Builder
         */
        public Builder items(List<OrderTrackerItem> items) {
            this.items = items;
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
         * Setter for createTime.
         * @param  createTime  String value for createTime.
         * @return Builder
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * Setter for updateTime.
         * @param  updateTime  String value for updateTime.
         * @return Builder
         */
        public Builder updateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }

        /**
         * Builds a new {@link OrderTrackerResponse} object using the set fields.
         * @return {@link OrderTrackerResponse}
         */
        public OrderTrackerResponse build() {
            return new OrderTrackerResponse(id, status, items, links, createTime, updateTime);
        }
    }
}
