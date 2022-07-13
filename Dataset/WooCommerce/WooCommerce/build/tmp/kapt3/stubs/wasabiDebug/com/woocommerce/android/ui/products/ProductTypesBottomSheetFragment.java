package com.woocommerce.android.ui.products;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0002\b\u0007\u0018\u0000 /2\u00020\u0001:\u0001/B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fH\u0002J$\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010%2\b\u0010&\u001a\u0004\u0018\u00010\'H\u0016J\b\u0010(\u001a\u00020\u001dH\u0016J\u001a\u0010)\u001a\u00020\u001d2\u0006\u0010*\u001a\u00020!2\b\u0010&\u001a\u0004\u0018\u00010\'H\u0016J\b\u0010+\u001a\u00020\u001dH\u0002J\u0016\u0010,\u001a\u00020\u001d2\f\u0010-\u001a\b\u0012\u0004\u0012\u00020\u001f0.H\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u00020\u00048BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\b\u001a\u00020\t8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR\u001e\u0010\u000e\u001a\u00020\u000f8\u0000@\u0000X\u0081.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0016\u001a\u00020\u00178FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0018\u0010\u0019\u00a8\u00060"}, d2 = {"Lcom/woocommerce/android/ui/products/ProductTypesBottomSheetFragment;", "Lcom/woocommerce/android/widgets/WCBottomSheetDialogFragment;", "()V", "_binding", "Lcom/woocommerce/android/databinding/DialogProductDetailBottomSheetListBinding;", "binding", "getBinding", "()Lcom/woocommerce/android/databinding/DialogProductDetailBottomSheetListBinding;", "navArgs", "Lcom/woocommerce/android/ui/products/ProductTypesBottomSheetFragmentArgs;", "getNavArgs", "()Lcom/woocommerce/android/ui/products/ProductTypesBottomSheetFragmentArgs;", "navArgs$delegate", "Landroidx/navigation/NavArgsLazy;", "navigator", "Lcom/woocommerce/android/ui/products/ProductNavigator;", "getNavigator$WooCommerce_wasabiDebug", "()Lcom/woocommerce/android/ui/products/ProductNavigator;", "setNavigator$WooCommerce_wasabiDebug", "(Lcom/woocommerce/android/ui/products/ProductNavigator;)V", "productTypesBottomSheetAdapter", "Lcom/woocommerce/android/ui/products/ProductTypesBottomSheetAdapter;", "viewModel", "Lcom/woocommerce/android/ui/products/ProductTypesBottomSheetViewModel;", "getViewModel", "()Lcom/woocommerce/android/ui/products/ProductTypesBottomSheetViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "navigateWithSelectedResult", "", "productTypesBottomSheetUiItem", "Lcom/woocommerce/android/ui/products/ProductTypesBottomSheetViewModel$ProductTypesBottomSheetUiItem;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyView", "onViewCreated", "view", "setupObservers", "showProductTypeOptions", "productTypeOptions", "", "Companion", "WooCommerce_wasabiDebug"})
@dagger.hilt.android.AndroidEntryPoint
public final class ProductTypesBottomSheetFragment extends com.woocommerce.android.widgets.WCBottomSheetDialogFragment {
    @org.jetbrains.annotations.NotNull
    public static final com.woocommerce.android.ui.products.ProductTypesBottomSheetFragment.Companion Companion = null;
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String KEY_PRODUCT_TYPE_RESULT = "key_product_type_result";
    @javax.inject.Inject
    public com.woocommerce.android.ui.products.ProductNavigator navigator;
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy viewModel$delegate = null;
    private com.woocommerce.android.ui.products.ProductTypesBottomSheetAdapter productTypesBottomSheetAdapter;
    private final androidx.navigation.NavArgsLazy navArgs$delegate = null;
    private com.woocommerce.android.databinding.DialogProductDetailBottomSheetListBinding _binding;
    
    public ProductTypesBottomSheetFragment() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.woocommerce.android.ui.products.ProductNavigator getNavigator$WooCommerce_wasabiDebug() {
        return null;
    }
    
    public final void setNavigator$WooCommerce_wasabiDebug(@org.jetbrains.annotations.NotNull
    com.woocommerce.android.ui.products.ProductNavigator p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.woocommerce.android.ui.products.ProductTypesBottomSheetViewModel getViewModel() {
        return null;
    }
    
    private final com.woocommerce.android.ui.products.ProductTypesBottomSheetFragmentArgs getNavArgs() {
        return null;
    }
    
    private final com.woocommerce.android.databinding.DialogProductDetailBottomSheetListBinding getBinding() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override
    public void onDestroyView() {
    }
    
    @java.lang.Override
    public void onViewCreated(@org.jetbrains.annotations.NotNull
    android.view.View view, @org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    private final void setupObservers() {
    }
    
    private final void showProductTypeOptions(java.util.List<com.woocommerce.android.ui.products.ProductTypesBottomSheetViewModel.ProductTypesBottomSheetUiItem> productTypeOptions) {
    }
    
    private final void navigateWithSelectedResult(com.woocommerce.android.ui.products.ProductTypesBottomSheetViewModel.ProductTypesBottomSheetUiItem productTypesBottomSheetUiItem) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/woocommerce/android/ui/products/ProductTypesBottomSheetFragment$Companion;", "", "()V", "KEY_PRODUCT_TYPE_RESULT", "", "WooCommerce_wasabiDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}