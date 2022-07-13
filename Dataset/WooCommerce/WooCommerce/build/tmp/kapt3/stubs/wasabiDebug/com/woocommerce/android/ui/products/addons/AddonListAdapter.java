package com.woocommerce.android.ui.products.addons;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u0017B1\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\fJ\b\u0010\r\u001a\u00020\u000eH\u0016J\u001c\u0010\u000f\u001a\u00020\u00102\n\u0010\u0011\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u000eH\u0016J\u001c\u0010\u0013\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000eH\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"}, d2 = {"Lcom/woocommerce/android/ui/products/addons/AddonListAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/woocommerce/android/ui/products/addons/AddonListAdapter$AddonsViewHolder;", "addons", "", "Lorg/wordpress/android/fluxc/domain/Addon;", "formatCurrencyForDisplay", "Lkotlin/Function1;", "Ljava/math/BigDecimal;", "", "orderMode", "", "(Ljava/util/List;Lkotlin/jvm/functions/Function1;Z)V", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "AddonsViewHolder", "WooCommerce_wasabiDebug"})
public final class AddonListAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.woocommerce.android.ui.products.addons.AddonListAdapter.AddonsViewHolder> {
    private final java.util.List<org.wordpress.android.fluxc.domain.Addon> addons = null;
    private final kotlin.jvm.functions.Function1<java.math.BigDecimal, java.lang.String> formatCurrencyForDisplay = null;
    private final boolean orderMode = false;
    
    public AddonListAdapter(@org.jetbrains.annotations.NotNull
    java.util.List<? extends org.wordpress.android.fluxc.domain.Addon> addons, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super java.math.BigDecimal, java.lang.String> formatCurrencyForDisplay, boolean orderMode) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public com.woocommerce.android.ui.products.addons.AddonListAdapter.AddonsViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull
    com.woocommerce.android.ui.products.addons.AddonListAdapter.AddonsViewHolder holder, int position) {
    }
    
    @java.lang.Override
    public int getItemCount() {
        return 0;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/woocommerce/android/ui/products/addons/AddonListAdapter$AddonsViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "addonCard", "Lcom/woocommerce/android/ui/products/addons/ProductAddonCard;", "(Lcom/woocommerce/android/ui/products/addons/AddonListAdapter;Lcom/woocommerce/android/ui/products/addons/ProductAddonCard;)V", "getAddonCard", "()Lcom/woocommerce/android/ui/products/addons/ProductAddonCard;", "WooCommerce_wasabiDebug"})
    public final class AddonsViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull
        private final com.woocommerce.android.ui.products.addons.ProductAddonCard addonCard = null;
        
        public AddonsViewHolder(@org.jetbrains.annotations.NotNull
        com.woocommerce.android.ui.products.addons.ProductAddonCard addonCard) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.woocommerce.android.ui.products.addons.ProductAddonCard getAddonCard() {
            return null;
        }
    }
}