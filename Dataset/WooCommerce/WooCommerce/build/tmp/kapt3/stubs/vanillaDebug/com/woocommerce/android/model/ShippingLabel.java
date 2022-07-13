package com.woocommerce.android.model;

import java.lang.System;

@kotlinx.parcelize.Parcelize()
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b/\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001bB\u00d5\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\f\u001a\u00020\u0005\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0005\u0012\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00050\u0012\u0012\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\u0012\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0018\u0012\u000e\b\u0002\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0012\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u001cJ\t\u0010C\u001a\u00020\u0003H\u00c6\u0003J\t\u0010D\u001a\u00020\u000eH\u00c6\u0003J\t\u0010E\u001a\u00020\u0005H\u00c6\u0003J\u000f\u0010F\u001a\b\u0012\u0004\u0012\u00020\u00050\u0012H\u00c6\u0003J\u000f\u0010G\u001a\b\u0012\u0004\u0012\u00020\u00030\u0012H\u00c6\u0003J\u000b\u0010H\u001a\u0004\u0018\u00010\u0015H\u00c6\u0003J\u000b\u0010I\u001a\u0004\u0018\u00010\u0015H\u00c6\u0003J\u000b\u0010J\u001a\u0004\u0018\u00010\u0018H\u00c6\u0003J\u000f\u0010K\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0012H\u00c6\u0003J\u000b\u0010L\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\t\u0010M\u001a\u00020\u0005H\u00c6\u0003J\t\u0010N\u001a\u00020\u0005H\u00c6\u0003J\t\u0010O\u001a\u00020\u0005H\u00c6\u0003J\t\u0010P\u001a\u00020\u0005H\u00c6\u0003J\u000b\u0010Q\u001a\u0004\u0018\u00010\nH\u00c6\u0003J\u000b\u0010R\u001a\u0004\u0018\u00010\nH\u00c6\u0003J\t\u0010S\u001a\u00020\u0005H\u00c6\u0003J\t\u0010T\u001a\u00020\u000eH\u00c6\u0003J\u00db\u0001\u0010U\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\f\u001a\u00020\u00052\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u00052\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00050\u00122\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\u00122\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00182\u000e\b\u0002\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00122\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0005H\u00c6\u0001J\t\u0010V\u001a\u00020WH\u00d6\u0001J\u0013\u0010X\u001a\u00020\'2\b\u0010Y\u001a\u0004\u0018\u00010ZH\u00d6\u0003J\t\u0010[\u001a\u00020WH\u00d6\u0001J\t\u0010\\\u001a\u00020\u0005H\u00d6\u0001J\u0019\u0010]\u001a\u00020^2\u0006\u0010_\u001a\u00020`2\u0006\u0010a\u001a\u00020WH\u00d6\u0001R\u0011\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010\u001b\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001eR\u0013\u0010\t\u001a\u0004\u0018\u00010\n\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0011\u0010\u0010\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001eR\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\n\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010!R\u0011\u0010&\u001a\u00020\'8F\u00a2\u0006\u0006\u001a\u0004\b(\u0010)R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0017\u0010,\u001a\u00020\'8F\u00a2\u0006\f\u0012\u0004\b-\u0010.\u001a\u0004\b,\u0010)R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0015\u00a2\u0006\b\n\u0000\u001a\u0004\b/\u0010$R\u0011\u0010\f\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b0\u0010\u001eR\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\u0012\u00a2\u0006\b\n\u0000\u001a\u0004\b1\u00102R\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00050\u0012\u00a2\u0006\b\n\u0000\u001a\u0004\b3\u00102R\u0017\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0012\u00a2\u0006\b\n\u0000\u001a\u0004\b4\u00102R\u0011\u0010\r\u001a\u00020\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b5\u00106R\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u0018\u00a2\u0006\b\n\u0000\u001a\u0004\b7\u00108R\u0019\u00109\u001a\u0004\u0018\u00010\n8F\u00a2\u0006\f\u0012\u0004\b:\u0010.\u001a\u0004\b;\u0010!R\u0011\u0010\u000f\u001a\u00020\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b<\u00106R\u0011\u0010\u0007\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b=\u0010\u001eR\u0011\u0010\b\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b>\u0010\u001eR\u0017\u0010?\u001a\u00020\u00058F\u00a2\u0006\f\u0012\u0004\b@\u0010.\u001a\u0004\bA\u0010\u001eR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\bB\u0010\u001e\u00a8\u0006c"}, d2 = {"Lcom/woocommerce/android/model/ShippingLabel;", "Landroid/os/Parcelable;", "id", "", "trackingNumber", "", "carrierId", "serviceName", "status", "createdDate", "Ljava/util/Date;", "expiryDate", "packageName", "rate", "Ljava/math/BigDecimal;", "refundableAmount", "currency", "productNames", "", "productIds", "originAddress", "Lcom/woocommerce/android/model/Address;", "destinationAddress", "refund", "Lcom/woocommerce/android/model/ShippingLabel$Refund;", "products", "Lcom/woocommerce/android/model/Order$Item;", "commercialInvoiceUrl", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lcom/woocommerce/android/model/Address;Lcom/woocommerce/android/model/Address;Lcom/woocommerce/android/model/ShippingLabel$Refund;Ljava/util/List;Ljava/lang/String;)V", "getCarrierId", "()Ljava/lang/String;", "getCommercialInvoiceUrl", "getCreatedDate", "()Ljava/util/Date;", "getCurrency", "getDestinationAddress", "()Lcom/woocommerce/android/model/Address;", "getExpiryDate", "hasCommercialInvoice", "", "getHasCommercialInvoice", "()Z", "getId", "()J", "isAnonymized", "isAnonymized$annotations", "()V", "getOriginAddress", "getPackageName", "getProductIds", "()Ljava/util/List;", "getProductNames", "getProducts", "getRate", "()Ljava/math/BigDecimal;", "getRefund", "()Lcom/woocommerce/android/model/ShippingLabel$Refund;", "refundExpiryDate", "getRefundExpiryDate$annotations", "getRefundExpiryDate", "getRefundableAmount", "getServiceName", "getStatus", "trackingLink", "getTrackingLink$annotations", "getTrackingLink", "getTrackingNumber", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Refund", "WooCommerce_vanillaDebug"})
public final class ShippingLabel implements android.os.Parcelable {
    private final long id = 0L;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String trackingNumber = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String carrierId = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String serviceName = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String status = null;
    @org.jetbrains.annotations.Nullable()
    private final java.util.Date createdDate = null;
    @org.jetbrains.annotations.Nullable()
    private final java.util.Date expiryDate = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String packageName = null;
    @org.jetbrains.annotations.NotNull()
    private final java.math.BigDecimal rate = null;
    @org.jetbrains.annotations.NotNull()
    private final java.math.BigDecimal refundableAmount = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String currency = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<java.lang.String> productNames = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<java.lang.Long> productIds = null;
    @org.jetbrains.annotations.Nullable()
    private final com.woocommerce.android.model.Address originAddress = null;
    @org.jetbrains.annotations.Nullable()
    private final com.woocommerce.android.model.Address destinationAddress = null;
    @org.jetbrains.annotations.Nullable()
    private final com.woocommerce.android.model.ShippingLabel.Refund refund = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.woocommerce.android.model.Order.Item> products = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String commercialInvoiceUrl = null;
    public static final android.os.Parcelable.Creator<com.woocommerce.android.model.ShippingLabel> CREATOR = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.woocommerce.android.model.ShippingLabel copy(long id, @org.jetbrains.annotations.NotNull()
    java.lang.String trackingNumber, @org.jetbrains.annotations.NotNull()
    java.lang.String carrierId, @org.jetbrains.annotations.NotNull()
    java.lang.String serviceName, @org.jetbrains.annotations.NotNull()
    java.lang.String status, @org.jetbrains.annotations.Nullable()
    java.util.Date createdDate, @org.jetbrains.annotations.Nullable()
    java.util.Date expiryDate, @org.jetbrains.annotations.NotNull()
    java.lang.String packageName, @org.jetbrains.annotations.NotNull()
    java.math.BigDecimal rate, @org.jetbrains.annotations.NotNull()
    java.math.BigDecimal refundableAmount, @org.jetbrains.annotations.NotNull()
    java.lang.String currency, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> productNames, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.Long> productIds, @org.jetbrains.annotations.Nullable()
    com.woocommerce.android.model.Address originAddress, @org.jetbrains.annotations.Nullable()
    com.woocommerce.android.model.Address destinationAddress, @org.jetbrains.annotations.Nullable()
    com.woocommerce.android.model.ShippingLabel.Refund refund, @org.jetbrains.annotations.NotNull()
    java.util.List<com.woocommerce.android.model.Order.Item> products, @org.jetbrains.annotations.Nullable()
    java.lang.String commercialInvoiceUrl) {
        return null;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public ShippingLabel(long id, @org.jetbrains.annotations.NotNull()
    java.lang.String trackingNumber, @org.jetbrains.annotations.NotNull()
    java.lang.String carrierId, @org.jetbrains.annotations.NotNull()
    java.lang.String serviceName, @org.jetbrains.annotations.NotNull()
    java.lang.String status, @org.jetbrains.annotations.Nullable()
    java.util.Date createdDate, @org.jetbrains.annotations.Nullable()
    java.util.Date expiryDate, @org.jetbrains.annotations.NotNull()
    java.lang.String packageName, @org.jetbrains.annotations.NotNull()
    java.math.BigDecimal rate, @org.jetbrains.annotations.NotNull()
    java.math.BigDecimal refundableAmount, @org.jetbrains.annotations.NotNull()
    java.lang.String currency, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> productNames, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.Long> productIds, @org.jetbrains.annotations.Nullable()
    com.woocommerce.android.model.Address originAddress, @org.jetbrains.annotations.Nullable()
    com.woocommerce.android.model.Address destinationAddress, @org.jetbrains.annotations.Nullable()
    com.woocommerce.android.model.ShippingLabel.Refund refund, @org.jetbrains.annotations.NotNull()
    java.util.List<com.woocommerce.android.model.Order.Item> products, @org.jetbrains.annotations.Nullable()
    java.lang.String commercialInvoiceUrl) {
        super();
    }
    
    public final long component1() {
        return 0L;
    }
    
    public final long getId() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTrackingNumber() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCarrierId() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getServiceName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getStatus() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.Date component6() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.Date getCreatedDate() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.Date component7() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.Date getExpiryDate() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component8() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPackageName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.math.BigDecimal component9() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.math.BigDecimal getRate() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.math.BigDecimal component10() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.math.BigDecimal getRefundableAmount() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component11() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCurrency() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> component12() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> getProductNames() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.Long> component13() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.Long> getProductIds() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.woocommerce.android.model.Address component14() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.woocommerce.android.model.Address getOriginAddress() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.woocommerce.android.model.Address component15() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.woocommerce.android.model.Address getDestinationAddress() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.woocommerce.android.model.ShippingLabel.Refund component16() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.woocommerce.android.model.ShippingLabel.Refund getRefund() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.woocommerce.android.model.Order.Item> component17() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.woocommerce.android.model.Order.Item> getProducts() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component18() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getCommercialInvoiceUrl() {
        return null;
    }
    
    @kotlinx.parcelize.IgnoredOnParcel()
    @java.lang.Deprecated()
    public static void getTrackingLink$annotations() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTrackingLink() {
        return null;
    }
    
    /**
     * Checks if a label has been anonymized.
     * An label gets anonymized when the store owner request its data to be removed from the server, for privacy reasons
     */
    @kotlinx.parcelize.IgnoredOnParcel()
    @java.lang.Deprecated()
    public static void isAnonymized$annotations() {
    }
    
    public final boolean isAnonymized() {
        return false;
    }
    
    @kotlinx.parcelize.IgnoredOnParcel()
    @java.lang.Deprecated()
    public static void getRefundExpiryDate$annotations() {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.Date getRefundExpiryDate() {
        return null;
    }
    
    public final boolean getHasCommercialInvoice() {
        return false;
    }
    
    @java.lang.Override()
    public int describeContents() {
        return 0;
    }
    
    @java.lang.Override()
    public void writeToParcel(@org.jetbrains.annotations.NotNull()
    android.os.Parcel parcel, int flags) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 3)
    public static final class Creator implements android.os.Parcelable.Creator<com.woocommerce.android.model.ShippingLabel> {
        
        public Creator() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public final com.woocommerce.android.model.ShippingLabel createFromParcel(@org.jetbrains.annotations.NotNull()
        android.os.Parcel in) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public final com.woocommerce.android.model.ShippingLabel[] newArray(int size) {
            return null;
        }
    }
    
    @kotlinx.parcelize.Parcelize()
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u001f\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u00c6\u0001J\t\u0010\u000e\u001a\u00020\u000fH\u00d6\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u00d6\u0003J\t\u0010\u0014\u001a\u00020\u000fH\u00d6\u0001J\t\u0010\u0015\u001a\u00020\u0003H\u00d6\u0001J\u0019\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u000fH\u00d6\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u001b"}, d2 = {"Lcom/woocommerce/android/model/ShippingLabel$Refund;", "Landroid/os/Parcelable;", "status", "", "refundDate", "Ljava/util/Date;", "(Ljava/lang/String;Ljava/util/Date;)V", "getRefundDate", "()Ljava/util/Date;", "getStatus", "()Ljava/lang/String;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "WooCommerce_vanillaDebug"})
    public static final class Refund implements android.os.Parcelable {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String status = null;
        @org.jetbrains.annotations.Nullable()
        private final java.util.Date refundDate = null;
        public static final android.os.Parcelable.Creator<com.woocommerce.android.model.ShippingLabel.Refund> CREATOR = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.woocommerce.android.model.ShippingLabel.Refund copy(@org.jetbrains.annotations.NotNull()
        java.lang.String status, @org.jetbrains.annotations.Nullable()
        java.util.Date refundDate) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        public Refund(@org.jetbrains.annotations.NotNull()
        java.lang.String status, @org.jetbrains.annotations.Nullable()
        java.util.Date refundDate) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getStatus() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.util.Date component2() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.util.Date getRefundDate() {
            return null;
        }
        
        @java.lang.Override()
        public int describeContents() {
            return 0;
        }
        
        @java.lang.Override()
        public void writeToParcel(@org.jetbrains.annotations.NotNull()
        android.os.Parcel parcel, int flags) {
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 3)
        public static final class Creator implements android.os.Parcelable.Creator<com.woocommerce.android.model.ShippingLabel.Refund> {
            
            public Creator() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final com.woocommerce.android.model.ShippingLabel.Refund createFromParcel(@org.jetbrains.annotations.NotNull()
            android.os.Parcel in) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final com.woocommerce.android.model.ShippingLabel.Refund[] newArray(int size) {
                return null;
            }
        }
    }
}