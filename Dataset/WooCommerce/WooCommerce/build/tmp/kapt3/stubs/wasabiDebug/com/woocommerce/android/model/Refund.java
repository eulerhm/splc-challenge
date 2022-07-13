package com.woocommerce.android.model;

import java.lang.System;

@kotlinx.parcelize.Parcelize
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001:\u0003;<=BY\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\r\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\r\u00a2\u0006\u0002\u0010\u0013J\t\u0010\"\u001a\u00020\u0003H\u00c6\u0003J\t\u0010#\u001a\u00020\u0005H\u00c6\u0003J\t\u0010$\u001a\u00020\u0007H\u00c6\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\tH\u00c6\u0003J\t\u0010&\u001a\u00020\u000bH\u00c6\u0003J\u000f\u0010\'\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u00c6\u0003J\u000f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00100\rH\u00c6\u0003J\u000f\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00120\rH\u00c6\u0003Jm\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\r2\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\rH\u00c6\u0001J\t\u0010+\u001a\u00020,H\u00d6\u0001J\u0013\u0010-\u001a\u00020\u000b2\b\u0010.\u001a\u0004\u0018\u00010/H\u00d6\u0003J\u001e\u00100\u001a\u00020\t2\u0006\u00101\u001a\u00020\t2\u0006\u00102\u001a\u00020\u000b2\u0006\u00103\u001a\u00020\tJ\t\u00104\u001a\u00020,H\u00d6\u0001J\t\u00105\u001a\u00020\tH\u00d6\u0001J\u0019\u00106\u001a\u0002072\u0006\u00108\u001a\u0002092\u0006\u0010:\u001a\u00020,H\u00d6\u0001R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\n\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001bR\u0013\u0010\b\u001a\u0004\u0018\u00010\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\r\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001b\u00a8\u0006>"}, d2 = {"Lcom/woocommerce/android/model/Refund;", "Landroid/os/Parcelable;", "id", "", "dateCreated", "Ljava/util/Date;", "amount", "Ljava/math/BigDecimal;", "reason", "", "automaticGatewayRefund", "", "items", "", "Lcom/woocommerce/android/model/Refund$Item;", "shippingLines", "Lcom/woocommerce/android/model/Refund$ShippingLine;", "feeLines", "Lcom/woocommerce/android/model/Refund$FeeLine;", "(JLjava/util/Date;Ljava/math/BigDecimal;Ljava/lang/String;ZLjava/util/List;Ljava/util/List;Ljava/util/List;)V", "getAmount", "()Ljava/math/BigDecimal;", "getAutomaticGatewayRefund", "()Z", "getDateCreated", "()Ljava/util/Date;", "getFeeLines", "()Ljava/util/List;", "getId", "()J", "getItems", "getReason", "()Ljava/lang/String;", "getShippingLines", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "describeContents", "", "equals", "other", "", "getRefundMethod", "paymentMethodTitle", "isCashPayment", "defaultValue", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "FeeLine", "Item", "ShippingLine", "WooCommerce_wasabiDebug"})
public final class Refund implements android.os.Parcelable {
    private final long id = 0L;
    @org.jetbrains.annotations.NotNull
    private final java.util.Date dateCreated = null;
    @org.jetbrains.annotations.NotNull
    private final java.math.BigDecimal amount = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String reason = null;
    private final boolean automaticGatewayRefund = false;
    @org.jetbrains.annotations.NotNull
    private final java.util.List<com.woocommerce.android.model.Refund.Item> items = null;
    @org.jetbrains.annotations.NotNull
    private final java.util.List<com.woocommerce.android.model.Refund.ShippingLine> shippingLines = null;
    @org.jetbrains.annotations.NotNull
    private final java.util.List<com.woocommerce.android.model.Refund.FeeLine> feeLines = null;
    public static final android.os.Parcelable.Creator<com.woocommerce.android.model.Refund> CREATOR = null;
    
    @org.jetbrains.annotations.NotNull
    public final com.woocommerce.android.model.Refund copy(long id, @org.jetbrains.annotations.NotNull
    java.util.Date dateCreated, @org.jetbrains.annotations.NotNull
    java.math.BigDecimal amount, @org.jetbrains.annotations.Nullable
    java.lang.String reason, boolean automaticGatewayRefund, @org.jetbrains.annotations.NotNull
    java.util.List<com.woocommerce.android.model.Refund.Item> items, @org.jetbrains.annotations.NotNull
    java.util.List<com.woocommerce.android.model.Refund.ShippingLine> shippingLines, @org.jetbrains.annotations.NotNull
    java.util.List<com.woocommerce.android.model.Refund.FeeLine> feeLines) {
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
    
    public Refund(long id, @org.jetbrains.annotations.NotNull
    java.util.Date dateCreated, @org.jetbrains.annotations.NotNull
    java.math.BigDecimal amount, @org.jetbrains.annotations.Nullable
    java.lang.String reason, boolean automaticGatewayRefund, @org.jetbrains.annotations.NotNull
    java.util.List<com.woocommerce.android.model.Refund.Item> items, @org.jetbrains.annotations.NotNull
    java.util.List<com.woocommerce.android.model.Refund.ShippingLine> shippingLines, @org.jetbrains.annotations.NotNull
    java.util.List<com.woocommerce.android.model.Refund.FeeLine> feeLines) {
        super();
    }
    
    public final long component1() {
        return 0L;
    }
    
    public final long getId() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.Date component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.Date getDateCreated() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.math.BigDecimal component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.math.BigDecimal getAmount() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getReason() {
        return null;
    }
    
    public final boolean component5() {
        return false;
    }
    
    public final boolean getAutomaticGatewayRefund() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.woocommerce.android.model.Refund.Item> component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.woocommerce.android.model.Refund.Item> getItems() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.woocommerce.android.model.Refund.ShippingLine> component7() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.woocommerce.android.model.Refund.ShippingLine> getShippingLines() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.woocommerce.android.model.Refund.FeeLine> component8() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.woocommerce.android.model.Refund.FeeLine> getFeeLines() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getRefundMethod(@org.jetbrains.annotations.NotNull
    java.lang.String paymentMethodTitle, boolean isCashPayment, @org.jetbrains.annotations.NotNull
    java.lang.String defaultValue) {
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
    public static final class Creator implements android.os.Parcelable.Creator<com.woocommerce.android.model.Refund> {
        
        public Creator() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        @java.lang.Override
        public final com.woocommerce.android.model.Refund createFromParcel(@org.jetbrains.annotations.NotNull
        android.os.Parcel in) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        @java.lang.Override
        public final com.woocommerce.android.model.Refund[] newArray(int size) {
            return null;
        }
    }
    
    @kotlinx.parcelize.Parcelize
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\'\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bo\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\b\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0011J\t\u0010%\u001a\u00020\u0003H\u00c6\u0003J\t\u0010&\u001a\u00020\u000bH\u00c6\u0003J\t\u0010\'\u001a\u00020\u0003H\u00c6\u0003J\t\u0010(\u001a\u00020\u0005H\u00c6\u0003J\t\u0010)\u001a\u00020\u0003H\u00c6\u0003J\t\u0010*\u001a\u00020\bH\u00c6\u0003J\t\u0010+\u001a\u00020\u0003H\u00c6\u0003J\t\u0010,\u001a\u00020\u000bH\u00c6\u0003J\t\u0010-\u001a\u00020\u000bH\u00c6\u0003J\t\u0010.\u001a\u00020\u000bH\u00c6\u0003J\t\u0010/\u001a\u00020\bH\u00c6\u0003Jw\u00100\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\b2\b\b\u0002\u0010\u000f\u001a\u00020\u000b2\b\b\u0002\u0010\u0010\u001a\u00020\u0003H\u00c6\u0001J\t\u00101\u001a\u00020\u0005H\u00d6\u0001J\u0013\u00102\u001a\u0002032\b\u00104\u001a\u0004\u0018\u000105H\u00d6\u0003J\t\u00106\u001a\u00020\u0005H\u00d6\u0001J\t\u00107\u001a\u00020\bH\u00d6\u0001J\u0019\u00108\u001a\u0002092\u0006\u0010:\u001a\u00020;2\u0006\u0010<\u001a\u00020\u0005H\u00d6\u0001R\u0011\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0010\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0013R\u0011\u0010\u000f\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u000e\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0015R\u0011\u0010\n\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0018R\u0011\u0010\f\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0018R\u0011\u0010\r\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0018R\u0017\u0010 \u001a\u00020\u0003\u00a2\u0006\u000e\n\u0000\u0012\u0004\b!\u0010\"\u001a\u0004\b#\u0010\u0013R\u0011\u0010\t\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0013\u00a8\u0006="}, d2 = {"Lcom/woocommerce/android/model/Refund$Item;", "Landroid/os/Parcelable;", "productId", "", "quantity", "", "id", "name", "", "variationId", "subtotal", "Ljava/math/BigDecimal;", "total", "totalTax", "sku", "price", "orderItemId", "(JIJLjava/lang/String;JLjava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/math/BigDecimal;J)V", "getId", "()J", "getName", "()Ljava/lang/String;", "getOrderItemId", "getPrice", "()Ljava/math/BigDecimal;", "getProductId", "getQuantity", "()I", "getSku", "getSubtotal", "getTotal", "getTotalTax", "uniqueId", "getUniqueId$annotations", "()V", "getUniqueId", "getVariationId", "component1", "component10", "component11", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "WooCommerce_wasabiDebug"})
    public static final class Item implements android.os.Parcelable {
        private final long productId = 0L;
        private final int quantity = 0;
        private final long id = 0L;
        @org.jetbrains.annotations.NotNull
        private final java.lang.String name = null;
        private final long variationId = 0L;
        @org.jetbrains.annotations.NotNull
        private final java.math.BigDecimal subtotal = null;
        @org.jetbrains.annotations.NotNull
        private final java.math.BigDecimal total = null;
        @org.jetbrains.annotations.NotNull
        private final java.math.BigDecimal totalTax = null;
        @org.jetbrains.annotations.NotNull
        private final java.lang.String sku = null;
        @org.jetbrains.annotations.NotNull
        private final java.math.BigDecimal price = null;
        private final long orderItemId = 0L;
        private final long uniqueId = 0L;
        public static final android.os.Parcelable.Creator<com.woocommerce.android.model.Refund.Item> CREATOR = null;
        
        @org.jetbrains.annotations.NotNull
        public final com.woocommerce.android.model.Refund.Item copy(long productId, int quantity, long id, @org.jetbrains.annotations.NotNull
        java.lang.String name, long variationId, @org.jetbrains.annotations.NotNull
        java.math.BigDecimal subtotal, @org.jetbrains.annotations.NotNull
        java.math.BigDecimal total, @org.jetbrains.annotations.NotNull
        java.math.BigDecimal totalTax, @org.jetbrains.annotations.NotNull
        java.lang.String sku, @org.jetbrains.annotations.NotNull
        java.math.BigDecimal price, long orderItemId) {
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
        
        public Item(long productId, int quantity, long id, @org.jetbrains.annotations.NotNull
        java.lang.String name, long variationId, @org.jetbrains.annotations.NotNull
        java.math.BigDecimal subtotal, @org.jetbrains.annotations.NotNull
        java.math.BigDecimal total, @org.jetbrains.annotations.NotNull
        java.math.BigDecimal totalTax, @org.jetbrains.annotations.NotNull
        java.lang.String sku, @org.jetbrains.annotations.NotNull
        java.math.BigDecimal price, long orderItemId) {
            super();
        }
        
        public final long component1() {
            return 0L;
        }
        
        public final long getProductId() {
            return 0L;
        }
        
        public final int component2() {
            return 0;
        }
        
        public final int getQuantity() {
            return 0;
        }
        
        public final long component3() {
            return 0L;
        }
        
        public final long getId() {
            return 0L;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String component4() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getName() {
            return null;
        }
        
        public final long component5() {
            return 0L;
        }
        
        public final long getVariationId() {
            return 0L;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.math.BigDecimal component6() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.math.BigDecimal getSubtotal() {
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
        public final java.math.BigDecimal getTotalTax() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String component9() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getSku() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.math.BigDecimal component10() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.math.BigDecimal getPrice() {
            return null;
        }
        
        public final long component11() {
            return 0L;
        }
        
        public final long getOrderItemId() {
            return 0L;
        }
        
        public final long getUniqueId() {
            return 0L;
        }
        
        @kotlinx.parcelize.IgnoredOnParcel
        @java.lang.Deprecated
        public static void getUniqueId$annotations() {
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
        public static final class Creator implements android.os.Parcelable.Creator<com.woocommerce.android.model.Refund.Item> {
            
            public Creator() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull
            @java.lang.Override
            public final com.woocommerce.android.model.Refund.Item createFromParcel(@org.jetbrains.annotations.NotNull
            android.os.Parcel in) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull
            @java.lang.Override
            public final com.woocommerce.android.model.Refund.Item[] newArray(int size) {
                return null;
            }
        }
    }
    
    @kotlinx.parcelize.Parcelize
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u00a2\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0014\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0015\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0016\u001a\u00020\bH\u00c6\u0003J\t\u0010\u0017\u001a\u00020\bH\u00c6\u0003J;\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\bH\u00c6\u0001J\t\u0010\u0019\u001a\u00020\u001aH\u00d6\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u00d6\u0003J\t\u0010\u001f\u001a\u00020\u001aH\u00d6\u0001J\t\u0010 \u001a\u00020\u0005H\u00d6\u0001J\u0019\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u001aH\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\t\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011\u00a8\u0006&"}, d2 = {"Lcom/woocommerce/android/model/Refund$ShippingLine;", "Landroid/os/Parcelable;", "itemId", "", "methodId", "", "methodTitle", "totalTax", "Ljava/math/BigDecimal;", "total", "(JLjava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;)V", "getItemId", "()J", "getMethodId", "()Ljava/lang/String;", "getMethodTitle", "getTotal", "()Ljava/math/BigDecimal;", "getTotalTax", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "WooCommerce_wasabiDebug"})
    public static final class ShippingLine implements android.os.Parcelable {
        private final long itemId = 0L;
        @org.jetbrains.annotations.NotNull
        private final java.lang.String methodId = null;
        @org.jetbrains.annotations.NotNull
        private final java.lang.String methodTitle = null;
        @org.jetbrains.annotations.NotNull
        private final java.math.BigDecimal totalTax = null;
        @org.jetbrains.annotations.NotNull
        private final java.math.BigDecimal total = null;
        public static final android.os.Parcelable.Creator<com.woocommerce.android.model.Refund.ShippingLine> CREATOR = null;
        
        @org.jetbrains.annotations.NotNull
        public final com.woocommerce.android.model.Refund.ShippingLine copy(long itemId, @org.jetbrains.annotations.NotNull
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
        
        public ShippingLine(long itemId, @org.jetbrains.annotations.NotNull
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
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
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
        
        @java.lang.Override
        public int describeContents() {
            return 0;
        }
        
        @java.lang.Override
        public void writeToParcel(@org.jetbrains.annotations.NotNull
        android.os.Parcel parcel, int flags) {
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 3)
        public static final class Creator implements android.os.Parcelable.Creator<com.woocommerce.android.model.Refund.ShippingLine> {
            
            public Creator() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull
            @java.lang.Override
            public final com.woocommerce.android.model.Refund.ShippingLine createFromParcel(@org.jetbrains.annotations.NotNull
            android.os.Parcel in) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull
            @java.lang.Override
            public final com.woocommerce.android.model.Refund.ShippingLine[] newArray(int size) {
                return null;
            }
        }
    }
    
    @kotlinx.parcelize.Parcelize
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0012\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0013\u001a\u00020\u0007H\u00c6\u0003J\t\u0010\u0014\u001a\u00020\u0007H\u00c6\u0003J1\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0007H\u00c6\u0001J\t\u0010\u0016\u001a\u00020\u0017H\u00d6\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u00d6\u0003J\t\u0010\u001c\u001a\u00020\u0017H\u00d6\u0001J\t\u0010\u001d\u001a\u00020\u0005H\u00d6\u0001J\u0019\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u0017H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\b\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000f\u00a8\u0006#"}, d2 = {"Lcom/woocommerce/android/model/Refund$FeeLine;", "Landroid/os/Parcelable;", "id", "", "name", "", "totalTax", "Ljava/math/BigDecimal;", "total", "(JLjava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;)V", "getId", "()J", "getName", "()Ljava/lang/String;", "getTotal", "()Ljava/math/BigDecimal;", "getTotalTax", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "WooCommerce_wasabiDebug"})
    public static final class FeeLine implements android.os.Parcelable {
        private final long id = 0L;
        @org.jetbrains.annotations.NotNull
        private final java.lang.String name = null;
        @org.jetbrains.annotations.NotNull
        private final java.math.BigDecimal totalTax = null;
        @org.jetbrains.annotations.NotNull
        private final java.math.BigDecimal total = null;
        public static final android.os.Parcelable.Creator<com.woocommerce.android.model.Refund.FeeLine> CREATOR = null;
        
        @org.jetbrains.annotations.NotNull
        public final com.woocommerce.android.model.Refund.FeeLine copy(long id, @org.jetbrains.annotations.NotNull
        java.lang.String name, @org.jetbrains.annotations.NotNull
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
        
        public FeeLine(long id, @org.jetbrains.annotations.NotNull
        java.lang.String name, @org.jetbrains.annotations.NotNull
        java.math.BigDecimal totalTax, @org.jetbrains.annotations.NotNull
        java.math.BigDecimal total) {
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
        public final java.lang.String getName() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.math.BigDecimal component3() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.math.BigDecimal getTotalTax() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.math.BigDecimal component4() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.math.BigDecimal getTotal() {
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
        public static final class Creator implements android.os.Parcelable.Creator<com.woocommerce.android.model.Refund.FeeLine> {
            
            public Creator() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull
            @java.lang.Override
            public final com.woocommerce.android.model.Refund.FeeLine createFromParcel(@org.jetbrains.annotations.NotNull
            android.os.Parcel in) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull
            @java.lang.Override
            public final com.woocommerce.android.model.Refund.FeeLine[] newArray(int size) {
                return null;
            }
        }
    }
}