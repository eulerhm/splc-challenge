package com.woocommerce.android.ui.orders.details.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001eBU\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u001c\b\u0002\u0010\u000e\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000f\u0018\u00010\tj\u0004\u0018\u0001`\u0010\u00a2\u0006\u0002\u0010\u0011J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\u000e\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u0016J\u0018\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u0013H\u0016J\u0018\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0013H\u0016R\u001a\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\"\u0010\u000e\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000f\u0018\u00010\tj\u0004\u0018\u0001`\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001f"}, d2 = {"Lcom/woocommerce/android/ui/orders/details/adapter/OrderDetailProductListAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/woocommerce/android/ui/orders/details/adapter/OrderDetailProductListAdapter$ViewHolder;", "orderItems", "", "Lcom/woocommerce/android/model/Order$Item;", "productImageMap", "Lcom/woocommerce/android/tools/ProductImageMap;", "formatCurrencyForDisplay", "Lkotlin/Function1;", "Ljava/math/BigDecimal;", "", "productItemListener", "Lcom/woocommerce/android/ui/orders/OrderProductActionListener;", "onViewAddonsClick", "", "Lcom/woocommerce/android/ui/orders/ViewAddonClickListener;", "(Ljava/util/List;Lcom/woocommerce/android/tools/ProductImageMap;Lkotlin/jvm/functions/Function1;Lcom/woocommerce/android/ui/orders/OrderProductActionListener;Lkotlin/jvm/functions/Function1;)V", "getItemCount", "", "notifyProductChanged", "productId", "", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "ViewHolder", "WooCommerce_vanillaDebug"})
public final class OrderDetailProductListAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.woocommerce.android.ui.orders.details.adapter.OrderDetailProductListAdapter.ViewHolder> {
    private final java.util.List<com.woocommerce.android.model.Order.Item> orderItems = null;
    private final com.woocommerce.android.tools.ProductImageMap productImageMap = null;
    private final kotlin.jvm.functions.Function1<java.math.BigDecimal, java.lang.String> formatCurrencyForDisplay = null;
    private final com.woocommerce.android.ui.orders.OrderProductActionListener productItemListener = null;
    private final kotlin.jvm.functions.Function1<com.woocommerce.android.model.Order.Item, kotlin.Unit> onViewAddonsClick = null;
    
    public OrderDetailProductListAdapter(@org.jetbrains.annotations.NotNull()
    java.util.List<com.woocommerce.android.model.Order.Item> orderItems, @org.jetbrains.annotations.NotNull()
    com.woocommerce.android.tools.ProductImageMap productImageMap, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.math.BigDecimal, java.lang.String> formatCurrencyForDisplay, @org.jetbrains.annotations.NotNull()
    com.woocommerce.android.ui.orders.OrderProductActionListener productItemListener, @org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function1<? super com.woocommerce.android.model.Order.Item, kotlin.Unit> onViewAddonsClick) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.woocommerce.android.ui.orders.details.adapter.OrderDetailProductListAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.woocommerce.android.ui.orders.details.adapter.OrderDetailProductListAdapter.ViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    public final void notifyProductChanged(long productId) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/woocommerce/android/ui/orders/details/adapter/OrderDetailProductListAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Lcom/woocommerce/android/ui/orders/OrderDetailProductItemView;", "(Lcom/woocommerce/android/ui/orders/OrderDetailProductItemView;)V", "getView", "()Lcom/woocommerce/android/ui/orders/OrderDetailProductItemView;", "WooCommerce_vanillaDebug"})
    public static final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final com.woocommerce.android.ui.orders.OrderDetailProductItemView view = null;
        
        public ViewHolder(@org.jetbrains.annotations.NotNull()
        com.woocommerce.android.ui.orders.OrderDetailProductItemView view) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.woocommerce.android.ui.orders.OrderDetailProductItemView getView() {
            return null;
        }
    }
}