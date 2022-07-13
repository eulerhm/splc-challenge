package com.woocommerce.android.ui.products;

import java.lang.System;

/**
 * Dialog which displays a list of product shipping classes
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0007\u0018\u0000 )2\u00020\u0001:\u0001)B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u0019H\u0002J\b\u0010\u001b\u001a\u00020\u0019H\u0016J\u0010\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u001eH\u0002J\u001a\u0010\u001f\u001a\u00020\u00192\u0006\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0016J\b\u0010$\u001a\u00020\u0019H\u0002J\u0010\u0010%\u001a\u00020\u00192\u0006\u0010&\u001a\u00020\'H\u0002J\u0010\u0010(\u001a\u00020\u00192\u0006\u0010&\u001a\u00020\'H\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u00020\u00048BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\b\u001a\u00020\t8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0010\u001a\u00020\u00118BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0013\u00a8\u0006*"}, d2 = {"Lcom/woocommerce/android/ui/products/ProductShippingClassFragment;", "Lcom/woocommerce/android/ui/base/BaseFragment;", "()V", "_binding", "Lcom/woocommerce/android/databinding/FragmentProductShippingClassListBinding;", "binding", "getBinding", "()Lcom/woocommerce/android/databinding/FragmentProductShippingClassListBinding;", "navArgs", "Lcom/woocommerce/android/ui/products/ProductShippingClassFragmentArgs;", "getNavArgs", "()Lcom/woocommerce/android/ui/products/ProductShippingClassFragmentArgs;", "navArgs$delegate", "Landroidx/navigation/NavArgsLazy;", "shippingClassAdapter", "Lcom/woocommerce/android/ui/products/ProductShippingClassAdapter;", "viewModel", "Lcom/woocommerce/android/ui/products/ProductShippingClassViewModel;", "getViewModel", "()Lcom/woocommerce/android/ui/products/ProductShippingClassViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "getFragmentTitle", "", "onDestroyView", "", "onLoadMoreRequested", "onResume", "onShippingClassClicked", "shippingClass", "Lcom/woocommerce/android/model/ShippingClass;", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "setupObservers", "showLoadingMoreProgress", "show", "", "showLoadingProgress", "Companion", "WooCommerce_vanillaDebug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class ProductShippingClassFragment extends com.woocommerce.android.ui.base.BaseFragment {
    @org.jetbrains.annotations.NotNull()
    public static final com.woocommerce.android.ui.products.ProductShippingClassFragment.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String TAG = "ProductShippingClassFragment";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String SELECTED_SHIPPING_CLASS_RESULT = "selected-shipping-class";
    private final kotlin.Lazy viewModel$delegate = null;
    private final androidx.navigation.NavArgsLazy navArgs$delegate = null;
    private com.woocommerce.android.ui.products.ProductShippingClassAdapter shippingClassAdapter;
    private com.woocommerce.android.databinding.FragmentProductShippingClassListBinding _binding;
    
    public ProductShippingClassFragment() {
        super();
    }
    
    private final com.woocommerce.android.ui.products.ProductShippingClassViewModel getViewModel() {
        return null;
    }
    
    private final com.woocommerce.android.ui.products.ProductShippingClassFragmentArgs getNavArgs() {
        return null;
    }
    
    private final com.woocommerce.android.databinding.FragmentProductShippingClassListBinding getBinding() {
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
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getFragmentTitle() {
        return null;
    }
    
    private final void onShippingClassClicked(com.woocommerce.android.model.ShippingClass shippingClass) {
    }
    
    private final void onLoadMoreRequested() {
    }
    
    private final void showLoadingProgress(boolean show) {
    }
    
    private final void showLoadingMoreProgress(boolean show) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/woocommerce/android/ui/products/ProductShippingClassFragment$Companion;", "", "()V", "SELECTED_SHIPPING_CLASS_RESULT", "", "TAG", "WooCommerce_vanillaDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}