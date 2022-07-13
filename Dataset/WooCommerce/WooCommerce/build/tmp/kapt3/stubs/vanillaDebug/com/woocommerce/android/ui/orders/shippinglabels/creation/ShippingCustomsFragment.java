package com.woocommerce.android.ui.orders.shippinglabels.creation;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 +2\u00020\u00012\u00020\u0002:\u0001+B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u0017\u001a\u00020\u0018H\u0016J\u0018\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\u0016J\u0010\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u000bH\u0016J\b\u0010\"\u001a\u00020 H\u0016J\u001a\u0010#\u001a\u00020\u001a2\u0006\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010\'H\u0016J\u0010\u0010(\u001a\u00020\u001a2\u0006\u0010)\u001a\u00020*H\u0002R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\n\u001a\u00020\u000bX\u0082.\u00a2\u0006\u0002\n\u0000R\u001e\u0010\f\u001a\u00020\r8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0012\u001a\u00020\u00138BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0016\u0010\t\u001a\u0004\b\u0014\u0010\u0015\u00a8\u0006,"}, d2 = {"Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingCustomsFragment;", "Lcom/woocommerce/android/ui/base/BaseFragment;", "Lcom/woocommerce/android/ui/main/MainActivity$Companion$BackPressListener;", "()V", "customsAdapter", "Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingCustomsAdapter;", "getCustomsAdapter", "()Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingCustomsAdapter;", "customsAdapter$delegate", "Lkotlin/Lazy;", "doneMenuItem", "Landroid/view/MenuItem;", "uiMessageResolver", "Lcom/woocommerce/android/ui/base/UIMessageResolver;", "getUiMessageResolver", "()Lcom/woocommerce/android/ui/base/UIMessageResolver;", "setUiMessageResolver", "(Lcom/woocommerce/android/ui/base/UIMessageResolver;)V", "viewModel", "Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingCustomsViewModel;", "getViewModel", "()Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingCustomsViewModel;", "viewModel$delegate", "getFragmentTitle", "", "onCreateOptionsMenu", "", "menu", "Landroid/view/Menu;", "inflater", "Landroid/view/MenuInflater;", "onOptionsItemSelected", "", "item", "onRequestAllowBackPress", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "setupObservers", "binding", "Lcom/woocommerce/android/databinding/FragmentShippingCustomsBinding;", "Companion", "WooCommerce_vanillaDebug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class ShippingCustomsFragment extends com.woocommerce.android.ui.base.BaseFragment implements com.woocommerce.android.ui.main.MainActivity.Companion.BackPressListener {
    @org.jetbrains.annotations.NotNull()
    public static final com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingCustomsFragment.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String EDIT_CUSTOMS_CLOSED = "edit_customs_closed";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String EDIT_CUSTOMS_RESULT = "edit_customs_result";
    @javax.inject.Inject()
    public com.woocommerce.android.ui.base.UIMessageResolver uiMessageResolver;
    private final kotlin.Lazy viewModel$delegate = null;
    private android.view.MenuItem doneMenuItem;
    private final kotlin.Lazy customsAdapter$delegate = null;
    
    public ShippingCustomsFragment() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.woocommerce.android.ui.base.UIMessageResolver getUiMessageResolver() {
        return null;
    }
    
    public final void setUiMessageResolver(@org.jetbrains.annotations.NotNull()
    com.woocommerce.android.ui.base.UIMessageResolver p0) {
    }
    
    private final com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingCustomsViewModel getViewModel() {
        return null;
    }
    
    private final com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingCustomsAdapter getCustomsAdapter() {
        return null;
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
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void setupObservers(com.woocommerce.android.databinding.FragmentShippingCustomsBinding binding) {
    }
    
    @java.lang.Override()
    public boolean onRequestAllowBackPress() {
        return false;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingCustomsFragment$Companion;", "", "()V", "EDIT_CUSTOMS_CLOSED", "", "EDIT_CUSTOMS_RESULT", "WooCommerce_vanillaDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}