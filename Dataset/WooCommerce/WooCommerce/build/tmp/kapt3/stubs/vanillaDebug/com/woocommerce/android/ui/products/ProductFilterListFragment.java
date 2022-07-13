package com.woocommerce.android.ui.products;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 -2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001-B\u0005\u00a2\u0006\u0002\u0010\u0004J\u0018\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\u0010\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\nH\u0016J\u0010\u0010\u001c\u001a\u00020\u00142\u0006\u0010\u001d\u001a\u00020\u001eH\u0016J\b\u0010\u001f\u001a\u00020\u001aH\u0016J\b\u0010 \u001a\u00020\u0014H\u0016J\u001a\u0010!\u001a\u00020\u00142\u0006\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010%H\u0016J\u0010\u0010&\u001a\u00020\u00142\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u0010\u0010\'\u001a\u00020\u00142\u0006\u0010(\u001a\u00020\u001aH\u0002J\u0016\u0010)\u001a\u00020\u00142\f\u0010*\u001a\b\u0012\u0004\u0012\u00020,0+H\u0002R\u0014\u0010\u0005\u001a\u00020\u00068VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\r\u001a\u00020\u000e8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010\u00a8\u0006."}, d2 = {"Lcom/woocommerce/android/ui/products/ProductFilterListFragment;", "Lcom/woocommerce/android/ui/base/BaseFragment;", "Lcom/woocommerce/android/ui/products/ProductFilterListAdapter$OnProductFilterClickListener;", "Lcom/woocommerce/android/ui/main/MainActivity$Companion$BackPressListener;", "()V", "activityAppBarStatus", "Lcom/woocommerce/android/ui/main/AppBarStatus;", "getActivityAppBarStatus", "()Lcom/woocommerce/android/ui/main/AppBarStatus;", "clearAllMenuItem", "Landroid/view/MenuItem;", "productFilterListAdapter", "Lcom/woocommerce/android/ui/products/ProductFilterListAdapter;", "viewModel", "Lcom/woocommerce/android/ui/products/ProductFilterListViewModel;", "getViewModel", "()Lcom/woocommerce/android/ui/products/ProductFilterListViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "onCreateOptionsMenu", "", "menu", "Landroid/view/Menu;", "inflater", "Landroid/view/MenuInflater;", "onOptionsItemSelected", "", "item", "onProductFilterClick", "selectedFilterPosition", "", "onRequestAllowBackPress", "onResume", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "setupObservers", "showClearAllAction", "show", "showProductFilterList", "productFilterList", "", "Lcom/woocommerce/android/ui/products/ProductFilterListViewModel$FilterListItemUiModel;", "Companion", "WooCommerce_vanillaDebug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class ProductFilterListFragment extends com.woocommerce.android.ui.base.BaseFragment implements com.woocommerce.android.ui.products.ProductFilterListAdapter.OnProductFilterClickListener, com.woocommerce.android.ui.main.MainActivity.Companion.BackPressListener {
    @org.jetbrains.annotations.NotNull()
    public static final com.woocommerce.android.ui.products.ProductFilterListFragment.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String TAG = "ProductFilterListFragment";
    private final kotlin.Lazy viewModel$delegate = null;
    private com.woocommerce.android.ui.products.ProductFilterListAdapter productFilterListAdapter;
    private android.view.MenuItem clearAllMenuItem;
    
    public ProductFilterListFragment() {
        super();
    }
    
    private final com.woocommerce.android.ui.products.ProductFilterListViewModel getViewModel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.woocommerce.android.ui.main.AppBarStatus getActivityAppBarStatus() {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
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
    
    private final void setupObservers(com.woocommerce.android.ui.products.ProductFilterListViewModel viewModel) {
    }
    
    private final void showProductFilterList(java.util.List<com.woocommerce.android.ui.products.ProductFilterListViewModel.FilterListItemUiModel> productFilterList) {
    }
    
    private final void showClearAllAction(boolean show) {
    }
    
    @java.lang.Override()
    public void onProductFilterClick(int selectedFilterPosition) {
    }
    
    @java.lang.Override()
    public boolean onRequestAllowBackPress() {
        return false;
    }
    
    @java.lang.Override()
    public void onResume() {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/woocommerce/android/ui/products/ProductFilterListFragment$Companion;", "", "()V", "TAG", "", "WooCommerce_vanillaDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}