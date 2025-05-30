
# Patch

The JSON patch object to apply partial updates to resources.

## Structure

`Patch`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Op` | [`PatchOp`](../../doc/models/patch-op.md) | Required | The operation. | PatchOp getOp() | setOp(PatchOp op) |
| `Path` | `String` | Optional | The <a href="https://tools.ietf.org/html/rfc6901">JSON Pointer</a> to the target document location at which to complete the operation. | String getPath() | setPath(String path) |
| `Value` | `Object` | Optional | The value to apply. The <code>remove</code>, <code>copy</code>, and <code>move</code> operations do not require a value. Since <a href="https://www.rfc-editor.org/rfc/rfc69021">JSON Patch</a> allows any type for <code>value</code>, the <code>type</code> property is not specified. | Object getValue() | setValue(Object value) |
| `From` | `String` | Optional | The <a href="https://tools.ietf.org/html/rfc6901">JSON Pointer</a> to the target document location from which to move the value. Required for the <code>move</code> operation. | String getFrom() | setFrom(String from) |

## Example (as JSON)

```json
{
  "op": "add",
  "path": "path6",
  "value": {
    "key1": "val1",
    "key2": "val2"
  },
  "from": "from0"
}
```

