package com.woocommerce.android.ui.refunds;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u001f\u001a\u00020 H\u0002J\b\u0010!\u001a\u00020 H\u0016J\b\u0010\"\u001a\u00020 H\u0016J\u001a\u0010#\u001a\u00020 2\u0006\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010\'H\u0016J\u0010\u0010(\u001a\u00020 2\u0006\u0010\u0019\u001a\u00020\u001aH\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\u00048BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\b\u0010\tR\u001e\u0010\n\u001a\u00020\u000b8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0010\u001a\u00020\u00118\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\u00068BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u001b\u0010\u0019\u001a\u00020\u001a8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001b\u0010\u001c\u00a8\u0006)"}, d2 = {"Lcom/woocommerce/android/ui/refunds/RefundDetailFragment;", "Lcom/woocommerce/android/ui/base/BaseFragment;", "()V", "_binding", "Lcom/woocommerce/android/databinding/FragmentRefundDetailBinding;", "_productsBinding", "Lcom/woocommerce/android/databinding/RefundByItemsProductsBinding;", "binding", "getBinding", "()Lcom/woocommerce/android/databinding/FragmentRefundDetailBinding;", "currencyFormatter", "Lcom/woocommerce/android/util/CurrencyFormatter;", "getCurrencyFormatter", "()Lcom/woocommerce/android/util/CurrencyFormatter;", "setCurrencyFormatter", "(Lcom/woocommerce/android/util/CurrencyFormatter;)V", "imageMap", "Lcom/woocommerce/android/tools/ProductImageMap;", "getImageMap", "()Lcom/woocommerce/android/tools/ProductImageMap;", "setImageMap", "(Lcom/woocommerce/android/tools/ProductImageMap;)V", "productsBinding", "getProductsBinding", "()Lcom/woocommerce/android/databinding/RefundByItemsProductsBinding;", "viewModel", "Lcom/woocommerce/android/ui/refunds/RefundDetailViewModel;", "getViewModel", "()Lcom/woocommerce/android/ui/refunds/RefundDetailViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "initializeViews", "", "onDestroyView", "onResume", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "setupObservers", "WooCommerce_vanillaDebug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class RefundDetailFragment extends com.woocommerce.android.ui.base.BaseFragment {
    @javax.inject.Inject()
    public com.woocommerce.android.util.CurrencyFormatter currencyFormatter;
    @javax.inject.Inject()
    public com.woocommerce.android.tools.ProductImageMap imageMap;
    private final kotlin.Lazy viewModel$delegate = null;
    private com.woocommerce.android.databinding.FragmentRefundDetailBinding _binding;
    private com.woocommerce.android.databinding.RefundByItemsProductsBinding _productsBinding;
    
    public RefundDetailFragment() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.woocommerce.android.util.CurrencyFormatter getCurrencyFormatter() {
        return null;
    }
    
    public final void setCurrencyFormatter(@org.jetbrains.annotations.NotNull()
    com.woocommerce.android.util.CurrencyFormatter p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.woocommerce.android.tools.ProductImageMap getImageMap() {
        return null;
    }
    
    public final void setImageMap(@org.jetbrains.annotations.NotNull()
    com.woocommerce.android.tools.ProductImageMap p0) {
    }
    
    private final com.woocommerce.android.ui.refunds.RefundDetailViewModel getViewModel() {
        return null;
    }
    
    private final com.woocommerce.android.databinding.FragmentRefundDetailBinding getBinding() {
        return null;
    }
    
    private final com.woocommerce.android.databinding.RefundByItemsProductsBinding getProductsBinding() {
        return null;
    }
    
    @java.lang.Override()
    public void onResume() {
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onDestroyView() {
    }
    
    private final void initializeViews() {
    }
    
    @kotlin.Suppress(names = {"LongMethod"})
    private final void setupObservers(com.woocommerce.android.ui.refunds.RefundDetailViewModel viewModel) {
    }
}