## Customer Filter

Represents a set of `CustomerQuery` filters used to limit the set of
`Customers` returned by `SearchCustomers`.

### Structure

`CustomerFilter`

### Fields

| Name | Type | Tags | Description |
|  --- | --- | --- | --- |
| `CreationSource` | [`CustomerCreationSourceFilter`](/doc/models/customer-creation-source-filter.md) | Optional | Creation source filter.<br><br>If one or more creation sources are set, customer profiles are included in,<br>or excluded from, the result if they match at least one of the filter<br>criteria. |
| `CreatedAt` | [`TimeRange`](/doc/models/time-range.md) | Optional | Represents a generic time range. The start and end values are<br>represented in RFC-3339 format. Time ranges are customized to be<br>inclusive or exclusive based on the needs of a particular endpoint.<br>Refer to the relevent endpoint-specific documentation to determine<br>how time ranges are handled. |
| `UpdatedAt` | [`TimeRange`](/doc/models/time-range.md) | Optional | Represents a generic time range. The start and end values are<br>represented in RFC-3339 format. Time ranges are customized to be<br>inclusive or exclusive based on the needs of a particular endpoint.<br>Refer to the relevent endpoint-specific documentation to determine<br>how time ranges are handled. |
| `EmailAddress` | [`CustomerTextFilter`](/doc/models/customer-text-filter.md) | Optional | A filter to select customers based on exact or fuzzy matching of<br>customer attributes against a specified query. Depending on customer attributes, <br>the filter can be case sensitive. This filter can be either exact or fuzzy. It cannot be both. |
| `PhoneNumber` | [`CustomerTextFilter`](/doc/models/customer-text-filter.md) | Optional | A filter to select customers based on exact or fuzzy matching of<br>customer attributes against a specified query. Depending on customer attributes, <br>the filter can be case sensitive. This filter can be either exact or fuzzy. It cannot be both. |
| `ReferenceId` | [`CustomerTextFilter`](/doc/models/customer-text-filter.md) | Optional | A filter to select customers based on exact or fuzzy matching of<br>customer attributes against a specified query. Depending on customer attributes, <br>the filter can be case sensitive. This filter can be either exact or fuzzy. It cannot be both. |
| `GroupIds` | [`FilterValue`](/doc/models/filter-value.md) | Optional | A filter to select resources based on an exact field value. For any given<br>value, the value can only be in one property. Depending on the field, either<br>all properties can be set or only a subset will be available.<br><br>Refer to the documentation of the field. |

### Example (as JSON)

```json
{
  "creation_source": null,
  "created_at": null,
  "updated_at": null,
  "email_address": null,
  "phone_number": null,
  "reference_id": null,
  "group_ids": null
}
```

