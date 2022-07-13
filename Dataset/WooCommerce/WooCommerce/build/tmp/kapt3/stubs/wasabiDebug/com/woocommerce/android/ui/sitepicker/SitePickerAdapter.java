package com.woocommerce.android.ui.sitepicker;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0003R\u00020\u00000\u0001:\u0002\u0013\u0014B\u0019\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u00a2\u0006\u0002\u0010\bJ\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u001c\u0010\r\u001a\u00020\u00072\n\u0010\u000e\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u001c\u0010\u000f\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\fH\u0016R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lcom/woocommerce/android/ui/sitepicker/SitePickerAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "Lcom/woocommerce/android/ui/sitepicker/SitePickerViewModel$SiteUiModel;", "Lcom/woocommerce/android/ui/sitepicker/SitePickerAdapter$SiteViewHolder;", "onSiteSelected", "Lkotlin/Function1;", "Lorg/wordpress/android/fluxc/model/SiteModel;", "", "(Lkotlin/jvm/functions/Function1;)V", "getItemId", "", "position", "", "onBindViewHolder", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "SiteUIModelDiffCallback", "SiteViewHolder", "WooCommerce_wasabiDebug"})
public final class SitePickerAdapter extends androidx.recyclerview.widget.ListAdapter<com.woocommerce.android.ui.sitepicker.SitePickerViewModel.SiteUiModel, com.woocommerce.android.ui.sitepicker.SitePickerAdapter.SiteViewHolder> {
    private final kotlin.jvm.functions.Function1<org.wordpress.android.fluxc.model.SiteModel, kotlin.Unit> onSiteSelected = null;
    
    public SitePickerAdapter(@org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super org.wordpress.android.fluxc.model.SiteModel, kotlin.Unit> onSiteSelected) {
        super(null);
    }
    
    @java.lang.Override
    public long getItemId(int position) {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public com.woocommerce.android.ui.sitepicker.SitePickerAdapter.SiteViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull
    com.woocommerce.android.ui.sitepicker.SitePickerAdapter.SiteViewHolder holder, int position) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u000b"}, d2 = {"Lcom/woocommerce/android/ui/sitepicker/SitePickerAdapter$SiteViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "viewBinding", "Lcom/woocommerce/android/databinding/SitePickerItemBinding;", "(Lcom/woocommerce/android/ui/sitepicker/SitePickerAdapter;Lcom/woocommerce/android/databinding/SitePickerItemBinding;)V", "getViewBinding", "()Lcom/woocommerce/android/databinding/SitePickerItemBinding;", "bind", "", "siteUiModel", "Lcom/woocommerce/android/ui/sitepicker/SitePickerViewModel$SiteUiModel;", "WooCommerce_wasabiDebug"})
    public final class SiteViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull
        private final com.woocommerce.android.databinding.SitePickerItemBinding viewBinding = null;
        
        public SiteViewHolder(@org.jetbrains.annotations.NotNull
        com.woocommerce.android.databinding.SitePickerItemBinding viewBinding) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.woocommerce.android.databinding.SitePickerItemBinding getViewBinding() {
            return null;
        }
        
        public final void bind(@org.jetbrains.annotations.NotNull
        com.woocommerce.android.ui.sitepicker.SitePickerViewModel.SiteUiModel siteUiModel) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u00c6\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\u0018\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016\u00a8\u0006\t"}, d2 = {"Lcom/woocommerce/android/ui/sitepicker/SitePickerAdapter$SiteUIModelDiffCallback;", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Lcom/woocommerce/android/ui/sitepicker/SitePickerViewModel$SiteUiModel;", "()V", "areContentsTheSame", "", "oldItem", "newItem", "areItemsTheSame", "WooCommerce_wasabiDebug"})
    public static final class SiteUIModelDiffCallback extends androidx.recyclerview.widget.DiffUtil.ItemCallback<com.woocommerce.android.ui.sitepicker.SitePickerViewModel.SiteUiModel> {
        @org.jetbrains.annotations.NotNull
        public static final com.woocommerce.android.ui.sitepicker.SitePickerAdapter.SiteUIModelDiffCallback INSTANCE = null;
        
        private SiteUIModelDiffCallback() {
            super();
        }
        
        @java.lang.Override
        public boolean areItemsTheSame(@org.jetbrains.annotations.NotNull
        com.woocommerce.android.ui.sitepicker.SitePickerViewModel.SiteUiModel oldItem, @org.jetbrains.annotations.NotNull
        com.woocommerce.android.ui.sitepicker.SitePickerViewModel.SiteUiModel newItem) {
            return false;
        }
        
        @java.lang.Override
        public boolean areContentsTheSame(@org.jetbrains.annotations.NotNull
        com.woocommerce.android.ui.sitepicker.SitePickerViewModel.SiteUiModel oldItem, @org.jetbrains.annotations.NotNull
        com.woocommerce.android.ui.sitepicker.SitePickerViewModel.SiteUiModel newItem) {
            return false;
        }
    }
}