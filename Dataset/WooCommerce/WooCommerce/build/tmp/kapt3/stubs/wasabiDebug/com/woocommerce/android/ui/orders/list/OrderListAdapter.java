package com.woocommerce.android.ui.orders.list;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 %2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0004%&\'(B\u0015\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u001a\u0010\u0015\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u000bH\u0002J\u0010\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001aH\u0016J\u0018\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u001aH\u0016J\u0018\u0010\u001f\u001a\u00020\u00032\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u001aH\u0016J\u001a\u0010#\u001a\u00020\u001d2\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\nR&\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014\u00a8\u0006)"}, d2 = {"Lcom/woocommerce/android/ui/orders/list/OrderListAdapter;", "Landroidx/paging/PagedListAdapter;", "Lcom/woocommerce/android/ui/orders/list/OrderListItemUIType;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "listener", "Lcom/woocommerce/android/ui/orders/list/OrderListListener;", "currencyFormatter", "Lcom/woocommerce/android/util/CurrencyFormatter;", "(Lcom/woocommerce/android/ui/orders/list/OrderListListener;Lcom/woocommerce/android/util/CurrencyFormatter;)V", "activeOrderStatusMap", "", "", "Lorg/wordpress/android/fluxc/model/WCOrderStatusModel;", "getActiveOrderStatusMap", "()Ljava/util/Map;", "setActiveOrderStatusMap", "(Ljava/util/Map;)V", "getCurrencyFormatter", "()Lcom/woocommerce/android/util/CurrencyFormatter;", "getListener", "()Lcom/woocommerce/android/ui/orders/list/OrderListListener;", "getFormattedOrderDate", "context", "Landroid/content/Context;", "orderDate", "getItemViewType", "", "position", "onBindViewHolder", "", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setOrderStatusOptions", "orderStatusOptions", "Companion", "LoadingViewHolder", "OrderItemUIViewHolder", "SectionHeaderViewHolder", "WooCommerce_wasabiDebug"})
public final class OrderListAdapter extends androidx.paging.PagedListAdapter<com.woocommerce.android.ui.orders.list.OrderListItemUIType, androidx.recyclerview.widget.RecyclerView.ViewHolder> {
    @org.jetbrains.annotations.NotNull
    private final com.woocommerce.android.ui.orders.list.OrderListListener listener = null;
    @org.jetbrains.annotations.NotNull
    private final com.woocommerce.android.util.CurrencyFormatter currencyFormatter = null;
    @org.jetbrains.annotations.NotNull
    public static final com.woocommerce.android.ui.orders.list.OrderListAdapter.Companion Companion = null;
    private static final int VIEW_TYPE_ORDER_ITEM = 0;
    private static final int VIEW_TYPE_SECTION_HEADER = 2;
    private static final int VIEW_TYPE_LOADING = 1;
    @org.jetbrains.annotations.NotNull
    private java.util.Map<java.lang.String, org.wordpress.android.fluxc.model.WCOrderStatusModel> activeOrderStatusMap;
    
    public OrderListAdapter(@org.jetbrains.annotations.NotNull
    com.woocommerce.android.ui.orders.list.OrderListListener listener, @org.jetbrains.annotations.NotNull
    com.woocommerce.android.util.CurrencyFormatter currencyFormatter) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.woocommerce.android.ui.orders.list.OrderListListener getListener() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.woocommerce.android.util.CurrencyFormatter getCurrencyFormatter() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.Map<java.lang.String, org.wordpress.android.fluxc.model.WCOrderStatusModel> getActiveOrderStatusMap() {
        return null;
    }
    
    public final void setActiveOrderStatusMap(@org.jetbrains.annotations.NotNull
    java.util.Map<java.lang.String, org.wordpress.android.fluxc.model.WCOrderStatusModel> p0) {
    }
    
    @java.lang.Override
    public int getItemViewType(int position) {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public androidx.recyclerview.widget.RecyclerView.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull
    androidx.recyclerview.widget.RecyclerView.ViewHolder holder, int position) {
    }
    
    public final void setOrderStatusOptions(@org.jetbrains.annotations.NotNull
    java.util.Map<java.lang.String, org.wordpress.android.fluxc.model.WCOrderStatusModel> orderStatusOptions) {
    }
    
    /**
     * Returns the order date formatted as a date string, or null if the date is missing or invalid.
     * Note that the year is not shown when it's the same as the current one
     */
    private final java.lang.String getFormattedOrderDate(android.content.Context context, java.lang.String orderDate) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002J\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eJ\u001c\u0010\u000f\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\n2\n\u0010\u0010\u001a\u00060\u0000R\u00020\u0011H\u0002R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0012"}, d2 = {"Lcom/woocommerce/android/ui/orders/list/OrderListAdapter$OrderItemUIViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "viewBinding", "Lcom/woocommerce/android/databinding/OrderListItemBinding;", "(Lcom/woocommerce/android/ui/orders/list/OrderListAdapter;Lcom/woocommerce/android/databinding/OrderListItemBinding;)V", "getViewBinding", "()Lcom/woocommerce/android/databinding/OrderListItemBinding;", "createTempOrderStatus", "Lorg/wordpress/android/fluxc/model/WCOrderStatusModel;", "status", "", "onBind", "", "orderItemUI", "Lcom/woocommerce/android/ui/orders/list/OrderListItemUIType$OrderListItemUI;", "processTagView", "holder", "Lcom/woocommerce/android/ui/orders/list/OrderListAdapter;", "WooCommerce_wasabiDebug"})
    final class OrderItemUIViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull
        private final com.woocommerce.android.databinding.OrderListItemBinding viewBinding = null;
        
        public OrderItemUIViewHolder(@org.jetbrains.annotations.NotNull
        com.woocommerce.android.databinding.OrderListItemBinding viewBinding) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.woocommerce.android.databinding.OrderListItemBinding getViewBinding() {
            return null;
        }
        
        public final void onBind(@org.jetbrains.annotations.NotNull
        com.woocommerce.android.ui.orders.list.OrderListItemUIType.OrderListItemUI orderItemUI) {
        }
        
        /**
         * Converts the order status label into an [OrderStatusTag], creates the associated [TagView],
         * and add it to the holder. No need to trim the label text since this is done in [OrderStatusTag]
         */
        private final void processTagView(java.lang.String status, com.woocommerce.android.ui.orders.list.OrderListAdapter.OrderItemUIViewHolder holder) {
        }
        
        private final org.wordpress.android.fluxc.model.WCOrderStatusModel createTempOrderStatus(java.lang.String status) {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/woocommerce/android/ui/orders/list/OrderListAdapter$LoadingViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "(Landroid/view/View;)V", "WooCommerce_wasabiDebug"})
    static final class LoadingViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        
        public LoadingViewHolder(@org.jetbrains.annotations.NotNull
        android.view.View view) {
            super(null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u000b"}, d2 = {"Lcom/woocommerce/android/ui/orders/list/OrderListAdapter$SectionHeaderViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "viewBinding", "Lcom/woocommerce/android/databinding/OrderListHeaderBinding;", "(Lcom/woocommerce/android/databinding/OrderListHeaderBinding;)V", "getViewBinding", "()Lcom/woocommerce/android/databinding/OrderListHeaderBinding;", "onBind", "", "header", "Lcom/woocommerce/android/ui/orders/list/OrderListItemUIType$SectionHeader;", "WooCommerce_wasabiDebug"})
    static final class SectionHeaderViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull
        private final com.woocommerce.android.databinding.OrderListHeaderBinding viewBinding = null;
        
        public SectionHeaderViewHolder(@org.jetbrains.annotations.NotNull
        com.woocommerce.android.databinding.OrderListHeaderBinding viewBinding) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.woocommerce.android.databinding.OrderListHeaderBinding getViewBinding() {
            return null;
        }
        
        public final void onBind(@org.jetbrains.annotations.NotNull
        com.woocommerce.android.ui.orders.list.OrderListItemUIType.SectionHeader header) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"}, d2 = {"Lcom/woocommerce/android/ui/orders/list/OrderListAdapter$Companion;", "", "()V", "VIEW_TYPE_LOADING", "", "VIEW_TYPE_ORDER_ITEM", "VIEW_TYPE_SECTION_HEADER", "WooCommerce_wasabiDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}