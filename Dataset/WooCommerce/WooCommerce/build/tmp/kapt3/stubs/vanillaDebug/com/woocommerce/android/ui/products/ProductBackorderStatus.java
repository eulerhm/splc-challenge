package com.woocommerce.android.ui.products;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \u00112\u00020\u0001:\u0006\u0011\u0012\u0013\u0014\u0015\u0016B\u001b\b\u0004\u0012\b\b\u0003\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010\u000b\u001a\u00020\u0003H\u0016J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0003H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u0082\u0001\u0005\u0017\u0018\u0019\u001a\u001b\u00a8\u0006\u001c"}, d2 = {"Lcom/woocommerce/android/ui/products/ProductBackorderStatus;", "Landroid/os/Parcelable;", "stringResource", "", "value", "", "(ILjava/lang/String;)V", "getStringResource", "()I", "getValue", "()Ljava/lang/String;", "describeContents", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Companion", "Custom", "No", "NotAvailable", "Notify", "Yes", "Lcom/woocommerce/android/ui/products/ProductBackorderStatus$No;", "Lcom/woocommerce/android/ui/products/ProductBackorderStatus$Yes;", "Lcom/woocommerce/android/ui/products/ProductBackorderStatus$Notify;", "Lcom/woocommerce/android/ui/products/ProductBackorderStatus$NotAvailable;", "Lcom/woocommerce/android/ui/products/ProductBackorderStatus$Custom;", "WooCommerce_vanillaDebug"})
public abstract class ProductBackorderStatus implements android.os.Parcelable {
    private final int stringResource = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String value = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.woocommerce.android.ui.products.ProductBackorderStatus.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmField()
    public static final android.os.Parcelable.Creator<com.woocommerce.android.ui.products.ProductBackorderStatus> CREATOR = null;
    
    private ProductBackorderStatus(@androidx.annotation.StringRes()
    int stringResource, java.lang.String value) {
        super();
    }
    
    public final int getStringResource() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getValue() {
        return null;
    }
    
    @java.lang.Override()
    public void writeToParcel(@org.jetbrains.annotations.NotNull()
    android.os.Parcel parcel, int flags) {
    }
    
    @java.lang.Override()
    public int describeContents() {
        return 0;
    }
    
    @kotlinx.parcelize.Parcelize()
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0019\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u00d6\u0001\u00a8\u0006\t"}, d2 = {"Lcom/woocommerce/android/ui/products/ProductBackorderStatus$No;", "Lcom/woocommerce/android/ui/products/ProductBackorderStatus;", "()V", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "", "WooCommerce_vanillaDebug"})
    public static final class No extends com.woocommerce.android.ui.products.ProductBackorderStatus {
        @org.jetbrains.annotations.NotNull()
        public static final com.woocommerce.android.ui.products.ProductBackorderStatus.No INSTANCE = null;
        public static final android.os.Parcelable.Creator<com.woocommerce.android.ui.products.ProductBackorderStatus.No> CREATOR = null;
        
        private No() {
            super(0, null);
        }
        
        @java.lang.Override()
        public void writeToParcel(@org.jetbrains.annotations.NotNull()
        android.os.Parcel parcel, int flags) {
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 3)
        public static final class Creator implements android.os.Parcelable.Creator<com.woocommerce.android.ui.products.ProductBackorderStatus.No> {
            
            public Creator() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final com.woocommerce.android.ui.products.ProductBackorderStatus.No createFromParcel(@org.jetbrains.annotations.NotNull()
            android.os.Parcel in) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final com.woocommerce.android.ui.products.ProductBackorderStatus.No[] newArray(int size) {
                return null;
            }
        }
    }
    
    @kotlinx.parcelize.Parcelize()
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0019\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u00d6\u0001\u00a8\u0006\t"}, d2 = {"Lcom/woocommerce/android/ui/products/ProductBackorderStatus$Yes;", "Lcom/woocommerce/android/ui/products/ProductBackorderStatus;", "()V", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "", "WooCommerce_vanillaDebug"})
    public static final class Yes extends com.woocommerce.android.ui.products.ProductBackorderStatus {
        @org.jetbrains.annotations.NotNull()
        public static final com.woocommerce.android.ui.products.ProductBackorderStatus.Yes INSTANCE = null;
        public static final android.os.Parcelable.Creator<com.woocommerce.android.ui.products.ProductBackorderStatus.Yes> CREATOR = null;
        
        private Yes() {
            super(0, null);
        }
        
        @java.lang.Override()
        public void writeToParcel(@org.jetbrains.annotations.NotNull()
        android.os.Parcel parcel, int flags) {
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 3)
        public static final class Creator implements android.os.Parcelable.Creator<com.woocommerce.android.ui.products.ProductBackorderStatus.Yes> {
            
            public Creator() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final com.woocommerce.android.ui.products.ProductBackorderStatus.Yes createFromParcel(@org.jetbrains.annotations.NotNull()
            android.os.Parcel in) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final com.woocommerce.android.ui.products.ProductBackorderStatus.Yes[] newArray(int size) {
                return null;
            }
        }
    }
    
    @kotlinx.parcelize.Parcelize()
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0019\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u00d6\u0001\u00a8\u0006\t"}, d2 = {"Lcom/woocommerce/android/ui/products/ProductBackorderStatus$Notify;", "Lcom/woocommerce/android/ui/products/ProductBackorderStatus;", "()V", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "", "WooCommerce_vanillaDebug"})
    public static final class Notify extends com.woocommerce.android.ui.products.ProductBackorderStatus {
        @org.jetbrains.annotations.NotNull()
        public static final com.woocommerce.android.ui.products.ProductBackorderStatus.Notify INSTANCE = null;
        public static final android.os.Parcelable.Creator<com.woocommerce.android.ui.products.ProductBackorderStatus.Notify> CREATOR = null;
        
        private Notify() {
            super(0, null);
        }
        
        @java.lang.Override()
        public void writeToParcel(@org.jetbrains.annotations.NotNull()
        android.os.Parcel parcel, int flags) {
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 3)
        public static final class Creator implements android.os.Parcelable.Creator<com.woocommerce.android.ui.products.ProductBackorderStatus.Notify> {
            
            public Creator() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final com.woocommerce.android.ui.products.ProductBackorderStatus.Notify createFromParcel(@org.jetbrains.annotations.NotNull()
            android.os.Parcel in) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final com.woocommerce.android.ui.products.ProductBackorderStatus.Notify[] newArray(int size) {
                return null;
            }
        }
    }
    
    @kotlinx.parcelize.Parcelize()
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0019\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u00d6\u0001\u00a8\u0006\t"}, d2 = {"Lcom/woocommerce/android/ui/products/ProductBackorderStatus$NotAvailable;", "Lcom/woocommerce/android/ui/products/ProductBackorderStatus;", "()V", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "", "WooCommerce_vanillaDebug"})
    public static final class NotAvailable extends com.woocommerce.android.ui.products.ProductBackorderStatus {
        @org.jetbrains.annotations.NotNull()
        public static final com.woocommerce.android.ui.products.ProductBackorderStatus.NotAvailable INSTANCE = null;
        public static final android.os.Parcelable.Creator<com.woocommerce.android.ui.products.ProductBackorderStatus.NotAvailable> CREATOR = null;
        
        private NotAvailable() {
            super(0, null);
        }
        
        @java.lang.Override()
        public void writeToParcel(@org.jetbrains.annotations.NotNull()
        android.os.Parcel parcel, int flags) {
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 3)
        public static final class Creator implements android.os.Parcelable.Creator<com.woocommerce.android.ui.products.ProductBackorderStatus.NotAvailable> {
            
            public Creator() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final com.woocommerce.android.ui.products.ProductBackorderStatus.NotAvailable createFromParcel(@org.jetbrains.annotations.NotNull()
            android.os.Parcel in) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final com.woocommerce.android.ui.products.ProductBackorderStatus.NotAvailable[] newArray(int size) {
                return null;
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/woocommerce/android/ui/products/ProductBackorderStatus$Custom;", "Lcom/woocommerce/android/ui/products/ProductBackorderStatus;", "value", "", "(Ljava/lang/String;)V", "WooCommerce_vanillaDebug"})
    public static final class Custom extends com.woocommerce.android.ui.products.ProductBackorderStatus {
        
        public Custom(@org.jetbrains.annotations.NotNull()
        java.lang.String value) {
            super(0, null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\u0005J\u000e\u0010\r\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0005J\u0010\u0010\u000e\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u0007J\u001a\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u00112\u0006\u0010\b\u001a\u00020\tJ\u000e\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\u0007R\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lcom/woocommerce/android/ui/products/ProductBackorderStatus$Companion;", "", "()V", "CREATOR", "Landroid/os/Parcelable$Creator;", "Lcom/woocommerce/android/ui/products/ProductBackorderStatus;", "backordersToDisplayString", "", "context", "Landroid/content/Context;", "backorderStatus", "resources", "Lcom/woocommerce/android/viewmodel/ResourceProvider;", "fromBackorderStatus", "fromString", "value", "toMap", "", "toStringResource", "", "WooCommerce_vanillaDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.woocommerce.android.ui.products.ProductBackorderStatus fromString(@org.jetbrains.annotations.Nullable()
        java.lang.String value) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String fromBackorderStatus(@org.jetbrains.annotations.NotNull()
        com.woocommerce.android.ui.products.ProductBackorderStatus backorderStatus) {
            return null;
        }
        
        public final int toStringResource(@org.jetbrains.annotations.NotNull()
        java.lang.String value) {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.Map<java.lang.String, java.lang.String> toMap(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            return null;
        }
        
        /**
         * returns the product's backorder status formatted for display
         */
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String backordersToDisplayString(@org.jetbrains.annotations.NotNull()
        android.content.Context context, @org.jetbrains.annotations.NotNull()
        com.woocommerce.android.ui.products.ProductBackorderStatus backorderStatus) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String backordersToDisplayString(@org.jetbrains.annotations.NotNull()
        com.woocommerce.android.viewmodel.ResourceProvider resources, @org.jetbrains.annotations.NotNull()
        com.woocommerce.android.ui.products.ProductBackorderStatus backorderStatus) {
            return null;
        }
    }
}