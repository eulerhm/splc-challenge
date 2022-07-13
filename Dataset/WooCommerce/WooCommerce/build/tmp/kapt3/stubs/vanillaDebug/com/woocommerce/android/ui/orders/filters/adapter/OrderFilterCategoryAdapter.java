package com.woocommerce.android.ui.orders.filters.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u0012\u0013B\u0019\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\u0002\u0010\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0018\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0018\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u000bH\u0016R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lcom/woocommerce/android/ui/orders/filters/adapter/OrderFilterCategoryAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "Lcom/woocommerce/android/ui/orders/filters/model/OrderFilterCategoryUiModel;", "Lcom/woocommerce/android/ui/orders/filters/adapter/OrderFilterCategoryAdapter$OrderFilterCategoryViewHolder;", "onFilterCategoryClicked", "Lkotlin/Function1;", "", "(Lkotlin/jvm/functions/Function1;)V", "getItemId", "", "position", "", "onBindViewHolder", "holderCategory", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "OrderFilterCategoryDiffCallBack", "OrderFilterCategoryViewHolder", "WooCommerce_vanillaDebug"})
public final class OrderFilterCategoryAdapter extends androidx.recyclerview.widget.ListAdapter<com.woocommerce.android.ui.orders.filters.model.OrderFilterCategoryUiModel, com.woocommerce.android.ui.orders.filters.adapter.OrderFilterCategoryAdapter.OrderFilterCategoryViewHolder> {
    private final kotlin.jvm.functions.Function1<com.woocommerce.android.ui.orders.filters.model.OrderFilterCategoryUiModel, kotlin.Unit> onFilterCategoryClicked = null;
    
    public OrderFilterCategoryAdapter(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.woocommerce.android.ui.orders.filters.model.OrderFilterCategoryUiModel, kotlin.Unit> onFilterCategoryClicked) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.woocommerce.android.ui.orders.filters.adapter.OrderFilterCategoryAdapter.OrderFilterCategoryViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.woocommerce.android.ui.orders.filters.adapter.OrderFilterCategoryAdapter.OrderFilterCategoryViewHolder holderCategory, int position) {
    }
    
    @java.lang.Override()
    public long getItemId(int position) {
        return 0L;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u000b"}, d2 = {"Lcom/woocommerce/android/ui/orders/filters/adapter/OrderFilterCategoryAdapter$OrderFilterCategoryViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "viewBinding", "Lcom/woocommerce/android/databinding/FilterListItemBinding;", "(Lcom/woocommerce/android/databinding/FilterListItemBinding;)V", "getViewBinding", "()Lcom/woocommerce/android/databinding/FilterListItemBinding;", "bind", "", "filter", "Lcom/woocommerce/android/ui/orders/filters/model/OrderFilterCategoryUiModel;", "WooCommerce_vanillaDebug"})
    public static final class OrderFilterCategoryViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final com.woocommerce.android.databinding.FilterListItemBinding viewBinding = null;
        
        public OrderFilterCategoryViewHolder(@org.jetbrains.annotations.NotNull()
        com.woocommerce.android.databinding.FilterListItemBinding viewBinding) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.woocommerce.android.databinding.FilterListItemBinding getViewBinding() {
            return null;
        }
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        com.woocommerce.android.ui.orders.filters.model.OrderFilterCategoryUiModel filter) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u00c6\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\u0018\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016\u00a8\u0006\t"}, d2 = {"Lcom/woocommerce/android/ui/orders/filters/adapter/OrderFilterCategoryAdapter$OrderFilterCategoryDiffCallBack;", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Lcom/woocommerce/android/ui/orders/filters/model/OrderFilterCategoryUiModel;", "()V", "areContentsTheSame", "", "oldUiItemCategory", "newUiItemCategory", "areItemsTheSame", "WooCommerce_vanillaDebug"})
    public static final class OrderFilterCategoryDiffCallBack extends androidx.recyclerview.widget.DiffUtil.ItemCallback<com.woocommerce.android.ui.orders.filters.model.OrderFilterCategoryUiModel> {
        @org.jetbrains.annotations.NotNull()
        public static final com.woocommerce.android.ui.orders.filters.adapter.OrderFilterCategoryAdapter.OrderFilterCategoryDiffCallBack INSTANCE = null;
        
        private OrderFilterCategoryDiffCallBack() {
            super();
        }
        
        @java.lang.Override()
        public boolean areItemsTheSame(@org.jetbrains.annotations.NotNull()
        com.woocommerce.android.ui.orders.filters.model.OrderFilterCategoryUiModel oldUiItemCategory, @org.jetbrains.annotations.NotNull()
        com.woocommerce.android.ui.orders.filters.model.OrderFilterCategoryUiModel newUiItemCategory) {
            return false;
        }
        
        @java.lang.Override()
        public boolean areContentsTheSame(@org.jetbrains.annotations.NotNull()
        com.woocommerce.android.ui.orders.filters.model.OrderFilterCategoryUiModel oldUiItemCategory, @org.jetbrains.annotations.NotNull()
        com.woocommerce.android.ui.orders.filters.model.OrderFilterCategoryUiModel newUiItemCategory) {
            return false;
        }
    }
}