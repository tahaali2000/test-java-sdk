/*
 * PayPalRESTAPIsLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.paypal.api.models;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;


/**
 * SellerProtectionStatus to be used.
 */
public enum SellerProtectionStatus {
    ELIGIBLE,

    PARTIALLY_ELIGIBLE,

    NOT_ELIGIBLE,

    /**
     * Unknown values will be mapped by this enum member
     */
    _UNKNOWN;


    private static TreeMap<String, SellerProtectionStatus> valueMap = new TreeMap<>();
    private String value;

    static {
        ELIGIBLE.value = "ELIGIBLE";
        PARTIALLY_ELIGIBLE.value = "PARTIALLY_ELIGIBLE";
        NOT_ELIGIBLE.value = "NOT_ELIGIBLE";
        _UNKNOWN.value = null;

        valueMap.put("ELIGIBLE", ELIGIBLE);
        valueMap.put("PARTIALLY_ELIGIBLE", PARTIALLY_ELIGIBLE);
        valueMap.put("NOT_ELIGIBLE", NOT_ELIGIBLE);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     * @throws IOException when provided value is not mapped to any enum member.
     */
    @JsonCreator
    public static SellerProtectionStatus constructFromString(String toConvert) throws IOException {
        SellerProtectionStatus enumValue = fromString(toConvert);
        if (enumValue == null) {
            throw new IOException("Unable to create enum instance with value: " + toConvert);
        }
        return enumValue;
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     */
    public static SellerProtectionStatus fromString(String toConvert) {
        if (!valueMap.containsKey(toConvert)) {
            return _UNKNOWN;
        }
        return valueMap.get(toConvert);
    }

    /**
     * Returns the string value associated with the enum member.
     * @return The string value against enum member.
     */
    @JsonValue
    public String value() {
        return value;
    }
        
    /**
     * Get string representation of this enum.
     */
    @Override
    public String toString() {
        if (value == null) {
            return null;
        }
        return value.toString();
    }

    /**
     * Convert list of SellerProtectionStatus values to list of string values.
     * @param toConvert The list of SellerProtectionStatus values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<SellerProtectionStatus> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (SellerProtectionStatus enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 