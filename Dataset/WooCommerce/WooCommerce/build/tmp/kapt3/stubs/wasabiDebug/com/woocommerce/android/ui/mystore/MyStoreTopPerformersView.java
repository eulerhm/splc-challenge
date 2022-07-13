package com.woocommerce.android.ui.mystore;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0003\u001e\u001f B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\fJ\u000e\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0013J\u0010\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J\u000e\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u0016J\u000e\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u0016J\u0010\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\u0014\u0010\u001a\u001a\u00020\u00102\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001cR\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006!"}, d2 = {"Lcom/woocommerce/android/ui/mystore/MyStoreTopPerformersView;", "Lcom/google/android/material/card/MaterialCardView;", "ctx", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "binding", "Lcom/woocommerce/android/databinding/MyStoreTopPerformersBinding;", "selectedSite", "Lcom/woocommerce/android/tools/SelectedSite;", "skeletonView", "Lcom/woocommerce/android/widgets/SkeletonView;", "initView", "", "onDateGranularityChanged", "granularity", "Lorg/wordpress/android/fluxc/store/WCStatsStore$StatsGranularity;", "showEmptyView", "show", "", "showErrorView", "showSkeleton", "trackDateRangeChanged", "updateView", "topPerformers", "", "Lcom/woocommerce/android/ui/mystore/TopPerformerProductUiModel;", "ItemDiffCallback", "TopPerformersAdapter", "TopPerformersViewHolder", "WooCommerce_wasabiDebug"})
public final class MyStoreTopPerformersView extends com.google.android.material.card.MaterialCardView {
    private final com.woocommerce.android.databinding.MyStoreTopPerformersBinding binding = null;
    private com.woocommerce.android.tools.SelectedSite selectedSite;
    private com.woocommerce.android.widgets.SkeletonView skeletonView;
    
    @kotlin.jvm.JvmOverloads
    public MyStoreTopPerformersView(@org.jetbrains.annotations.NotNull
    android.content.Context ctx) {
        super(null);
    }
    
    @kotlin.jvm.JvmOverloads
    public MyStoreTopPerformersView(@org.jetbrains.annotations.NotNull
    android.content.Context ctx, @org.jetbrains.annotations.Nullable
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    @kotlin.jvm.JvmOverloads
    public MyStoreTopPerformersView(@org.jetbrains.annotations.NotNull
    android.content.Context ctx, @org.jetbrains.annotations.Nullable
    android.util.AttributeSet attrs, int defStyleAttr) {
        super(null);
    }
    
    public final void initView(@org.jetbrains.annotations.NotNull
    com.woocommerce.android.tools.SelectedSite selectedSite) {
    }
    
    public final void onDateGranularityChanged(@org.jetbrains.annotations.NotNull
    org.wordpress.android.fluxc.store.WCStatsStore.StatsGranularity granularity) {
    }
    
    private final void trackDateRangeChanged(org.wordpress.android.fluxc.store.WCStatsStore.StatsGranularity granularity) {
    }
    
    public final void showSkeleton(boolean show) {
    }
    
    private final void showEmptyView(boolean show) {
    }
    
    public final void updateView(@org.jetbrains.annotations.NotNull
    java.util.List<com.woocommerce.android.ui.mystore.TopPerformerProductUiModel> topPerformers) {
    }
    
    public final void showErrorView(boolean show) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/woocommerce/android/ui/mystore/MyStoreTopPerformersView$TopPerformersViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "viewBinding", "Lcom/woocommerce/android/databinding/TopPerformersListItemBinding;", "(Lcom/woocommerce/android/databinding/TopPerformersListItemBinding;)V", "getViewBinding", "()Lcom/woocommerce/android/databinding/TopPerformersListItemBinding;", "WooCommerce_wasabiDebug"})
    public static final class TopPerformersViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull
        private final com.woocommerce.android.databinding.TopPerformersListItemBinding viewBinding = null;
        
        public TopPerformersViewHolder(@org.jetbrains.annotations.NotNull
        com.woocommerce.android.databinding.TopPerformersListItemBinding viewBinding) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.woocommerce.android.databinding.TopPerformersListItemBinding getViewBinding() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0005\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0018\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\bH\u0016\u00a8\u0006\u0010"}, d2 = {"Lcom/woocommerce/android/ui/mystore/MyStoreTopPerformersView$TopPerformersAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "Lcom/woocommerce/android/ui/mystore/TopPerformerProductUiModel;", "Lcom/woocommerce/android/ui/mystore/MyStoreTopPerformersView$TopPerformersViewHolder;", "()V", "getItemId", "", "position", "", "onBindViewHolder", "", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "WooCommerce_wasabiDebug"})
    public static final class TopPerformersAdapter extends androidx.recyclerview.widget.ListAdapter<com.woocommerce.android.ui.mystore.TopPerformerProductUiModel, com.woocommerce.android.ui.mystore.MyStoreTopPerformersView.TopPerformersViewHolder> {
        
        public TopPerformersAdapter() {
            super(null);
        }
        
        @java.lang.Override
        public long getItemId(int position) {
            return 0L;
        }
        
        @org.jetbrains.annotations.NotNull
        @java.lang.Override
        public com.woocommerce.android.ui.mystore.MyStoreTopPerformersView.TopPerformersViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull
        android.view.ViewGroup parent, int viewType) {
            return null;
        }
        
        @java.lang.Override
        public void onBindViewHolder(@org.jetbrains.annotations.NotNull
        com.woocommerce.android.ui.mystore.MyStoreTopPerformersView.TopPerformersViewHolder holder, int position) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u00c6\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\u0018\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016\u00a8\u0006\t"}, d2 = {"Lcom/woocommerce/android/ui/mystore/MyStoreTopPerformersView$ItemDiffCallback;", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Lcom/woocommerce/android/ui/mystore/TopPerformerProductUiModel;", "()V", "areContentsTheSame", "", "oldItem", "newItem", "areItemsTheSame", "WooCommerce_wasabiDebug"})
    public static final class ItemDiffCallback extends androidx.recyclerview.widget.DiffUtil.ItemCallback<com.woocommerce.android.ui.mystore.TopPerformerProductUiModel> {
        @org.jetbrains.annotations.NotNull
        public static final com.woocommerce.android.ui.mystore.MyStoreTopPerformersView.ItemDiffCallback INSTANCE = null;
        
        private ItemDiffCallback() {
            super();
        }
        
        @java.lang.Override
        public boolean areItemsTheSame(@org.jetbrains.annotations.NotNull
        com.woocommerce.android.ui.mystore.TopPerformerProductUiModel oldItem, @org.jetbrains.annotations.NotNull
        com.woocommerce.android.ui.mystore.TopPerformerProductUiModel newItem) {
            return false;
        }
        
        @java.lang.Override
        public boolean areContentsTheSame(@org.jetbrains.annotations.NotNull
        com.woocommerce.android.ui.mystore.TopPerformerProductUiModel oldItem, @org.jetbrains.annotations.NotNull
        com.woocommerce.android.ui.mystore.TopPerformerProductUiModel newItem) {
            return false;
        }
    }
}