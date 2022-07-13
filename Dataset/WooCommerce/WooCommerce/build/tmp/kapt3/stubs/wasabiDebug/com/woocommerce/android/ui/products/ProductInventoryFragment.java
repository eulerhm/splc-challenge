package com.woocommerce.android.ui.products;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J\u0018\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001cH\u0002J\b\u0010\u001e\u001a\u00020\u001fH\u0016J\b\u0010 \u001a\u00020\u0017H\u0016J\b\u0010!\u001a\u00020\u0017H\u0016J\b\u0010\"\u001a\u00020\u0017H\u0016J\u001a\u0010#\u001a\u00020\u00172\u0006\u0010$\u001a\u00020\u00192\b\u0010%\u001a\u0004\u0018\u00010\u001fH\u0016J\u001a\u0010&\u001a\u00020\u00172\u0006\u0010\'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010*H\u0016J\u0010\u0010+\u001a\u00020\u00172\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\b\u0010,\u001a\u00020\u0017H\u0002R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u00058BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\t\u001a\u0004\u0018\u00010\n8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0010\u001a\u00020\u00118BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0013\u00a8\u0006-"}, d2 = {"Lcom/woocommerce/android/ui/products/ProductInventoryFragment;", "Lcom/woocommerce/android/ui/products/BaseProductEditorFragment;", "Lcom/woocommerce/android/ui/products/ProductItemSelectorDialog$ProductItemSelectorDialogListener;", "()V", "_binding", "Lcom/woocommerce/android/databinding/FragmentProductInventoryBinding;", "binding", "getBinding", "()Lcom/woocommerce/android/databinding/FragmentProductInventoryBinding;", "lastEvent", "Lcom/woocommerce/android/viewmodel/MultiLiveEvent$Event;", "getLastEvent", "()Lcom/woocommerce/android/viewmodel/MultiLiveEvent$Event;", "productBackOrderSelectorDialog", "Lcom/woocommerce/android/ui/products/ProductItemSelectorDialog;", "productStockStatusSelectorDialog", "viewModel", "Lcom/woocommerce/android/ui/products/ProductInventoryViewModel;", "getViewModel", "()Lcom/woocommerce/android/ui/products/ProductInventoryViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "displaySkuError", "", "messageId", "", "enableManageStockStatus", "isStockManaged", "", "isStockStatusVisible", "getFragmentTitle", "", "onDestroyView", "onExit", "onPause", "onProductItemSelected", "resultCode", "selectedItem", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "setupObservers", "setupViews", "WooCommerce_wasabiDebug"})
@dagger.hilt.android.AndroidEntryPoint
public final class ProductInventoryFragment extends com.woocommerce.android.ui.products.BaseProductEditorFragment implements com.woocommerce.android.ui.products.ProductItemSelectorDialog.ProductItemSelectorDialogListener {
    private final kotlin.Lazy viewModel$delegate = null;
    private com.woocommerce.android.ui.products.ProductItemSelectorDialog productBackOrderSelectorDialog;
    private com.woocommerce.android.ui.products.ProductItemSelectorDialog productStockStatusSelectorDialog;
    private com.woocommerce.android.databinding.FragmentProductInventoryBinding _binding;
    
    public ProductInventoryFragment() {
        super(0);
    }
    
    private final com.woocommerce.android.ui.products.ProductInventoryViewModel getViewModel() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public com.woocommerce.android.viewmodel.MultiLiveEvent.Event getLastEvent() {
        return null;
    }
    
    private final com.woocommerce.android.databinding.FragmentProductInventoryBinding getBinding() {
        return null;
    }
    
    @java.lang.Override
    public void onPause() {
    }
    
    @java.lang.Override
    public void onViewCreated(@org.jetbrains.annotations.NotNull
    android.view.View view, @org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override
    public void onDestroyView() {
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.lang.String getFragmentTitle() {
        return null;
    }
    
    private final void setupObservers(com.woocommerce.android.ui.products.ProductInventoryViewModel viewModel) {
    }
    
    private final void displaySkuError(int messageId) {
    }
    
    private final void setupViews() {
    }
    
    private final void enableManageStockStatus(boolean isStockManaged, boolean isStockStatusVisible) {
    }
    
    @java.lang.Override
    public void onProductItemSelected(int resultCode, @org.jetbrains.annotations.Nullable
    java.lang.String selectedItem) {
    }
    
    @java.lang.Override
    public void onExit() {
    }
}