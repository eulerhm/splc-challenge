package com.woocommerce.android.ui.cardreader.connect.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00192\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0019B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\f\u001a\u00020\rH\u0016J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\rH\u0016J\u0010\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\rH\u0016J\u0018\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\rH\u0016J\u0018\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\rH\u0016R0\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b\u00a8\u0006\u001a"}, d2 = {"Lcom/woocommerce/android/ui/cardreader/connect/adapter/MultipleCardReadersFoundAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/woocommerce/android/ui/cardreader/connect/adapter/MultipleCardReadersFoundViewHolder;", "()V", "value", "", "Lcom/woocommerce/android/ui/cardreader/connect/CardReaderConnectViewModel$ListItemViewState;", "list", "getList", "()Ljava/util/List;", "setList", "(Ljava/util/List;)V", "getItemCount", "", "getItemId", "", "position", "getItemViewType", "onBindViewHolder", "", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "Companion", "WooCommerce_vanillaDebug"})
public final class MultipleCardReadersFoundAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.woocommerce.android.ui.cardreader.connect.adapter.MultipleCardReadersFoundViewHolder> {
    @org.jetbrains.annotations.NotNull()
    public static final com.woocommerce.android.ui.cardreader.connect.adapter.MultipleCardReadersFoundAdapter.Companion Companion = null;
    private static final int VIEW_TYPE_READER_ITEM = 0;
    private static final int VIEW_TYPE_PROGRESS_ITEM = 1;
    private static final long ITEM_ID_PROGRESS_ITEM = -1L;
    @org.jetbrains.annotations.NotNull()
    private java.util.List<? extends com.woocommerce.android.ui.cardreader.connect.CardReaderConnectViewModel.ListItemViewState> list;
    
    public MultipleCardReadersFoundAdapter() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.woocommerce.android.ui.cardreader.connect.CardReaderConnectViewModel.ListItemViewState> getList() {
        return null;
    }
    
    public final void setList(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends com.woocommerce.android.ui.cardreader.connect.CardReaderConnectViewModel.ListItemViewState> value) {
    }
    
    @java.lang.Override()
    public int getItemViewType(int position) {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.woocommerce.android.ui.cardreader.connect.adapter.MultipleCardReadersFoundViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.woocommerce.android.ui.cardreader.connect.adapter.MultipleCardReadersFoundViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override()
    public long getItemId(int position) {
        return 0L;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lcom/woocommerce/android/ui/cardreader/connect/adapter/MultipleCardReadersFoundAdapter$Companion;", "", "()V", "ITEM_ID_PROGRESS_ITEM", "", "VIEW_TYPE_PROGRESS_ITEM", "", "VIEW_TYPE_READER_ITEM", "WooCommerce_vanillaDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}