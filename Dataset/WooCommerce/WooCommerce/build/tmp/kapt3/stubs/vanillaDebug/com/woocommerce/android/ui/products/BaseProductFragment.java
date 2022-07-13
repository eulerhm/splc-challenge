package com.woocommerce.android.ui.products;

import java.lang.System;

/**
 * All product related fragments should extend this class to provide a consistent method
 * of displaying snackbars and handling navigation
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u00002\u00020\u00012\u00020\u0002B\u0007\b\u0016\u00a2\u0006\u0002\u0010\u0003B\u0011\b\u0016\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010\u0019\u001a\u00020\u001aH\u0017J\u001a\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0017J\u0010\u0010 \u001a\u00020\u001a2\u0006\u0010\u0013\u001a\u00020\u0014H\u0002R\u001e\u0010\u0007\u001a\u00020\b8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001e\u0010\r\u001a\u00020\u000e8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0013\u001a\u00020\u00148DX\u0084\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0015\u0010\u0016\u00a8\u0006!"}, d2 = {"Lcom/woocommerce/android/ui/products/BaseProductFragment;", "Lcom/woocommerce/android/ui/base/BaseFragment;", "Lcom/woocommerce/android/ui/main/MainActivity$Companion$BackPressListener;", "()V", "layoutId", "", "(I)V", "navigator", "Lcom/woocommerce/android/ui/products/ProductNavigator;", "getNavigator", "()Lcom/woocommerce/android/ui/products/ProductNavigator;", "setNavigator", "(Lcom/woocommerce/android/ui/products/ProductNavigator;)V", "uiMessageResolver", "Lcom/woocommerce/android/ui/base/UIMessageResolver;", "getUiMessageResolver", "()Lcom/woocommerce/android/ui/base/UIMessageResolver;", "setUiMessageResolver", "(Lcom/woocommerce/android/ui/base/UIMessageResolver;)V", "viewModel", "Lcom/woocommerce/android/ui/products/ProductDetailViewModel;", "getViewModel", "()Lcom/woocommerce/android/ui/products/ProductDetailViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "onStop", "", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "setupObservers", "WooCommerce_vanillaDebug"})
public abstract class BaseProductFragment extends com.woocommerce.android.ui.base.BaseFragment implements com.woocommerce.android.ui.main.MainActivity.Companion.BackPressListener {
    @javax.inject.Inject()
    public com.woocommerce.android.ui.products.ProductNavigator navigator;
    @javax.inject.Inject()
    public com.woocommerce.android.ui.base.UIMessageResolver uiMessageResolver;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy viewModel$delegate = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.woocommerce.android.ui.products.ProductNavigator getNavigator() {
        return null;
    }
    
    public final void setNavigator(@org.jetbrains.annotations.NotNull()
    com.woocommerce.android.ui.products.ProductNavigator p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.woocommerce.android.ui.base.UIMessageResolver getUiMessageResolver() {
        return null;
    }
    
    public final void setUiMessageResolver(@org.jetbrains.annotations.NotNull()
    com.woocommerce.android.ui.base.UIMessageResolver p0) {
    }
    
    public BaseProductFragment() {
        super();
    }
    
    public BaseProductFragment(@androidx.annotation.LayoutRes()
    int layoutId) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final com.woocommerce.android.ui.products.ProductDetailViewModel getViewModel() {
        return null;
    }
    
    @androidx.annotation.CallSuper()
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void setupObservers(com.woocommerce.android.ui.products.ProductDetailViewModel viewModel) {
    }
    
    @androidx.annotation.CallSuper()
    @java.lang.Override()
    public void onStop() {
    }
}