package com.woocommerce.android.ui.products.settings;

import java.lang.System;

/**
 * Settings screen which enables editing a product's menu order
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000  2\u00020\u0001:\u0001 B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0014\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000fH\u0016J\b\u0010\u0012\u001a\u00020\u0010H\u0016J\b\u0010\u0013\u001a\u00020\u0014H\u0002J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\b\u0010\u0017\u001a\u00020\u0018H\u0016J\b\u0010\u0019\u001a\u00020\u0018H\u0016J\u001a\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0016J\b\u0010\u001f\u001a\u00020\u0016H\u0016R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u00020\u00048BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\b\u001a\u00020\t8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000b\u00a8\u0006!"}, d2 = {"Lcom/woocommerce/android/ui/products/settings/ProductMenuOrderFragment;", "Lcom/woocommerce/android/ui/products/settings/BaseProductSettingsFragment;", "()V", "_binding", "Lcom/woocommerce/android/databinding/FragmentProductMenuOrderBinding;", "binding", "getBinding", "()Lcom/woocommerce/android/databinding/FragmentProductMenuOrderBinding;", "navArgs", "Lcom/woocommerce/android/ui/products/settings/ProductMenuOrderFragmentArgs;", "getNavArgs", "()Lcom/woocommerce/android/ui/products/settings/ProductMenuOrderFragmentArgs;", "navArgs$delegate", "Landroidx/navigation/NavArgsLazy;", "getChangesResult", "Lkotlin/Pair;", "", "", "getFragmentTitle", "getMenuOrder", "", "hasChanges", "", "onDestroyView", "", "onResume", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "validateChanges", "Companion", "WooCommerce_wasabiDebug"})
public final class ProductMenuOrderFragment extends com.woocommerce.android.ui.products.settings.BaseProductSettingsFragment {
    @org.jetbrains.annotations.NotNull
    public static final com.woocommerce.android.ui.products.settings.ProductMenuOrderFragment.Companion Companion = null;
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String ARG_MENU_ORDER = "menu_order";
    private final androidx.navigation.NavArgsLazy navArgs$delegate = null;
    private com.woocommerce.android.databinding.FragmentProductMenuOrderBinding _binding;
    
    public ProductMenuOrderFragment() {
        super();
    }
    
    private final com.woocommerce.android.ui.products.settings.ProductMenuOrderFragmentArgs getNavArgs() {
        return null;
    }
    
    private final com.woocommerce.android.databinding.FragmentProductMenuOrderBinding getBinding() {
        return null;
    }
    
    @java.lang.Override
    public void onViewCreated(@org.jetbrains.annotations.NotNull
    android.view.View view, @org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override
    public void onDestroyView() {
    }
    
    @java.lang.Override
    public boolean hasChanges() {
        return false;
    }
    
    @java.lang.Override
    public boolean validateChanges() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public kotlin.Pair<java.lang.String, java.lang.Object> getChangesResult() {
        return null;
    }
    
    private final int getMenuOrder() {
        return 0;
    }
    
    @java.lang.Override
    public void onResume() {
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.lang.String getFragmentTitle() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/woocommerce/android/ui/products/settings/ProductMenuOrderFragment$Companion;", "", "()V", "ARG_MENU_ORDER", "", "WooCommerce_wasabiDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}