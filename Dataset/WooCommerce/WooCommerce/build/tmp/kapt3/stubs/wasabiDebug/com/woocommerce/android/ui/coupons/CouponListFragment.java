package com.woocommerce.android.ui.coupons;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u0000 ;2\u00020\u0001:\u0001;B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fH\u0002J\b\u0010 \u001a\u00020!H\u0016J\b\u0010\"\u001a\u00020\u001dH\u0002J\u0010\u0010#\u001a\u00020\u001d2\u0006\u0010$\u001a\u00020%H\u0002J\u0018\u0010&\u001a\u00020\u001d2\u0006\u0010\'\u001a\u00020(2\u0006\u0010)\u001a\u00020*H\u0016J$\u0010+\u001a\u00020,2\u0006\u0010)\u001a\u00020-2\b\u0010.\u001a\u0004\u0018\u00010/2\b\u00100\u001a\u0004\u0018\u000101H\u0016J\b\u00102\u001a\u00020\u001dH\u0016J\b\u00103\u001a\u00020\u001dH\u0002J\b\u00104\u001a\u00020\u001dH\u0002J\u001a\u00105\u001a\u00020\u001d2\u0006\u00106\u001a\u00020,2\b\u00100\u001a\u0004\u0018\u000101H\u0016J\u0012\u00107\u001a\u00020\u001d2\b\u00100\u001a\u0004\u0018\u000101H\u0016J\u0010\u00108\u001a\u00020\u001d2\u0006\u00109\u001a\u00020\tH\u0002J\b\u0010:\u001a\u00020\u001dH\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u00020\u00048BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\t8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\f\u001a\u00020\rX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082.\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0010\u001a\u00020\u00118\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001b\u0010\u0016\u001a\u00020\u00178BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0018\u0010\u0019\u00a8\u0006<"}, d2 = {"Lcom/woocommerce/android/ui/coupons/CouponListFragment;", "Lcom/woocommerce/android/ui/base/BaseFragment;", "()V", "_binding", "Lcom/woocommerce/android/databinding/FragmentCouponListBinding;", "binding", "getBinding", "()Lcom/woocommerce/android/databinding/FragmentCouponListBinding;", "feedbackState", "Lcom/woocommerce/android/model/FeatureFeedbackSettings$FeedbackState;", "getFeedbackState", "()Lcom/woocommerce/android/model/FeatureFeedbackSettings$FeedbackState;", "searchMenuItem", "Landroid/view/MenuItem;", "searchView", "Landroidx/appcompat/widget/SearchView;", "uiMessageResolver", "Lcom/woocommerce/android/ui/base/UIMessageResolver;", "getUiMessageResolver", "()Lcom/woocommerce/android/ui/base/UIMessageResolver;", "setUiMessageResolver", "(Lcom/woocommerce/android/ui/base/UIMessageResolver;)V", "viewModel", "Lcom/woocommerce/android/ui/coupons/CouponListViewModel;", "getViewModel", "()Lcom/woocommerce/android/ui/coupons/CouponListViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "displayCouponsWIPCard", "", "show", "", "getFragmentTitle", "", "initSearch", "navigateToCouponDetails", "couponId", "", "onCreateOptionsMenu", "menu", "Landroid/view/Menu;", "inflater", "Landroid/view/MenuInflater;", "onCreateView", "Landroid/view/View;", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyView", "onDismissWIPCardClicked", "onGiveFeedbackClicked", "onViewCreated", "view", "onViewStateRestored", "registerFeedbackSetting", "state", "setupObservers", "Companion", "WooCommerce_wasabiDebug"})
@dagger.hilt.android.AndroidEntryPoint
public final class CouponListFragment extends com.woocommerce.android.ui.base.BaseFragment {
    @org.jetbrains.annotations.NotNull
    public static final com.woocommerce.android.ui.coupons.CouponListFragment.Companion Companion = null;
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String TAG = "CouponListFragment";
    private android.view.MenuItem searchMenuItem;
    private androidx.appcompat.widget.SearchView searchView;
    private com.woocommerce.android.databinding.FragmentCouponListBinding _binding;
    private final kotlin.Lazy viewModel$delegate = null;
    @javax.inject.Inject
    public com.woocommerce.android.ui.base.UIMessageResolver uiMessageResolver;
    
    public CouponListFragment() {
        super();
    }
    
    private final com.woocommerce.android.databinding.FragmentCouponListBinding getBinding() {
        return null;
    }
    
    private final com.woocommerce.android.model.FeatureFeedbackSettings.FeedbackState getFeedbackState() {
        return null;
    }
    
    private final com.woocommerce.android.ui.coupons.CouponListViewModel getViewModel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.woocommerce.android.ui.base.UIMessageResolver getUiMessageResolver() {
        return null;
    }
    
    public final void setUiMessageResolver(@org.jetbrains.annotations.NotNull
    com.woocommerce.android.ui.base.UIMessageResolver p0) {
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
    public void onViewCreated(@org.jetbrains.annotations.NotNull
    android.view.View view, @org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    private final void setupObservers() {
    }
    
    @java.lang.Override
    public void onCreateOptionsMenu(@org.jetbrains.annotations.NotNull
    android.view.Menu menu, @org.jetbrains.annotations.NotNull
    android.view.MenuInflater inflater) {
    }
    
    @java.lang.Override
    public void onViewStateRestored(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.lang.String getFragmentTitle() {
        return null;
    }
    
    private final void initSearch() {
    }
    
    private final void navigateToCouponDetails(long couponId) {
    }
    
    private final void displayCouponsWIPCard(boolean show) {
    }
    
    private final void onGiveFeedbackClicked() {
    }
    
    private final void onDismissWIPCardClicked() {
    }
    
    private final void registerFeedbackSetting(com.woocommerce.android.model.FeatureFeedbackSettings.FeedbackState state) {
    }
    
    @java.lang.Override
    public void onDestroyView() {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/woocommerce/android/ui/coupons/CouponListFragment$Companion;", "", "()V", "TAG", "", "WooCommerce_wasabiDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}