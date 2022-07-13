package com.woocommerce.android.ui.reviews;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\f\u0010\f\u001a\u00020\r*\u00020\u0000H&R\"\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003*\u00020\u0000X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0016\u0010\b\u001a\u00020\t*\u00020\u0000X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\u000e"}, d2 = {"Lcom/woocommerce/android/ui/reviews/ReviewModerationConsumer;", "", "rawReviewList", "Landroidx/lifecycle/LiveData;", "", "Lcom/woocommerce/android/model/ProductReview;", "getRawReviewList", "(Lcom/woocommerce/android/ui/reviews/ReviewModerationConsumer;)Landroidx/lifecycle/LiveData;", "reviewModerationHandler", "Lcom/woocommerce/android/ui/reviews/ReviewModerationHandler;", "getReviewModerationHandler", "(Lcom/woocommerce/android/ui/reviews/ReviewModerationConsumer;)Lcom/woocommerce/android/ui/reviews/ReviewModerationHandler;", "onReviewModerationSuccess", "", "WooCommerce_vanillaDebug"})
public abstract interface ReviewModerationConsumer {
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.woocommerce.android.ui.reviews.ReviewModerationHandler getReviewModerationHandler(@org.jetbrains.annotations.NotNull()
    com.woocommerce.android.ui.reviews.ReviewModerationConsumer $this$reviewModerationHandler);
    
    @org.jetbrains.annotations.NotNull()
    public abstract androidx.lifecycle.LiveData<java.util.List<com.woocommerce.android.model.ProductReview>> getRawReviewList(@org.jetbrains.annotations.NotNull()
    com.woocommerce.android.ui.reviews.ReviewModerationConsumer $this$rawReviewList);
    
    public abstract void onReviewModerationSuccess(@org.jetbrains.annotations.NotNull()
    com.woocommerce.android.ui.reviews.ReviewModerationConsumer $this$onReviewModerationSuccess);
}