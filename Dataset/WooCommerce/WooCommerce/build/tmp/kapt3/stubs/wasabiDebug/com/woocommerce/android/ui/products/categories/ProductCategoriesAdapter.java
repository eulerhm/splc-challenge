package com.woocommerce.android.ui.products.categories;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0002\u001e\u001fB\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\b\u0010\u000b\u001a\u00020\fH\u0016J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\fH\u0016J\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J\u001c\u0010\u0015\u001a\u00020\u00112\n\u0010\u0016\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u000f\u001a\u00020\fH\u0016J\u001c\u0010\u0017\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\fH\u0016J\u0014\u0010\u001b\u001a\u00020\u00112\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\n0\u001dR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006 "}, d2 = {"Lcom/woocommerce/android/ui/products/categories/ProductCategoriesAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/woocommerce/android/ui/products/categories/ProductCategoriesAdapter$ProductCategoryViewHolder;", "loadMoreListener", "Lcom/woocommerce/android/ui/products/OnLoadMoreListener;", "clickListener", "Lcom/woocommerce/android/ui/products/categories/OnProductCategoryClickListener;", "(Lcom/woocommerce/android/ui/products/OnLoadMoreListener;Lcom/woocommerce/android/ui/products/categories/OnProductCategoryClickListener;)V", "productCategoryList", "Ljava/util/ArrayList;", "Lcom/woocommerce/android/ui/products/categories/ProductCategoryItemUiModel;", "getItemCount", "", "getItemId", "", "position", "handleCategoryClick", "", "productCategory", "isChecked", "", "onBindViewHolder", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setProductCategories", "productsCategories", "", "ProductCategoryItemDiffUtil", "ProductCategoryViewHolder", "WooCommerce_wasabiDebug"})
public final class ProductCategoriesAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.woocommerce.android.ui.products.categories.ProductCategoriesAdapter.ProductCategoryViewHolder> {
    private final com.woocommerce.android.ui.products.OnLoadMoreListener loadMoreListener = null;
    private final com.woocommerce.android.ui.products.categories.OnProductCategoryClickListener clickListener = null;
    private final java.util.ArrayList<com.woocommerce.android.ui.products.categories.ProductCategoryItemUiModel> productCategoryList = null;
    
    public ProductCategoriesAdapter(@org.jetbrains.annotations.NotNull
    com.woocommerce.android.ui.products.OnLoadMoreListener loadMoreListener, @org.jetbrains.annotations.NotNull
    com.woocommerce.android.ui.products.categories.OnProductCategoryClickListener clickListener) {
        super();
    }
    
    @java.lang.Override
    public long getItemId(int position) {
        return 0L;
    }
    
    @java.lang.Override
    public int getItemCount() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public com.woocommerce.android.ui.products.categories.ProductCategoriesAdapter.ProductCategoryViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull
    com.woocommerce.android.ui.products.categories.ProductCategoriesAdapter.ProductCategoryViewHolder holder, int position) {
    }
    
    private final void handleCategoryClick(com.woocommerce.android.ui.products.categories.ProductCategoryItemUiModel productCategory, boolean isChecked) {
    }
    
    public final void setProductCategories(@org.jetbrains.annotations.NotNull
    java.util.List<com.woocommerce.android.ui.products.categories.ProductCategoryItemUiModel> productsCategories) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/woocommerce/android/ui/products/categories/ProductCategoriesAdapter$ProductCategoryViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "viewBinder", "Lcom/woocommerce/android/databinding/ProductCategoryListItemBinding;", "(Lcom/woocommerce/android/ui/products/categories/ProductCategoriesAdapter;Lcom/woocommerce/android/databinding/ProductCategoryListItemBinding;)V", "bind", "", "productCategory", "Lcom/woocommerce/android/ui/products/categories/ProductCategoryItemUiModel;", "WooCommerce_wasabiDebug"})
    public final class ProductCategoryViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final com.woocommerce.android.databinding.ProductCategoryListItemBinding viewBinder = null;
        
        public ProductCategoryViewHolder(@org.jetbrains.annotations.NotNull
        com.woocommerce.android.databinding.ProductCategoryListItemBinding viewBinder) {
            super(null);
        }
        
        public final void bind(@org.jetbrains.annotations.NotNull
        com.woocommerce.android.ui.products.categories.ProductCategoryItemUiModel productCategory) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B!\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\u0002\u0010\u0006J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0016J\u0018\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0016J\b\u0010\u0010\u001a\u00020\rH\u0016J\b\u0010\u0011\u001a\u00020\rH\u0016R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b\u00a8\u0006\u0012"}, d2 = {"Lcom/woocommerce/android/ui/products/categories/ProductCategoriesAdapter$ProductCategoryItemDiffUtil;", "Landroidx/recyclerview/widget/DiffUtil$Callback;", "oldList", "", "Lcom/woocommerce/android/ui/products/categories/ProductCategoryItemUiModel;", "newList", "(Ljava/util/List;Ljava/util/List;)V", "getNewList", "()Ljava/util/List;", "getOldList", "areContentsTheSame", "", "oldItemPosition", "", "newItemPosition", "areItemsTheSame", "getNewListSize", "getOldListSize", "WooCommerce_wasabiDebug"})
    static final class ProductCategoryItemDiffUtil extends androidx.recyclerview.widget.DiffUtil.Callback {
        @org.jetbrains.annotations.NotNull
        private final java.util.List<com.woocommerce.android.ui.products.categories.ProductCategoryItemUiModel> oldList = null;
        @org.jetbrains.annotations.NotNull
        private final java.util.List<com.woocommerce.android.ui.products.categories.ProductCategoryItemUiModel> newList = null;
        
        public ProductCategoryItemDiffUtil(@org.jetbrains.annotations.NotNull
        java.util.List<com.woocommerce.android.ui.products.categories.ProductCategoryItemUiModel> oldList, @org.jetbrains.annotations.NotNull
        java.util.List<com.woocommerce.android.ui.products.categories.ProductCategoryItemUiModel> newList) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.util.List<com.woocommerce.android.ui.products.categories.ProductCategoryItemUiModel> getOldList() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.util.List<com.woocommerce.android.ui.products.categories.ProductCategoryItemUiModel> getNewList() {
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