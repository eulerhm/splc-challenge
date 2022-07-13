package com.woocommerce.android.ui.products.tags;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0003R\u00020\u00000\u0001:\u0003\u001a\u001b\u001cB\u0015\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0006\u0010\u000f\u001a\u00020\u0010J\u001c\u0010\u0011\u001a\u00020\u00122\n\u0010\u0013\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u001c\u0010\u0014\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000eH\u0016J\u000e\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\nR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001d"}, d2 = {"Lcom/woocommerce/android/ui/products/tags/ProductTagsAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "Lcom/woocommerce/android/model/ProductTag;", "Lcom/woocommerce/android/ui/products/tags/ProductTagsAdapter$ProductTagViewHolder;", "loadMoreListener", "Lcom/woocommerce/android/ui/products/OnLoadMoreListener;", "clickListener", "Lcom/woocommerce/android/ui/products/tags/ProductTagsAdapter$OnProductTagClickListener;", "(Lcom/woocommerce/android/ui/products/OnLoadMoreListener;Lcom/woocommerce/android/ui/products/tags/ProductTagsAdapter$OnProductTagClickListener;)V", "currentFilter", "", "getItemId", "", "position", "", "hasFilter", "", "onBindViewHolder", "", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setFilter", "filter", "OnProductTagClickListener", "ProductTagDiffCallback", "ProductTagViewHolder", "WooCommerce_wasabiDebug"})
public final class ProductTagsAdapter extends androidx.recyclerview.widget.ListAdapter<com.woocommerce.android.model.ProductTag, com.woocommerce.android.ui.products.tags.ProductTagsAdapter.ProductTagViewHolder> {
    private final com.woocommerce.android.ui.products.OnLoadMoreListener loadMoreListener = null;
    private final com.woocommerce.android.ui.products.tags.ProductTagsAdapter.OnProductTagClickListener clickListener = null;
    private java.lang.String currentFilter = "";
    
    public ProductTagsAdapter(@org.jetbrains.annotations.NotNull
    com.woocommerce.android.ui.products.OnLoadMoreListener loadMoreListener, @org.jetbrains.annotations.NotNull
    com.woocommerce.android.ui.products.tags.ProductTagsAdapter.OnProductTagClickListener clickListener) {
        super(null);
    }
    
    @java.lang.Override
    public long getItemId(int position) {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public com.woocommerce.android.ui.products.tags.ProductTagsAdapter.ProductTagViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull
    com.woocommerce.android.ui.products.tags.ProductTagsAdapter.ProductTagViewHolder holder, int position) {
    }
    
    public final boolean hasFilter() {
        return false;
    }
    
    /**
     * Sets the filter used to highlight matches in the tag list - note that the actual filtering is done
     * in the view model
     */
    public final void setFilter(@org.jetbrains.annotations.NotNull
    java.lang.String filter) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0007"}, d2 = {"Lcom/woocommerce/android/ui/products/tags/ProductTagsAdapter$OnProductTagClickListener;", "", "onProductTagAdded", "", "productTag", "Lcom/woocommerce/android/model/ProductTag;", "onProductTagRemoved", "WooCommerce_wasabiDebug"})
    public static abstract interface OnProductTagClickListener {
        
        public abstract void onProductTagAdded(@org.jetbrains.annotations.NotNull
        com.woocommerce.android.model.ProductTag productTag);
        
        public abstract void onProductTagRemoved(@org.jetbrains.annotations.NotNull
        com.woocommerce.android.model.ProductTag productTag);
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u000b"}, d2 = {"Lcom/woocommerce/android/ui/products/tags/ProductTagsAdapter$ProductTagViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "viewBinding", "Lcom/woocommerce/android/databinding/ProductTagListItemBinding;", "(Lcom/woocommerce/android/ui/products/tags/ProductTagsAdapter;Lcom/woocommerce/android/databinding/ProductTagListItemBinding;)V", "getViewBinding", "()Lcom/woocommerce/android/databinding/ProductTagListItemBinding;", "bind", "", "productTag", "Lcom/woocommerce/android/model/ProductTag;", "WooCommerce_wasabiDebug"})
    public final class ProductTagViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull
        private final com.woocommerce.android.databinding.ProductTagListItemBinding viewBinding = null;
        
        public ProductTagViewHolder(@org.jetbrains.annotations.NotNull
        com.woocommerce.android.databinding.ProductTagListItemBinding viewBinding) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.woocommerce.android.databinding.ProductTagListItemBinding getViewBinding() {
            return null;
        }
        
        public final void bind(@org.jetbrains.annotations.NotNull
        com.woocommerce.android.model.ProductTag productTag) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u00c6\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\u0018\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016\u00a8\u0006\t"}, d2 = {"Lcom/woocommerce/android/ui/products/tags/ProductTagsAdapter$ProductTagDiffCallback;", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Lcom/woocommerce/android/model/ProductTag;", "()V", "areContentsTheSame", "", "oldItem", "newItem", "areItemsTheSame", "WooCommerce_wasabiDebug"})
    public static final class ProductTagDiffCallback extends androidx.recyclerview.widget.DiffUtil.ItemCallback<com.woocommerce.android.model.ProductTag> {
        @org.jetbrains.annotations.NotNull
        public static final com.woocommerce.android.ui.products.tags.ProductTagsAdapter.ProductTagDiffCallback INSTANCE = null;
        
        private ProductTagDiffCallback() {
            super();
        }
        
        @java.lang.Override
        public boolean areItemsTheSame(@org.jetbrains.annotations.NotNull
        com.woocommerce.android.model.ProductTag oldItem, @org.jetbrains.annotations.NotNull
        com.woocommerce.android.model.ProductTag newItem) {
            return false;
        }
        
        @java.lang.Override
        public boolean areContentsTheSame(@org.jetbrains.annotations.NotNull
        com.woocommerce.android.model.ProductTag oldItem, @org.jetbrains.annotations.NotNull
        com.woocommerce.android.model.ProductTag newItem) {
            return false;
        }
    }
}