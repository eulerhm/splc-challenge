package com.woocommerce.android.ui.products;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u001a\u001b\u001cB\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u000fH\u0016J\u0018\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u000fH\u0016J\u0018\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u000fH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R0\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r\u00a8\u0006\u001d"}, d2 = {"Lcom/woocommerce/android/ui/products/ProductFilterListAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/woocommerce/android/ui/products/ProductFilterListAdapter$ProductFilterViewHolder;", "clickListener", "Lcom/woocommerce/android/ui/products/ProductFilterListAdapter$OnProductFilterClickListener;", "(Lcom/woocommerce/android/ui/products/ProductFilterListAdapter$OnProductFilterClickListener;)V", "value", "", "Lcom/woocommerce/android/ui/products/ProductFilterListViewModel$FilterListItemUiModel;", "filterList", "getFilterList", "()Ljava/util/List;", "setFilterList", "(Ljava/util/List;)V", "getItemCount", "", "getItemId", "", "position", "onBindViewHolder", "", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "OnProductFilterClickListener", "ProductFilterDiffUtil", "ProductFilterViewHolder", "WooCommerce_wasabiDebug"})
public final class ProductFilterListAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.woocommerce.android.ui.products.ProductFilterListAdapter.ProductFilterViewHolder> {
    private final com.woocommerce.android.ui.products.ProductFilterListAdapter.OnProductFilterClickListener clickListener = null;
    @org.jetbrains.annotations.NotNull
    private java.util.List<com.woocommerce.android.ui.products.ProductFilterListViewModel.FilterListItemUiModel> filterList;
    
    public ProductFilterListAdapter(@org.jetbrains.annotations.NotNull
    com.woocommerce.android.ui.products.ProductFilterListAdapter.OnProductFilterClickListener clickListener) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.woocommerce.android.ui.products.ProductFilterListViewModel.FilterListItemUiModel> getFilterList() {
        return null;
    }
    
    public final void setFilterList(@org.jetbrains.annotations.NotNull
    java.util.List<com.woocommerce.android.ui.products.ProductFilterListViewModel.FilterListItemUiModel> value) {
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public com.woocommerce.android.ui.products.ProductFilterListAdapter.ProductFilterViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull
    com.woocommerce.android.ui.products.ProductFilterListAdapter.ProductFilterViewHolder holder, int position) {
    }
    
    @java.lang.Override
    public long getItemId(int position) {
        return 0L;
    }
    
    @java.lang.Override
    public int getItemCount() {
        return 0;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/woocommerce/android/ui/products/ProductFilterListAdapter$OnProductFilterClickListener;", "", "onProductFilterClick", "", "selectedFilterPosition", "", "WooCommerce_wasabiDebug"})
    public static abstract interface OnProductFilterClickListener {
        
        public abstract void onProductFilterClick(int selectedFilterPosition);
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u000b"}, d2 = {"Lcom/woocommerce/android/ui/products/ProductFilterListAdapter$ProductFilterViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "viewBinding", "Lcom/woocommerce/android/databinding/FilterListItemBinding;", "(Lcom/woocommerce/android/databinding/FilterListItemBinding;)V", "getViewBinding", "()Lcom/woocommerce/android/databinding/FilterListItemBinding;", "bind", "", "filter", "Lcom/woocommerce/android/ui/products/ProductFilterListViewModel$FilterListItemUiModel;", "WooCommerce_wasabiDebug"})
    public static final class ProductFilterViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull
        private final com.woocommerce.android.databinding.FilterListItemBinding viewBinding = null;
        
        public ProductFilterViewHolder(@org.jetbrains.annotations.NotNull
        com.woocommerce.android.databinding.FilterListItemBinding viewBinding) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.woocommerce.android.databinding.FilterListItemBinding getViewBinding() {
            return null;
        }
        
        public final void bind(@org.jetbrains.annotations.NotNull
        com.woocommerce.android.ui.products.ProductFilterListViewModel.FilterListItemUiModel filter) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B!\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\u0002\u0010\u0006J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0016J\u0018\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0016J\b\u0010\u0010\u001a\u00020\rH\u0016J\b\u0010\u0011\u001a\u00020\rH\u0016R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b\u00a8\u0006\u0012"}, d2 = {"Lcom/woocommerce/android/ui/products/ProductFilterListAdapter$ProductFilterDiffUtil;", "Landroidx/recyclerview/widget/DiffUtil$Callback;", "oldList", "", "Lcom/woocommerce/android/ui/products/ProductFilterListViewModel$FilterListItemUiModel;", "newList", "(Ljava/util/List;Ljava/util/List;)V", "getNewList", "()Ljava/util/List;", "getOldList", "areContentsTheSame", "", "oldItemPosition", "", "newItemPosition", "areItemsTheSame", "getNewListSize", "getOldListSize", "WooCommerce_wasabiDebug"})
    static final class ProductFilterDiffUtil extends androidx.recyclerview.widget.DiffUtil.Callback {
        @org.jetbrains.annotations.NotNull
        private final java.util.List<com.woocommerce.android.ui.products.ProductFilterListViewModel.FilterListItemUiModel> oldList = null;
        @org.jetbrains.annotations.NotNull
        private final java.util.List<com.woocommerce.android.ui.products.ProductFilterListViewModel.FilterListItemUiModel> newList = null;
        
        public ProductFilterDiffUtil(@org.jetbrains.annotations.NotNull
        java.util.List<com.woocommerce.android.ui.products.ProductFilterListViewModel.FilterListItemUiModel> oldList, @org.jetbrains.annotations.NotNull
        java.util.List<com.woocommerce.android.ui.products.ProductFilterListViewModel.FilterListItemUiModel> newList) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.util.List<com.woocommerce.android.ui.products.ProductFilterListViewModel.FilterListItemUiModel> getOldList() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.util.List<com.woocommerce.android.ui.products.ProductFilterListViewModel.FilterListItemUiModel> getNewList() {
            return null;
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