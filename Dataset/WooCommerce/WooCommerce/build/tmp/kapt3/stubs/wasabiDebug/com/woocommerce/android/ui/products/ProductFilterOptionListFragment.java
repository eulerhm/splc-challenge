package com.woocommerce.android.ui.products;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0019\u001a\u00020\u001aH\u0016J\u0010\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J\b\u0010\u001e\u001a\u00020\u001aH\u0016J\u001a\u0010\u001f\u001a\u00020\u001a2\u0006\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0016J\u0018\u0010$\u001a\u00020\u001a2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010%\u001a\u00020&H\u0002J\u0018\u0010\'\u001a\u00020\u001a2\u0006\u0010(\u001a\u00020)2\u0006\u0010%\u001a\u00020&H\u0002J\u0016\u0010*\u001a\u00020\u001a2\f\u0010+\u001a\b\u0012\u0004\u0012\u00020\u001d0,H\u0002J\u0018\u0010-\u001a\u00020\u001a2\u0006\u0010(\u001a\u00020)2\u0006\u0010%\u001a\u00020&H\u0002R\u0014\u0010\u0005\u001a\u00020\u00068VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\t\u001a\u00020\n8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\u000f\u001a\u00020\u0010X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0013\u001a\u00020\u00148BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0015\u0010\u0016\u00a8\u0006."}, d2 = {"Lcom/woocommerce/android/ui/products/ProductFilterOptionListFragment;", "Lcom/woocommerce/android/ui/base/BaseFragment;", "Lcom/woocommerce/android/ui/products/OnLoadMoreListener;", "Lcom/woocommerce/android/ui/products/ProductFilterOptionListAdapter$OnProductFilterOptionClickListener;", "()V", "activityAppBarStatus", "Lcom/woocommerce/android/ui/main/AppBarStatus;", "getActivityAppBarStatus", "()Lcom/woocommerce/android/ui/main/AppBarStatus;", "arguments", "Lcom/woocommerce/android/ui/products/ProductFilterOptionListFragmentArgs;", "getArguments", "()Lcom/woocommerce/android/ui/products/ProductFilterOptionListFragmentArgs;", "arguments$delegate", "Landroidx/navigation/NavArgsLazy;", "mProductFilterOptionListAdapter", "Lcom/woocommerce/android/ui/products/ProductFilterOptionListAdapter;", "skeletonView", "Lcom/woocommerce/android/widgets/SkeletonView;", "viewModel", "Lcom/woocommerce/android/ui/products/ProductFilterListViewModel;", "getViewModel", "()Lcom/woocommerce/android/ui/products/ProductFilterListViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "onDestroyView", "", "onFilterOptionClick", "selectedFilter", "Lcom/woocommerce/android/ui/products/ProductFilterListViewModel$FilterListOptionItemUiModel;", "onRequestLoadMore", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "setupObservers", "binding", "Lcom/woocommerce/android/databinding/FragmentProductFilterOptionListBinding;", "showLoadMoreProgress", "show", "", "showProductFilterList", "productFilterOptionList", "", "showSkeleton", "WooCommerce_wasabiDebug"})
@dagger.hilt.android.AndroidEntryPoint
public final class ProductFilterOptionListFragment extends com.woocommerce.android.ui.base.BaseFragment implements com.woocommerce.android.ui.products.OnLoadMoreListener, com.woocommerce.android.ui.products.ProductFilterOptionListAdapter.OnProductFilterOptionClickListener {
    private final kotlin.Lazy viewModel$delegate = null;
    private final androidx.navigation.NavArgsLazy arguments$delegate = null;
    private com.woocommerce.android.ui.products.ProductFilterOptionListAdapter mProductFilterOptionListAdapter;
    private final com.woocommerce.android.widgets.SkeletonView skeletonView = null;
    
    public ProductFilterOptionListFragment() {
        super();
    }
    
    private final com.woocommerce.android.ui.products.ProductFilterListViewModel getViewModel() {
        return null;
    }
    
    private final com.woocommerce.android.ui.products.ProductFilterOptionListFragmentArgs getArguments() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public com.woocommerce.android.ui.main.AppBarStatus getActivityAppBarStatus() {
        return null;
    }
    
    @java.lang.Override
    public void onViewCreated(@org.jetbrains.annotations.NotNull
    android.view.View view, @org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    private final void setupObservers(com.woocommerce.android.ui.products.ProductFilterListViewModel viewModel, com.woocommerce.android.databinding.FragmentProductFilterOptionListBinding binding) {
    }
    
    private final void showSkeleton(boolean show, com.woocommerce.android.databinding.FragmentProductFilterOptionListBinding binding) {
    }
    
    private final void showLoadMoreProgress(boolean show, com.woocommerce.android.databinding.FragmentProductFilterOptionListBinding binding) {
    }
    
    private final void showProductFilterList(java.util.List<com.woocommerce.android.ui.products.ProductFilterListViewModel.FilterListOptionItemUiModel> productFilterOptionList) {
    }
    
    @java.lang.Override
    public void onFilterOptionClick(@org.jetbrains.annotations.NotNull
    com.woocommerce.android.ui.products.ProductFilterListViewModel.FilterListOptionItemUiModel selectedFilter) {
    }
    
    @java.lang.Override
    public void onRequestLoadMore() {
    }
    
    @java.lang.Override
    public void onDestroyView() {
    }
}