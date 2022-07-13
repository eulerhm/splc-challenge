package com.woocommerce.android.ui.products.variations;

import java.lang.System;

/**
 * Names states of [Collection] elements.
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0003\u0006\u0007\b\u00a8\u0006\t"}, d2 = {"Lcom/woocommerce/android/ui/products/variations/ValuesGroupType;", "Landroid/os/Parcelable;", "()V", "Common", "Mixed", "None", "Lcom/woocommerce/android/ui/products/variations/ValuesGroupType$None;", "Lcom/woocommerce/android/ui/products/variations/ValuesGroupType$Mixed;", "Lcom/woocommerce/android/ui/products/variations/ValuesGroupType$Common;", "WooCommerce_vanillaDebug"})
public abstract class ValuesGroupType implements android.os.Parcelable {
    
    private ValuesGroupType() {
        super();
    }
    
    /**
     * Represents [Collection] which is empty or contains null value(s) only.
     */
    @kotlinx.parcelize.Parcelize()
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004H\u00d6\u0001J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004H\u00d6\u0001\u00a8\u0006\n"}, d2 = {"Lcom/woocommerce/android/ui/products/variations/ValuesGroupType$None;", "Lcom/woocommerce/android/ui/products/variations/ValuesGroupType;", "()V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "WooCommerce_vanillaDebug"})
    public static final class None extends com.woocommerce.android.ui.products.variations.ValuesGroupType {
        @org.jetbrains.annotations.NotNull()
        public static final com.woocommerce.android.ui.products.variations.ValuesGroupType.None INSTANCE = null;
        public static final android.os.Parcelable.Creator<com.woocommerce.android.ui.products.variations.ValuesGroupType.None> CREATOR = null;
        
        private None() {
            super();
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
        public static final class Creator implements android.os.Parcelable.Creator<com.woocommerce.android.ui.products.variations.ValuesGroupType.None> {
            
            public Creator() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final com.woocommerce.android.ui.products.variations.ValuesGroupType.None createFromParcel(@org.jetbrains.annotations.NotNull()
            android.os.Parcel in) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final com.woocommerce.android.ui.products.variations.ValuesGroupType.None[] newArray(int size) {
                return null;
            }
        }
    }
    
    /**
     * Represents non-empty [Collection] containing different values.
     */
    @kotlinx.parcelize.Parcelize()
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004H\u00d6\u0001J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004H\u00d6\u0001\u00a8\u0006\n"}, d2 = {"Lcom/woocommerce/android/ui/products/variations/ValuesGroupType$Mixed;", "Lcom/woocommerce/android/ui/products/variations/ValuesGroupType;", "()V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "WooCommerce_vanillaDebug"})
    public static final class Mixed extends com.woocommerce.android.ui.products.variations.ValuesGroupType {
        @org.jetbrains.annotations.NotNull()
        public static final com.woocommerce.android.ui.products.variations.ValuesGroupType.Mixed INSTANCE = null;
        public static final android.os.Parcelable.Creator<com.woocommerce.android.ui.products.variations.ValuesGroupType.Mixed> CREATOR = null;
        
        private Mixed() {
            super();
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
        public static final class Creator implements android.os.Parcelable.Creator<com.woocommerce.android.ui.products.variations.ValuesGroupType.Mixed> {
            
            public Creator() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final com.woocommerce.android.ui.products.variations.ValuesGroupType.Mixed createFromParcel(@org.jetbrains.annotations.NotNull()
            android.os.Parcel in) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final com.woocommerce.android.ui.products.variations.ValuesGroupType.Mixed[] newArray(int size) {
                return null;
            }
        }
    }
    
    /**
     * Represents non-empty [Collection] containing the same elements.
     *
     * @param data Optional property allowing passing data. It's restricted to [Serializable] type to make it compatible
     * with [Parcelize].
     */
    @kotlinx.parcelize.Parcelize()
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0004J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001J\t\u0010\n\u001a\u00020\u000bH\u00d6\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u00d6\u0003J\t\u0010\u0010\u001a\u00020\u000bH\u00d6\u0001J\t\u0010\u0011\u001a\u00020\u0012H\u00d6\u0001J\u0019\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000bH\u00d6\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004\u00a8\u0006\u0018"}, d2 = {"Lcom/woocommerce/android/ui/products/variations/ValuesGroupType$Common;", "Lcom/woocommerce/android/ui/products/variations/ValuesGroupType;", "data", "Ljava/io/Serializable;", "(Ljava/io/Serializable;)V", "getData", "()Ljava/io/Serializable;", "setData", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "WooCommerce_vanillaDebug"})
    public static final class Common extends com.woocommerce.android.ui.products.variations.ValuesGroupType {
        @org.jetbrains.annotations.Nullable()
        private java.io.Serializable data;
        public static final android.os.Parcelable.Creator<com.woocommerce.android.ui.products.variations.ValuesGroupType.Common> CREATOR = null;
        
        /**
         * Represents non-empty [Collection] containing the same elements.
         *
         * @param data Optional property allowing passing data. It's restricted to [Serializable] type to make it compatible
         * with [Parcelize].
         */
        @org.jetbrains.annotations.NotNull()
        public final com.woocommerce.android.ui.products.variations.ValuesGroupType.Common copy(@org.jetbrains.annotations.Nullable()
        java.io.Serializable data) {
            return null;
        }
        
        /**
         * Represents non-empty [Collection] containing the same elements.
         *
         * @param data Optional property allowing passing data. It's restricted to [Serializable] type to make it compatible
         * with [Parcelize].
         */
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        /**
         * Represents non-empty [Collection] containing the same elements.
         *
         * @param data Optional property allowing passing data. It's restricted to [Serializable] type to make it compatible
         * with [Parcelize].
         */
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        /**
         * Represents non-empty [Collection] containing the same elements.
         *
         * @param data Optional property allowing passing data. It's restricted to [Serializable] type to make it compatible
         * with [Parcelize].
         */
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        public Common() {
            super();
        }
        
        public Common(@org.jetbrains.annotations.Nullable()
        java.io.Serializable data) {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.io.Serializable component1() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.io.Serializable getData() {
            return null;
        }
        
        public final void setData(@org.jetbrains.annotations.Nullable()
        java.io.Serializable p0) {
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
        public static final class Creator implements android.os.Parcelable.Creator<com.woocommerce.android.ui.products.variations.ValuesGroupType.Common> {
            
            public Creator() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final com.woocommerce.android.ui.products.variations.ValuesGroupType.Common createFromParcel(@org.jetbrains.annotations.NotNull()
            android.os.Parcel in) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final com.woocommerce.android.ui.products.variations.ValuesGroupType.Common[] newArray(int size) {
                return null;
            }
        }
    }
}