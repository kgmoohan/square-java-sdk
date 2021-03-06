## List Device Codes Request

### Structure

`ListDeviceCodesRequest`

### Fields

| Name | Type | Tags | Description |
|  --- | --- | --- | --- |
| `Cursor` | `String` | Optional | A pagination cursor returned by a previous call to this endpoint.<br>Provide this to retrieve the next set of results for your original query.<br><br>See [Paginating results](#paginatingresults) for more information. |
| `LocationId` | `String` | Optional | If specified, only returns DeviceCodes of the specified location.<br>Returns DeviceCodes of all locations if empty. |
| `ProductType` | [`String`](/doc/models/product-type.md) | Optional | - |

### Example (as JSON)

```json
{}
```

