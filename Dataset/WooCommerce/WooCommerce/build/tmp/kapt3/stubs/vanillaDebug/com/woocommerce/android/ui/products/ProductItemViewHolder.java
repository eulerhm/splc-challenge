package com.woocommerce.android.ui.products;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J \u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u0011J\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013J1\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2!\u0010\u0016\u001a\u001d\u0012\u0013\u0012\u00110\r\u00a2\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\u000b0\u0017R\u0016\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t\u00a8\u0006\u001a"}, d2 = {"Lcom/woocommerce/android/ui/products/ProductItemViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "viewBinding", "Lcom/woocommerce/android/databinding/ProductListItemBinding;", "(Lcom/woocommerce/android/databinding/ProductListItemBinding;)V", "context", "Landroid/content/Context;", "kotlin.jvm.PlatformType", "getViewBinding", "()Lcom/woocommerce/android/databinding/ProductListItemBinding;", "bind", "", "product", "Lcom/woocommerce/android/model/Product;", "currencyFormatter", "Lcom/woocommerce/android/util/CurrencyFormatter;", "isActivated", "", "getItemDetails", "Landroidx/recyclerview/selection/ItemDetailsLookup$ItemDetails;", "", "setOnDeleteClickListener", "onItemDeleted", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "WooCommerce_vanillaDebug"})
public final class ProductItemViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
    @org.jetbrains.annotations.NotNull()
    private final com.woocommerce.android.databinding.ProductListItemBinding viewBinding = null;
    private final android.content.Context context = null;
    
    public ProductItemViewHolder(@org.jetbrains.annotations.NotNull()
    com.woocommerce.android.databinding.ProductListItemBinding viewBinding) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.woocommerce.android.databinding.ProductListItemBinding getViewBinding() {
        return null;
    }
    
    public final void bind(@org.jetbrains.annotations.NotNull()
    com.woocommerce.android.model.Product product, @org.jetbrains.annotations.NotNull()
    com.woocommerce.android.util.CurrencyFormatter currencyFormatter, boolean isActivated) {
    }
    
    public final void setOnDeleteClickListener(@org.jetbrains.annotations.NotNull()
    com.woocommerce.android.model.Product product, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.woocommerce.android.model.Product, kotlin.Unit> onItemDeleted) {
    }
    
    /**
     * Method to return details associated with a user selection
     */
    @org.jetbrains.annotations.NotNull()
    public final androidx.recyclerview.selection.ItemDetailsLookup.ItemDetails<java.lang.Long> getItemDetails() {
        return null;
    }
}