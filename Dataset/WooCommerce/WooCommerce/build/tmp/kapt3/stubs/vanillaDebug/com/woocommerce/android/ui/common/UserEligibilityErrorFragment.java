package com.woocommerce.android.ui.common;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u0017\u001a\u00020\u0018H\u0016J\b\u0010\u0019\u001a\u00020\u001aH\u0002J\u0018\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J\b\u0010 \u001a\u00020\u001aH\u0016J\u0010\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$H\u0016J\b\u0010%\u001a\u00020\"H\u0016J\b\u0010&\u001a\u00020\u001aH\u0016J\u001a\u0010\'\u001a\u00020\u001a2\u0006\u0010(\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010+H\u0016J\u0010\u0010,\u001a\u00020\u001a2\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\b\u0010-\u001a\u00020\u001aH\u0002J\u0010\u0010.\u001a\u00020\u001a2\u0006\u0010/\u001a\u00020\"H\u0002J\u0010\u00100\u001a\u00020\u001a2\u0006\u00101\u001a\u000202H\u0002R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u00058BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u000b\u001a\u00020\f8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0011\u001a\u00020\u00128BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0013\u0010\u0014\u00a8\u00063"}, d2 = {"Lcom/woocommerce/android/ui/common/UserEligibilityErrorFragment;", "Lcom/woocommerce/android/ui/base/BaseFragment;", "Lcom/woocommerce/android/ui/main/MainActivity$Companion$BackPressListener;", "()V", "_binding", "Lcom/woocommerce/android/databinding/FragmentUserEligibilityErrorBinding;", "binding", "getBinding", "()Lcom/woocommerce/android/databinding/FragmentUserEligibilityErrorBinding;", "progressDialog", "Lcom/woocommerce/android/widgets/CustomProgressDialog;", "uiMessageResolver", "Lcom/woocommerce/android/ui/base/UIMessageResolver;", "getUiMessageResolver", "()Lcom/woocommerce/android/ui/base/UIMessageResolver;", "setUiMessageResolver", "(Lcom/woocommerce/android/ui/base/UIMessageResolver;)V", "viewModel", "Lcom/woocommerce/android/ui/common/UserEligibilityErrorViewModel;", "getViewModel", "()Lcom/woocommerce/android/ui/common/UserEligibilityErrorViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "getFragmentTitle", "", "hideProgressDialog", "", "onCreateOptionsMenu", "menu", "Landroid/view/Menu;", "inflater", "Landroid/view/MenuInflater;", "onDestroyView", "onOptionsItemSelected", "", "item", "Landroid/view/MenuItem;", "onRequestAllowBackPress", "onResume", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "setupObservers", "setupView", "showProgressDialog", "show", "showView", "user", "Lcom/woocommerce/android/model/User;", "WooCommerce_vanillaDebug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class UserEligibilityErrorFragment extends com.woocommerce.android.ui.base.BaseFragment implements com.woocommerce.android.ui.main.MainActivity.Companion.BackPressListener {
    @javax.inject.Inject()
    public com.woocommerce.android.ui.base.UIMessageResolver uiMessageResolver;
    private final kotlin.Lazy viewModel$delegate = null;
    private com.woocommerce.android.databinding.FragmentUserEligibilityErrorBinding _binding;
    private com.woocommerce.android.widgets.CustomProgressDialog progressDialog;
    
    public UserEligibilityErrorFragment() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.woocommerce.android.ui.base.UIMessageResolver getUiMessageResolver() {
        return null;
    }
    
    public final void setUiMessageResolver(@org.jetbrains.annotations.NotNull()
    com.woocommerce.android.ui.base.UIMessageResolver p0) {
    }
    
    private final com.woocommerce.android.ui.common.UserEligibilityErrorViewModel getViewModel() {
        return null;
    }
    
    private final com.woocommerce.android.databinding.FragmentUserEligibilityErrorBinding getBinding() {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
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
    
    private final void setupView() {
    }
    
    private final void setupObservers(com.woocommerce.android.ui.common.UserEligibilityErrorViewModel viewModel) {
    }
    
    private final void showView(com.woocommerce.android.model.User user) {
    }
    
    private final void showProgressDialog(boolean show) {
    }
    
    private final void hideProgressDialog() {
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
    public void onDestroyView() {
    }
    
    @java.lang.Override()
    public boolean onRequestAllowBackPress() {
        return false;
    }
}