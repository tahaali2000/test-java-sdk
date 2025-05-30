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
 * This is a model class for VenmoPaymentToken type.
 */
public class VenmoPaymentToken {
    private String description;
    private VaultedDigitalWalletShippingDetails shipping;
    private Boolean permitMultiplePaymentTokens;
    private String usageType;
    private String customerType;
    private String emailAddress;
    private String payerId;
    private Name name;
    private PhoneWithType phone;
    private Address address;
    private String userName;

    /**
     * Default constructor.
     */
    public VenmoPaymentToken() {
        permitMultiplePaymentTokens = false;
    }

    /**
     * Initialization constructor.
     * @param  description  String value for description.
     * @param  shipping  VaultedDigitalWalletShippingDetails value for shipping.
     * @param  permitMultiplePaymentTokens  Boolean value for permitMultiplePaymentTokens.
     * @param  usageType  String value for usageType.
     * @param  customerType  String value for customerType.
     * @param  emailAddress  String value for emailAddress.
     * @param  payerId  String value for payerId.
     * @param  name  Name value for name.
     * @param  phone  PhoneWithType value for phone.
     * @param  address  Address value for address.
     * @param  userName  String value for userName.
     */
    public VenmoPaymentToken(
            String description,
            VaultedDigitalWalletShippingDetails shipping,
            Boolean permitMultiplePaymentTokens,
            String usageType,
            String customerType,
            String emailAddress,
            String payerId,
            Name name,
            PhoneWithType phone,
            Address address,
            String userName) {
        this.description = description;
        this.shipping = shipping;
        this.permitMultiplePaymentTokens = permitMultiplePaymentTokens;
        this.usageType = usageType;
        this.customerType = customerType;
        this.emailAddress = emailAddress;
        this.payerId = payerId;
        this.name = name;
        this.phone = phone;
        this.address = address;
        this.userName = userName;
    }

    /**
     * Getter for Description.
     * The description displayed to the consumer on the approval flow for a digital wallet, as well
     * as on the merchant view of the payment token management experience. exp: PayPal.com.
     * @return Returns the String
     */
    @JsonGetter("description")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getDescription() {
        return description;
    }

    /**
     * Setter for Description.
     * The description displayed to the consumer on the approval flow for a digital wallet, as well
     * as on the merchant view of the payment token management experience. exp: PayPal.com.
     * @param description Value for String
     */
    @JsonSetter("description")
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Getter for Shipping.
     * The shipping details.
     * @return Returns the VaultedDigitalWalletShippingDetails
     */
    @JsonGetter("shipping")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public VaultedDigitalWalletShippingDetails getShipping() {
        return shipping;
    }

    /**
     * Setter for Shipping.
     * The shipping details.
     * @param shipping Value for VaultedDigitalWalletShippingDetails
     */
    @JsonSetter("shipping")
    public void setShipping(VaultedDigitalWalletShippingDetails shipping) {
        this.shipping = shipping;
    }

    /**
     * Getter for PermitMultiplePaymentTokens.
     * Create multiple payment tokens for the same payer, merchant/platform combination. Use this
     * when the customer has not logged in at merchant/platform. The payment token thus generated,
     * can then also be used to create the customer account at merchant/platform. Use this also when
     * multiple payment tokens are required for the same payer, different customer at
     * merchant/platform. This helps to identify customers distinctly even though they may share the
     * same PayPal account. This only applies to PayPal payment source.
     * @return Returns the Boolean
     */
    @JsonGetter("permit_multiple_payment_tokens")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getPermitMultiplePaymentTokens() {
        return permitMultiplePaymentTokens;
    }

    /**
     * Setter for PermitMultiplePaymentTokens.
     * Create multiple payment tokens for the same payer, merchant/platform combination. Use this
     * when the customer has not logged in at merchant/platform. The payment token thus generated,
     * can then also be used to create the customer account at merchant/platform. Use this also when
     * multiple payment tokens are required for the same payer, different customer at
     * merchant/platform. This helps to identify customers distinctly even though they may share the
     * same PayPal account. This only applies to PayPal payment source.
     * @param permitMultiplePaymentTokens Value for Boolean
     */
    @JsonSetter("permit_multiple_payment_tokens")
    public void setPermitMultiplePaymentTokens(Boolean permitMultiplePaymentTokens) {
        this.permitMultiplePaymentTokens = permitMultiplePaymentTokens;
    }

    /**
     * Getter for UsageType.
     * The usage type associated with a digital wallet payment token.
     * @return Returns the String
     */
    @JsonGetter("usage_type")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getUsageType() {
        return usageType;
    }

    /**
     * Setter for UsageType.
     * The usage type associated with a digital wallet payment token.
     * @param usageType Value for String
     */
    @JsonSetter("usage_type")
    public void setUsageType(String usageType) {
        this.usageType = usageType;
    }

    /**
     * Getter for CustomerType.
     * The customer type associated with a digital wallet payment token. This is to indicate whether
     * the customer acting on the merchant / platform is either a business or a consumer.
     * @return Returns the String
     */
    @JsonGetter("customer_type")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getCustomerType() {
        return customerType;
    }

    /**
     * Setter for CustomerType.
     * The customer type associated with a digital wallet payment token. This is to indicate whether
     * the customer acting on the merchant / platform is either a business or a consumer.
     * @param customerType Value for String
     */
    @JsonSetter("customer_type")
    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }

    /**
     * Getter for EmailAddress.
     * The internationalized email address.&lt;blockquote&gt;&lt;strong&gt;Note:&lt;/strong&gt; Up to 64 characters
     * are allowed before and 255 characters are allowed after the &lt;code&gt;{@literal @}&lt;/code&gt; sign. However, the
     * generally accepted maximum length for an email address is 254 characters. The pattern
     * verifies that an unquoted &lt;code&gt;{@literal @}&lt;/code&gt; sign exists.&lt;/blockquote&gt;
     * @return Returns the String
     */
    @JsonGetter("email_address")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getEmailAddress() {
        return emailAddress;
    }

    /**
     * Setter for EmailAddress.
     * The internationalized email address.&lt;blockquote&gt;&lt;strong&gt;Note:&lt;/strong&gt; Up to 64 characters
     * are allowed before and 255 characters are allowed after the &lt;code&gt;{@literal @}&lt;/code&gt; sign. However, the
     * generally accepted maximum length for an email address is 254 characters. The pattern
     * verifies that an unquoted &lt;code&gt;{@literal @}&lt;/code&gt; sign exists.&lt;/blockquote&gt;
     * @param emailAddress Value for String
     */
    @JsonSetter("email_address")
    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    /**
     * Getter for PayerId.
     * The account identifier for a PayPal account.
     * @return Returns the String
     */
    @JsonGetter("payer_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getPayerId() {
        return payerId;
    }

    /**
     * Setter for PayerId.
     * The account identifier for a PayPal account.
     * @param payerId Value for String
     */
    @JsonSetter("payer_id")
    public void setPayerId(String payerId) {
        this.payerId = payerId;
    }

    /**
     * Getter for Name.
     * The name of the party.
     * @return Returns the Name
     */
    @JsonGetter("name")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Name getName() {
        return name;
    }

    /**
     * Setter for Name.
     * The name of the party.
     * @param name Value for Name
     */
    @JsonSetter("name")
    public void setName(Name name) {
        this.name = name;
    }

    /**
     * Getter for Phone.
     * The phone information.
     * @return Returns the PhoneWithType
     */
    @JsonGetter("phone")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public PhoneWithType getPhone() {
        return phone;
    }

    /**
     * Setter for Phone.
     * The phone information.
     * @param phone Value for PhoneWithType
     */
    @JsonSetter("phone")
    public void setPhone(PhoneWithType phone) {
        this.phone = phone;
    }

    /**
     * Getter for Address.
     * The portable international postal address. Maps to
     * [AddressValidationMetadata](https://github.com/googlei18n/libaddressinput/wiki/AddressValidationMetadata)
     * and HTML 5.1 [Autofilling form controls: the autocomplete
     * attribute](https://www.w3.org/TR/html51/sec-forms.html#autofilling-form-controls-the-autocomplete-attribute).
     * @return Returns the Address
     */
    @JsonGetter("address")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Address getAddress() {
        return address;
    }

    /**
     * Setter for Address.
     * The portable international postal address. Maps to
     * [AddressValidationMetadata](https://github.com/googlei18n/libaddressinput/wiki/AddressValidationMetadata)
     * and HTML 5.1 [Autofilling form controls: the autocomplete
     * attribute](https://www.w3.org/TR/html51/sec-forms.html#autofilling-form-controls-the-autocomplete-attribute).
     * @param address Value for Address
     */
    @JsonSetter("address")
    public void setAddress(Address address) {
        this.address = address;
    }

    /**
     * Getter for UserName.
     * The Venmo username, as chosen by the user.
     * @return Returns the String
     */
    @JsonGetter("user_name")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getUserName() {
        return userName;
    }

    /**
     * Setter for UserName.
     * The Venmo username, as chosen by the user.
     * @param userName Value for String
     */
    @JsonSetter("user_name")
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * Converts this VenmoPaymentToken into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "VenmoPaymentToken [" + "description=" + description + ", shipping=" + shipping
                + ", permitMultiplePaymentTokens=" + permitMultiplePaymentTokens + ", usageType="
                + usageType + ", customerType=" + customerType + ", emailAddress=" + emailAddress
                + ", payerId=" + payerId + ", name=" + name + ", phone=" + phone + ", address="
                + address + ", userName=" + userName + "]";
    }

    /**
     * Builds a new {@link VenmoPaymentToken.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link VenmoPaymentToken.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .description(getDescription())
                .shipping(getShipping())
                .permitMultiplePaymentTokens(getPermitMultiplePaymentTokens())
                .usageType(getUsageType())
                .customerType(getCustomerType())
                .emailAddress(getEmailAddress())
                .payerId(getPayerId())
                .name(getName())
                .phone(getPhone())
                .address(getAddress())
                .userName(getUserName());
        return builder;
    }

    /**
     * Class to build instances of {@link VenmoPaymentToken}.
     */
    public static class Builder {
        private String description;
        private VaultedDigitalWalletShippingDetails shipping;
        private Boolean permitMultiplePaymentTokens = false;
        private String usageType;
        private String customerType;
        private String emailAddress;
        private String payerId;
        private Name name;
        private PhoneWithType phone;
        private Address address;
        private String userName;



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
         * Setter for shipping.
         * @param  shipping  VaultedDigitalWalletShippingDetails value for shipping.
         * @return Builder
         */
        public Builder shipping(VaultedDigitalWalletShippingDetails shipping) {
            this.shipping = shipping;
            return this;
        }

        /**
         * Setter for permitMultiplePaymentTokens.
         * @param  permitMultiplePaymentTokens  Boolean value for permitMultiplePaymentTokens.
         * @return Builder
         */
        public Builder permitMultiplePaymentTokens(Boolean permitMultiplePaymentTokens) {
            this.permitMultiplePaymentTokens = permitMultiplePaymentTokens;
            return this;
        }

        /**
         * Setter for usageType.
         * @param  usageType  String value for usageType.
         * @return Builder
         */
        public Builder usageType(String usageType) {
            this.usageType = usageType;
            return this;
        }

        /**
         * Setter for customerType.
         * @param  customerType  String value for customerType.
         * @return Builder
         */
        public Builder customerType(String customerType) {
            this.customerType = customerType;
            return this;
        }

        /**
         * Setter for emailAddress.
         * @param  emailAddress  String value for emailAddress.
         * @return Builder
         */
        public Builder emailAddress(String emailAddress) {
            this.emailAddress = emailAddress;
            return this;
        }

        /**
         * Setter for payerId.
         * @param  payerId  String value for payerId.
         * @return Builder
         */
        public Builder payerId(String payerId) {
            this.payerId = payerId;
            return this;
        }

        /**
         * Setter for name.
         * @param  name  Name value for name.
         * @return Builder
         */
        public Builder name(Name name) {
            this.name = name;
            return this;
        }

        /**
         * Setter for phone.
         * @param  phone  PhoneWithType value for phone.
         * @return Builder
         */
        public Builder phone(PhoneWithType phone) {
            this.phone = phone;
            return this;
        }

        /**
         * Setter for address.
         * @param  address  Address value for address.
         * @return Builder
         */
        public Builder address(Address address) {
            this.address = address;
            return this;
        }

        /**
         * Setter for userName.
         * @param  userName  String value for userName.
         * @return Builder
         */
        public Builder userName(String userName) {
            this.userName = userName;
            return this;
        }

        /**
         * Builds a new {@link VenmoPaymentToken} object using the set fields.
         * @return {@link VenmoPaymentToken}
         */
        public VenmoPaymentToken build() {
            return new VenmoPaymentToken(description, shipping, permitMultiplePaymentTokens,
                    usageType, customerType, emailAddress, payerId, name, phone, address, userName);
        }
    }
}
