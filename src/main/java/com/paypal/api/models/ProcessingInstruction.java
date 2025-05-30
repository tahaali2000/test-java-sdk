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
 * ProcessingInstruction to be used.
 */
public enum ProcessingInstruction {
    ORDER_COMPLETE_ON_PAYMENT_APPROVAL,

    NO_INSTRUCTION,

    /**
     * Unknown values will be mapped by this enum member
     */
    _UNKNOWN;


    private static TreeMap<String, ProcessingInstruction> valueMap = new TreeMap<>();
    private String value;

    static {
        ORDER_COMPLETE_ON_PAYMENT_APPROVAL.value = "ORDER_COMPLETE_ON_PAYMENT_APPROVAL";
        NO_INSTRUCTION.value = "NO_INSTRUCTION";
        _UNKNOWN.value = null;

        valueMap.put("ORDER_COMPLETE_ON_PAYMENT_APPROVAL", ORDER_COMPLETE_ON_PAYMENT_APPROVAL);
        valueMap.put("NO_INSTRUCTION", NO_INSTRUCTION);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     * @throws IOException when provided value is not mapped to any enum member.
     */
    @JsonCreator
    public static ProcessingInstruction constructFromString(String toConvert) throws IOException {
        ProcessingInstruction enumValue = fromString(toConvert);
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
    public static ProcessingInstruction fromString(String toConvert) {
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
     * Convert list of ProcessingInstruction values to list of string values.
     * @param toConvert The list of ProcessingInstruction values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<ProcessingInstruction> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (ProcessingInstruction enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 