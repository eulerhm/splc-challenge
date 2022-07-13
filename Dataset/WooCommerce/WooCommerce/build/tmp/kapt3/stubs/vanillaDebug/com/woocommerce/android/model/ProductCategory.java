package com.woocommerce.android.model;

import java.lang.System;

@kotlinx.parcelize.Parcelize()
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \'2\u00020\u0001:\u0001\'B+\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0010\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0011\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0012\u001a\u00020\u0003H\u00c6\u0003J\"\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0018J1\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0003H\u00c6\u0001J\t\u0010\u001a\u001a\u00020\u0014H\u00d6\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u00d6\u0003J\t\u0010\u001f\u001a\u00020\u0014H\u00d6\u0001J\u0006\u0010 \u001a\u00020\u0000J\t\u0010!\u001a\u00020\u0005H\u00d6\u0001J\u0019\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u0014H\u00d6\u0001R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0007\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n\u00a8\u0006("}, d2 = {"Lcom/woocommerce/android/model/ProductCategory;", "Landroid/os/Parcelable;", "remoteCategoryId", "", "name", "", "slug", "parentId", "(JLjava/lang/String;Ljava/lang/String;J)V", "getName", "()Ljava/lang/String;", "getParentId", "()J", "getRemoteCategoryId", "getSlug", "component1", "component2", "component3", "component4", "computeCascadingMargin", "", "resourceProvider", "Lcom/woocommerce/android/viewmodel/ResourceProvider;", "hierarchy", "", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toProductCategory", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Companion", "WooCommerce_vanillaDebug"})
public final class ProductCategory implements android.os.Parcelable {
    private final long remoteCategoryId = 0L;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String name = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String slug = null;
    private final long parentId = 0L;
    @org.jetbrains.annotations.NotNull()
    public static final com.woocommerce.android.model.ProductCategory.Companion Companion = null;
    @androidx.annotation.DimenRes()
    public static final int DEFAULT_PRODUCT_CATEGORY_MARGIN = com.woocommerce.android.R.dimen.major_125;
    public static final android.os.Parcelable.Creator<com.woocommerce.android.model.ProductCategory> CREATOR = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.woocommerce.android.model.ProductCategory copy(long remoteCategoryId, @org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    java.lang.String slug, long parentId) {
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
    
    public ProductCategory(long remoteCategoryId, @org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    java.lang.String slug, long parentId) {
        super();
    }
    
    public final long component1() {
        return 0L;
    }
    
    public final long getRemoteCategoryId() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getSlug() {
        return null;
    }
    
    public final long component4() {
        return 0L;
    }
    
    public final long getParentId() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.woocommerce.android.model.ProductCategory toProductCategory() {
        return null;
    }
    
    /**
     * Computes the cascading margin for the category name according to its parent
     *
     * @param hierarchy the map of parent to child relationship
     * the [ProductCategory] for which the padding is being calculated
     *
     * @return Int the computed margin
     */
    public final int computeCascadingMargin(@org.jetbrains.annotations.NotNull()
    com.woocommerce.android.viewmodel.ResourceProvider resourceProvider, @org.jetbrains.annotations.NotNull()
    java.util.Map<java.lang.Long, java.lang.Long> hierarchy) {
        return 0;
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
    public static final class Creator implements android.os.Parcelable.Creator<com.woocommerce.android.model.ProductCategory> {
        
        public Creator() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public final com.woocommerce.android.model.ProductCategory createFromParcel(@org.jetbrains.annotations.NotNull()
        android.os.Parcel in) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public final com.woocommerce.android.model.ProductCategory[] newArray(int size) {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0010\u0010\u0003\u001a\u00020\u00048\u0006X\u0087T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/woocommerce/android/model/ProductCategory$Companion;", "", "()V", "DEFAULT_PRODUCT_CATEGORY_MARGIN", "", "WooCommerce_vanillaDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}