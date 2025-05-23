
# Setup Token Response

Minimal representation of a cached setup token.

## Structure

`SetupTokenResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `String` | Optional | The PayPal-generated ID for the vault token.<br><br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `36`, *Pattern*: `^[0-9a-zA-Z_-]+$` | String getId() | setId(String id) |
| `Ordinal` | `Integer` | Optional | Ordinal number for sorting.<br><br>**Constraints**: `>= 1`, `<= 99` | Integer getOrdinal() | setOrdinal(Integer ordinal) |
| `Customer` | [`CustomerRequest`](../../doc/models/customer-request.md) | Optional | Customer in merchant's or partner's system of records. | CustomerRequest getCustomer() | setCustomer(CustomerRequest customer) |
| `Status` | `String` | Optional | The status of the payment token.<br><br>**Default**: `"CREATED"`<br><br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `255`, *Pattern*: `^[0-9A-Z_]+$` | String getStatus() | setStatus(String status) |
| `PaymentSource` | [`SetupTokenResponsePaymentSource`](../../doc/models/setup-token-response-payment-source.md) | Optional | The setup payment method details. | SetupTokenResponsePaymentSource getPaymentSource() | setPaymentSource(SetupTokenResponsePaymentSource paymentSource) |
| `Links` | [`List<LinkDescription>`](../../doc/models/link-description.md) | Optional | An array of related [HATEOAS links](/api/rest/responses/#hateoas).<br><br>**Constraints**: *Minimum Items*: `1`, *Maximum Items*: `32` | List<LinkDescription> getLinks() | setLinks(List<LinkDescription> links) |

## Example (as JSON)

```json
{
  "status": "CREATED",
  "id": "id6",
  "ordinal": 1,
  "customer": {
    "id": "id0",
    "merchant_customer_id": "merchant_customer_id2"
  },
  "payment_source": {
    "card": {
      "name": "name6",
      "last_digits": "last_digits0",
      "brand": "SYNCHRONY",
      "expiry": "expiry4",
      "billing_address": {
        "address_line_1": "address_line_12",
        "address_line_2": "address_line_28",
        "admin_area_2": "admin_area_28",
        "admin_area_1": "admin_area_14",
        "postal_code": "postal_code0",
        "country_code": "country_code8"
      }
    },
    "paypal": {
      "description": "description2",
      "shipping": {
        "name": {
          "full_name": "full_name6"
        },
        "type": "SHIPPING",
        "address": {
          "address_line_1": "address_line_16",
          "address_line_2": "address_line_26",
          "admin_area_2": "admin_area_20",
          "admin_area_1": "admin_area_12",
          "postal_code": "postal_code8",
          "country_code": "country_code6"
        }
      },
      "permit_multiple_payment_tokens": false,
      "usage_type": "usage_type2",
      "customer_type": "customer_type6"
    },
    "venmo": {
      "description": "description6",
      "shipping": {
        "name": {
          "full_name": "full_name6"
        },
        "type": "SHIPPING",
        "address": {
          "address_line_1": "address_line_16",
          "address_line_2": "address_line_26",
          "admin_area_2": "admin_area_20",
          "admin_area_1": "admin_area_12",
          "postal_code": "postal_code8",
          "country_code": "country_code6"
        }
      },
      "permit_multiple_payment_tokens": false,
      "usage_type": "usage_type6",
      "customer_type": "customer_type0"
    }
  }
}
```

