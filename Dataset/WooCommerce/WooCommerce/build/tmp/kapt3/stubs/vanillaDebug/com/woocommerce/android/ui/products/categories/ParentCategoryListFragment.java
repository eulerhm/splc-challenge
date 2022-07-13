package com.woocommerce.android.ui.products.categories;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u001a\u001a\u00020\u001bH\u0016J\u0012\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016J\b\u0010 \u001a\u00020\u001dH\u0016J\u0010\u0010!\u001a\u00020\u001d2\u0006\u0010\"\u001a\u00020#H\u0016J\b\u0010$\u001a\u00020\u001dH\u0016J\b\u0010%\u001a\u00020\u001dH\u0016J\u001a\u0010&\u001a\u00020\u001d2\u0006\u0010\'\u001a\u00020(2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016J\u0010\u0010)\u001a\u00020\u001d2\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\u0010\u0010*\u001a\u00020\u001d2\u0006\u0010+\u001a\u00020,H\u0002J\u0016\u0010-\u001a\u00020\u001d2\f\u0010.\u001a\b\u0012\u0004\u0012\u00020#0/H\u0002J\u0010\u00100\u001a\u00020\u001d2\u0006\u0010+\u001a\u00020,H\u0002R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\u00068BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u000bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u000e\u001a\u00020\u000f8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0014\u001a\u00020\u00158BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0016\u0010\u0017\u00a8\u00061"}, d2 = {"Lcom/woocommerce/android/ui/products/categories/ParentCategoryListFragment;", "Lcom/woocommerce/android/ui/base/BaseFragment;", "Lcom/woocommerce/android/ui/products/OnLoadMoreListener;", "Lcom/woocommerce/android/ui/products/categories/OnProductCategoryClickListener;", "()V", "_binding", "Lcom/woocommerce/android/databinding/FragmentProductCategoriesListBinding;", "binding", "getBinding", "()Lcom/woocommerce/android/databinding/FragmentProductCategoriesListBinding;", "parentCategoryListAdapter", "Lcom/woocommerce/android/ui/products/categories/ParentCategoryListAdapter;", "skeletonView", "Lcom/woocommerce/android/widgets/SkeletonView;", "uiMessageResolver", "Lcom/woocommerce/android/ui/base/UIMessageResolver;", "getUiMessageResolver", "()Lcom/woocommerce/android/ui/base/UIMessageResolver;", "setUiMessageResolver", "(Lcom/woocommerce/android/ui/base/UIMessageResolver;)V", "viewModel", "Lcom/woocommerce/android/ui/products/categories/AddProductCategoryViewModel;", "getViewModel", "()Lcom/woocommerce/android/ui/products/categories/AddProductCategoryViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "getFragmentTitle", "", "onActivityCreated", "", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyView", "onProductCategoryClick", "productCategoryItemUiModel", "Lcom/woocommerce/android/ui/products/categories/ProductCategoryItemUiModel;", "onRequestLoadMore", "onResume", "onViewCreated", "view", "Landroid/view/View;", "setupObservers", "showLoadMoreProgress", "show", "", "showParentCategories", "productCategories", "", "showSkeleton", "WooCommerce_vanillaDebug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class ParentCategoryListFragment extends com.woocommerce.android.ui.base.BaseFragment implements com.woocommerce.android.ui.products.OnLoadMoreListener, com.woocommerce.android.ui.products.categories.OnProductCategoryClickListener {
    @javax.inject.Inject()
    public com.woocommerce.android.ui.base.UIMessageResolver uiMessageResolver;
    private final kotlin.Lazy viewModel$delegate = null;
    private com.woocommerce.android.ui.products.categories.ParentCategoryListAdapter parentCategoryListAdapter;
    private final com.woocommerce.android.widgets.SkeletonView skeletonView = null;
    private com.woocommerce.android.databinding.FragmentProductCategoriesListBinding _binding;
    
    public ParentCategoryListFragment() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.woocommerce.android.ui.base.UIMessageResolver getUiMessageResolver() {
        return null;
    }
    
    public final void setUiMessageResolver(@org.jetbrains.annotations.NotNull()
    com.woocommerce.android.ui.base.UIMessageResolver p0) {
    }
    
    private final com.woocommerce.android.ui.products.categories.AddProductCategoryViewModel getViewModel() {
        return null;
    }
    
    private final com.woocommerce.android.databinding.FragmentProductCategoriesListBinding getBinding() {
        return null;
    }
    
    @java.lang.Override()
    public void onResume() {
    }
    
    @java.lang.Override()
    public void onDestroyView() {
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getFragmentTitle() {
        return null;
    }
    
    @java.lang.Override()
    public void onActivityCreated(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void setupObservers(com.woocommerce.android.ui.products.categories.AddProductCategoryViewModel viewModel) {
    }
    
    private final void showParentCategories(java.util.List<com.woocommerce.android.ui.products.categories.ProductCategoryItemUiModel> productCategories) {
    }
    
    private final void showSkeleton(boolean show) {
    }
    
    private final void showLoadMoreProgress(boolean show) {
    }
    
    @java.lang.Override()
    public void onRequestLoadMore() {
    }
    
    @java.lang.Override()
    public void onProductCategoryClick(@org.jetbrains.annotations.NotNull()
    com.woocommerce.android.ui.products.categories.ProductCategoryItemUiModel productCategoryItemUiModel) {
    }
}