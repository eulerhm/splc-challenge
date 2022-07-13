package com.woocommerce.android.model;

import java.lang.System;

@kotlinx.parcelize.Parcelize
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B[\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010\u00a2\u0006\u0002\u0010\u0012J\t\u0010\"\u001a\u00020\u0003H\u00c6\u0003J\t\u0010#\u001a\u00020\u0005H\u00c6\u0003J\t\u0010$\u001a\u00020\u0007H\u00c6\u0003J\t\u0010%\u001a\u00020\tH\u00c6\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010\'\u001a\u00020\fH\u00c6\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010)\u001a\u00020\u0003H\u00c6\u0003J\u000f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u00c6\u0003Jm\u0010+\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00032\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u00c6\u0001J\t\u0010,\u001a\u00020-H\u00d6\u0001J\u0013\u0010.\u001a\u00020\u00072\b\u0010/\u001a\u0004\u0018\u000100H\u00d6\u0003J\t\u00101\u001a\u00020-H\u00d6\u0001J\u0006\u00102\u001a\u000203J\t\u00104\u001a\u00020\u0003H\u00d6\u0001J\u0019\u00105\u001a\u0002062\u0006\u00107\u001a\u0002082\u0006\u00109\u001a\u00020-H\u00d6\u0001R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0014R\u0011\u0010\u000e\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0014R\u0011\u0010\u000b\u001a\u00020\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010!\u00a8\u0006:"}, d2 = {"Lcom/woocommerce/android/model/CustomsPackage;", "Landroid/os/Parcelable;", "id", "", "labelPackage", "Lcom/woocommerce/android/model/ShippingLabelPackage;", "returnToSender", "", "contentsType", "Lcom/woocommerce/android/model/ContentsType;", "contentsDescription", "restrictionType", "Lcom/woocommerce/android/model/RestrictionType;", "restrictionDescription", "itn", "lines", "", "Lcom/woocommerce/android/model/CustomsLine;", "(Ljava/lang/String;Lcom/woocommerce/android/model/ShippingLabelPackage;ZLcom/woocommerce/android/model/ContentsType;Ljava/lang/String;Lcom/woocommerce/android/model/RestrictionType;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getContentsDescription", "()Ljava/lang/String;", "getContentsType", "()Lcom/woocommerce/android/model/ContentsType;", "getId", "getItn", "getLabelPackage", "()Lcom/woocommerce/android/model/ShippingLabelPackage;", "getLines", "()Ljava/util/List;", "getRestrictionDescription", "getRestrictionType", "()Lcom/woocommerce/android/model/RestrictionType;", "getReturnToSender", "()Z", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toDataModel", "Lorg/wordpress/android/fluxc/model/shippinglabels/WCShippingPackageCustoms;", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "WooCommerce_wasabiDebug"})
public final class CustomsPackage implements android.os.Parcelable {
    @org.jetbrains.annotations.NotNull
    private final java.lang.String id = null;
    @org.jetbrains.annotations.NotNull
    private final com.woocommerce.android.model.ShippingLabelPackage labelPackage = null;
    private final boolean returnToSender = false;
    @org.jetbrains.annotations.NotNull
    private final com.woocommerce.android.model.ContentsType contentsType = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String contentsDescription = null;
    @org.jetbrains.annotations.NotNull
    private final com.woocommerce.android.model.RestrictionType restrictionType = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String restrictionDescription = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String itn = null;
    @org.jetbrains.annotations.NotNull
    private final java.util.List<com.woocommerce.android.model.CustomsLine> lines = null;
    public static final android.os.Parcelable.Creator<com.woocommerce.android.model.CustomsPackage> CREATOR = null;
    
    @org.jetbrains.annotations.NotNull
    public final com.woocommerce.android.model.CustomsPackage copy(@org.jetbrains.annotations.NotNull
    java.lang.String id, @org.jetbrains.annotations.NotNull
    com.woocommerce.android.model.ShippingLabelPackage labelPackage, boolean returnToSender, @org.jetbrains.annotations.NotNull
    com.woocommerce.android.model.ContentsType contentsType, @org.jetbrains.annotations.Nullable
    java.lang.String contentsDescription, @org.jetbrains.annotations.NotNull
    com.woocommerce.android.model.RestrictionType restrictionType, @org.jetbrains.annotations.Nullable
    java.lang.String restrictionDescription, @org.jetbrains.annotations.NotNull
    java.lang.String itn, @org.jetbrains.annotations.NotNull
    java.util.List<com.woocommerce.android.model.CustomsLine> lines) {
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
    
    public CustomsPackage(@org.jetbrains.annotations.NotNull
    java.lang.String id, @org.jetbrains.annotations.NotNull
    com.woocommerce.android.model.ShippingLabelPackage labelPackage, boolean returnToSender, @org.jetbrains.annotations.NotNull
    com.woocommerce.android.model.ContentsType contentsType, @org.jetbrains.annotations.Nullable
    java.lang.String contentsDescription, @org.jetbrains.annotations.NotNull
    com.woocommerce.android.model.RestrictionType restrictionType, @org.jetbrains.annotations.Nullable
    java.lang.String restrictionDescription, @org.jetbrains.annotations.NotNull
    java.lang.String itn, @org.jetbrains.annotations.NotNull
    java.util.List<com.woocommerce.android.model.CustomsLine> lines) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getId() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.woocommerce.android.model.ShippingLabelPackage component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.woocommerce.android.model.ShippingLabelPackage getLabelPackage() {
        return null;
    }
    
    public final boolean component3() {
        return false;
    }
    
    public final boolean getReturnToSender() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.woocommerce.android.model.ContentsType component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.woocommerce.android.model.ContentsType getContentsType() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getContentsDescription() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.woocommerce.android.model.RestrictionType component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.woocommerce.android.model.RestrictionType getRestrictionType() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component7() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getRestrictionDescription() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component8() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getItn() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.woocommerce.android.model.CustomsLine> component9() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.woocommerce.android.model.CustomsLine> getLines() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final org.wordpress.android.fluxc.model.shippinglabels.WCShippingPackageCustoms toDataModel() {
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
    public static final class Creator implements android.os.Parcelable.Creator<com.woocommerce.android.model.CustomsPackage> {
        
        public Creator() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        @java.lang.Override
        public final com.woocommerce.android.model.CustomsPackage createFromParcel(@org.jetbrains.annotations.NotNull
        android.os.Parcel in) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        @java.lang.Override
        public final com.woocommerce.android.model.CustomsPackage[] newArray(int size) {
            return null;
        }
    }
}