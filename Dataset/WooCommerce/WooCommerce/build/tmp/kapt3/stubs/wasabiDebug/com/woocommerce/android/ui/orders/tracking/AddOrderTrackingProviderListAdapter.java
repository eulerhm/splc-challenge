package com.woocommerce.android.ui.orders.tracking;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0004\u001f !\"B!\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0006\u0010\u0014\u001a\u00020\u0015J\u000e\u0010\u0016\u001a\b\u0018\u00010\u0017R\u00020\u0000H\u0002J\u000e\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0005J\u0014\u0010\u001b\u001a\u00020\u00152\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u000b0\u001dJ\u0016\u0010\u001e\u001a\u00020\u00152\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u000b0\u001dH\u0002R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001e\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u000b0\nj\b\u0012\u0004\u0012\u00020\u000b`\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\u000b0\nj\b\u0012\u0004\u0012\u00020\u000b`\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R$\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u0005@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006#"}, d2 = {"Lcom/woocommerce/android/ui/orders/tracking/AddOrderTrackingProviderListAdapter;", "Lcom/woocommerce/android/widgets/sectionedrecyclerview/SectionedRecyclerViewAdapter;", "context", "Landroid/content/Context;", "storeCountry", "", "listener", "Lcom/woocommerce/android/ui/orders/tracking/AddOrderTrackingProviderListAdapter$OnProviderClickListener;", "(Landroid/content/Context;Ljava/lang/String;Lcom/woocommerce/android/ui/orders/tracking/AddOrderTrackingProviderListAdapter$OnProviderClickListener;)V", "providerList", "Ljava/util/ArrayList;", "Lcom/woocommerce/android/model/OrderShipmentProvider;", "Lkotlin/collections/ArrayList;", "providerSearchList", "value", "selectedCarrierName", "getSelectedCarrierName", "()Ljava/lang/String;", "setSelectedCarrierName", "(Ljava/lang/String;)V", "clearAdapterData", "", "getCustomProviderSection", "Lcom/woocommerce/android/ui/orders/tracking/AddOrderTrackingProviderListAdapter$ProviderListSection;", "getSectionItemsTotal", "", "title", "setProviders", "providers", "", "updateAdapter", "HeaderViewHolder", "ItemViewHolder", "OnProviderClickListener", "ProviderListSection", "WooCommerce_wasabiDebug"})
public final class AddOrderTrackingProviderListAdapter extends com.woocommerce.android.widgets.sectionedrecyclerview.SectionedRecyclerViewAdapter {
    private final android.content.Context context = null;
    private final java.lang.String storeCountry = null;
    private final com.woocommerce.android.ui.orders.tracking.AddOrderTrackingProviderListAdapter.OnProviderClickListener listener = null;
    private java.util.ArrayList<com.woocommerce.android.model.OrderShipmentProvider> providerList;
    private java.util.ArrayList<com.woocommerce.android.model.OrderShipmentProvider> providerSearchList;
    @org.jetbrains.annotations.NotNull
    private java.lang.String selectedCarrierName = "";
    
    public AddOrderTrackingProviderListAdapter(@org.jetbrains.annotations.Nullable
    android.content.Context context, @org.jetbrains.annotations.Nullable
    java.lang.String storeCountry, @org.jetbrains.annotations.NotNull
    com.woocommerce.android.ui.orders.tracking.AddOrderTrackingProviderListAdapter.OnProviderClickListener listener) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getSelectedCarrierName() {
        return null;
    }
    
    public final void setSelectedCarrierName(@org.jetbrains.annotations.NotNull
    java.lang.String value) {
    }
    
    public final void setProviders(@org.jetbrains.annotations.NotNull
    java.util.List<com.woocommerce.android.model.OrderShipmentProvider> providers) {
    }
    
    public final void clearAdapterData() {
    }
    
    /**
     * returns the total item count in a given section
     * @param title = the title of the section
     */
    public final int getSectionItemsTotal(@org.jetbrains.annotations.NotNull
    java.lang.String title) {
        return 0;
    }
    
    private final void updateAdapter(java.util.List<com.woocommerce.android.model.OrderShipmentProvider> providers) {
    }
    
    /**
     * Create a section to display custom provider at the top of the list
     */
    private final com.woocommerce.android.ui.orders.tracking.AddOrderTrackingProviderListAdapter.ProviderListSection getCustomProviderSection() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/woocommerce/android/ui/orders/tracking/AddOrderTrackingProviderListAdapter$OnProviderClickListener;", "", "onProviderClick", "", "provider", "Lcom/woocommerce/android/model/OrderShipmentProvider;", "WooCommerce_wasabiDebug"})
    public static abstract interface OnProviderClickListener {
        
        public abstract void onProviderClick(@org.jetbrains.annotations.NotNull
        com.woocommerce.android.model.OrderShipmentProvider provider);
    }
    
    /**
     * Custom class represents a single [OrderShipmentProvider.country]
     * and it's assigned list of [OrderShipmentProvider].
     * Responsible for providing and populating the header and item view holders.
     */
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\u0002\u0010\u0007J\b\u0010\f\u001a\u00020\rH\u0016J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0010\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u000fH\u0016J\u0018\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\rH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\u0018"}, d2 = {"Lcom/woocommerce/android/ui/orders/tracking/AddOrderTrackingProviderListAdapter$ProviderListSection;", "Lcom/woocommerce/android/widgets/sectionedrecyclerview/StatelessSection;", "country", "", "list", "", "Lcom/woocommerce/android/model/OrderShipmentProvider;", "(Lcom/woocommerce/android/ui/orders/tracking/AddOrderTrackingProviderListAdapter;Ljava/lang/String;Ljava/util/List;)V", "getCountry", "()Ljava/lang/String;", "getList", "()Ljava/util/List;", "getContentItemsTotal", "", "getHeaderViewHolder", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "getItemViewHolder", "onBindHeaderViewHolder", "", "holder", "onBindItemViewHolder", "position", "WooCommerce_wasabiDebug"})
    final class ProviderListSection extends com.woocommerce.android.widgets.sectionedrecyclerview.StatelessSection {
        @org.jetbrains.annotations.NotNull
        private final java.lang.String country = null;
        @org.jetbrains.annotations.NotNull
        private final java.util.List<com.woocommerce.android.model.OrderShipmentProvider> list = null;
        
        public ProviderListSection(@org.jetbrains.annotations.NotNull
        java.lang.String country, @org.jetbrains.annotations.NotNull
        java.util.List<com.woocommerce.android.model.OrderShipmentProvider> list) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getCountry() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.util.List<com.woocommerce.android.model.OrderShipmentProvider> getList() {
            return null;
        }
        
        @java.lang.Override
        public int getContentItemsTotal() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull
        @java.lang.Override
        public androidx.recyclerview.widget.RecyclerView.ViewHolder getItemViewHolder(@org.jetbrains.annotations.NotNull
        android.view.View view) {
            return null;
        }
        
        @java.lang.Override
        public void onBindItemViewHolder(@org.jetbrains.annotations.NotNull
        androidx.recyclerview.widget.RecyclerView.ViewHolder holder, int position) {
        }
        
        @org.jetbrains.annotations.NotNull
        @java.lang.Override
        public androidx.recyclerview.widget.RecyclerView.ViewHolder getHeaderViewHolder(@org.jetbrains.annotations.NotNull
        android.view.View view) {
            return null;
        }
        
        @java.lang.Override
        public void onBindHeaderViewHolder(@org.jetbrains.annotations.NotNull
        androidx.recyclerview.widget.RecyclerView.ViewHolder holder) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/woocommerce/android/ui/orders/tracking/AddOrderTrackingProviderListAdapter$ItemViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "viewBinding", "Lcom/woocommerce/android/databinding/DialogOrderTrackingProviderListItemBinding;", "(Lcom/woocommerce/android/ui/orders/tracking/AddOrderTrackingProviderListAdapter;Lcom/woocommerce/android/databinding/DialogOrderTrackingProviderListItemBinding;)V", "bind", "", "provider", "Lcom/woocommerce/android/model/OrderShipmentProvider;", "WooCommerce_wasabiDebug"})
    final class ItemViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private com.woocommerce.android.databinding.DialogOrderTrackingProviderListItemBinding viewBinding;
        
        public ItemViewHolder(@org.jetbrains.annotations.NotNull
        com.woocommerce.android.databinding.DialogOrderTrackingProviderListItemBinding viewBinding) {
            super(null);
        }
        
        public final void bind(@org.jetbrains.annotations.NotNull
        com.woocommerce.android.model.OrderShipmentProvider provider) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/woocommerce/android/ui/orders/tracking/AddOrderTrackingProviderListAdapter$HeaderViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "viewBinding", "Lcom/woocommerce/android/databinding/DialogOrderTrackingProviderListHeaderBinding;", "(Lcom/woocommerce/android/databinding/DialogOrderTrackingProviderListHeaderBinding;)V", "bind", "", "country", "", "WooCommerce_wasabiDebug"})
    static final class HeaderViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private com.woocommerce.android.databinding.DialogOrderTrackingProviderListHeaderBinding viewBinding;
        
        public HeaderViewHolder(@org.jetbrains.annotations.NotNull
        com.woocommerce.android.databinding.DialogOrderTrackingProviderListHeaderBinding viewBinding) {
            super(null);
        }
        
        public final void bind(@org.jetbrains.annotations.NotNull
        java.lang.String country) {
        }
    }
}