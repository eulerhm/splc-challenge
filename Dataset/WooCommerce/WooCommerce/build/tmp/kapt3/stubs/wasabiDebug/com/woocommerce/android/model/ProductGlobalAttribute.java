package com.woocommerce.android.model;

import java.lang.System;

/**
 * Represents a global attribute, which is an attribute available store-wide
 */
@kotlinx.parcelize.Parcelize
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u001b\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u0006\u0012\u0006\u0010\r\u001a\u00020\u000e\u00a2\u0006\u0002\u0010\u000fJ\t\u0010\u001d\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001e\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001f\u001a\u00020\u0006H\u00c6\u0003J\t\u0010 \u001a\u00020\u0006H\u00c6\u0003J\t\u0010!\u001a\u00020\u0006H\u00c6\u0003J\t\u0010\"\u001a\u00020\u0006H\u00c6\u0003J\t\u0010#\u001a\u00020\u000bH\u00c6\u0003J\t\u0010$\u001a\u00020\u0006H\u00c6\u0003J\t\u0010%\u001a\u00020\u000eH\u00c6\u0003Jc\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u00062\b\b\u0002\u0010\r\u001a\u00020\u000eH\u00c6\u0001J\t\u0010\'\u001a\u00020\u0003H\u00d6\u0001J\u0013\u0010(\u001a\u00020\u000b2\b\u0010)\u001a\u0004\u0018\u00010*H\u00d6\u0003J\t\u0010+\u001a\u00020\u0003H\u00d6\u0001J\u0012\u0010,\u001a\u00020-2\n\b\u0002\u0010.\u001a\u0004\u0018\u00010-J\u0014\u0010/\u001a\u0002002\f\u00101\u001a\b\u0012\u0004\u0012\u00020\u000602J\t\u00103\u001a\u00020\u0006H\u00d6\u0001J\u0019\u00104\u001a\u0002052\u0006\u00106\u001a\u0002072\u0006\u00108\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\n\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\t\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0011\u0010\r\u001a\u00020\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0016R\u0011\u0010\f\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0016R\u0011\u0010\b\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0016\u00a8\u00069"}, d2 = {"Lcom/woocommerce/android/model/ProductGlobalAttribute;", "Landroid/os/Parcelable;", "id", "", "localSiteId", "name", "", "slug", "type", "orderBy", "hasArchives", "", "termsId", "remoteId", "", "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;J)V", "getHasArchives", "()Z", "getId", "()I", "getLocalSiteId", "getName", "()Ljava/lang/String;", "getOrderBy", "getRemoteId", "()J", "getSlug", "getTermsId", "getType", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "describeContents", "equals", "other", "", "hashCode", "toDataModel", "Lorg/wordpress/android/fluxc/model/attribute/WCGlobalAttributeModel;", "cachedAttribute", "toProductAttributeForDisplay", "Lcom/woocommerce/android/model/ProductAttribute;", "terms", "", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "WooCommerce_wasabiDebug"})
public final class ProductGlobalAttribute implements android.os.Parcelable {
    private final int id = 0;
    private final int localSiteId = 0;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String name = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String slug = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String type = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String orderBy = null;
    private final boolean hasArchives = false;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String termsId = null;
    private final long remoteId = 0L;
    public static final android.os.Parcelable.Creator<com.woocommerce.android.model.ProductGlobalAttribute> CREATOR = null;
    
    /**
     * Represents a global attribute, which is an attribute available store-wide
     */
    @org.jetbrains.annotations.NotNull
    public final com.woocommerce.android.model.ProductGlobalAttribute copy(int id, int localSiteId, @org.jetbrains.annotations.NotNull
    java.lang.String name, @org.jetbrains.annotations.NotNull
    java.lang.String slug, @org.jetbrains.annotations.NotNull
    java.lang.String type, @org.jetbrains.annotations.NotNull
    java.lang.String orderBy, boolean hasArchives, @org.jetbrains.annotations.NotNull
    java.lang.String termsId, long remoteId) {
        return null;
    }
    
    /**
     * Represents a global attribute, which is an attribute available store-wide
     */
    @java.lang.Override
    public boolean equals(@org.jetbrains.annotations.Nullable
    java.lang.Object other) {
        return false;
    }
    
    /**
     * Represents a global attribute, which is an attribute available store-wide
     */
    @java.lang.Override
    public int hashCode() {
        return 0;
    }
    
    /**
     * Represents a global attribute, which is an attribute available store-wide
     */
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.lang.String toString() {
        return null;
    }
    
    public ProductGlobalAttribute(int id, int localSiteId, @org.jetbrains.annotations.NotNull
    java.lang.String name, @org.jetbrains.annotations.NotNull
    java.lang.String slug, @org.jetbrains.annotations.NotNull
    java.lang.String type, @org.jetbrains.annotations.NotNull
    java.lang.String orderBy, boolean hasArchives, @org.jetbrains.annotations.NotNull
    java.lang.String termsId, long remoteId) {
        super();
    }
    
    public final int component1() {
        return 0;
    }
    
    public final int getId() {
        return 0;
    }
    
    public final int component2() {
        return 0;
    }
    
    public final int getLocalSiteId() {
        return 0;
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
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getSlug() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getType() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getOrderBy() {
        return null;
    }
    
    public final boolean component7() {
        return false;
    }
    
    public final boolean getHasArchives() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component8() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getTermsId() {
        return null;
    }
    
    public final long component9() {
        return 0L;
    }
    
    public final long getRemoteId() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull
    public final org.wordpress.android.fluxc.model.attribute.WCGlobalAttributeModel toDataModel(@org.jetbrains.annotations.Nullable
    org.wordpress.android.fluxc.model.attribute.WCGlobalAttributeModel cachedAttribute) {
        return null;
    }
    
    /**
     * Converts this global attribute to a "normal" product attribute model for display purposes only, useful when
     * listing global and local attributes together
     */
    @org.jetbrains.annotations.NotNull
    public final com.woocommerce.android.model.ProductAttribute toProductAttributeForDisplay(@org.jetbrains.annotations.NotNull
    java.util.List<java.lang.String> terms) {
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
    public static final class Creator implements android.os.Parcelable.Creator<com.woocommerce.android.model.ProductGlobalAttribute> {
        
        public Creator() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        @java.lang.Override
        public final com.woocommerce.android.model.ProductGlobalAttribute createFromParcel(@org.jetbrains.annotations.NotNull
        android.os.Parcel in) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        @java.lang.Override
        public final com.woocommerce.android.model.ProductGlobalAttribute[] newArray(int size) {
            return null;
        }
    }
}