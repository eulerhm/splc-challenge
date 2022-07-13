package com.woocommerce.android.ui.orders.shippinglabels.creation;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0002!\"B+\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u00a2\u0006\u0002\u0010\u000bJ\b\u0010\u0015\u001a\u00020\u0016H\u0016J\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0016H\u0016J\u001c\u0010\u001a\u001a\u00020\u001b2\n\u0010\u001c\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u0016H\u0016J\u001c\u0010\u001d\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0016H\u0016R\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\fR\u000e\u0010\u0005\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R0\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006#"}, d2 = {"Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingCustomsAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingCustomsAdapter$PackageCustomsViewHolder;", "weightUnit", "", "currencyUnit", "countries", "", "Lcom/woocommerce/android/model/Location;", "listener", "Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingCustomsFormListener;", "(Ljava/lang/String;Ljava/lang/String;[Lcom/woocommerce/android/model/Location;Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingCustomsFormListener;)V", "[Lcom/woocommerce/android/model/Location;", "value", "", "Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingCustomsViewModel$CustomsPackageUiState;", "customsPackages", "getCustomsPackages", "()Ljava/util/List;", "setCustomsPackages", "(Ljava/util/List;)V", "getItemCount", "", "getItemId", "", "position", "onBindViewHolder", "", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "CustomsPackageDiffCallback", "PackageCustomsViewHolder", "WooCommerce_vanillaDebug"})
public final class ShippingCustomsAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingCustomsAdapter.PackageCustomsViewHolder> {
    private final java.lang.String weightUnit = null;
    private final java.lang.String currencyUnit = null;
    private final com.woocommerce.android.model.Location[] countries = null;
    private final com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingCustomsFormListener listener = null;
    @org.jetbrains.annotations.NotNull()
    private java.util.List<com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingCustomsViewModel.CustomsPackageUiState> customsPackages;
    
    public ShippingCustomsAdapter(@org.jetbrains.annotations.NotNull()
    java.lang.String weightUnit, @org.jetbrains.annotations.NotNull()
    java.lang.String currencyUnit, @org.jetbrains.annotations.NotNull()
    com.woocommerce.android.model.Location[] countries, @org.jetbrains.annotations.NotNull()
    com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingCustomsFormListener listener) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingCustomsViewModel.CustomsPackageUiState> getCustomsPackages() {
        return null;
    }
    
    public final void setCustomsPackages(@org.jetbrains.annotations.NotNull()
    java.util.List<com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingCustomsViewModel.CustomsPackageUiState> value) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingCustomsAdapter.PackageCustomsViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingCustomsAdapter.PackageCustomsViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public long getItemId(int position) {
        return 0L;
    }
    
    @kotlin.Suppress(names = {"MagicNumber"})
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0007R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\u0007\u001a\n \t*\u0004\u0018\u00010\b0\b8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\r8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\f\u0010\u000eR\u001b\u0010\u000f\u001a\u00020\u00108BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0012\u00a8\u0006\u0019"}, d2 = {"Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingCustomsAdapter$PackageCustomsViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/woocommerce/android/databinding/ShippingCustomsListItemBinding;", "(Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingCustomsAdapter;Lcom/woocommerce/android/databinding/ShippingCustomsListItemBinding;)V", "getBinding", "()Lcom/woocommerce/android/databinding/ShippingCustomsListItemBinding;", "context", "Landroid/content/Context;", "kotlin.jvm.PlatformType", "getContext", "()Landroid/content/Context;", "isExpanded", "", "()Z", "linesAdapter", "Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingCustomsLineAdapter;", "getLinesAdapter", "()Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingCustomsLineAdapter;", "linesAdapter$delegate", "Lkotlin/Lazy;", "bind", "", "uiState", "Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingCustomsViewModel$CustomsPackageUiState;", "WooCommerce_vanillaDebug"})
    public final class PackageCustomsViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final com.woocommerce.android.databinding.ShippingCustomsListItemBinding binding = null;
        private final kotlin.Lazy linesAdapter$delegate = null;
        
        public PackageCustomsViewHolder(@org.jetbrains.annotations.NotNull()
        com.woocommerce.android.databinding.ShippingCustomsListItemBinding binding) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.woocommerce.android.databinding.ShippingCustomsListItemBinding getBinding() {
            return null;
        }
        
        private final com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingCustomsLineAdapter getLinesAdapter() {
            return null;
        }
        
        private final android.content.Context getContext() {
            return null;
        }
        
        private final boolean isExpanded() {
            return false;
        }
        
        @android.annotation.SuppressLint(value = {"SetTextI18n"})
        public final void bind(@org.jetbrains.annotations.NotNull()
        com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingCustomsViewModel.CustomsPackageUiState uiState) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B!\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\u0002\u0010\u0006J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u0018\u0010\f\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0016J\b\u0010\r\u001a\u00020\nH\u0016J\b\u0010\u000e\u001a\u00020\nH\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingCustomsAdapter$CustomsPackageDiffCallback;", "Landroidx/recyclerview/widget/DiffUtil$Callback;", "oldList", "", "Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingCustomsViewModel$CustomsPackageUiState;", "newList", "(Ljava/util/List;Ljava/util/List;)V", "areContentsTheSame", "", "oldItemPosition", "", "newItemPosition", "areItemsTheSame", "getNewListSize", "getOldListSize", "WooCommerce_vanillaDebug"})
    static final class CustomsPackageDiffCallback extends androidx.recyclerview.widget.DiffUtil.Callback {
        private final java.util.List<com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingCustomsViewModel.CustomsPackageUiState> oldList = null;
        private final java.util.List<com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingCustomsViewModel.CustomsPackageUiState> newList = null;
        
        public CustomsPackageDiffCallback(@org.jetbrains.annotations.NotNull()
        java.util.List<com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingCustomsViewModel.CustomsPackageUiState> oldList, @org.jetbrains.annotations.NotNull()
        java.util.List<com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingCustomsViewModel.CustomsPackageUiState> newList) {
            super();
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
        public boolean areItemsTheSame(int oldItemPosition, int newItemPosition) {
            return false;
        }
        
        @java.lang.Override()
        public boolean areContentsTheSame(int oldItemPosition, int newItemPosition) {
            return false;
        }
    }
}