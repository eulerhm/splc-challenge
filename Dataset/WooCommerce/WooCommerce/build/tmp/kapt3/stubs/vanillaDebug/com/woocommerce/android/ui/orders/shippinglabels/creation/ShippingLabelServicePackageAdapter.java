package com.woocommerce.android.ui.orders.shippinglabels.creation;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00172\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0005\u0017\u0018\u0019\u001a\u001bB!\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u0012\u0006\u0010\b\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\tJ\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0016J\u0018\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u000bH\u0016J\u0018\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u000bH\u0016J\u0014\u0010\u0013\u001a\u00020\u00072\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015R\u000e\u0010\b\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001c"}, d2 = {"Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelServicePackageAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelServicePackageAdapter$ListItem;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "onChecked", "Lkotlin/Function1;", "", "", "dimensionUnit", "(Lkotlin/jvm/functions/Function1;Ljava/lang/String;)V", "getItemViewType", "", "position", "onBindViewHolder", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "updateData", "uiModels", "", "Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelCreateServicePackageViewModel$ServicePackageUiModel;", "Companion", "DiffCallback", "HeaderViewHolder", "ListItem", "PackageViewHolder", "WooCommerce_vanillaDebug"})
public final class ShippingLabelServicePackageAdapter extends androidx.recyclerview.widget.ListAdapter<com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelServicePackageAdapter.ListItem, androidx.recyclerview.widget.RecyclerView.ViewHolder> {
    private final kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> onChecked = null;
    private final java.lang.String dimensionUnit = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelServicePackageAdapter.Companion Companion = null;
    private static final int VIEW_TYPE_HEADER = 0;
    private static final int VIEW_TYPE_PACKAGE = 1;
    
    public ShippingLabelServicePackageAdapter(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onChecked, @org.jetbrains.annotations.NotNull()
    java.lang.String dimensionUnit) {
        super(null);
    }
    
    public final void updateData(@org.jetbrains.annotations.NotNull()
    java.util.List<com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelCreateServicePackageViewModel.ServicePackageUiModel> uiModels) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.recyclerview.widget.RecyclerView.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView.ViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemViewType(int position) {
        return 0;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelServicePackageAdapter$HeaderViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/woocommerce/android/databinding/ShippingPackageListHeaderBinding;", "(Lcom/woocommerce/android/databinding/ShippingPackageListHeaderBinding;)V", "bind", "", "title", "", "WooCommerce_vanillaDebug"})
    static final class HeaderViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final com.woocommerce.android.databinding.ShippingPackageListHeaderBinding binding = null;
        
        public HeaderViewHolder(@org.jetbrains.annotations.NotNull()
        com.woocommerce.android.databinding.ShippingPackageListHeaderBinding binding) {
            super(null);
        }
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        java.lang.String title) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelServicePackageAdapter$PackageViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/woocommerce/android/databinding/ShippingPackageSelectableListItemBinding;", "(Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelServicePackageAdapter;Lcom/woocommerce/android/databinding/ShippingPackageSelectableListItemBinding;)V", "bind", "", "uiModel", "Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelCreateServicePackageViewModel$ServicePackageUiModel;", "WooCommerce_vanillaDebug"})
    final class PackageViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final com.woocommerce.android.databinding.ShippingPackageSelectableListItemBinding binding = null;
        
        public PackageViewHolder(@org.jetbrains.annotations.NotNull()
        com.woocommerce.android.databinding.ShippingPackageSelectableListItemBinding binding) {
            super(null);
        }
        
        @android.annotation.SuppressLint(value = {"SetTextI18n"})
        public final void bind(@org.jetbrains.annotations.NotNull()
        com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelCreateServicePackageViewModel.ServicePackageUiModel uiModel) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u00c6\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\u0018\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016\u00a8\u0006\t"}, d2 = {"Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelServicePackageAdapter$DiffCallback;", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelServicePackageAdapter$ListItem;", "()V", "areContentsTheSame", "", "oldItem", "newItem", "areItemsTheSame", "WooCommerce_vanillaDebug"})
    public static final class DiffCallback extends androidx.recyclerview.widget.DiffUtil.ItemCallback<com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelServicePackageAdapter.ListItem> {
        @org.jetbrains.annotations.NotNull()
        public static final com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelServicePackageAdapter.DiffCallback INSTANCE = null;
        
        private DiffCallback() {
            super();
        }
        
        @java.lang.Override()
        public boolean areItemsTheSame(@org.jetbrains.annotations.NotNull()
        com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelServicePackageAdapter.ListItem oldItem, @org.jetbrains.annotations.NotNull()
        com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelServicePackageAdapter.ListItem newItem) {
            return false;
        }
        
        @java.lang.Override()
        public boolean areContentsTheSame(@org.jetbrains.annotations.NotNull()
        com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelServicePackageAdapter.ListItem oldItem, @org.jetbrains.annotations.NotNull()
        com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelServicePackageAdapter.ListItem newItem) {
            return false;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelServicePackageAdapter$ListItem;", "", "()V", "Header", "Package", "Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelServicePackageAdapter$ListItem$Header;", "Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelServicePackageAdapter$ListItem$Package;", "WooCommerce_vanillaDebug"})
    public static abstract class ListItem {
        
        private ListItem() {
            super();
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0010"}, d2 = {"Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelServicePackageAdapter$ListItem$Header;", "Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelServicePackageAdapter$ListItem;", "title", "", "(Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "WooCommerce_vanillaDebug"})
        public static final class Header extends com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelServicePackageAdapter.ListItem {
            @org.jetbrains.annotations.NotNull()
            private final java.lang.String title = null;
            
            @org.jetbrains.annotations.NotNull()
            public final com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelServicePackageAdapter.ListItem.Header copy(@org.jetbrains.annotations.NotNull()
            java.lang.String title) {
                return null;
            }
            
            @java.lang.Override()
            public boolean equals(@org.jetbrains.annotations.Nullable()
            java.lang.Object other) {
                return false;
            }
            
            @java.lang.Override()
            public int hashCode() {
                return 0;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public java.lang.String toString() {
                return null;
            }
            
            public Header(@org.jetbrains.annotations.NotNull()
            java.lang.String title) {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String component1() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String getTitle() {
                return null;
            }
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelServicePackageAdapter$ListItem$Package;", "Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelServicePackageAdapter$ListItem;", "uiModel", "Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelCreateServicePackageViewModel$ServicePackageUiModel;", "(Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelCreateServicePackageViewModel$ServicePackageUiModel;)V", "getUiModel", "()Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelCreateServicePackageViewModel$ServicePackageUiModel;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "WooCommerce_vanillaDebug"})
        public static final class Package extends com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelServicePackageAdapter.ListItem {
            @org.jetbrains.annotations.NotNull()
            private final com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelCreateServicePackageViewModel.ServicePackageUiModel uiModel = null;
            
            @org.jetbrains.annotations.NotNull()
            public final com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelServicePackageAdapter.ListItem.Package copy(@org.jetbrains.annotations.NotNull()
            com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelCreateServicePackageViewModel.ServicePackageUiModel uiModel) {
                return null;
            }
            
            @java.lang.Override()
            public boolean equals(@org.jetbrains.annotations.Nullable()
            java.lang.Object other) {
                return false;
            }
            
            @java.lang.Override()
            public int hashCode() {
                return 0;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public java.lang.String toString() {
                return null;
            }
            
            public Package(@org.jetbrains.annotations.NotNull()
            com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelCreateServicePackageViewModel.ServicePackageUiModel uiModel) {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelCreateServicePackageViewModel.ServicePackageUiModel component1() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelCreateServicePackageViewModel.ServicePackageUiModel getUiModel() {
                return null;
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelServicePackageAdapter$Companion;", "", "()V", "VIEW_TYPE_HEADER", "", "VIEW_TYPE_PACKAGE", "WooCommerce_vanillaDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}