package com.woocommerce.android.ui.products.categories;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 62\u00020\u00012\u00020\u0002:\u00016B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0002J\b\u0010\u001d\u001a\u00020\u001eH\u0002J\b\u0010\u001f\u001a\u00020\u001eH\u0016J\b\u0010 \u001a\u00020\u001aH\u0002J\u0018\u0010!\u001a\u00020\u001a2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%H\u0016J\b\u0010&\u001a\u00020\u001aH\u0016J\u0010\u0010\'\u001a\u00020(2\u0006\u0010)\u001a\u00020\nH\u0016J\b\u0010*\u001a\u00020(H\u0016J\b\u0010+\u001a\u00020\u001aH\u0016J\b\u0010,\u001a\u00020\u001aH\u0016J\u001a\u0010-\u001a\u00020\u001a2\u0006\u0010.\u001a\u00020/2\b\u00100\u001a\u0004\u0018\u000101H\u0016J\u0010\u00102\u001a\u00020\u001a2\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J\u0010\u00103\u001a\u00020\u001a2\u0006\u00104\u001a\u00020(H\u0002J\u0010\u00105\u001a\u00020\u001a2\u0006\u00104\u001a\u00020(H\u0002R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u00058BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010\r\u001a\u00020\u000e8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0013\u001a\u00020\u00148BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0015\u0010\u0016\u00a8\u00067"}, d2 = {"Lcom/woocommerce/android/ui/products/categories/AddProductCategoryFragment;", "Lcom/woocommerce/android/ui/base/BaseFragment;", "Lcom/woocommerce/android/ui/main/MainActivity$Companion$BackPressListener;", "()V", "_binding", "Lcom/woocommerce/android/databinding/FragmentAddProductCategoryBinding;", "binding", "getBinding", "()Lcom/woocommerce/android/databinding/FragmentAddProductCategoryBinding;", "doneMenuItem", "Landroid/view/MenuItem;", "progressDialog", "Lcom/woocommerce/android/widgets/CustomProgressDialog;", "uiMessageResolver", "Lcom/woocommerce/android/ui/base/UIMessageResolver;", "getUiMessageResolver", "()Lcom/woocommerce/android/ui/base/UIMessageResolver;", "setUiMessageResolver", "(Lcom/woocommerce/android/ui/base/UIMessageResolver;)V", "viewModel", "Lcom/woocommerce/android/ui/products/categories/AddProductCategoryViewModel;", "getViewModel", "()Lcom/woocommerce/android/ui/products/categories/AddProductCategoryViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "displayCategoryNameError", "", "messageId", "", "getCategoryName", "", "getFragmentTitle", "hideProgressDialog", "onCreateOptionsMenu", "menu", "Landroid/view/Menu;", "inflater", "Landroid/view/MenuInflater;", "onDestroyView", "onOptionsItemSelected", "", "item", "onRequestAllowBackPress", "onResume", "onStop", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "setupObservers", "showDoneMenuItem", "show", "showProgressDialog", "Companion", "WooCommerce_vanillaDebug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class AddProductCategoryFragment extends com.woocommerce.android.ui.base.BaseFragment implements com.woocommerce.android.ui.main.MainActivity.Companion.BackPressListener {
    @org.jetbrains.annotations.NotNull()
    public static final com.woocommerce.android.ui.products.categories.AddProductCategoryFragment.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ARG_ADDED_CATEGORY = "arg-added-category";
    private android.view.MenuItem doneMenuItem;
    private com.woocommerce.android.widgets.CustomProgressDialog progressDialog;
    @javax.inject.Inject()
    public com.woocommerce.android.ui.base.UIMessageResolver uiMessageResolver;
    private com.woocommerce.android.databinding.FragmentAddProductCategoryBinding _binding;
    private final kotlin.Lazy viewModel$delegate = null;
    
    public AddProductCategoryFragment() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.woocommerce.android.ui.base.UIMessageResolver getUiMessageResolver() {
        return null;
    }
    
    public final void setUiMessageResolver(@org.jetbrains.annotations.NotNull()
    com.woocommerce.android.ui.base.UIMessageResolver p0) {
    }
    
    private final com.woocommerce.android.databinding.FragmentAddProductCategoryBinding getBinding() {
        return null;
    }
    
    private final com.woocommerce.android.ui.products.categories.AddProductCategoryViewModel getViewModel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getFragmentTitle() {
        return null;
    }
    
    @java.lang.Override()
    public void onResume() {
    }
    
    @java.lang.Override()
    public void onStop() {
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
    
    private final void setupObservers(com.woocommerce.android.ui.products.categories.AddProductCategoryViewModel viewModel) {
    }
    
    private final void displayCategoryNameError(int messageId) {
    }
    
    private final void showDoneMenuItem(boolean show) {
    }
    
    private final void showProgressDialog(boolean show) {
    }
    
    private final void hideProgressDialog() {
    }
    
    private final java.lang.String getCategoryName() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/woocommerce/android/ui/products/categories/AddProductCategoryFragment$Companion;", "", "()V", "ARG_ADDED_CATEGORY", "", "WooCommerce_vanillaDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}