package com.woocommerce.android.ui.products.addons.options;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u0015B\'\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007\u00a2\u0006\u0002\u0010\nJ\b\u0010\u000b\u001a\u00020\fH\u0016J\u001c\u0010\r\u001a\u00020\u000e2\n\u0010\u000f\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0010\u001a\u00020\fH\u0016J\u001c\u0010\u0011\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\fH\u0016R\u001a\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"}, d2 = {"Lcom/woocommerce/android/ui/products/addons/options/AddonOptionListAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/woocommerce/android/ui/products/addons/options/AddonOptionListAdapter$AddonOptionsViewHolder;", "options", "", "Lorg/wordpress/android/fluxc/domain/Addon$HasOptions$Option;", "formatCurrencyForDisplay", "Lkotlin/Function1;", "Ljava/math/BigDecimal;", "", "(Ljava/util/List;Lkotlin/jvm/functions/Function1;)V", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "AddonOptionsViewHolder", "WooCommerce_vanillaDebug"})
public final class AddonOptionListAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.woocommerce.android.ui.products.addons.options.AddonOptionListAdapter.AddonOptionsViewHolder> {
    private final java.util.List<org.wordpress.android.fluxc.domain.Addon.HasOptions.Option> options = null;
    private final kotlin.jvm.functions.Function1<java.math.BigDecimal, java.lang.String> formatCurrencyForDisplay = null;
    
    public AddonOptionListAdapter(@org.jetbrains.annotations.NotNull()
    java.util.List<org.wordpress.android.fluxc.domain.Addon.HasOptions.Option> options, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.math.BigDecimal, java.lang.String> formatCurrencyForDisplay) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.woocommerce.android.ui.products.addons.options.AddonOptionListAdapter.AddonOptionsViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.woocommerce.android.ui.products.addons.options.AddonOptionListAdapter.AddonOptionsViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u000b"}, d2 = {"Lcom/woocommerce/android/ui/products/addons/options/AddonOptionListAdapter$AddonOptionsViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/woocommerce/android/databinding/ProductAddonOptionItemBinding;", "(Lcom/woocommerce/android/ui/products/addons/options/AddonOptionListAdapter;Lcom/woocommerce/android/databinding/ProductAddonOptionItemBinding;)V", "getBinding", "()Lcom/woocommerce/android/databinding/ProductAddonOptionItemBinding;", "bind", "", "option", "Lorg/wordpress/android/fluxc/domain/Addon$HasOptions$Option;", "WooCommerce_vanillaDebug"})
    public final class AddonOptionsViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final com.woocommerce.android.databinding.ProductAddonOptionItemBinding binding = null;
        
        public AddonOptionsViewHolder(@org.jetbrains.annotations.NotNull()
        com.woocommerce.android.databinding.ProductAddonOptionItemBinding binding) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.woocommerce.android.databinding.ProductAddonOptionItemBinding getBinding() {
            return null;
        }
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        org.wordpress.android.fluxc.domain.Addon.HasOptions.Option option) {
        }
    }
}