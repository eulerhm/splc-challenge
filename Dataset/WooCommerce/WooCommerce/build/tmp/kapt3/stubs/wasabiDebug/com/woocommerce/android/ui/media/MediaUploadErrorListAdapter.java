package com.woocommerce.android.ui.media;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0016\u0017B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\f\u001a\u00020\rH\u0016J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\rH\u0016J\u0018\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\rH\u0016R0\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b\u00a8\u0006\u0018"}, d2 = {"Lcom/woocommerce/android/ui/media/MediaUploadErrorListAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/woocommerce/android/ui/media/MediaUploadErrorListAdapter$MediaUploadErrorListItemViewHolder;", "()V", "value", "", "Lcom/woocommerce/android/ui/media/MediaUploadErrorListViewModel$ErrorUiModel;", "mediaErrorList", "getMediaErrorList", "()Ljava/util/List;", "setMediaErrorList", "(Ljava/util/List;)V", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "MediaUploadErrorDiffUtil", "MediaUploadErrorListItemViewHolder", "WooCommerce_wasabiDebug"})
public final class MediaUploadErrorListAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.woocommerce.android.ui.media.MediaUploadErrorListAdapter.MediaUploadErrorListItemViewHolder> {
    @org.jetbrains.annotations.NotNull
    private java.util.List<com.woocommerce.android.ui.media.MediaUploadErrorListViewModel.ErrorUiModel> mediaErrorList;
    
    public MediaUploadErrorListAdapter() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.woocommerce.android.ui.media.MediaUploadErrorListViewModel.ErrorUiModel> getMediaErrorList() {
        return null;
    }
    
    public final void setMediaErrorList(@org.jetbrains.annotations.NotNull
    java.util.List<com.woocommerce.android.ui.media.MediaUploadErrorListViewModel.ErrorUiModel> value) {
    }
    
    @java.lang.Override
    public int getItemCount() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public com.woocommerce.android.ui.media.MediaUploadErrorListAdapter.MediaUploadErrorListItemViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull
    com.woocommerce.android.ui.media.MediaUploadErrorListAdapter.MediaUploadErrorListItemViewHolder holder, int position) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B!\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\u0002\u0010\u0006J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u0018\u0010\f\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0016J\b\u0010\r\u001a\u00020\nH\u0016J\b\u0010\u000e\u001a\u00020\nH\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lcom/woocommerce/android/ui/media/MediaUploadErrorListAdapter$MediaUploadErrorDiffUtil;", "Landroidx/recyclerview/widget/DiffUtil$Callback;", "oldList", "", "Lcom/woocommerce/android/ui/media/MediaUploadErrorListViewModel$ErrorUiModel;", "newList", "(Ljava/util/List;Ljava/util/List;)V", "areContentsTheSame", "", "oldItemPosition", "", "newItemPosition", "areItemsTheSame", "getNewListSize", "getOldListSize", "WooCommerce_wasabiDebug"})
    static final class MediaUploadErrorDiffUtil extends androidx.recyclerview.widget.DiffUtil.Callback {
        private final java.util.List<com.woocommerce.android.ui.media.MediaUploadErrorListViewModel.ErrorUiModel> oldList = null;
        private final java.util.List<com.woocommerce.android.ui.media.MediaUploadErrorListViewModel.ErrorUiModel> newList = null;
        
        public MediaUploadErrorDiffUtil(@org.jetbrains.annotations.NotNull
        java.util.List<com.woocommerce.android.ui.media.MediaUploadErrorListViewModel.ErrorUiModel> oldList, @org.jetbrains.annotations.NotNull
        java.util.List<com.woocommerce.android.ui.media.MediaUploadErrorListViewModel.ErrorUiModel> newList) {
            super();
        }
        
        @java.lang.Override
        public boolean areItemsTheSame(int oldItemPosition, int newItemPosition) {
            return false;
        }
        
        @java.lang.Override
        public int getOldListSize() {
            return 0;
        }
        
        @java.lang.Override
        public int getNewListSize() {
            return 0;
        }
        
        @java.lang.Override
        public boolean areContentsTheSame(int oldItemPosition, int newItemPosition) {
            return false;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u000b"}, d2 = {"Lcom/woocommerce/android/ui/media/MediaUploadErrorListAdapter$MediaUploadErrorListItemViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "viewBinding", "Lcom/woocommerce/android/databinding/MediaUploadErrorItemBinding;", "(Lcom/woocommerce/android/databinding/MediaUploadErrorItemBinding;)V", "getViewBinding", "()Lcom/woocommerce/android/databinding/MediaUploadErrorItemBinding;", "bind", "", "model", "Lcom/woocommerce/android/ui/media/MediaUploadErrorListViewModel$ErrorUiModel;", "WooCommerce_wasabiDebug"})
    public static final class MediaUploadErrorListItemViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull
        private final com.woocommerce.android.databinding.MediaUploadErrorItemBinding viewBinding = null;
        
        public MediaUploadErrorListItemViewHolder(@org.jetbrains.annotations.NotNull
        com.woocommerce.android.databinding.MediaUploadErrorItemBinding viewBinding) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.woocommerce.android.databinding.MediaUploadErrorItemBinding getViewBinding() {
            return null;
        }
        
        public final void bind(@org.jetbrains.annotations.NotNull
        com.woocommerce.android.ui.media.MediaUploadErrorListViewModel.ErrorUiModel model) {
        }
    }
}