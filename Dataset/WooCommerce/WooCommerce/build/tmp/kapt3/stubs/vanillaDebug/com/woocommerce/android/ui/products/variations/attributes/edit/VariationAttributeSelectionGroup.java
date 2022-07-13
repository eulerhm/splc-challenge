package com.woocommerce.android.ui.products.variations.attributes.edit;

import java.lang.System;

@kotlinx.parcelize.Parcelize()
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0017\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 -2\u00020\u0001:\u0001-B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\fJ\t\u0010\u001a\u001a\u00020\u0003H\u00c2\u0003J\u000f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u00c2\u0003J\t\u0010\u001c\u001a\u00020\bH\u00c2\u0003J\t\u0010\u001d\u001a\u00020\u0006H\u00c6\u0003J\t\u0010\u001e\u001a\u00020\u000bH\u00c6\u0003JA\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\u000bH\u00c6\u0001J\t\u0010 \u001a\u00020\u000bH\u00d6\u0001J\u0013\u0010!\u001a\u00020\b2\b\u0010\"\u001a\u0004\u0018\u00010#H\u00d6\u0003J\t\u0010$\u001a\u00020\u000bH\u00d6\u0001J\t\u0010%\u001a\u00020\u0006H\u00d6\u0001J\b\u0010&\u001a\u0004\u0018\u00010\'J\u0019\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020\u000bH\u00d6\u0001R\u0011\u0010\t\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058F\u00a2\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0012\u001a\u00020\b8F\u00a2\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0014\u001a\u00020\u00068F\u00a2\u0006\u0006\u001a\u0004\b\u0015\u0010\u000eR\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019\u00a8\u0006."}, d2 = {"Lcom/woocommerce/android/ui/products/variations/attributes/edit/VariationAttributeSelectionGroup;", "Landroid/os/Parcelable;", "id", "", "options", "", "", "noOptionSelected", "", "attributeName", "selectedOptionIndex", "", "(JLjava/util/List;ZLjava/lang/String;I)V", "getAttributeName", "()Ljava/lang/String;", "attributeOptions", "getAttributeOptions", "()Ljava/util/List;", "isAnyOptionSelected", "()Z", "selectedOption", "getSelectedOption", "getSelectedOptionIndex", "()I", "setSelectedOptionIndex", "(I)V", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "equals", "other", "", "hashCode", "toString", "toVariantOption", "Lcom/woocommerce/android/model/VariantOption;", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Companion", "WooCommerce_vanillaDebug"})
public final class VariationAttributeSelectionGroup implements android.os.Parcelable {
    private final long id = 0L;
    private java.util.List<java.lang.String> options;
    private boolean noOptionSelected;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String attributeName = null;
    private int selectedOptionIndex;
    @org.jetbrains.annotations.NotNull()
    public static final com.woocommerce.android.ui.products.variations.attributes.edit.VariationAttributeSelectionGroup.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String anySelectionOption = "Any";
    public static final android.os.Parcelable.Creator<com.woocommerce.android.ui.products.variations.attributes.edit.VariationAttributeSelectionGroup> CREATOR = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.woocommerce.android.ui.products.variations.attributes.edit.VariationAttributeSelectionGroup copy(long id, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> options, boolean noOptionSelected, @org.jetbrains.annotations.NotNull()
    java.lang.String attributeName, int selectedOptionIndex) {
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
    
    public VariationAttributeSelectionGroup(long id, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> options, boolean noOptionSelected, @org.jetbrains.annotations.NotNull()
    java.lang.String attributeName, int selectedOptionIndex) {
        super();
    }
    
    private final long component1() {
        return 0L;
    }
    
    private final java.util.List<java.lang.String> component2() {
        return null;
    }
    
    private final boolean component3() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getAttributeName() {
        return null;
    }
    
    public final int component5() {
        return 0;
    }
    
    public final int getSelectedOptionIndex() {
        return 0;
    }
    
    public final void setSelectedOptionIndex(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getSelectedOption() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> getAttributeOptions() {
        return null;
    }
    
    public final boolean isAnyOptionSelected() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.woocommerce.android.model.VariantOption toVariantOption() {
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
    public static final class Creator implements android.os.Parcelable.Creator<com.woocommerce.android.ui.products.variations.attributes.edit.VariationAttributeSelectionGroup> {
        
        public Creator() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public final com.woocommerce.android.ui.products.variations.attributes.edit.VariationAttributeSelectionGroup createFromParcel(@org.jetbrains.annotations.NotNull()
        android.os.Parcel in) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public final com.woocommerce.android.ui.products.variations.attributes.edit.VariationAttributeSelectionGroup[] newArray(int size) {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/woocommerce/android/ui/products/variations/attributes/edit/VariationAttributeSelectionGroup$Companion;", "", "()V", "anySelectionOption", "", "WooCommerce_vanillaDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}