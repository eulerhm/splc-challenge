package com.woocommerce.android.ui.orders.details.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\"#$B1\u0012\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u00a2\u0006\u0002\u0010\rJ\b\u0010\u0018\u001a\u00020\u0019H\u0016J\u0018\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u0019H\u0016J\u0018\u0010\u001e\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0019H\u0016R\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R0\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006%"}, d2 = {"Lcom/woocommerce/android/ui/orders/details/adapter/OrderDetailShippingLabelsAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/woocommerce/android/ui/orders/details/adapter/OrderDetailShippingLabelsAdapter$ShippingLabelsViewHolder;", "formatCurrencyForDisplay", "Lkotlin/Function1;", "Ljava/math/BigDecimal;", "", "productImageMap", "Lcom/woocommerce/android/tools/ProductImageMap;", "listener", "Lcom/woocommerce/android/ui/orders/details/adapter/OrderDetailShippingLabelsAdapter$OnShippingLabelClickListener;", "productClickListener", "Lcom/woocommerce/android/ui/orders/OrderProductActionListener;", "(Lkotlin/jvm/functions/Function1;Lcom/woocommerce/android/tools/ProductImageMap;Lcom/woocommerce/android/ui/orders/details/adapter/OrderDetailShippingLabelsAdapter$OnShippingLabelClickListener;Lcom/woocommerce/android/ui/orders/OrderProductActionListener;)V", "value", "", "Lcom/woocommerce/android/model/ShippingLabel;", "shippingLabels", "getShippingLabels", "()Ljava/util/List;", "setShippingLabels", "(Ljava/util/List;)V", "viewPool", "Landroidx/recyclerview/widget/RecyclerView$RecycledViewPool;", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "itemType", "OnShippingLabelClickListener", "ShippingLabelDiffCallback", "ShippingLabelsViewHolder", "WooCommerce_vanillaDebug"})
public final class OrderDetailShippingLabelsAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.woocommerce.android.ui.orders.details.adapter.OrderDetailShippingLabelsAdapter.ShippingLabelsViewHolder> {
    private final kotlin.jvm.functions.Function1<java.math.BigDecimal, java.lang.String> formatCurrencyForDisplay = null;
    private final com.woocommerce.android.tools.ProductImageMap productImageMap = null;
    private final com.woocommerce.android.ui.orders.details.adapter.OrderDetailShippingLabelsAdapter.OnShippingLabelClickListener listener = null;
    private final com.woocommerce.android.ui.orders.OrderProductActionListener productClickListener = null;
    private final androidx.recyclerview.widget.RecyclerView.RecycledViewPool viewPool = null;
    @org.jetbrains.annotations.NotNull()
    private java.util.List<com.woocommerce.android.model.ShippingLabel> shippingLabels;
    
    public OrderDetailShippingLabelsAdapter(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.math.BigDecimal, java.lang.String> formatCurrencyForDisplay, @org.jetbrains.annotations.NotNull()
    com.woocommerce.android.tools.ProductImageMap productImageMap, @org.jetbrains.annotations.NotNull()
    com.woocommerce.android.ui.orders.details.adapter.OrderDetailShippingLabelsAdapter.OnShippingLabelClickListener listener, @org.jetbrains.annotations.NotNull()
    com.woocommerce.android.ui.orders.OrderProductActionListener productClickListener) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.woocommerce.android.model.ShippingLabel> getShippingLabels() {
        return null;
    }
    
    public final void setShippingLabels(@org.jetbrains.annotations.NotNull()
    java.util.List<com.woocommerce.android.model.ShippingLabel> value) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.woocommerce.android.ui.orders.details.adapter.OrderDetailShippingLabelsAdapter.ShippingLabelsViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int itemType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.woocommerce.android.ui.orders.details.adapter.OrderDetailShippingLabelsAdapter.ShippingLabelsViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\b"}, d2 = {"Lcom/woocommerce/android/ui/orders/details/adapter/OrderDetailShippingLabelsAdapter$OnShippingLabelClickListener;", "", "onPrintCustomsFormClicked", "", "shippingLabel", "Lcom/woocommerce/android/model/ShippingLabel;", "onPrintShippingLabelClicked", "onRefundRequested", "WooCommerce_vanillaDebug"})
    public static abstract interface OnShippingLabelClickListener {
        
        public abstract void onRefundRequested(@org.jetbrains.annotations.NotNull()
        com.woocommerce.android.model.ShippingLabel shippingLabel);
        
        public abstract void onPrintShippingLabelClicked(@org.jetbrains.annotations.NotNull()
        com.woocommerce.android.model.ShippingLabel shippingLabel);
        
        public abstract void onPrintCustomsFormClicked(@org.jetbrains.annotations.NotNull()
        com.woocommerce.android.model.ShippingLabel shippingLabel);
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u00a2\u0006\u0002\u0010\u0010J\u000e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014J\u0018\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\f\u001a\u00020\rH\u0002R\u001a\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"}, d2 = {"Lcom/woocommerce/android/ui/orders/details/adapter/OrderDetailShippingLabelsAdapter$ShippingLabelsViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "viewBinding", "Lcom/woocommerce/android/databinding/OrderDetailShippingLabelListItemBinding;", "viewPool", "Landroidx/recyclerview/widget/RecyclerView$RecycledViewPool;", "productImageMap", "Lcom/woocommerce/android/tools/ProductImageMap;", "formatCurrencyForDisplay", "Lkotlin/Function1;", "Ljava/math/BigDecimal;", "", "listener", "Lcom/woocommerce/android/ui/orders/details/adapter/OrderDetailShippingLabelsAdapter$OnShippingLabelClickListener;", "productClickListener", "Lcom/woocommerce/android/ui/orders/OrderProductActionListener;", "(Lcom/woocommerce/android/databinding/OrderDetailShippingLabelListItemBinding;Landroidx/recyclerview/widget/RecyclerView$RecycledViewPool;Lcom/woocommerce/android/tools/ProductImageMap;Lkotlin/jvm/functions/Function1;Lcom/woocommerce/android/ui/orders/details/adapter/OrderDetailShippingLabelsAdapter$OnShippingLabelClickListener;Lcom/woocommerce/android/ui/orders/OrderProductActionListener;)V", "bind", "", "shippingLabel", "Lcom/woocommerce/android/model/ShippingLabel;", "showRefundPopup", "WooCommerce_vanillaDebug"})
    public static final class ShippingLabelsViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private com.woocommerce.android.databinding.OrderDetailShippingLabelListItemBinding viewBinding;
        private final androidx.recyclerview.widget.RecyclerView.RecycledViewPool viewPool = null;
        private final com.woocommerce.android.tools.ProductImageMap productImageMap = null;
        private final kotlin.jvm.functions.Function1<java.math.BigDecimal, java.lang.String> formatCurrencyForDisplay = null;
        private final com.woocommerce.android.ui.orders.details.adapter.OrderDetailShippingLabelsAdapter.OnShippingLabelClickListener listener = null;
        private final com.woocommerce.android.ui.orders.OrderProductActionListener productClickListener = null;
        
        public ShippingLabelsViewHolder(@org.jetbrains.annotations.NotNull()
        com.woocommerce.android.databinding.OrderDetailShippingLabelListItemBinding viewBinding, @org.jetbrains.annotations.NotNull()
        androidx.recyclerview.widget.RecyclerView.RecycledViewPool viewPool, @org.jetbrains.annotations.NotNull()
        com.woocommerce.android.tools.ProductImageMap productImageMap, @org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function1<? super java.math.BigDecimal, java.lang.String> formatCurrencyForDisplay, @org.jetbrains.annotations.NotNull()
        com.woocommerce.android.ui.orders.details.adapter.OrderDetailShippingLabelsAdapter.OnShippingLabelClickListener listener, @org.jetbrains.annotations.NotNull()
        com.woocommerce.android.ui.orders.OrderProductActionListener productClickListener) {
            super(null);
        }
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        com.woocommerce.android.model.ShippingLabel shippingLabel) {
        }
        
        private final void showRefundPopup(com.woocommerce.android.model.ShippingLabel shippingLabel, com.woocommerce.android.ui.orders.details.adapter.OrderDetailShippingLabelsAdapter.OnShippingLabelClickListener listener) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B!\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\u0002\u0010\u0006J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u0018\u0010\f\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0016J\b\u0010\r\u001a\u00020\nH\u0016J\b\u0010\u000e\u001a\u00020\nH\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lcom/woocommerce/android/ui/orders/details/adapter/OrderDetailShippingLabelsAdapter$ShippingLabelDiffCallback;", "Landroidx/recyclerview/widget/DiffUtil$Callback;", "oldList", "", "Lcom/woocommerce/android/model/ShippingLabel;", "newList", "(Ljava/util/List;Ljava/util/List;)V", "areContentsTheSame", "", "oldItemPosition", "", "newItemPosition", "areItemsTheSame", "getNewListSize", "getOldListSize", "WooCommerce_vanillaDebug"})
    public static final class ShippingLabelDiffCallback extends androidx.recyclerview.widget.DiffUtil.Callback {
        private final java.util.List<com.woocommerce.android.model.ShippingLabel> oldList = null;
        private final java.util.List<com.woocommerce.android.model.ShippingLabel> newList = null;
        
        public ShippingLabelDiffCallback(@org.jetbrains.annotations.NotNull()
        java.util.List<com.woocommerce.android.model.ShippingLabel> oldList, @org.jetbrains.annotations.NotNull()
        java.util.List<com.woocommerce.android.model.ShippingLabel> newList) {
            super();
        }
        
        @java.lang.Override()
        public boolean areItemsTheSame(int oldItemPosition, int newItemPosition) {
            return false;
        }
        
        @java.lang.Override()
        public int getOldListSize() {
            return 0;
        }
        
        @java.lang.Override()
        public int getNewListSize() {
            return 0;
        }
        
        @java.lang.Override()
        public boolean areContentsTheSame(int oldItemPosition, int newItemPosition) {
            return false;
        }
    }
}