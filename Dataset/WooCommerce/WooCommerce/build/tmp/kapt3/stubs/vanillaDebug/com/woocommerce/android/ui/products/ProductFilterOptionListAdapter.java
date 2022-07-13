package com.woocommerce.android.ui.products;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0003\u0017\u0018\u0019B\u0015\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0018\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\fH\u0016J\u0014\u0010\u0014\u001a\u00020\u000e2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001a"}, d2 = {"Lcom/woocommerce/android/ui/products/ProductFilterOptionListAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "Lcom/woocommerce/android/ui/products/ProductFilterListViewModel$FilterListOptionItemUiModel;", "Lcom/woocommerce/android/ui/products/ProductFilterOptionListAdapter$ProductFilterOptionViewHolder;", "clickListener", "Lcom/woocommerce/android/ui/products/ProductFilterOptionListAdapter$OnProductFilterOptionClickListener;", "loadMoreListener", "Lcom/woocommerce/android/ui/products/OnLoadMoreListener;", "(Lcom/woocommerce/android/ui/products/ProductFilterOptionListAdapter$OnProductFilterOptionClickListener;Lcom/woocommerce/android/ui/products/OnLoadMoreListener;)V", "getItemId", "", "position", "", "onBindViewHolder", "", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "updateData", "uiModels", "", "FilterOptionDiffCallback", "OnProductFilterOptionClickListener", "ProductFilterOptionViewHolder", "WooCommerce_vanillaDebug"})
public final class ProductFilterOptionListAdapter extends androidx.recyclerview.widget.ListAdapter<com.woocommerce.android.ui.products.ProductFilterListViewModel.FilterListOptionItemUiModel, com.woocommerce.android.ui.products.ProductFilterOptionListAdapter.ProductFilterOptionViewHolder> {
    private final com.woocommerce.android.ui.products.ProductFilterOptionListAdapter.OnProductFilterOptionClickListener clickListener = null;
    private final com.woocommerce.android.ui.products.OnLoadMoreListener loadMoreListener = null;
    
    public ProductFilterOptionListAdapter(@org.jetbrains.annotations.NotNull()
    com.woocommerce.android.ui.products.ProductFilterOptionListAdapter.OnProductFilterOptionClickListener clickListener, @org.jetbrains.annotations.NotNull()
    com.woocommerce.android.ui.products.OnLoadMoreListener loadMoreListener) {
        super(null);
    }
    
    public final void updateData(@org.jetbrains.annotations.NotNull()
    java.util.List<com.woocommerce.android.ui.products.ProductFilterListViewModel.FilterListOptionItemUiModel> uiModels) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.woocommerce.android.ui.products.ProductFilterOptionListAdapter.ProductFilterOptionViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.woocommerce.android.ui.products.ProductFilterOptionListAdapter.ProductFilterOptionViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public long getItemId(int position) {
        return 0L;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/woocommerce/android/ui/products/ProductFilterOptionListAdapter$OnProductFilterOptionClickListener;", "", "onFilterOptionClick", "", "selectedFilter", "Lcom/woocommerce/android/ui/products/ProductFilterListViewModel$FilterListOptionItemUiModel;", "WooCommerce_vanillaDebug"})
    public static abstract interface OnProductFilterOptionClickListener {
        
        public abstract void onFilterOptionClick(@org.jetbrains.annotations.NotNull()
        com.woocommerce.android.ui.products.ProductFilterListViewModel.FilterListOptionItemUiModel selectedFilter);
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u000b"}, d2 = {"Lcom/woocommerce/android/ui/products/ProductFilterOptionListAdapter$ProductFilterOptionViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "viewBinding", "Lcom/woocommerce/android/databinding/ProductFilterOptionListItemBinding;", "(Lcom/woocommerce/android/databinding/ProductFilterOptionListItemBinding;)V", "getViewBinding", "()Lcom/woocommerce/android/databinding/ProductFilterOptionListItemBinding;", "bind", "", "filter", "Lcom/woocommerce/android/ui/products/ProductFilterListViewModel$FilterListOptionItemUiModel;", "WooCommerce_vanillaDebug"})
    public static final class ProductFilterOptionViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final com.woocommerce.android.databinding.ProductFilterOptionListItemBinding viewBinding = null;
        
        public ProductFilterOptionViewHolder(@org.jetbrains.annotations.NotNull()
        com.woocommerce.android.databinding.ProductFilterOptionListItemBinding viewBinding) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.woocommerce.android.databinding.ProductFilterOptionListItemBinding getViewBinding() {
            return null;
        }
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        com.woocommerce.android.ui.products.ProductFilterListViewModel.FilterListOptionItemUiModel filter) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u00c6\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\u0018\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016\u00a8\u0006\t"}, d2 = {"Lcom/woocommerce/android/ui/products/ProductFilterOptionListAdapter$FilterOptionDiffCallback;", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Lcom/woocommerce/android/ui/products/ProductFilterListViewModel$FilterListOptionItemUiModel;", "()V", "areContentsTheSame", "", "oldItem", "newItem", "areItemsTheSame", "WooCommerce_vanillaDebug"})
    public static final class FilterOptionDiffCallback extends androidx.recyclerview.widget.DiffUtil.ItemCallback<com.woocommerce.android.ui.products.ProductFilterListViewModel.FilterListOptionItemUiModel> {
        @org.jetbrains.annotations.NotNull()
        public static final com.woocommerce.android.ui.products.ProductFilterOptionListAdapter.FilterOptionDiffCallback INSTANCE = null;
        
        private FilterOptionDiffCallback() {
            super();
        }
        
        @java.lang.Override()
        public boolean areItemsTheSame(@org.jetbrains.annotations.NotNull()
        com.woocommerce.android.ui.products.ProductFilterListViewModel.FilterListOptionItemUiModel oldItem, @org.jetbrains.annotations.NotNull()
        com.woocommerce.android.ui.products.ProductFilterListViewModel.FilterListOptionItemUiModel newItem) {
            return false;
        }
        
        @java.lang.Override()
        public boolean areContentsTheSame(@org.jetbrains.annotations.NotNull()
        com.woocommerce.android.ui.products.ProductFilterListViewModel.FilterListOptionItemUiModel oldItem, @org.jetbrains.annotations.NotNull()
        com.woocommerce.android.ui.products.ProductFilterListViewModel.FilterListOptionItemUiModel newItem) {
            return false;
        }
    }
}