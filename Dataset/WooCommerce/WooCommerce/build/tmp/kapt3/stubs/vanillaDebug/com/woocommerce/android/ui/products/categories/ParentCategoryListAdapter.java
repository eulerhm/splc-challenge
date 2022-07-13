package com.woocommerce.android.ui.products.categories;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0003R\u00020\u00000\u0001:\u0002\u0015\u0016B\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\rH\u0016J\u001c\u0010\u000e\u001a\u00020\u000f2\n\u0010\u0010\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\f\u001a\u00020\rH\u0016J\u001c\u0010\u0011\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\rH\u0016R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Lcom/woocommerce/android/ui/products/categories/ParentCategoryListAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "Lcom/woocommerce/android/ui/products/categories/ProductCategoryItemUiModel;", "Lcom/woocommerce/android/ui/products/categories/ParentCategoryListAdapter$ParentCategoryListViewHolder;", "selectedCategoryId", "", "loadMoreListener", "Lcom/woocommerce/android/ui/products/OnLoadMoreListener;", "clickListener", "Lcom/woocommerce/android/ui/products/categories/OnProductCategoryClickListener;", "(JLcom/woocommerce/android/ui/products/OnLoadMoreListener;Lcom/woocommerce/android/ui/products/categories/OnProductCategoryClickListener;)V", "getItemId", "position", "", "onBindViewHolder", "", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "ParentCategoryDiffCallback", "ParentCategoryListViewHolder", "WooCommerce_vanillaDebug"})
public final class ParentCategoryListAdapter extends androidx.recyclerview.widget.ListAdapter<com.woocommerce.android.ui.products.categories.ProductCategoryItemUiModel, com.woocommerce.android.ui.products.categories.ParentCategoryListAdapter.ParentCategoryListViewHolder> {
    private long selectedCategoryId;
    private final com.woocommerce.android.ui.products.OnLoadMoreListener loadMoreListener = null;
    private final com.woocommerce.android.ui.products.categories.OnProductCategoryClickListener clickListener = null;
    
    public ParentCategoryListAdapter(long selectedCategoryId, @org.jetbrains.annotations.NotNull()
    com.woocommerce.android.ui.products.OnLoadMoreListener loadMoreListener, @org.jetbrains.annotations.NotNull()
    com.woocommerce.android.ui.products.categories.OnProductCategoryClickListener clickListener) {
        super(null);
    }
    
    @java.lang.Override()
    public long getItemId(int position) {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.woocommerce.android.ui.products.categories.ParentCategoryListAdapter.ParentCategoryListViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.woocommerce.android.ui.products.categories.ParentCategoryListAdapter.ParentCategoryListViewHolder holder, int position) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/woocommerce/android/ui/products/categories/ParentCategoryListAdapter$ParentCategoryListViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "viewBinder", "Lcom/woocommerce/android/databinding/ParentCategoryListItemBinding;", "(Lcom/woocommerce/android/ui/products/categories/ParentCategoryListAdapter;Lcom/woocommerce/android/databinding/ParentCategoryListItemBinding;)V", "bind", "", "parentCategory", "Lcom/woocommerce/android/ui/products/categories/ProductCategoryItemUiModel;", "WooCommerce_vanillaDebug"})
    public final class ParentCategoryListViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final com.woocommerce.android.databinding.ParentCategoryListItemBinding viewBinder = null;
        
        public ParentCategoryListViewHolder(@org.jetbrains.annotations.NotNull()
        com.woocommerce.android.databinding.ParentCategoryListItemBinding viewBinder) {
            super(null);
        }
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        com.woocommerce.android.ui.products.categories.ProductCategoryItemUiModel parentCategory) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u00c6\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\u0018\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016\u00a8\u0006\t"}, d2 = {"Lcom/woocommerce/android/ui/products/categories/ParentCategoryListAdapter$ParentCategoryDiffCallback;", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Lcom/woocommerce/android/ui/products/categories/ProductCategoryItemUiModel;", "()V", "areContentsTheSame", "", "oldItem", "newItem", "areItemsTheSame", "WooCommerce_vanillaDebug"})
    public static final class ParentCategoryDiffCallback extends androidx.recyclerview.widget.DiffUtil.ItemCallback<com.woocommerce.android.ui.products.categories.ProductCategoryItemUiModel> {
        @org.jetbrains.annotations.NotNull()
        public static final com.woocommerce.android.ui.products.categories.ParentCategoryListAdapter.ParentCategoryDiffCallback INSTANCE = null;
        
        private ParentCategoryDiffCallback() {
            super();
        }
        
        @java.lang.Override()
        public boolean areItemsTheSame(@org.jetbrains.annotations.NotNull()
        com.woocommerce.android.ui.products.categories.ProductCategoryItemUiModel oldItem, @org.jetbrains.annotations.NotNull()
        com.woocommerce.android.ui.products.categories.ProductCategoryItemUiModel newItem) {
            return false;
        }
        
        @java.lang.Override()
        public boolean areContentsTheSame(@org.jetbrains.annotations.NotNull()
        com.woocommerce.android.ui.products.categories.ProductCategoryItemUiModel oldItem, @org.jetbrains.annotations.NotNull()
        com.woocommerce.android.ui.products.categories.ProductCategoryItemUiModel newItem) {
            return false;
        }
    }
}