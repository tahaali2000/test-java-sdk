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
 * This is a model class for ErrorDetails type.
 */
public class ErrorDetails {
    private String field;
    private String value;
    private String location;
    private String issue;
    private List<LinkDescription> links;
    private String description;

    /**
     * Default constructor.
     */
    public ErrorDetails() {
        location = "body";
    }

    /**
     * Initialization constructor.
     * @param  issue  String value for issue.
     * @param  field  String value for field.
     * @param  value  String value for value.
     * @param  location  String value for location.
     * @param  links  List of LinkDescription value for links.
     * @param  description  String value for description.
     */
    public ErrorDetails(
            String issue,
            String field,
            String value,
            String location,
            List<LinkDescription> links,
            String description) {
        this.field = field;
        this.value = value;
        this.location = location;
        this.issue = issue;
        this.links = links;
        this.description = description;
    }

    /**
     * Getter for Field.
     * The field that caused the error. If this field is in the body, set this value to the field's
     * JSON pointer value. Required for client-side errors.
     * @return Returns the String
     */
    @JsonGetter("field")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getField() {
        return field;
    }

    /**
     * Setter for Field.
     * The field that caused the error. If this field is in the body, set this value to the field's
     * JSON pointer value. Required for client-side errors.
     * @param field Value for String
     */
    @JsonSetter("field")
    public void setField(String field) {
        this.field = field;
    }

    /**
     * Getter for Value.
     * The value of the field that caused the error.
     * @return Returns the String
     */
    @JsonGetter("value")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getValue() {
        return value;
    }

    /**
     * Setter for Value.
     * The value of the field that caused the error.
     * @param value Value for String
     */
    @JsonSetter("value")
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Getter for Location.
     * The location of the field that caused the error. Value is `body`, `path`, or `query`.
     * @return Returns the String
     */
    @JsonGetter("location")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getLocation() {
        return location;
    }

    /**
     * Setter for Location.
     * The location of the field that caused the error. Value is `body`, `path`, or `query`.
     * @param location Value for String
     */
    @JsonSetter("location")
    public void setLocation(String location) {
        this.location = location;
    }

    /**
     * Getter for Issue.
     * The unique, fine-grained application-level error code.
     * @return Returns the String
     */
    @JsonGetter("issue")
    public String getIssue() {
        return issue;
    }

    /**
     * Setter for Issue.
     * The unique, fine-grained application-level error code.
     * @param issue Value for String
     */
    @JsonSetter("issue")
    public void setIssue(String issue) {
        this.issue = issue;
    }

    /**
     * Getter for Links.
     * An array of request-related [HATEOAS links](/api/rest/responses/#hateoas-links) that are
     * either relevant to the issue by providing additional information or offering potential
     * resolutions.
     * @return Returns the List of LinkDescription
     */
    @JsonGetter("links")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<LinkDescription> getLinks() {
        return links;
    }

    /**
     * Setter for Links.
     * An array of request-related [HATEOAS links](/api/rest/responses/#hateoas-links) that are
     * either relevant to the issue by providing additional information or offering potential
     * resolutions.
     * @param links Value for List of LinkDescription
     */
    @JsonSetter("links")
    public void setLinks(List<LinkDescription> links) {
        this.links = links;
    }

    /**
     * Getter for Description.
     * The human-readable description for an issue. The description can change over the lifetime of
     * an API, so clients must not depend on this value.
     * @return Returns the String
     */
    @JsonGetter("description")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getDescription() {
        return description;
    }

    /**
     * Setter for Description.
     * The human-readable description for an issue. The description can change over the lifetime of
     * an API, so clients must not depend on this value.
     * @param description Value for String
     */
    @JsonSetter("description")
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Converts this ErrorDetails into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ErrorDetails [" + "issue=" + issue + ", field=" + field + ", value=" + value
                + ", location=" + location + ", links=" + links + ", description=" + description
                + "]";
    }

    /**
     * Builds a new {@link ErrorDetails.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ErrorDetails.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(issue)
                .field(getField())
                .value(getValue())
                .location(getLocation())
                .links(getLinks())
                .description(getDescription());
        return builder;
    }

    /**
     * Class to build instances of {@link ErrorDetails}.
     */
    public static class Builder {
        private String issue;
        private String field;
        private String value;
        private String location = "body";
        private List<LinkDescription> links;
        private String description;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  issue  String value for issue.
         */
        public Builder(String issue) {
            this.issue = issue;
        }

        /**
         * Setter for issue.
         * @param  issue  String value for issue.
         * @return Builder
         */
        public Builder issue(String issue) {
            this.issue = issue;
            return this;
        }

        /**
         * Setter for field.
         * @param  field  String value for field.
         * @return Builder
         */
        public Builder field(String field) {
            this.field = field;
            return this;
        }

        /**
         * Setter for value.
         * @param  value  String value for value.
         * @return Builder
         */
        public Builder value(String value) {
            this.value = value;
            return this;
        }

        /**
         * Setter for location.
         * @param  location  String value for location.
         * @return Builder
         */
        public Builder location(String location) {
            this.location = location;
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
         * Setter for description.
         * @param  description  String value for description.
         * @return Builder
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * Builds a new {@link ErrorDetails} object using the set fields.
         * @return {@link ErrorDetails}
         */
        public ErrorDetails build() {
            return new ErrorDetails(issue, field, value, location, links, description);
        }
    }
}
