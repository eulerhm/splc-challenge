package com.woocommerce.android.ui.products.variations.attributes;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 12\u00020\u0001:\u00011B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\u0012\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0002J\u0018\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\u0016J\b\u0010\u001f\u001a\u00020\u0017H\u0016J\u0010\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u000bH\u0016J\b\u0010#\u001a\u00020!H\u0016J\b\u0010$\u001a\u00020\u0017H\u0016J\u0010\u0010%\u001a\u00020\u00172\u0006\u0010&\u001a\u00020\u0019H\u0016J\u001a\u0010\'\u001a\u00020\u00172\u0006\u0010(\u001a\u00020)2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J\b\u0010*\u001a\u00020\u0017H\u0002J\u0016\u0010+\u001a\u00020\u00172\f\u0010,\u001a\b\u0012\u0004\u0012\u00020.0-H\u0002J\u0010\u0010/\u001a\u00020\u00172\u0006\u00100\u001a\u00020!H\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u00020\u00048BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\f\u001a\u00020\r8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u00062"}, d2 = {"Lcom/woocommerce/android/ui/products/variations/attributes/AddAttributeFragment;", "Lcom/woocommerce/android/ui/products/BaseProductFragment;", "()V", "_binding", "Lcom/woocommerce/android/databinding/FragmentAddAttributeBinding;", "binding", "getBinding", "()Lcom/woocommerce/android/databinding/FragmentAddAttributeBinding;", "layoutManager", "Landroidx/recyclerview/widget/RecyclerView$LayoutManager;", "moveNextMenuItem", "Landroid/view/MenuItem;", "navArgs", "Lcom/woocommerce/android/ui/products/variations/attributes/AddAttributeFragmentArgs;", "getNavArgs", "()Lcom/woocommerce/android/ui/products/variations/attributes/AddAttributeFragmentArgs;", "navArgs$delegate", "Landroidx/navigation/NavArgsLazy;", "skeletonView", "Lcom/woocommerce/android/widgets/SkeletonView;", "getFragmentTitle", "", "initializeViews", "", "savedInstanceState", "Landroid/os/Bundle;", "onCreateOptionsMenu", "menu", "Landroid/view/Menu;", "inflater", "Landroid/view/MenuInflater;", "onDestroyView", "onOptionsItemSelected", "", "item", "onRequestAllowBackPress", "onResume", "onSaveInstanceState", "outState", "onViewCreated", "view", "Landroid/view/View;", "setupObservers", "showAttributes", "globalAttributes", "", "Lcom/woocommerce/android/model/ProductGlobalAttribute;", "showSkeleton", "show", "Companion", "WooCommerce_vanillaDebug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class AddAttributeFragment extends com.woocommerce.android.ui.products.BaseProductFragment {
    @org.jetbrains.annotations.NotNull()
    public static final com.woocommerce.android.ui.products.variations.attributes.AddAttributeFragment.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String TAG = "AddAttributeFragment";
    private static final java.lang.String LIST_STATE_KEY = "list_state";
    private static final int ID_ADD_ATTRIBUTES = 1;
    private androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager;
    private final com.woocommerce.android.widgets.SkeletonView skeletonView = null;
    private android.view.MenuItem moveNextMenuItem;
    private final androidx.navigation.NavArgsLazy navArgs$delegate = null;
    private com.woocommerce.android.databinding.FragmentAddAttributeBinding _binding;
    
    public AddAttributeFragment() {
        super();
    }
    
    private final com.woocommerce.android.ui.products.variations.attributes.AddAttributeFragmentArgs getNavArgs() {
        return null;
    }
    
    private final com.woocommerce.android.databinding.FragmentAddAttributeBinding getBinding() {
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
    public boolean onRequestAllowBackPress() {
        return false;
    }
    
    @java.lang.Override()
    public void onResume() {
    }
    
    @java.lang.Override()
    public void onSaveInstanceState(@org.jetbrains.annotations.NotNull()
    android.os.Bundle outState) {
    }
    
    @java.lang.Override()
    public void onCreateOptionsMenu(@org.jetbrains.annotations.NotNull()
    android.view.Menu menu, @org.jetbrains.annotations.NotNull()
    android.view.MenuInflater inflater) {
    }
    
    @java.lang.Override()
    public boolean onOptionsItemSelected(@org.jetbrains.annotations.NotNull()
    android.view.MenuItem item) {
        return false;
    }
    
    private final void initializeViews(android.os.Bundle savedInstanceState) {
    }
    
    private final void setupObservers() {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getFragmentTitle() {
        return null;
    }
    
    /**
     * Called after fetching global attributes, sets the adapter to show a combined list of the
     * passed global attributes and the existing draft local attributes
     */
    private final void showAttributes(java.util.List<com.woocommerce.android.model.ProductGlobalAttribute> globalAttributes) {
    }
    
    private final void showSkeleton(boolean show) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lcom/woocommerce/android/ui/products/variations/attributes/AddAttributeFragment$Companion;", "", "()V", "ID_ADD_ATTRIBUTES", "", "LIST_STATE_KEY", "", "TAG", "WooCommerce_vanillaDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}