package com.woocommerce.android.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \f2\u00020\u0001:\u0003\f\r\u000eB\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\b\u001a\u00020\tJ\b\u0010\n\u001a\u00020\u000bH&R\u0015\u0010\u0003\u001a\u00060\u0004j\u0002`\u00058F\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0002\u000f\u0010\u00a8\u0006\u0011"}, d2 = {"Lcom/woocommerce/android/model/AmbiguousLocation;", "Landroid/os/Parcelable;", "()V", "codeOrRaw", "", "Lcom/woocommerce/android/ui/orders/details/editing/address/LocationCode;", "getCodeOrRaw", "()Ljava/lang/String;", "asLocation", "Lcom/woocommerce/android/model/Location;", "isNotEmpty", "", "Companion", "Defined", "Raw", "Lcom/woocommerce/android/model/AmbiguousLocation$Defined;", "Lcom/woocommerce/android/model/AmbiguousLocation$Raw;", "WooCommerce_wasabiDebug"})
public abstract class AmbiguousLocation implements android.os.Parcelable {
    @org.jetbrains.annotations.NotNull
    public static final com.woocommerce.android.model.AmbiguousLocation.Companion Companion = null;
    @org.jetbrains.annotations.NotNull
    private static final com.woocommerce.android.model.AmbiguousLocation.Raw EMPTY = null;
    
    private AmbiguousLocation() {
        super();
    }
    
    public abstract boolean isNotEmpty();
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getCodeOrRaw() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.woocommerce.android.model.Location asLocation() {
        return null;
    }
    
    @kotlinx.parcelize.Parcelize
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\t\u0010\t\u001a\u00020\nH\u00d6\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u00d6\u0003J\t\u0010\u000f\u001a\u00020\nH\u00d6\u0001J\b\u0010\u0010\u001a\u00020\fH\u0016J\t\u0010\u0011\u001a\u00020\u0012H\u00d6\u0001J\u0019\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\nH\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0018"}, d2 = {"Lcom/woocommerce/android/model/AmbiguousLocation$Defined;", "Lcom/woocommerce/android/model/AmbiguousLocation;", "value", "Lcom/woocommerce/android/model/Location;", "(Lcom/woocommerce/android/model/Location;)V", "getValue", "()Lcom/woocommerce/android/model/Location;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "isNotEmpty", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "WooCommerce_wasabiDebug"})
    public static final class Defined extends com.woocommerce.android.model.AmbiguousLocation {
        @org.jetbrains.annotations.NotNull
        private final com.woocommerce.android.model.Location value = null;
        public static final android.os.Parcelable.Creator<com.woocommerce.android.model.AmbiguousLocation.Defined> CREATOR = null;
        
        @org.jetbrains.annotations.NotNull
        public final com.woocommerce.android.model.AmbiguousLocation.Defined copy(@org.jetbrains.annotations.NotNull
        com.woocommerce.android.model.Location value) {
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
        
        public Defined(@org.jetbrains.annotations.NotNull
        com.woocommerce.android.model.Location value) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.woocommerce.android.model.Location component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.woocommerce.android.model.Location getValue() {
            return null;
        }
        
        @java.lang.Override
        public boolean isNotEmpty() {
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
        public static final class Creator implements android.os.Parcelable.Creator<com.woocommerce.android.model.AmbiguousLocation.Defined> {
            
            public Creator() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull
            @java.lang.Override
            public final com.woocommerce.android.model.AmbiguousLocation.Defined createFromParcel(@org.jetbrains.annotations.NotNull
            android.os.Parcel in) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull
            @java.lang.Override
            public final com.woocommerce.android.model.AmbiguousLocation.Defined[] newArray(int size) {
                return null;
            }
        }
    }
    
    @kotlinx.parcelize.Parcelize
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\t\u0010\t\u001a\u00020\nH\u00d6\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u00d6\u0003J\t\u0010\u000f\u001a\u00020\nH\u00d6\u0001J\b\u0010\u0010\u001a\u00020\fH\u0016J\t\u0010\u0011\u001a\u00020\u0003H\u00d6\u0001J\u0019\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\nH\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0017"}, d2 = {"Lcom/woocommerce/android/model/AmbiguousLocation$Raw;", "Lcom/woocommerce/android/model/AmbiguousLocation;", "value", "", "(Ljava/lang/String;)V", "getValue", "()Ljava/lang/String;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "isNotEmpty", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "WooCommerce_wasabiDebug"})
    public static final class Raw extends com.woocommerce.android.model.AmbiguousLocation {
        @org.jetbrains.annotations.NotNull
        private final java.lang.String value = null;
        public static final android.os.Parcelable.Creator<com.woocommerce.android.model.AmbiguousLocation.Raw> CREATOR = null;
        
        @org.jetbrains.annotations.NotNull
        public final com.woocommerce.android.model.AmbiguousLocation.Raw copy(@org.jetbrains.annotations.NotNull
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
        
        public Raw(@org.jetbrains.annotations.NotNull
        java.lang.String value) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getValue() {
            return null;
        }
        
        @java.lang.Override
        public boolean isNotEmpty() {
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
        public static final class Creator implements android.os.Parcelable.Creator<com.woocommerce.android.model.AmbiguousLocation.Raw> {
            
            public Creator() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull
            @java.lang.Override
            public final com.woocommerce.android.model.AmbiguousLocation.Raw createFromParcel(@org.jetbrains.annotations.NotNull
            android.os.Parcel in) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull
            @java.lang.Override
            public final com.woocommerce.android.model.AmbiguousLocation.Raw[] newArray(int size) {
                return null;
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/woocommerce/android/model/AmbiguousLocation$Companion;", "", "()V", "EMPTY", "Lcom/woocommerce/android/model/AmbiguousLocation$Raw;", "getEMPTY", "()Lcom/woocommerce/android/model/AmbiguousLocation$Raw;", "WooCommerce_wasabiDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.woocommerce.android.model.AmbiguousLocation.Raw getEMPTY() {
            return null;
        }
    }
}