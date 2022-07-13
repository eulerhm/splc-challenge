package com.woocommerce.android.ui.products.variations;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0003R\u00020\u00000\u0001:\u0002$%BJ\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012!\u0010\f\u001a\u001d\u0012\u0013\u0012\u00110\u0002\u00a2\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\u00110\r\u00a2\u0006\u0002\u0010\u0012J\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0015H\u0016J\u0010\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0002J\u001c\u0010\u001d\u001a\u00020\u00112\n\u0010\u001e\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u0015H\u0016J\u001c\u0010\u001f\u001a\u00060\u0003R\u00020\u00002\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u0015H\u0016J\f\u0010#\u001a\u00020\u001c*\u00020\u0002H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\u0013R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R)\u0010\f\u001a\u001d\u0012\u0013\u0012\u00110\u0002\u00a2\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\u00110\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006&"}, d2 = {"Lcom/woocommerce/android/ui/products/variations/VariationListAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "Lcom/woocommerce/android/model/ProductVariation;", "Lcom/woocommerce/android/ui/products/variations/VariationListAdapter$VariationViewHolder;", "context", "Landroid/content/Context;", "glideRequest", "error/NonExistentClass", "loadMoreListener", "Lcom/woocommerce/android/ui/products/OnLoadMoreListener;", "parentProduct", "Lcom/woocommerce/android/model/Product;", "onItemClick", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "variation", "", "(Landroid/content/Context;Lerror/NonExistentClass;Lcom/woocommerce/android/ui/products/OnLoadMoreListener;Lcom/woocommerce/android/model/Product;Lkotlin/jvm/functions/Function1;)V", "Lerror/NonExistentClass;", "imageSize", "", "getItemId", "", "position", "highlightText", "Landroid/text/SpannableString;", "text", "", "onBindViewHolder", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "getStockStatusText", "VariationItemDiffCallback", "VariationViewHolder", "WooCommerce_wasabiDebug"})
public final class VariationListAdapter extends androidx.recyclerview.widget.ListAdapter<com.woocommerce.android.model.ProductVariation, com.woocommerce.android.ui.products.variations.VariationListAdapter.VariationViewHolder> {
    private final android.content.Context context = null;
    private final error.NonExistentClass glideRequest = null;
    private final com.woocommerce.android.ui.products.OnLoadMoreListener loadMoreListener = null;
    private final com.woocommerce.android.model.Product parentProduct = null;
    private final kotlin.jvm.functions.Function1<com.woocommerce.android.model.ProductVariation, kotlin.Unit> onItemClick = null;
    private final int imageSize = 0;
    
    public VariationListAdapter(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    error.NonExistentClass glideRequest, @org.jetbrains.annotations.NotNull
    com.woocommerce.android.ui.products.OnLoadMoreListener loadMoreListener, @org.jetbrains.annotations.Nullable
    com.woocommerce.android.model.Product parentProduct, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super com.woocommerce.android.model.ProductVariation, kotlin.Unit> onItemClick) {
        super(null);
    }
    
    @java.lang.Override
    public long getItemId(int position) {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public com.woocommerce.android.ui.products.variations.VariationListAdapter.VariationViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull
    com.woocommerce.android.ui.products.variations.VariationListAdapter.VariationViewHolder holder, int position) {
    }
    
    private final java.lang.String getStockStatusText(com.woocommerce.android.model.ProductVariation $this$getStockStatusText) {
        return null;
    }
    
    private final android.text.SpannableString highlightText(java.lang.String text) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u000b"}, d2 = {"Lcom/woocommerce/android/ui/products/variations/VariationListAdapter$VariationViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "viewBinding", "Lcom/woocommerce/android/databinding/VariationListItemBinding;", "(Lcom/woocommerce/android/ui/products/variations/VariationListAdapter;Lcom/woocommerce/android/databinding/VariationListItemBinding;)V", "getViewBinding", "()Lcom/woocommerce/android/databinding/VariationListItemBinding;", "bind", "", "variation", "Lcom/woocommerce/android/model/ProductVariation;", "WooCommerce_wasabiDebug"})
    public final class VariationViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull
        private final com.woocommerce.android.databinding.VariationListItemBinding viewBinding = null;
        
        public VariationViewHolder(@org.jetbrains.annotations.NotNull
        com.woocommerce.android.databinding.VariationListItemBinding viewBinding) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.woocommerce.android.databinding.VariationListItemBinding getViewBinding() {
            return null;
        }
        
        public final void bind(@org.jetbrains.annotations.NotNull
        com.woocommerce.android.model.ProductVariation variation) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u00c6\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\u0018\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016\u00a8\u0006\t"}, d2 = {"Lcom/woocommerce/android/ui/products/variations/VariationListAdapter$VariationItemDiffCallback;", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Lcom/woocommerce/android/model/ProductVariation;", "()V", "areContentsTheSame", "", "oldItem", "newItem", "areItemsTheSame", "WooCommerce_wasabiDebug"})
    public static final class VariationItemDiffCallback extends androidx.recyclerview.widget.DiffUtil.ItemCallback<com.woocommerce.android.model.ProductVariation> {
        @org.jetbrains.annotations.NotNull
        public static final com.woocommerce.android.ui.products.variations.VariationListAdapter.VariationItemDiffCallback INSTANCE = null;
        
        private VariationItemDiffCallback() {
            super();
        }
        
        @java.lang.Override
        public boolean areItemsTheSame(@org.jetbrains.annotations.NotNull
        com.woocommerce.android.model.ProductVariation oldItem, @org.jetbrains.annotations.NotNull
        com.woocommerce.android.model.ProductVariation newItem) {
            return false;
        }
        
        @java.lang.Override
        public boolean areContentsTheSame(@org.jetbrains.annotations.NotNull
        com.woocommerce.android.model.ProductVariation oldItem, @org.jetbrains.annotations.NotNull
        com.woocommerce.android.model.ProductVariation newItem) {
            return false;
        }
    }
}