package com.woocommerce.android.ui.products.variations;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u001c\u001a\u00020\u001dH\u0002J\b\u0010\u001e\u001a\u00020\u001dH\u0002J\b\u0010\u001f\u001a\u00020\u001dH\u0002J\u0018\u0010 \u001a\u00020\u001d2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$H\u0016J\u0010\u0010%\u001a\u00020&2\u0006\u0010\'\u001a\u00020(H\u0016J\b\u0010)\u001a\u00020\u001dH\u0016J\u001a\u0010*\u001a\u00020\u001d2\u0006\u0010+\u001a\u00020,2\b\u0010-\u001a\u0004\u0018\u00010.H\u0016J\u0018\u0010/\u001a\u00020\u001d2\u0006\u00100\u001a\u0002012\u0006\u00102\u001a\u000203H\u0002J\u001a\u00104\u001a\u00020\u001d2\u0006\u00105\u001a\u00020&2\b\b\u0001\u00106\u001a\u000207H\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u00020\u00048BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u001e\u0010\b\u001a\u00020\t8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0010\u001a\u00020\u00118\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001b\u0010\u0016\u001a\u00020\u00178BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0018\u0010\u0019\u00a8\u00068"}, d2 = {"Lcom/woocommerce/android/ui/products/variations/VariationsBulkUpdatePriceFragment;", "Lcom/woocommerce/android/ui/base/BaseFragment;", "()V", "_binding", "Lcom/woocommerce/android/databinding/FragmentVariationsBulkUpdatePriceBinding;", "binding", "getBinding", "()Lcom/woocommerce/android/databinding/FragmentVariationsBulkUpdatePriceBinding;", "currencyFormatter", "Lcom/woocommerce/android/util/CurrencyFormatter;", "getCurrencyFormatter", "()Lcom/woocommerce/android/util/CurrencyFormatter;", "setCurrencyFormatter", "(Lcom/woocommerce/android/util/CurrencyFormatter;)V", "progressDialog", "Lcom/woocommerce/android/widgets/CustomProgressDialog;", "uiMessageResolver", "Lcom/woocommerce/android/ui/base/UIMessageResolver;", "getUiMessageResolver", "()Lcom/woocommerce/android/ui/base/UIMessageResolver;", "setUiMessageResolver", "(Lcom/woocommerce/android/ui/base/UIMessageResolver;)V", "viewModel", "Lcom/woocommerce/android/ui/products/variations/VariationsBulkUpdatePriceViewModel;", "getViewModel", "()Lcom/woocommerce/android/ui/products/variations/VariationsBulkUpdatePriceViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "hideProgressDialog", "", "observeEvents", "observeViewStateChanges", "onCreateOptionsMenu", "menu", "Landroid/view/Menu;", "inflater", "Landroid/view/MenuInflater;", "onOptionsItemSelected", "", "item", "Landroid/view/MenuItem;", "onPause", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "updateCurrentPricesLabel", "pricesGroupType", "Lcom/woocommerce/android/ui/products/variations/ValuesGroupType;", "viewState", "Lcom/woocommerce/android/ui/products/variations/VariationsBulkUpdatePriceViewModel$ViewState;", "updateProgressbarDialogVisibility", "visible", "title", "", "WooCommerce_vanillaDebug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class VariationsBulkUpdatePriceFragment extends com.woocommerce.android.ui.base.BaseFragment {
    @javax.inject.Inject()
    public com.woocommerce.android.ui.base.UIMessageResolver uiMessageResolver;
    @javax.inject.Inject()
    public com.woocommerce.android.util.CurrencyFormatter currencyFormatter;
    private final kotlin.Lazy viewModel$delegate = null;
    private com.woocommerce.android.databinding.FragmentVariationsBulkUpdatePriceBinding _binding;
    private com.woocommerce.android.widgets.CustomProgressDialog progressDialog;
    
    public VariationsBulkUpdatePriceFragment() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.woocommerce.android.ui.base.UIMessageResolver getUiMessageResolver() {
        return null;
    }
    
    public final void setUiMessageResolver(@org.jetbrains.annotations.NotNull()
    com.woocommerce.android.ui.base.UIMessageResolver p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.woocommerce.android.util.CurrencyFormatter getCurrencyFormatter() {
        return null;
    }
    
    public final void setCurrencyFormatter(@org.jetbrains.annotations.NotNull()
    com.woocommerce.android.util.CurrencyFormatter p0) {
    }
    
    private final com.woocommerce.android.ui.products.variations.VariationsBulkUpdatePriceViewModel getViewModel() {
        return null;
    }
    
    private final com.woocommerce.android.databinding.FragmentVariationsBulkUpdatePriceBinding getBinding() {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void observeEvents() {
    }
    
    private final void observeViewStateChanges() {
    }
    
    private final void updateProgressbarDialogVisibility(boolean visible, @androidx.annotation.StringRes()
    int title) {
    }
    
    private final void hideProgressDialog() {
    }
    
    private final void updateCurrentPricesLabel(com.woocommerce.android.ui.products.variations.ValuesGroupType pricesGroupType, com.woocommerce.android.ui.products.variations.VariationsBulkUpdatePriceViewModel.ViewState viewState) {
    }
    
    @java.lang.Override()
    public void onCreateOptionsMenu(@org.jetbrains.annotations.NotNull()
    android.view.Menu menu, @org.jetbrains.annotations.NotNull()
    android.view.MenuInflater inflater) {
    }
    
    @java.lang.Override()
    public boolean onOptionsItemSelected(@org.jetbrains.annotations.NotNull()
    android.view.MenuItem item) {
        return false;
    }
    
    @java.lang.Override()
    public void onPause() {
    }
}