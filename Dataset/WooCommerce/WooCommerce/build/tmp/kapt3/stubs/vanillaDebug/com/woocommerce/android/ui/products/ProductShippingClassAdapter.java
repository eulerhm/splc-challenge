package com.woocommerce.android.ui.products;

import java.lang.System;

/**
 * RecyclerView adapter which shows a list of product shipping classes, the first of which will
 * be "No shipping class" so the user can choose to clear this value.
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0002\u001a\u001bB+\u0012\u0014\b\u0002\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\b\u00a2\u0006\u0002\u0010\tJ\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u001c\u0010\u0010\u001a\u00020\u00062\n\u0010\u0011\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u000fH\u0016J\u001c\u0010\u0013\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000fH\u0016J\u001e\u0010\u0017\u001a\u00020\u00062\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00050\u000b2\b\b\u0002\u0010\u0019\u001a\u00020\rR\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001c"}, d2 = {"Lcom/woocommerce/android/ui/products/ProductShippingClassAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/woocommerce/android/ui/products/ProductShippingClassAdapter$ViewHolder;", "onItemClicked", "Lkotlin/Function1;", "Lcom/woocommerce/android/model/ShippingClass;", "", "onLoadMoreRequested", "Lkotlin/Function0;", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)V", "items", "", "selectedShippingClassId", "", "getItemCount", "", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "update", "newItems", "selectedItemId", "ShippingClassDiffCallback", "ViewHolder", "WooCommerce_vanillaDebug"})
public final class ProductShippingClassAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.woocommerce.android.ui.products.ProductShippingClassAdapter.ViewHolder> {
    private final kotlin.jvm.functions.Function1<com.woocommerce.android.model.ShippingClass, kotlin.Unit> onItemClicked = null;
    private final kotlin.jvm.functions.Function0<kotlin.Unit> onLoadMoreRequested = null;
    private java.util.List<com.woocommerce.android.model.ShippingClass> items;
    private long selectedShippingClassId = -1L;
    
    public ProductShippingClassAdapter() {
        super();
    }
    
    public ProductShippingClassAdapter(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.woocommerce.android.model.ShippingClass, kotlin.Unit> onItemClicked, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onLoadMoreRequested) {
        super();
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.woocommerce.android.ui.products.ProductShippingClassAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.woocommerce.android.ui.products.ProductShippingClassAdapter.ViewHolder holder, int position) {
    }
    
    public final void update(@org.jetbrains.annotations.NotNull()
    java.util.List<com.woocommerce.android.model.ShippingClass> newItems, long selectedItemId) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u000b"}, d2 = {"Lcom/woocommerce/android/ui/products/ProductShippingClassAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "viewBinding", "Lcom/woocommerce/android/databinding/ProductShippingClassItemBinding;", "(Lcom/woocommerce/android/ui/products/ProductShippingClassAdapter;Lcom/woocommerce/android/databinding/ProductShippingClassItemBinding;)V", "getViewBinding", "()Lcom/woocommerce/android/databinding/ProductShippingClassItemBinding;", "bind", "", "position", "", "WooCommerce_vanillaDebug"})
    public final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final com.woocommerce.android.databinding.ProductShippingClassItemBinding viewBinding = null;
        
        public ViewHolder(@org.jetbrains.annotations.NotNull()
        com.woocommerce.android.databinding.ProductShippingClassItemBinding viewBinding) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.woocommerce.android.databinding.ProductShippingClassItemBinding getViewBinding() {
            return null;
        }
        
        public final void bind(int position) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0004\u0018\u00002\u00020\u0001B!\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\u0002\u0010\u0006J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u0018\u0010\f\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0016J\b\u0010\r\u001a\u00020\nH\u0016J\b\u0010\u000e\u001a\u00020\nH\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lcom/woocommerce/android/ui/products/ProductShippingClassAdapter$ShippingClassDiffCallback;", "Landroidx/recyclerview/widget/DiffUtil$Callback;", "oldList", "", "Lcom/woocommerce/android/model/ShippingClass;", "newList", "(Lcom/woocommerce/android/ui/products/ProductShippingClassAdapter;Ljava/util/List;Ljava/util/List;)V", "areContentsTheSame", "", "oldItemPosition", "", "newItemPosition", "areItemsTheSame", "getNewListSize", "getOldListSize", "WooCommerce_vanillaDebug"})
    public final class ShippingClassDiffCallback extends androidx.recyclerview.widget.DiffUtil.Callback {
        private final java.util.List<com.woocommerce.android.model.ShippingClass> oldList = null;
        private final java.util.List<com.woocommerce.android.model.ShippingClass> newList = null;
        
        public ShippingClassDiffCallback(@org.jetbrains.annotations.NotNull()
        java.util.List<com.woocommerce.android.model.ShippingClass> oldList, @org.jetbrains.annotations.NotNull()
        java.util.List<com.woocommerce.android.model.ShippingClass> newList) {
            super();
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