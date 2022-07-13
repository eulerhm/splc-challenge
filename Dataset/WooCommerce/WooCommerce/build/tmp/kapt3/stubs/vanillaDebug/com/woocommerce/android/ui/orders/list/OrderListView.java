package com.woocommerce.android.ui.orders.list;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0006\u0010\u0017\u001a\u00020\u0018J\u0006\u0010\u0019\u001a\u00020\u0007J\u0016\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0010J\u000e\u0010\u001e\u001a\u00020\u00182\u0006\u0010\u001f\u001a\u00020 J\b\u0010!\u001a\u0004\u0018\u00010 J\u0006\u0010\"\u001a\u00020\u0018J\u000e\u0010#\u001a\u00020\u00182\u0006\u0010$\u001a\u00020%J\u001a\u0010&\u001a\u00020\u00182\u0012\u0010\'\u001a\u000e\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020*0(J\u0016\u0010+\u001a\u00020\u00182\u000e\u0010,\u001a\n\u0012\u0004\u0012\u00020.\u0018\u00010-R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u000b\u001a\u00020\f8F\u00a2\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u000f\u001a\u00020\u0010X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082.\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0013\u001a\u00020\u00148F\u00a2\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016\u00a8\u0006/"}, d2 = {"Lcom/woocommerce/android/ui/orders/list/OrderListView;", "Landroid/widget/LinearLayout;", "ctx", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "binding", "Lcom/woocommerce/android/databinding/OrderListViewBinding;", "emptyView", "Lcom/woocommerce/android/widgets/WCEmptyView;", "getEmptyView", "()Lcom/woocommerce/android/widgets/WCEmptyView;", "listener", "Lcom/woocommerce/android/ui/orders/list/OrderListListener;", "ordersAdapter", "Lcom/woocommerce/android/ui/orders/list/OrderListAdapter;", "ordersList", "Landroidx/recyclerview/widget/RecyclerView;", "getOrdersList", "()Landroidx/recyclerview/widget/RecyclerView;", "clearAdapterData", "", "getCurrentPosition", "init", "currencyFormatter", "Lcom/woocommerce/android/util/CurrencyFormatter;", "orderListListener", "onFragmentRestoreInstanceState", "listState", "Landroid/os/Parcelable;", "onFragmentSavedInstanceState", "scrollToTop", "setLoadingMoreIndicator", "active", "", "setOrderStatusOptions", "orderStatusOptions", "", "", "Lorg/wordpress/android/fluxc/model/WCOrderStatusModel;", "submitPagedList", "list", "Landroidx/paging/PagedList;", "Lcom/woocommerce/android/ui/orders/list/OrderListItemUIType;", "WooCommerce_vanillaDebug"})
public final class OrderListView extends android.widget.LinearLayout {
    private final com.woocommerce.android.databinding.OrderListViewBinding binding = null;
    private com.woocommerce.android.ui.orders.list.OrderListAdapter ordersAdapter;
    private com.woocommerce.android.ui.orders.list.OrderListListener listener;
    
    @kotlin.jvm.JvmOverloads()
    public OrderListView(@org.jetbrains.annotations.NotNull()
    android.content.Context ctx) {
        super(null);
    }
    
    @kotlin.jvm.JvmOverloads()
    public OrderListView(@org.jetbrains.annotations.NotNull()
    android.content.Context ctx, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    @kotlin.jvm.JvmOverloads()
    public OrderListView(@org.jetbrains.annotations.NotNull()
    android.content.Context ctx, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs, int defStyleAttr) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.woocommerce.android.widgets.WCEmptyView getEmptyView() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.recyclerview.widget.RecyclerView getOrdersList() {
        return null;
    }
    
    public final void init(@org.jetbrains.annotations.NotNull()
    com.woocommerce.android.util.CurrencyFormatter currencyFormatter, @org.jetbrains.annotations.NotNull()
    com.woocommerce.android.ui.orders.list.OrderListListener orderListListener) {
    }
    
    /**
     * order list adapter method
     * set order status options to the order list adapter
     */
    public final void setOrderStatusOptions(@org.jetbrains.annotations.NotNull()
    java.util.Map<java.lang.String, org.wordpress.android.fluxc.model.WCOrderStatusModel> orderStatusOptions) {
    }
    
    /**
     * Submit new paged list data to the adapter
     */
    public final void submitPagedList(@org.jetbrains.annotations.Nullable()
    androidx.paging.PagedList<com.woocommerce.android.ui.orders.list.OrderListItemUIType> list) {
    }
    
    /**
     * clear order list adapter data
     */
    public final void clearAdapterData() {
    }
    
    /**
     * scroll to the top of the order list
     */
    public final void scrollToTop() {
    }
    
    public final int getCurrentPosition() {
        return 0;
    }
    
    /**
     * save the order list on configuration change
     */
    @org.jetbrains.annotations.Nullable()
    public final android.os.Parcelable onFragmentSavedInstanceState() {
        return null;
    }
    
    /**
     * restore the order list on configuration change
     */
    public final void onFragmentRestoreInstanceState(@org.jetbrains.annotations.NotNull()
    android.os.Parcelable listState) {
    }
    
    public final void setLoadingMoreIndicator(boolean active) {
    }
}