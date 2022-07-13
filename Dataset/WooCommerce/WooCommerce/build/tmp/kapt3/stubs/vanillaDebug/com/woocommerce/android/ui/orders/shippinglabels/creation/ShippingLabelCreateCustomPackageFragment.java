package com.woocommerce.android.ui.orders.shippinglabels.creation;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u001b\u001a\u00020\u001cH\u0002J\b\u0010\u001d\u001a\u00020\u001cH\u0002J\u0012\u0010\u001e\u001a\u00020\u001c2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0016J\u0018\u0010!\u001a\u00020\u001c2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%H\u0016J\u0010\u0010&\u001a\u00020\'2\u0006\u0010(\u001a\u00020)H\u0016J\u001a\u0010*\u001a\u00020\u001c2\u0006\u0010+\u001a\u00020,2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0016J\b\u0010-\u001a\u00020\u001cH\u0002J\u001c\u0010.\u001a\u00020\u001c2\b\b\u0001\u0010/\u001a\u0002002\b\b\u0001\u00101\u001a\u000200H\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u00020\u00048BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\b\u001a\u00020\t8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0010\u001a\u00020\u00118\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001b\u0010\u0016\u001a\u00020\u00178BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001a\u0010\r\u001a\u0004\b\u0018\u0010\u0019\u00a8\u00062"}, d2 = {"Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelCreateCustomPackageFragment;", "Lcom/woocommerce/android/ui/base/BaseFragment;", "()V", "_binding", "Lcom/woocommerce/android/databinding/FragmentShippingLabelCreateCustomPackageBinding;", "binding", "getBinding", "()Lcom/woocommerce/android/databinding/FragmentShippingLabelCreateCustomPackageBinding;", "parentViewModel", "Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelCreatePackageViewModel;", "getParentViewModel", "()Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelCreatePackageViewModel;", "parentViewModel$delegate", "Lkotlin/Lazy;", "progressDialog", "Lcom/woocommerce/android/widgets/CustomProgressDialog;", "uiMessageResolver", "Lcom/woocommerce/android/ui/base/UIMessageResolver;", "getUiMessageResolver", "()Lcom/woocommerce/android/ui/base/UIMessageResolver;", "setUiMessageResolver", "(Lcom/woocommerce/android/ui/base/UIMessageResolver;)V", "viewModel", "Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelCreateCustomPackageViewModel;", "getViewModel", "()Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelCreateCustomPackageViewModel;", "viewModel$delegate", "hideProgressDialog", "", "initializeInputFields", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateOptionsMenu", "menu", "Landroid/view/Menu;", "inflater", "Landroid/view/MenuInflater;", "onOptionsItemSelected", "", "item", "Landroid/view/MenuItem;", "onViewCreated", "view", "Landroid/view/View;", "setupObservers", "showProgressDialog", "title", "", "message", "WooCommerce_vanillaDebug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class ShippingLabelCreateCustomPackageFragment extends com.woocommerce.android.ui.base.BaseFragment {
    @javax.inject.Inject()
    public com.woocommerce.android.ui.base.UIMessageResolver uiMessageResolver;
    private com.woocommerce.android.widgets.CustomProgressDialog progressDialog;
    private com.woocommerce.android.databinding.FragmentShippingLabelCreateCustomPackageBinding _binding;
    private final kotlin.Lazy parentViewModel$delegate = null;
    private final kotlin.Lazy viewModel$delegate = null;
    
    public ShippingLabelCreateCustomPackageFragment() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.woocommerce.android.ui.base.UIMessageResolver getUiMessageResolver() {
        return null;
    }
    
    public final void setUiMessageResolver(@org.jetbrains.annotations.NotNull()
    com.woocommerce.android.ui.base.UIMessageResolver p0) {
    }
    
    private final com.woocommerce.android.databinding.FragmentShippingLabelCreateCustomPackageBinding getBinding() {
        return null;
    }
    
    private final com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelCreatePackageViewModel getParentViewModel() {
        return null;
    }
    
    private final com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelCreateCustomPackageViewModel getViewModel() {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
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
    
    private final void initializeInputFields() {
    }
    
    private final void setupObservers() {
    }
    
    private final void showProgressDialog(@androidx.annotation.StringRes()
    int title, @androidx.annotation.StringRes()
    int message) {
    }
    
    private final void hideProgressDialog() {
    }
    
    @java.lang.Override()
    public boolean onOptionsItemSelected(@org.jetbrains.annotations.NotNull()
    android.view.MenuItem item) {
        return false;
    }
}