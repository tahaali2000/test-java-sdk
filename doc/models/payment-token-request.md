
# Payment Token Request

Payment Token Request where the `source` defines the type of instrument to be stored.

## Structure

`PaymentTokenRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Customer` | [`CustomerRequest`](../../doc/models/customer-request.md) | Optional | Customer in merchant's or partner's system of records. | CustomerRequest getCustomer() | setCustomer(CustomerRequest customer) |
| `PaymentSource` | [`PaymentTokenRequestPaymentSource`](../../doc/models/payment-token-request-payment-source.md) | Required | The payment method to vault with the instrument details. | PaymentTokenRequestPaymentSource getPaymentSource() | setPaymentSource(PaymentTokenRequestPaymentSource paymentSource) |

## Example (as JSON)

```json
{
  "customer": {
    "id": "id0",
    "merchant_customer_id": "merchant_customer_id2"
  },
  "payment_source": {
    "card": {
      "name": "name6",
      "number": "number6",
      "expiry": "expiry4",
      "security_code": "security_code8",
      "type": "UNKNOWN"
    },
    "token": {
      "id": "id6",
      "type": "BILLING_AGREEMENT"
    }
  }
}
```

