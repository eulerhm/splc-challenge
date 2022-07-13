package com.woocommerce.android.model;

import java.lang.System;

@kotlinx.parcelize.Parcelize
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\bT\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\b\u0018\u0000 \u0095\u00012\u00020\u0001:\u0010\u0095\u0001\u0096\u0001\u0097\u0001\u0098\u0001\u0099\u0001\u009a\u0001\u009b\u0001\u009c\u0001B\u00af\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u000f\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\r\u0012\u0006\u0010\u0011\u001a\u00020\r\u0012\u0006\u0010\u0012\u001a\u00020\r\u0012\u0006\u0010\u0013\u001a\u00020\r\u0012\u0006\u0010\u0014\u001a\u00020\u0005\u0012\u0006\u0010\u0015\u001a\u00020\u0005\u0012\u0006\u0010\u0016\u001a\u00020\u0005\u0012\u0006\u0010\u0017\u001a\u00020\u0005\u0012\u0006\u0010\u0018\u001a\u00020\u0005\u0012\u0006\u0010\u0019\u001a\u00020\u0005\u0012\u0006\u0010\u001a\u001a\u00020\u001b\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\u0006\u0010\u001d\u001a\u00020\u001b\u0012\u0006\u0010\u001e\u001a\u00020\u001f\u0012\u0006\u0010 \u001a\u00020\u001f\u0012\f\u0010!\u001a\b\u0012\u0004\u0012\u00020#0\"\u0012\f\u0010$\u001a\b\u0012\u0004\u0012\u00020%0\"\u0012\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\'0\"\u0012\f\u0010(\u001a\b\u0012\u0004\u0012\u00020)0\"\u0012\f\u0010*\u001a\b\u0012\u0004\u0012\u00020+0\"\u0012\b\u0010,\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010-\u001a\u00020\u0005\u0012\u0006\u0010.\u001a\u00020\u0005\u0012\u0006\u0010/\u001a\u00020\u001b\u00a2\u0006\u0002\u00100J\t\u0010b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010c\u001a\u00020\rH\u00c6\u0003J\t\u0010d\u001a\u00020\rH\u00c6\u0003J\t\u0010e\u001a\u00020\rH\u00c6\u0003J\t\u0010f\u001a\u00020\rH\u00c6\u0003J\t\u0010g\u001a\u00020\u0005H\u00c6\u0003J\t\u0010h\u001a\u00020\u0005H\u00c6\u0003J\t\u0010i\u001a\u00020\u0005H\u00c6\u0003J\t\u0010j\u001a\u00020\u0005H\u00c6\u0003J\t\u0010k\u001a\u00020\u0005H\u00c6\u0003J\t\u0010l\u001a\u00020\u0005H\u00c6\u0003J\t\u0010m\u001a\u00020\u0005H\u00c6\u0003J\t\u0010n\u001a\u00020\u001bH\u00c6\u0003J\t\u0010o\u001a\u00020\u001bH\u00c6\u0003J\t\u0010p\u001a\u00020\u001bH\u00c6\u0003J\t\u0010q\u001a\u00020\u001fH\u00c6\u0003J\t\u0010r\u001a\u00020\u001fH\u00c6\u0003J\u000f\u0010s\u001a\b\u0012\u0004\u0012\u00020#0\"H\u00c6\u0003J\u000f\u0010t\u001a\b\u0012\u0004\u0012\u00020%0\"H\u00c6\u0003J\u000f\u0010u\u001a\b\u0012\u0004\u0012\u00020\'0\"H\u00c6\u0003J\u000f\u0010v\u001a\b\u0012\u0004\u0012\u00020)0\"H\u00c6\u0003J\u000f\u0010w\u001a\b\u0012\u0004\u0012\u00020+0\"H\u00c6\u0003J\t\u0010x\u001a\u00020\u0007H\u00c6\u0003J\u000b\u0010y\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\t\u0010z\u001a\u00020\u0005H\u00c6\u0003J\t\u0010{\u001a\u00020\u0005H\u00c6\u0003J\t\u0010|\u001a\u00020\u001bH\u00c6\u0003J\t\u0010}\u001a\u00020\u0007H\u00c6\u0003J\u000b\u0010~\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\t\u0010\u007f\u001a\u00020\u000bH\u00c6\u0003J\n\u0010\u0080\u0001\u001a\u00020\rH\u00c6\u0003J\n\u0010\u0081\u0001\u001a\u00020\rH\u00c6\u0003J\n\u0010\u0082\u0001\u001a\u00020\rH\u00c6\u0003J\u00f6\u0002\u0010\u0083\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\r2\b\b\u0002\u0010\u0011\u001a\u00020\r2\b\b\u0002\u0010\u0012\u001a\u00020\r2\b\b\u0002\u0010\u0013\u001a\u00020\r2\b\b\u0002\u0010\u0014\u001a\u00020\u00052\b\b\u0002\u0010\u0015\u001a\u00020\u00052\b\b\u0002\u0010\u0016\u001a\u00020\u00052\b\b\u0002\u0010\u0017\u001a\u00020\u00052\b\b\u0002\u0010\u0018\u001a\u00020\u00052\b\b\u0002\u0010\u0019\u001a\u00020\u00052\b\b\u0002\u0010\u001a\u001a\u00020\u001b2\b\b\u0002\u0010\u001c\u001a\u00020\u001b2\b\b\u0002\u0010\u001d\u001a\u00020\u001b2\b\b\u0002\u0010\u001e\u001a\u00020\u001f2\b\b\u0002\u0010 \u001a\u00020\u001f2\u000e\b\u0002\u0010!\u001a\b\u0012\u0004\u0012\u00020#0\"2\u000e\b\u0002\u0010$\u001a\b\u0012\u0004\u0012\u00020%0\"2\u000e\b\u0002\u0010&\u001a\b\u0012\u0004\u0012\u00020\'0\"2\u000e\b\u0002\u0010(\u001a\b\u0012\u0004\u0012\u00020)0\"2\u000e\b\u0002\u0010*\u001a\b\u0012\u0004\u0012\u00020+0\"2\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010-\u001a\u00020\u00052\b\b\u0002\u0010.\u001a\u00020\u00052\b\b\u0002\u0010/\u001a\u00020\u001bH\u00c6\u0001J\n\u0010\u0084\u0001\u001a\u000202H\u00d6\u0001J\u0016\u0010\u0085\u0001\u001a\u00020\u001b2\n\u0010\u0086\u0001\u001a\u0005\u0018\u00010\u0087\u0001H\u00d6\u0003J\u0007\u0010\u0088\u0001\u001a\u00020\u0005J\u0007\u0010\u0089\u0001\u001a\u00020\u0005J\u0010\u0010\u008a\u0001\u001a\u00020\u00052\u0007\u0010\u008b\u0001\u001a\u00020\u0005J\r\u0010\u008c\u0001\u001a\b\u0012\u0004\u0012\u00020\u00030\"J\n\u0010\u008d\u0001\u001a\u000202H\u00d6\u0001J\u0007\u0010\u008e\u0001\u001a\u00020\u001bJ\n\u0010\u008f\u0001\u001a\u00020\u0005H\u00d6\u0001J\u001e\u0010\u0090\u0001\u001a\u00030\u0091\u00012\b\u0010\u0092\u0001\u001a\u00030\u0093\u00012\u0007\u0010\u0094\u0001\u001a\u000202H\u00d6\u0001R\u0017\u00101\u001a\u000202\u00a2\u0006\u000e\n\u0000\u0012\u0004\b3\u00104\u001a\u0004\b5\u00106R\u0011\u0010\u001e\u001a\u00020\u001f\u00a2\u0006\b\n\u0000\u001a\u0004\b7\u00108R\u0013\u0010,\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b9\u0010:R\u0011\u0010\u0014\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b;\u0010:R\u0011\u0010\u0016\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b<\u0010:R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b=\u0010>R\u0011\u0010\b\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b?\u0010>R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b@\u0010>R\u0011\u0010\u0017\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\bA\u0010:R\u0011\u0010\u0011\u001a\u00020\r\u00a2\u0006\b\n\u0000\u001a\u0004\bB\u0010CR\u0017\u0010(\u001a\b\u0012\u0004\u0012\u00020)0\"\u00a2\u0006\b\n\u0000\u001a\u0004\bD\u0010ER\u0011\u0010\u0013\u001a\u00020\r\u00a2\u0006\b\n\u0000\u001a\u0004\bF\u0010CR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bG\u0010HR\u0011\u0010\u001a\u001a\u00020\u001b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010IR\u0011\u0010/\u001a\u00020\u001b\u00a2\u0006\b\n\u0000\u001a\u0004\b/\u0010IR\u0017\u0010J\u001a\u00020\u001b\u00a2\u0006\u000e\n\u0000\u0012\u0004\bK\u00104\u001a\u0004\bJ\u0010IR\u0017\u0010L\u001a\u00020\u001b\u00a2\u0006\u000e\n\u0000\u0012\u0004\bM\u00104\u001a\u0004\bL\u0010IR\u0017\u0010$\u001a\b\u0012\u0004\u0012\u00020%0\"\u00a2\u0006\b\n\u0000\u001a\u0004\bN\u0010ER\u0011\u0010\u001d\u001a\u00020\u001b\u00a2\u0006\b\n\u0000\u001a\u0004\bO\u0010IR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\bP\u0010:R\u0011\u0010\u0015\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\bQ\u0010:R\u0011\u0010\u0018\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\bR\u0010:R\u0011\u0010\u0019\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\bS\u0010:R\u0011\u0010.\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\bT\u0010:R\u0011\u0010\u001c\u001a\u00020\u001b\u00a2\u0006\b\n\u0000\u001a\u0004\bU\u0010IR\u0011\u0010\u000e\u001a\u00020\r\u00a2\u0006\b\n\u0000\u001a\u0004\bV\u0010CR\u0011\u0010\u0012\u001a\u00020\r\u00a2\u0006\b\n\u0000\u001a\u0004\bW\u0010CR\u0011\u0010 \u001a\u00020\u001f\u00a2\u0006\b\n\u0000\u001a\u0004\bX\u00108R\u0017\u0010&\u001a\b\u0012\u0004\u0012\u00020\'0\"\u00a2\u0006\b\n\u0000\u001a\u0004\bY\u0010ER\u0017\u0010!\u001a\b\u0012\u0004\u0012\u00020#0\"\u00a2\u0006\b\n\u0000\u001a\u0004\bZ\u0010ER\u0011\u0010-\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b[\u0010:R\u0011\u0010\u0010\u001a\u00020\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\\\u0010CR\u0011\u0010\n\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b]\u0010^R\u0017\u0010*\u001a\b\u0012\u0004\u0012\u00020+0\"\u00a2\u0006\b\n\u0000\u001a\u0004\b_\u0010ER\u0011\u0010\f\u001a\u00020\r\u00a2\u0006\b\n\u0000\u001a\u0004\b`\u0010CR\u0011\u0010\u000f\u001a\u00020\r\u00a2\u0006\b\n\u0000\u001a\u0004\ba\u0010C\u00a8\u0006\u009d\u0001"}, d2 = {"Lcom/woocommerce/android/model/Order;", "Landroid/os/Parcelable;", "id", "", "number", "", "dateCreated", "Ljava/util/Date;", "dateModified", "datePaid", "status", "Lcom/woocommerce/android/model/Order$Status;", "total", "Ljava/math/BigDecimal;", "productsTotal", "totalTax", "shippingTotal", "discountTotal", "refundTotal", "feesTotal", "currency", "orderKey", "customerNote", "discountCodes", "paymentMethod", "paymentMethodTitle", "isCashPayment", "", "pricesIncludeTax", "multiShippingLinesAvailable", "billingAddress", "Lcom/woocommerce/android/model/Address;", "shippingAddress", "shippingMethods", "", "Lcom/woocommerce/android/model/Order$ShippingMethod;", "items", "Lcom/woocommerce/android/model/Order$Item;", "shippingLines", "Lcom/woocommerce/android/model/Order$ShippingLine;", "feesLines", "Lcom/woocommerce/android/model/Order$FeeLine;", "taxLines", "Lcom/woocommerce/android/model/Order$TaxLine;", "chargeId", "shippingPhone", "paymentUrl", "isEditable", "(JLjava/lang/String;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Lcom/woocommerce/android/model/Order$Status;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZLcom/woocommerce/android/model/Address;Lcom/woocommerce/android/model/Address;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "availableRefundQuantity", "", "getAvailableRefundQuantity$annotations", "()V", "getAvailableRefundQuantity", "()I", "getBillingAddress", "()Lcom/woocommerce/android/model/Address;", "getChargeId", "()Ljava/lang/String;", "getCurrency", "getCustomerNote", "getDateCreated", "()Ljava/util/Date;", "getDateModified", "getDatePaid", "getDiscountCodes", "getDiscountTotal", "()Ljava/math/BigDecimal;", "getFeesLines", "()Ljava/util/List;", "getFeesTotal", "getId", "()J", "()Z", "isOrderPaid", "isOrderPaid$annotations", "isRefundAvailable", "isRefundAvailable$annotations", "getItems", "getMultiShippingLinesAvailable", "getNumber", "getOrderKey", "getPaymentMethod", "getPaymentMethodTitle", "getPaymentUrl", "getPricesIncludeTax", "getProductsTotal", "getRefundTotal", "getShippingAddress", "getShippingLines", "getShippingMethods", "getShippingPhone", "getShippingTotal", "getStatus", "()Lcom/woocommerce/android/model/Order$Status;", "getTaxLines", "getTotal", "getTotalTax", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component3", "component30", "component31", "component32", "component33", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "describeContents", "equals", "other", "", "formatBillingInformationForDisplay", "formatShippingInformationForDisplay", "getBillingName", "defaultValue", "getProductIds", "hashCode", "isEmpty", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Companion", "FeeLine", "Item", "OrderStatus", "ShippingLine", "ShippingMethod", "Status", "TaxLine", "WooCommerce_wasabiDebug"})
public final class Order implements android.os.Parcelable {
    private final long id = 0L;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String number = null;
    @org.jetbrains.annotations.NotNull
    private final java.util.Date dateCreated = null;
    @org.jetbrains.annotations.NotNull
    private final java.util.Date dateModified = null;
    @org.jetbrains.annotations.Nullable
    private final java.util.Date datePaid = null;
    @org.jetbrains.annotations.NotNull
    private final com.woocommerce.android.model.Order.Status status = null;
    @org.jetbrains.annotations.NotNull
    private final java.math.BigDecimal total = null;
    @org.jetbrains.annotations.NotNull
    private final java.math.BigDecimal productsTotal = null;
    @org.jetbrains.annotations.NotNull
    private final java.math.BigDecimal totalTax = null;
    @org.jetbrains.annotations.NotNull
    private final java.math.BigDecimal shippingTotal = null;
    @org.jetbrains.annotations.NotNull
    private final java.math.BigDecimal discountTotal = null;
    @org.jetbrains.annotations.NotNull
    private final java.math.BigDecimal refundTotal = null;
    @org.jetbrains.annotations.NotNull
    private final java.math.BigDecimal feesTotal = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String currency = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String orderKey = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String customerNote = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String discountCodes = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String paymentMethod = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String paymentMethodTitle = null;
    private final boolean isCashPayment = false;
    private final boolean pricesIncludeTax = false;
    private final boolean multiShippingLinesAvailable = false;
    @org.jetbrains.annotations.NotNull
    private final com.woocommerce.android.model.Address billingAddress = null;
    @org.jetbrains.annotations.NotNull
    private final com.woocommerce.android.model.Address shippingAddress = null;
    @org.jetbrains.annotations.NotNull
    private final java.util.List<com.woocommerce.android.model.Order.ShippingMethod> shippingMethods = null;
    @org.jetbrains.annotations.NotNull
    private final java.util.List<com.woocommerce.android.model.Order.Item> items = null;
    @org.jetbrains.annotations.NotNull
    private final java.util.List<com.woocommerce.android.model.Order.ShippingLine> shippingLines = null;
    @org.jetbrains.annotations.NotNull
    private final java.util.List<com.woocommerce.android.model.Order.FeeLine> feesLines = null;
    @org.jetbrains.annotations.NotNull
    private final java.util.List<com.woocommerce.android.model.Order.TaxLine> taxLines = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String chargeId = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String shippingPhone = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String paymentUrl = null;
    private final boolean isEditable = false;
    private final boolean isOrderPaid = false;
    private final int availableRefundQuantity = 0;
    private final boolean isRefundAvailable = false;
    @org.jetbrains.annotations.NotNull
    public static final com.woocommerce.android.model.Order.Companion Companion = null;
    private static final kotlin.Lazy DEFAULT_EMPTY_ORDER$delegate = null;
    public static final android.os.Parcelable.Creator<com.woocommerce.android.model.Order> CREATOR = null;
    
    @org.jetbrains.annotations.NotNull
    public final com.woocommerce.android.model.Order copy(long id, @org.jetbrains.annotations.NotNull
    java.lang.String number, @org.jetbrains.annotations.NotNull
    java.util.Date dateCreated, @org.jetbrains.annotations.NotNull
    java.util.Date dateModified, @org.jetbrains.annotations.Nullable
    java.util.Date datePaid, @org.jetbrains.annotations.NotNull
    com.woocommerce.android.model.Order.Status status, @org.jetbrains.annotations.NotNull
    java.math.BigDecimal total, @org.jetbrains.annotations.NotNull
    java.math.BigDecimal productsTotal, @org.jetbrains.annotations.NotNull
    java.math.BigDecimal totalTax, @org.jetbrains.annotations.NotNull
    java.math.BigDecimal shippingTotal, @org.jetbrains.annotations.NotNull
    java.math.BigDecimal discountTotal, @org.jetbrains.annotations.NotNull
    java.math.BigDecimal refundTotal, @org.jetbrains.annotations.NotNull
    java.math.BigDecimal feesTotal, @org.jetbrains.annotations.NotNull
    java.lang.String currency, @org.jetbrains.annotations.NotNull
    java.lang.String orderKey, @org.jetbrains.annotations.NotNull
    java.lang.String customerNote, @org.jetbrains.annotations.NotNull
    java.lang.String discountCodes, @org.jetbrains.annotations.NotNull
    java.lang.String paymentMethod, @org.jetbrains.annotations.NotNull
    java.lang.String paymentMethodTitle, boolean isCashPayment, boolean pricesIncludeTax, boolean multiShippingLinesAvailable, @org.jetbrains.annotations.NotNull
    com.woocommerce.android.model.Address billingAddress, @org.jetbrains.annotations.NotNull
    com.woocommerce.android.model.Address shippingAddress, @org.jetbrains.annotations.NotNull
    java.util.List<com.woocommerce.android.model.Order.ShippingMethod> shippingMethods, @org.jetbrains.annotations.NotNull
    java.util.List<com.woocommerce.android.model.Order.Item> items, @org.jetbrains.annotations.NotNull
    java.util.List<com.woocommerce.android.model.Order.ShippingLine> shippingLines, @org.jetbrains.annotations.NotNull
    java.util.List<com.woocommerce.android.model.Order.FeeLine> feesLines, @org.jetbrains.annotations.NotNull
    java.util.List<com.woocommerce.android.model.Order.TaxLine> taxLines, @org.jetbrains.annotations.Nullable
    java.lang.String chargeId, @org.jetbrains.annotations.NotNull
    java.lang.String shippingPhone, @org.jetbrains.annotations.NotNull
    java.lang.String paymentUrl, boolean isEditable) {
        return null;
    }
    
    @java.lang.Override
    public boolean equals(@org.jetbrains.annotations.Nullable
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.lang.String toString() {
        return null;
    }
    
    public Order(long id, @org.jetbrains.annotations.NotNull
    java.lang.String number, @org.jetbrains.annotations.NotNull
    java.util.Date dateCreated, @org.jetbrains.annotations.NotNull
    java.util.Date dateModified, @org.jetbrains.annotations.Nullable
    java.util.Date datePaid, @org.jetbrains.annotations.NotNull
    com.woocommerce.android.model.Order.Status status, @org.jetbrains.annotations.NotNull
    java.math.BigDecimal total, @org.jetbrains.annotations.NotNull
    java.math.BigDecimal productsTotal, @org.jetbrains.annotations.NotNull
    java.math.BigDecimal totalTax, @org.jetbrains.annotations.NotNull
    java.math.BigDecimal shippingTotal, @org.jetbrains.annotations.NotNull
    java.math.BigDecimal discountTotal, @org.jetbrains.annotations.NotNull
    java.math.BigDecimal refundTotal, @org.jetbrains.annotations.NotNull
    java.math.BigDecimal feesTotal, @org.jetbrains.annotations.NotNull
    java.lang.String currency, @org.jetbrains.annotations.NotNull
    java.lang.String orderKey, @org.jetbrains.annotations.NotNull
    java.lang.String customerNote, @org.jetbrains.annotations.NotNull
    java.lang.String discountCodes, @org.jetbrains.annotations.NotNull
    java.lang.String paymentMethod, @org.jetbrains.annotations.NotNull
    java.lang.String paymentMethodTitle, boolean isCashPayment, boolean pricesIncludeTax, boolean multiShippingLinesAvailable, @org.jetbrains.annotations.NotNull
    com.woocommerce.android.model.Address billingAddress, @org.jetbrains.annotations.NotNull
    com.woocommerce.android.model.Address shippingAddress, @org.jetbrains.annotations.NotNull
    java.util.List<com.woocommerce.android.model.Order.ShippingMethod> shippingMethods, @org.jetbrains.annotations.NotNull
    java.util.List<com.woocommerce.android.model.Order.Item> items, @org.jetbrains.annotations.NotNull
    java.util.List<com.woocommerce.android.model.Order.ShippingLine> shippingLines, @org.jetbrains.annotations.NotNull
    java.util.List<com.woocommerce.android.model.Order.FeeLine> feesLines, @org.jetbrains.annotations.NotNull
    java.util.List<com.woocommerce.android.model.Order.TaxLine> taxLines, @org.jetbrains.annotations.Nullable
    java.lang.String chargeId, @org.jetbrains.annotations.NotNull
    java.lang.String shippingPhone, @org.jetbrains.annotations.NotNull
    java.lang.String paymentUrl, boolean isEditable) {
        super();
    }
    
    public final long component1() {
        return 0L;
    }
    
    public final long getId() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getNumber() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.Date component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.Date getDateCreated() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.Date component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.Date getDateModified() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.util.Date component5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.util.Date getDatePaid() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.woocommerce.android.model.Order.Status component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.woocommerce.android.model.Order.Status getStatus() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.math.BigDecimal component7() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.math.BigDecimal getTotal() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.math.BigDecimal component8() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.math.BigDecimal getProductsTotal() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.math.BigDecimal component9() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.math.BigDecimal getTotalTax() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.math.BigDecimal component10() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.math.BigDecimal getShippingTotal() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.math.BigDecimal component11() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.math.BigDecimal getDiscountTotal() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.math.BigDecimal component12() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.math.BigDecimal getRefundTotal() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.math.BigDecimal component13() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.math.BigDecimal getFeesTotal() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component14() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getCurrency() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component15() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getOrderKey() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component16() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getCustomerNote() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component17() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getDiscountCodes() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component18() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getPaymentMethod() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component19() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getPaymentMethodTitle() {
        return null;
    }
    
    public final boolean component20() {
        return false;
    }
    
    public final boolean isCashPayment() {
        return false;
    }
    
    public final boolean component21() {
        return false;
    }
    
    public final boolean getPricesIncludeTax() {
        return false;
    }
    
    public final boolean component22() {
        return false;
    }
    
    public final boolean getMultiShippingLinesAvailable() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.woocommerce.android.model.Address component23() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.woocommerce.android.model.Address getBillingAddress() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.woocommerce.android.model.Address component24() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.woocommerce.android.model.Address getShippingAddress() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.woocommerce.android.model.Order.ShippingMethod> component25() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.woocommerce.android.model.Order.ShippingMethod> getShippingMethods() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.woocommerce.android.model.Order.Item> component26() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.woocommerce.android.model.Order.Item> getItems() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.woocommerce.android.model.Order.ShippingLine> component27() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.woocommerce.android.model.Order.ShippingLine> getShippingLines() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.woocommerce.android.model.Order.FeeLine> component28() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.woocommerce.android.model.Order.FeeLine> getFeesLines() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.woocommerce.android.model.Order.TaxLine> component29() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.woocommerce.android.model.Order.TaxLine> getTaxLines() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component30() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getChargeId() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component31() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getShippingPhone() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component32() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getPaymentUrl() {
        return null;
    }
    
    public final boolean component33() {
        return false;
    }
    
    public final boolean isEditable() {
        return false;
    }
    
    public final boolean isOrderPaid() {
        return false;
    }
    
    @kotlinx.parcelize.IgnoredOnParcel
    @java.lang.Deprecated
    public static void isOrderPaid$annotations() {
    }
    
    public final int getAvailableRefundQuantity() {
        return 0;
    }
    
    @kotlinx.parcelize.IgnoredOnParcel
    @java.lang.Deprecated
    public static void getAvailableRefundQuantity$annotations() {
    }
    
    public final boolean isRefundAvailable() {
        return false;
    }
    
    @kotlinx.parcelize.IgnoredOnParcel
    @java.lang.Deprecated
    public static void isRefundAvailable$annotations() {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getBillingName(@org.jetbrains.annotations.NotNull
    java.lang.String defaultValue) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String formatBillingInformationForDisplay() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String formatShippingInformationForDisplay() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<java.lang.Long> getProductIds() {
        return null;
    }
    
    public final boolean isEmpty() {
        return false;
    }
    
    @java.lang.Override
    public int describeContents() {
        return 0;
    }
    
    @java.lang.Override
    public void writeToParcel(@org.jetbrains.annotations.NotNull
    android.os.Parcel parcel, int flags) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 3)
    public static final class Creator implements android.os.Parcelable.Creator<com.woocommerce.android.model.Order> {
        
        public Creator() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        @java.lang.Override
        public final com.woocommerce.android.model.Order createFromParcel(@org.jetbrains.annotations.NotNull
        android.os.Parcel in) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        @java.lang.Override
        public final com.woocommerce.android.model.Order[] newArray(int size) {
            return null;
        }
    }
    
    @kotlinx.parcelize.Parcelize
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0010\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0011\u001a\u00020\u0006H\u00c6\u0003J\t\u0010\u0012\u001a\u00020\u0006H\u00c6\u0003J1\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u00c6\u0001J\t\u0010\u0014\u001a\u00020\u0015H\u00d6\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u00d6\u0003J\t\u0010\u001a\u001a\u00020\u0015H\u00d6\u0001J\t\u0010\u001b\u001a\u00020\u0003H\u00d6\u0001J\u0019\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0015H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\f\u00a8\u0006!"}, d2 = {"Lcom/woocommerce/android/model/Order$ShippingMethod;", "Landroid/os/Parcelable;", "id", "", "title", "total", "Ljava/math/BigDecimal;", "tax", "(Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;)V", "getId", "()Ljava/lang/String;", "getTax", "()Ljava/math/BigDecimal;", "getTitle", "getTotal", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "WooCommerce_wasabiDebug"})
    public static final class ShippingMethod implements android.os.Parcelable {
        @org.jetbrains.annotations.NotNull
        private final java.lang.String id = null;
        @org.jetbrains.annotations.NotNull
        private final java.lang.String title = null;
        @org.jetbrains.annotations.NotNull
        private final java.math.BigDecimal total = null;
        @org.jetbrains.annotations.NotNull
        private final java.math.BigDecimal tax = null;
        public static final android.os.Parcelable.Creator<com.woocommerce.android.model.Order.ShippingMethod> CREATOR = null;
        
        @org.jetbrains.annotations.NotNull
        public final com.woocommerce.android.model.Order.ShippingMethod copy(@org.jetbrains.annotations.NotNull
        java.lang.String id, @org.jetbrains.annotations.NotNull
        java.lang.String title, @org.jetbrains.annotations.NotNull
        java.math.BigDecimal total, @org.jetbrains.annotations.NotNull
        java.math.BigDecimal tax) {
            return null;
        }
        
        @java.lang.Override
        public boolean equals(@org.jetbrains.annotations.Nullable
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override
        public int hashCode() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull
        @java.lang.Override
        public java.lang.String toString() {
            return null;
        }
        
        public ShippingMethod(@org.jetbrains.annotations.NotNull
        java.lang.String id, @org.jetbrains.annotations.NotNull
        java.lang.String title, @org.jetbrains.annotations.NotNull
        java.math.BigDecimal total, @org.jetbrains.annotations.NotNull
        java.math.BigDecimal tax) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getId() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getTitle() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.math.BigDecimal component3() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.math.BigDecimal getTotal() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.math.BigDecimal component4() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.math.BigDecimal getTax() {
            return null;
        }
        
        @java.lang.Override
        public int describeContents() {
            return 0;
        }
        
        @java.lang.Override
        public void writeToParcel(@org.jetbrains.annotations.NotNull
        android.os.Parcel parcel, int flags) {
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 3)
        public static final class Creator implements android.os.Parcelable.Creator<com.woocommerce.android.model.Order.ShippingMethod> {
            
            public Creator() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull
            @java.lang.Override
            public final com.woocommerce.android.model.Order.ShippingMethod createFromParcel(@org.jetbrains.annotations.NotNull
            android.os.Parcel in) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull
            @java.lang.Override
            public final com.woocommerce.android.model.Order.ShippingMethod[] newArray(int size) {
                return null;
            }
        }
    }
    
    @kotlinx.parcelize.Parcelize
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\n\u001a\u00020\u0003H\u00c6\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u00c6\u0001J\t\u0010\f\u001a\u00020\rH\u00d6\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u00d6\u0003J\t\u0010\u0012\u001a\u00020\rH\u00d6\u0001J\t\u0010\u0013\u001a\u00020\u0003H\u00d6\u0001J\u0019\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\rH\u00d6\u0001R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007\u00a8\u0006\u0019"}, d2 = {"Lcom/woocommerce/android/model/Order$OrderStatus;", "Landroid/os/Parcelable;", "statusKey", "", "label", "(Ljava/lang/String;Ljava/lang/String;)V", "getLabel", "()Ljava/lang/String;", "getStatusKey", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "WooCommerce_wasabiDebug"})
    public static final class OrderStatus implements android.os.Parcelable {
        @org.jetbrains.annotations.NotNull
        private final java.lang.String statusKey = null;
        @org.jetbrains.annotations.NotNull
        private final java.lang.String label = null;
        public static final android.os.Parcelable.Creator<com.woocommerce.android.model.Order.OrderStatus> CREATOR = null;
        
        @org.jetbrains.annotations.NotNull
        public final com.woocommerce.android.model.Order.OrderStatus copy(@org.jetbrains.annotations.NotNull
        java.lang.String statusKey, @org.jetbrains.annotations.NotNull
        java.lang.String label) {
            return null;
        }
        
        @java.lang.Override
        public boolean equals(@org.jetbrains.annotations.Nullable
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override
        public int hashCode() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull
        @java.lang.Override
        public java.lang.String toString() {
            return null;
        }
        
        public OrderStatus(@org.jetbrains.annotations.NotNull
        java.lang.String statusKey, @org.jetbrains.annotations.NotNull
        java.lang.String label) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getStatusKey() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getLabel() {
            return null;
        }
        
        @java.lang.Override
        public int describeContents() {
            return 0;
        }
        
        @java.lang.Override
        public void writeToParcel(@org.jetbrains.annotations.NotNull
        android.os.Parcel parcel, int flags) {
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 3)
        public static final class Creator implements android.os.Parcelable.Creator<com.woocommerce.android.model.Order.OrderStatus> {
            
            public Creator() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull
            @java.lang.Override
            public final com.woocommerce.android.model.Order.OrderStatus createFromParcel(@org.jetbrains.annotations.NotNull
            android.os.Parcel in) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull
            @java.lang.Override
            public final com.woocommerce.android.model.Order.OrderStatus[] newArray(int size) {
                return null;
            }
        }
    }
    
    @kotlinx.parcelize.Parcelize
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b+\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 V2\u00020\u0001:\u0002UVBc\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\b\u0012\u0006\u0010\r\u001a\u00020\b\u0012\u0006\u0010\u000e\u001a\u00020\b\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011\u00a2\u0006\u0002\u0010\u0013J\t\u0010=\u001a\u00020\u0003H\u00c6\u0003J\t\u0010>\u001a\u00020\u0003H\u00c6\u0003J\u000f\u0010?\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u00c6\u0003J\t\u0010@\u001a\u00020\u0003H\u00c6\u0003J\t\u0010A\u001a\u00020\u0006H\u00c6\u0003J\t\u0010B\u001a\u00020\bH\u00c6\u0003J\t\u0010C\u001a\u00020\u0006H\u00c6\u0003J\t\u0010D\u001a\u00020\u000bH\u00c6\u0003J\t\u0010E\u001a\u00020\bH\u00c6\u0003J\t\u0010F\u001a\u00020\bH\u00c6\u0003J\t\u0010G\u001a\u00020\bH\u00c6\u0003J}\u0010H\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\b2\b\b\u0002\u0010\r\u001a\u00020\b2\b\b\u0002\u0010\u000e\u001a\u00020\b2\b\b\u0002\u0010\u000f\u001a\u00020\u00032\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u00c6\u0001J\t\u0010I\u001a\u00020JH\u00d6\u0001J\u0013\u0010K\u001a\u00020\u001e2\b\u0010L\u001a\u0004\u0018\u00010MH\u00d6\u0003J\t\u0010N\u001a\u00020JH\u00d6\u0001J\t\u0010O\u001a\u00020\u0006H\u00d6\u0001J\u0019\u0010P\u001a\u00020Q2\u0006\u0010R\u001a\u00020S2\u0006\u0010T\u001a\u00020JH\u00d6\u0001R\u0011\u0010\u0014\u001a\u00020\u00068F\u00a2\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u001d\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00060\u0011\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u0018R \u0010\u001d\u001a\u00020\u001eX\u0086\u000e\u00a2\u0006\u0014\n\u0000\u0012\u0004\b\u001f\u0010\u001b\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u0017\u0010$\u001a\u00020\b\u00a2\u0006\u000e\n\u0000\u0012\u0004\b%\u0010\u001b\u001a\u0004\b&\u0010\'R\u0017\u0010(\u001a\u00020\u001e\u00a2\u0006\u000e\n\u0000\u0012\u0004\b)\u0010\u001b\u001a\u0004\b(\u0010!R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b,\u0010\u0016R\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b-\u0010\'R\u001f\u0010.\u001a\n /*\u0004\u0018\u00010\b0\b\u00a2\u0006\u000e\n\u0000\u0012\u0004\b0\u0010\u001b\u001a\u0004\b1\u0010\'R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b2\u0010+R\u0011\u0010\n\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b3\u00104R\u0011\u0010\t\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b5\u0010\u0016R\u0011\u0010\f\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b6\u0010\'R\u0011\u0010\u000e\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b7\u0010\'R\u0011\u0010\r\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b8\u0010\'R\u0017\u00109\u001a\u00020\u0003\u00a2\u0006\u000e\n\u0000\u0012\u0004\b:\u0010\u001b\u001a\u0004\b;\u0010+R\u0011\u0010\u000f\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b<\u0010+\u00a8\u0006W"}, d2 = {"Lcom/woocommerce/android/model/Order$Item;", "Landroid/os/Parcelable;", "itemId", "", "productId", "name", "", "price", "Ljava/math/BigDecimal;", "sku", "quantity", "", "subtotal", "totalTax", "total", "variationId", "attributesList", "", "Lcom/woocommerce/android/model/Order$Item$Attribute;", "(JJLjava/lang/String;Ljava/math/BigDecimal;Ljava/lang/String;FLjava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;JLjava/util/List;)V", "attributesDescription", "getAttributesDescription", "()Ljava/lang/String;", "getAttributesList", "()Ljava/util/List;", "attributesNames", "getAttributesNames$annotations", "()V", "getAttributesNames", "containsAddons", "", "getContainsAddons$annotations", "getContainsAddons", "()Z", "setContainsAddons", "(Z)V", "discount", "getDiscount$annotations", "getDiscount", "()Ljava/math/BigDecimal;", "isVariation", "isVariation$annotations", "getItemId", "()J", "getName", "getPrice", "pricePreDiscount", "kotlin.jvm.PlatformType", "getPricePreDiscount$annotations", "getPricePreDiscount", "getProductId", "getQuantity", "()F", "getSku", "getSubtotal", "getTotal", "getTotalTax", "uniqueId", "getUniqueId$annotations", "getUniqueId", "getVariationId", "component1", "component10", "component11", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Attribute", "Companion", "WooCommerce_wasabiDebug"})
    public static final class Item implements android.os.Parcelable {
        private final long itemId = 0L;
        private final long productId = 0L;
        @org.jetbrains.annotations.NotNull
        private final java.lang.String name = null;
        @org.jetbrains.annotations.NotNull
        private final java.math.BigDecimal price = null;
        @org.jetbrains.annotations.NotNull
        private final java.lang.String sku = null;
        private final float quantity = 0.0F;
        @org.jetbrains.annotations.NotNull
        private final java.math.BigDecimal subtotal = null;
        @org.jetbrains.annotations.NotNull
        private final java.math.BigDecimal totalTax = null;
        @org.jetbrains.annotations.NotNull
        private final java.math.BigDecimal total = null;
        private final long variationId = 0L;
        @org.jetbrains.annotations.NotNull
        private final java.util.List<com.woocommerce.android.model.Order.Item.Attribute> attributesList = null;
        private final long uniqueId = 0L;
        private final boolean isVariation = false;
        private final java.math.BigDecimal pricePreDiscount = null;
        @org.jetbrains.annotations.NotNull
        private final java.math.BigDecimal discount = null;
        private boolean containsAddons = false;
        @org.jetbrains.annotations.NotNull
        private final java.util.List<java.lang.String> attributesNames = null;
        @org.jetbrains.annotations.NotNull
        public static final com.woocommerce.android.model.Order.Item.Companion Companion = null;
        @org.jetbrains.annotations.NotNull
        private static final kotlin.Lazy EMPTY$delegate = null;
        public static final android.os.Parcelable.Creator<com.woocommerce.android.model.Order.Item> CREATOR = null;
        
        @org.jetbrains.annotations.NotNull
        public final com.woocommerce.android.model.Order.Item copy(long itemId, long productId, @org.jetbrains.annotations.NotNull
        java.lang.String name, @org.jetbrains.annotations.NotNull
        java.math.BigDecimal price, @org.jetbrains.annotations.NotNull
        java.lang.String sku, float quantity, @org.jetbrains.annotations.NotNull
        java.math.BigDecimal subtotal, @org.jetbrains.annotations.NotNull
        java.math.BigDecimal totalTax, @org.jetbrains.annotations.NotNull
        java.math.BigDecimal total, long variationId, @org.jetbrains.annotations.NotNull
        java.util.List<com.woocommerce.android.model.Order.Item.Attribute> attributesList) {
            return null;
        }
        
        @java.lang.Override
        public boolean equals(@org.jetbrains.annotations.Nullable
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override
        public int hashCode() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull
        @java.lang.Override
        public java.lang.String toString() {
            return null;
        }
        
        public Item(long itemId, long productId, @org.jetbrains.annotations.NotNull
        java.lang.String name, @org.jetbrains.annotations.NotNull
        java.math.BigDecimal price, @org.jetbrains.annotations.NotNull
        java.lang.String sku, float quantity, @org.jetbrains.annotations.NotNull
        java.math.BigDecimal subtotal, @org.jetbrains.annotations.NotNull
        java.math.BigDecimal totalTax, @org.jetbrains.annotations.NotNull
        java.math.BigDecimal total, long variationId, @org.jetbrains.annotations.NotNull
        java.util.List<com.woocommerce.android.model.Order.Item.Attribute> attributesList) {
            super();
        }
        
        public final long component1() {
            return 0L;
        }
        
        public final long getItemId() {
            return 0L;
        }
        
        public final long component2() {
            return 0L;
        }
        
        public final long getProductId() {
            return 0L;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String component3() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getName() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.math.BigDecimal component4() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.math.BigDecimal getPrice() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String component5() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getSku() {
            return null;
        }
        
        public final float component6() {
            return 0.0F;
        }
        
        public final float getQuantity() {
            return 0.0F;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.math.BigDecimal component7() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.math.BigDecimal getSubtotal() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.math.BigDecimal component8() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.math.BigDecimal getTotalTax() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.math.BigDecimal component9() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.math.BigDecimal getTotal() {
            return null;
        }
        
        public final long component10() {
            return 0L;
        }
        
        public final long getVariationId() {
            return 0L;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.util.List<com.woocommerce.android.model.Order.Item.Attribute> component11() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.util.List<com.woocommerce.android.model.Order.Item.Attribute> getAttributesList() {
            return null;
        }
        
        public final long getUniqueId() {
            return 0L;
        }
        
        @kotlinx.parcelize.IgnoredOnParcel
        @java.lang.Deprecated
        public static void getUniqueId$annotations() {
        }
        
        public final boolean isVariation() {
            return false;
        }
        
        @kotlinx.parcelize.IgnoredOnParcel
        @java.lang.Deprecated
        public static void isVariation$annotations() {
        }
        
        public final java.math.BigDecimal getPricePreDiscount() {
            return null;
        }
        
        @kotlinx.parcelize.IgnoredOnParcel
        @java.lang.Deprecated
        public static void getPricePreDiscount$annotations() {
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.math.BigDecimal getDiscount() {
            return null;
        }
        
        @kotlinx.parcelize.IgnoredOnParcel
        @java.lang.Deprecated
        public static void getDiscount$annotations() {
        }
        
        public final boolean getContainsAddons() {
            return false;
        }
        
        @kotlinx.parcelize.IgnoredOnParcel
        @java.lang.Deprecated
        public static void getContainsAddons$annotations() {
        }
        
        public final void setContainsAddons(boolean p0) {
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.util.List<java.lang.String> getAttributesNames() {
            return null;
        }
        
        @kotlinx.parcelize.IgnoredOnParcel
        @java.lang.Deprecated
        public static void getAttributesNames$annotations() {
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getAttributesDescription() {
            return null;
        }
        
        @java.lang.Override
        public int describeContents() {
            return 0;
        }
        
        @java.lang.Override
        public void writeToParcel(@org.jetbrains.annotations.NotNull
        android.os.Parcel parcel, int flags) {
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 3)
        public static final class Creator implements android.os.Parcelable.Creator<com.woocommerce.android.model.Order.Item> {
            
            public Creator() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull
            @java.lang.Override
            public final com.woocommerce.android.model.Order.Item createFromParcel(@org.jetbrains.annotations.NotNull
            android.os.Parcel in) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull
            @java.lang.Override
            public final com.woocommerce.android.model.Order.Item[] newArray(int size) {
                return null;
            }
        }
        
        @kotlinx.parcelize.Parcelize
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 &2\u00020\u0001:\u0001&B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0005J\t\u0010\u0016\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0017\u001a\u00020\u0003H\u00c6\u0003J\u001d\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u00c6\u0001J\t\u0010\u0019\u001a\u00020\u001aH\u00d6\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u00d6\u0003J\t\u0010\u001f\u001a\u00020\u001aH\u00d6\u0001J\t\u0010 \u001a\u00020\u0003H\u00d6\u0001J\u0019\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u001aH\u00d6\u0001R\u0017\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u0017\u0010\u000b\u001a\u00020\u0003\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\f\u0010\b\u001a\u0004\b\r\u0010\nR\u0014\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\b\n\u0000\u0012\u0004\b\u0010\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\nR\u001c\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0013X\u0082\u0004\u00a2\u0006\b\n\u0000\u0012\u0004\b\u0014\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\n\u00a8\u0006\'"}, d2 = {"Lcom/woocommerce/android/model/Order$Item$Attribute;", "Landroid/os/Parcelable;", "key", "", "value", "(Ljava/lang/String;Ljava/lang/String;)V", "addonName", "getAddonName$annotations", "()V", "getAddonName", "()Ljava/lang/String;", "asAddonPrice", "getAsAddonPrice$annotations", "getAsAddonPrice", "attributeAddonKeyRegex", "Lkotlin/text/Regex;", "getAttributeAddonKeyRegex$annotations", "getKey", "keyAsAddonRegexGroup", "", "getKeyAsAddonRegexGroup$annotations", "getValue", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Companion", "WooCommerce_wasabiDebug"})
        public static final class Attribute implements android.os.Parcelable {
            @org.jetbrains.annotations.NotNull
            private final java.lang.String key = null;
            @org.jetbrains.annotations.NotNull
            private final java.lang.String value = null;
            @org.jetbrains.annotations.NotNull
            public static final com.woocommerce.android.model.Order.Item.Attribute.Companion Companion = null;
            private static final int addonAttributeGroupSize = 3;
            private final kotlin.text.Regex attributeAddonKeyRegex = null;
            private final java.util.List<java.lang.String> keyAsAddonRegexGroup = null;
            @org.jetbrains.annotations.NotNull
            private final java.lang.String addonName = null;
            @org.jetbrains.annotations.NotNull
            private final java.lang.String asAddonPrice = null;
            public static final android.os.Parcelable.Creator<com.woocommerce.android.model.Order.Item.Attribute> CREATOR = null;
            
            @org.jetbrains.annotations.NotNull
            public final com.woocommerce.android.model.Order.Item.Attribute copy(@org.jetbrains.annotations.NotNull
            java.lang.String key, @org.jetbrains.annotations.NotNull
            java.lang.String value) {
                return null;
            }
            
            @java.lang.Override
            public boolean equals(@org.jetbrains.annotations.Nullable
            java.lang.Object other) {
                return false;
            }
            
            @java.lang.Override
            public int hashCode() {
                return 0;
            }
            
            @org.jetbrains.annotations.NotNull
            @java.lang.Override
            public java.lang.String toString() {
                return null;
            }
            
            public Attribute(@org.jetbrains.annotations.NotNull
            java.lang.String key, @org.jetbrains.annotations.NotNull
            java.lang.String value) {
                super();
            }
            
            @org.jetbrains.annotations.NotNull
            public final java.lang.String component1() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull
            public final java.lang.String getKey() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull
            public final java.lang.String component2() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull
            public final java.lang.String getValue() {
                return null;
            }
            
            @kotlinx.parcelize.IgnoredOnParcel
            @java.lang.Deprecated
            private static void getAttributeAddonKeyRegex$annotations() {
            }
            
            @kotlinx.parcelize.IgnoredOnParcel
            @java.lang.Deprecated
            private static void getKeyAsAddonRegexGroup$annotations() {
            }
            
            @org.jetbrains.annotations.NotNull
            public final java.lang.String getAddonName() {
                return null;
            }
            
            @kotlinx.parcelize.IgnoredOnParcel
            @java.lang.Deprecated
            public static void getAddonName$annotations() {
            }
            
            @org.jetbrains.annotations.NotNull
            public final java.lang.String getAsAddonPrice() {
                return null;
            }
            
            @kotlinx.parcelize.IgnoredOnParcel
            @java.lang.Deprecated
            public static void getAsAddonPrice$annotations() {
            }
            
            @java.lang.Override
            public int describeContents() {
                return 0;
            }
            
            @java.lang.Override
            public void writeToParcel(@org.jetbrains.annotations.NotNull
            android.os.Parcel parcel, int flags) {
            }
            
            @kotlin.Metadata(mv = {1, 6, 0}, k = 3)
            public static final class Creator implements android.os.Parcelable.Creator<com.woocommerce.android.model.Order.Item.Attribute> {
                
                public Creator() {
                    super();
                }
                
                @org.jetbrains.annotations.NotNull
                @java.lang.Override
                public final com.woocommerce.android.model.Order.Item.Attribute createFromParcel(@org.jetbrains.annotations.NotNull
                android.os.Parcel in) {
                    return null;
                }
                
                @org.jetbrains.annotations.NotNull
                @java.lang.Override
                public final com.woocommerce.android.model.Order.Item.Attribute[] newArray(int size) {
                    return null;
                }
            }
            
            @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/woocommerce/android/model/Order$Item$Attribute$Companion;", "", "()V", "addonAttributeGroupSize", "", "WooCommerce_wasabiDebug"})
            public static final class Companion {
                
                private Companion() {
                    super();
                }
            }
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u001b\u0010\u0003\u001a\u00020\u00048FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\t"}, d2 = {"Lcom/woocommerce/android/model/Order$Item$Companion;", "", "()V", "EMPTY", "Lcom/woocommerce/android/model/Order$Item;", "getEMPTY", "()Lcom/woocommerce/android/model/Order$Item;", "EMPTY$delegate", "Lkotlin/Lazy;", "WooCommerce_wasabiDebug"})
        public static final class Companion {
            
            private Companion() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull
            public final com.woocommerce.android.model.Order.Item getEMPTY() {
                return null;
            }
        }
    }
    
    @kotlinx.parcelize.Parcelize
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0011\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007B/\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u000bJ\t\u0010\u0014\u001a\u00020\tH\u00c6\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010\u0016\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0017\u001a\u00020\u0006H\u00c6\u0003J\t\u0010\u0018\u001a\u00020\u0006H\u00c6\u0003J=\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00062\b\b\u0002\u0010\u0005\u001a\u00020\u0006H\u00c6\u0001J\t\u0010\u001a\u001a\u00020\u001bH\u00d6\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u00d6\u0003J\t\u0010 \u001a\u00020\u001bH\u00d6\u0001J\t\u0010!\u001a\u00020\u0003H\u00d6\u0001J\u0019\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u001bH\u00d6\u0001R\u0011\u0010\b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\n\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012\u00a8\u0006\'"}, d2 = {"Lcom/woocommerce/android/model/Order$ShippingLine;", "Landroid/os/Parcelable;", "methodId", "", "methodTitle", "total", "Ljava/math/BigDecimal;", "(Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;)V", "itemId", "", "totalTax", "(JLjava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;)V", "getItemId", "()J", "getMethodId", "()Ljava/lang/String;", "getMethodTitle", "getTotal", "()Ljava/math/BigDecimal;", "getTotalTax", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "WooCommerce_wasabiDebug"})
    public static final class ShippingLine implements android.os.Parcelable {
        private final long itemId = 0L;
        @org.jetbrains.annotations.Nullable
        private final java.lang.String methodId = null;
        @org.jetbrains.annotations.NotNull
        private final java.lang.String methodTitle = null;
        @org.jetbrains.annotations.NotNull
        private final java.math.BigDecimal totalTax = null;
        @org.jetbrains.annotations.NotNull
        private final java.math.BigDecimal total = null;
        public static final android.os.Parcelable.Creator<com.woocommerce.android.model.Order.ShippingLine> CREATOR = null;
        
        @org.jetbrains.annotations.NotNull
        public final com.woocommerce.android.model.Order.ShippingLine copy(long itemId, @org.jetbrains.annotations.Nullable
        java.lang.String methodId, @org.jetbrains.annotations.NotNull
        java.lang.String methodTitle, @org.jetbrains.annotations.NotNull
        java.math.BigDecimal totalTax, @org.jetbrains.annotations.NotNull
        java.math.BigDecimal total) {
            return null;
        }
        
        @java.lang.Override
        public boolean equals(@org.jetbrains.annotations.Nullable
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override
        public int hashCode() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull
        @java.lang.Override
        public java.lang.String toString() {
            return null;
        }
        
        public ShippingLine(long itemId, @org.jetbrains.annotations.Nullable
        java.lang.String methodId, @org.jetbrains.annotations.NotNull
        java.lang.String methodTitle, @org.jetbrains.annotations.NotNull
        java.math.BigDecimal totalTax, @org.jetbrains.annotations.NotNull
        java.math.BigDecimal total) {
            super();
        }
        
        public final long component1() {
            return 0L;
        }
        
        public final long getItemId() {
            return 0L;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.String component2() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.String getMethodId() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String component3() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getMethodTitle() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.math.BigDecimal component4() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.math.BigDecimal getTotalTax() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.math.BigDecimal component5() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.math.BigDecimal getTotal() {
            return null;
        }
        
        public ShippingLine(@org.jetbrains.annotations.NotNull
        java.lang.String methodId, @org.jetbrains.annotations.NotNull
        java.lang.String methodTitle, @org.jetbrains.annotations.NotNull
        java.math.BigDecimal total) {
            super();
        }
        
        @java.lang.Override
        public int describeContents() {
            return 0;
        }
        
        @java.lang.Override
        public void writeToParcel(@org.jetbrains.annotations.NotNull
        android.os.Parcel parcel, int flags) {
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 3)
        public static final class Creator implements android.os.Parcelable.Creator<com.woocommerce.android.model.Order.ShippingLine> {
            
            public Creator() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull
            @java.lang.Override
            public final com.woocommerce.android.model.Order.ShippingLine createFromParcel(@org.jetbrains.annotations.NotNull
            android.os.Parcel in) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull
            @java.lang.Override
            public final com.woocommerce.android.model.Order.ShippingLine[] newArray(int size) {
                return null;
            }
        }
    }
    
    @kotlinx.parcelize.Parcelize
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\n\u00a2\u0006\u0002\u0010\u000bJ\t\u0010\u0015\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0016\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0017\u001a\u00020\u0007H\u00c6\u0003J\t\u0010\u0018\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0019\u001a\u00020\nH\u00c6\u0003J;\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\nH\u00c6\u0001J\t\u0010\u001b\u001a\u00020\u001cH\u00d6\u0001J\u0013\u0010\u001d\u001a\u00020\u00072\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u00d6\u0003J\t\u0010 \u001a\u00020\u001cH\u00d6\u0001J\t\u0010!\u001a\u00020\u0005H\u00d6\u0001J\u0019\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u001cH\u00d6\u0001R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\b\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011\u00a8\u0006\'"}, d2 = {"Lcom/woocommerce/android/model/Order$TaxLine;", "Landroid/os/Parcelable;", "id", "", "label", "", "compound", "", "taxTotal", "ratePercent", "", "(JLjava/lang/String;ZLjava/lang/String;F)V", "getCompound", "()Z", "getId", "()J", "getLabel", "()Ljava/lang/String;", "getRatePercent", "()F", "getTaxTotal", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "WooCommerce_wasabiDebug"})
    public static final class TaxLine implements android.os.Parcelable {
        private final long id = 0L;
        @org.jetbrains.annotations.NotNull
        private final java.lang.String label = null;
        private final boolean compound = false;
        @org.jetbrains.annotations.NotNull
        private final java.lang.String taxTotal = null;
        private final float ratePercent = 0.0F;
        public static final android.os.Parcelable.Creator<com.woocommerce.android.model.Order.TaxLine> CREATOR = null;
        
        @org.jetbrains.annotations.NotNull
        public final com.woocommerce.android.model.Order.TaxLine copy(long id, @org.jetbrains.annotations.NotNull
        java.lang.String label, boolean compound, @org.jetbrains.annotations.NotNull
        java.lang.String taxTotal, float ratePercent) {
            return null;
        }
        
        @java.lang.Override
        public boolean equals(@org.jetbrains.annotations.Nullable
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override
        public int hashCode() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull
        @java.lang.Override
        public java.lang.String toString() {
            return null;
        }
        
        public TaxLine(long id, @org.jetbrains.annotations.NotNull
        java.lang.String label, boolean compound, @org.jetbrains.annotations.NotNull
        java.lang.String taxTotal, float ratePercent) {
            super();
        }
        
        public final long component1() {
            return 0L;
        }
        
        public final long getId() {
            return 0L;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getLabel() {
            return null;
        }
        
        public final boolean component3() {
            return false;
        }
        
        public final boolean getCompound() {
            return false;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String component4() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getTaxTotal() {
            return null;
        }
        
        public final float component5() {
            return 0.0F;
        }
        
        public final float getRatePercent() {
            return 0.0F;
        }
        
        @java.lang.Override
        public int describeContents() {
            return 0;
        }
        
        @java.lang.Override
        public void writeToParcel(@org.jetbrains.annotations.NotNull
        android.os.Parcel parcel, int flags) {
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 3)
        public static final class Creator implements android.os.Parcelable.Creator<com.woocommerce.android.model.Order.TaxLine> {
            
            public Creator() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull
            @java.lang.Override
            public final com.woocommerce.android.model.Order.TaxLine createFromParcel(@org.jetbrains.annotations.NotNull
            android.os.Parcel in) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull
            @java.lang.Override
            public final com.woocommerce.android.model.Order.TaxLine[] newArray(int size) {
                return null;
            }
        }
    }
    
    @kotlinx.parcelize.Parcelize
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 $2\u00020\u0001:\u0001$B\'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\t\u0010\u0013\u001a\u00020\u0007H\u00c6\u0003J\t\u0010\u0014\u001a\u00020\u0007H\u00c6\u0003J3\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0007H\u00c6\u0001J\t\u0010\u0016\u001a\u00020\u0017H\u00d6\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u00d6\u0003J\u0006\u0010\u001c\u001a\u00020\u0007J\t\u0010\u001d\u001a\u00020\u0017H\u00d6\u0001J\t\u0010\u001e\u001a\u00020\u0005H\u00d6\u0001J\u0019\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u0017H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\b\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000f\u00a8\u0006%"}, d2 = {"Lcom/woocommerce/android/model/Order$FeeLine;", "Landroid/os/Parcelable;", "id", "", "name", "", "total", "Ljava/math/BigDecimal;", "totalTax", "(JLjava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;)V", "getId", "()J", "getName", "()Ljava/lang/String;", "getTotal", "()Ljava/math/BigDecimal;", "getTotalTax", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "", "other", "", "getTotalValue", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Companion", "WooCommerce_wasabiDebug"})
    public static final class FeeLine implements android.os.Parcelable {
        private final long id = 0L;
        @org.jetbrains.annotations.Nullable
        private final java.lang.String name = null;
        @org.jetbrains.annotations.NotNull
        private final java.math.BigDecimal total = null;
        @org.jetbrains.annotations.NotNull
        private final java.math.BigDecimal totalTax = null;
        @org.jetbrains.annotations.NotNull
        public static final com.woocommerce.android.model.Order.FeeLine.Companion Companion = null;
        @org.jetbrains.annotations.NotNull
        private static final com.woocommerce.android.model.Order.FeeLine EMPTY = null;
        public static final android.os.Parcelable.Creator<com.woocommerce.android.model.Order.FeeLine> CREATOR = null;
        
        @org.jetbrains.annotations.NotNull
        public final com.woocommerce.android.model.Order.FeeLine copy(long id, @org.jetbrains.annotations.Nullable
        java.lang.String name, @org.jetbrains.annotations.NotNull
        java.math.BigDecimal total, @org.jetbrains.annotations.NotNull
        java.math.BigDecimal totalTax) {
            return null;
        }
        
        @java.lang.Override
        public boolean equals(@org.jetbrains.annotations.Nullable
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override
        public int hashCode() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull
        @java.lang.Override
        public java.lang.String toString() {
            return null;
        }
        
        public FeeLine(long id, @org.jetbrains.annotations.Nullable
        java.lang.String name, @org.jetbrains.annotations.NotNull
        java.math.BigDecimal total, @org.jetbrains.annotations.NotNull
        java.math.BigDecimal totalTax) {
            super();
        }
        
        public final long component1() {
            return 0L;
        }
        
        public final long getId() {
            return 0L;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.String component2() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.String getName() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.math.BigDecimal component3() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.math.BigDecimal getTotal() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.math.BigDecimal component4() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.math.BigDecimal getTotalTax() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.math.BigDecimal getTotalValue() {
            return null;
        }
        
        @java.lang.Override
        public int describeContents() {
            return 0;
        }
        
        @java.lang.Override
        public void writeToParcel(@org.jetbrains.annotations.NotNull
        android.os.Parcel parcel, int flags) {
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 3)
        public static final class Creator implements android.os.Parcelable.Creator<com.woocommerce.android.model.Order.FeeLine> {
            
            public Creator() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull
            @java.lang.Override
            public final com.woocommerce.android.model.Order.FeeLine createFromParcel(@org.jetbrains.annotations.NotNull
            android.os.Parcel in) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull
            @java.lang.Override
            public final com.woocommerce.android.model.Order.FeeLine[] newArray(int size) {
                return null;
            }
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/woocommerce/android/model/Order$FeeLine$Companion;", "", "()V", "EMPTY", "Lcom/woocommerce/android/model/Order$FeeLine;", "getEMPTY", "()Lcom/woocommerce/android/model/Order$FeeLine;", "WooCommerce_wasabiDebug"})
        public static final class Companion {
            
            private Companion() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull
            public final com.woocommerce.android.model.Order.FeeLine getEMPTY() {
                return null;
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \t2\u00020\u0001:\t\b\t\n\u000b\f\r\u000e\u000f\u0010B\u000f\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\u0003H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\b\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u00a8\u0006\u0019"}, d2 = {"Lcom/woocommerce/android/model/Order$Status;", "Landroid/os/Parcelable;", "value", "", "(Ljava/lang/String;)V", "getValue", "()Ljava/lang/String;", "toString", "Cancelled", "Companion", "Completed", "Custom", "Failed", "OnHold", "Pending", "Processing", "Refunded", "Lcom/woocommerce/android/model/Order$Status$Pending;", "Lcom/woocommerce/android/model/Order$Status$Processing;", "Lcom/woocommerce/android/model/Order$Status$OnHold;", "Lcom/woocommerce/android/model/Order$Status$Completed;", "Lcom/woocommerce/android/model/Order$Status$Cancelled;", "Lcom/woocommerce/android/model/Order$Status$Refunded;", "Lcom/woocommerce/android/model/Order$Status$Failed;", "Lcom/woocommerce/android/model/Order$Status$Custom;", "WooCommerce_wasabiDebug"})
    public static abstract class Status implements android.os.Parcelable {
        @org.jetbrains.annotations.NotNull
        private final java.lang.String value = null;
        @org.jetbrains.annotations.NotNull
        public static final com.woocommerce.android.model.Order.Status.Companion Companion = null;
        @org.jetbrains.annotations.NotNull
        public static final java.lang.String AUTO_DRAFT = "auto-draft";
        
        private Status(java.lang.String value) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getValue() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        @java.lang.Override
        public java.lang.String toString() {
            return null;
        }
        
        @kotlinx.parcelize.Parcelize
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004H\u00d6\u0001J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004H\u00d6\u0001\u00a8\u0006\n"}, d2 = {"Lcom/woocommerce/android/model/Order$Status$Pending;", "Lcom/woocommerce/android/model/Order$Status;", "()V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "WooCommerce_wasabiDebug"})
        public static final class Pending extends com.woocommerce.android.model.Order.Status {
            @org.jetbrains.annotations.NotNull
            public static final com.woocommerce.android.model.Order.Status.Pending INSTANCE = null;
            public static final android.os.Parcelable.Creator<com.woocommerce.android.model.Order.Status.Pending> CREATOR = null;
            
            private Pending() {
                super(null);
            }
            
            @java.lang.Override
            public int describeContents() {
                return 0;
            }
            
            @java.lang.Override
            public void writeToParcel(@org.jetbrains.annotations.NotNull
            android.os.Parcel parcel, int flags) {
            }
            
            @kotlin.Metadata(mv = {1, 6, 0}, k = 3)
            public static final class Creator implements android.os.Parcelable.Creator<com.woocommerce.android.model.Order.Status.Pending> {
                
                public Creator() {
                    super();
                }
                
                @org.jetbrains.annotations.NotNull
                @java.lang.Override
                public final com.woocommerce.android.model.Order.Status.Pending createFromParcel(@org.jetbrains.annotations.NotNull
                android.os.Parcel in) {
                    return null;
                }
                
                @org.jetbrains.annotations.NotNull
                @java.lang.Override
                public final com.woocommerce.android.model.Order.Status.Pending[] newArray(int size) {
                    return null;
                }
            }
        }
        
        @kotlinx.parcelize.Parcelize
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004H\u00d6\u0001J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004H\u00d6\u0001\u00a8\u0006\n"}, d2 = {"Lcom/woocommerce/android/model/Order$Status$Processing;", "Lcom/woocommerce/android/model/Order$Status;", "()V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "WooCommerce_wasabiDebug"})
        public static final class Processing extends com.woocommerce.android.model.Order.Status {
            @org.jetbrains.annotations.NotNull
            public static final com.woocommerce.android.model.Order.Status.Processing INSTANCE = null;
            public static final android.os.Parcelable.Creator<com.woocommerce.android.model.Order.Status.Processing> CREATOR = null;
            
            private Processing() {
                super(null);
            }
            
            @java.lang.Override
            public int describeContents() {
                return 0;
            }
            
            @java.lang.Override
            public void writeToParcel(@org.jetbrains.annotations.NotNull
            android.os.Parcel parcel, int flags) {
            }
            
            @kotlin.Metadata(mv = {1, 6, 0}, k = 3)
            public static final class Creator implements android.os.Parcelable.Creator<com.woocommerce.android.model.Order.Status.Processing> {
                
                public Creator() {
                    super();
                }
                
                @org.jetbrains.annotations.NotNull
                @java.lang.Override
                public final com.woocommerce.android.model.Order.Status.Processing createFromParcel(@org.jetbrains.annotations.NotNull
                android.os.Parcel in) {
                    return null;
                }
                
                @org.jetbrains.annotations.NotNull
                @java.lang.Override
                public final com.woocommerce.android.model.Order.Status.Processing[] newArray(int size) {
                    return null;
                }
            }
        }
        
        @kotlinx.parcelize.Parcelize
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004H\u00d6\u0001J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004H\u00d6\u0001\u00a8\u0006\n"}, d2 = {"Lcom/woocommerce/android/model/Order$Status$OnHold;", "Lcom/woocommerce/android/model/Order$Status;", "()V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "WooCommerce_wasabiDebug"})
        public static final class OnHold extends com.woocommerce.android.model.Order.Status {
            @org.jetbrains.annotations.NotNull
            public static final com.woocommerce.android.model.Order.Status.OnHold INSTANCE = null;
            public static final android.os.Parcelable.Creator<com.woocommerce.android.model.Order.Status.OnHold> CREATOR = null;
            
            private OnHold() {
                super(null);
            }
            
            @java.lang.Override
            public int describeContents() {
                return 0;
            }
            
            @java.lang.Override
            public void writeToParcel(@org.jetbrains.annotations.NotNull
            android.os.Parcel parcel, int flags) {
            }
            
            @kotlin.Metadata(mv = {1, 6, 0}, k = 3)
            public static final class Creator implements android.os.Parcelable.Creator<com.woocommerce.android.model.Order.Status.OnHold> {
                
                public Creator() {
                    super();
                }
                
                @org.jetbrains.annotations.NotNull
                @java.lang.Override
                public final com.woocommerce.android.model.Order.Status.OnHold createFromParcel(@org.jetbrains.annotations.NotNull
                android.os.Parcel in) {
                    return null;
                }
                
                @org.jetbrains.annotations.NotNull
                @java.lang.Override
                public final com.woocommerce.android.model.Order.Status.OnHold[] newArray(int size) {
                    return null;
                }
            }
        }
        
        @kotlinx.parcelize.Parcelize
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004H\u00d6\u0001J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004H\u00d6\u0001\u00a8\u0006\n"}, d2 = {"Lcom/woocommerce/android/model/Order$Status$Completed;", "Lcom/woocommerce/android/model/Order$Status;", "()V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "WooCommerce_wasabiDebug"})
        public static final class Completed extends com.woocommerce.android.model.Order.Status {
            @org.jetbrains.annotations.NotNull
            public static final com.woocommerce.android.model.Order.Status.Completed INSTANCE = null;
            public static final android.os.Parcelable.Creator<com.woocommerce.android.model.Order.Status.Completed> CREATOR = null;
            
            private Completed() {
                super(null);
            }
            
            @java.lang.Override
            public int describeContents() {
                return 0;
            }
            
            @java.lang.Override
            public void writeToParcel(@org.jetbrains.annotations.NotNull
            android.os.Parcel parcel, int flags) {
            }
            
            @kotlin.Metadata(mv = {1, 6, 0}, k = 3)
            public static final class Creator implements android.os.Parcelable.Creator<com.woocommerce.android.model.Order.Status.Completed> {
                
                public Creator() {
                    super();
                }
                
                @org.jetbrains.annotations.NotNull
                @java.lang.Override
                public final com.woocommerce.android.model.Order.Status.Completed createFromParcel(@org.jetbrains.annotations.NotNull
                android.os.Parcel in) {
                    return null;
                }
                
                @org.jetbrains.annotations.NotNull
                @java.lang.Override
                public final com.woocommerce.android.model.Order.Status.Completed[] newArray(int size) {
                    return null;
                }
            }
        }
        
        @kotlinx.parcelize.Parcelize
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004H\u00d6\u0001J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004H\u00d6\u0001\u00a8\u0006\n"}, d2 = {"Lcom/woocommerce/android/model/Order$Status$Cancelled;", "Lcom/woocommerce/android/model/Order$Status;", "()V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "WooCommerce_wasabiDebug"})
        public static final class Cancelled extends com.woocommerce.android.model.Order.Status {
            @org.jetbrains.annotations.NotNull
            public static final com.woocommerce.android.model.Order.Status.Cancelled INSTANCE = null;
            public static final android.os.Parcelable.Creator<com.woocommerce.android.model.Order.Status.Cancelled> CREATOR = null;
            
            private Cancelled() {
                super(null);
            }
            
            @java.lang.Override
            public int describeContents() {
                return 0;
            }
            
            @java.lang.Override
            public void writeToParcel(@org.jetbrains.annotations.NotNull
            android.os.Parcel parcel, int flags) {
            }
            
            @kotlin.Metadata(mv = {1, 6, 0}, k = 3)
            public static final class Creator implements android.os.Parcelable.Creator<com.woocommerce.android.model.Order.Status.Cancelled> {
                
                public Creator() {
                    super();
                }
                
                @org.jetbrains.annotations.NotNull
                @java.lang.Override
                public final com.woocommerce.android.model.Order.Status.Cancelled createFromParcel(@org.jetbrains.annotations.NotNull
                android.os.Parcel in) {
                    return null;
                }
                
                @org.jetbrains.annotations.NotNull
                @java.lang.Override
                public final com.woocommerce.android.model.Order.Status.Cancelled[] newArray(int size) {
                    return null;
                }
            }
        }
        
        @kotlinx.parcelize.Parcelize
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004H\u00d6\u0001J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004H\u00d6\u0001\u00a8\u0006\n"}, d2 = {"Lcom/woocommerce/android/model/Order$Status$Refunded;", "Lcom/woocommerce/android/model/Order$Status;", "()V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "WooCommerce_wasabiDebug"})
        public static final class Refunded extends com.woocommerce.android.model.Order.Status {
            @org.jetbrains.annotations.NotNull
            public static final com.woocommerce.android.model.Order.Status.Refunded INSTANCE = null;
            public static final android.os.Parcelable.Creator<com.woocommerce.android.model.Order.Status.Refunded> CREATOR = null;
            
            private Refunded() {
                super(null);
            }
            
            @java.lang.Override
            public int describeContents() {
                return 0;
            }
            
            @java.lang.Override
            public void writeToParcel(@org.jetbrains.annotations.NotNull
            android.os.Parcel parcel, int flags) {
            }
            
            @kotlin.Metadata(mv = {1, 6, 0}, k = 3)
            public static final class Creator implements android.os.Parcelable.Creator<com.woocommerce.android.model.Order.Status.Refunded> {
                
                public Creator() {
                    super();
                }
                
                @org.jetbrains.annotations.NotNull
                @java.lang.Override
                public final com.woocommerce.android.model.Order.Status.Refunded createFromParcel(@org.jetbrains.annotations.NotNull
                android.os.Parcel in) {
                    return null;
                }
                
                @org.jetbrains.annotations.NotNull
                @java.lang.Override
                public final com.woocommerce.android.model.Order.Status.Refunded[] newArray(int size) {
                    return null;
                }
            }
        }
        
        @kotlinx.parcelize.Parcelize
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004H\u00d6\u0001J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004H\u00d6\u0001\u00a8\u0006\n"}, d2 = {"Lcom/woocommerce/android/model/Order$Status$Failed;", "Lcom/woocommerce/android/model/Order$Status;", "()V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "WooCommerce_wasabiDebug"})
        public static final class Failed extends com.woocommerce.android.model.Order.Status {
            @org.jetbrains.annotations.NotNull
            public static final com.woocommerce.android.model.Order.Status.Failed INSTANCE = null;
            public static final android.os.Parcelable.Creator<com.woocommerce.android.model.Order.Status.Failed> CREATOR = null;
            
            private Failed() {
                super(null);
            }
            
            @java.lang.Override
            public int describeContents() {
                return 0;
            }
            
            @java.lang.Override
            public void writeToParcel(@org.jetbrains.annotations.NotNull
            android.os.Parcel parcel, int flags) {
            }
            
            @kotlin.Metadata(mv = {1, 6, 0}, k = 3)
            public static final class Creator implements android.os.Parcelable.Creator<com.woocommerce.android.model.Order.Status.Failed> {
                
                public Creator() {
                    super();
                }
                
                @org.jetbrains.annotations.NotNull
                @java.lang.Override
                public final com.woocommerce.android.model.Order.Status.Failed createFromParcel(@org.jetbrains.annotations.NotNull
                android.os.Parcel in) {
                    return null;
                }
                
                @org.jetbrains.annotations.NotNull
                @java.lang.Override
                public final com.woocommerce.android.model.Order.Status.Failed[] newArray(int size) {
                    return null;
                }
            }
        }
        
        @kotlinx.parcelize.Parcelize
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0005\u001a\u00020\u0003H\u00c2\u0003J\u0013\u0010\u0006\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\t\u0010\u0007\u001a\u00020\bH\u00d6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\bH\u00d6\u0001J\t\u0010\u000e\u001a\u00020\u0003H\u00d6\u0001J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\bH\u00d6\u0001R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lcom/woocommerce/android/model/Order$Status$Custom;", "Lcom/woocommerce/android/model/Order$Status;", "customValue", "", "(Ljava/lang/String;)V", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "WooCommerce_wasabiDebug"})
        public static final class Custom extends com.woocommerce.android.model.Order.Status {
            private final java.lang.String customValue = null;
            public static final android.os.Parcelable.Creator<com.woocommerce.android.model.Order.Status.Custom> CREATOR = null;
            
            @org.jetbrains.annotations.NotNull
            public final com.woocommerce.android.model.Order.Status.Custom copy(@org.jetbrains.annotations.NotNull
            java.lang.String customValue) {
                return null;
            }
            
            @java.lang.Override
            public boolean equals(@org.jetbrains.annotations.Nullable
            java.lang.Object other) {
                return false;
            }
            
            @java.lang.Override
            public int hashCode() {
                return 0;
            }
            
            @org.jetbrains.annotations.NotNull
            @java.lang.Override
            public java.lang.String toString() {
                return null;
            }
            
            public Custom(@org.jetbrains.annotations.NotNull
            java.lang.String customValue) {
                super(null);
            }
            
            private final java.lang.String component1() {
                return null;
            }
            
            @java.lang.Override
            public int describeContents() {
                return 0;
            }
            
            @java.lang.Override
            public void writeToParcel(@org.jetbrains.annotations.NotNull
            android.os.Parcel parcel, int flags) {
            }
            
            @kotlin.Metadata(mv = {1, 6, 0}, k = 3)
            public static final class Creator implements android.os.Parcelable.Creator<com.woocommerce.android.model.Order.Status.Custom> {
                
                public Creator() {
                    super();
                }
                
                @org.jetbrains.annotations.NotNull
                @java.lang.Override
                public final com.woocommerce.android.model.Order.Status.Custom createFromParcel(@org.jetbrains.annotations.NotNull
                android.os.Parcel in) {
                    return null;
                }
                
                @org.jetbrains.annotations.NotNull
                @java.lang.Override
                public final com.woocommerce.android.model.Order.Status.Custom[] newArray(int size) {
                    return null;
                }
            }
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\u000e\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/woocommerce/android/model/Order$Status$Companion;", "", "()V", "AUTO_DRAFT", "", "fromDataModel", "Lcom/woocommerce/android/model/Order$Status;", "status", "Lorg/wordpress/android/fluxc/network/rest/wpcom/wc/order/CoreOrderStatus;", "fromValue", "value", "WooCommerce_wasabiDebug"})
        public static final class Companion {
            
            private Companion() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull
            public final com.woocommerce.android.model.Order.Status fromValue(@org.jetbrains.annotations.NotNull
            java.lang.String value) {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable
            public final com.woocommerce.android.model.Order.Status fromDataModel(@org.jetbrains.annotations.Nullable
            org.wordpress.android.fluxc.network.rest.wpcom.wc.order.CoreOrderStatus status) {
                return null;
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\t\u001a\u00020\u00048F\u00a2\u0006\u0006\u001a\u0004\b\n\u0010\u0006\u00a8\u0006\u000b"}, d2 = {"Lcom/woocommerce/android/model/Order$Companion;", "", "()V", "DEFAULT_EMPTY_ORDER", "Lcom/woocommerce/android/model/Order;", "getDEFAULT_EMPTY_ORDER", "()Lcom/woocommerce/android/model/Order;", "DEFAULT_EMPTY_ORDER$delegate", "Lkotlin/Lazy;", "EMPTY", "getEMPTY", "WooCommerce_wasabiDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        private final com.woocommerce.android.model.Order getDEFAULT_EMPTY_ORDER() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.woocommerce.android.model.Order getEMPTY() {
            return null;
        }
    }
}