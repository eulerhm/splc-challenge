package com.woocommerce.android.ui.orders.details.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u001e\u001fB0\u0012!\u0010\u0003\u001a\u001d\u0012\u0013\u0012\u00110\u0005\u00a2\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\u0006\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\fJ\b\u0010\u0015\u001a\u00020\u0016H\u0016J\u0018\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u0016H\u0016J\u0018\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0016H\u0016R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R)\u0010\u0003\u001a\u001d\u0012\u0013\u0012\u00110\u0005\u00a2\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R0\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014\u00a8\u0006 "}, d2 = {"Lcom/woocommerce/android/ui/orders/details/adapter/OrderDetailShipmentTrackingListAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/woocommerce/android/ui/orders/details/adapter/OrderDetailShipmentTrackingListAdapter$OrderDetailShipmentTrackingViewHolder;", "onDeleteShipmentTrackingClicked", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "trackingNumber", "", "dateUtils", "Lcom/woocommerce/android/util/DateUtils;", "(Lkotlin/jvm/functions/Function1;Lcom/woocommerce/android/util/DateUtils;)V", "value", "", "Lcom/woocommerce/android/model/OrderShipmentTracking;", "shipmentTrackingList", "getShipmentTrackingList", "()Ljava/util/List;", "setShipmentTrackingList", "(Ljava/util/List;)V", "getItemCount", "", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "itemType", "OrderDetailShipmentTrackingViewHolder", "ShipmentTrackingDiffCallback", "WooCommerce_wasabiDebug"})
public final class OrderDetailShipmentTrackingListAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.woocommerce.android.ui.orders.details.adapter.OrderDetailShipmentTrackingListAdapter.OrderDetailShipmentTrackingViewHolder> {
    private final kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> onDeleteShipmentTrackingClicked = null;
    private final com.woocommerce.android.util.DateUtils dateUtils = null;
    @org.jetbrains.annotations.NotNull
    private java.util.List<com.woocommerce.android.model.OrderShipmentTracking> shipmentTrackingList;
    
    public OrderDetailShipmentTrackingListAdapter(@org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onDeleteShipmentTrackingClicked, @org.jetbrains.annotations.NotNull
    com.woocommerce.android.util.DateUtils dateUtils) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.woocommerce.android.model.OrderShipmentTracking> getShipmentTrackingList() {
        return null;
    }
    
    public final void setShipmentTrackingList(@org.jetbrains.annotations.NotNull
    java.util.List<com.woocommerce.android.model.OrderShipmentTracking> value) {
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public com.woocommerce.android.ui.orders.details.adapter.OrderDetailShipmentTrackingListAdapter.OrderDetailShipmentTrackingViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull
    android.view.ViewGroup parent, int itemType) {
        return null;
    }
    
    @java.lang.Override
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull
    com.woocommerce.android.ui.orders.details.adapter.OrderDetailShipmentTrackingListAdapter.OrderDetailShipmentTrackingViewHolder holder, int position) {
    }
    
    @java.lang.Override
    public int getItemCount() {
        return 0;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B8\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012!\u0010\u0004\u001a\u001d\u0012\u0013\u0012\u00110\u0006\u00a2\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\n0\u0005\u0012\u0006\u0010\u000b\u001a\u00020\f\u00a2\u0006\u0002\u0010\rJ\u000e\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u0010R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R)\u0010\u0004\u001a\u001d\u0012\u0013\u0012\u00110\u0006\u00a2\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\n0\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lcom/woocommerce/android/ui/orders/details/adapter/OrderDetailShipmentTrackingListAdapter$OrderDetailShipmentTrackingViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "viewBinding", "Lcom/woocommerce/android/databinding/OrderDetailShipmentTrackingListItemBinding;", "onDeleteShipmentTrackingClicked", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "trackingNumber", "", "dateUtils", "Lcom/woocommerce/android/util/DateUtils;", "(Lcom/woocommerce/android/databinding/OrderDetailShipmentTrackingListItemBinding;Lkotlin/jvm/functions/Function1;Lcom/woocommerce/android/util/DateUtils;)V", "bind", "shipmentTracking", "Lcom/woocommerce/android/model/OrderShipmentTracking;", "WooCommerce_wasabiDebug"})
    public static final class OrderDetailShipmentTrackingViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final com.woocommerce.android.databinding.OrderDetailShipmentTrackingListItemBinding viewBinding = null;
        private final kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> onDeleteShipmentTrackingClicked = null;
        private final com.woocommerce.android.util.DateUtils dateUtils = null;
        
        public OrderDetailShipmentTrackingViewHolder(@org.jetbrains.annotations.NotNull
        com.woocommerce.android.databinding.OrderDetailShipmentTrackingListItemBinding viewBinding, @org.jetbrains.annotations.NotNull
        kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onDeleteShipmentTrackingClicked, @org.jetbrains.annotations.NotNull
        com.woocommerce.android.util.DateUtils dateUtils) {
            super(null);
        }
        
        public final void bind(@org.jetbrains.annotations.NotNull
        com.woocommerce.android.model.OrderShipmentTracking shipmentTracking) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B!\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\u0002\u0010\u0006J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u0018\u0010\f\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0016J\b\u0010\r\u001a\u00020\nH\u0016J\b\u0010\u000e\u001a\u00020\nH\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lcom/woocommerce/android/ui/orders/details/adapter/OrderDetailShipmentTrackingListAdapter$ShipmentTrackingDiffCallback;", "Landroidx/recyclerview/widget/DiffUtil$Callback;", "oldList", "", "Lcom/woocommerce/android/model/OrderShipmentTracking;", "newList", "(Ljava/util/List;Ljava/util/List;)V", "areContentsTheSame", "", "oldItemPosition", "", "newItemPosition", "areItemsTheSame", "getNewListSize", "getOldListSize", "WooCommerce_wasabiDebug"})
    public static final class ShipmentTrackingDiffCallback extends androidx.recyclerview.widget.DiffUtil.Callback {
        private final java.util.List<com.woocommerce.android.model.OrderShipmentTracking> oldList = null;
        private final java.util.List<com.woocommerce.android.model.OrderShipmentTracking> newList = null;
        
        public ShipmentTrackingDiffCallback(@org.jetbrains.annotations.NotNull
        java.util.List<com.woocommerce.android.model.OrderShipmentTracking> oldList, @org.jetbrains.annotations.NotNull
        java.util.List<com.woocommerce.android.model.OrderShipmentTracking> newList) {
            super();
        }
        
        @java.lang.Override
        public boolean areItemsTheSame(int oldItemPosition, int newItemPosition) {
            return false;
        }
        
        @java.lang.Override
        public int getOldListSize() {
            return 0;
        }
        
        @java.lang.Override
        public int getNewListSize() {
            return 0;
        }
        
        @java.lang.Override
        public boolean areContentsTheSame(int oldItemPosition, int newItemPosition) {
            return false;
        }
    }
}