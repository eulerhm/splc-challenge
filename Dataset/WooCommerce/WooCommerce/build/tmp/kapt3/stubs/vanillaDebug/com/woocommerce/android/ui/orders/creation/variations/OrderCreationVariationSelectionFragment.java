package com.woocommerce.android.ui.orders.creation.variations;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0015\u001a\u00020\u0004H\u0016J\u001a\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J\u0010\u0010\u001c\u001a\u00020\u00172\u0006\u0010\u001d\u001a\u00020\u001eH\u0002J$\u0010\u001f\u001a\u00020\u0017*\u00020\u001e2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\"0!2\b\u0010#\u001a\u0004\u0018\u00010$H\u0002J\u0014\u0010%\u001a\u00020\u0017*\u00020\u001e2\u0006\u0010&\u001a\u00020\'H\u0002R\u001e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0004@BX\u0082\u000e\u00a2\u0006\b\n\u0000\"\u0004\b\u0006\u0010\u0007R\u001b\u0010\b\u001a\u00020\t8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0010\u001a\u00020\u00118BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0014\u0010\r\u001a\u0004\b\u0012\u0010\u0013\u00a8\u0006("}, d2 = {"Lcom/woocommerce/android/ui/orders/creation/variations/OrderCreationVariationSelectionFragment;", "Lcom/woocommerce/android/ui/base/BaseFragment;", "()V", "value", "", "screenTitle", "setScreenTitle", "(Ljava/lang/String;)V", "sharedViewModel", "Lcom/woocommerce/android/ui/orders/creation/OrderCreationViewModel;", "getSharedViewModel", "()Lcom/woocommerce/android/ui/orders/creation/OrderCreationViewModel;", "sharedViewModel$delegate", "Lkotlin/Lazy;", "skeletonView", "Lcom/woocommerce/android/widgets/SkeletonView;", "viewModel", "Lcom/woocommerce/android/ui/orders/creation/variations/OrderCreationVariationSelectionViewModel;", "getViewModel", "()Lcom/woocommerce/android/ui/orders/creation/variations/OrderCreationVariationSelectionViewModel;", "viewModel$delegate", "getFragmentTitle", "onViewCreated", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "setupObservers", "binding", "Lcom/woocommerce/android/databinding/FragmentOrderCreationProductSelectionBinding;", "bindVariationsList", "variationsList", "", "Lcom/woocommerce/android/model/ProductVariation;", "parentProduct", "Lcom/woocommerce/android/model/Product;", "showSkeleton", "show", "", "WooCommerce_vanillaDebug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class OrderCreationVariationSelectionFragment extends com.woocommerce.android.ui.base.BaseFragment {
    private final kotlin.Lazy sharedViewModel$delegate = null;
    private final kotlin.Lazy viewModel$delegate = null;
    private final com.woocommerce.android.widgets.SkeletonView skeletonView = null;
    private java.lang.String screenTitle = "";
    
    public OrderCreationVariationSelectionFragment() {
        super();
    }
    
    private final com.woocommerce.android.ui.orders.creation.OrderCreationViewModel getSharedViewModel() {
        return null;
    }
    
    private final com.woocommerce.android.ui.orders.creation.variations.OrderCreationVariationSelectionViewModel getViewModel() {
        return null;
    }
    
    private final void setScreenTitle(java.lang.String value) {
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void setupObservers(com.woocommerce.android.databinding.FragmentOrderCreationProductSelectionBinding binding) {
    }
    
    private final void bindVariationsList(com.woocommerce.android.databinding.FragmentOrderCreationProductSelectionBinding $this$bindVariationsList, java.util.List<com.woocommerce.android.model.ProductVariation> variationsList, com.woocommerce.android.model.Product parentProduct) {
    }
    
    private final void showSkeleton(com.woocommerce.android.databinding.FragmentOrderCreationProductSelectionBinding $this$showSkeleton, boolean show) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getFragmentTitle() {
        return null;
    }
}