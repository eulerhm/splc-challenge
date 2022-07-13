package com.woocommerce.android.model;

import java.lang.System;

@kotlinx.parcelize.Parcelize()
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b*\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0002LMB\u009d\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\u0014\u0012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00030\u0014\u0012\u0006\u0010\u0016\u001a\u00020\u0017\u00a2\u0006\u0002\u0010\u0018J\t\u00100\u001a\u00020\u0003H\u00c6\u0003J\u0010\u00101\u001a\u0004\u0018\u00010\u0012H\u00c6\u0003\u00a2\u0006\u0002\u0010&J\u000f\u00102\u001a\b\u0012\u0004\u0012\u00020\u00030\u0014H\u00c6\u0003J\u000f\u00103\u001a\b\u0012\u0004\u0012\u00020\u00030\u0014H\u00c6\u0003J\t\u00104\u001a\u00020\u0017H\u00c6\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\tH\u00c6\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\tH\u00c6\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\fH\u00c6\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010;\u001a\u0004\u0018\u00010\tH\u00c6\u0003J\u0010\u0010<\u001a\u0004\u0018\u00010\u0010H\u00c6\u0003\u00a2\u0006\u0002\u0010.J\u00ae\u0001\u0010=\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\u00142\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00030\u00142\b\b\u0002\u0010\u0016\u001a\u00020\u0017H\u00c6\u0001\u00a2\u0006\u0002\u0010>J\t\u0010?\u001a\u00020\u0010H\u00d6\u0001J\u0013\u0010@\u001a\u00020\u00122\b\u0010A\u001a\u0004\u0018\u00010BH\u00d6\u0003J\t\u0010C\u001a\u00020\u0010H\u00d6\u0001J\u000e\u0010D\u001a\u00020\u00122\u0006\u0010E\u001a\u00020\u0000J\t\u0010F\u001a\u00020\u0005H\u00d6\u0001J\u0019\u0010G\u001a\u00020H2\u0006\u0010I\u001a\u00020J2\u0006\u0010K\u001a\u00020\u0010H\u00d6\u0001R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00030\u0014\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010\b\u001a\u0004\u0018\u00010\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\t\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010 R\u0013\u0010\n\u001a\u0004\u0018\u00010\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010 R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001eR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0015\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u00a2\u0006\n\n\u0002\u0010\'\u001a\u0004\b\u0011\u0010&R\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\u0014\u00a2\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001cR\u0011\u0010\u0016\u001a\u00020\u0017\u00a2\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f\u00a2\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0015\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u00a2\u0006\n\n\u0002\u0010/\u001a\u0004\b-\u0010.\u00a8\u0006N"}, d2 = {"Lcom/woocommerce/android/model/Coupon;", "Landroid/os/Parcelable;", "id", "", "code", "", "amount", "Ljava/math/BigDecimal;", "dateCreatedGmt", "Ljava/util/Date;", "dateModifiedGmt", "type", "Lcom/woocommerce/android/model/Coupon$Type;", "description", "dateExpires", "usageCount", "", "isShippingFree", "", "productIds", "", "categoryIds", "restrictions", "Lcom/woocommerce/android/model/Coupon$CouponRestrictions;", "(JLjava/lang/String;Ljava/math/BigDecimal;Ljava/util/Date;Ljava/util/Date;Lcom/woocommerce/android/model/Coupon$Type;Ljava/lang/String;Ljava/util/Date;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/util/List;Ljava/util/List;Lcom/woocommerce/android/model/Coupon$CouponRestrictions;)V", "getAmount", "()Ljava/math/BigDecimal;", "getCategoryIds", "()Ljava/util/List;", "getCode", "()Ljava/lang/String;", "getDateCreatedGmt", "()Ljava/util/Date;", "getDateExpires", "getDateModifiedGmt", "getDescription", "getId", "()J", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getProductIds", "getRestrictions", "()Lcom/woocommerce/android/model/Coupon$CouponRestrictions;", "getType", "()Lcom/woocommerce/android/model/Coupon$Type;", "getUsageCount", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component10", "component11", "component12", "component13", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(JLjava/lang/String;Ljava/math/BigDecimal;Ljava/util/Date;Ljava/util/Date;Lcom/woocommerce/android/model/Coupon$Type;Ljava/lang/String;Ljava/util/Date;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/util/List;Ljava/util/List;Lcom/woocommerce/android/model/Coupon$CouponRestrictions;)Lcom/woocommerce/android/model/Coupon;", "describeContents", "equals", "other", "", "hashCode", "isSameCoupon", "otherCoupon", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "CouponRestrictions", "Type", "WooCommerce_vanillaDebug"})
public final class Coupon implements android.os.Parcelable {
    private final long id = 0L;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String code = null;
    @org.jetbrains.annotations.Nullable()
    private final java.math.BigDecimal amount = null;
    @org.jetbrains.annotations.Nullable()
    private final java.util.Date dateCreatedGmt = null;
    @org.jetbrains.annotations.Nullable()
    private final java.util.Date dateModifiedGmt = null;
    @org.jetbrains.annotations.Nullable()
    private final com.woocommerce.android.model.Coupon.Type type = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String description = null;
    @org.jetbrains.annotations.Nullable()
    private final java.util.Date dateExpires = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Integer usageCount = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Boolean isShippingFree = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<java.lang.Long> productIds = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<java.lang.Long> categoryIds = null;
    @org.jetbrains.annotations.NotNull()
    private final com.woocommerce.android.model.Coupon.CouponRestrictions restrictions = null;
    public static final android.os.Parcelable.Creator<com.woocommerce.android.model.Coupon> CREATOR = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.woocommerce.android.model.Coupon copy(long id, @org.jetbrains.annotations.Nullable()
    java.lang.String code, @org.jetbrains.annotations.Nullable()
    java.math.BigDecimal amount, @org.jetbrains.annotations.Nullable()
    java.util.Date dateCreatedGmt, @org.jetbrains.annotations.Nullable()
    java.util.Date dateModifiedGmt, @org.jetbrains.annotations.Nullable()
    com.woocommerce.android.model.Coupon.Type type, @org.jetbrains.annotations.Nullable()
    java.lang.String description, @org.jetbrains.annotations.Nullable()
    java.util.Date dateExpires, @org.jetbrains.annotations.Nullable()
    java.lang.Integer usageCount, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean isShippingFree, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.Long> productIds, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.Long> categoryIds, @org.jetbrains.annotations.NotNull()
    com.woocommerce.android.model.Coupon.CouponRestrictions restrictions) {
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
    
    public Coupon(long id, @org.jetbrains.annotations.Nullable()
    java.lang.String code, @org.jetbrains.annotations.Nullable()
    java.math.BigDecimal amount, @org.jetbrains.annotations.Nullable()
    java.util.Date dateCreatedGmt, @org.jetbrains.annotations.Nullable()
    java.util.Date dateModifiedGmt, @org.jetbrains.annotations.Nullable()
    com.woocommerce.android.model.Coupon.Type type, @org.jetbrains.annotations.Nullable()
    java.lang.String description, @org.jetbrains.annotations.Nullable()
    java.util.Date dateExpires, @org.jetbrains.annotations.Nullable()
    java.lang.Integer usageCount, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean isShippingFree, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.Long> productIds, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.Long> categoryIds, @org.jetbrains.annotations.NotNull()
    com.woocommerce.android.model.Coupon.CouponRestrictions restrictions) {
        super();
    }
    
    public final long component1() {
        return 0L;
    }
    
    public final long getId() {
        return 0L;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getCode() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.math.BigDecimal component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.math.BigDecimal getAmount() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.Date component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.Date getDateCreatedGmt() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.Date component5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.Date getDateModifiedGmt() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.woocommerce.android.model.Coupon.Type component6() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.woocommerce.android.model.Coupon.Type getType() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component7() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getDescription() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.Date component8() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.Date getDateExpires() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component9() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getUsageCount() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean component10() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean isShippingFree() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.Long> component11() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.Long> getProductIds() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.Long> component12() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.Long> getCategoryIds() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.woocommerce.android.model.Coupon.CouponRestrictions component13() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.woocommerce.android.model.Coupon.CouponRestrictions getRestrictions() {
        return null;
    }
    
    @kotlin.Suppress(names = {"ComplexMethod"})
    public final boolean isSameCoupon(@org.jetbrains.annotations.NotNull()
    com.woocommerce.android.model.Coupon otherCoupon) {
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
    public static final class Creator implements android.os.Parcelable.Creator<com.woocommerce.android.model.Coupon> {
        
        public Creator() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public final com.woocommerce.android.model.Coupon createFromParcel(@org.jetbrains.annotations.NotNull()
        android.os.Parcel in) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public final com.woocommerce.android.model.Coupon[] newArray(int size) {
            return null;
        }
    }
    
    @kotlinx.parcelize.Parcelize()
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u001f\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0083\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\r\u00a2\u0006\u0002\u0010\u0012J\u0010\u0010\"\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0014J\u000f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00110\rH\u00c6\u0003J\u0010\u0010$\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010\u001aJ\u0010\u0010%\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010\u001aJ\u0010\u0010&\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010\u001aJ\u0010\u0010\'\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0014J\u000b\u0010(\u001a\u0004\u0018\u00010\nH\u00c6\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\nH\u00c6\u0003J\u000f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u00c6\u0003J\u000f\u0010+\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u00c6\u0003J\u0092\u0001\u0010,\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\rH\u00c6\u0001\u00a2\u0006\u0002\u0010-J\t\u0010.\u001a\u00020\u0005H\u00d6\u0001J\u0013\u0010/\u001a\u00020\u00032\b\u00100\u001a\u0004\u0018\u000101H\u00d6\u0003J\t\u00102\u001a\u00020\u0005H\u00d6\u0001J\u000e\u00103\u001a\u00020\u00032\u0006\u00104\u001a\u00020\u0000J\t\u00105\u001a\u00020\u0011H\u00d6\u0001J\u0019\u00106\u001a\u0002072\u0006\u00108\u001a\u0002092\u0006\u0010:\u001a\u00020\u0005H\u00d6\u0001R\u0015\u0010\b\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0002\u0010\u0014R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0013\u0010\t\u001a\u0004\u0018\u00010\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001dR\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0017R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b \u0010\u001aR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b!\u0010\u001a\u00a8\u0006;"}, d2 = {"Lcom/woocommerce/android/model/Coupon$CouponRestrictions;", "Landroid/os/Parcelable;", "isForIndividualUse", "", "usageLimit", "", "usageLimitPerUser", "limitUsageToXItems", "areSaleItemsExcluded", "minimumAmount", "Ljava/math/BigDecimal;", "maximumAmount", "excludedProductIds", "", "", "excludedCategoryIds", "restrictedEmails", "", "(Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "getAreSaleItemsExcluded", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getExcludedCategoryIds", "()Ljava/util/List;", "getExcludedProductIds", "getLimitUsageToXItems", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getMaximumAmount", "()Ljava/math/BigDecimal;", "getMinimumAmount", "getRestrictedEmails", "getUsageLimit", "getUsageLimitPerUser", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/util/List;Ljava/util/List;Ljava/util/List;)Lcom/woocommerce/android/model/Coupon$CouponRestrictions;", "describeContents", "equals", "other", "", "hashCode", "isSameRestrictions", "otherRestrictions", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "WooCommerce_vanillaDebug"})
    public static final class CouponRestrictions implements android.os.Parcelable {
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Boolean isForIndividualUse = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Integer usageLimit = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Integer usageLimitPerUser = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Integer limitUsageToXItems = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Boolean areSaleItemsExcluded = null;
        @org.jetbrains.annotations.Nullable()
        private final java.math.BigDecimal minimumAmount = null;
        @org.jetbrains.annotations.Nullable()
        private final java.math.BigDecimal maximumAmount = null;
        @org.jetbrains.annotations.NotNull()
        private final java.util.List<java.lang.Long> excludedProductIds = null;
        @org.jetbrains.annotations.NotNull()
        private final java.util.List<java.lang.Long> excludedCategoryIds = null;
        @org.jetbrains.annotations.NotNull()
        private final java.util.List<java.lang.String> restrictedEmails = null;
        public static final android.os.Parcelable.Creator<com.woocommerce.android.model.Coupon.CouponRestrictions> CREATOR = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.woocommerce.android.model.Coupon.CouponRestrictions copy(@org.jetbrains.annotations.Nullable()
        java.lang.Boolean isForIndividualUse, @org.jetbrains.annotations.Nullable()
        java.lang.Integer usageLimit, @org.jetbrains.annotations.Nullable()
        java.lang.Integer usageLimitPerUser, @org.jetbrains.annotations.Nullable()
        java.lang.Integer limitUsageToXItems, @org.jetbrains.annotations.Nullable()
        java.lang.Boolean areSaleItemsExcluded, @org.jetbrains.annotations.Nullable()
        java.math.BigDecimal minimumAmount, @org.jetbrains.annotations.Nullable()
        java.math.BigDecimal maximumAmount, @org.jetbrains.annotations.NotNull()
        java.util.List<java.lang.Long> excludedProductIds, @org.jetbrains.annotations.NotNull()
        java.util.List<java.lang.Long> excludedCategoryIds, @org.jetbrains.annotations.NotNull()
        java.util.List<java.lang.String> restrictedEmails) {
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
        
        public CouponRestrictions(@org.jetbrains.annotations.Nullable()
        java.lang.Boolean isForIndividualUse, @org.jetbrains.annotations.Nullable()
        java.lang.Integer usageLimit, @org.jetbrains.annotations.Nullable()
        java.lang.Integer usageLimitPerUser, @org.jetbrains.annotations.Nullable()
        java.lang.Integer limitUsageToXItems, @org.jetbrains.annotations.Nullable()
        java.lang.Boolean areSaleItemsExcluded, @org.jetbrains.annotations.Nullable()
        java.math.BigDecimal minimumAmount, @org.jetbrains.annotations.Nullable()
        java.math.BigDecimal maximumAmount, @org.jetbrains.annotations.NotNull()
        java.util.List<java.lang.Long> excludedProductIds, @org.jetbrains.annotations.NotNull()
        java.util.List<java.lang.Long> excludedCategoryIds, @org.jetbrains.annotations.NotNull()
        java.util.List<java.lang.String> restrictedEmails) {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Boolean component1() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Boolean isForIndividualUse() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer component2() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer getUsageLimit() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer component3() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer getUsageLimitPerUser() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer component4() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer getLimitUsageToXItems() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Boolean component5() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Boolean getAreSaleItemsExcluded() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.math.BigDecimal component6() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.math.BigDecimal getMinimumAmount() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.math.BigDecimal component7() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.math.BigDecimal getMaximumAmount() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<java.lang.Long> component8() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<java.lang.Long> getExcludedProductIds() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<java.lang.Long> component9() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<java.lang.Long> getExcludedCategoryIds() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<java.lang.String> component10() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<java.lang.String> getRestrictedEmails() {
            return null;
        }
        
        public final boolean isSameRestrictions(@org.jetbrains.annotations.NotNull()
        com.woocommerce.android.model.Coupon.CouponRestrictions otherRestrictions) {
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
        public static final class Creator implements android.os.Parcelable.Creator<com.woocommerce.android.model.Coupon.CouponRestrictions> {
            
            public Creator() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final com.woocommerce.android.model.Coupon.CouponRestrictions createFromParcel(@org.jetbrains.annotations.NotNull()
            android.os.Parcel in) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final com.woocommerce.android.model.Coupon.CouponRestrictions[] newArray(int size) {
                return null;
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \u00072\u00020\u0001:\u0005\u0007\b\t\n\u000bB\u000f\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0004\f\r\u000e\u000f\u00a8\u0006\u0010"}, d2 = {"Lcom/woocommerce/android/model/Coupon$Type;", "Landroid/os/Parcelable;", "value", "", "(Ljava/lang/String;)V", "getValue", "()Ljava/lang/String;", "Companion", "Custom", "FixedCart", "FixedProduct", "Percent", "Lcom/woocommerce/android/model/Coupon$Type$Percent;", "Lcom/woocommerce/android/model/Coupon$Type$FixedCart;", "Lcom/woocommerce/android/model/Coupon$Type$FixedProduct;", "Lcom/woocommerce/android/model/Coupon$Type$Custom;", "WooCommerce_vanillaDebug"})
    public static abstract class Type implements android.os.Parcelable {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String value = null;
        @org.jetbrains.annotations.NotNull()
        public static final com.woocommerce.android.model.Coupon.Type.Companion Companion = null;
        
        private Type(java.lang.String value) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public java.lang.String getValue() {
            return null;
        }
        
        @kotlinx.parcelize.Parcelize()
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004H\u00d6\u0001J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004H\u00d6\u0001\u00a8\u0006\n"}, d2 = {"Lcom/woocommerce/android/model/Coupon$Type$Percent;", "Lcom/woocommerce/android/model/Coupon$Type;", "()V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "WooCommerce_vanillaDebug"})
        public static final class Percent extends com.woocommerce.android.model.Coupon.Type {
            @org.jetbrains.annotations.NotNull()
            public static final com.woocommerce.android.model.Coupon.Type.Percent INSTANCE = null;
            public static final android.os.Parcelable.Creator<com.woocommerce.android.model.Coupon.Type.Percent> CREATOR = null;
            
            private Percent() {
                super(null);
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
            public static final class Creator implements android.os.Parcelable.Creator<com.woocommerce.android.model.Coupon.Type.Percent> {
                
                public Creator() {
                    super();
                }
                
                @org.jetbrains.annotations.NotNull()
                @java.lang.Override()
                public final com.woocommerce.android.model.Coupon.Type.Percent createFromParcel(@org.jetbrains.annotations.NotNull()
                android.os.Parcel in) {
                    return null;
                }
                
                @org.jetbrains.annotations.NotNull()
                @java.lang.Override()
                public final com.woocommerce.android.model.Coupon.Type.Percent[] newArray(int size) {
                    return null;
                }
            }
        }
        
        @kotlinx.parcelize.Parcelize()
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004H\u00d6\u0001J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004H\u00d6\u0001\u00a8\u0006\n"}, d2 = {"Lcom/woocommerce/android/model/Coupon$Type$FixedCart;", "Lcom/woocommerce/android/model/Coupon$Type;", "()V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "WooCommerce_vanillaDebug"})
        public static final class FixedCart extends com.woocommerce.android.model.Coupon.Type {
            @org.jetbrains.annotations.NotNull()
            public static final com.woocommerce.android.model.Coupon.Type.FixedCart INSTANCE = null;
            public static final android.os.Parcelable.Creator<com.woocommerce.android.model.Coupon.Type.FixedCart> CREATOR = null;
            
            private FixedCart() {
                super(null);
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
            public static final class Creator implements android.os.Parcelable.Creator<com.woocommerce.android.model.Coupon.Type.FixedCart> {
                
                public Creator() {
                    super();
                }
                
                @org.jetbrains.annotations.NotNull()
                @java.lang.Override()
                public final com.woocommerce.android.model.Coupon.Type.FixedCart createFromParcel(@org.jetbrains.annotations.NotNull()
                android.os.Parcel in) {
                    return null;
                }
                
                @org.jetbrains.annotations.NotNull()
                @java.lang.Override()
                public final com.woocommerce.android.model.Coupon.Type.FixedCart[] newArray(int size) {
                    return null;
                }
            }
        }
        
        @kotlinx.parcelize.Parcelize()
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004H\u00d6\u0001J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004H\u00d6\u0001\u00a8\u0006\n"}, d2 = {"Lcom/woocommerce/android/model/Coupon$Type$FixedProduct;", "Lcom/woocommerce/android/model/Coupon$Type;", "()V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "WooCommerce_vanillaDebug"})
        public static final class FixedProduct extends com.woocommerce.android.model.Coupon.Type {
            @org.jetbrains.annotations.NotNull()
            public static final com.woocommerce.android.model.Coupon.Type.FixedProduct INSTANCE = null;
            public static final android.os.Parcelable.Creator<com.woocommerce.android.model.Coupon.Type.FixedProduct> CREATOR = null;
            
            private FixedProduct() {
                super(null);
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
            public static final class Creator implements android.os.Parcelable.Creator<com.woocommerce.android.model.Coupon.Type.FixedProduct> {
                
                public Creator() {
                    super();
                }
                
                @org.jetbrains.annotations.NotNull()
                @java.lang.Override()
                public final com.woocommerce.android.model.Coupon.Type.FixedProduct createFromParcel(@org.jetbrains.annotations.NotNull()
                android.os.Parcel in) {
                    return null;
                }
                
                @org.jetbrains.annotations.NotNull()
                @java.lang.Override()
                public final com.woocommerce.android.model.Coupon.Type.FixedProduct[] newArray(int size) {
                    return null;
                }
            }
        }
        
        @kotlinx.parcelize.Parcelize()
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\t\u0010\t\u001a\u00020\nH\u00d6\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u00d6\u0003J\t\u0010\u000f\u001a\u00020\nH\u00d6\u0001J\t\u0010\u0010\u001a\u00020\u0003H\u00d6\u0001J\u0019\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\nH\u00d6\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0016"}, d2 = {"Lcom/woocommerce/android/model/Coupon$Type$Custom;", "Lcom/woocommerce/android/model/Coupon$Type;", "value", "", "(Ljava/lang/String;)V", "getValue", "()Ljava/lang/String;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "WooCommerce_vanillaDebug"})
        public static final class Custom extends com.woocommerce.android.model.Coupon.Type {
            @org.jetbrains.annotations.NotNull()
            private final java.lang.String value = null;
            public static final android.os.Parcelable.Creator<com.woocommerce.android.model.Coupon.Type.Custom> CREATOR = null;
            
            @org.jetbrains.annotations.NotNull()
            public final com.woocommerce.android.model.Coupon.Type.Custom copy(@org.jetbrains.annotations.NotNull()
            java.lang.String value) {
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
            
            public Custom(@org.jetbrains.annotations.NotNull()
            java.lang.String value) {
                super(null);
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String component1() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public java.lang.String getValue() {
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
            public static final class Creator implements android.os.Parcelable.Creator<com.woocommerce.android.model.Coupon.Type.Custom> {
                
                public Creator() {
                    super();
                }
                
                @org.jetbrains.annotations.NotNull()
                @java.lang.Override()
                public final com.woocommerce.android.model.Coupon.Type.Custom createFromParcel(@org.jetbrains.annotations.NotNull()
                android.os.Parcel in) {
                    return null;
                }
                
                @org.jetbrains.annotations.NotNull()
                @java.lang.Override()
                public final com.woocommerce.android.model.Coupon.Type.Custom[] newArray(int size) {
                    return null;
                }
            }
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/woocommerce/android/model/Coupon$Type$Companion;", "", "()V", "fromDataModel", "Lcom/woocommerce/android/model/Coupon$Type;", "dataType", "Lorg/wordpress/android/fluxc/persistence/entity/CouponEntity$DiscountType;", "WooCommerce_vanillaDebug"})
        public static final class Companion {
            
            private Companion() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.woocommerce.android.model.Coupon.Type fromDataModel(@org.jetbrains.annotations.NotNull()
            org.wordpress.android.fluxc.persistence.entity.CouponEntity.DiscountType dataType) {
                return null;
            }
        }
    }
}