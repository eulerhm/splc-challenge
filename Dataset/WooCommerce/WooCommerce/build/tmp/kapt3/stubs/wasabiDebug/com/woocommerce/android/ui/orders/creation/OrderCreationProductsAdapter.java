package com.woocommerce.android.ui.orders.creation;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0003R\u00020\u00000\u0001:\u0002\u001f BS\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00070\u0005\u0012\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00070\u0005\u00a2\u0006\u0002\u0010\u000fJ\u001c\u0010\u0017\u001a\u00020\u00072\n\u0010\u0018\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\u001c\u0010\u001b\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001aH\u0016R$\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u0011@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00070\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00070\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006!"}, d2 = {"Lcom/woocommerce/android/ui/orders/creation/OrderCreationProductsAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "Lcom/woocommerce/android/ui/orders/creation/ProductUIModel;", "Lcom/woocommerce/android/ui/orders/creation/OrderCreationProductsAdapter$ProductViewHolder;", "onProductClicked", "Lkotlin/Function1;", "Lcom/woocommerce/android/model/Order$Item;", "", "currencyFormatter", "Lcom/woocommerce/android/util/CurrencyFormatter;", "currencyCode", "", "onIncreaseQuantity", "", "onDecreaseQuantity", "(Lkotlin/jvm/functions/Function1;Lcom/woocommerce/android/util/CurrencyFormatter;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "value", "", "areProductsEditable", "getAreProductsEditable", "()Z", "setAreProductsEditable", "(Z)V", "onBindViewHolder", "holder", "position", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "ProductUIModelDiffCallback", "ProductViewHolder", "WooCommerce_wasabiDebug"})
public final class OrderCreationProductsAdapter extends androidx.recyclerview.widget.ListAdapter<com.woocommerce.android.ui.orders.creation.ProductUIModel, com.woocommerce.android.ui.orders.creation.OrderCreationProductsAdapter.ProductViewHolder> {
    private final kotlin.jvm.functions.Function1<com.woocommerce.android.model.Order.Item, kotlin.Unit> onProductClicked = null;
    private final com.woocommerce.android.util.CurrencyFormatter currencyFormatter = null;
    private final java.lang.String currencyCode = null;
    private final kotlin.jvm.functions.Function1<java.lang.Long, kotlin.Unit> onIncreaseQuantity = null;
    private final kotlin.jvm.functions.Function1<java.lang.Long, kotlin.Unit> onDecreaseQuantity = null;
    private boolean areProductsEditable = false;
    
    public OrderCreationProductsAdapter(@org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super com.woocommerce.android.model.Order.Item, kotlin.Unit> onProductClicked, @org.jetbrains.annotations.NotNull
    com.woocommerce.android.util.CurrencyFormatter currencyFormatter, @org.jetbrains.annotations.Nullable
    java.lang.String currencyCode, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super java.lang.Long, kotlin.Unit> onIncreaseQuantity, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super java.lang.Long, kotlin.Unit> onDecreaseQuantity) {
        super(null);
    }
    
    public final boolean getAreProductsEditable() {
        return false;
    }
    
    public final void setAreProductsEditable(boolean value) {
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public com.woocommerce.android.ui.orders.creation.OrderCreationProductsAdapter.ProductViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull
    com.woocommerce.android.ui.orders.creation.OrderCreationProductsAdapter.ProductViewHolder holder, int position) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00068BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\r"}, d2 = {"Lcom/woocommerce/android/ui/orders/creation/OrderCreationProductsAdapter$ProductViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/woocommerce/android/databinding/OrderCreationProductItemBinding;", "(Lcom/woocommerce/android/ui/orders/creation/OrderCreationProductsAdapter;Lcom/woocommerce/android/databinding/OrderCreationProductItemBinding;)V", "safePosition", "", "getSafePosition", "()Ljava/lang/Integer;", "bind", "", "productModel", "Lcom/woocommerce/android/ui/orders/creation/ProductUIModel;", "WooCommerce_wasabiDebug"})
    public final class ProductViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final com.woocommerce.android.databinding.OrderCreationProductItemBinding binding = null;
        
        public ProductViewHolder(@org.jetbrains.annotations.NotNull
        com.woocommerce.android.databinding.OrderCreationProductItemBinding binding) {
            super(null);
        }
        
        private final java.lang.Integer getSafePosition() {
            return null;
        }
        
        public final void bind(@org.jetbrains.annotations.NotNull
        com.woocommerce.android.ui.orders.creation.ProductUIModel productModel) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u00c6\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\u0018\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016\u00a8\u0006\t"}, d2 = {"Lcom/woocommerce/android/ui/orders/creation/OrderCreationProductsAdapter$ProductUIModelDiffCallback;", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Lcom/woocommerce/android/ui/orders/creation/ProductUIModel;", "()V", "areContentsTheSame", "", "oldItem", "newItem", "areItemsTheSame", "WooCommerce_wasabiDebug"})
    public static final class ProductUIModelDiffCallback extends androidx.recyclerview.widget.DiffUtil.ItemCallback<com.woocommerce.android.ui.orders.creation.ProductUIModel> {
        @org.jetbrains.annotations.NotNull
        public static final com.woocommerce.android.ui.orders.creation.OrderCreationProductsAdapter.ProductUIModelDiffCallback INSTANCE = null;
        
        private ProductUIModelDiffCallback() {
            super();
        }
        
        @java.lang.Override
        public boolean areItemsTheSame(@org.jetbrains.annotations.NotNull
        com.woocommerce.android.ui.orders.creation.ProductUIModel oldItem, @org.jetbrains.annotations.NotNull
        com.woocommerce.android.ui.orders.creation.ProductUIModel newItem) {
            return false;
        }
        
        @java.lang.Override
        public boolean areContentsTheSame(@org.jetbrains.annotations.NotNull
        com.woocommerce.android.ui.orders.creation.ProductUIModel oldItem, @org.jetbrains.annotations.NotNull
        com.woocommerce.android.ui.orders.creation.ProductUIModel newItem) {
            return false;
        }
    }
}