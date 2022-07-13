package com.woocommerce.android.model;

import java.lang.System;

@kotlinx.parcelize.Parcelize
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001.B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u00a2\u0006\u0002\u0010\u000bJ\t\u0010\u001d\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\t\u0010\u001f\u001a\u00020\u0007H\u00c6\u0003J\u000f\u0010 \u001a\b\u0012\u0004\u0012\u00020\n0\tH\u00c6\u0003J9\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u00c6\u0001J\t\u0010\"\u001a\u00020\u0003H\u00d6\u0001J\u0013\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010&H\u00d6\u0003J\t\u0010\'\u001a\u00020\u0003H\u00d6\u0001J\t\u0010(\u001a\u00020\u0014H\u00d6\u0001J\u0019\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020\u0003H\u00d6\u0001R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0017\u0010\u000e\u001a\u00020\u0003\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0013\u001a\u00020\u00148F\u00a2\u0006\f\u0012\u0004\b\u0015\u0010\u0010\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0012R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001c\u00a8\u0006/"}, d2 = {"Lcom/woocommerce/android/model/ShippingLabelPackage;", "Landroid/os/Parcelable;", "position", "", "selectedPackage", "Lcom/woocommerce/android/model/ShippingPackage;", "weight", "", "items", "", "Lcom/woocommerce/android/model/ShippingLabelPackage$Item;", "(ILcom/woocommerce/android/model/ShippingPackage;FLjava/util/List;)V", "getItems", "()Ljava/util/List;", "itemsCount", "getItemsCount$annotations", "()V", "getItemsCount", "()I", "packageId", "", "getPackageId$annotations", "getPackageId", "()Ljava/lang/String;", "getPosition", "getSelectedPackage", "()Lcom/woocommerce/android/model/ShippingPackage;", "getWeight", "()F", "component1", "component2", "component3", "component4", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Item", "WooCommerce_wasabiDebug"})
public final class ShippingLabelPackage implements android.os.Parcelable {
    private final int position = 0;
    @org.jetbrains.annotations.Nullable
    private final com.woocommerce.android.model.ShippingPackage selectedPackage = null;
    private final float weight = 0.0F;
    @org.jetbrains.annotations.NotNull
    private final java.util.List<com.woocommerce.android.model.ShippingLabelPackage.Item> items = null;
    private final int itemsCount = 0;
    public static final android.os.Parcelable.Creator<com.woocommerce.android.model.ShippingLabelPackage> CREATOR = null;
    
    @org.jetbrains.annotations.NotNull
    public final com.woocommerce.android.model.ShippingLabelPackage copy(int position, @org.jetbrains.annotations.Nullable
    com.woocommerce.android.model.ShippingPackage selectedPackage, float weight, @org.jetbrains.annotations.NotNull
    java.util.List<com.woocommerce.android.model.ShippingLabelPackage.Item> items) {
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
    
    public ShippingLabelPackage(int position, @org.jetbrains.annotations.Nullable
    com.woocommerce.android.model.ShippingPackage selectedPackage, float weight, @org.jetbrains.annotations.NotNull
    java.util.List<com.woocommerce.android.model.ShippingLabelPackage.Item> items) {
        super();
    }
    
    public final int component1() {
        return 0;
    }
    
    public final int getPosition() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.woocommerce.android.model.ShippingPackage component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.woocommerce.android.model.ShippingPackage getSelectedPackage() {
        return null;
    }
    
    public final float component3() {
        return 0.0F;
    }
    
    public final float getWeight() {
        return 0.0F;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.woocommerce.android.model.ShippingLabelPackage.Item> component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.woocommerce.android.model.ShippingLabelPackage.Item> getItems() {
        return null;
    }
    
    @kotlinx.parcelize.IgnoredOnParcel
    @java.lang.Deprecated
    public static void getPackageId$annotations() {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getPackageId() {
        return null;
    }
    
    public final int getItemsCount() {
        return 0;
    }
    
    @kotlinx.parcelize.IgnoredOnParcel
    @java.lang.Deprecated
    public static void getItemsCount$annotations() {
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
    public static final class Creator implements android.os.Parcelable.Creator<com.woocommerce.android.model.ShippingLabelPackage> {
        
        public Creator() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        @java.lang.Override
        public final com.woocommerce.android.model.ShippingLabelPackage createFromParcel(@org.jetbrains.annotations.NotNull
        android.os.Parcel in) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        @java.lang.Override
        public final com.woocommerce.android.model.ShippingLabelPackage[] newArray(int size) {
            return null;
        }
    }
    
    @kotlinx.parcelize.Parcelize
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u00a2\u0006\u0002\u0010\rJ\t\u0010\u0019\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001a\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u001b\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u001c\u001a\u00020\bH\u00c6\u0003J\t\u0010\u001d\u001a\u00020\nH\u00c6\u0003J\t\u0010\u001e\u001a\u00020\fH\u00c6\u0003JE\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\fH\u00c6\u0001J\t\u0010 \u001a\u00020\bH\u00d6\u0001J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010$H\u00d6\u0003J\t\u0010%\u001a\u00020\bH\u00d6\u0001J\u000e\u0010&\u001a\u00020\"2\u0006\u0010\'\u001a\u00020\u0000J\t\u0010(\u001a\u00020\u0005H\u00d6\u0001J\u0019\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020\bH\u00d6\u0001R\u0011\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u000b\u001a\u00020\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018\u00a8\u0006."}, d2 = {"Lcom/woocommerce/android/model/ShippingLabelPackage$Item;", "Landroid/os/Parcelable;", "productId", "", "name", "", "attributesDescription", "quantity", "", "weight", "", "value", "Ljava/math/BigDecimal;", "(JLjava/lang/String;Ljava/lang/String;IFLjava/math/BigDecimal;)V", "getAttributesDescription", "()Ljava/lang/String;", "getName", "getProductId", "()J", "getQuantity", "()I", "getValue", "()Ljava/math/BigDecimal;", "getWeight", "()F", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "describeContents", "equals", "", "other", "", "hashCode", "isSameProduct", "otherItem", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "WooCommerce_wasabiDebug"})
    public static final class Item implements android.os.Parcelable {
        private final long productId = 0L;
        @org.jetbrains.annotations.NotNull
        private final java.lang.String name = null;
        @org.jetbrains.annotations.NotNull
        private final java.lang.String attributesDescription = null;
        private final int quantity = 0;
        private final float weight = 0.0F;
        @org.jetbrains.annotations.NotNull
        private final java.math.BigDecimal value = null;
        public static final android.os.Parcelable.Creator<com.woocommerce.android.model.ShippingLabelPackage.Item> CREATOR = null;
        
        @org.jetbrains.annotations.NotNull
        public final com.woocommerce.android.model.ShippingLabelPackage.Item copy(long productId, @org.jetbrains.annotations.NotNull
        java.lang.String name, @org.jetbrains.annotations.NotNull
        java.lang.String attributesDescription, int quantity, float weight, @org.jetbrains.annotations.NotNull
        java.math.BigDecimal value) {
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
        
        public Item(long productId, @org.jetbrains.annotations.NotNull
        java.lang.String name, @org.jetbrains.annotations.NotNull
        java.lang.String attributesDescription, int quantity, float weight, @org.jetbrains.annotations.NotNull
        java.math.BigDecimal value) {
            super();
        }
        
        public final long component1() {
            return 0L;
        }
        
        public final long getProductId() {
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
        public final java.lang.String component3() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getAttributesDescription() {
            return null;
        }
        
        public final int component4() {
            return 0;
        }
        
        public final int getQuantity() {
            return 0;
        }
        
        public final float component5() {
            return 0.0F;
        }
        
        public final float getWeight() {
            return 0.0F;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.math.BigDecimal component6() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.math.BigDecimal getValue() {
            return null;
        }
        
        public final boolean isSameProduct(@org.jetbrains.annotations.NotNull
        com.woocommerce.android.model.ShippingLabelPackage.Item otherItem) {
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
        public static final class Creator implements android.os.Parcelable.Creator<com.woocommerce.android.model.ShippingLabelPackage.Item> {
            
            public Creator() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull
            @java.lang.Override
            public final com.woocommerce.android.model.ShippingLabelPackage.Item createFromParcel(@org.jetbrains.annotations.NotNull
            android.os.Parcel in) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull
            @java.lang.Override
            public final com.woocommerce.android.model.ShippingLabelPackage.Item[] newArray(int size) {
                return null;
            }
        }
    }
}