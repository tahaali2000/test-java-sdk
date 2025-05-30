# Orders

Use the `/orders` resource to create, update, retrieve, authorize, capture and track orders.

```java
OrdersController ordersController = client.getOrdersController();
```

## Class Name

`OrdersController`

## Methods

* [Orders Create](../../doc/controllers/orders.md#orders-create)
* [Orders Get](../../doc/controllers/orders.md#orders-get)
* [Orders Patch](../../doc/controllers/orders.md#orders-patch)
* [Orders Confirm](../../doc/controllers/orders.md#orders-confirm)
* [Orders Authorize](../../doc/controllers/orders.md#orders-authorize)
* [Orders Capture](../../doc/controllers/orders.md#orders-capture)
* [Orders Track Create](../../doc/controllers/orders.md#orders-track-create)
* [Orders Trackers Patch](../../doc/controllers/orders.md#orders-trackers-patch)


# Orders Create

Creates an order. Merchants and partners can add Level 2 and 3 data to payments to reduce risk and payment processing costs. For more information about processing payments, see <a href="https://developer.paypal.com/docs/checkout/advanced/processing/">checkout</a> or <a href="https://developer.paypal.com/docs/multiparty/checkout/advanced/processing/">multiparty checkout</a>.<blockquote><strong>Note:</strong> For error handling and troubleshooting, see <a href="/api/rest/reference/orders/v2/errors/#create-order">Orders v2 errors</a>.</blockquote>

```java
CompletableFuture<Order> ordersCreateAsync(
    final OrdersCreateInput input)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`OrderRequest`](../../doc/models/order-request.md) | Body, Required | - |
| `payPalRequestId` | `String` | Header, Optional | The server stores keys for 6 hours. The API callers can request the times to up to 72 hours by speaking to their Account Manager.<br><br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `108` |
| `payPalPartnerAttributionId` | `String` | Header, Optional | **Constraints**: *Minimum Length*: `1`, *Maximum Length*: `36` |
| `payPalClientMetadataId` | `String` | Header, Optional | **Constraints**: *Minimum Length*: `1`, *Maximum Length*: `36` |
| `prefer` | `String` | Header, Optional | The preferred server response upon successful completion of the request. Value is:<ul><li><code>return=minimal</code>. The server returns a minimal response to optimize communication between the API caller and the server. A minimal response includes the <code>id</code>, <code>status</code> and HATEOAS links.</li><li><code>return=representation</code>. The server returns a complete resource representation, including the current state of the resource.</li></ul><br><br>**Default**: `"return=minimal"`<br><br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `25`, *Pattern*: `^[a-zA-Z=,-]*$` |

## Response Type

[`Order`](../../doc/models/order.md)

## Example Usage

```java
OrdersCreateInput ordersCreateInput = new OrdersCreateInput.Builder(
    null,
    new OrderRequest.Builder(
        CheckoutPaymentIntent.CAPTURE,
        Arrays.asList(
            new PurchaseUnitRequest.Builder(
                new AmountWithBreakdown.Builder(
                    "currency_code6",
                    "value0"
                )
                .build()
            )
            .build()
        )
    )
    .build()
)
.prefer("return=minimal")
.build();

ordersController.ordersCreateAsync(ordersCreateInput).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 400 | Request is not well-formed, syntactically incorrect, or violates schema. | [`ErrorException`](../../doc/models/error-exception.md) |
| 401 | Authentication failed due to missing authorization header, or invalid authentication credentials. | [`ErrorException`](../../doc/models/error-exception.md) |
| 422 | The requested action could not be performed, semantically incorrect, or failed business validation. | [`ErrorException`](../../doc/models/error-exception.md) |
| Default | The error response. | [`ErrorException`](../../doc/models/error-exception.md) |


# Orders Get

Shows details for an order, by ID.<blockquote><strong>Note:</strong> For error handling and troubleshooting, see <a href="/api/rest/reference/orders/v2/errors/#get-order">Orders v2 errors</a>.</blockquote>

```java
CompletableFuture<Order> ordersGetAsync(
    final OrdersGetInput input)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `id` | `String` | Template, Required | The ID of the order for which to show details.<br><br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `36`, *Pattern*: `^[A-Z0-9]+$` |
| `fields` | `String` | Query, Optional | A comma-separated list of fields that should be returned for the order. Valid filter field is `payment_source`.<br><br>**Constraints**: *Pattern*: `^[a-z_]*$` |

## Response Type

[`Order`](../../doc/models/order.md)

## Example Usage

```java
OrdersGetInput ordersGetInput = new OrdersGetInput.Builder(
    "id0"
)
.build();

ordersController.ordersGetAsync(ordersGetInput).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 401 | Authentication failed due to missing authorization header, or invalid authentication credentials. | [`ErrorException`](../../doc/models/error-exception.md) |
| 404 | The specified resource does not exist. | [`ErrorException`](../../doc/models/error-exception.md) |
| Default | The error response. | [`ErrorException`](../../doc/models/error-exception.md) |


# Orders Patch

Updates an order with a `CREATED` or `APPROVED` status. You cannot update an order with the `COMPLETED` status.<br/><br/>To make an update, you must provide a `reference_id`. If you omit this value with an order that contains only one purchase unit, PayPal sets the value to `default` which enables you to use the path: <code>\"/purchase_units/@reference_id=='default'/{attribute-or-object}\"</code>. Merchants and partners can add Level 2 and 3 data to payments to reduce risk and payment processing costs. For more information about processing payments, see <a href="https://developer.paypal.com/docs/checkout/advanced/processing/">checkout</a> or <a href="https://developer.paypal.com/docs/multiparty/checkout/advanced/processing/">multiparty checkout</a>.<blockquote><strong>Note:</strong> For error handling and troubleshooting, see <a href=\"/api/rest/reference/orders/v2/errors/#patch-order\">Orders v2 errors</a>.</blockquote>Patchable attributes or objects:<br/><br/><table><thead><th>Attribute</th><th>Op</th><th>Notes</th></thead><tbody><tr><td><code>intent</code></td><td>replace</td><td></td></tr><tr><td><code>payer</code></td><td>replace, add</td><td>Using replace op for <code>payer</code> will replace the whole <code>payer</code> object with the value sent in request.</td></tr><tr><td><code>purchase_units</code></td><td>replace, add</td><td></td></tr><tr><td><code>purchase_units[].custom_id</code></td><td>replace, add, remove</td><td></td></tr><tr><td><code>purchase_units[].description</code></td><td>replace, add, remove</td><td></td></tr><tr><td><code>purchase_units[].payee.email</code></td><td>replace</td><td></td></tr><tr><td><code>purchase_units[].shipping.name</code></td><td>replace, add</td><td></td></tr><tr><td><code>purchase_units[].shipping.email_address</code></td><td>replace, add</td><td></td></tr><tr><td><code>purchase_units[].shipping.phone_number</code></td><td>replace, add</td><td></td></tr><tr><td><code>purchase_units[].shipping.options</code></td><td>replace, add</td><td></td></tr><tr><td><code>purchase_units[].shipping.address</code></td><td>replace, add</td><td></td></tr><tr><td><code>purchase_units[].shipping.type</code></td><td>replace, add</td><td></td></tr><tr><td><code>purchase_units[].soft_descriptor</code></td><td>replace, remove</td><td></td></tr><tr><td><code>purchase_units[].amount</code></td><td>replace</td><td></td></tr><tr><td><code>purchase_units[].items</code></td><td>replace, add, remove</td><td></td></tr><tr><td><code>purchase_units[].invoice_id</code></td><td>replace, add, remove</td><td></td></tr><tr><td><code>purchase_units[].payment_instruction</code></td><td>replace</td><td></td></tr><tr><td><code>purchase_units[].payment_instruction.disbursement_mode</code></td><td>replace</td><td>By default, <code>disbursement_mode</code> is <code>INSTANT</code>.</td></tr><tr><td><code>purchase_units[].payment_instruction.payee_receivable_fx_rate_id</code></td><td>replace, add, remove</td><td></td></tr><tr><td><code>purchase_units[].payment_instruction.platform_fees</code></td><td>replace, add, remove</td><td></td></tr><tr><td><code>purchase_units[].supplementary_data.airline</code></td><td>replace, add, remove</td><td></td></tr><tr><td><code>purchase_units[].supplementary_data.card</code></td><td>replace, add, remove</td><td></td></tr><tr><td><code>application_context.client_configuration</code></td><td>replace, add</td><td></td></tr></tbody></table>

```java
CompletableFuture<Void> ordersPatchAsync(
    final OrdersPatchInput input)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `id` | `String` | Template, Required | The ID of the order to update.<br><br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `36`, *Pattern*: `^[A-Z0-9]+$` |
| `body` | [`List<Patch>`](../../doc/models/patch.md) | Body, Optional | - |

## Response Type

`void`

## Example Usage

```java
OrdersPatchInput ordersPatchInput = new OrdersPatchInput.Builder(
    "id0",
    null
)
.body(Arrays.asList(
        new Patch.Builder(
            PatchOp.ADD
        )
        .build()
    ))
.build();

ordersController.ordersPatchAsync(ordersPatchInput).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 400 | Request is not well-formed, syntactically incorrect, or violates schema. | [`ErrorException`](../../doc/models/error-exception.md) |
| 401 | Authentication failed due to missing authorization header, or invalid authentication credentials. | [`ErrorException`](../../doc/models/error-exception.md) |
| 404 | The specified resource does not exist. | [`ErrorException`](../../doc/models/error-exception.md) |
| 422 | The requested action could not be performed, semantically incorrect, or failed business validation. | [`ErrorException`](../../doc/models/error-exception.md) |
| Default | The error response. | [`ErrorException`](../../doc/models/error-exception.md) |


# Orders Confirm

Payer confirms their intent to pay for the the Order with the given payment source.

```java
CompletableFuture<Order> ordersConfirmAsync(
    final OrdersConfirmInput input)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `id` | `String` | Template, Required | The ID of the order for which the payer confirms their intent to pay.<br><br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `36`, *Pattern*: `^[A-Z0-9]+$` |
| `payPalClientMetadataId` | `String` | Header, Optional | **Constraints**: *Minimum Length*: `1`, *Maximum Length*: `36` |
| `prefer` | `String` | Header, Optional | The preferred server response upon successful completion of the request. Value is:<ul><li><code>return=minimal</code>. The server returns a minimal response to optimize communication between the API caller and the server. A minimal response includes the <code>id</code>, <code>status</code> and HATEOAS links.</li><li><code>return=representation</code>. The server returns a complete resource representation, including the current state of the resource.</li></ul><br><br>**Default**: `"return=minimal"`<br><br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `25`, *Pattern*: `^[a-zA-Z=]*$` |
| `body` | [`ConfirmOrderRequest`](../../doc/models/confirm-order-request.md) | Body, Optional | - |

## Response Type

[`Order`](../../doc/models/order.md)

## Example Usage

```java
OrdersConfirmInput ordersConfirmInput = new OrdersConfirmInput.Builder(
    "id0",
    null
)
.prefer("return=minimal")
.body(new ConfirmOrderRequest.Builder(
        new PaymentSource.Builder()
            .build()
    )
    .processingInstruction(ProcessingInstruction.NO_INSTRUCTION)
    .build())
.build();

ordersController.ordersConfirmAsync(ordersConfirmInput).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 400 | Request is not well-formed, syntactically incorrect, or violates schema. | [`ErrorException`](../../doc/models/error-exception.md) |
| 403 | Authorization failed due to insufficient permissions. | [`ErrorException`](../../doc/models/error-exception.md) |
| 422 | The requested action could not be performed, semantically incorrect, or failed business validation. | [`ErrorException`](../../doc/models/error-exception.md) |
| 500 | An internal server error has occurred. | [`ErrorException`](../../doc/models/error-exception.md) |
| Default | The error response. | [`ErrorException`](../../doc/models/error-exception.md) |


# Orders Authorize

Authorizes payment for an order. To successfully authorize payment for an order, the buyer must first approve the order or a valid payment_source must be provided in the request. A buyer can approve the order upon being redirected to the rel:approve URL that was returned in the HATEOAS links in the create order response.<blockquote><strong>Note:</strong> For error handling and troubleshooting, see <a href="/api/rest/reference/orders/v2/errors/#authorize-order">Orders v2 errors</a>.</blockquote>

```java
CompletableFuture<OrderAuthorizeResponse> ordersAuthorizeAsync(
    final OrdersAuthorizeInput input)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `id` | `String` | Template, Required | The ID of the order for which to authorize.<br><br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `36`, *Pattern*: `^[A-Z0-9]+$` |
| `payPalRequestId` | `String` | Header, Optional | The server stores keys for 6 hours. The API callers can request the times to up to 72 hours by speaking to their Account Manager.<br><br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `108` |
| `prefer` | `String` | Header, Optional | The preferred server response upon successful completion of the request. Value is:<ul><li><code>return=minimal</code>. The server returns a minimal response to optimize communication between the API caller and the server. A minimal response includes the <code>id</code>, <code>status</code> and HATEOAS links.</li><li><code>return=representation</code>. The server returns a complete resource representation, including the current state of the resource.</li></ul><br><br>**Default**: `"return=minimal"`<br><br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `25`, *Pattern*: `^[a-zA-Z=,-]*$` |
| `payPalClientMetadataId` | `String` | Header, Optional | **Constraints**: *Minimum Length*: `1`, *Maximum Length*: `36` |
| `payPalAuthAssertion` | `String` | Header, Optional | An API-caller-provided JSON Web Token (JWT) assertion that identifies the merchant. For details, see <a href="/api/rest/requests/#paypal-auth-assertion">PayPal-Auth-Assertion</a>. |
| `body` | [`OrderAuthorizeRequest`](../../doc/models/order-authorize-request.md) | Body, Optional | - |

## Response Type

[`OrderAuthorizeResponse`](../../doc/models/order-authorize-response.md)

## Example Usage

```java
OrdersAuthorizeInput ordersAuthorizeInput = new OrdersAuthorizeInput.Builder(
    "id0",
    null
)
.prefer("return=minimal")
.build();

ordersController.ordersAuthorizeAsync(ordersAuthorizeInput).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 400 | Request is not well-formed, syntactically incorrect, or violates schema. | [`ErrorException`](../../doc/models/error-exception.md) |
| 401 | Authentication failed due to missing authorization header, or invalid authentication credentials. | [`ErrorException`](../../doc/models/error-exception.md) |
| 403 | The authorized payment failed due to insufficient permissions. | [`ErrorException`](../../doc/models/error-exception.md) |
| 404 | The specified resource does not exist. | [`ErrorException`](../../doc/models/error-exception.md) |
| 422 | The requested action could not be performed, semantically incorrect, or failed business validation. | [`ErrorException`](../../doc/models/error-exception.md) |
| 500 | An internal server error has occurred. | [`ErrorException`](../../doc/models/error-exception.md) |
| Default | The error response. | [`ErrorException`](../../doc/models/error-exception.md) |


# Orders Capture

Captures payment for an order. To successfully capture payment for an order, the buyer must first approve the order or a valid payment_source must be provided in the request. A buyer can approve the order upon being redirected to the rel:approve URL that was returned in the HATEOAS links in the create order response.<blockquote><strong>Note:</strong> For error handling and troubleshooting, see <a href="/api/rest/reference/orders/v2/errors/#capture-order">Orders v2 errors</a>.</blockquote>

```java
CompletableFuture<Order> ordersCaptureAsync(
    final OrdersCaptureInput input)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `id` | `String` | Template, Required | The ID of the order for which to capture a payment.<br><br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `36`, *Pattern*: `^[A-Z0-9]+$` |
| `payPalRequestId` | `String` | Header, Optional | The server stores keys for 6 hours. The API callers can request the times to up to 72 hours by speaking to their Account Manager.<br><br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `108` |
| `prefer` | `String` | Header, Optional | The preferred server response upon successful completion of the request. Value is:<ul><li><code>return=minimal</code>. The server returns a minimal response to optimize communication between the API caller and the server. A minimal response includes the <code>id</code>, <code>status</code> and HATEOAS links.</li><li><code>return=representation</code>. The server returns a complete resource representation, including the current state of the resource.</li></ul><br><br>**Default**: `"return=minimal"`<br><br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `25`, *Pattern*: `^[a-zA-Z=,-]*$` |
| `payPalClientMetadataId` | `String` | Header, Optional | **Constraints**: *Minimum Length*: `1`, *Maximum Length*: `36` |
| `payPalAuthAssertion` | `String` | Header, Optional | An API-caller-provided JSON Web Token (JWT) assertion that identifies the merchant. For details, see <a href="/api/rest/requests/#paypal-auth-assertion">PayPal-Auth-Assertion</a>. |
| `body` | [`OrderCaptureRequest`](../../doc/models/order-capture-request.md) | Body, Optional | - |

## Response Type

[`Order`](../../doc/models/order.md)

## Example Usage

```java
OrdersCaptureInput ordersCaptureInput = new OrdersCaptureInput.Builder(
    "id0",
    null
)
.prefer("return=minimal")
.build();

ordersController.ordersCaptureAsync(ordersCaptureInput).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 400 | Request is not well-formed, syntactically incorrect, or violates schema. | [`ErrorException`](../../doc/models/error-exception.md) |
| 401 | Authentication failed due to missing authorization header, or invalid authentication credentials. | [`ErrorException`](../../doc/models/error-exception.md) |
| 403 | The authorized payment failed due to insufficient permissions. | [`ErrorException`](../../doc/models/error-exception.md) |
| 404 | The specified resource does not exist. | [`ErrorException`](../../doc/models/error-exception.md) |
| 422 | The requested action could not be performed, semantically incorrect, or failed business validation. | [`ErrorException`](../../doc/models/error-exception.md) |
| 500 | An internal server error has occurred. | [`ErrorException`](../../doc/models/error-exception.md) |
| Default | The error response. | [`ErrorException`](../../doc/models/error-exception.md) |


# Orders Track Create

Adds tracking information for an Order.

```java
CompletableFuture<Order> ordersTrackCreateAsync(
    final OrdersTrackCreateInput input)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `id` | `String` | Template, Required | The ID of the order that the tracking information is associated with.<br><br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `36`, *Pattern*: `^[A-Z0-9]+$` |
| `body` | [`OrderTrackerRequest`](../../doc/models/order-tracker-request.md) | Body, Required | - |
| `payPalAuthAssertion` | `String` | Header, Optional | An API-caller-provided JSON Web Token (JWT) assertion that identifies the merchant. For details, see <a href="/api/rest/requests/#paypal-auth-assertion">PayPal-Auth-Assertion</a>. |

## Response Type

[`Order`](../../doc/models/order.md)

## Example Usage

```java
OrdersTrackCreateInput ordersTrackCreateInput = new OrdersTrackCreateInput.Builder(
    "id0",
    null,
    new OrderTrackerRequest.Builder(
        "capture_id8"
    )
    .notifyPayer(false)
    .build()
)
.build();

ordersController.ordersTrackCreateAsync(ordersTrackCreateInput).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 400 | Request is not well-formed, syntactically incorrect, or violates schema. | [`ErrorException`](../../doc/models/error-exception.md) |
| 403 | Authorization failed due to insufficient permissions. | [`ErrorException`](../../doc/models/error-exception.md) |
| 404 | The specified resource does not exist. | [`ErrorException`](../../doc/models/error-exception.md) |
| 422 | The requested action could not be performed, semantically incorrect, or failed business validation. | [`ErrorException`](../../doc/models/error-exception.md) |
| 500 | An internal server error has occurred. | [`ErrorException`](../../doc/models/error-exception.md) |
| Default | The error response. | [`ErrorException`](../../doc/models/error-exception.md) |


# Orders Trackers Patch

Updates or cancels the tracking information for a PayPal order, by ID. Updatable attributes or objects:<br/><br/><table><thead><th>Attribute</th><th>Op</th><th>Notes</th></thead><tbody></tr><tr><td><code>items</code></td><td>replace</td><td>Using replace op for <code>items</code> will replace the entire <code>items</code> object with the value sent in request.</td></tr><tr><td><code>notify_payer</code></td><td>replace, add</td><td></td></tr><tr><td><code>status</code></td><td>replace</td><td>Only patching status to CANCELLED is currently supported.</td></tr></tbody></table>

```java
CompletableFuture<Void> ordersTrackersPatchAsync(
    final OrdersTrackersPatchInput input)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `id` | `String` | Template, Required | The ID of the order that the tracking information is associated with.<br><br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `36`, *Pattern*: `^[A-Z0-9]+$` |
| `trackerId` | `String` | Template, Required | The order tracking ID.<br><br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `36`, *Pattern*: `^[A-Z0-9]+$` |
| `body` | [`List<Patch>`](../../doc/models/patch.md) | Body, Optional | - |

## Response Type

`void`

## Example Usage

```java
OrdersTrackersPatchInput ordersTrackersPatchInput = new OrdersTrackersPatchInput.Builder(
    "id0",
    "tracker_id2",
    null
)
.body(Arrays.asList(
        new Patch.Builder(
            PatchOp.ADD
        )
        .build()
    ))
.build();

ordersController.ordersTrackersPatchAsync(ordersTrackersPatchInput).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 400 | Request is not well-formed, syntactically incorrect, or violates schema. | [`ErrorException`](../../doc/models/error-exception.md) |
| 403 | Authorization failed due to insufficient permissions. | [`ErrorException`](../../doc/models/error-exception.md) |
| 404 | The specified resource does not exist. | [`ErrorException`](../../doc/models/error-exception.md) |
| 422 | The requested action could not be performed, semantically incorrect, or failed business validation. | [`ErrorException`](../../doc/models/error-exception.md) |
| 500 | An internal server error has occurred. | [`ErrorException`](../../doc/models/error-exception.md) |
| Default | The error response. | [`ErrorException`](../../doc/models/error-exception.md) |

