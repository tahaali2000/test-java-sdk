
# Network Transaction Reference

Reference values used by the card network to identify a transaction.

## Structure

`NetworkTransactionReference`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `String` | Required | Transaction reference id returned by the scheme. For Visa and Amex, this is the "Tran id" field in response. For MasterCard, this is the "BankNet reference id" field in response. For Discover, this is the "NRID" field in response. The pattern we expect for this field from Visa/Amex/CB/Discover is numeric, Mastercard/BNPP is alphanumeric and Paysecure is alphanumeric with special character -.<br><br>**Constraints**: *Minimum Length*: `9`, *Maximum Length*: `36`, *Pattern*: `^[a-zA-Z0-9-_@.:&+=*^'~#!$%()]+$` | String getId() | setId(String id) |
| `Date` | `String` | Optional | The date that the transaction was authorized by the scheme. This field may not be returned for all networks. MasterCard refers to this field as "BankNet reference date.<br><br>**Constraints**: *Minimum Length*: `4`, *Maximum Length*: `4`, *Pattern*: `^[0-9]+$` | String getDate() | setDate(String date) |
| `Network` | [`CardBrand`](../../doc/models/card-brand.md) | Optional | The card network or brand. Applies to credit, debit, gift, and payment cards.<br><br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `255`, *Pattern*: `^[A-Z_]+$` | CardBrand getNetwork() | setNetwork(CardBrand network) |
| `AcquirerReferenceNumber` | `String` | Optional | Reference ID issued for the card transaction. This ID can be used to track the transaction across processors, card brands and issuing banks.<br><br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `36`, *Pattern*: `^[a-zA-Z0-9]+$` | String getAcquirerReferenceNumber() | setAcquirerReferenceNumber(String acquirerReferenceNumber) |

## Example (as JSON)

```json
{
  "id": "id6",
  "date": "date8",
  "network": "CB_NATIONALE",
  "acquirer_reference_number": "acquirer_reference_number2"
}
```

