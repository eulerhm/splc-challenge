package com.woocommerce.android.ui.products;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u001b\u001cB(\u0012!\u0010\u0003\u001a\u001d\u0012\u0013\u0012\u00110\u0005\u00a2\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\t0\u0004\u00a2\u0006\u0002\u0010\nJ\b\u0010\r\u001a\u00020\u000eH\u0016J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u000eH\u0016J\u0018\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u000eH\u0016J\u0018\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000eH\u0016J\u0014\u0010\u0018\u001a\u00020\t2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00050\u001aR)\u0010\u0003\u001a\u001d\u0012\u0013\u0012\u00110\u0005\u00a2\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001d"}, d2 = {"Lcom/woocommerce/android/ui/products/ProductTypesBottomSheetAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/woocommerce/android/ui/products/ProductTypesBottomSheetAdapter$ProductTypesBottomSheetViewHolder;", "onItemClicked", "Lkotlin/Function1;", "Lcom/woocommerce/android/ui/products/ProductTypesBottomSheetViewModel$ProductTypesBottomSheetUiItem;", "Lkotlin/ParameterName;", "name", "productTypeUiItem", "", "(Lkotlin/jvm/functions/Function1;)V", "options", "Ljava/util/ArrayList;", "getItemCount", "", "getItemId", "", "position", "onBindViewHolder", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setProductTypeOptions", "optionList", "", "ProductTypesBottomSheetItemDiffUtil", "ProductTypesBottomSheetViewHolder", "WooCommerce_vanillaDebug"})
public final class ProductTypesBottomSheetAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.woocommerce.android.ui.products.ProductTypesBottomSheetAdapter.ProductTypesBottomSheetViewHolder> {
    private final kotlin.jvm.functions.Function1<com.woocommerce.android.ui.products.ProductTypesBottomSheetViewModel.ProductTypesBottomSheetUiItem, kotlin.Unit> onItemClicked = null;
    private final java.util.ArrayList<com.woocommerce.android.ui.products.ProductTypesBottomSheetViewModel.ProductTypesBottomSheetUiItem> options = null;
    
    public ProductTypesBottomSheetAdapter(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.woocommerce.android.ui.products.ProductTypesBottomSheetViewModel.ProductTypesBottomSheetUiItem, kotlin.Unit> onItemClicked) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.woocommerce.android.ui.products.ProductTypesBottomSheetAdapter.ProductTypesBottomSheetViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.woocommerce.android.ui.products.ProductTypesBottomSheetAdapter.ProductTypesBottomSheetViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public long getItemId(int position) {
        return 0L;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    public final void setProductTypeOptions(@org.jetbrains.annotations.NotNull()
    java.util.List<com.woocommerce.android.ui.products.ProductTypesBottomSheetViewModel.ProductTypesBottomSheetUiItem> optionList) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J1\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2!\u0010\u000b\u001a\u001d\u0012\u0013\u0012\u00110\n\u00a2\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\b0\fR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0010"}, d2 = {"Lcom/woocommerce/android/ui/products/ProductTypesBottomSheetAdapter$ProductTypesBottomSheetViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "viewBinder", "Lcom/woocommerce/android/databinding/ProductDetailBottomSheetListItemBinding;", "(Lcom/woocommerce/android/databinding/ProductDetailBottomSheetListItemBinding;)V", "getViewBinder", "()Lcom/woocommerce/android/databinding/ProductDetailBottomSheetListItemBinding;", "bind", "", "item", "Lcom/woocommerce/android/ui/products/ProductTypesBottomSheetViewModel$ProductTypesBottomSheetUiItem;", "onItemClicked", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "productTypeUiItem", "WooCommerce_vanillaDebug"})
    public static final class ProductTypesBottomSheetViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final com.woocommerce.android.databinding.ProductDetailBottomSheetListItemBinding viewBinder = null;
        
        public ProductTypesBottomSheetViewHolder(@org.jetbrains.annotations.NotNull()
        com.woocommerce.android.databinding.ProductDetailBottomSheetListItemBinding viewBinder) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.woocommerce.android.databinding.ProductDetailBottomSheetListItemBinding getViewBinder() {
            return null;
        }
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        com.woocommerce.android.ui.products.ProductTypesBottomSheetViewModel.ProductTypesBottomSheetUiItem item, @org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function1<? super com.woocommerce.android.ui.products.ProductTypesBottomSheetViewModel.ProductTypesBottomSheetUiItem, kotlin.Unit> onItemClicked) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B!\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\u0002\u0010\u0006J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0016J\u0018\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0016J\b\u0010\u0010\u001a\u00020\rH\u0016J\b\u0010\u0011\u001a\u00020\rH\u0016R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b\u00a8\u0006\u0012"}, d2 = {"Lcom/woocommerce/android/ui/products/ProductTypesBottomSheetAdapter$ProductTypesBottomSheetItemDiffUtil;", "Landroidx/recyclerview/widget/DiffUtil$Callback;", "items", "", "Lcom/woocommerce/android/ui/products/ProductTypesBottomSheetViewModel$ProductTypesBottomSheetUiItem;", "result", "(Ljava/util/List;Ljava/util/List;)V", "getItems", "()Ljava/util/List;", "getResult", "areContentsTheSame", "", "oldItemPosition", "", "newItemPosition", "areItemsTheSame", "getNewListSize", "getOldListSize", "WooCommerce_vanillaDebug"})
    static final class ProductTypesBottomSheetItemDiffUtil extends androidx.recyclerview.widget.DiffUtil.Callback {
        @org.jetbrains.annotations.NotNull()
        private final java.util.List<com.woocommerce.android.ui.products.ProductTypesBottomSheetViewModel.ProductTypesBottomSheetUiItem> items = null;
        @org.jetbrains.annotations.NotNull()
        private final java.util.List<com.woocommerce.android.ui.products.ProductTypesBottomSheetViewModel.ProductTypesBottomSheetUiItem> result = null;
        
        public ProductTypesBottomSheetItemDiffUtil(@org.jetbrains.annotations.NotNull()
        java.util.List<com.woocommerce.android.ui.products.ProductTypesBottomSheetViewModel.ProductTypesBottomSheetUiItem> items, @org.jetbrains.annotations.NotNull()
        java.util.List<com.woocommerce.android.ui.products.ProductTypesBottomSheetViewModel.ProductTypesBottomSheetUiItem> result) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<com.woocommerce.android.ui.products.ProductTypesBottomSheetViewModel.ProductTypesBottomSheetUiItem> getItems() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<com.woocommerce.android.ui.products.ProductTypesBottomSheetViewModel.ProductTypesBottomSheetUiItem> getResult() {
            return null;
        }
        
        @java.lang.Override()
        public boolean areItemsTheSame(int oldItemPosition, int newItemPosition) {
            return false;
        }
        
        @java.lang.Override()
        public int getOldListSize() {
            return 0;
        }
        
        @java.lang.Override()
        public int getNewListSize() {
            return 0;
        }
        
        @java.lang.Override()
        public boolean areContentsTheSame(int oldItemPosition, int newItemPosition) {
            return false;
        }
    }
}