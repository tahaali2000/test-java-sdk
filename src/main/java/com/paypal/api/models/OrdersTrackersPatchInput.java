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
 * This is a model class for OrdersTrackersPatchInput type.
 */
public class OrdersTrackersPatchInput {
    private String id;
    private String trackerId;
    private String contentType;
    private List<Patch> body;

    /**
     * Default constructor.
     */
    public OrdersTrackersPatchInput() {
        contentType = "application/json";
    }

    /**
     * Initialization constructor.
     * @param  id  String value for id.
     * @param  trackerId  String value for trackerId.
     * @param  contentType  String value for contentType.
     * @param  body  List of Patch value for body.
     */
    public OrdersTrackersPatchInput(
            String id,
            String trackerId,
            String contentType,
            List<Patch> body) {
        this.id = id;
        this.trackerId = trackerId;
        this.contentType = contentType;
        this.body = body;
    }

    /**
     * Getter for Id.
     * The ID of the order that the tracking information is associated with.
     * @return Returns the String
     */
    @JsonGetter("id")
    public String getId() {
        return id;
    }

    /**
     * Setter for Id.
     * The ID of the order that the tracking information is associated with.
     * @param id Value for String
     */
    @JsonSetter("id")
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Getter for TrackerId.
     * The order tracking ID.
     * @return Returns the String
     */
    @JsonGetter("tracker_id")
    public String getTrackerId() {
        return trackerId;
    }

    /**
     * Setter for TrackerId.
     * The order tracking ID.
     * @param trackerId Value for String
     */
    @JsonSetter("tracker_id")
    public void setTrackerId(String trackerId) {
        this.trackerId = trackerId;
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
     * Getter for Body.
     * @return Returns the List of Patch
     */
    @JsonGetter("body")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<Patch> getBody() {
        return body;
    }

    /**
     * Setter for Body.
     * @param body Value for List of Patch
     */
    @JsonSetter("body")
    public void setBody(List<Patch> body) {
        this.body = body;
    }

    /**
     * Converts this OrdersTrackersPatchInput into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "OrdersTrackersPatchInput [" + "id=" + id + ", trackerId=" + trackerId
                + ", contentType=" + contentType + ", body=" + body + "]";
    }

    /**
     * Builds a new {@link OrdersTrackersPatchInput.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link OrdersTrackersPatchInput.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(id, trackerId, contentType)
                .body(getBody());
        return builder;
    }

    /**
     * Class to build instances of {@link OrdersTrackersPatchInput}.
     */
    public static class Builder {
        private String id;
        private String trackerId;
        private String contentType = "application/json";
        private List<Patch> body;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  id  String value for id.
         * @param  trackerId  String value for trackerId.
         * @param  contentType  String value for contentType.
         */
        public Builder(String id, String trackerId, String contentType) {
            this.id = id;
            this.trackerId = trackerId;
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
         * Setter for trackerId.
         * @param  trackerId  String value for trackerId.
         * @return Builder
         */
        public Builder trackerId(String trackerId) {
            this.trackerId = trackerId;
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
         * Setter for body.
         * @param  body  List of Patch value for body.
         * @return Builder
         */
        public Builder body(List<Patch> body) {
            this.body = body;
            return this;
        }

        /**
         * Builds a new {@link OrdersTrackersPatchInput} object using the set fields.
         * @return {@link OrdersTrackersPatchInput}
         */
        public OrdersTrackersPatchInput build() {
            return new OrdersTrackersPatchInput(id, trackerId, contentType, body);
        }
    }
}
