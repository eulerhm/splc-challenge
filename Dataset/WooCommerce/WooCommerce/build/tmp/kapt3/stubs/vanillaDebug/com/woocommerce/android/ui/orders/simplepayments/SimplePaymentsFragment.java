package com.woocommerce.android.ui.orders.simplepayments;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0018\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%H\u0002J\b\u0010&\u001a\u00020%H\u0016J\b\u0010\'\u001a\u00020!H\u0016J\b\u0010(\u001a\u00020)H\u0016J\b\u0010*\u001a\u00020!H\u0016J\u001a\u0010+\u001a\u00020!2\u0006\u0010,\u001a\u00020-2\b\u0010.\u001a\u0004\u0018\u00010/H\u0016J\u0010\u00100\u001a\u00020!2\u0006\u00101\u001a\u000202H\u0002J\b\u00103\u001a\u00020!H\u0002J\b\u00104\u001a\u00020!H\u0002J\b\u00105\u001a\u00020!H\u0002R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0006\u001a\u00020\u00078\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\u00058BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u001b\u0010\u000f\u001a\u00020\u00108BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0012R\u001e\u0010\u0015\u001a\u00020\u00168\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001b\u0010\u001b\u001a\u00020\u001c8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001f\u0010\u0014\u001a\u0004\b\u001d\u0010\u001e\u00a8\u00066"}, d2 = {"Lcom/woocommerce/android/ui/orders/simplepayments/SimplePaymentsFragment;", "Lcom/woocommerce/android/ui/base/BaseFragment;", "Lcom/woocommerce/android/ui/main/MainActivity$Companion$BackPressListener;", "()V", "_orderTaxesAdapter", "Lcom/woocommerce/android/ui/orders/taxes/OrderTaxesAdapter;", "currencyFormatter", "Lcom/woocommerce/android/util/CurrencyFormatter;", "getCurrencyFormatter", "()Lcom/woocommerce/android/util/CurrencyFormatter;", "setCurrencyFormatter", "(Lcom/woocommerce/android/util/CurrencyFormatter;)V", "orderTaxesAdapter", "getOrderTaxesAdapter", "()Lcom/woocommerce/android/ui/orders/taxes/OrderTaxesAdapter;", "sharedViewModel", "Lcom/woocommerce/android/ui/orders/simplepayments/SimplePaymentsSharedViewModel;", "getSharedViewModel", "()Lcom/woocommerce/android/ui/orders/simplepayments/SimplePaymentsSharedViewModel;", "sharedViewModel$delegate", "Lkotlin/Lazy;", "uiMessageResolver", "Lcom/woocommerce/android/ui/base/UIMessageResolver;", "getUiMessageResolver", "()Lcom/woocommerce/android/ui/base/UIMessageResolver;", "setUiMessageResolver", "(Lcom/woocommerce/android/ui/base/UIMessageResolver;)V", "viewModel", "Lcom/woocommerce/android/ui/orders/simplepayments/SimplePaymentsFragmentViewModel;", "getViewModel", "()Lcom/woocommerce/android/ui/orders/simplepayments/SimplePaymentsFragmentViewModel;", "viewModel$delegate", "bindNotesSection", "", "notesSection", "Lcom/woocommerce/android/ui/orders/creation/views/OrderCreationSectionView;", "customerNote", "", "getFragmentTitle", "onDestroy", "onRequestAllowBackPress", "", "onResume", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "setupObservers", "binding", "Lcom/woocommerce/android/databinding/FragmentSimplePaymentsBinding;", "setupResultHandlers", "showCustomerNoteEditor", "showTakePaymentScreen", "WooCommerce_vanillaDebug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class SimplePaymentsFragment extends com.woocommerce.android.ui.base.BaseFragment implements com.woocommerce.android.ui.main.MainActivity.Companion.BackPressListener {
    private final kotlin.Lazy viewModel$delegate = null;
    private final kotlin.Lazy sharedViewModel$delegate = null;
    @javax.inject.Inject()
    public com.woocommerce.android.ui.base.UIMessageResolver uiMessageResolver;
    @javax.inject.Inject()
    public com.woocommerce.android.util.CurrencyFormatter currencyFormatter;
    private com.woocommerce.android.ui.orders.taxes.OrderTaxesAdapter _orderTaxesAdapter;
    
    public SimplePaymentsFragment() {
        super();
    }
    
    private final com.woocommerce.android.ui.orders.simplepayments.SimplePaymentsFragmentViewModel getViewModel() {
        return null;
    }
    
    private final com.woocommerce.android.ui.orders.simplepayments.SimplePaymentsSharedViewModel getSharedViewModel() {
        return null;
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
    
    private final com.woocommerce.android.ui.orders.taxes.OrderTaxesAdapter getOrderTaxesAdapter() {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onResume() {
    }
    
    @java.lang.Override()
    public boolean onRequestAllowBackPress() {
        return false;
    }
    
    private final void setupObservers(com.woocommerce.android.databinding.FragmentSimplePaymentsBinding binding) {
    }
    
    private final void setupResultHandlers() {
    }
    
    private final void bindNotesSection(com.woocommerce.android.ui.orders.creation.views.OrderCreationSectionView notesSection, java.lang.String customerNote) {
    }
    
    private final void showCustomerNoteEditor() {
    }
    
    private final void showTakePaymentScreen() {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getFragmentTitle() {
        return null;
    }
    
    @java.lang.Override()
    public void onDestroy() {
    }
}