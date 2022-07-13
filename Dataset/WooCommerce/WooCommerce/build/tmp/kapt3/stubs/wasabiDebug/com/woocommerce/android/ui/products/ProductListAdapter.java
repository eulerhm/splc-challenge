package com.woocommerce.android.ui.products;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001BY\u0012B\b\u0002\u0010\u0004\u001a<\u0012\u0013\u0012\u00110\u0006\u00a2\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0015\u0012\u0013\u0018\u00010\n\u00a2\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\u0005j\u0004\u0018\u0001`\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u00a2\u0006\u0002\u0010\u0012J\u0010\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u001bH\u0016J\u0018\u0010\u001c\u001a\u00020\f2\u0006\u0010\u001d\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u001bH\u0016J\u0018\u0010\u001e\u001a\u00020\u00032\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u001bH\u0016RH\u0010\u0004\u001a<\u0012\u0013\u0012\u00110\u0006\u00a2\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0015\u0012\u0013\u0018\u00010\n\u00a2\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\u0005j\u0004\u0018\u0001`\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\"\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0014X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018\u00a8\u0006\""}, d2 = {"Lcom/woocommerce/android/ui/products/ProductListAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "Lcom/woocommerce/android/model/Product;", "Lcom/woocommerce/android/ui/products/ProductItemViewHolder;", "clickListener", "Lkotlin/Function2;", "", "Lkotlin/ParameterName;", "name", "remoteProductId", "Landroid/view/View;", "sharedView", "", "Lcom/woocommerce/android/ui/products/OnProductClickListener;", "loadMoreListener", "Lcom/woocommerce/android/ui/products/OnLoadMoreListener;", "currencyFormatter", "Lcom/woocommerce/android/util/CurrencyFormatter;", "(Lkotlin/jvm/functions/Function2;Lcom/woocommerce/android/ui/products/OnLoadMoreListener;Lcom/woocommerce/android/util/CurrencyFormatter;)V", "tracker", "Landroidx/recyclerview/selection/SelectionTracker;", "getTracker", "()Landroidx/recyclerview/selection/SelectionTracker;", "setTracker", "(Landroidx/recyclerview/selection/SelectionTracker;)V", "getItemId", "position", "", "onBindViewHolder", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "WooCommerce_wasabiDebug"})
public final class ProductListAdapter extends androidx.recyclerview.widget.ListAdapter<com.woocommerce.android.model.Product, com.woocommerce.android.ui.products.ProductItemViewHolder> {
    private final kotlin.jvm.functions.Function2<java.lang.Long, android.view.View, kotlin.Unit> clickListener = null;
    private final com.woocommerce.android.ui.products.OnLoadMoreListener loadMoreListener = null;
    private final com.woocommerce.android.util.CurrencyFormatter currencyFormatter = null;
    @org.jetbrains.annotations.Nullable
    private androidx.recyclerview.selection.SelectionTracker<java.lang.Long> tracker;
    
    public ProductListAdapter(@org.jetbrains.annotations.Nullable
    kotlin.jvm.functions.Function2<? super java.lang.Long, ? super android.view.View, kotlin.Unit> clickListener, @org.jetbrains.annotations.NotNull
    com.woocommerce.android.ui.products.OnLoadMoreListener loadMoreListener, @org.jetbrains.annotations.NotNull
    com.woocommerce.android.util.CurrencyFormatter currencyFormatter) {
        super(null);
    }
    
    @org.jetbrains.annotations.Nullable
    public final androidx.recyclerview.selection.SelectionTracker<java.lang.Long> getTracker() {
        return null;
    }
    
    public final void setTracker(@org.jetbrains.annotations.Nullable
    androidx.recyclerview.selection.SelectionTracker<java.lang.Long> p0) {
    }
    
    @java.lang.Override
    public long getItemId(int position) {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public com.woocommerce.android.ui.products.ProductItemViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull
    com.woocommerce.android.ui.products.ProductItemViewHolder holder, int position) {
    }
}