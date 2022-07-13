package com.woocommerce.android.ui.products.downloads;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\b\u0010\u0017\u001a\u00020\u0018H\u0002J\u0018\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J\b\u0010\u001e\u001a\u00020\u0018H\u0016J\u0010\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"H\u0016J\b\u0010#\u001a\u00020 H\u0016J\b\u0010$\u001a\u00020\u0018H\u0016J\u001a\u0010%\u001a\u00020\u00182\u0006\u0010&\u001a\u00020\'2\b\u0010(\u001a\u0004\u0018\u00010)H\u0016J\u000e\u0010*\u001a\u00020\u00182\u0006\u0010+\u001a\u00020,J\b\u0010-\u001a\u00020\u0018H\u0002J\b\u0010.\u001a\u00020\u0018H\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u00020\u00048BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\b\u001a\u00020\t8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR\u001b\u0010\u000e\u001a\u00020\u000f8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0012\u0010\r\u001a\u0004\b\u0010\u0010\u0011R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006/"}, d2 = {"Lcom/woocommerce/android/ui/products/downloads/ProductDownloadsFragment;", "Lcom/woocommerce/android/ui/products/BaseProductFragment;", "()V", "_binding", "Lcom/woocommerce/android/databinding/FragmentProductDownloadsListBinding;", "binding", "getBinding", "()Lcom/woocommerce/android/databinding/FragmentProductDownloadsListBinding;", "itemTouchHelper", "Lcom/woocommerce/android/widgets/DraggableItemTouchHelper;", "getItemTouchHelper", "()Lcom/woocommerce/android/widgets/DraggableItemTouchHelper;", "itemTouchHelper$delegate", "Lkotlin/Lazy;", "productDownloadsAdapter", "Lcom/woocommerce/android/ui/products/downloads/ProductDownloadsAdapter;", "getProductDownloadsAdapter", "()Lcom/woocommerce/android/ui/products/downloads/ProductDownloadsAdapter;", "productDownloadsAdapter$delegate", "progressDialog", "Lcom/woocommerce/android/widgets/CustomProgressDialog;", "getFragmentTitle", "", "hideUploadingProgressDialog", "", "onCreateOptionsMenu", "menu", "Landroid/view/Menu;", "inflater", "Landroid/view/MenuInflater;", "onDestroyView", "onOptionsItemSelected", "", "item", "Landroid/view/MenuItem;", "onRequestAllowBackPress", "onResume", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "setupObservers", "viewModel", "Lcom/woocommerce/android/ui/products/ProductDetailViewModel;", "showUploadingProgressDialog", "updateFilesFromProductDraft", "WooCommerce_vanillaDebug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class ProductDownloadsFragment extends com.woocommerce.android.ui.products.BaseProductFragment {
    private final kotlin.Lazy itemTouchHelper$delegate = null;
    private com.woocommerce.android.databinding.FragmentProductDownloadsListBinding _binding;
    private final kotlin.Lazy productDownloadsAdapter$delegate = null;
    private com.woocommerce.android.widgets.CustomProgressDialog progressDialog;
    
    public ProductDownloadsFragment() {
        super();
    }
    
    private final com.woocommerce.android.widgets.DraggableItemTouchHelper getItemTouchHelper() {
        return null;
    }
    
    private final com.woocommerce.android.databinding.FragmentProductDownloadsListBinding getBinding() {
        return null;
    }
    
    private final com.woocommerce.android.ui.products.downloads.ProductDownloadsAdapter getProductDownloadsAdapter() {
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
    
    @java.lang.Override()
    public void onCreateOptionsMenu(@org.jetbrains.annotations.NotNull()
    android.view.Menu menu, @org.jetbrains.annotations.NotNull()
    android.view.MenuInflater inflater) {
    }
    
    @java.lang.Override()
    public boolean onOptionsItemSelected(@org.jetbrains.annotations.NotNull()
    android.view.MenuItem item) {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getFragmentTitle() {
        return null;
    }
    
    public final void setupObservers(@org.jetbrains.annotations.NotNull()
    com.woocommerce.android.ui.products.ProductDetailViewModel viewModel) {
    }
    
    private final void showUploadingProgressDialog() {
    }
    
    private final void hideUploadingProgressDialog() {
    }
    
    private final void updateFilesFromProductDraft() {
    }
    
    @java.lang.Override()
    public boolean onRequestAllowBackPress() {
        return false;
    }
}