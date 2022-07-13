package com.woocommerce.android.ui.products.settings;

import java.lang.System;

/**
 * Settings screen which enables choosing a product's visibility
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 ,2\u00020\u00012\u00020\u0002:\u0001,B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0013\u001a\u00020\u0010H\u0002J\u0014\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00160\u0015H\u0016J\b\u0010\u0017\u001a\u00020\u0010H\u0016J\b\u0010\u0018\u001a\u00020\u0010H\u0002J\u0014\u0010\u0019\u001a\u0004\u0018\u00010\u00102\b\b\u0001\u0010\u001a\u001a\u00020\u001bH\u0002J\b\u0010\u001c\u001a\u00020\u001dH\u0016J\u0012\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!H\u0016J\b\u0010\"\u001a\u00020\u001fH\u0016J\b\u0010#\u001a\u00020\u001fH\u0016J\u0010\u0010$\u001a\u00020\u001f2\u0006\u0010%\u001a\u00020&H\u0016J\u001a\u0010\'\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\b\u0010(\u001a\u0004\u0018\u00010&H\u0016J\u0010\u0010)\u001a\u00020\u001f2\u0006\u0010*\u001a\u00020\u001dH\u0002J\b\u0010+\u001a\u00020\u001dH\u0016R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u00058BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\t\u001a\u00020\n8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006-"}, d2 = {"Lcom/woocommerce/android/ui/products/settings/ProductVisibilityFragment;", "Lcom/woocommerce/android/ui/products/settings/BaseProductSettingsFragment;", "Landroid/view/View$OnClickListener;", "()V", "_binding", "Lcom/woocommerce/android/databinding/FragmentProductVisibilityBinding;", "binding", "getBinding", "()Lcom/woocommerce/android/databinding/FragmentProductVisibilityBinding;", "navArgs", "Lcom/woocommerce/android/ui/products/settings/ProductVisibilityFragmentArgs;", "getNavArgs", "()Lcom/woocommerce/android/ui/products/settings/ProductVisibilityFragmentArgs;", "navArgs$delegate", "Landroidx/navigation/NavArgsLazy;", "selectedVisibility", "", "getButtonForVisibility", "Landroid/widget/CheckedTextView;", "visibility", "getChangesResult", "Lkotlin/Pair;", "", "getFragmentTitle", "getPassword", "getVisibilityForButtonId", "buttonId", "", "hasChanges", "", "onClick", "", "view", "Landroid/view/View;", "onDestroyView", "onResume", "onSaveInstanceState", "outState", "Landroid/os/Bundle;", "onViewCreated", "savedInstanceState", "showPassword", "show", "validateChanges", "Companion", "WooCommerce_vanillaDebug"})
public final class ProductVisibilityFragment extends com.woocommerce.android.ui.products.settings.BaseProductSettingsFragment implements android.view.View.OnClickListener {
    @org.jetbrains.annotations.NotNull()
    public static final com.woocommerce.android.ui.products.settings.ProductVisibilityFragment.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ARG_VISIBILITY = "visibility";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ARG_PASSWORD = "password";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String PRODUCT_VISIBILITY_RESULT = "product-visibility";
    private com.woocommerce.android.databinding.FragmentProductVisibilityBinding _binding;
    private final androidx.navigation.NavArgsLazy navArgs$delegate = null;
    private java.lang.String selectedVisibility;
    
    public ProductVisibilityFragment() {
        super();
    }
    
    private final com.woocommerce.android.databinding.FragmentProductVisibilityBinding getBinding() {
        return null;
    }
    
    private final com.woocommerce.android.ui.products.settings.ProductVisibilityFragmentArgs getNavArgs() {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onDestroyView() {
    }
    
    @java.lang.Override()
    public void onSaveInstanceState(@org.jetbrains.annotations.NotNull()
    android.os.Bundle outState) {
    }
    
    @java.lang.Override()
    public void onClick(@org.jetbrains.annotations.Nullable()
    android.view.View view) {
    }
    
    private final void showPassword(boolean show) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public kotlin.Pair<java.lang.String, java.lang.Object> getChangesResult() {
        return null;
    }
    
    @java.lang.Override()
    public boolean hasChanges() {
        return false;
    }
    
    @java.lang.Override()
    public void onResume() {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getFragmentTitle() {
        return null;
    }
    
    @java.lang.Override()
    public boolean validateChanges() {
        return false;
    }
    
    private final android.widget.CheckedTextView getButtonForVisibility(java.lang.String visibility) {
        return null;
    }
    
    private final java.lang.String getVisibilityForButtonId(@androidx.annotation.IdRes()
    int buttonId) {
        return null;
    }
    
    private final java.lang.String getPassword() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"}, d2 = {"Lcom/woocommerce/android/ui/products/settings/ProductVisibilityFragment$Companion;", "", "()V", "ARG_PASSWORD", "", "ARG_VISIBILITY", "PRODUCT_VISIBILITY_RESULT", "WooCommerce_vanillaDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}