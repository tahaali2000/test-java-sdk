
# Getting Started with PayPal REST APIs

## Introduction

An order represents a payment between two or more parties. Use the Orders API to create, update, retrieve, authorize, and capture orders., Call the Payments API to authorize payments, capture authorized payments, refund payments that have already been captured, and show payment information. Use the Payments API in conjunction with the <a href="/docs/api/orders/v2/">Orders API</a>. For more information, see the <a href="/docs/checkout/">PayPal Checkout Overview</a>., The Payment Method Tokens API saves payment methods so payers don't have to enter details for future transactions. Payers can check out faster or pay without being present after they agree to save a payment method.<br><br>The API associates a payment method with a temporary setup token. Pass the setup token to the API to exchange the setup token for a permanent token.<br><br>The permanent token represents a payment method that's saved to the vault. This token can be used repeatedly for checkout or recurring transactions such as subscriptions.<br><br>The Payment Method Tokens API is available in the US only.

Find out more here: [https://developer.paypal.com/docs/api/orders/v2/](https://developer.paypal.com/docs/api/orders/v2/)

## Install the Package

Install the SDK by adding the following dependency in your project's pom.xml file:

```xml
<dependency>
  <groupId>com.github</groupId>
  <artifactId>test-sdk</artifactId>
  <version>1.2.6</version>
</dependency>
```

You can also view the package at:
https://central.sonatype.com/artifact/com.github/test-sdk/1.2.6

## Initialize the API Client

**_Note:_** Documentation for the client can be found [here.](https://www.github.com/tahaali2000/test-java-sdk/tree/1.2.6/doc/client.md)

The following parameters are configurable for the API Client:

| Parameter | Type | Description |
|  --- | --- | --- |
| environment | `Environment` | The API environment. <br> **Default: `Environment.SANDBOX`** |
| httpClientConfig | [`Consumer<HttpClientConfiguration.Builder>`](https://www.github.com/tahaali2000/test-java-sdk/tree/1.2.6/doc/http-client-configuration-builder.md) | Set up Http Client Configuration instance. |
| loggingConfig | [`Consumer<ApiLoggingConfiguration.Builder>`](https://www.github.com/tahaali2000/test-java-sdk/tree/1.2.6/doc/api-logging-configuration-builder.md) | Set up Logging Configuration instance. |
| clientCredentialsAuth | [`ClientCredentialsAuth`](https://www.github.com/tahaali2000/test-java-sdk/tree/1.2.6/doc/auth/oauth-2-client-credentials-grant.md) | The Credentials Setter for OAuth 2 Client Credentials Grant |

The API client can be initialized as follows:

```java
PayPalRESTAPIsClient client = new PayPalRESTAPIsClient.Builder()
    .loggingConfig(builder -> builder
            .level(Level.DEBUG)
            .requestConfig(logConfigBuilder -> logConfigBuilder.body(true))
            .responseConfig(logConfigBuilder -> logConfigBuilder.headers(true)))
    .httpClientConfig(configBuilder -> configBuilder
            .timeout(0))
    .clientCredentialsAuth(new ClientCredentialsAuthModel.Builder(
            "OAuthClientId",
            "OAuthClientSecret"
        )
        .build())
    .environment(Environment.SANDBOX)
    .build();
```

## Environments

The SDK can be configured to use a different environment for making API calls. Available environments are:

### Fields

| Name | Description |
|  --- | --- |
| Production | PayPal Live Environment |
| Sandbox | **Default** PayPal Sandbox Environment |

## Authorization

This API uses the following authentication schemes.

* [`Oauth2 (OAuth 2 Client Credentials Grant)`](https://www.github.com/tahaali2000/test-java-sdk/tree/1.2.6/doc/auth/oauth-2-client-credentials-grant.md)

## List of APIs

* [Orders](https://www.github.com/tahaali2000/test-java-sdk/tree/1.2.6/doc/controllers/orders.md)
* [Payments](https://www.github.com/tahaali2000/test-java-sdk/tree/1.2.6/doc/controllers/payments.md)
* [Vault](https://www.github.com/tahaali2000/test-java-sdk/tree/1.2.6/doc/controllers/vault.md)

## SDK Infrastructure

### Configuration

* [ApiLoggingConfiguration](https://www.github.com/tahaali2000/test-java-sdk/tree/1.2.6/doc/api-logging-configuration.md)
* [ApiLoggingConfiguration.Builder](https://www.github.com/tahaali2000/test-java-sdk/tree/1.2.6/doc/api-logging-configuration-builder.md)
* [ApiRequestLoggingConfiguration.Builder](https://www.github.com/tahaali2000/test-java-sdk/tree/1.2.6/doc/api-request-logging-configuration-builder.md)
* [ApiResponseLoggingConfiguration.Builder](https://www.github.com/tahaali2000/test-java-sdk/tree/1.2.6/doc/api-response-logging-configuration-builder.md)
* [Configuration Interface](https://www.github.com/tahaali2000/test-java-sdk/tree/1.2.6/doc/configuration-interface.md)
* [HttpClientConfiguration](https://www.github.com/tahaali2000/test-java-sdk/tree/1.2.6/doc/http-client-configuration.md)
* [HttpClientConfiguration.Builder](https://www.github.com/tahaali2000/test-java-sdk/tree/1.2.6/doc/http-client-configuration-builder.md)

### HTTP

* [Headers](https://www.github.com/tahaali2000/test-java-sdk/tree/1.2.6/doc/headers.md)
* [HttpCallback Interface](https://www.github.com/tahaali2000/test-java-sdk/tree/1.2.6/doc/http-callback-interface.md)
* [HttpContext](https://www.github.com/tahaali2000/test-java-sdk/tree/1.2.6/doc/http-context.md)
* [HttpBodyRequest](https://www.github.com/tahaali2000/test-java-sdk/tree/1.2.6/doc/http-body-request.md)
* [HttpRequest](https://www.github.com/tahaali2000/test-java-sdk/tree/1.2.6/doc/http-request.md)
* [HttpResponse](https://www.github.com/tahaali2000/test-java-sdk/tree/1.2.6/doc/http-response.md)
* [HttpStringResponse](https://www.github.com/tahaali2000/test-java-sdk/tree/1.2.6/doc/http-string-response.md)

### Utilities

* [ApiException](https://www.github.com/tahaali2000/test-java-sdk/tree/1.2.6/doc/api-exception.md)
* [ApiHelper](https://www.github.com/tahaali2000/test-java-sdk/tree/1.2.6/doc/api-helper.md)
* [FileWrapper](https://www.github.com/tahaali2000/test-java-sdk/tree/1.2.6/doc/file-wrapper.md)

