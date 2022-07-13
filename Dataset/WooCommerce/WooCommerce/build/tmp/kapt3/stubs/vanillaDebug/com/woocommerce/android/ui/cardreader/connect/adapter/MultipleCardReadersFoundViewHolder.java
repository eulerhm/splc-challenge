package com.woocommerce.android.ui.cardreader.connect.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\r\u000eB\u0019\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH&R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\u0082\u0001\u0002\u000f\u0010\u00a8\u0006\u0011"}, d2 = {"Lcom/woocommerce/android/ui/cardreader/connect/adapter/MultipleCardReadersFoundViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "parent", "Landroid/view/ViewGroup;", "layout", "", "(Landroid/view/ViewGroup;I)V", "getParent", "()Landroid/view/ViewGroup;", "onBind", "", "uiState", "Lcom/woocommerce/android/ui/cardreader/connect/CardReaderConnectViewModel$ListItemViewState;", "CardReaderViewHolder", "ScanningInProgressViewHolder", "Lcom/woocommerce/android/ui/cardreader/connect/adapter/MultipleCardReadersFoundViewHolder$CardReaderViewHolder;", "Lcom/woocommerce/android/ui/cardreader/connect/adapter/MultipleCardReadersFoundViewHolder$ScanningInProgressViewHolder;", "WooCommerce_vanillaDebug"})
public abstract class MultipleCardReadersFoundViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
    @org.jetbrains.annotations.NotNull()
    private final android.view.ViewGroup parent = null;
    
    private MultipleCardReadersFoundViewHolder(android.view.ViewGroup parent, @androidx.annotation.LayoutRes()
    int layout) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.view.ViewGroup getParent() {
        return null;
    }
    
    public abstract void onBind(@org.jetbrains.annotations.NotNull()
    com.woocommerce.android.ui.cardreader.connect.CardReaderConnectViewModel.ListItemViewState uiState);
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n\u00a8\u0006\u000f"}, d2 = {"Lcom/woocommerce/android/ui/cardreader/connect/adapter/MultipleCardReadersFoundViewHolder$CardReaderViewHolder;", "Lcom/woocommerce/android/ui/cardreader/connect/adapter/MultipleCardReadersFoundViewHolder;", "parent", "Landroid/view/ViewGroup;", "(Landroid/view/ViewGroup;)V", "binding", "Lcom/woocommerce/android/databinding/CardReaderConnectReaderItemBinding;", "getBinding", "()Lcom/woocommerce/android/databinding/CardReaderConnectReaderItemBinding;", "setBinding", "(Lcom/woocommerce/android/databinding/CardReaderConnectReaderItemBinding;)V", "onBind", "", "uiState", "Lcom/woocommerce/android/ui/cardreader/connect/CardReaderConnectViewModel$ListItemViewState;", "WooCommerce_vanillaDebug"})
    public static final class CardReaderViewHolder extends com.woocommerce.android.ui.cardreader.connect.adapter.MultipleCardReadersFoundViewHolder {
        @org.jetbrains.annotations.NotNull()
        private com.woocommerce.android.databinding.CardReaderConnectReaderItemBinding binding;
        
        public CardReaderViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.ViewGroup parent) {
            super(null, 0);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.woocommerce.android.databinding.CardReaderConnectReaderItemBinding getBinding() {
            return null;
        }
        
        public final void setBinding(@org.jetbrains.annotations.NotNull()
        com.woocommerce.android.databinding.CardReaderConnectReaderItemBinding p0) {
        }
        
        @java.lang.Override()
        public void onBind(@org.jetbrains.annotations.NotNull()
        com.woocommerce.android.ui.cardreader.connect.CardReaderConnectViewModel.ListItemViewState uiState) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n\u00a8\u0006\u000f"}, d2 = {"Lcom/woocommerce/android/ui/cardreader/connect/adapter/MultipleCardReadersFoundViewHolder$ScanningInProgressViewHolder;", "Lcom/woocommerce/android/ui/cardreader/connect/adapter/MultipleCardReadersFoundViewHolder;", "parent", "Landroid/view/ViewGroup;", "(Landroid/view/ViewGroup;)V", "binding", "Lcom/woocommerce/android/databinding/CardReaderConnectScanningItemBinding;", "getBinding", "()Lcom/woocommerce/android/databinding/CardReaderConnectScanningItemBinding;", "setBinding", "(Lcom/woocommerce/android/databinding/CardReaderConnectScanningItemBinding;)V", "onBind", "", "uiState", "Lcom/woocommerce/android/ui/cardreader/connect/CardReaderConnectViewModel$ListItemViewState;", "WooCommerce_vanillaDebug"})
    public static final class ScanningInProgressViewHolder extends com.woocommerce.android.ui.cardreader.connect.adapter.MultipleCardReadersFoundViewHolder {
        @org.jetbrains.annotations.NotNull()
        private com.woocommerce.android.databinding.CardReaderConnectScanningItemBinding binding;
        
        public ScanningInProgressViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.ViewGroup parent) {
            super(null, 0);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.woocommerce.android.databinding.CardReaderConnectScanningItemBinding getBinding() {
            return null;
        }
        
        public final void setBinding(@org.jetbrains.annotations.NotNull()
        com.woocommerce.android.databinding.CardReaderConnectScanningItemBinding p0) {
        }
        
        @java.lang.Override()
        public void onBind(@org.jetbrains.annotations.NotNull()
        com.woocommerce.android.ui.cardreader.connect.CardReaderConnectViewModel.ListItemViewState uiState) {
        }
    }
}