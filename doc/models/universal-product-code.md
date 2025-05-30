
# Universal Product Code

The Universal Product Code of the item.

## Structure

`UniversalProductCode`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Type` | [`UPCType`](../../doc/models/upc-type.md) | Required | The Universal Product Code type.<br><br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `5`, *Pattern*: `^[0-9A-Z_-]+$` | UPCType getType() | setType(UPCType type) |
| `Code` | `String` | Required | The UPC product code of the item.<br><br>**Constraints**: *Minimum Length*: `6`, *Maximum Length*: `17`, *Pattern*: `^[0-9]{0,17}$` | String getCode() | setCode(String code) |

## Example (as JSON)

```json
{
  "type": "UPC-E",
  "code": "code2"
}
```

