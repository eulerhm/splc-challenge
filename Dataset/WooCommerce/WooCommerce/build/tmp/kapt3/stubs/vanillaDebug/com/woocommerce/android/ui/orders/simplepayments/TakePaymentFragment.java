package com.woocommerce.android.ui.orders.simplepayments;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u001bH\u0016J\b\u0010\u001c\u001a\u00020\u001bH\u0016J\u001a\u0010\u001d\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!H\u0016J\b\u0010\"\u001a\u00020\u001bH\u0002J\b\u0010#\u001a\u00020\u001bH\u0002J\u0018\u0010$\u001a\u00020\u001b2\u0006\u0010%\u001a\u00020\u00192\u0006\u0010&\u001a\u00020\u0019H\u0002R\u001c\u0010\u0003\u001a\u0010\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0007\u001a\u00020\b8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR\u001e\u0010\r\u001a\u00020\u000e8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0013\u001a\u00020\u00148BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0017\u0010\f\u001a\u0004\b\u0015\u0010\u0016\u00a8\u0006\'"}, d2 = {"Lcom/woocommerce/android/ui/orders/simplepayments/TakePaymentFragment;", "Lcom/woocommerce/android/ui/base/BaseFragment;", "()V", "sharePaymentUrlLauncher", "Landroidx/activity/result/ActivityResultLauncher;", "Landroid/content/Intent;", "kotlin.jvm.PlatformType", "sharedViewModel", "Lcom/woocommerce/android/ui/orders/simplepayments/SimplePaymentsSharedViewModel;", "getSharedViewModel", "()Lcom/woocommerce/android/ui/orders/simplepayments/SimplePaymentsSharedViewModel;", "sharedViewModel$delegate", "Lkotlin/Lazy;", "uiMessageResolver", "Lcom/woocommerce/android/ui/base/UIMessageResolver;", "getUiMessageResolver", "()Lcom/woocommerce/android/ui/base/UIMessageResolver;", "setUiMessageResolver", "(Lcom/woocommerce/android/ui/base/UIMessageResolver;)V", "viewModel", "Lcom/woocommerce/android/ui/orders/simplepayments/TakePaymentViewModel;", "getViewModel", "()Lcom/woocommerce/android/ui/orders/simplepayments/TakePaymentViewModel;", "viewModel$delegate", "getFragmentTitle", "", "onResume", "", "onStop", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "setUpObservers", "setupResultHandlers", "sharePaymentUrl", "storeName", "paymentUrl", "WooCommerce_vanillaDebug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class TakePaymentFragment extends com.woocommerce.android.ui.base.BaseFragment {
    private final kotlin.Lazy viewModel$delegate = null;
    private final kotlin.Lazy sharedViewModel$delegate = null;
    @javax.inject.Inject()
    public com.woocommerce.android.ui.base.UIMessageResolver uiMessageResolver;
    private final androidx.activity.result.ActivityResultLauncher<android.content.Intent> sharePaymentUrlLauncher = null;
    
    public TakePaymentFragment() {
        super();
    }
    
    private final com.woocommerce.android.ui.orders.simplepayments.TakePaymentViewModel getViewModel() {
        return null;
    }
    
    private final com.woocommerce.android.ui.orders.simplepayments.SimplePaymentsSharedViewModel getSharedViewModel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.woocommerce.android.ui.base.UIMessageResolver getUiMessageResolver() {
        return null;
    }
    
    public final void setUiMessageResolver(@org.jetbrains.annotations.NotNull()
    com.woocommerce.android.ui.base.UIMessageResolver p0) {
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void setUpObservers() {
    }
    
    private final void setupResultHandlers() {
    }
    
    private final void sharePaymentUrl(java.lang.String storeName, java.lang.String paymentUrl) {
    }
    
    @java.lang.Override()
    public void onResume() {
    }
    
    @java.lang.Override()
    public void onStop() {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getFragmentTitle() {
        return null;
    }
}