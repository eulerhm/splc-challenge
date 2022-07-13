package com.woocommerce.android.ui.reviews;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010*\u001a\u00020\u001b2\u0006\u0010+\u001a\u00020,H\u0002J\b\u0010-\u001a\u00020\u001bH\u0002J\b\u0010.\u001a\u00020\u001bH\u0002J\b\u0010/\u001a\u000200H\u0016J\b\u00101\u001a\u00020\u001bH\u0002J\u0012\u00102\u001a\u00020\u001b2\b\u00103\u001a\u0004\u0018\u000104H\u0016J\u0012\u00105\u001a\u00020\u001b2\b\u00103\u001a\u0004\u0018\u000104H\u0016J$\u00106\u001a\u0002072\u0006\u00108\u001a\u0002092\b\u0010:\u001a\u0004\u0018\u00010;2\b\u00103\u001a\u0004\u0018\u000104H\u0016J\b\u0010<\u001a\u00020\u001bH\u0016J\b\u0010=\u001a\u00020>H\u0016J\b\u0010?\u001a\u00020\u001bH\u0016J\b\u0010@\u001a\u00020\u001bH\u0016J\u001a\u0010A\u001a\u00020\u001b2\u0006\u0010B\u001a\u0002072\b\u00103\u001a\u0004\u0018\u000104H\u0016J\u0010\u0010C\u001a\u00020\u001b2\u0006\u0010D\u001a\u00020,H\u0002J\u0010\u0010E\u001a\u00020\u001b2\u0006\u0010F\u001a\u00020GH\u0002J\u0010\u0010H\u001a\u00020\u001b2\u0006\u0010I\u001a\u00020JH\u0002J\u0010\u0010K\u001a\u00020\u001b2\u0006\u0010$\u001a\u00020%H\u0002J\u0010\u0010L\u001a\u00020\u001b2\u0006\u0010M\u001a\u00020>H\u0002R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u00058BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0013\u001a\u00020\u00148\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u0016\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001aX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u001e\u001a\u00020\u001f8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001b\u0010$\u001a\u00020%8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b&\u0010\'\u00a8\u0006N"}, d2 = {"Lcom/woocommerce/android/ui/reviews/ReviewDetailFragment;", "Lcom/woocommerce/android/ui/base/BaseFragment;", "Lcom/woocommerce/android/ui/main/MainActivity$Companion$BackPressListener;", "()V", "_binding", "Lcom/woocommerce/android/databinding/FragmentReviewDetailBinding;", "binding", "getBinding", "()Lcom/woocommerce/android/databinding/FragmentReviewDetailBinding;", "moderateListener", "Landroid/widget/CompoundButton$OnCheckedChangeListener;", "navArgs", "Lcom/woocommerce/android/ui/reviews/ReviewDetailFragmentArgs;", "getNavArgs", "()Lcom/woocommerce/android/ui/reviews/ReviewDetailFragmentArgs;", "navArgs$delegate", "Landroidx/navigation/NavArgsLazy;", "productIconSize", "", "productImageMap", "Lcom/woocommerce/android/tools/ProductImageMap;", "getProductImageMap", "()Lcom/woocommerce/android/tools/ProductImageMap;", "setProductImageMap", "(Lcom/woocommerce/android/tools/ProductImageMap;)V", "runOnStartFunc", "Lkotlin/Function0;", "", "skeletonView", "Lcom/woocommerce/android/widgets/SkeletonView;", "uiMessageResolver", "Lcom/woocommerce/android/ui/base/UIMessageResolver;", "getUiMessageResolver", "()Lcom/woocommerce/android/ui/base/UIMessageResolver;", "setUiMessageResolver", "(Lcom/woocommerce/android/ui/base/UIMessageResolver;)V", "viewModel", "Lcom/woocommerce/android/ui/reviews/ReviewDetailViewModel;", "getViewModel", "()Lcom/woocommerce/android/ui/reviews/ReviewDetailViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "configureModerationButtons", "status", "Lcom/woocommerce/android/ui/reviews/ProductReviewStatus;", "exitDetailView", "exitReviewDetailOpenedFromNotification", "getFragmentTitle", "", "initializeViewModel", "onActivityCreated", "savedInstanceState", "Landroid/os/Bundle;", "onCreate", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onDestroyView", "onRequestAllowBackPress", "", "onResume", "onStart", "onViewCreated", "view", "processReviewModeration", "newStatus", "refreshProductImage", "remoteProductId", "", "setReview", "review", "Lcom/woocommerce/android/model/ProductReview;", "setupObservers", "showSkeleton", "show", "WooCommerce_wasabiDebug"})
@dagger.hilt.android.AndroidEntryPoint
public final class ReviewDetailFragment extends com.woocommerce.android.ui.base.BaseFragment implements com.woocommerce.android.ui.main.MainActivity.Companion.BackPressListener {
    @javax.inject.Inject
    public com.woocommerce.android.ui.base.UIMessageResolver uiMessageResolver;
    @javax.inject.Inject
    public com.woocommerce.android.tools.ProductImageMap productImageMap;
    private final kotlin.Lazy viewModel$delegate = null;
    private kotlin.jvm.functions.Function0<kotlin.Unit> runOnStartFunc;
    private int productIconSize = 0;
    private final com.woocommerce.android.widgets.SkeletonView skeletonView = null;
    private com.woocommerce.android.databinding.FragmentReviewDetailBinding _binding;
    private final androidx.navigation.NavArgsLazy navArgs$delegate = null;
    private final android.widget.CompoundButton.OnCheckedChangeListener moderateListener = null;
    
    public ReviewDetailFragment() {
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
    public final com.woocommerce.android.tools.ProductImageMap getProductImageMap() {
        return null;
    }
    
    public final void setProductImageMap(@org.jetbrains.annotations.NotNull
    com.woocommerce.android.tools.ProductImageMap p0) {
    }
    
    private final com.woocommerce.android.ui.reviews.ReviewDetailViewModel getViewModel() {
        return null;
    }
    
    private final com.woocommerce.android.databinding.FragmentReviewDetailBinding getBinding() {
        return null;
    }
    
    private final com.woocommerce.android.ui.reviews.ReviewDetailFragmentArgs getNavArgs() {
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
    public void onActivityCreated(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override
    public void onViewCreated(@org.jetbrains.annotations.NotNull
    android.view.View view, @org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override
    public void onCreate(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override
    public void onStart() {
    }
    
    @java.lang.Override
    public void onResume() {
    }
    
    @java.lang.Override
    public void onDestroyView() {
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.lang.String getFragmentTitle() {
        return null;
    }
    
    private final void initializeViewModel() {
    }
    
    private final void setupObservers(com.woocommerce.android.ui.reviews.ReviewDetailViewModel viewModel) {
    }
    
    private final void exitReviewDetailOpenedFromNotification() {
    }
    
    private final void setReview(com.woocommerce.android.model.ProductReview review) {
    }
    
    private final void refreshProductImage(long remoteProductId) {
    }
    
    private final void showSkeleton(boolean show) {
    }
    
    private final void exitDetailView() {
    }
    
    private final void configureModerationButtons(com.woocommerce.android.ui.reviews.ProductReviewStatus status) {
    }
    
    private final void processReviewModeration(com.woocommerce.android.ui.reviews.ProductReviewStatus newStatus) {
    }
    
    @java.lang.Override
    public boolean onRequestAllowBackPress() {
        return false;
    }
}