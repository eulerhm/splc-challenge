package com.woocommerce.android.ui.products.downloads;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0002\u001a\u001bB!\u0012\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0006\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ\b\u0010\u0011\u001a\u00020\u0012H\u0016J\u001c\u0010\u0013\u001a\u00020\u00062\n\u0010\u0014\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0012H\u0016J\u001c\u0010\u0016\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0012H\u0016R\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R0\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u000b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u000b@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010\u00a8\u0006\u001c"}, d2 = {"Lcom/woocommerce/android/ui/products/downloads/ProductDownloadsAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/woocommerce/android/ui/products/downloads/ProductDownloadsAdapter$ProductDownloadableFileViewHolder;", "clickListener", "Lkotlin/Function1;", "Lcom/woocommerce/android/model/ProductFile;", "", "dragHelper", "Landroidx/recyclerview/widget/ItemTouchHelper;", "(Lkotlin/jvm/functions/Function1;Landroidx/recyclerview/widget/ItemTouchHelper;)V", "value", "", "filesList", "getFilesList", "()Ljava/util/List;", "setFilesList", "(Ljava/util/List;)V", "getItemCount", "", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "ProductDownloadableFileViewHolder", "ProductFileDiffUtil", "WooCommerce_vanillaDebug"})
public final class ProductDownloadsAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.woocommerce.android.ui.products.downloads.ProductDownloadsAdapter.ProductDownloadableFileViewHolder> {
    private final kotlin.jvm.functions.Function1<com.woocommerce.android.model.ProductFile, kotlin.Unit> clickListener = null;
    private final androidx.recyclerview.widget.ItemTouchHelper dragHelper = null;
    @org.jetbrains.annotations.NotNull()
    private java.util.List<com.woocommerce.android.model.ProductFile> filesList;
    
    public ProductDownloadsAdapter(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.woocommerce.android.model.ProductFile, kotlin.Unit> clickListener, @org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.ItemTouchHelper dragHelper) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.woocommerce.android.model.ProductFile> getFilesList() {
        return null;
    }
    
    public final void setFilesList(@org.jetbrains.annotations.NotNull()
    java.util.List<com.woocommerce.android.model.ProductFile> value) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.woocommerce.android.ui.products.downloads.ProductDownloadsAdapter.ProductDownloadableFileViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.woocommerce.android.ui.products.downloads.ProductDownloadsAdapter.ProductDownloadableFileViewHolder holder, int position) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u000b"}, d2 = {"Lcom/woocommerce/android/ui/products/downloads/ProductDownloadsAdapter$ProductDownloadableFileViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "viewBinding", "Lcom/woocommerce/android/databinding/ProductDownloadsListItemBinding;", "(Lcom/woocommerce/android/ui/products/downloads/ProductDownloadsAdapter;Lcom/woocommerce/android/databinding/ProductDownloadsListItemBinding;)V", "getViewBinding", "()Lcom/woocommerce/android/databinding/ProductDownloadsListItemBinding;", "bind", "", "file", "Lcom/woocommerce/android/model/ProductFile;", "WooCommerce_vanillaDebug"})
    public final class ProductDownloadableFileViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final com.woocommerce.android.databinding.ProductDownloadsListItemBinding viewBinding = null;
        
        public ProductDownloadableFileViewHolder(@org.jetbrains.annotations.NotNull()
        com.woocommerce.android.databinding.ProductDownloadsListItemBinding viewBinding) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.woocommerce.android.databinding.ProductDownloadsListItemBinding getViewBinding() {
            return null;
        }
        
        @android.annotation.SuppressLint(value = {"ClickableViewAccessibility"})
        public final void bind(@org.jetbrains.annotations.NotNull()
        com.woocommerce.android.model.ProductFile file) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B!\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\u0002\u0010\u0006J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u0018\u0010\f\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0016J\b\u0010\r\u001a\u00020\nH\u0016J\b\u0010\u000e\u001a\u00020\nH\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lcom/woocommerce/android/ui/products/downloads/ProductDownloadsAdapter$ProductFileDiffUtil;", "Landroidx/recyclerview/widget/DiffUtil$Callback;", "oldList", "", "Lcom/woocommerce/android/model/ProductFile;", "newList", "(Ljava/util/List;Ljava/util/List;)V", "areContentsTheSame", "", "oldItemPosition", "", "newItemPosition", "areItemsTheSame", "getNewListSize", "getOldListSize", "WooCommerce_vanillaDebug"})
    static final class ProductFileDiffUtil extends androidx.recyclerview.widget.DiffUtil.Callback {
        private final java.util.List<com.woocommerce.android.model.ProductFile> oldList = null;
        private final java.util.List<com.woocommerce.android.model.ProductFile> newList = null;
        
        public ProductFileDiffUtil(@org.jetbrains.annotations.NotNull()
        java.util.List<com.woocommerce.android.model.ProductFile> oldList, @org.jetbrains.annotations.NotNull()
        java.util.List<com.woocommerce.android.model.ProductFile> newList) {
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