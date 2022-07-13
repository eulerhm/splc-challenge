package com.woocommerce.android.ui.products.tags;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J\u001e\u0010\u0012\u001a\u00020\u00132\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\u0006\u0010\u0017\u001a\u00020\u0003H\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u0013H\u0002J\u0012\u0010\u001b\u001a\u00020\u00132\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016J\b\u0010\u001e\u001a\u00020\u0013H\u0016J\u0010\u0010\u001f\u001a\u00020\u00132\u0006\u0010 \u001a\u00020\u0016H\u0016J\u0010\u0010!\u001a\u00020\u00132\u0006\u0010 \u001a\u00020\u0016H\u0016J\b\u0010\"\u001a\u00020#H\u0016J\b\u0010$\u001a\u00020\u0013H\u0016J\b\u0010%\u001a\u00020\u0013H\u0016J\u001a\u0010&\u001a\u00020\u00132\u0006\u0010\'\u001a\u00020(2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016J\u0010\u0010)\u001a\u00020\u00132\u0006\u0010*\u001a\u00020\u0019H\u0002J\u0010\u0010+\u001a\u00020\u00132\u0006\u0010,\u001a\u00020-H\u0002J\u0010\u0010.\u001a\u00020\u00132\u0006\u0010/\u001a\u00020#H\u0002J\u0016\u00100\u001a\u00020\u00132\f\u00101\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015H\u0002J\u0010\u00102\u001a\u00020\u00132\u0006\u0010/\u001a\u00020#H\u0002J\u0010\u00103\u001a\u00020\u00132\u0006\u0010/\u001a\u00020#H\u0002J\b\u00104\u001a\u00020\u0013H\u0002R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\u00068BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u000bX\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u00065"}, d2 = {"Lcom/woocommerce/android/ui/products/tags/ProductTagsFragment;", "Lcom/woocommerce/android/ui/products/BaseProductFragment;", "Lcom/woocommerce/android/ui/products/OnLoadMoreListener;", "Lcom/woocommerce/android/ui/products/tags/ProductTagsAdapter$OnProductTagClickListener;", "()V", "_binding", "Lcom/woocommerce/android/databinding/FragmentProductTagsBinding;", "binding", "getBinding", "()Lcom/woocommerce/android/databinding/FragmentProductTagsBinding;", "productTagsAdapter", "Lcom/woocommerce/android/ui/products/tags/ProductTagsAdapter;", "progressDialog", "Lcom/woocommerce/android/widgets/CustomProgressDialog;", "searchHandler", "Landroid/os/Handler;", "skeletonView", "Lcom/woocommerce/android/widgets/SkeletonView;", "addTags", "", "tags", "", "Lcom/woocommerce/android/model/ProductTag;", "listener", "getFragmentTitle", "", "hideProgressDialog", "onActivityCreated", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyView", "onProductTagAdded", "productTag", "onProductTagRemoved", "onRequestAllowBackPress", "", "onRequestLoadMore", "onResume", "onViewCreated", "view", "Landroid/view/View;", "setProductTagsFilterDelayed", "filter", "setupObservers", "viewModel", "Lcom/woocommerce/android/ui/products/ProductDetailViewModel;", "showLoadMoreProgress", "show", "showProductTags", "productTags", "showProgressDialog", "showSkeleton", "updateSelectedTags", "WooCommerce_wasabiDebug"})
@dagger.hilt.android.AndroidEntryPoint
public final class ProductTagsFragment extends com.woocommerce.android.ui.products.BaseProductFragment implements com.woocommerce.android.ui.products.OnLoadMoreListener, com.woocommerce.android.ui.products.tags.ProductTagsAdapter.OnProductTagClickListener {
    private com.woocommerce.android.ui.products.tags.ProductTagsAdapter productTagsAdapter;
    private final com.woocommerce.android.widgets.SkeletonView skeletonView = null;
    private com.woocommerce.android.widgets.CustomProgressDialog progressDialog;
    private final android.os.Handler searchHandler = null;
    private com.woocommerce.android.databinding.FragmentProductTagsBinding _binding;
    
    public ProductTagsFragment() {
        super();
    }
    
    private final com.woocommerce.android.databinding.FragmentProductTagsBinding getBinding() {
        return null;
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
    
    @java.lang.Override
    public void onResume() {
    }
    
    @java.lang.Override
    public void onActivityCreated(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    /**
     * Submit the search after a brief delay unless the query has changed - this is used to
     * perform a search while the user is typing
     */
    private final void setProductTagsFilterDelayed(java.lang.String filter) {
    }
    
    private final void setupObservers(com.woocommerce.android.ui.products.ProductDetailViewModel viewModel) {
    }
    
    private final void showProductTags(java.util.List<com.woocommerce.android.model.ProductTag> productTags) {
    }
    
    private final void updateSelectedTags() {
    }
    
    private final void addTags(java.util.List<com.woocommerce.android.model.ProductTag> tags, com.woocommerce.android.ui.products.tags.ProductTagsAdapter.OnProductTagClickListener listener) {
    }
    
    private final void showSkeleton(boolean show) {
    }
    
    private final void showProgressDialog(boolean show) {
    }
    
    private final void hideProgressDialog() {
    }
    
    private final void showLoadMoreProgress(boolean show) {
    }
    
    @java.lang.Override
    public void onRequestLoadMore() {
    }
    
    @java.lang.Override
    public boolean onRequestAllowBackPress() {
        return false;
    }
    
    @java.lang.Override
    public void onProductTagAdded(@org.jetbrains.annotations.NotNull
    com.woocommerce.android.model.ProductTag productTag) {
    }
    
    @java.lang.Override
    public void onProductTagRemoved(@org.jetbrains.annotations.NotNull
    com.woocommerce.android.model.ProductTag productTag) {
    }
}