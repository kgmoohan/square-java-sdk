# Checkout

```java
CheckoutApi checkoutApi = client.getCheckoutApi();
```

## Class Name

`CheckoutApi`

## Create Checkout

Links a `checkoutId` to a `checkout_page_url` that customers will
be directed to in order to provide their payment information using a
payment processing workflow hosted on connect.squareup.com.

```java
CompletableFuture<CreateCheckoutResponse> createCheckoutAsync(
    final String locationId,
    final CreateCheckoutRequest body)
```

### Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `locationId` | `String` | Template, Required | The ID of the business location to associate the checkout with. |
| `body` | [`CreateCheckoutRequest`](/doc/models/create-checkout-request.md) | Body, Required | An object containing the fields to POST for the request.<br><br>See the corresponding object definition for field details. |

### Response Type

[`CreateCheckoutResponse`](/doc/models/create-checkout-response.md)

### Example Usage

```java
String locationId = "location_id4";
List<OrderLineItem> bodyOrderOrderLineItems = new LinkedList<>();

List<OrderLineItemAppliedTax> bodyOrderOrderLineItems0AppliedTaxes = new LinkedList<>();

OrderLineItemAppliedTax bodyOrderOrderLineItems0AppliedTaxes0 = new OrderLineItemAppliedTax.Builder(
        "38ze1696-z1e3-5628-af6d-f1e04d947fg3")
    .build();
bodyOrderOrderLineItems0AppliedTaxes.add(bodyOrderOrderLineItems0AppliedTaxes0);

List<OrderLineItemAppliedDiscount> bodyOrderOrderLineItems0AppliedDiscounts = new LinkedList<>();

OrderLineItemAppliedDiscount bodyOrderOrderLineItems0AppliedDiscounts0 = new OrderLineItemAppliedDiscount.Builder(
        "56ae1696-z1e3-9328-af6d-f1e04d947gd4")
    .build();
bodyOrderOrderLineItems0AppliedDiscounts.add(bodyOrderOrderLineItems0AppliedDiscounts0);

Money bodyOrderOrderLineItems0BasePriceMoney = new Money.Builder()
    .amount(1500L)
    .currency("USD")
    .build();
OrderLineItem bodyOrderOrderLineItems0 = new OrderLineItem.Builder(
        "2")
    .name("Printed T Shirt")
    .appliedTaxes(bodyOrderOrderLineItems0AppliedTaxes)
    .appliedDiscounts(bodyOrderOrderLineItems0AppliedDiscounts)
    .basePriceMoney(bodyOrderOrderLineItems0BasePriceMoney)
    .build();
bodyOrderOrderLineItems.add(bodyOrderOrderLineItems0);

Money bodyOrderOrderLineItems1BasePriceMoney = new Money.Builder()
    .amount(2500L)
    .currency("USD")
    .build();
OrderLineItem bodyOrderOrderLineItems1 = new OrderLineItem.Builder(
        "1")
    .name("Slim Jeans")
    .basePriceMoney(bodyOrderOrderLineItems1BasePriceMoney)
    .build();
bodyOrderOrderLineItems.add(bodyOrderOrderLineItems1);

Money bodyOrderOrderLineItems2BasePriceMoney = new Money.Builder()
    .amount(3500L)
    .currency("USD")
    .build();
OrderLineItem bodyOrderOrderLineItems2 = new OrderLineItem.Builder(
        "3")
    .name("Woven Sweater")
    .basePriceMoney(bodyOrderOrderLineItems2BasePriceMoney)
    .build();
bodyOrderOrderLineItems.add(bodyOrderOrderLineItems2);

List<OrderLineItemTax> bodyOrderOrderTaxes = new LinkedList<>();

OrderLineItemTax bodyOrderOrderTaxes0 = new OrderLineItemTax.Builder()
    .uid("38ze1696-z1e3-5628-af6d-f1e04d947fg3")
    .type("INCLUSIVE")
    .percentage("7.75")
    .scope("LINE_ITEM")
    .build();
bodyOrderOrderTaxes.add(bodyOrderOrderTaxes0);

List<OrderLineItemDiscount> bodyOrderOrderDiscounts = new LinkedList<>();

Money bodyOrderOrderDiscounts0AmountMoney = new Money.Builder()
    .amount(100L)
    .currency("USD")
    .build();
OrderLineItemDiscount bodyOrderOrderDiscounts0 = new OrderLineItemDiscount.Builder()
    .uid("56ae1696-z1e3-9328-af6d-f1e04d947gd4")
    .type("FIXED_AMOUNT")
    .amountMoney(bodyOrderOrderDiscounts0AmountMoney)
    .scope("LINE_ITEM")
    .build();
bodyOrderOrderDiscounts.add(bodyOrderOrderDiscounts0);

Order bodyOrderOrder = new Order.Builder(
        "location_id")
    .referenceId("reference_id")
    .customerId("customer_id")
    .lineItems(bodyOrderOrderLineItems)
    .taxes(bodyOrderOrderTaxes)
    .discounts(bodyOrderOrderDiscounts)
    .build();
CreateOrderRequest bodyOrder = new CreateOrderRequest.Builder()
    .order(bodyOrderOrder)
    .idempotencyKey("12ae1696-z1e3-4328-af6d-f1e04d947gd4")
    .build();
Address bodyPrePopulateShippingAddress = new Address.Builder()
    .addressLine1("1455 Market St.")
    .addressLine2("Suite 600")
    .locality("San Francisco")
    .administrativeDistrictLevel1("CA")
    .postalCode("94103")
    .country("US")
    .firstName("Jane")
    .lastName("Doe")
    .build();
List<ChargeRequestAdditionalRecipient> bodyAdditionalRecipients = new LinkedList<>();

Money bodyAdditionalRecipients0AmountMoney = new Money.Builder()
    .amount(60L)
    .currency("USD")
    .build();
ChargeRequestAdditionalRecipient bodyAdditionalRecipients0 = new ChargeRequestAdditionalRecipient.Builder(
        "057P5VYJ4A5X1",
        "Application fees",
        bodyAdditionalRecipients0AmountMoney)
    .build();
bodyAdditionalRecipients.add(bodyAdditionalRecipients0);

CreateCheckoutRequest body = new CreateCheckoutRequest.Builder(
        "86ae1696-b1e3-4328-af6d-f1e04d947ad6",
        bodyOrder)
    .askForShippingAddress(true)
    .merchantSupportEmail("merchant+support@website.com")
    .prePopulateBuyerEmail("example@email.com")
    .prePopulateShippingAddress(bodyPrePopulateShippingAddress)
    .redirectUrl("https://merchant.website.com/order-confirm")
    .additionalRecipients(bodyAdditionalRecipients)
    .build();

checkoutApi.createCheckoutAsync(locationId, body).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

