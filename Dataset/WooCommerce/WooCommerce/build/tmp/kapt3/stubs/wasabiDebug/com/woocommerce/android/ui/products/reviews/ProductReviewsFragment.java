package com.woocommerce.android.ui.products.reviews;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\u0003\b\u0007\u0018\u0000 62\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u00016B\u0005\u00a2\u0006\u0002\u0010\u0005J\b\u0010\u001e\u001a\u00020\u001fH\u0016J\b\u0010 \u001a\u00020!H\u0016J\b\u0010\"\u001a\u00020#H\u0016J\u001a\u0010$\u001a\u00020!2\u0006\u0010%\u001a\u00020&2\b\u0010\'\u001a\u0004\u0018\u00010(H\u0016J\u001a\u0010)\u001a\u00020!2\u0006\u0010*\u001a\u00020(2\b\u0010+\u001a\u0004\u0018\u00010,H\u0016J\b\u0010-\u001a\u00020!H\u0002J\b\u0010.\u001a\u00020!H\u0002J\u0010\u0010/\u001a\u00020!2\u0006\u00100\u001a\u00020#H\u0002J\u0010\u00101\u001a\u00020!2\u0006\u00100\u001a\u00020#H\u0002J\u0016\u00102\u001a\u00020!2\f\u00103\u001a\b\u0012\u0004\u0012\u00020&04H\u0002J\u0010\u00105\u001a\u00020!2\u0006\u00100\u001a\u00020#H\u0002R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u00020\u00078BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\t8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0012\u001a\u00020\u00138\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001b\u0010\u0018\u001a\u00020\u00198FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001a\u0010\u001b\u00a8\u00067"}, d2 = {"Lcom/woocommerce/android/ui/products/reviews/ProductReviewsFragment;", "Lcom/woocommerce/android/ui/base/BaseFragment;", "Lcom/woocommerce/android/ui/reviews/ReviewListAdapter$OnReviewClickListener;", "Lcom/woocommerce/android/ui/reviews/ReviewModerationUi;", "Lcom/woocommerce/android/ui/main/MainActivity$Companion$BackPressListener;", "()V", "_binding", "Lcom/woocommerce/android/databinding/FragmentReviewsListBinding;", "_reviewsAdapter", "Lcom/woocommerce/android/ui/reviews/ReviewListAdapter;", "binding", "getBinding", "()Lcom/woocommerce/android/databinding/FragmentReviewsListBinding;", "reviewsAdapter", "getReviewsAdapter", "()Lcom/woocommerce/android/ui/reviews/ReviewListAdapter;", "skeletonView", "Lcom/woocommerce/android/widgets/SkeletonView;", "uiMessageResolver", "Lcom/woocommerce/android/ui/base/UIMessageResolver;", "getUiMessageResolver", "()Lcom/woocommerce/android/ui/base/UIMessageResolver;", "setUiMessageResolver", "(Lcom/woocommerce/android/ui/base/UIMessageResolver;)V", "viewModel", "Lcom/woocommerce/android/ui/products/reviews/ProductReviewsViewModel;", "getViewModel", "()Lcom/woocommerce/android/ui/products/reviews/ProductReviewsViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "getFragmentTitle", "", "onDestroyView", "", "onRequestAllowBackPress", "", "onReviewClick", "review", "Lcom/woocommerce/android/model/ProductReview;", "sharedView", "Landroid/view/View;", "onViewCreated", "view", "savedInstanceState", "Landroid/os/Bundle;", "setupObservers", "setupViews", "showEmptyView", "show", "showLoadMoreProgress", "showReviewList", "reviews", "", "showSkeleton", "Companion", "WooCommerce_wasabiDebug"})
@dagger.hilt.android.AndroidEntryPoint
public final class ProductReviewsFragment extends com.woocommerce.android.ui.base.BaseFragment implements com.woocommerce.android.ui.reviews.ReviewListAdapter.OnReviewClickListener, com.woocommerce.android.ui.reviews.ReviewModerationUi, com.woocommerce.android.ui.main.MainActivity.Companion.BackPressListener {
    @org.jetbrains.annotations.NotNull
    public static final com.woocommerce.android.ui.products.reviews.ProductReviewsFragment.Companion Companion = null;
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String PRODUCT_REVIEWS_MODIFIED = "product-reviews-modified";
    @javax.inject.Inject
    public com.woocommerce.android.ui.base.UIMessageResolver uiMessageResolver;
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy viewModel$delegate = null;
    private com.woocommerce.android.ui.reviews.ReviewListAdapter _reviewsAdapter;
    private final com.woocommerce.android.widgets.SkeletonView skeletonView = null;
    private com.woocommerce.android.databinding.FragmentReviewsListBinding _binding;
    
    public ProductReviewsFragment() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.woocommerce.android.ui.base.UIMessageResolver getUiMessageResolver() {
        return null;
    }
    
    public final void setUiMessageResolver(@org.jetbrains.annotations.NotNull
    com.woocommerce.android.ui.base.UIMessageResolver p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.woocommerce.android.ui.products.reviews.ProductReviewsViewModel getViewModel() {
        return null;
    }
    
    private final com.woocommerce.android.ui.reviews.ReviewListAdapter getReviewsAdapter() {
        return null;
    }
    
    private final com.woocommerce.android.databinding.FragmentReviewsListBinding getBinding() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.lang.String getFragmentTitle() {
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
    
    private final void setupViews() {
    }
    
    private final void setupObservers() {
    }
    
    private final void showReviewList(java.util.List<com.woocommerce.android.model.ProductReview> reviews) {
    }
    
    private final void showLoadMoreProgress(boolean show) {
    }
    
    private final void showSkeleton(boolean show) {
    }
    
    private final void showEmptyView(boolean show) {
    }
    
    @java.lang.Override
    public void onReviewClick(@org.jetbrains.annotations.NotNull
    com.woocommerce.android.model.ProductReview review, @org.jetbrains.annotations.Nullable
    android.view.View sharedView) {
    }
    
    @java.lang.Override
    public boolean onRequestAllowBackPress() {
        return false;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/woocommerce/android/ui/products/reviews/ProductReviewsFragment$Companion;", "", "()V", "PRODUCT_REVIEWS_MODIFIED", "", "WooCommerce_wasabiDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}