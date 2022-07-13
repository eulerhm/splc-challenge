package com.woocommerce.android.ui.orders.creation.fees;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u0019H\u0002J\u0018\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\u0016J\u0010\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\nH\u0016J\u001a\u0010\"\u001a\u00020\u00192\u0006\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010&H\u0016J\u0010\u0010\'\u001a\u00020(2\u0006\u0010)\u001a\u00020*H\u0002J\f\u0010+\u001a\u00020\u0019*\u00020,H\u0002J\f\u0010-\u001a\u00020\u0019*\u00020,H\u0002R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u001b\u0010\u0011\u001a\u00020\u00128BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0015\u0010\u0010\u001a\u0004\b\u0013\u0010\u0014\u00a8\u0006."}, d2 = {"Lcom/woocommerce/android/ui/orders/creation/fees/OrderCreationFeeFragment;", "Lcom/woocommerce/android/ui/base/BaseFragment;", "()V", "currencyFormatter", "Lcom/woocommerce/android/util/CurrencyFormatter;", "getCurrencyFormatter", "()Lcom/woocommerce/android/util/CurrencyFormatter;", "setCurrencyFormatter", "(Lcom/woocommerce/android/util/CurrencyFormatter;)V", "doneMenuItem", "Landroid/view/MenuItem;", "editFeeViewModel", "Lcom/woocommerce/android/ui/orders/creation/fees/OrderCreationFeeViewModel;", "getEditFeeViewModel", "()Lcom/woocommerce/android/ui/orders/creation/fees/OrderCreationFeeViewModel;", "editFeeViewModel$delegate", "Lkotlin/Lazy;", "sharedViewModel", "Lcom/woocommerce/android/ui/orders/creation/OrderCreationViewModel;", "getSharedViewModel", "()Lcom/woocommerce/android/ui/orders/creation/OrderCreationViewModel;", "sharedViewModel$delegate", "getFragmentTitle", "", "observeEvents", "", "onCreateOptionsMenu", "menu", "Landroid/view/Menu;", "inflater", "Landroid/view/MenuInflater;", "onOptionsItemSelected", "", "item", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "styleCalculatedFee", "Landroid/text/SpannableString;", "feeAmount", "Ljava/math/BigDecimal;", "bindViews", "Lcom/woocommerce/android/databinding/FragmentOrderCreationFeeBinding;", "observeViewStateData", "WooCommerce_vanillaDebug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class OrderCreationFeeFragment extends com.woocommerce.android.ui.base.BaseFragment {
    private final kotlin.Lazy sharedViewModel$delegate = null;
    private final kotlin.Lazy editFeeViewModel$delegate = null;
    @javax.inject.Inject()
    public com.woocommerce.android.util.CurrencyFormatter currencyFormatter;
    private android.view.MenuItem doneMenuItem;
    
    public OrderCreationFeeFragment() {
        super();
    }
    
    private final com.woocommerce.android.ui.orders.creation.OrderCreationViewModel getSharedViewModel() {
        return null;
    }
    
    private final com.woocommerce.android.ui.orders.creation.fees.OrderCreationFeeViewModel getEditFeeViewModel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.woocommerce.android.util.CurrencyFormatter getCurrencyFormatter() {
        return null;
    }
    
    public final void setCurrencyFormatter(@org.jetbrains.annotations.NotNull()
    com.woocommerce.android.util.CurrencyFormatter p0) {
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
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
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getFragmentTitle() {
        return null;
    }
    
    private final void bindViews(com.woocommerce.android.databinding.FragmentOrderCreationFeeBinding $this$bindViews) {
    }
    
    private final android.text.SpannableString styleCalculatedFee(java.math.BigDecimal feeAmount) {
        return null;
    }
    
    private final void observeViewStateData(com.woocommerce.android.databinding.FragmentOrderCreationFeeBinding $this$observeViewStateData) {
    }
    
    private final void observeEvents() {
    }
}