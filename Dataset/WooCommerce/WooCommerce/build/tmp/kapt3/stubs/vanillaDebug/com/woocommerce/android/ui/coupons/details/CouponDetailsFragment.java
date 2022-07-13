package com.woocommerce.android.ui.coupons.details;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J$\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0016J\u001a\u0010\u001f\u001a\u00020\u00142\u0006\u0010 \u001a\u00020\u00182\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0016J\b\u0010!\u001a\u00020\u0014H\u0002J\u0010\u0010\"\u001a\u00020\u00142\u0006\u0010#\u001a\u00020\u0016H\u0002R\u0014\u0010\u0003\u001a\u00020\u00048VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u001e\u0010\u0007\u001a\u00020\b8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001b\u0010\r\u001a\u00020\u000e8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010\u00a8\u0006$"}, d2 = {"Lcom/woocommerce/android/ui/coupons/details/CouponDetailsFragment;", "Lcom/woocommerce/android/ui/base/BaseFragment;", "()V", "activityAppBarStatus", "Lcom/woocommerce/android/ui/main/AppBarStatus;", "getActivityAppBarStatus", "()Lcom/woocommerce/android/ui/main/AppBarStatus;", "uiMessageResolver", "Lcom/woocommerce/android/ui/base/UIMessageResolver;", "getUiMessageResolver", "()Lcom/woocommerce/android/ui/base/UIMessageResolver;", "setUiMessageResolver", "(Lcom/woocommerce/android/ui/base/UIMessageResolver;)V", "viewModel", "Lcom/woocommerce/android/ui/coupons/details/CouponDetailsViewModel;", "getViewModel", "()Lcom/woocommerce/android/ui/coupons/details/CouponDetailsViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "copyCodeToClipboard", "", "couponCode", "", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "setupObservers", "shareCode", "shareCodeMessage", "WooCommerce_vanillaDebug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class CouponDetailsFragment extends com.woocommerce.android.ui.base.BaseFragment {
    @javax.inject.Inject()
    public com.woocommerce.android.ui.base.UIMessageResolver uiMessageResolver;
    private final kotlin.Lazy viewModel$delegate = null;
    
    public CouponDetailsFragment() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.woocommerce.android.ui.base.UIMessageResolver getUiMessageResolver() {
        return null;
    }
    
    public final void setUiMessageResolver(@org.jetbrains.annotations.NotNull()
    com.woocommerce.android.ui.base.UIMessageResolver p0) {
    }
    
    private final com.woocommerce.android.ui.coupons.details.CouponDetailsViewModel getViewModel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.woocommerce.android.ui.main.AppBarStatus getActivityAppBarStatus() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void setupObservers() {
    }
    
    private final void copyCodeToClipboard(java.lang.String couponCode) {
    }
    
    private final void shareCode(java.lang.String shareCodeMessage) {
    }
}