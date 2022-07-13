package com.woocommerce.android.ui.orders.details.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u001d\u001eB)\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00060\b\u00a2\u0006\u0002\u0010\nJ\b\u0010\u0013\u001a\u00020\u0014H\u0016J\u0018\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0014H\u0016J\u0018\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0014H\u0016R\u001a\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00060\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R0\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012\u00a8\u0006\u001f"}, d2 = {"Lcom/woocommerce/android/ui/orders/details/adapter/OrderDetailRefundsAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/woocommerce/android/ui/orders/details/adapter/OrderDetailRefundsAdapter$ViewHolder;", "isCashPayment", "", "paymentMethodTitle", "", "formatCurrency", "Lkotlin/Function1;", "Ljava/math/BigDecimal;", "(ZLjava/lang/String;Lkotlin/jvm/functions/Function1;)V", "value", "", "Lcom/woocommerce/android/model/Refund;", "refundList", "getRefundList", "()Ljava/util/List;", "setRefundList", "(Ljava/util/List;)V", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "itemType", "RefundModelDiffCallback", "ViewHolder", "WooCommerce_wasabiDebug"})
public final class OrderDetailRefundsAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.woocommerce.android.ui.orders.details.adapter.OrderDetailRefundsAdapter.ViewHolder> {
    private final boolean isCashPayment = false;
    private final java.lang.String paymentMethodTitle = null;
    private final kotlin.jvm.functions.Function1<java.math.BigDecimal, java.lang.String> formatCurrency = null;
    @org.jetbrains.annotations.NotNull
    private java.util.List<com.woocommerce.android.model.Refund> refundList;
    
    public OrderDetailRefundsAdapter(boolean isCashPayment, @org.jetbrains.annotations.NotNull
    java.lang.String paymentMethodTitle, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super java.math.BigDecimal, java.lang.String> formatCurrency) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.woocommerce.android.model.Refund> getRefundList() {
        return null;
    }
    
    public final void setRefundList(@org.jetbrains.annotations.NotNull
    java.util.List<com.woocommerce.android.model.Refund> value) {
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public com.woocommerce.android.ui.orders.details.adapter.OrderDetailRefundsAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull
    android.view.ViewGroup parent, int itemType) {
        return null;
    }
    
    @java.lang.Override
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull
    com.woocommerce.android.ui.orders.details.adapter.OrderDetailRefundsAdapter.ViewHolder holder, int position) {
    }
    
    @java.lang.Override
    public int getItemCount() {
        return 0;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00070\t\u00a2\u0006\u0002\u0010\u000bJ\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fR\u001a\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00070\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lcom/woocommerce/android/ui/orders/details/adapter/OrderDetailRefundsAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "viewBinding", "Lcom/woocommerce/android/databinding/OrderDetailRefundPaymentItemBinding;", "isCashPayment", "", "paymentMethodTitle", "", "formatCurrency", "Lkotlin/Function1;", "Ljava/math/BigDecimal;", "(Lcom/woocommerce/android/databinding/OrderDetailRefundPaymentItemBinding;ZLjava/lang/String;Lkotlin/jvm/functions/Function1;)V", "bind", "", "refund", "Lcom/woocommerce/android/model/Refund;", "WooCommerce_wasabiDebug"})
    public static final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final com.woocommerce.android.databinding.OrderDetailRefundPaymentItemBinding viewBinding = null;
        private final boolean isCashPayment = false;
        private final java.lang.String paymentMethodTitle = null;
        private final kotlin.jvm.functions.Function1<java.math.BigDecimal, java.lang.String> formatCurrency = null;
        
        public ViewHolder(@org.jetbrains.annotations.NotNull
        com.woocommerce.android.databinding.OrderDetailRefundPaymentItemBinding viewBinding, boolean isCashPayment, @org.jetbrains.annotations.NotNull
        java.lang.String paymentMethodTitle, @org.jetbrains.annotations.NotNull
        kotlin.jvm.functions.Function1<? super java.math.BigDecimal, java.lang.String> formatCurrency) {
            super(null);
        }
        
        public final void bind(@org.jetbrains.annotations.NotNull
        com.woocommerce.android.model.Refund refund) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B!\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\u0002\u0010\u0006J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u0018\u0010\f\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0016J\b\u0010\r\u001a\u00020\nH\u0016J\b\u0010\u000e\u001a\u00020\nH\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lcom/woocommerce/android/ui/orders/details/adapter/OrderDetailRefundsAdapter$RefundModelDiffCallback;", "Landroidx/recyclerview/widget/DiffUtil$Callback;", "oldList", "", "Lcom/woocommerce/android/model/Refund;", "newList", "(Ljava/util/List;Ljava/util/List;)V", "areContentsTheSame", "", "oldItemPosition", "", "newItemPosition", "areItemsTheSame", "getNewListSize", "getOldListSize", "WooCommerce_wasabiDebug"})
    public static final class RefundModelDiffCallback extends androidx.recyclerview.widget.DiffUtil.Callback {
        private final java.util.List<com.woocommerce.android.model.Refund> oldList = null;
        private final java.util.List<com.woocommerce.android.model.Refund> newList = null;
        
        public RefundModelDiffCallback(@org.jetbrains.annotations.NotNull
        java.util.List<com.woocommerce.android.model.Refund> oldList, @org.jetbrains.annotations.NotNull
        java.util.List<com.woocommerce.android.model.Refund> newList) {
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