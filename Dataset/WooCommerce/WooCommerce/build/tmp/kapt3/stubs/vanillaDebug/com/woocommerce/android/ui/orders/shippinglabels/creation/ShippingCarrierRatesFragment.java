package com.woocommerce.android.ui.orders.shippinglabels.creation;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 A2\u00020\u00012\u00020\u0002:\u0001AB\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010%\u001a\u00020&H\u0016J\b\u0010\'\u001a\u00020(H\u0002J\b\u0010)\u001a\u00020(H\u0002J\u0012\u0010*\u001a\u00020(2\b\u0010+\u001a\u0004\u0018\u00010,H\u0016J\u0018\u0010-\u001a\u00020(2\u0006\u0010.\u001a\u00020/2\u0006\u00100\u001a\u000201H\u0016J\b\u00102\u001a\u00020(H\u0016J\u0010\u00103\u001a\u0002042\u0006\u00105\u001a\u00020\u0010H\u0016J\b\u00106\u001a\u000204H\u0016J\b\u00107\u001a\u00020(H\u0016J\b\u00108\u001a\u00020(H\u0016J\u001a\u00109\u001a\u00020(2\u0006\u0010:\u001a\u00020;2\b\u0010+\u001a\u0004\u0018\u00010,H\u0016J\u0010\u0010<\u001a\u00020(2\u0006\u0010=\u001a\u000204H\u0002J\u000e\u0010>\u001a\u00020(2\u0006\u0010?\u001a\u000204J\b\u0010@\u001a\u00020(H\u0003R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u00058BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0011\u001a\u00020\u00128\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0019\u001a\u00020\u001a8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001b\u0010\u001f\u001a\u00020 8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b!\u0010\"\u00a8\u0006B"}, d2 = {"Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingCarrierRatesFragment;", "Lcom/woocommerce/android/ui/base/BaseFragment;", "Lcom/woocommerce/android/ui/main/MainActivity$Companion$BackPressListener;", "()V", "_binding", "Lcom/woocommerce/android/databinding/FragmentShippingCarrierRatesBinding;", "binding", "getBinding", "()Lcom/woocommerce/android/databinding/FragmentShippingCarrierRatesBinding;", "dateUtils", "Lcom/woocommerce/android/util/DateUtils;", "getDateUtils", "()Lcom/woocommerce/android/util/DateUtils;", "setDateUtils", "(Lcom/woocommerce/android/util/DateUtils;)V", "doneMenuItem", "Landroid/view/MenuItem;", "resourceProvider", "Lcom/woocommerce/android/viewmodel/ResourceProvider;", "getResourceProvider", "()Lcom/woocommerce/android/viewmodel/ResourceProvider;", "setResourceProvider", "(Lcom/woocommerce/android/viewmodel/ResourceProvider;)V", "skeletonView", "Lcom/woocommerce/android/widgets/SkeletonView;", "uiMessageResolver", "Lcom/woocommerce/android/ui/base/UIMessageResolver;", "getUiMessageResolver", "()Lcom/woocommerce/android/ui/base/UIMessageResolver;", "setUiMessageResolver", "(Lcom/woocommerce/android/ui/base/UIMessageResolver;)V", "viewModel", "Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingCarrierRatesViewModel;", "getViewModel", "()Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingCarrierRatesViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "getFragmentTitle", "", "initializeViewModel", "", "initializeViews", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateOptionsMenu", "menu", "Landroid/view/Menu;", "inflater", "Landroid/view/MenuInflater;", "onDestroyView", "onOptionsItemSelected", "", "item", "onRequestAllowBackPress", "onResume", "onStop", "onViewCreated", "view", "Landroid/view/View;", "showEmptyView", "isVisible", "showSkeleton", "show", "subscribeObservers", "Companion", "WooCommerce_vanillaDebug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class ShippingCarrierRatesFragment extends com.woocommerce.android.ui.base.BaseFragment implements com.woocommerce.android.ui.main.MainActivity.Companion.BackPressListener {
    @org.jetbrains.annotations.NotNull()
    public static final com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingCarrierRatesFragment.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String SHIPPING_CARRIERS_CLOSED = "shipping_carriers_closed";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String SHIPPING_CARRIERS_RESULT = "shipping_carriers_result";
    @javax.inject.Inject()
    public com.woocommerce.android.ui.base.UIMessageResolver uiMessageResolver;
    @javax.inject.Inject()
    public com.woocommerce.android.viewmodel.ResourceProvider resourceProvider;
    @javax.inject.Inject()
    public com.woocommerce.android.util.DateUtils dateUtils;
    private android.view.MenuItem doneMenuItem;
    private com.woocommerce.android.databinding.FragmentShippingCarrierRatesBinding _binding;
    private final com.woocommerce.android.widgets.SkeletonView skeletonView = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy viewModel$delegate = null;
    
    public ShippingCarrierRatesFragment() {
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
    public final com.woocommerce.android.viewmodel.ResourceProvider getResourceProvider() {
        return null;
    }
    
    public final void setResourceProvider(@org.jetbrains.annotations.NotNull()
    com.woocommerce.android.viewmodel.ResourceProvider p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.woocommerce.android.util.DateUtils getDateUtils() {
        return null;
    }
    
    public final void setDateUtils(@org.jetbrains.annotations.NotNull()
    com.woocommerce.android.util.DateUtils p0) {
    }
    
    private final com.woocommerce.android.databinding.FragmentShippingCarrierRatesBinding getBinding() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingCarrierRatesViewModel getViewModel() {
        return null;
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onResume() {
    }
    
    @java.lang.Override()
    public void onStop() {
    }
    
    @java.lang.Override()
    public void onDestroyView() {
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void initializeViewModel() {
    }
    
    private final void initializeViews() {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getFragmentTitle() {
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
    
    @android.annotation.SuppressLint(value = {"SetTextI18n"})
    private final void subscribeObservers() {
    }
    
    private final void showEmptyView(boolean isVisible) {
    }
    
    public final void showSkeleton(boolean show) {
    }
    
    @java.lang.Override()
    public boolean onRequestAllowBackPress() {
        return false;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingCarrierRatesFragment$Companion;", "", "()V", "SHIPPING_CARRIERS_CLOSED", "", "SHIPPING_CARRIERS_RESULT", "WooCommerce_vanillaDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}