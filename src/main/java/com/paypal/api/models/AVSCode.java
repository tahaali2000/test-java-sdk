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
 * AVSCode to be used.
 */
public enum AVSCode {
    A,

    B,

    C,

    D,

    E,

    F,

    G,

    I,

    M,

    N,

    P,

    R,

    S,

    U,

    W,

    X,

    Y,

    Z,

    NULL,

    ENUM_0,

    ENUM_1,

    ENUM_2,

    ENUM_3,

    ENUM_4,

    /**
     * Unknown values will be mapped by this enum member
     */
    _UNKNOWN;


    private static TreeMap<String, AVSCode> valueMap = new TreeMap<>();
    private String value;

    static {
        A.value = "A";
        B.value = "B";
        C.value = "C";
        D.value = "D";
        E.value = "E";
        F.value = "F";
        G.value = "G";
        I.value = "I";
        M.value = "M";
        N.value = "N";
        P.value = "P";
        R.value = "R";
        S.value = "S";
        U.value = "U";
        W.value = "W";
        X.value = "X";
        Y.value = "Y";
        Z.value = "Z";
        NULL.value = "Null";
        ENUM_0.value = "0";
        ENUM_1.value = "1";
        ENUM_2.value = "2";
        ENUM_3.value = "3";
        ENUM_4.value = "4";
        _UNKNOWN.value = null;

        valueMap.put("A", A);
        valueMap.put("B", B);
        valueMap.put("C", C);
        valueMap.put("D", D);
        valueMap.put("E", E);
        valueMap.put("F", F);
        valueMap.put("G", G);
        valueMap.put("I", I);
        valueMap.put("M", M);
        valueMap.put("N", N);
        valueMap.put("P", P);
        valueMap.put("R", R);
        valueMap.put("S", S);
        valueMap.put("U", U);
        valueMap.put("W", W);
        valueMap.put("X", X);
        valueMap.put("Y", Y);
        valueMap.put("Z", Z);
        valueMap.put("Null", NULL);
        valueMap.put("0", ENUM_0);
        valueMap.put("1", ENUM_1);
        valueMap.put("2", ENUM_2);
        valueMap.put("3", ENUM_3);
        valueMap.put("4", ENUM_4);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     * @throws IOException when provided value is not mapped to any enum member.
     */
    @JsonCreator
    public static AVSCode constructFromString(String toConvert) throws IOException {
        AVSCode enumValue = fromString(toConvert);
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
    public static AVSCode fromString(String toConvert) {
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
     * Convert list of AVSCode values to list of string values.
     * @param toConvert The list of AVSCode values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<AVSCode> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (AVSCode enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 