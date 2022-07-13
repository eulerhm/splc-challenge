package com.woocommerce.android.ui.main;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\f\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0006H&J\b\u0010\u0007\u001a\u00020\u0006H&J$\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\u0003H&J\"\u0010\r\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u000fH&J\u001a\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\n2\b\b\u0002\u0010\u0012\u001a\u00020\u0003H&J\"\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u0003H&J:\u0010\u0014\u001a\u00020\u00062\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u00162\b\u0010\u0018\u001a\u0004\u0018\u00010\u00162\b\u0010\u0019\u001a\u0004\u0018\u00010\u00162\b\u0010\u001a\u001a\u0004\u0018\u00010\u0016H&J\u0018\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\nH&J$\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u00032\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0016H&J,\u0010 \u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u000f2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0016H&J\b\u0010!\u001a\u00020\u0006H&\u00a8\u0006\""}, d2 = {"Lcom/woocommerce/android/ui/main/MainNavigationRouter;", "", "isAtNavigationRoot", "", "isChildFragmentShowing", "showAddProduct", "", "showFeedbackSurvey", "showOrderDetail", "orderId", "", "remoteNoteId", "launchedFromNotification", "showOrderDetailWithSharedTransition", "sharedView", "Landroid/view/View;", "showProductDetail", "remoteProductId", "enableTrash", "showProductDetailWithSharedTransition", "showProductFilters", "stockStatus", "", "productType", "productStatus", "productCategory", "productCategoryName", "showProductVariationDetail", "remoteVariationId", "showReviewDetail", "remoteReviewId", "tempStatus", "showReviewDetailWithSharedTransition", "showSettingsScreen", "WooCommerce_wasabiDebug"})
public abstract interface MainNavigationRouter {
    
    public abstract boolean isAtNavigationRoot();
    
    public abstract boolean isChildFragmentShowing();
    
    public abstract void showProductDetail(long remoteProductId, boolean enableTrash);
    
    public abstract void showProductDetailWithSharedTransition(long remoteProductId, @org.jetbrains.annotations.NotNull
    android.view.View sharedView, boolean enableTrash);
    
    public abstract void showProductVariationDetail(long remoteProductId, long remoteVariationId);
    
    public abstract void showOrderDetail(long orderId, long remoteNoteId, boolean launchedFromNotification);
    
    public abstract void showOrderDetailWithSharedTransition(long orderId, long remoteNoteId, @org.jetbrains.annotations.NotNull
    android.view.View sharedView);
    
    public abstract void showAddProduct();
    
    public abstract void showReviewDetail(long remoteReviewId, boolean launchedFromNotification, @org.jetbrains.annotations.Nullable
    java.lang.String tempStatus);
    
    public abstract void showReviewDetailWithSharedTransition(long remoteReviewId, boolean launchedFromNotification, @org.jetbrains.annotations.NotNull
    android.view.View sharedView, @org.jetbrains.annotations.Nullable
    java.lang.String tempStatus);
    
    public abstract void showProductFilters(@org.jetbrains.annotations.Nullable
    java.lang.String stockStatus, @org.jetbrains.annotations.Nullable
    java.lang.String productType, @org.jetbrains.annotations.Nullable
    java.lang.String productStatus, @org.jetbrains.annotations.Nullable
    java.lang.String productCategory, @org.jetbrains.annotations.Nullable
    java.lang.String productCategoryName);
    
    public abstract void showFeedbackSurvey();
    
    public abstract void showSettingsScreen();
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 3)
    public final class DefaultImpls {
    }
}