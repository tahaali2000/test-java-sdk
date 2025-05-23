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
 * This is a model class for PayPalWallet type.
 */
public class PayPalWallet {
    private String vaultId;
    private String emailAddress;
    private Name name;
    private PhoneWithType phone;
    private String birthDate;
    private TaxInfo taxInfo;
    private Address address;
    private PayPalWalletAttributes attributes;
    private PayPalWalletExperienceContext experienceContext;
    private String billingAgreementId;

    /**
     * Default constructor.
     */
    public PayPalWallet() {
    }

    /**
     * Initialization constructor.
     * @param  vaultId  String value for vaultId.
     * @param  emailAddress  String value for emailAddress.
     * @param  name  Name value for name.
     * @param  phone  PhoneWithType value for phone.
     * @param  birthDate  String value for birthDate.
     * @param  taxInfo  TaxInfo value for taxInfo.
     * @param  address  Address value for address.
     * @param  attributes  PayPalWalletAttributes value for attributes.
     * @param  experienceContext  PayPalWalletExperienceContext value for experienceContext.
     * @param  billingAgreementId  String value for billingAgreementId.
     */
    public PayPalWallet(
            String vaultId,
            String emailAddress,
            Name name,
            PhoneWithType phone,
            String birthDate,
            TaxInfo taxInfo,
            Address address,
            PayPalWalletAttributes attributes,
            PayPalWalletExperienceContext experienceContext,
            String billingAgreementId) {
        this.vaultId = vaultId;
        this.emailAddress = emailAddress;
        this.name = name;
        this.phone = phone;
        this.birthDate = birthDate;
        this.taxInfo = taxInfo;
        this.address = address;
        this.attributes = attributes;
        this.experienceContext = experienceContext;
        this.billingAgreementId = billingAgreementId;
    }

    /**
     * Getter for VaultId.
     * The PayPal-generated ID for the vaulted payment source. This ID should be stored on the
     * merchant's server so the saved payment source can be used for future transactions.
     * @return Returns the String
     */
    @JsonGetter("vault_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getVaultId() {
        return vaultId;
    }

    /**
     * Setter for VaultId.
     * The PayPal-generated ID for the vaulted payment source. This ID should be stored on the
     * merchant's server so the saved payment source can be used for future transactions.
     * @param vaultId Value for String
     */
    @JsonSetter("vault_id")
    public void setVaultId(String vaultId) {
        this.vaultId = vaultId;
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
     * Getter for BirthDate.
     * The stand-alone date, in [Internet date and time
     * format](https://tools.ietf.org/html/rfc3339#section-5.6). To represent special legal values,
     * such as a date of birth, you should use dates with no associated time or time-zone data.
     * Whenever possible, use the standard `date_time` type. This regular expression does not
     * validate all dates. For example, February 31 is valid and nothing is known about leap years.
     * @return Returns the String
     */
    @JsonGetter("birth_date")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getBirthDate() {
        return birthDate;
    }

    /**
     * Setter for BirthDate.
     * The stand-alone date, in [Internet date and time
     * format](https://tools.ietf.org/html/rfc3339#section-5.6). To represent special legal values,
     * such as a date of birth, you should use dates with no associated time or time-zone data.
     * Whenever possible, use the standard `date_time` type. This regular expression does not
     * validate all dates. For example, February 31 is valid and nothing is known about leap years.
     * @param birthDate Value for String
     */
    @JsonSetter("birth_date")
    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    /**
     * Getter for TaxInfo.
     * The tax ID of the customer. The customer is also known as the payer. Both `tax_id` and
     * `tax_id_type` are required.
     * @return Returns the TaxInfo
     */
    @JsonGetter("tax_info")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public TaxInfo getTaxInfo() {
        return taxInfo;
    }

    /**
     * Setter for TaxInfo.
     * The tax ID of the customer. The customer is also known as the payer. Both `tax_id` and
     * `tax_id_type` are required.
     * @param taxInfo Value for TaxInfo
     */
    @JsonSetter("tax_info")
    public void setTaxInfo(TaxInfo taxInfo) {
        this.taxInfo = taxInfo;
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
     * Getter for Attributes.
     * Additional attributes associated with the use of this PayPal Wallet.
     * @return Returns the PayPalWalletAttributes
     */
    @JsonGetter("attributes")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public PayPalWalletAttributes getAttributes() {
        return attributes;
    }

    /**
     * Setter for Attributes.
     * Additional attributes associated with the use of this PayPal Wallet.
     * @param attributes Value for PayPalWalletAttributes
     */
    @JsonSetter("attributes")
    public void setAttributes(PayPalWalletAttributes attributes) {
        this.attributes = attributes;
    }

    /**
     * Getter for ExperienceContext.
     * Customizes the payer experience during the approval process for payment with
     * PayPal.&lt;blockquote&gt;&lt;strong&gt;Note:&lt;/strong&gt; Partners and Marketplaces might configure
     * &lt;code&gt;brand_name&lt;/code&gt; and &lt;code&gt;shipping_preference&lt;/code&gt; during partner account setup,
     * which overrides the request values.&lt;/blockquote&gt;
     * @return Returns the PayPalWalletExperienceContext
     */
    @JsonGetter("experience_context")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public PayPalWalletExperienceContext getExperienceContext() {
        return experienceContext;
    }

    /**
     * Setter for ExperienceContext.
     * Customizes the payer experience during the approval process for payment with
     * PayPal.&lt;blockquote&gt;&lt;strong&gt;Note:&lt;/strong&gt; Partners and Marketplaces might configure
     * &lt;code&gt;brand_name&lt;/code&gt; and &lt;code&gt;shipping_preference&lt;/code&gt; during partner account setup,
     * which overrides the request values.&lt;/blockquote&gt;
     * @param experienceContext Value for PayPalWalletExperienceContext
     */
    @JsonSetter("experience_context")
    public void setExperienceContext(PayPalWalletExperienceContext experienceContext) {
        this.experienceContext = experienceContext;
    }

    /**
     * Getter for BillingAgreementId.
     * The PayPal billing agreement ID. References an approved recurring payment for goods or
     * services.
     * @return Returns the String
     */
    @JsonGetter("billing_agreement_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getBillingAgreementId() {
        return billingAgreementId;
    }

    /**
     * Setter for BillingAgreementId.
     * The PayPal billing agreement ID. References an approved recurring payment for goods or
     * services.
     * @param billingAgreementId Value for String
     */
    @JsonSetter("billing_agreement_id")
    public void setBillingAgreementId(String billingAgreementId) {
        this.billingAgreementId = billingAgreementId;
    }

    /**
     * Converts this PayPalWallet into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "PayPalWallet [" + "vaultId=" + vaultId + ", emailAddress=" + emailAddress
                + ", name=" + name + ", phone=" + phone + ", birthDate=" + birthDate + ", taxInfo="
                + taxInfo + ", address=" + address + ", attributes=" + attributes
                + ", experienceContext=" + experienceContext + ", billingAgreementId="
                + billingAgreementId + "]";
    }

    /**
     * Builds a new {@link PayPalWallet.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link PayPalWallet.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .vaultId(getVaultId())
                .emailAddress(getEmailAddress())
                .name(getName())
                .phone(getPhone())
                .birthDate(getBirthDate())
                .taxInfo(getTaxInfo())
                .address(getAddress())
                .attributes(getAttributes())
                .experienceContext(getExperienceContext())
                .billingAgreementId(getBillingAgreementId());
        return builder;
    }

    /**
     * Class to build instances of {@link PayPalWallet}.
     */
    public static class Builder {
        private String vaultId;
        private String emailAddress;
        private Name name;
        private PhoneWithType phone;
        private String birthDate;
        private TaxInfo taxInfo;
        private Address address;
        private PayPalWalletAttributes attributes;
        private PayPalWalletExperienceContext experienceContext;
        private String billingAgreementId;



        /**
         * Setter for vaultId.
         * @param  vaultId  String value for vaultId.
         * @return Builder
         */
        public Builder vaultId(String vaultId) {
            this.vaultId = vaultId;
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
         * Setter for birthDate.
         * @param  birthDate  String value for birthDate.
         * @return Builder
         */
        public Builder birthDate(String birthDate) {
            this.birthDate = birthDate;
            return this;
        }

        /**
         * Setter for taxInfo.
         * @param  taxInfo  TaxInfo value for taxInfo.
         * @return Builder
         */
        public Builder taxInfo(TaxInfo taxInfo) {
            this.taxInfo = taxInfo;
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
         * Setter for attributes.
         * @param  attributes  PayPalWalletAttributes value for attributes.
         * @return Builder
         */
        public Builder attributes(PayPalWalletAttributes attributes) {
            this.attributes = attributes;
            return this;
        }

        /**
         * Setter for experienceContext.
         * @param  experienceContext  PayPalWalletExperienceContext value for experienceContext.
         * @return Builder
         */
        public Builder experienceContext(PayPalWalletExperienceContext experienceContext) {
            this.experienceContext = experienceContext;
            return this;
        }

        /**
         * Setter for billingAgreementId.
         * @param  billingAgreementId  String value for billingAgreementId.
         * @return Builder
         */
        public Builder billingAgreementId(String billingAgreementId) {
            this.billingAgreementId = billingAgreementId;
            return this;
        }

        /**
         * Builds a new {@link PayPalWallet} object using the set fields.
         * @return {@link PayPalWallet}
         */
        public PayPalWallet build() {
            return new PayPalWallet(vaultId, emailAddress, name, phone, birthDate, taxInfo, address,
                    attributes, experienceContext, billingAgreementId);
        }
    }
}
