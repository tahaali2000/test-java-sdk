
# Vault Instruction Base

Basic vault instruction specification that can be extended by specific payment sources that supports vaulting.

## Structure

`VaultInstructionBase`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `StoreInVault` | [`StoreInVaultInstruction`](../../doc/models/store-in-vault-instruction.md) | Optional | Defines how and when the payment source gets vaulted.<br><br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `255`, *Pattern*: `^[0-9A-Z_]+$` | StoreInVaultInstruction getStoreInVault() | setStoreInVault(StoreInVaultInstruction storeInVault) |

## Example (as JSON)

```json
{
  "store_in_vault": "ON_SUCCESS"
}
```

