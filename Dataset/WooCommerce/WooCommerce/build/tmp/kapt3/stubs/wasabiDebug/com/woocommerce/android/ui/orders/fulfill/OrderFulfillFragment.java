package com.woocommerce.android.ui.orders.fulfill;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u00aa\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 W2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001WB\u0005\u00a2\u0006\u0002\u0010\u0004J \u00100\u001a\u0002012\u0006\u00102\u001a\u00020\u001e2\u0006\u00103\u001a\u0002042\u0006\u00105\u001a\u000206H\u0002J\b\u00107\u001a\u00020\u001eH\u0016J\b\u00108\u001a\u000209H\u0016J\b\u0010:\u001a\u000201H\u0016J\b\u0010;\u001a\u000201H\u0016J\u001a\u0010<\u001a\u0002012\u0006\u0010=\u001a\u00020>2\b\u0010?\u001a\u0004\u0018\u00010@H\u0016J\u0010\u0010A\u001a\u0002012\u0006\u0010B\u001a\u00020CH\u0016J\u0018\u0010D\u001a\u0002012\u0006\u0010B\u001a\u00020C2\u0006\u0010E\u001a\u00020CH\u0016J\u0010\u0010F\u001a\u0002012\u0006\u0010G\u001a\u00020HH\u0002J\u0010\u0010I\u001a\u0002012\u0006\u0010*\u001a\u00020+H\u0002J\u0018\u0010J\u001a\u0002012\u0006\u0010K\u001a\u0002092\u0006\u0010G\u001a\u00020HH\u0002J\u0018\u0010L\u001a\u0002012\u0006\u0010M\u001a\u00020N2\u0006\u0010G\u001a\u00020HH\u0002J&\u0010O\u001a\u0002012\f\u0010P\u001a\b\u0012\u0004\u0012\u00020R0Q2\u0006\u0010S\u001a\u00020\u001e2\u0006\u0010G\u001a\u00020HH\u0002J\u001e\u0010T\u001a\u0002012\f\u0010U\u001a\b\u0012\u0004\u0012\u00020V0Q2\u0006\u0010G\u001a\u00020HH\u0002R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001e\u0010\u000b\u001a\u00020\f8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0011\u001a\u00020\u00128\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001e\u0010\u0017\u001a\u00020\u00188\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001e\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001d\u001a\u00020\u001e@BX\u0082\u000e\u00a2\u0006\b\n\u0000\"\u0004\b \u0010!R\u001e\u0010\"\u001a\u00020#8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010\'R\u0010\u0010(\u001a\u0004\u0018\u00010)X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010*\u001a\u00020+8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b,\u0010-\u00a8\u0006X"}, d2 = {"Lcom/woocommerce/android/ui/orders/fulfill/OrderFulfillFragment;", "Lcom/woocommerce/android/ui/base/BaseFragment;", "Lcom/woocommerce/android/ui/orders/OrderProductActionListener;", "Lcom/woocommerce/android/ui/main/MainActivity$Companion$BackPressListener;", "()V", "currencyFormatter", "Lcom/woocommerce/android/util/CurrencyFormatter;", "getCurrencyFormatter", "()Lcom/woocommerce/android/util/CurrencyFormatter;", "setCurrencyFormatter", "(Lcom/woocommerce/android/util/CurrencyFormatter;)V", "dateUtils", "Lcom/woocommerce/android/util/DateUtils;", "getDateUtils", "()Lcom/woocommerce/android/util/DateUtils;", "setDateUtils", "(Lcom/woocommerce/android/util/DateUtils;)V", "navigator", "Lcom/woocommerce/android/ui/orders/OrderNavigator;", "getNavigator", "()Lcom/woocommerce/android/ui/orders/OrderNavigator;", "setNavigator", "(Lcom/woocommerce/android/ui/orders/OrderNavigator;)V", "productImageMap", "Lcom/woocommerce/android/tools/ProductImageMap;", "getProductImageMap", "()Lcom/woocommerce/android/tools/ProductImageMap;", "setProductImageMap", "(Lcom/woocommerce/android/tools/ProductImageMap;)V", "value", "", "screenTitle", "setScreenTitle", "(Ljava/lang/String;)V", "uiMessageResolver", "Lcom/woocommerce/android/ui/base/UIMessageResolver;", "getUiMessageResolver", "()Lcom/woocommerce/android/ui/base/UIMessageResolver;", "setUiMessageResolver", "(Lcom/woocommerce/android/ui/base/UIMessageResolver;)V", "undoSnackbar", "Lcom/google/android/material/snackbar/Snackbar;", "viewModel", "Lcom/woocommerce/android/ui/orders/fulfill/OrderFulfillViewModel;", "getViewModel", "()Lcom/woocommerce/android/ui/orders/fulfill/OrderFulfillViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "displayUndoSnackbar", "", "message", "actionListener", "Landroid/view/View$OnClickListener;", "dismissCallback", "Lcom/google/android/material/snackbar/Snackbar$Callback;", "getFragmentTitle", "onRequestAllowBackPress", "", "onResume", "onStop", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "openOrderProductDetail", "remoteProductId", "", "openOrderProductVariationDetail", "remoteVariationId", "setupObservers", "binding", "Lcom/woocommerce/android/databinding/FragmentOrderFulfillBinding;", "setupResultHandlers", "showAddShipmentTracking", "show", "showOrderDetail", "order", "Lcom/woocommerce/android/model/Order;", "showOrderProducts", "products", "", "Lcom/woocommerce/android/model/Order$Item;", "currency", "showShipmentTrackings", "shipmentTrackings", "Lcom/woocommerce/android/model/OrderShipmentTracking;", "Companion", "WooCommerce_wasabiDebug"})
@dagger.hilt.android.AndroidEntryPoint
public final class OrderFulfillFragment extends com.woocommerce.android.ui.base.BaseFragment implements com.woocommerce.android.ui.orders.OrderProductActionListener, com.woocommerce.android.ui.main.MainActivity.Companion.BackPressListener {
    @org.jetbrains.annotations.NotNull
    public static final com.woocommerce.android.ui.orders.fulfill.OrderFulfillFragment.Companion Companion = null;
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String TAG = null;
    private final kotlin.Lazy viewModel$delegate = null;
    @javax.inject.Inject
    public com.woocommerce.android.ui.orders.OrderNavigator navigator;
    @javax.inject.Inject
    public com.woocommerce.android.util.CurrencyFormatter currencyFormatter;
    @javax.inject.Inject
    public com.woocommerce.android.ui.base.UIMessageResolver uiMessageResolver;
    @javax.inject.Inject
    public com.woocommerce.android.tools.ProductImageMap productImageMap;
    @javax.inject.Inject
    public com.woocommerce.android.util.DateUtils dateUtils;
    private com.google.android.material.snackbar.Snackbar undoSnackbar;
    private java.lang.String screenTitle = "";
    
    public OrderFulfillFragment() {
        super();
    }
    
    private final com.woocommerce.android.ui.orders.fulfill.OrderFulfillViewModel getViewModel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.woocommerce.android.ui.orders.OrderNavigator getNavigator() {
        return null;
    }
    
    public final void setNavigator(@org.jetbrains.annotations.NotNull
    com.woocommerce.android.ui.orders.OrderNavigator p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.woocommerce.android.util.CurrencyFormatter getCurrencyFormatter() {
        return null;
    }
    
    public final void setCurrencyFormatter(@org.jetbrains.annotations.NotNull
    com.woocommerce.android.util.CurrencyFormatter p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.woocommerce.android.ui.base.UIMessageResolver getUiMessageResolver() {
        return null;
    }
    
    public final void setUiMessageResolver(@org.jetbrains.annotations.NotNull
    com.woocommerce.android.ui.base.UIMessageResolver p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.woocommerce.android.tools.ProductImageMap getProductImageMap() {
        return null;
    }
    
    public final void setProductImageMap(@org.jetbrains.annotations.NotNull
    com.woocommerce.android.tools.ProductImageMap p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.woocommerce.android.util.DateUtils getDateUtils() {
        return null;
    }
    
    public final void setDateUtils(@org.jetbrains.annotations.NotNull
    com.woocommerce.android.util.DateUtils p0) {
    }
    
    private final void setScreenTitle(java.lang.String value) {
    }
    
    @java.lang.Override
    public void onResume() {
    }
    
    @java.lang.Override
    public void onStop() {
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.lang.String getFragmentTitle() {
        return null;
    }
    
    @java.lang.Override
    public void onViewCreated(@org.jetbrains.annotations.NotNull
    android.view.View view, @org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override
    public void openOrderProductDetail(long remoteProductId) {
    }
    
    @java.lang.Override
    public void openOrderProductVariationDetail(long remoteProductId, long remoteVariationId) {
    }
    
    @java.lang.Override
    public boolean onRequestAllowBackPress() {
        return false;
    }
    
    private final void setupObservers(com.woocommerce.android.databinding.FragmentOrderFulfillBinding binding) {
    }
    
    private final void setupResultHandlers(com.woocommerce.android.ui.orders.fulfill.OrderFulfillViewModel viewModel) {
    }
    
    private final void showOrderDetail(com.woocommerce.android.model.Order order, com.woocommerce.android.databinding.FragmentOrderFulfillBinding binding) {
    }
    
    private final void showOrderProducts(java.util.List<com.woocommerce.android.model.Order.Item> products, java.lang.String currency, com.woocommerce.android.databinding.FragmentOrderFulfillBinding binding) {
    }
    
    private final void showAddShipmentTracking(boolean show, com.woocommerce.android.databinding.FragmentOrderFulfillBinding binding) {
    }
    
    private final void showShipmentTrackings(java.util.List<com.woocommerce.android.model.OrderShipmentTracking> shipmentTrackings, com.woocommerce.android.databinding.FragmentOrderFulfillBinding binding) {
    }
    
    private final void displayUndoSnackbar(java.lang.String message, android.view.View.OnClickListener actionListener, com.google.android.material.snackbar.Snackbar.Callback dismissCallback) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/woocommerce/android/ui/orders/fulfill/OrderFulfillFragment$Companion;", "", "()V", "TAG", "", "getTAG", "()Ljava/lang/String;", "WooCommerce_wasabiDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getTAG() {
            return null;
        }
    }
}