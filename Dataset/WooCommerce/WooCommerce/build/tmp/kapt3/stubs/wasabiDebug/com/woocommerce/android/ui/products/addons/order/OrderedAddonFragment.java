package com.woocommerce.android.ui.products.addons.order;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u001f\u001a\u00020 H\u0016J\u0010\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$H\u0002J\u001c\u0010%\u001a\u00020\"2\b\u0010&\u001a\u0004\u0018\u00010\'2\b\u0010(\u001a\u0004\u0018\u00010\'H\u0002J\b\u0010)\u001a\u00020\"H\u0002J\b\u0010*\u001a\u00020\"H\u0002J\u0016\u0010+\u001a\u00020\"2\f\u0010,\u001a\b\u0012\u0004\u0012\u00020.0-H\u0002J\b\u0010/\u001a\u00020\"H\u0016J\u001a\u00100\u001a\u00020\"2\u0006\u00101\u001a\u0002022\b\u00103\u001a\u0004\u0018\u000104H\u0016J\u0016\u00105\u001a\u00020\"2\f\u00106\u001a\b\u0012\u0004\u0012\u00020.0-H\u0002J\b\u00107\u001a\u00020\"H\u0002J\b\u00108\u001a\u00020\"H\u0002J\u0010\u00109\u001a\u00020\"2\u0006\u0010:\u001a\u00020\u000fH\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u00020\u00048BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u001e\u0010\b\u001a\u00020\t8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001e\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u000f@BX\u0082\u000e\u00a2\u0006\b\n\u0000\"\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0015\u001a\u0004\u0018\u00010\u00168BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u001b\u0010\u0019\u001a\u00020\u001a8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001b\u0010\u001c\u00a8\u0006;"}, d2 = {"Lcom/woocommerce/android/ui/products/addons/order/OrderedAddonFragment;", "Lcom/woocommerce/android/ui/base/BaseFragment;", "()V", "_binding", "Lcom/woocommerce/android/databinding/FragmentOrderedAddonBinding;", "binding", "getBinding", "()Lcom/woocommerce/android/databinding/FragmentOrderedAddonBinding;", "currencyFormatter", "Lcom/woocommerce/android/util/CurrencyFormatter;", "getCurrencyFormatter", "()Lcom/woocommerce/android/util/CurrencyFormatter;", "setCurrencyFormatter", "(Lcom/woocommerce/android/util/CurrencyFormatter;)V", "show", "", "isLoadingSkeletonVisible", "setLoadingSkeletonVisible", "(Z)V", "skeletonView", "Lcom/woocommerce/android/widgets/SkeletonView;", "supportActionBar", "Landroidx/appcompat/app/ActionBar;", "getSupportActionBar", "()Landroidx/appcompat/app/ActionBar;", "viewModel", "Lcom/woocommerce/android/ui/products/addons/order/OrderedAddonViewModel;", "getViewModel", "()Lcom/woocommerce/android/ui/products/addons/order/OrderedAddonViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "getFragmentTitle", "", "handleViewModelEvents", "", "event", "Lcom/woocommerce/android/viewmodel/MultiLiveEvent$Event;", "handleViewStateChanges", "old", "Lcom/woocommerce/android/ui/products/addons/order/OrderedAddonViewModel$ViewState;", "new", "loadViewData", "onOrderedAddonsFailed", "onOrderedAddonsReceived", "orderedAddons", "", "Lorg/wordpress/android/fluxc/domain/Addon;", "onResume", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "setupRecyclerViewWith", "addonList", "setupViewModel", "setupViews", "showWIPNoticeCard", "shouldBeVisible", "WooCommerce_wasabiDebug"})
@dagger.hilt.android.AndroidEntryPoint
public final class OrderedAddonFragment extends com.woocommerce.android.ui.base.BaseFragment {
    @javax.inject.Inject
    public com.woocommerce.android.util.CurrencyFormatter currencyFormatter;
    private final kotlin.Lazy viewModel$delegate = null;
    private com.woocommerce.android.databinding.FragmentOrderedAddonBinding _binding;
    private final com.woocommerce.android.widgets.SkeletonView skeletonView = null;
    private boolean isLoadingSkeletonVisible = false;
    
    public OrderedAddonFragment() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.woocommerce.android.util.CurrencyFormatter getCurrencyFormatter() {
        return null;
    }
    
    public final void setCurrencyFormatter(@org.jetbrains.annotations.NotNull
    com.woocommerce.android.util.CurrencyFormatter p0) {
    }
    
    private final com.woocommerce.android.ui.products.addons.order.OrderedAddonViewModel getViewModel() {
        return null;
    }
    
    private final com.woocommerce.android.databinding.FragmentOrderedAddonBinding getBinding() {
        return null;
    }
    
    private final void setLoadingSkeletonVisible(boolean show) {
    }
    
    private final androidx.appcompat.app.ActionBar getSupportActionBar() {
        return null;
    }
    
    @java.lang.Override
    public void onViewCreated(@org.jetbrains.annotations.NotNull
    android.view.View view, @org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override
    public void onResume() {
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.lang.String getFragmentTitle() {
        return null;
    }
    
    private final void loadViewData() {
    }
    
    private final void setupViewModel() {
    }
    
    private final void handleViewStateChanges(com.woocommerce.android.ui.products.addons.order.OrderedAddonViewModel.ViewState old, com.woocommerce.android.ui.products.addons.order.OrderedAddonViewModel.ViewState p1_54480) {
    }
    
    private final void handleViewModelEvents(com.woocommerce.android.viewmodel.MultiLiveEvent.Event event) {
    }
    
    private final void setupViews() {
    }
    
    private final void setupRecyclerViewWith(java.util.List<? extends org.wordpress.android.fluxc.domain.Addon> addonList) {
    }
    
    private final void onOrderedAddonsReceived(java.util.List<? extends org.wordpress.android.fluxc.domain.Addon> orderedAddons) {
    }
    
    private final void onOrderedAddonsFailed() {
    }
    
    private final void showWIPNoticeCard(boolean shouldBeVisible) {
    }
}