/*
 * PayPalRESTAPIsLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.paypal.api.authentication;

import com.paypal.api.ClientCredentialsAuth;
import com.paypal.api.models.OAuthToken;
import java.util.function.BiFunction;
import java.util.function.Consumer;

/**
 * A data class for OAuth 2 Client Credentials Grant credentials.
 */
public class ClientCredentialsAuthModel {
    private String oAuthClientId;
    private String oAuthClientSecret;
    private OAuthToken oAuthToken;
    private BiFunction<OAuthToken, ClientCredentialsAuth, OAuthToken> oAuthTokenProvider;
    private Consumer<OAuthToken> oAuthOnTokenUpdate;
    private long oAuthClockSkew;

    /**
     * A Constructor for ClientCredentialsAuthModel.
     */
    private ClientCredentialsAuthModel(String oAuthClientId, String oAuthClientSecret,
            OAuthToken oAuthToken,
            BiFunction<OAuthToken, ClientCredentialsAuth, OAuthToken> oAuthTokenProvider,
            Consumer<OAuthToken> oAuthOnTokenUpdate, long oAuthClockSkew) {
        this.oAuthClientId = oAuthClientId;
        this.oAuthClientSecret = oAuthClientSecret;
        this.oAuthToken = oAuthToken;
        this.oAuthTokenProvider = oAuthTokenProvider;
        this.oAuthOnTokenUpdate = oAuthOnTokenUpdate;
        this.oAuthClockSkew = oAuthClockSkew;
    }

    /**
     * Getter for oAuthClientId.
     * @return oAuthClientId The value of OAuthClientId.
     */
    public String getOAuthClientId() {
        return this.oAuthClientId;
    }

    /**
     * Getter for oAuthClientSecret.
     * @return oAuthClientSecret The value of OAuthClientSecret.
     */
    public String getOAuthClientSecret() {
        return this.oAuthClientSecret;
    }

    /**
     * Getter for oAuthToken.
     * @return oAuthToken The value of OAuthToken.
     */
    public OAuthToken getOAuthToken() {
        return this.oAuthToken;
    }

    /**
     * Getter for oAuthTokenProvider.
     * @return oAuthTokenProvider The value of oAuthTokenProvider.
     */
    public BiFunction<OAuthToken, ClientCredentialsAuth, OAuthToken> getOAuthTokenProvider() {
        return this.oAuthTokenProvider;
    }

    /**
     * Getter for oAuthOnTokenUpdate.
     * @return oAuthOnTokenUpdate The value of oAuthOnTokenUpdate.
     */
    public Consumer<OAuthToken> getOAuthOnTokenUpdate() {
        return this.oAuthOnTokenUpdate;
    }

    /**
     * Getter for oAuthClockSkew.
     * @return oAuthClockSkew The value of oAuthClockSkew.
     */
    public long getOAuthClockSkew() {
        return this.oAuthClockSkew;
    }

    /**
     * Builds a new {@link ClientCredentialsAuthModel.Builder} object.
     * Creates the instance with the state of the current auth model.
     * @return a new {@link ClientCredentialsAuthModel.Builder} object.
     */
    public Builder toBuilder() {
        return new Builder(getOAuthClientId(), getOAuthClientSecret())
            .oAuthToken(getOAuthToken())
            .oAuthTokenProvider(getOAuthTokenProvider())
            .oAuthOnTokenUpdate(getOAuthOnTokenUpdate())
            .oAuthClockSkew(getOAuthClockSkew());
    }

    /**
     * A Builder class for OAuth 2 Client Credentials Grant credentials.
     */
    public static class Builder {
        private String oAuthClientId;
        private String oAuthClientSecret;
        private OAuthToken oAuthToken;
        private BiFunction<OAuthToken, ClientCredentialsAuth, OAuthToken> oAuthTokenProvider;
        private Consumer<OAuthToken> oAuthOnTokenUpdate;
        private long oAuthClockSkew;

        /**
         * The constructor with required auth credentials.
         * @param oAuthClientId The value of OAuthClientId.
         * @param oAuthClientSecret The value of OAuthClientSecret.
         */
        public Builder(String oAuthClientId, String oAuthClientSecret) {
            if (oAuthClientId == null) {
                throw new NullPointerException("OAuthClientId cannot be null.");
            }

            if (oAuthClientSecret == null) {
                throw new NullPointerException("OAuthClientSecret cannot be null.");
            }

            this.oAuthClientId = oAuthClientId;
            this.oAuthClientSecret = oAuthClientSecret;
        }

        /**
         * Setter for oAuthClientId.
         * @param oAuthClientId The value of OAuthClientId.
         * @return Builder The current instance of Builder.
         */
        public Builder oAuthClientId(String oAuthClientId) {
            if (oAuthClientId == null) {
                throw new NullPointerException("OAuthClientId cannot be null.");
            }

            this.oAuthClientId = oAuthClientId;
            return this;
        }

        /**
         * Setter for oAuthClientSecret.
         * @param oAuthClientSecret The value of OAuthClientSecret.
         * @return Builder The current instance of Builder.
         */
        public Builder oAuthClientSecret(String oAuthClientSecret) {
            if (oAuthClientSecret == null) {
                throw new NullPointerException("OAuthClientSecret cannot be null.");
            }

            this.oAuthClientSecret = oAuthClientSecret;
            return this;
        }

        /**
         * Setter for oAuthToken.
         * @param oAuthToken The value of OAuthToken.
         * @return Builder The current instance of Builder.
         */
        public Builder oAuthToken(OAuthToken oAuthToken) {
            this.oAuthToken = oAuthToken;
            return this;
        }

        /**
         * Setter for oAuthTokenProvider.
         * @param oAuthTokenProvider The value of oAuthTokenProvider.
         * @return Builder The current instance of Builder.
         */
        public Builder oAuthTokenProvider(BiFunction<OAuthToken, ClientCredentialsAuth, OAuthToken> oAuthTokenProvider) {
            this.oAuthTokenProvider = oAuthTokenProvider;
            return this;
        }

        /**
         * Setter for oAuthOnTokenUpdate.
         * @param oAuthOnTokenUpdate The value of oAuthOnTokenUpdate.
         * @return Builder The current instance of Builder.
         */
        public Builder oAuthOnTokenUpdate(Consumer<OAuthToken> oAuthOnTokenUpdate) {
            this.oAuthOnTokenUpdate = oAuthOnTokenUpdate;
            return this;
        }

        /**
         * Setter for oAuthClockSkew.
         * @param oAuthClockSkew The value of oAuthClockSkew.
         * @return Builder The current instance of Builder.
         */
        public Builder oAuthClockSkew(long oAuthClockSkew) {
            this.oAuthClockSkew = oAuthClockSkew;
            return this;
        }

        /**
         * Builds the instance of ClientCredentialsAuthModel using the provided credentials.
         * @return The instance of ClientCredentialsAuthModel.
         */
        public ClientCredentialsAuthModel build() {
            return new ClientCredentialsAuthModel(oAuthClientId, oAuthClientSecret, oAuthToken,
                    oAuthTokenProvider, oAuthOnTokenUpdate, oAuthClockSkew);
        }
    }
}