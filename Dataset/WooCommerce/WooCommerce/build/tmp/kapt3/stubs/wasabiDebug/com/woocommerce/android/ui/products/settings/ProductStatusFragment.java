package com.woocommerce.android.ui.products.settings;

import java.lang.System;

/**
 * Settings screen which enables choosing a product status
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 *2\u00020\u00012\u00020\u0002:\u0001*B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0013\u001a\u00020\u0010H\u0002J\u0014\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00160\u0015H\u0016J\b\u0010\u0017\u001a\u00020\u0010H\u0016J\u0012\u0010\u0018\u001a\u00020\u00102\b\b\u0001\u0010\u0019\u001a\u00020\u001aH\u0002J\b\u0010\u001b\u001a\u00020\u001cH\u0016J\u0012\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0016J\u0012\u0010!\u001a\u00020\u001e2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0016J\b\u0010$\u001a\u00020\u001eH\u0016J\b\u0010%\u001a\u00020\u001eH\u0016J\u0010\u0010&\u001a\u00020\u001e2\u0006\u0010\'\u001a\u00020#H\u0016J\u001a\u0010(\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0016J\b\u0010)\u001a\u00020\u001cH\u0016R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u00058BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\t\u001a\u00020\n8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\u000f\u001a\u00020\u0010X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006+"}, d2 = {"Lcom/woocommerce/android/ui/products/settings/ProductStatusFragment;", "Lcom/woocommerce/android/ui/products/settings/BaseProductSettingsFragment;", "Landroid/view/View$OnClickListener;", "()V", "_binding", "Lcom/woocommerce/android/databinding/FragmentProductStatusBinding;", "binding", "getBinding", "()Lcom/woocommerce/android/databinding/FragmentProductStatusBinding;", "navArgs", "Lcom/woocommerce/android/ui/products/settings/ProductStatusFragmentArgs;", "getNavArgs", "()Lcom/woocommerce/android/ui/products/settings/ProductStatusFragmentArgs;", "navArgs$delegate", "Landroidx/navigation/NavArgsLazy;", "selectedStatus", "", "getButtonForStatus", "Landroid/widget/CheckedTextView;", "status", "getChangesResult", "Lkotlin/Pair;", "Lcom/woocommerce/android/ui/products/ProductStatus;", "getFragmentTitle", "getStatusForButtonId", "buttonId", "", "hasChanges", "", "onClick", "", "view", "Landroid/view/View;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyView", "onResume", "onSaveInstanceState", "outState", "onViewCreated", "validateChanges", "Companion", "WooCommerce_wasabiDebug"})
public final class ProductStatusFragment extends com.woocommerce.android.ui.products.settings.BaseProductSettingsFragment implements android.view.View.OnClickListener {
    @org.jetbrains.annotations.NotNull
    public static final com.woocommerce.android.ui.products.settings.ProductStatusFragment.Companion Companion = null;
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String ARG_SELECTED_STATUS = "selected_status";
    private final androidx.navigation.NavArgsLazy navArgs$delegate = null;
    private java.lang.String selectedStatus;
    private com.woocommerce.android.databinding.FragmentProductStatusBinding _binding;
    
    public ProductStatusFragment() {
        super();
    }
    
    private final com.woocommerce.android.ui.products.settings.ProductStatusFragmentArgs getNavArgs() {
        return null;
    }
    
    private final com.woocommerce.android.databinding.FragmentProductStatusBinding getBinding() {
        return null;
    }
    
    @java.lang.Override
    public void onCreate(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
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
    public void onSaveInstanceState(@org.jetbrains.annotations.NotNull
    android.os.Bundle outState) {
    }
    
    @java.lang.Override
    public void onClick(@org.jetbrains.annotations.Nullable
    android.view.View view) {
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public kotlin.Pair<java.lang.String, com.woocommerce.android.ui.products.ProductStatus> getChangesResult() {
        return null;
    }
    
    @java.lang.Override
    public boolean hasChanges() {
        return false;
    }
    
    @java.lang.Override
    public boolean validateChanges() {
        return false;
    }
    
    @java.lang.Override
    public void onResume() {
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.lang.String getFragmentTitle() {
        return null;
    }
    
    private final android.widget.CheckedTextView getButtonForStatus(java.lang.String status) {
        return null;
    }
    
    private final java.lang.String getStatusForButtonId(@androidx.annotation.IdRes
    int buttonId) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/woocommerce/android/ui/products/settings/ProductStatusFragment$Companion;", "", "()V", "ARG_SELECTED_STATUS", "", "WooCommerce_wasabiDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}