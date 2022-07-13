package com.woocommerce.android.ui.products.categories;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u0012\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u0011H\u0016J\u0010\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u0011H\u0016J\b\u0010\u001b\u001a\u00020\u0011H\u0016J\u001a\u0010\u001c\u001a\u00020\u00112\u0006\u0010\u001d\u001a\u00020\u001e2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J\u0010\u0010\u001f\u001a\u00020\u00112\u0006\u0010 \u001a\u00020!H\u0002J\b\u0010\"\u001a\u00020\u0011H\u0002J\u0010\u0010#\u001a\u00020\u00112\u0006\u0010$\u001a\u00020\u0019H\u0002J\u0010\u0010%\u001a\u00020\u00112\u0006\u0010$\u001a\u00020\u0019H\u0002J\u0016\u0010&\u001a\u00020\u00112\f\u0010\'\u001a\b\u0012\u0004\u0012\u00020)0(H\u0002J\u0010\u0010*\u001a\u00020\u00112\u0006\u0010$\u001a\u00020\u0019H\u0002R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\u00068BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u000bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006+"}, d2 = {"Lcom/woocommerce/android/ui/products/categories/ProductCategoriesFragment;", "Lcom/woocommerce/android/ui/products/BaseProductFragment;", "Lcom/woocommerce/android/ui/products/OnLoadMoreListener;", "Lcom/woocommerce/android/ui/products/categories/OnProductCategoryClickListener;", "()V", "_binding", "Lcom/woocommerce/android/databinding/FragmentProductCategoriesListBinding;", "binding", "getBinding", "()Lcom/woocommerce/android/databinding/FragmentProductCategoriesListBinding;", "productCategoriesAdapter", "Lcom/woocommerce/android/ui/products/categories/ProductCategoriesAdapter;", "skeletonView", "Lcom/woocommerce/android/widgets/SkeletonView;", "getFragmentTitle", "", "onActivityCreated", "", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyView", "onProductCategoryClick", "productCategoryItemUiModel", "Lcom/woocommerce/android/ui/products/categories/ProductCategoryItemUiModel;", "onRequestAllowBackPress", "", "onRequestLoadMore", "onResume", "onViewCreated", "view", "Landroid/view/View;", "setupObservers", "viewModel", "Lcom/woocommerce/android/ui/products/ProductDetailViewModel;", "setupResultHandlers", "showAddCategoryButton", "show", "showLoadMoreProgress", "showProductCategories", "productCategories", "", "Lcom/woocommerce/android/model/ProductCategory;", "showSkeleton", "WooCommerce_vanillaDebug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class ProductCategoriesFragment extends com.woocommerce.android.ui.products.BaseProductFragment implements com.woocommerce.android.ui.products.OnLoadMoreListener, com.woocommerce.android.ui.products.categories.OnProductCategoryClickListener {
    private com.woocommerce.android.ui.products.categories.ProductCategoriesAdapter productCategoriesAdapter;
    private final com.woocommerce.android.widgets.SkeletonView skeletonView = null;
    private com.woocommerce.android.databinding.FragmentProductCategoriesListBinding _binding;
    
    public ProductCategoriesFragment() {
        super();
    }
    
    private final com.woocommerce.android.databinding.FragmentProductCategoriesListBinding getBinding() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getFragmentTitle() {
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
    
    @java.lang.Override()
    public void onActivityCreated(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void setupObservers(com.woocommerce.android.ui.products.ProductDetailViewModel viewModel) {
    }
    
    private final void setupResultHandlers() {
    }
    
    private final void showProductCategories(java.util.List<com.woocommerce.android.model.ProductCategory> productCategories) {
    }
    
    private final void showSkeleton(boolean show) {
    }
    
    private final void showLoadMoreProgress(boolean show) {
    }
    
    private final void showAddCategoryButton(boolean show) {
    }
    
    @java.lang.Override()
    public void onRequestLoadMore() {
    }
    
    @java.lang.Override()
    public boolean onRequestAllowBackPress() {
        return false;
    }
    
    @java.lang.Override()
    public void onProductCategoryClick(@org.jetbrains.annotations.NotNull()
    com.woocommerce.android.ui.products.categories.ProductCategoryItemUiModel productCategoryItemUiModel) {
    }
}