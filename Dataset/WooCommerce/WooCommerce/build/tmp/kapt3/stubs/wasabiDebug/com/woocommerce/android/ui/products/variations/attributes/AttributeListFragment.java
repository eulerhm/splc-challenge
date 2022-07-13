package com.woocommerce.android.ui.products.variations.attributes;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 42\u00020\u0001:\u00014B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0017\u001a\u00020\u0018H\u0016J\b\u0010\u0019\u001a\u00020\u001aH\u0002J\u0012\u0010\u001b\u001a\u00020\u001a2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0002J\u0018\u0010\u001e\u001a\u00020\u001a2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"H\u0016J\b\u0010#\u001a\u00020\u001aH\u0016J\u0010\u0010$\u001a\u00020\t2\u0006\u0010%\u001a\u00020\u0014H\u0016J\b\u0010&\u001a\u00020\tH\u0016J\b\u0010\'\u001a\u00020\u001aH\u0016J\u0010\u0010(\u001a\u00020\u001a2\u0006\u0010)\u001a\u00020\u001dH\u0016J\u001a\u0010*\u001a\u00020\u001a2\u0006\u0010+\u001a\u00020,2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016J\b\u0010-\u001a\u00020\u001aH\u0002J\u0016\u0010.\u001a\u00020\u001a2\f\u0010/\u001a\b\u0012\u0004\u0012\u00020100H\u0002J\u0010\u00102\u001a\u00020\u001a2\u0006\u00103\u001a\u00020\tH\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u00020\u00048BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\t8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\b\u0010\nR\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\r\u001a\u00020\u000e8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u00065"}, d2 = {"Lcom/woocommerce/android/ui/products/variations/attributes/AttributeListFragment;", "Lcom/woocommerce/android/ui/products/BaseProductFragment;", "()V", "_binding", "Lcom/woocommerce/android/databinding/FragmentAttributeListBinding;", "binding", "getBinding", "()Lcom/woocommerce/android/databinding/FragmentAttributeListBinding;", "isGeneratingVariation", "", "()Z", "layoutManager", "Landroidx/recyclerview/widget/RecyclerView$LayoutManager;", "navArgs", "Lcom/woocommerce/android/ui/products/variations/attributes/AttributeListFragmentArgs;", "getNavArgs", "()Lcom/woocommerce/android/ui/products/variations/attributes/AttributeListFragmentArgs;", "navArgs$delegate", "Landroidx/navigation/NavArgsLazy;", "nextMenuItem", "Landroid/view/MenuItem;", "progressDialog", "Lcom/woocommerce/android/widgets/CustomProgressDialog;", "getFragmentTitle", "", "hideProgressDialog", "", "initializeViews", "savedInstanceState", "Landroid/os/Bundle;", "onCreateOptionsMenu", "menu", "Landroid/view/Menu;", "inflater", "Landroid/view/MenuInflater;", "onDestroyView", "onOptionsItemSelected", "item", "onRequestAllowBackPress", "onResume", "onSaveInstanceState", "outState", "onViewCreated", "view", "Landroid/view/View;", "setupObservers", "showAttributes", "attributes", "", "Lcom/woocommerce/android/model/ProductAttribute;", "showProgressDialog", "show", "Companion", "WooCommerce_wasabiDebug"})
@dagger.hilt.android.AndroidEntryPoint
public final class AttributeListFragment extends com.woocommerce.android.ui.products.BaseProductFragment {
    @org.jetbrains.annotations.NotNull
    public static final com.woocommerce.android.ui.products.variations.attributes.AttributeListFragment.Companion Companion = null;
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String TAG = "AttributeListFragment";
    private static final java.lang.String LIST_STATE_KEY = "list_state";
    private static final int ID_ATTRIBUTE_LIST = 1;
    private androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager;
    private com.woocommerce.android.widgets.CustomProgressDialog progressDialog;
    private android.view.MenuItem nextMenuItem;
    private final androidx.navigation.NavArgsLazy navArgs$delegate = null;
    private com.woocommerce.android.databinding.FragmentAttributeListBinding _binding;
    
    public AttributeListFragment() {
        super();
    }
    
    private final com.woocommerce.android.ui.products.variations.attributes.AttributeListFragmentArgs getNavArgs() {
        return null;
    }
    
    private final com.woocommerce.android.databinding.FragmentAttributeListBinding getBinding() {
        return null;
    }
    
    private final boolean isGeneratingVariation() {
        return false;
    }
    
    @java.lang.Override
    public void onViewCreated(@org.jetbrains.annotations.NotNull
    android.view.View view, @org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override
    public void onResume() {
    }
    
    @java.lang.Override
    public void onSaveInstanceState(@org.jetbrains.annotations.NotNull
    android.os.Bundle outState) {
    }
    
    @java.lang.Override
    public void onCreateOptionsMenu(@org.jetbrains.annotations.NotNull
    android.view.Menu menu, @org.jetbrains.annotations.NotNull
    android.view.MenuInflater inflater) {
    }
    
    @java.lang.Override
    public boolean onOptionsItemSelected(@org.jetbrains.annotations.NotNull
    android.view.MenuItem item) {
        return false;
    }
    
    private final void initializeViews(android.os.Bundle savedInstanceState) {
    }
    
    private final void setupObservers() {
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.lang.String getFragmentTitle() {
        return null;
    }
    
    @java.lang.Override
    public void onDestroyView() {
    }
    
    @java.lang.Override
    public boolean onRequestAllowBackPress() {
        return false;
    }
    
    private final void showAttributes(java.util.List<com.woocommerce.android.model.ProductAttribute> attributes) {
    }
    
    private final void showProgressDialog(boolean show) {
    }
    
    private final void hideProgressDialog() {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lcom/woocommerce/android/ui/products/variations/attributes/AttributeListFragment$Companion;", "", "()V", "ID_ATTRIBUTE_LIST", "", "LIST_STATE_KEY", "", "TAG", "WooCommerce_wasabiDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}