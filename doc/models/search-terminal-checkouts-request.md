## Search Terminal Checkouts Request

### Structure

`SearchTerminalCheckoutsRequest`

### Fields

| Name | Type | Tags | Description |
|  --- | --- | --- | --- |
| `Query` | [`TerminalCheckoutQuery`](/doc/models/terminal-checkout-query.md) | Optional | - |
| `Cursor` | `String` | Optional | A pagination cursor returned by a previous call to this endpoint.<br>Provide this to retrieve the next set of results for the original query. |
| `Limit` | `Integer` | Optional | Limit the number of results returned for a single request. |

### Example (as JSON)

```json
{
  "limit": 2,
  "query": {
    "filter": {
      "status": "COMPLETED"
    }
  }
}
```

