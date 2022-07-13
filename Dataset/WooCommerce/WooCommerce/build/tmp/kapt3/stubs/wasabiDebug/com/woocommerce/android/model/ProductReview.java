package com.woocommerce.android.model;

import java.lang.System;

@kotlinx.parcelize.Parcelize
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\'\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B_\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0007\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u00a2\u0006\u0002\u0010\u0012J\t\u0010*\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0011H\u00c6\u0003J\t\u0010,\u001a\u00020\u0005H\u00c6\u0003J\t\u0010-\u001a\u00020\u0007H\u00c6\u0003J\t\u0010.\u001a\u00020\tH\u00c6\u0003J\t\u0010/\u001a\u00020\u0007H\u00c6\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\t\u00101\u001a\u00020\u0003H\u00c6\u0003J\t\u00102\u001a\u00020\u0007H\u00c6\u0003J\u0010\u00103\u001a\u0004\u0018\u00010\u000fH\u00c6\u0003\u00a2\u0006\u0002\u0010\u001cJx\u00104\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00072\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u00c6\u0001\u00a2\u0006\u0002\u00105J\t\u00106\u001a\u00020\tH\u00d6\u0001J\u0013\u00107\u001a\u00020\u000f2\b\u00108\u001a\u0004\u0018\u000109H\u00d6\u0003J\t\u0010:\u001a\u00020\tH\u00d6\u0001J\t\u0010;\u001a\u00020\u0007H\u00d6\u0001J\u0019\u0010<\u001a\u00020=2\u0006\u0010>\u001a\u00020?2\u0006\u0010@\u001a\u00020\tH\u00d6\u0001R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u0011\u0010\b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u001e\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u001f\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0011\u0010\f\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010!R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010$R\u0011\u0010\n\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010$R\u001a\u0010\r\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\'\u0010$\"\u0004\b(\u0010)\u00a8\u0006A"}, d2 = {"Lcom/woocommerce/android/model/ProductReview;", "Landroid/os/Parcelable;", "remoteId", "", "dateCreated", "Ljava/util/Date;", "review", "", "rating", "", "reviewerName", "reviewerAvatarUrl", "remoteProductId", "status", "read", "", "product", "Lcom/woocommerce/android/model/ProductReviewProduct;", "(JLjava/util/Date;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/Boolean;Lcom/woocommerce/android/model/ProductReviewProduct;)V", "getDateCreated", "()Ljava/util/Date;", "getProduct", "()Lcom/woocommerce/android/model/ProductReviewProduct;", "setProduct", "(Lcom/woocommerce/android/model/ProductReviewProduct;)V", "getRating", "()I", "getRead", "()Ljava/lang/Boolean;", "setRead", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getRemoteId", "()J", "getRemoteProductId", "getReview", "()Ljava/lang/String;", "getReviewerAvatarUrl", "getReviewerName", "getStatus", "setStatus", "(Ljava/lang/String;)V", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(JLjava/util/Date;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/Boolean;Lcom/woocommerce/android/model/ProductReviewProduct;)Lcom/woocommerce/android/model/ProductReview;", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "WooCommerce_wasabiDebug"})
public final class ProductReview implements android.os.Parcelable {
    private final long remoteId = 0L;
    @org.jetbrains.annotations.NotNull
    private final java.util.Date dateCreated = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String review = null;
    private final int rating = 0;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String reviewerName = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String reviewerAvatarUrl = null;
    private final long remoteProductId = 0L;
    @org.jetbrains.annotations.NotNull
    private java.lang.String status;
    @org.jetbrains.annotations.Nullable
    private java.lang.Boolean read;
    @org.jetbrains.annotations.Nullable
    private com.woocommerce.android.model.ProductReviewProduct product;
    public static final android.os.Parcelable.Creator<com.woocommerce.android.model.ProductReview> CREATOR = null;
    
    @org.jetbrains.annotations.NotNull
    public final com.woocommerce.android.model.ProductReview copy(long remoteId, @org.jetbrains.annotations.NotNull
    java.util.Date dateCreated, @org.jetbrains.annotations.NotNull
    java.lang.String review, int rating, @org.jetbrains.annotations.NotNull
    java.lang.String reviewerName, @org.jetbrains.annotations.Nullable
    java.lang.String reviewerAvatarUrl, long remoteProductId, @org.jetbrains.annotations.NotNull
    java.lang.String status, @org.jetbrains.annotations.Nullable
    java.lang.Boolean read, @org.jetbrains.annotations.Nullable
    com.woocommerce.android.model.ProductReviewProduct product) {
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
    
    public ProductReview(long remoteId, @org.jetbrains.annotations.NotNull
    java.util.Date dateCreated, @org.jetbrains.annotations.NotNull
    java.lang.String review, int rating, @org.jetbrains.annotations.NotNull
    java.lang.String reviewerName, @org.jetbrains.annotations.Nullable
    java.lang.String reviewerAvatarUrl, long remoteProductId, @org.jetbrains.annotations.NotNull
    java.lang.String status, @org.jetbrains.annotations.Nullable
    java.lang.Boolean read, @org.jetbrains.annotations.Nullable
    com.woocommerce.android.model.ProductReviewProduct product) {
        super();
    }
    
    public final long component1() {
        return 0L;
    }
    
    public final long getRemoteId() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.Date component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.Date getDateCreated() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getReview() {
        return null;
    }
    
    public final int component4() {
        return 0;
    }
    
    public final int getRating() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getReviewerName() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component6() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getReviewerAvatarUrl() {
        return null;
    }
    
    public final long component7() {
        return 0L;
    }
    
    public final long getRemoteProductId() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component8() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getStatus() {
        return null;
    }
    
    public final void setStatus(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Boolean component9() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Boolean getRead() {
        return null;
    }
    
    public final void setRead(@org.jetbrains.annotations.Nullable
    java.lang.Boolean p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.woocommerce.android.model.ProductReviewProduct component10() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.woocommerce.android.model.ProductReviewProduct getProduct() {
        return null;
    }
    
    public final void setProduct(@org.jetbrains.annotations.Nullable
    com.woocommerce.android.model.ProductReviewProduct p0) {
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
    public static final class Creator implements android.os.Parcelable.Creator<com.woocommerce.android.model.ProductReview> {
        
        public Creator() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        @java.lang.Override
        public final com.woocommerce.android.model.ProductReview createFromParcel(@org.jetbrains.annotations.NotNull
        android.os.Parcel in) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        @java.lang.Override
        public final com.woocommerce.android.model.ProductReview[] newArray(int size) {
            return null;
        }
    }
}