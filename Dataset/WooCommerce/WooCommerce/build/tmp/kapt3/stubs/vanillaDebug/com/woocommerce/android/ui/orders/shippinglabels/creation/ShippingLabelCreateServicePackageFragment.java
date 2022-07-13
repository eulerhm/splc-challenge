package com.woocommerce.android.ui.orders.shippinglabels.creation;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u001a\u001a\u00020\u001bH\u0002J\u0012\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0016J\u0018\u0010\u001f\u001a\u00020\u001b2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#H\u0016J\u0010\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u0004H\u0016J\u001a\u0010\'\u001a\u00020\u001b2\u0006\u0010(\u001a\u00020)2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0016J\u0018\u0010*\u001a\u00020\u001b2\u0006\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020.H\u0002J\u001c\u0010/\u001a\u00020\u001b2\b\b\u0001\u00100\u001a\u0002012\b\b\u0001\u00102\u001a\u000201H\u0002J\u0018\u00103\u001a\u00020\u001b2\u0006\u00104\u001a\u00020%2\u0006\u0010+\u001a\u00020,H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u000f\u001a\u00020\u00108\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001b\u0010\u0015\u001a\u00020\u00168FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0019\u0010\n\u001a\u0004\b\u0017\u0010\u0018\u00a8\u00065"}, d2 = {"Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelCreateServicePackageFragment;", "Lcom/woocommerce/android/ui/base/BaseFragment;", "()V", "doneMenuItem", "Landroid/view/MenuItem;", "parentViewModel", "Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelCreatePackageViewModel;", "getParentViewModel", "()Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelCreatePackageViewModel;", "parentViewModel$delegate", "Lkotlin/Lazy;", "progressDialog", "Lcom/woocommerce/android/widgets/CustomProgressDialog;", "skeletonView", "Lcom/woocommerce/android/widgets/SkeletonView;", "uiMessageResolver", "Lcom/woocommerce/android/ui/base/UIMessageResolver;", "getUiMessageResolver", "()Lcom/woocommerce/android/ui/base/UIMessageResolver;", "setUiMessageResolver", "(Lcom/woocommerce/android/ui/base/UIMessageResolver;)V", "viewModel", "Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelCreateServicePackageViewModel;", "getViewModel", "()Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelCreateServicePackageViewModel;", "viewModel$delegate", "hideProgressDialog", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateOptionsMenu", "menu", "Landroid/view/Menu;", "inflater", "Landroid/view/MenuInflater;", "onOptionsItemSelected", "", "item", "onViewCreated", "view", "Landroid/view/View;", "setupObservers", "binding", "Lcom/woocommerce/android/databinding/FragmentShippingLabelCreateServicePackageBinding;", "adapter", "Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelServicePackageAdapter;", "showProgressDialog", "title", "", "message", "showSkeleton", "show", "WooCommerce_vanillaDebug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class ShippingLabelCreateServicePackageFragment extends com.woocommerce.android.ui.base.BaseFragment {
    @javax.inject.Inject()
    public com.woocommerce.android.ui.base.UIMessageResolver uiMessageResolver;
    private final com.woocommerce.android.widgets.SkeletonView skeletonView = null;
    private com.woocommerce.android.widgets.CustomProgressDialog progressDialog;
    private android.view.MenuItem doneMenuItem;
    private final kotlin.Lazy parentViewModel$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy viewModel$delegate = null;
    
    public ShippingLabelCreateServicePackageFragment() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.woocommerce.android.ui.base.UIMessageResolver getUiMessageResolver() {
        return null;
    }
    
    public final void setUiMessageResolver(@org.jetbrains.annotations.NotNull()
    com.woocommerce.android.ui.base.UIMessageResolver p0) {
    }
    
    private final com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelCreatePackageViewModel getParentViewModel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelCreateServicePackageViewModel getViewModel() {
        return null;
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onCreateOptionsMenu(@org.jetbrains.annotations.NotNull()
    android.view.Menu menu, @org.jetbrains.annotations.NotNull()
    android.view.MenuInflater inflater) {
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void setupObservers(com.woocommerce.android.databinding.FragmentShippingLabelCreateServicePackageBinding binding, com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelServicePackageAdapter adapter) {
    }
    
    @java.lang.Override()
    public boolean onOptionsItemSelected(@org.jetbrains.annotations.NotNull()
    android.view.MenuItem item) {
        return false;
    }
    
    private final void showSkeleton(boolean show, com.woocommerce.android.databinding.FragmentShippingLabelCreateServicePackageBinding binding) {
    }
    
    private final void showProgressDialog(@androidx.annotation.StringRes()
    int title, @androidx.annotation.StringRes()
    int message) {
    }
    
    private final void hideProgressDialog() {
    }
}