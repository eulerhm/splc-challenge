package com.woocommerce.android.ui.products.variations.attributes;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003:\u0002\u001a\u001bB=\u00126\u0010\u0004\u001a2\u0012\u0013\u0012\u00110\u0006\u00a2\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0013\u0012\u00110\n\u00a2\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\f0\u0005\u00a2\u0006\u0002\u0010\rJ\b\u0010\u0011\u001a\u00020\u0012H\u0016J\u0010\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0012H\u0016J\u001d\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00028\u00002\u0006\u0010\u0014\u001a\u00020\u0012H\u0016\u00a2\u0006\u0002\u0010\u0017J\u0014\u0010\u0018\u001a\u00020\f2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fR\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R>\u0010\u0004\u001a2\u0012\u0013\u0012\u00110\u0006\u00a2\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0013\u0012\u00110\n\u00a2\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\f0\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001c"}, d2 = {"Lcom/woocommerce/android/ui/products/variations/attributes/AttributeBaseAdapter;", "T", "Lcom/woocommerce/android/ui/products/variations/attributes/AttributeBaseAdapter$AttributeBaseViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "onItemClick", "Lkotlin/Function2;", "", "Lkotlin/ParameterName;", "name", "attributeId", "", "attributeName", "", "(Lkotlin/jvm/functions/Function2;)V", "attributeList", "", "Lcom/woocommerce/android/model/ProductAttribute;", "getItemCount", "", "getItemId", "position", "onBindViewHolder", "holder", "(Lcom/woocommerce/android/ui/products/variations/attributes/AttributeBaseAdapter$AttributeBaseViewHolder;I)V", "refreshAttributeList", "attributes", "AttributeBaseViewHolder", "AttributeItemDiffUtil", "WooCommerce_vanillaDebug"})
public abstract class AttributeBaseAdapter<T extends com.woocommerce.android.ui.products.variations.attributes.AttributeBaseAdapter.AttributeBaseViewHolder> extends androidx.recyclerview.widget.RecyclerView.Adapter<T> {
    private final kotlin.jvm.functions.Function2<java.lang.Long, java.lang.String, kotlin.Unit> onItemClick = null;
    private java.util.List<com.woocommerce.android.model.ProductAttribute> attributeList;
    
    public AttributeBaseAdapter(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function2<? super java.lang.Long, ? super java.lang.String, kotlin.Unit> onItemClick) {
        super();
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    T holder, int position) {
    }
    
    @java.lang.Override()
    public long getItemId(int position) {
        return 0L;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    public final void refreshAttributeList(@org.jetbrains.annotations.NotNull()
    java.util.List<com.woocommerce.android.model.ProductAttribute> attributes) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B!\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\u0002\u0010\u0006J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0016J\u0018\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0016J\b\u0010\u0010\u001a\u00020\rH\u0016J\b\u0010\u0011\u001a\u00020\rH\u0016R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b\u00a8\u0006\u0012"}, d2 = {"Lcom/woocommerce/android/ui/products/variations/attributes/AttributeBaseAdapter$AttributeItemDiffUtil;", "Landroidx/recyclerview/widget/DiffUtil$Callback;", "oldList", "", "Lcom/woocommerce/android/model/ProductAttribute;", "newList", "(Ljava/util/List;Ljava/util/List;)V", "getNewList", "()Ljava/util/List;", "getOldList", "areContentsTheSame", "", "oldItemPosition", "", "newItemPosition", "areItemsTheSame", "getNewListSize", "getOldListSize", "WooCommerce_vanillaDebug"})
    static final class AttributeItemDiffUtil extends androidx.recyclerview.widget.DiffUtil.Callback {
        @org.jetbrains.annotations.NotNull()
        private final java.util.List<com.woocommerce.android.model.ProductAttribute> oldList = null;
        @org.jetbrains.annotations.NotNull()
        private final java.util.List<com.woocommerce.android.model.ProductAttribute> newList = null;
        
        public AttributeItemDiffUtil(@org.jetbrains.annotations.NotNull()
        java.util.List<com.woocommerce.android.model.ProductAttribute> oldList, @org.jetbrains.annotations.NotNull()
        java.util.List<com.woocommerce.android.model.ProductAttribute> newList) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<com.woocommerce.android.model.ProductAttribute> getOldList() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<com.woocommerce.android.model.ProductAttribute> getNewList() {
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
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH&R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u000b"}, d2 = {"Lcom/woocommerce/android/ui/products/variations/attributes/AttributeBaseAdapter$AttributeBaseViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "viewBinding", "Lcom/woocommerce/android/databinding/AttributeItemBinding;", "(Lcom/woocommerce/android/databinding/AttributeItemBinding;)V", "getViewBinding", "()Lcom/woocommerce/android/databinding/AttributeItemBinding;", "bind", "", "attribute", "Lcom/woocommerce/android/model/ProductAttribute;", "WooCommerce_vanillaDebug"})
    public static abstract class AttributeBaseViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final com.woocommerce.android.databinding.AttributeItemBinding viewBinding = null;
        
        public AttributeBaseViewHolder(@org.jetbrains.annotations.NotNull()
        com.woocommerce.android.databinding.AttributeItemBinding viewBinding) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.woocommerce.android.databinding.AttributeItemBinding getViewBinding() {
            return null;
        }
        
        public abstract void bind(@org.jetbrains.annotations.NotNull()
        com.woocommerce.android.model.ProductAttribute attribute);
    }
}