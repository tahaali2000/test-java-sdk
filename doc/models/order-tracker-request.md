
# Order Tracker Request

The tracking details of an order.

## Structure

`OrderTrackerRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `TrackingNumber` | `String` | Optional | The tracking number for the shipment. This property supports Unicode.<br><br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `64` | String getTrackingNumber() | setTrackingNumber(String trackingNumber) |
| `Carrier` | [`ShipmentCarrier`](../../doc/models/shipment-carrier.md) | Optional | The carrier for the shipment. Some carriers have a global version as well as local subsidiaries. The subsidiaries are repeated over many countries and might also have an entry in the global list. Choose the carrier for your country. If the carrier is not available for your country, choose the global version of the carrier. If your carrier name is not in the list, set `carrier` to `OTHER` and set carrier name in `carrier_name_other`. For allowed values, see <a href="/docs/tracking/reference/carriers/">Carriers</a>.<br><br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `64`, *Pattern*: `^[0-9A-Z_]+$` | ShipmentCarrier getCarrier() | setCarrier(ShipmentCarrier carrier) |
| `CarrierNameOther` | `String` | Optional | The name of the carrier for the shipment. Provide this value only if the carrier parameter is OTHER. This property supports Unicode.<br><br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `64` | String getCarrierNameOther() | setCarrierNameOther(String carrierNameOther) |
| `CaptureId` | `String` | Required | The PayPal capture ID.<br><br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `50`, *Pattern*: `^[a-zA-Z0-9]*$` | String getCaptureId() | setCaptureId(String captureId) |
| `NotifyPayer` | `Boolean` | Optional | If true, sends an email notification to the payer of the PayPal transaction. The email contains the tracking information that was uploaded through the API.<br><br>**Default**: `false` | Boolean getNotifyPayer() | setNotifyPayer(Boolean notifyPayer) |
| `Items` | [`List<OrderTrackerItem>`](../../doc/models/order-tracker-item.md) | Optional | An array of details of items in the shipment. | List<OrderTrackerItem> getItems() | setItems(List<OrderTrackerItem> items) |

## Example (as JSON)

```json
{
  "capture_id": "capture_id0",
  "notify_payer": false,
  "tracking_number": "tracking_number6",
  "carrier": "SNTGLOBAL_API",
  "carrier_name_other": "carrier_name_other0",
  "items": [
    {
      "name": "name8",
      "quantity": "quantity4",
      "sku": "sku6",
      "url": "url2",
      "image_url": "image_url4"
    },
    {
      "name": "name8",
      "quantity": "quantity4",
      "sku": "sku6",
      "url": "url2",
      "image_url": "image_url4"
    }
  ]
}
```

