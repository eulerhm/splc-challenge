package com.woocommerce.android.ui.products;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010(\u001a\u00020)H\u0016J\b\u0010*\u001a\u00020+H\u0016J\b\u0010,\u001a\u00020-H\u0016J\b\u0010.\u001a\u00020+H\u0016J\u001a\u0010/\u001a\u00020+2\u0006\u00100\u001a\u0002012\b\u00102\u001a\u0004\u0018\u000103H\u0016J\b\u00104\u001a\u00020+H\u0002J\b\u00105\u001a\u00020+H\u0002J\u0010\u00106\u001a\u00020+2\u0006\u00107\u001a\u00020-H\u0002J\u0010\u00108\u001a\u00020+2\u0006\u00107\u001a\u00020-H\u0002R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u00058BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001e\u0010\u000f\u001a\u00020\u00108\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001b\u0010\u0015\u001a\u00020\u00168BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0017\u0010\u0018R\u000e\u0010\u001b\u001a\u00020\u001cX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u001d\u001a\u00020\u001e8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001b\u0010#\u001a\u00020$8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\'\u0010\u001a\u001a\u0004\b%\u0010&\u00a8\u00069"}, d2 = {"Lcom/woocommerce/android/ui/products/GroupedProductListFragment;", "Lcom/woocommerce/android/ui/base/BaseFragment;", "Lcom/woocommerce/android/ui/main/MainActivity$Companion$BackPressListener;", "()V", "_binding", "Lcom/woocommerce/android/databinding/FragmentGroupedProductListBinding;", "binding", "getBinding", "()Lcom/woocommerce/android/databinding/FragmentGroupedProductListBinding;", "currencyFormatter", "Lcom/woocommerce/android/util/CurrencyFormatter;", "getCurrencyFormatter", "()Lcom/woocommerce/android/util/CurrencyFormatter;", "setCurrencyFormatter", "(Lcom/woocommerce/android/util/CurrencyFormatter;)V", "navigator", "Lcom/woocommerce/android/ui/products/ProductNavigator;", "getNavigator", "()Lcom/woocommerce/android/ui/products/ProductNavigator;", "setNavigator", "(Lcom/woocommerce/android/ui/products/ProductNavigator;)V", "productListAdapter", "Lcom/woocommerce/android/ui/products/GroupedProductListAdapter;", "getProductListAdapter", "()Lcom/woocommerce/android/ui/products/GroupedProductListAdapter;", "productListAdapter$delegate", "Lkotlin/Lazy;", "skeletonView", "Lcom/woocommerce/android/widgets/SkeletonView;", "uiMessageResolver", "Lcom/woocommerce/android/ui/base/UIMessageResolver;", "getUiMessageResolver", "()Lcom/woocommerce/android/ui/base/UIMessageResolver;", "setUiMessageResolver", "(Lcom/woocommerce/android/ui/base/UIMessageResolver;)V", "viewModel", "Lcom/woocommerce/android/ui/products/GroupedProductListViewModel;", "getViewModel", "()Lcom/woocommerce/android/ui/products/GroupedProductListViewModel;", "viewModel$delegate", "getFragmentTitle", "", "onDestroyView", "", "onRequestAllowBackPress", "", "onResume", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "setupObservers", "setupResultHandlers", "showAddProductButton", "show", "showSkeleton", "WooCommerce_vanillaDebug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class GroupedProductListFragment extends com.woocommerce.android.ui.base.BaseFragment implements com.woocommerce.android.ui.main.MainActivity.Companion.BackPressListener {
    @javax.inject.Inject()
    public com.woocommerce.android.ui.products.ProductNavigator navigator;
    @javax.inject.Inject()
    public com.woocommerce.android.ui.base.UIMessageResolver uiMessageResolver;
    @javax.inject.Inject()
    public com.woocommerce.android.util.CurrencyFormatter currencyFormatter;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy viewModel$delegate = null;
    private final com.woocommerce.android.widgets.SkeletonView skeletonView = null;
    private final kotlin.Lazy productListAdapter$delegate = null;
    private com.woocommerce.android.databinding.FragmentGroupedProductListBinding _binding;
    
    public GroupedProductListFragment() {
        super();
    }
    
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
    
    @org.jetbrains.annotations.NotNull()
    public final com.woocommerce.android.util.CurrencyFormatter getCurrencyFormatter() {
        return null;
    }
    
    public final void setCurrencyFormatter(@org.jetbrains.annotations.NotNull()
    com.woocommerce.android.util.CurrencyFormatter p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.woocommerce.android.ui.products.GroupedProductListViewModel getViewModel() {
        return null;
    }
    
    private final com.woocommerce.android.ui.products.GroupedProductListAdapter getProductListAdapter() {
        return null;
    }
    
    private final com.woocommerce.android.databinding.FragmentGroupedProductListBinding getBinding() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getFragmentTitle() {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onDestroyView() {
    }
    
    @java.lang.Override()
    public void onResume() {
    }
    
    private final void setupObservers() {
    }
    
    private final void setupResultHandlers() {
    }
    
    private final void showAddProductButton(boolean show) {
    }
    
    private final void showSkeleton(boolean show) {
    }
    
    @java.lang.Override()
    public boolean onRequestAllowBackPress() {
        return false;
    }
}