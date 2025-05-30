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
 * This is a model class for ActivityTimestamps type.
 */
public class ActivityTimestamps {
    private String createTime;
    private String updateTime;

    /**
     * Default constructor.
     */
    public ActivityTimestamps() {
    }

    /**
     * Initialization constructor.
     * @param  createTime  String value for createTime.
     * @param  updateTime  String value for updateTime.
     */
    public ActivityTimestamps(
            String createTime,
            String updateTime) {
        this.createTime = createTime;
        this.updateTime = updateTime;
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
     * Converts this ActivityTimestamps into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ActivityTimestamps [" + "createTime=" + createTime + ", updateTime=" + updateTime
                + "]";
    }

    /**
     * Builds a new {@link ActivityTimestamps.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ActivityTimestamps.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .createTime(getCreateTime())
                .updateTime(getUpdateTime());
        return builder;
    }

    /**
     * Class to build instances of {@link ActivityTimestamps}.
     */
    public static class Builder {
        private String createTime;
        private String updateTime;



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
         * Builds a new {@link ActivityTimestamps} object using the set fields.
         * @return {@link ActivityTimestamps}
         */
        public ActivityTimestamps build() {
            return new ActivityTimestamps(createTime, updateTime);
        }
    }
}
