package com.woocommerce.android.ui.searchfilter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0003R\u00020\u00000\u0001:\u0002\u0012\u0013B\u0019\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\u0002\u0010\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u001c\u0010\f\u001a\u00020\u00062\n\u0010\r\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u001c\u0010\u000e\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u000bH\u0016R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lcom/woocommerce/android/ui/searchfilter/SearchFilterAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "Lcom/woocommerce/android/ui/searchfilter/SearchFilterItem;", "Lcom/woocommerce/android/ui/searchfilter/SearchFilterAdapter$SearchFilterViewHolder;", "onItemSelectedListener", "Lkotlin/Function1;", "", "(Lkotlin/jvm/functions/Function1;)V", "getItemId", "", "position", "", "onBindViewHolder", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "SearchFilterDiffCallback", "SearchFilterViewHolder", "WooCommerce_vanillaDebug"})
public final class SearchFilterAdapter extends androidx.recyclerview.widget.ListAdapter<com.woocommerce.android.ui.searchfilter.SearchFilterItem, com.woocommerce.android.ui.searchfilter.SearchFilterAdapter.SearchFilterViewHolder> {
    private final kotlin.jvm.functions.Function1<com.woocommerce.android.ui.searchfilter.SearchFilterItem, kotlin.Unit> onItemSelectedListener = null;
    
    public SearchFilterAdapter(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.woocommerce.android.ui.searchfilter.SearchFilterItem, kotlin.Unit> onItemSelectedListener) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.woocommerce.android.ui.searchfilter.SearchFilterAdapter.SearchFilterViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.woocommerce.android.ui.searchfilter.SearchFilterAdapter.SearchFilterViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public long getItemId(int position) {
        return 0L;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u000b"}, d2 = {"Lcom/woocommerce/android/ui/searchfilter/SearchFilterAdapter$SearchFilterViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "viewBinding", "Lcom/woocommerce/android/databinding/FilterListItemBinding;", "(Lcom/woocommerce/android/ui/searchfilter/SearchFilterAdapter;Lcom/woocommerce/android/databinding/FilterListItemBinding;)V", "getViewBinding", "()Lcom/woocommerce/android/databinding/FilterListItemBinding;", "bind", "", "item", "Lcom/woocommerce/android/ui/searchfilter/SearchFilterItem;", "WooCommerce_vanillaDebug"})
    public final class SearchFilterViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final com.woocommerce.android.databinding.FilterListItemBinding viewBinding = null;
        
        public SearchFilterViewHolder(@org.jetbrains.annotations.NotNull()
        com.woocommerce.android.databinding.FilterListItemBinding viewBinding) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.woocommerce.android.databinding.FilterListItemBinding getViewBinding() {
            return null;
        }
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        com.woocommerce.android.ui.searchfilter.SearchFilterItem item) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u00c6\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\u0018\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016\u00a8\u0006\t"}, d2 = {"Lcom/woocommerce/android/ui/searchfilter/SearchFilterAdapter$SearchFilterDiffCallback;", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Lcom/woocommerce/android/ui/searchfilter/SearchFilterItem;", "()V", "areContentsTheSame", "", "oldSearchFilterItem", "newSearchFilterItem", "areItemsTheSame", "WooCommerce_vanillaDebug"})
    public static final class SearchFilterDiffCallback extends androidx.recyclerview.widget.DiffUtil.ItemCallback<com.woocommerce.android.ui.searchfilter.SearchFilterItem> {
        @org.jetbrains.annotations.NotNull()
        public static final com.woocommerce.android.ui.searchfilter.SearchFilterAdapter.SearchFilterDiffCallback INSTANCE = null;
        
        private SearchFilterDiffCallback() {
            super();
        }
        
        @java.lang.Override()
        public boolean areItemsTheSame(@org.jetbrains.annotations.NotNull()
        com.woocommerce.android.ui.searchfilter.SearchFilterItem oldSearchFilterItem, @org.jetbrains.annotations.NotNull()
        com.woocommerce.android.ui.searchfilter.SearchFilterItem newSearchFilterItem) {
            return false;
        }
        
        @java.lang.Override()
        public boolean areContentsTheSame(@org.jetbrains.annotations.NotNull()
        com.woocommerce.android.ui.searchfilter.SearchFilterItem oldSearchFilterItem, @org.jetbrains.annotations.NotNull()
        com.woocommerce.android.ui.searchfilter.SearchFilterItem newSearchFilterItem) {
            return false;
        }
    }
}