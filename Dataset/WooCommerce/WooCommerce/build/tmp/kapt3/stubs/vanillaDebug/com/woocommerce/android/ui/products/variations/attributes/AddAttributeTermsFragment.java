package com.woocommerce.android.ui.products.variations.attributes;

import java.lang.System;

/**
 * This fragment contains two lists of product attribute terms. Thee\ first is a list of terms from
 * local (product-based) attributes, the second is a list of terms from global (store-wide) attributes
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 Z2\u00020\u0001:\u0001ZB\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010/\u001a\u0002002\u0006\u00101\u001a\u00020\u000eH\u0002J\b\u00102\u001a\u000200H\u0002J\b\u00103\u001a\u000200H\u0002J\b\u00104\u001a\u000200H\u0002J\b\u00105\u001a\u00020\u000eH\u0016J \u00106\u001a\u00020\"2\u0006\u00107\u001a\u0002082\u0006\u00109\u001a\u00020\u00192\u0006\u0010:\u001a\u00020\u0019H\u0002J\u0012\u0010;\u001a\u0002002\b\u0010<\u001a\u0004\u0018\u00010=H\u0002J\u0018\u0010>\u001a\u0002002\u0006\u0010?\u001a\u00020@2\u0006\u0010A\u001a\u00020BH\u0016J\b\u0010C\u001a\u000200H\u0016J\u0010\u0010D\u001a\u00020\u00192\u0006\u0010E\u001a\u00020%H\u0016J\u0010\u0010F\u001a\u0002002\u0006\u0010?\u001a\u00020@H\u0016J\b\u0010G\u001a\u00020\u0019H\u0016J\b\u0010H\u001a\u000200H\u0016J\u0010\u0010I\u001a\u0002002\u0006\u0010J\u001a\u00020=H\u0016J\u001a\u0010K\u001a\u0002002\u0006\u0010L\u001a\u00020M2\b\u0010<\u001a\u0004\u0018\u00010=H\u0016J\b\u0010N\u001a\u000200H\u0002J\b\u0010O\u001a\u000200H\u0002J\b\u0010P\u001a\u000200H\u0002J\b\u0010Q\u001a\u000200H\u0002J\u0016\u0010R\u001a\u0002002\f\u0010S\u001a\b\u0012\u0004\u0012\u00020\u000e0TH\u0002J\u0016\u0010U\u001a\u0002002\f\u0010V\u001a\b\u0012\u0004\u0012\u00020W0TH\u0002J\u0010\u0010X\u001a\u0002002\u0006\u0010Y\u001a\u00020\u0019H\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\u000b\u001a\u00020\fX\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\u00020\u000e8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u00048BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0014\u001a\u00020\u00068BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0016\u0010\n\u001a\u0004\b\u0015\u0010\bR\u000e\u0010\u0017\u001a\u00020\fX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u001a\u001a\u00020\u00198BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u001b\u0010\u001c\u001a\u00020\u001d8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b \u0010\n\u001a\u0004\b\u001e\u0010\u001fR\u0010\u0010!\u001a\u0004\u0018\u00010\"X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010#\u001a\u0004\u0018\u00010\"X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010$\u001a\u0004\u0018\u00010%X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010&\u001a\u00020\'8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b(\u0010)R\u0010\u0010,\u001a\u0004\u0018\u00010\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010-\u001a\u00020.X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006["}, d2 = {"Lcom/woocommerce/android/ui/products/variations/attributes/AddAttributeTermsFragment;", "Lcom/woocommerce/android/ui/products/BaseProductFragment;", "()V", "_binding", "Lcom/woocommerce/android/databinding/FragmentAddAttributeTermsBinding;", "assignedTermListener", "Lcom/woocommerce/android/ui/products/variations/attributes/AttributeTermsListAdapter$OnTermListener;", "getAssignedTermListener", "()Lcom/woocommerce/android/ui/products/variations/attributes/AttributeTermsListAdapter$OnTermListener;", "assignedTermListener$delegate", "Lkotlin/Lazy;", "assignedTermsAdapter", "Lcom/woocommerce/android/ui/products/variations/attributes/AttributeTermsListAdapter;", "attributeName", "", "getAttributeName", "()Ljava/lang/String;", "binding", "getBinding", "()Lcom/woocommerce/android/databinding/FragmentAddAttributeTermsBinding;", "globalTermListener", "getGlobalTermListener", "globalTermListener$delegate", "globalTermsAdapter", "isConfirmRemoveDialogShowing", "", "isGlobalAttribute", "()Z", "itemTouchHelper", "Lcom/woocommerce/android/widgets/DraggableItemTouchHelper;", "getItemTouchHelper", "()Lcom/woocommerce/android/widgets/DraggableItemTouchHelper;", "itemTouchHelper$delegate", "layoutManagerAssigned", "Landroidx/recyclerview/widget/LinearLayoutManager;", "layoutManagerGlobal", "moveNextMenuItem", "Landroid/view/MenuItem;", "navArgs", "Lcom/woocommerce/android/ui/products/variations/attributes/AddAttributeTermsFragmentArgs;", "getNavArgs", "()Lcom/woocommerce/android/ui/products/variations/attributes/AddAttributeTermsFragmentArgs;", "navArgs$delegate", "Landroidx/navigation/NavArgsLazy;", "renamedAttributeName", "skeletonView", "Lcom/woocommerce/android/widgets/SkeletonView;", "addTerm", "", "termName", "checkViews", "confirmRemoveAttribute", "getAttributeTerms", "getFragmentTitle", "initializeRecycler", "recycler", "Landroidx/recyclerview/widget/RecyclerView;", "enableDragAndDrop", "enableDeleting", "initializeViews", "savedInstanceState", "Landroid/os/Bundle;", "onCreateOptionsMenu", "menu", "Landroid/view/Menu;", "inflater", "Landroid/view/MenuInflater;", "onDestroyView", "onOptionsItemSelected", "item", "onPrepareOptionsMenu", "onRequestAllowBackPress", "onResume", "onSaveInstanceState", "outState", "onViewCreated", "view", "Landroid/view/View;", "removeAttribute", "saveChangesAndReturn", "setupObservers", "setupResultHandlers", "showAssignedTerms", "termNames", "", "showGlobalAttributeTerms", "terms", "Lcom/woocommerce/android/model/ProductAttributeTerm;", "showSkeleton", "show", "Companion", "WooCommerce_vanillaDebug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class AddAttributeTermsFragment extends com.woocommerce.android.ui.products.BaseProductFragment {
    @org.jetbrains.annotations.NotNull()
    public static final com.woocommerce.android.ui.products.variations.attributes.AddAttributeTermsFragment.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String TAG = "AddAttributeTermsFragment";
    private static final java.lang.String LIST_STATE_KEY_ASSIGNED = "list_state_assigned";
    private static final java.lang.String LIST_STATE_KEY_GLOBAL = "list_state_global";
    private static final java.lang.String KEY_RENAMED_ATTRIBUTE_NAME = "renamed_attribute_name";
    private static final java.lang.String KEY_IS_CONFIRM_REMOVE_DIALOG_SHOWING = "is_remove_dialog_showing";
    private androidx.recyclerview.widget.LinearLayoutManager layoutManagerAssigned;
    private androidx.recyclerview.widget.LinearLayoutManager layoutManagerGlobal;
    private com.woocommerce.android.databinding.FragmentAddAttributeTermsBinding _binding;
    private final androidx.navigation.NavArgsLazy navArgs$delegate = null;
    private final com.woocommerce.android.widgets.SkeletonView skeletonView = null;
    private boolean isConfirmRemoveDialogShowing = false;
    private java.lang.String renamedAttributeName;
    private android.view.MenuItem moveNextMenuItem;
    private final kotlin.Lazy itemTouchHelper$delegate = null;
    private com.woocommerce.android.ui.products.variations.attributes.AttributeTermsListAdapter assignedTermsAdapter;
    private com.woocommerce.android.ui.products.variations.attributes.AttributeTermsListAdapter globalTermsAdapter;
    
    /**
     * This is the listener attached to the list of assigned terms
     */
    private final kotlin.Lazy assignedTermListener$delegate = null;
    
    /**
     * This is the listener attached to the list of global terms
     */
    private final kotlin.Lazy globalTermListener$delegate = null;
    
    public AddAttributeTermsFragment() {
        super();
    }
    
    private final com.woocommerce.android.databinding.FragmentAddAttributeTermsBinding getBinding() {
        return null;
    }
    
    private final com.woocommerce.android.ui.products.variations.attributes.AddAttributeTermsFragmentArgs getNavArgs() {
        return null;
    }
    
    private final com.woocommerce.android.widgets.DraggableItemTouchHelper getItemTouchHelper() {
        return null;
    }
    
    /**
     * This is the listener attached to the list of assigned terms
     */
    private final com.woocommerce.android.ui.products.variations.attributes.AttributeTermsListAdapter.OnTermListener getAssignedTermListener() {
        return null;
    }
    
    /**
     * This is the listener attached to the list of global terms
     */
    private final com.woocommerce.android.ui.products.variations.attributes.AttributeTermsListAdapter.OnTermListener getGlobalTermListener() {
        return null;
    }
    
    private final boolean isGlobalAttribute() {
        return false;
    }
    
    private final java.lang.String getAttributeName() {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void getAttributeTerms() {
    }
    
    @java.lang.Override()
    public void onDestroyView() {
    }
    
    @java.lang.Override()
    public void onCreateOptionsMenu(@org.jetbrains.annotations.NotNull()
    android.view.Menu menu, @org.jetbrains.annotations.NotNull()
    android.view.MenuInflater inflater) {
    }
    
    @java.lang.Override()
    public void onPrepareOptionsMenu(@org.jetbrains.annotations.NotNull()
    android.view.Menu menu) {
    }
    
    @java.lang.Override()
    public boolean onOptionsItemSelected(@org.jetbrains.annotations.NotNull()
    android.view.MenuItem item) {
        return false;
    }
    
    @java.lang.Override()
    public boolean onRequestAllowBackPress() {
        return false;
    }
    
    private final void saveChangesAndReturn() {
    }
    
    @java.lang.Override()
    public void onResume() {
    }
    
    @java.lang.Override()
    public void onSaveInstanceState(@org.jetbrains.annotations.NotNull()
    android.os.Bundle outState) {
    }
    
    private final void initializeViews(android.os.Bundle savedInstanceState) {
    }
    
    private final androidx.recyclerview.widget.LinearLayoutManager initializeRecycler(androidx.recyclerview.widget.RecyclerView recycler, boolean enableDragAndDrop, boolean enableDeleting) {
        return null;
    }
    
    private final void setupObservers() {
    }
    
    private final void setupResultHandlers() {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getFragmentTitle() {
        return null;
    }
    
    /**
     * Show the list of terms already assigned to the product attribute
     */
    private final void showAssignedTerms(java.util.List<java.lang.String> termNames) {
    }
    
    /**
     * Triggered by fetching the list of terms for global attributes
     */
    private final void showGlobalAttributeTerms(java.util.List<com.woocommerce.android.model.ProductAttributeTerm> terms) {
    }
    
    private final void checkViews() {
    }
    
    /**
     * User entered a new term or tapped a global term
     */
    private final void addTerm(java.lang.String termName) {
    }
    
    private final void showSkeleton(boolean show) {
    }
    
    private final void confirmRemoveAttribute() {
    }
    
    /**
     * Removes this attribute from the product draft and returns to the attributes screen
     */
    private final void removeAttribute() {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/woocommerce/android/ui/products/variations/attributes/AddAttributeTermsFragment$Companion;", "", "()V", "KEY_IS_CONFIRM_REMOVE_DIALOG_SHOWING", "", "KEY_RENAMED_ATTRIBUTE_NAME", "LIST_STATE_KEY_ASSIGNED", "LIST_STATE_KEY_GLOBAL", "TAG", "WooCommerce_vanillaDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}