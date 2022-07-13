package com.woocommerce.android.ui.reviews;

import java.lang.System;

@kotlin.Suppress(names = {"DataClassPrivateConstructor"})
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006B\u001f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ\u0011\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0000H\u0096\u0002J\t\u0010\u0011\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0012\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0013\u001a\u00020\bH\u00c2\u0003J\'\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bH\u00c6\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0010\u001a\u0004\u0018\u00010\u0017H\u00d6\u0003J\t\u0010\u0018\u001a\u00020\u000fH\u00d6\u0001J\t\u0010\u0019\u001a\u00020\u001aH\u00d6\u0001R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001b"}, d2 = {"Lcom/woocommerce/android/ui/reviews/ReviewModerationRequest;", "", "review", "Lcom/woocommerce/android/model/ProductReview;", "newStatus", "Lcom/woocommerce/android/ui/reviews/ProductReviewStatus;", "(Lcom/woocommerce/android/model/ProductReview;Lcom/woocommerce/android/ui/reviews/ProductReviewStatus;)V", "timeOfRequest", "", "(Lcom/woocommerce/android/model/ProductReview;Lcom/woocommerce/android/ui/reviews/ProductReviewStatus;J)V", "getNewStatus", "()Lcom/woocommerce/android/ui/reviews/ProductReviewStatus;", "getReview", "()Lcom/woocommerce/android/model/ProductReview;", "compareTo", "", "other", "component1", "component2", "component3", "copy", "equals", "", "", "hashCode", "toString", "", "WooCommerce_wasabiDebug"})
public final class ReviewModerationRequest implements java.lang.Comparable<com.woocommerce.android.ui.reviews.ReviewModerationRequest> {
    @org.jetbrains.annotations.NotNull
    private final com.woocommerce.android.model.ProductReview review = null;
    @org.jetbrains.annotations.NotNull
    private final com.woocommerce.android.ui.reviews.ProductReviewStatus newStatus = null;
    private final long timeOfRequest = 0L;
    
    @org.jetbrains.annotations.NotNull
    public final com.woocommerce.android.ui.reviews.ReviewModerationRequest copy(@org.jetbrains.annotations.NotNull
    com.woocommerce.android.model.ProductReview review, @org.jetbrains.annotations.NotNull
    com.woocommerce.android.ui.reviews.ProductReviewStatus newStatus, long timeOfRequest) {
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
    
    private ReviewModerationRequest(com.woocommerce.android.model.ProductReview review, com.woocommerce.android.ui.reviews.ProductReviewStatus newStatus, long timeOfRequest) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.woocommerce.android.model.ProductReview component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.woocommerce.android.model.ProductReview getReview() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.woocommerce.android.ui.reviews.ProductReviewStatus component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.woocommerce.android.ui.reviews.ProductReviewStatus getNewStatus() {
        return null;
    }
    
    private final long component3() {
        return 0L;
    }
    
    public ReviewModerationRequest(@org.jetbrains.annotations.NotNull
    com.woocommerce.android.model.ProductReview review, @org.jetbrains.annotations.NotNull
    com.woocommerce.android.ui.reviews.ProductReviewStatus newStatus) {
        super();
    }
    
    @java.lang.Override
    public int compareTo(@org.jetbrains.annotations.NotNull
    com.woocommerce.android.ui.reviews.ReviewModerationRequest other) {
        return 0;
    }
}