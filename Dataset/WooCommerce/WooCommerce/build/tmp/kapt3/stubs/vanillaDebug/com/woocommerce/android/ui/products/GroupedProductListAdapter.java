package com.woocommerce.android.ui.products;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B0\u0012!\u0010\u0004\u001a\u001d\u0012\u0013\u0012\u00110\u0002\u00a2\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\t0\u0005\u0012\u0006\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\fJ\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0018\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0018\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0010H\u0016R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R)\u0010\u0004\u001a\u001d\u0012\u0013\u0012\u00110\u0002\u00a2\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\t0\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Lcom/woocommerce/android/ui/products/GroupedProductListAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "Lcom/woocommerce/android/model/Product;", "Lcom/woocommerce/android/ui/products/ProductItemViewHolder;", "onItemDeleted", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "product", "", "currencyFormatter", "Lcom/woocommerce/android/util/CurrencyFormatter;", "(Lkotlin/jvm/functions/Function1;Lcom/woocommerce/android/util/CurrencyFormatter;)V", "getItemId", "", "position", "", "onBindViewHolder", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "WooCommerce_vanillaDebug"})
public final class GroupedProductListAdapter extends androidx.recyclerview.widget.ListAdapter<com.woocommerce.android.model.Product, com.woocommerce.android.ui.products.ProductItemViewHolder> {
    private final kotlin.jvm.functions.Function1<com.woocommerce.android.model.Product, kotlin.Unit> onItemDeleted = null;
    private final com.woocommerce.android.util.CurrencyFormatter currencyFormatter = null;
    
    public GroupedProductListAdapter(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.woocommerce.android.model.Product, kotlin.Unit> onItemDeleted, @org.jetbrains.annotations.NotNull()
    com.woocommerce.android.util.CurrencyFormatter currencyFormatter) {
        super(null);
    }
    
    @java.lang.Override()
    public long getItemId(int position) {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.woocommerce.android.ui.products.ProductItemViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.woocommerce.android.ui.products.ProductItemViewHolder holder, int position) {
    }
}