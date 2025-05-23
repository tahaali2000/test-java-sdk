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
 * This is a model class for VaultInstructionBase type.
 */
public class VaultInstructionBase {
    private StoreInVaultInstruction storeInVault;

    /**
     * Default constructor.
     */
    public VaultInstructionBase() {
    }

    /**
     * Initialization constructor.
     * @param  storeInVault  StoreInVaultInstruction value for storeInVault.
     */
    public VaultInstructionBase(
            StoreInVaultInstruction storeInVault) {
        this.storeInVault = storeInVault;
    }

    /**
     * Getter for StoreInVault.
     * Defines how and when the payment source gets vaulted.
     * @return Returns the StoreInVaultInstruction
     */
    @JsonGetter("store_in_vault")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public StoreInVaultInstruction getStoreInVault() {
        return storeInVault;
    }

    /**
     * Setter for StoreInVault.
     * Defines how and when the payment source gets vaulted.
     * @param storeInVault Value for StoreInVaultInstruction
     */
    @JsonSetter("store_in_vault")
    public void setStoreInVault(StoreInVaultInstruction storeInVault) {
        this.storeInVault = storeInVault;
    }

    /**
     * Converts this VaultInstructionBase into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "VaultInstructionBase [" + "storeInVault=" + storeInVault + "]";
    }

    /**
     * Builds a new {@link VaultInstructionBase.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link VaultInstructionBase.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .storeInVault(getStoreInVault());
        return builder;
    }

    /**
     * Class to build instances of {@link VaultInstructionBase}.
     */
    public static class Builder {
        private StoreInVaultInstruction storeInVault;



        /**
         * Setter for storeInVault.
         * @param  storeInVault  StoreInVaultInstruction value for storeInVault.
         * @return Builder
         */
        public Builder storeInVault(StoreInVaultInstruction storeInVault) {
            this.storeInVault = storeInVault;
            return this;
        }

        /**
         * Builds a new {@link VaultInstructionBase} object using the set fields.
         * @return {@link VaultInstructionBase}
         */
        public VaultInstructionBase build() {
            return new VaultInstructionBase(storeInVault);
        }
    }
}
