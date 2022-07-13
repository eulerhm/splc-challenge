package com.woocommerce.android.ui.refunds;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u009c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0002ABBO\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u00a2\u0006\u0002\u0010\u0014J\u0016\u00104\u001a\u0002052\f\u00106\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017H\u0002J\u0018\u00107\u001a\u0002052\u0006\u00108\u001a\u0002092\u0006\u0010:\u001a\u00020;H\u0002J\u001e\u0010<\u001a\u0002052\u0006\u0010:\u001a\u00020;2\f\u00106\u001a\b\u0012\u0004\u0012\u0002090\u0017H\u0002J\u0018\u0010=\u001a\u00020\u001c2\u0006\u0010:\u001a\u00020;2\u0006\u00108\u001a\u000209H\u0002J\u000e\u0010>\u001a\u0002052\u0006\u0010?\u001a\u00020@R\u001a\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00170\u0016X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001c0\u001aX\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u001d\u001a\u00020\u001e8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b\u001f\u0010 R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010#\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00170$\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R+\u0010)\u001a\u00020(2\u0006\u0010\'\u001a\u00020(8B@BX\u0082\u008e\u0002\u00a2\u0006\u0012\n\u0004\b.\u0010/\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\u0017\u00100\u001a\b\u0012\u0004\u0012\u00020(01\u00a2\u0006\b\n\u0000\u001a\u0004\b2\u00103\u00a8\u0006C"}, d2 = {"Lcom/woocommerce/android/ui/refunds/RefundDetailViewModel;", "Lcom/woocommerce/android/viewmodel/ScopedViewModel;", "savedState", "Landroidx/lifecycle/SavedStateHandle;", "orderStore", "Lorg/wordpress/android/fluxc/store/WCOrderStore;", "coroutineDispatchers", "Lcom/woocommerce/android/util/CoroutineDispatchers;", "selectedSite", "Lcom/woocommerce/android/tools/SelectedSite;", "currencyFormatter", "Lcom/woocommerce/android/util/CurrencyFormatter;", "resourceProvider", "Lcom/woocommerce/android/viewmodel/ResourceProvider;", "addonsRepository", "Lcom/woocommerce/android/ui/products/addons/AddonRepository;", "refundStore", "Lorg/wordpress/android/fluxc/store/WCRefundStore;", "orderMapper", "Lcom/woocommerce/android/model/OrderMapper;", "(Landroidx/lifecycle/SavedStateHandle;Lorg/wordpress/android/fluxc/store/WCOrderStore;Lcom/woocommerce/android/util/CoroutineDispatchers;Lcom/woocommerce/android/tools/SelectedSite;Lcom/woocommerce/android/util/CurrencyFormatter;Lcom/woocommerce/android/viewmodel/ResourceProvider;Lcom/woocommerce/android/ui/products/addons/AddonRepository;Lorg/wordpress/android/fluxc/store/WCRefundStore;Lcom/woocommerce/android/model/OrderMapper;)V", "_refundItems", "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/woocommerce/android/ui/refunds/RefundProductListAdapter$ProductRefundListItem;", "formatCurrency", "Lkotlin/Function1;", "Ljava/math/BigDecimal;", "", "navArgs", "Lcom/woocommerce/android/ui/refunds/RefundDetailFragmentArgs;", "getNavArgs", "()Lcom/woocommerce/android/ui/refunds/RefundDetailFragmentArgs;", "navArgs$delegate", "Lcom/woocommerce/android/viewmodel/NavArgsLazy;", "refundItems", "Landroidx/lifecycle/LiveData;", "getRefundItems", "()Landroidx/lifecycle/LiveData;", "<set-?>", "Lcom/woocommerce/android/ui/refunds/RefundDetailViewModel$ViewState;", "viewState", "getViewState", "()Lcom/woocommerce/android/ui/refunds/RefundDetailViewModel$ViewState;", "setViewState", "(Lcom/woocommerce/android/ui/refunds/RefundDetailViewModel$ViewState;)V", "viewState$delegate", "Lcom/woocommerce/android/viewmodel/LiveDataDelegate;", "viewStateData", "Lcom/woocommerce/android/viewmodel/LiveDataDelegate;", "getViewStateData", "()Lcom/woocommerce/android/viewmodel/LiveDataDelegate;", "checkAddonAvailability", "", "refunds", "displayRefundDetails", "refund", "Lcom/woocommerce/android/model/Refund;", "order", "Lcom/woocommerce/android/model/Order;", "displayRefundedProducts", "getRefundMethod", "onViewOrderedAddonButtonTapped", "orderItem", "Lcom/woocommerce/android/model/Order$Item;", "ViewOrderedAddons", "ViewState", "WooCommerce_wasabiDebug"})
public final class RefundDetailViewModel extends com.woocommerce.android.viewmodel.ScopedViewModel {
    private final com.woocommerce.android.util.CoroutineDispatchers coroutineDispatchers = null;
    private final com.woocommerce.android.tools.SelectedSite selectedSite = null;
    private final com.woocommerce.android.util.CurrencyFormatter currencyFormatter = null;
    private final com.woocommerce.android.viewmodel.ResourceProvider resourceProvider = null;
    private final com.woocommerce.android.ui.products.addons.AddonRepository addonsRepository = null;
    private final org.wordpress.android.fluxc.store.WCRefundStore refundStore = null;
    private final com.woocommerce.android.model.OrderMapper orderMapper = null;
    @org.jetbrains.annotations.NotNull
    private final com.woocommerce.android.viewmodel.LiveDataDelegate<com.woocommerce.android.ui.refunds.RefundDetailViewModel.ViewState> viewStateData = null;
    private final com.woocommerce.android.viewmodel.LiveDataDelegate viewState$delegate = null;
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.woocommerce.android.ui.refunds.RefundProductListAdapter.ProductRefundListItem>> _refundItems = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.LiveData<java.util.List<com.woocommerce.android.ui.refunds.RefundProductListAdapter.ProductRefundListItem>> refundItems = null;
    private kotlin.jvm.functions.Function1<? super java.math.BigDecimal, java.lang.String> formatCurrency;
    private final com.woocommerce.android.viewmodel.NavArgsLazy navArgs$delegate = null;
    
    @javax.inject.Inject
    public RefundDetailViewModel(@org.jetbrains.annotations.NotNull
    androidx.lifecycle.SavedStateHandle savedState, @org.jetbrains.annotations.NotNull
    org.wordpress.android.fluxc.store.WCOrderStore orderStore, @org.jetbrains.annotations.NotNull
    com.woocommerce.android.util.CoroutineDispatchers coroutineDispatchers, @org.jetbrains.annotations.NotNull
    com.woocommerce.android.tools.SelectedSite selectedSite, @org.jetbrains.annotations.NotNull
    com.woocommerce.android.util.CurrencyFormatter currencyFormatter, @org.jetbrains.annotations.NotNull
    com.woocommerce.android.viewmodel.ResourceProvider resourceProvider, @org.jetbrains.annotations.NotNull
    com.woocommerce.android.ui.products.addons.AddonRepository addonsRepository, @org.jetbrains.annotations.NotNull
    org.wordpress.android.fluxc.store.WCRefundStore refundStore, @org.jetbrains.annotations.NotNull
    com.woocommerce.android.model.OrderMapper orderMapper) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.woocommerce.android.viewmodel.LiveDataDelegate<com.woocommerce.android.ui.refunds.RefundDetailViewModel.ViewState> getViewStateData() {
        return null;
    }
    
    private final com.woocommerce.android.ui.refunds.RefundDetailViewModel.ViewState getViewState() {
        return null;
    }
    
    private final void setViewState(com.woocommerce.android.ui.refunds.RefundDetailViewModel.ViewState p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<java.util.List<com.woocommerce.android.ui.refunds.RefundProductListAdapter.ProductRefundListItem>> getRefundItems() {
        return null;
    }
    
    private final com.woocommerce.android.ui.refunds.RefundDetailFragmentArgs getNavArgs() {
        return null;
    }
    
    public final void onViewOrderedAddonButtonTapped(@org.jetbrains.annotations.NotNull
    com.woocommerce.android.model.Order.Item orderItem) {
    }
    
    private final void displayRefundedProducts(com.woocommerce.android.model.Order order, java.util.List<com.woocommerce.android.model.Refund> refunds) {
    }
    
    private final void displayRefundDetails(com.woocommerce.android.model.Refund refund, com.woocommerce.android.model.Order order) {
    }
    
    private final java.lang.String getRefundMethod(com.woocommerce.android.model.Order order, com.woocommerce.android.model.Refund refund) {
        return null;
    }
    
    private final void checkAddonAvailability(java.util.List<com.woocommerce.android.ui.refunds.RefundProductListAdapter.ProductRefundListItem> refunds) {
    }
    
    @kotlinx.parcelize.Parcelize
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u001a\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bq\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u00a2\u0006\u0002\u0010\rJ\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0010\u0010!\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003\u00a2\u0006\u0002\u0010\u000fJ\u0010\u0010\"\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003\u00a2\u0006\u0002\u0010\u000fJz\u0010#\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000bH\u00c6\u0001\u00a2\u0006\u0002\u0010$J\t\u0010%\u001a\u00020&H\u00d6\u0001J\u0013\u0010\'\u001a\u00020\u000b2\b\u0010(\u001a\u0004\u0018\u00010)H\u00d6\u0003J\t\u0010*\u001a\u00020&H\u00d6\u0001J\t\u0010+\u001a\u00020\u0003H\u00d6\u0001J\u0019\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020/2\u0006\u00100\u001a\u00020&H\u00d6\u0001R\u0015\u0010\f\u001a\u0004\u0018\u00010\u000b\u00a2\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000fR\u0015\u0010\n\u001a\u0004\u0018\u00010\u000b\u00a2\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u0011\u0010\u000fR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0013R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0013R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0013R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0013\u00a8\u00061"}, d2 = {"Lcom/woocommerce/android/ui/refunds/RefundDetailViewModel$ViewState;", "Landroid/os/Parcelable;", "screenTitle", "", "refundAmount", "subtotal", "taxes", "refundMethod", "refundReason", "currency", "areItemsVisible", "", "areDetailsVisible", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "getAreDetailsVisible", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getAreItemsVisible", "getCurrency", "()Ljava/lang/String;", "getRefundAmount", "getRefundMethod", "getRefundReason", "getScreenTitle", "getSubtotal", "getTaxes", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lcom/woocommerce/android/ui/refunds/RefundDetailViewModel$ViewState;", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "WooCommerce_wasabiDebug"})
    public static final class ViewState implements android.os.Parcelable {
        @org.jetbrains.annotations.Nullable
        private final java.lang.String screenTitle = null;
        @org.jetbrains.annotations.Nullable
        private final java.lang.String refundAmount = null;
        @org.jetbrains.annotations.Nullable
        private final java.lang.String subtotal = null;
        @org.jetbrains.annotations.Nullable
        private final java.lang.String taxes = null;
        @org.jetbrains.annotations.Nullable
        private final java.lang.String refundMethod = null;
        @org.jetbrains.annotations.Nullable
        private final java.lang.String refundReason = null;
        @org.jetbrains.annotations.Nullable
        private final java.lang.String currency = null;
        @org.jetbrains.annotations.Nullable
        private final java.lang.Boolean areItemsVisible = null;
        @org.jetbrains.annotations.Nullable
        private final java.lang.Boolean areDetailsVisible = null;
        public static final android.os.Parcelable.Creator<com.woocommerce.android.ui.refunds.RefundDetailViewModel.ViewState> CREATOR = null;
        
        @org.jetbrains.annotations.NotNull
        public final com.woocommerce.android.ui.refunds.RefundDetailViewModel.ViewState copy(@org.jetbrains.annotations.Nullable
        java.lang.String screenTitle, @org.jetbrains.annotations.Nullable
        java.lang.String refundAmount, @org.jetbrains.annotations.Nullable
        java.lang.String subtotal, @org.jetbrains.annotations.Nullable
        java.lang.String taxes, @org.jetbrains.annotations.Nullable
        java.lang.String refundMethod, @org.jetbrains.annotations.Nullable
        java.lang.String refundReason, @org.jetbrains.annotations.Nullable
        java.lang.String currency, @org.jetbrains.annotations.Nullable
        java.lang.Boolean areItemsVisible, @org.jetbrains.annotations.Nullable
        java.lang.Boolean areDetailsVisible) {
            return null;
        }
        
        @java.lang.Override
        public boolean equals(@org.jetbrains.annotations.Nullable
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override
        public int hashCode() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull
        @java.lang.Override
        public java.lang.String toString() {
            return null;
        }
        
        public ViewState() {
            super();
        }
        
        public ViewState(@org.jetbrains.annotations.Nullable
        java.lang.String screenTitle, @org.jetbrains.annotations.Nullable
        java.lang.String refundAmount, @org.jetbrains.annotations.Nullable
        java.lang.String subtotal, @org.jetbrains.annotations.Nullable
        java.lang.String taxes, @org.jetbrains.annotations.Nullable
        java.lang.String refundMethod, @org.jetbrains.annotations.Nullable
        java.lang.String refundReason, @org.jetbrains.annotations.Nullable
        java.lang.String currency, @org.jetbrains.annotations.Nullable
        java.lang.Boolean areItemsVisible, @org.jetbrains.annotations.Nullable
        java.lang.Boolean areDetailsVisible) {
            super();
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.String getScreenTitle() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.String component2() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.String getRefundAmount() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.String component3() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.String getSubtotal() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.String component4() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.String getTaxes() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.String component5() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.String getRefundMethod() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.String component6() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.String getRefundReason() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.String component7() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.String getCurrency() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.Boolean component8() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.Boolean getAreItemsVisible() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.Boolean component9() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.Boolean getAreDetailsVisible() {
            return null;
        }
        
        @java.lang.Override
        public int describeContents() {
            return 0;
        }
        
        @java.lang.Override
        public void writeToParcel(@org.jetbrains.annotations.NotNull
        android.os.Parcel parcel, int flags) {
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 3)
        public static final class Creator implements android.os.Parcelable.Creator<com.woocommerce.android.ui.refunds.RefundDetailViewModel.ViewState> {
            
            public Creator() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull
            @java.lang.Override
            public final com.woocommerce.android.ui.refunds.RefundDetailViewModel.ViewState createFromParcel(@org.jetbrains.annotations.NotNull
            android.os.Parcel in) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull
            @java.lang.Override
            public final com.woocommerce.android.ui.refunds.RefundDetailViewModel.ViewState[] newArray(int size) {
                return null;
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\r\u001a\u00020\u0003H\u00c6\u0003J\'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u00d6\u0003J\t\u0010\u0013\u001a\u00020\u0014H\u00d6\u0001J\t\u0010\u0015\u001a\u00020\u0016H\u00d6\u0001R\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b\u00a8\u0006\u0017"}, d2 = {"Lcom/woocommerce/android/ui/refunds/RefundDetailViewModel$ViewOrderedAddons;", "Lcom/woocommerce/android/viewmodel/MultiLiveEvent$Event;", "remoteOrderID", "", "orderItemID", "addonsProductID", "(JJJ)V", "getAddonsProductID", "()J", "getOrderItemID", "getRemoteOrderID", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "WooCommerce_wasabiDebug"})
    public static final class ViewOrderedAddons extends com.woocommerce.android.viewmodel.MultiLiveEvent.Event {
        private final long remoteOrderID = 0L;
        private final long orderItemID = 0L;
        private final long addonsProductID = 0L;
        
        @org.jetbrains.annotations.NotNull
        public final com.woocommerce.android.ui.refunds.RefundDetailViewModel.ViewOrderedAddons copy(long remoteOrderID, long orderItemID, long addonsProductID) {
            return null;
        }
        
        @java.lang.Override
        public boolean equals(@org.jetbrains.annotations.Nullable
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override
        public int hashCode() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull
        @java.lang.Override
        public java.lang.String toString() {
            return null;
        }
        
        public ViewOrderedAddons(long remoteOrderID, long orderItemID, long addonsProductID) {
            super(false);
        }
        
        public final long component1() {
            return 0L;
        }
        
        public final long getRemoteOrderID() {
            return 0L;
        }
        
        public final long component2() {
            return 0L;
        }
        
        public final long getOrderItemID() {
            return 0L;
        }
        
        public final long component3() {
            return 0L;
        }
        
        public final long getAddonsProductID() {
            return 0L;
        }
    }
}