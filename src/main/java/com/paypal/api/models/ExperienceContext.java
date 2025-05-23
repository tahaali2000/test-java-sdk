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
 * This is a model class for ExperienceContext type.
 */
public class ExperienceContext {
    private String brandName;
    private String locale;
    private ShippingPreference shippingPreference;
    private String returnUrl;
    private String cancelUrl;

    /**
     * Default constructor.
     */
    public ExperienceContext() {
        shippingPreference = ShippingPreference.GET_FROM_FILE;
    }

    /**
     * Initialization constructor.
     * @param  brandName  String value for brandName.
     * @param  locale  String value for locale.
     * @param  shippingPreference  ShippingPreference value for shippingPreference.
     * @param  returnUrl  String value for returnUrl.
     * @param  cancelUrl  String value for cancelUrl.
     */
    public ExperienceContext(
            String brandName,
            String locale,
            ShippingPreference shippingPreference,
            String returnUrl,
            String cancelUrl) {
        this.brandName = brandName;
        this.locale = locale;
        this.shippingPreference = shippingPreference;
        this.returnUrl = returnUrl;
        this.cancelUrl = cancelUrl;
    }

    /**
     * Getter for BrandName.
     * The label that overrides the business name in the PayPal account on the PayPal site. The
     * pattern is defined by an external party and supports Unicode.
     * @return Returns the String
     */
    @JsonGetter("brand_name")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getBrandName() {
        return brandName;
    }

    /**
     * Setter for BrandName.
     * The label that overrides the business name in the PayPal account on the PayPal site. The
     * pattern is defined by an external party and supports Unicode.
     * @param brandName Value for String
     */
    @JsonSetter("brand_name")
    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    /**
     * Getter for Locale.
     * The [language tag](https://tools.ietf.org/html/bcp47#section-2) for the language in which to
     * localize the error-related strings, such as messages, issues, and suggested actions. The tag
     * is made up of the [ISO 639-2 language
     * code](https://www.loc.gov/standards/iso639-2/php/code_list.php), the optional [ISO-15924
     * script tag](https://www.unicode.org/iso15924/codelists.html), and the [ISO-3166 alpha-2
     * country code](/api/rest/reference/country-codes/) or [M49 region
     * code](https://unstats.un.org/unsd/methodology/m49/).
     * @return Returns the String
     */
    @JsonGetter("locale")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getLocale() {
        return locale;
    }

    /**
     * Setter for Locale.
     * The [language tag](https://tools.ietf.org/html/bcp47#section-2) for the language in which to
     * localize the error-related strings, such as messages, issues, and suggested actions. The tag
     * is made up of the [ISO 639-2 language
     * code](https://www.loc.gov/standards/iso639-2/php/code_list.php), the optional [ISO-15924
     * script tag](https://www.unicode.org/iso15924/codelists.html), and the [ISO-3166 alpha-2
     * country code](/api/rest/reference/country-codes/) or [M49 region
     * code](https://unstats.un.org/unsd/methodology/m49/).
     * @param locale Value for String
     */
    @JsonSetter("locale")
    public void setLocale(String locale) {
        this.locale = locale;
    }

    /**
     * Getter for ShippingPreference.
     * The location from which the shipping address is derived.
     * @return Returns the ShippingPreference
     */
    @JsonGetter("shipping_preference")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public ShippingPreference getShippingPreference() {
        return shippingPreference;
    }

    /**
     * Setter for ShippingPreference.
     * The location from which the shipping address is derived.
     * @param shippingPreference Value for ShippingPreference
     */
    @JsonSetter("shipping_preference")
    public void setShippingPreference(ShippingPreference shippingPreference) {
        this.shippingPreference = shippingPreference;
    }

    /**
     * Getter for ReturnUrl.
     * Describes the URL.
     * @return Returns the String
     */
    @JsonGetter("return_url")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getReturnUrl() {
        return returnUrl;
    }

    /**
     * Setter for ReturnUrl.
     * Describes the URL.
     * @param returnUrl Value for String
     */
    @JsonSetter("return_url")
    public void setReturnUrl(String returnUrl) {
        this.returnUrl = returnUrl;
    }

    /**
     * Getter for CancelUrl.
     * Describes the URL.
     * @return Returns the String
     */
    @JsonGetter("cancel_url")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getCancelUrl() {
        return cancelUrl;
    }

    /**
     * Setter for CancelUrl.
     * Describes the URL.
     * @param cancelUrl Value for String
     */
    @JsonSetter("cancel_url")
    public void setCancelUrl(String cancelUrl) {
        this.cancelUrl = cancelUrl;
    }

    /**
     * Converts this ExperienceContext into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ExperienceContext [" + "brandName=" + brandName + ", locale=" + locale
                + ", shippingPreference=" + shippingPreference + ", returnUrl=" + returnUrl
                + ", cancelUrl=" + cancelUrl + "]";
    }

    /**
     * Builds a new {@link ExperienceContext.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ExperienceContext.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .brandName(getBrandName())
                .locale(getLocale())
                .shippingPreference(getShippingPreference())
                .returnUrl(getReturnUrl())
                .cancelUrl(getCancelUrl());
        return builder;
    }

    /**
     * Class to build instances of {@link ExperienceContext}.
     */
    public static class Builder {
        private String brandName;
        private String locale;
        private ShippingPreference shippingPreference = ShippingPreference.GET_FROM_FILE;
        private String returnUrl;
        private String cancelUrl;



        /**
         * Setter for brandName.
         * @param  brandName  String value for brandName.
         * @return Builder
         */
        public Builder brandName(String brandName) {
            this.brandName = brandName;
            return this;
        }

        /**
         * Setter for locale.
         * @param  locale  String value for locale.
         * @return Builder
         */
        public Builder locale(String locale) {
            this.locale = locale;
            return this;
        }

        /**
         * Setter for shippingPreference.
         * @param  shippingPreference  ShippingPreference value for shippingPreference.
         * @return Builder
         */
        public Builder shippingPreference(ShippingPreference shippingPreference) {
            this.shippingPreference = shippingPreference;
            return this;
        }

        /**
         * Setter for returnUrl.
         * @param  returnUrl  String value for returnUrl.
         * @return Builder
         */
        public Builder returnUrl(String returnUrl) {
            this.returnUrl = returnUrl;
            return this;
        }

        /**
         * Setter for cancelUrl.
         * @param  cancelUrl  String value for cancelUrl.
         * @return Builder
         */
        public Builder cancelUrl(String cancelUrl) {
            this.cancelUrl = cancelUrl;
            return this;
        }

        /**
         * Builds a new {@link ExperienceContext} object using the set fields.
         * @return {@link ExperienceContext}
         */
        public ExperienceContext build() {
            return new ExperienceContext(brandName, locale, shippingPreference, returnUrl,
                    cancelUrl);
        }
    }
}
