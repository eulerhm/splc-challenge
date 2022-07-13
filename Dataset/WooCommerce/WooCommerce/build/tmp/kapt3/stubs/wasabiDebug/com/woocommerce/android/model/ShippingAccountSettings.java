package com.woocommerce.android.model;

import java.lang.System;

@kotlinx.parcelize.Parcelize
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0019\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u00a2\u0006\u0002\u0010\u000fJ\t\u0010\u001c\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001d\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u001e\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001f\u001a\u00020\u0003H\u00c6\u0003J\u0010\u0010 \u001a\u0004\u0018\u00010\tH\u00c6\u0003\u00a2\u0006\u0002\u0010\u0018J\u000f\u0010!\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u00c6\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u000eH\u00c6\u0003J^\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000eH\u00c6\u0001\u00a2\u0006\u0002\u0010$J\t\u0010%\u001a\u00020\tH\u00d6\u0001J\u0013\u0010&\u001a\u00020\u00032\b\u0010\'\u001a\u0004\u0018\u00010(H\u00d6\u0003J\t\u0010)\u001a\u00020\tH\u00d6\u0001J\t\u0010*\u001a\u00020\u000eH\u00d6\u0001J\u0019\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u00020\tH\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0011R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0015\u0010\b\u001a\u0004\u0018\u00010\t\u00a2\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001b\u00a8\u00060"}, d2 = {"Lcom/woocommerce/android/model/ShippingAccountSettings;", "Landroid/os/Parcelable;", "canEditSettings", "", "storeOwnerDetails", "Lcom/woocommerce/android/model/StoreOwnerDetails;", "isEmailReceiptEnabled", "canManagePayments", "selectedPaymentId", "", "paymentMethods", "", "Lcom/woocommerce/android/model/PaymentMethod;", "lastUsedBoxId", "", "(ZLcom/woocommerce/android/model/StoreOwnerDetails;ZZLjava/lang/Integer;Ljava/util/List;Ljava/lang/String;)V", "getCanEditSettings", "()Z", "getCanManagePayments", "getLastUsedBoxId", "()Ljava/lang/String;", "getPaymentMethods", "()Ljava/util/List;", "getSelectedPaymentId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getStoreOwnerDetails", "()Lcom/woocommerce/android/model/StoreOwnerDetails;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(ZLcom/woocommerce/android/model/StoreOwnerDetails;ZZLjava/lang/Integer;Ljava/util/List;Ljava/lang/String;)Lcom/woocommerce/android/model/ShippingAccountSettings;", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "WooCommerce_wasabiDebug"})
public final class ShippingAccountSettings implements android.os.Parcelable {
    private final boolean canEditSettings = false;
    @org.jetbrains.annotations.NotNull
    private final com.woocommerce.android.model.StoreOwnerDetails storeOwnerDetails = null;
    private final boolean isEmailReceiptEnabled = false;
    private final boolean canManagePayments = false;
    @org.jetbrains.annotations.Nullable
    private final java.lang.Integer selectedPaymentId = null;
    @org.jetbrains.annotations.NotNull
    private final java.util.List<com.woocommerce.android.model.PaymentMethod> paymentMethods = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String lastUsedBoxId = null;
    public static final android.os.Parcelable.Creator<com.woocommerce.android.model.ShippingAccountSettings> CREATOR = null;
    
    @org.jetbrains.annotations.NotNull
    public final com.woocommerce.android.model.ShippingAccountSettings copy(boolean canEditSettings, @org.jetbrains.annotations.NotNull
    com.woocommerce.android.model.StoreOwnerDetails storeOwnerDetails, boolean isEmailReceiptEnabled, boolean canManagePayments, @org.jetbrains.annotations.Nullable
    java.lang.Integer selectedPaymentId, @org.jetbrains.annotations.NotNull
    java.util.List<com.woocommerce.android.model.PaymentMethod> paymentMethods, @org.jetbrains.annotations.Nullable
    java.lang.String lastUsedBoxId) {
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
    
    public ShippingAccountSettings(boolean canEditSettings, @org.jetbrains.annotations.NotNull
    com.woocommerce.android.model.StoreOwnerDetails storeOwnerDetails, boolean isEmailReceiptEnabled, boolean canManagePayments, @org.jetbrains.annotations.Nullable
    java.lang.Integer selectedPaymentId, @org.jetbrains.annotations.NotNull
    java.util.List<com.woocommerce.android.model.PaymentMethod> paymentMethods, @org.jetbrains.annotations.Nullable
    java.lang.String lastUsedBoxId) {
        super();
    }
    
    public final boolean component1() {
        return false;
    }
    
    public final boolean getCanEditSettings() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.woocommerce.android.model.StoreOwnerDetails component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.woocommerce.android.model.StoreOwnerDetails getStoreOwnerDetails() {
        return null;
    }
    
    public final boolean component3() {
        return false;
    }
    
    public final boolean isEmailReceiptEnabled() {
        return false;
    }
    
    public final boolean component4() {
        return false;
    }
    
    public final boolean getCanManagePayments() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer component5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer getSelectedPaymentId() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.woocommerce.android.model.PaymentMethod> component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.woocommerce.android.model.PaymentMethod> getPaymentMethods() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component7() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getLastUsedBoxId() {
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
    public static final class Creator implements android.os.Parcelable.Creator<com.woocommerce.android.model.ShippingAccountSettings> {
        
        public Creator() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        @java.lang.Override
        public final com.woocommerce.android.model.ShippingAccountSettings createFromParcel(@org.jetbrains.annotations.NotNull
        android.os.Parcel in) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        @java.lang.Override
        public final com.woocommerce.android.model.ShippingAccountSettings[] newArray(int size) {
            return null;
        }
    }
}