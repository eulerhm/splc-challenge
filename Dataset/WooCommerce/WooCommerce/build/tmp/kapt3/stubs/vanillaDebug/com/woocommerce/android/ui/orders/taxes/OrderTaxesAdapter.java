package com.woocommerce.android.ui.orders.taxes;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u0014\u0015B\u0015\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0018\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\fH\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"}, d2 = {"Lcom/woocommerce/android/ui/orders/taxes/OrderTaxesAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "Lcom/woocommerce/android/model/Order$TaxLine;", "Lcom/woocommerce/android/ui/orders/taxes/OrderTaxesAdapter$ViewHolder;", "currencyFormatter", "Lcom/woocommerce/android/util/CurrencyFormatter;", "currencyCode", "", "(Lcom/woocommerce/android/util/CurrencyFormatter;Ljava/lang/String;)V", "getItemId", "", "position", "", "onBindViewHolder", "", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "TaxLineDiffCallBack", "ViewHolder", "WooCommerce_vanillaDebug"})
public final class OrderTaxesAdapter extends androidx.recyclerview.widget.ListAdapter<com.woocommerce.android.model.Order.TaxLine, com.woocommerce.android.ui.orders.taxes.OrderTaxesAdapter.ViewHolder> {
    private final com.woocommerce.android.util.CurrencyFormatter currencyFormatter = null;
    private final java.lang.String currencyCode = null;
    
    public OrderTaxesAdapter(@org.jetbrains.annotations.NotNull()
    com.woocommerce.android.util.CurrencyFormatter currencyFormatter, @org.jetbrains.annotations.NotNull()
    java.lang.String currencyCode) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.woocommerce.android.ui.orders.taxes.OrderTaxesAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.woocommerce.android.ui.orders.taxes.OrderTaxesAdapter.ViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public long getItemId(int position) {
        return 0L;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lcom/woocommerce/android/ui/orders/taxes/OrderTaxesAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "viewBinding", "Lcom/woocommerce/android/databinding/OrderTaxItemBinding;", "currencyFormatter", "Lcom/woocommerce/android/util/CurrencyFormatter;", "currencyCode", "", "(Lcom/woocommerce/android/databinding/OrderTaxItemBinding;Lcom/woocommerce/android/util/CurrencyFormatter;Ljava/lang/String;)V", "bind", "", "tax", "Lcom/woocommerce/android/model/Order$TaxLine;", "WooCommerce_vanillaDebug"})
    public static final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final com.woocommerce.android.databinding.OrderTaxItemBinding viewBinding = null;
        private final com.woocommerce.android.util.CurrencyFormatter currencyFormatter = null;
        private final java.lang.String currencyCode = null;
        
        public ViewHolder(@org.jetbrains.annotations.NotNull()
        com.woocommerce.android.databinding.OrderTaxItemBinding viewBinding, @org.jetbrains.annotations.NotNull()
        com.woocommerce.android.util.CurrencyFormatter currencyFormatter, @org.jetbrains.annotations.NotNull()
        java.lang.String currencyCode) {
            super(null);
        }
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        com.woocommerce.android.model.Order.TaxLine tax) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u00c6\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\u0018\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016\u00a8\u0006\t"}, d2 = {"Lcom/woocommerce/android/ui/orders/taxes/OrderTaxesAdapter$TaxLineDiffCallBack;", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Lcom/woocommerce/android/model/Order$TaxLine;", "()V", "areContentsTheSame", "", "oldItem", "newItem", "areItemsTheSame", "WooCommerce_vanillaDebug"})
    public static final class TaxLineDiffCallBack extends androidx.recyclerview.widget.DiffUtil.ItemCallback<com.woocommerce.android.model.Order.TaxLine> {
        @org.jetbrains.annotations.NotNull()
        public static final com.woocommerce.android.ui.orders.taxes.OrderTaxesAdapter.TaxLineDiffCallBack INSTANCE = null;
        
        private TaxLineDiffCallBack() {
            super();
        }
        
        @java.lang.Override()
        public boolean areItemsTheSame(@org.jetbrains.annotations.NotNull()
        com.woocommerce.android.model.Order.TaxLine oldItem, @org.jetbrains.annotations.NotNull()
        com.woocommerce.android.model.Order.TaxLine newItem) {
            return false;
        }
        
        @java.lang.Override()
        public boolean areContentsTheSame(@org.jetbrains.annotations.NotNull()
        com.woocommerce.android.model.Order.TaxLine oldItem, @org.jetbrains.annotations.NotNull()
        com.woocommerce.android.model.Order.TaxLine newItem) {
            return false;
        }
    }
}