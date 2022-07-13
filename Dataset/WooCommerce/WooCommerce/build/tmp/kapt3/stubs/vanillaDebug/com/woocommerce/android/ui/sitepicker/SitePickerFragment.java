package com.woocommerce.android.ui.sitepicker;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u0013\u001a\u00020\u0014H\u0002J\b\u0010\u0015\u001a\u00020\u0014H\u0002J\b\u0010\u0016\u001a\u00020\u0014H\u0002J\b\u0010\u0017\u001a\u00020\u0014H\u0002J\b\u0010\u0018\u001a\u00020\u0014H\u0016J\b\u0010\u0019\u001a\u00020\u0014H\u0016J\b\u0010\u001a\u001a\u00020\u0014H\u0002J\u001a\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016J\u0010\u0010 \u001a\u00020\u00142\u0006\u0010\r\u001a\u00020\u000eH\u0002J\b\u0010!\u001a\u00020\u0014H\u0002J\u0010\u0010\"\u001a\u00020\u00142\u0006\u0010#\u001a\u00020$H\u0002J\b\u0010%\u001a\u00020\u0014H\u0002J\b\u0010&\u001a\u00020\u0014H\u0002J\b\u0010\'\u001a\u00020\u0014H\u0002J\u0010\u0010(\u001a\u00020\u00142\u0006\u0010)\u001a\u00020$H\u0002J\b\u0010*\u001a\u00020\u0014H\u0002J\u0010\u0010+\u001a\u00020\u00142\u0006\u0010,\u001a\u00020-H\u0002J\b\u0010.\u001a\u00020\u0014H\u0002R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u00058BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\r\u001a\u00020\u000e8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010\u00a8\u0006/"}, d2 = {"Lcom/woocommerce/android/ui/sitepicker/SitePickerFragment;", "Lcom/woocommerce/android/ui/base/BaseFragment;", "Lcom/woocommerce/android/ui/login/LoginEmailHelpDialogFragment$Listener;", "()V", "_binding", "Lcom/woocommerce/android/databinding/FragmentSitePickerBinding;", "binding", "getBinding", "()Lcom/woocommerce/android/databinding/FragmentSitePickerBinding;", "progressDialog", "Lcom/woocommerce/android/widgets/CustomProgressDialog;", "skeletonView", "Lcom/woocommerce/android/widgets/SkeletonView;", "viewModel", "Lcom/woocommerce/android/ui/sitepicker/SitePickerViewModel;", "getViewModel", "()Lcom/woocommerce/android/ui/sitepicker/SitePickerViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "navigateToHelpScreen", "", "navigateToLearnMoreAboutJetpackScreen", "navigateToNeedHelpFindingEmailScreen", "navigateToWhatIsJetpackScreen", "onDestroyView", "onEmailNeedMoreHelpClicked", "onLogout", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "setupObservers", "setupViews", "showProgressDialog", "show", "", "showWooUpgradeDialog", "updateAccountMismatchView", "updateNoStoresView", "updateSkeletonView", "visible", "updateStoreListView", "updateUserInfoView", "userInfo", "Lcom/woocommerce/android/ui/sitepicker/SitePickerViewModel$UserInfo;", "updateWooNotFoundView", "WooCommerce_vanillaDebug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class SitePickerFragment extends com.woocommerce.android.ui.base.BaseFragment implements com.woocommerce.android.ui.login.LoginEmailHelpDialogFragment.Listener {
    private com.woocommerce.android.databinding.FragmentSitePickerBinding _binding;
    private final kotlin.Lazy viewModel$delegate = null;
    private com.woocommerce.android.widgets.SkeletonView skeletonView;
    private com.woocommerce.android.widgets.CustomProgressDialog progressDialog;
    
    public SitePickerFragment() {
        super();
    }
    
    private final com.woocommerce.android.databinding.FragmentSitePickerBinding getBinding() {
        return null;
    }
    
    private final com.woocommerce.android.ui.sitepicker.SitePickerViewModel getViewModel() {
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
    
    private final void setupViews() {
    }
    
    @kotlin.Suppress(names = {"LongMethod", "ComplexMethod"})
    private final void setupObservers(com.woocommerce.android.ui.sitepicker.SitePickerViewModel viewModel) {
    }
    
    private final void updateStoreListView() {
    }
    
    private final void updateNoStoresView() {
    }
    
    private final void updateAccountMismatchView() {
    }
    
    private final void updateWooNotFoundView() {
    }
    
    private final void updateUserInfoView(com.woocommerce.android.ui.sitepicker.SitePickerViewModel.UserInfo userInfo) {
    }
    
    private final void updateSkeletonView(boolean visible) {
    }
    
    private final void showProgressDialog(boolean show) {
    }
    
    private final void showWooUpgradeDialog() {
    }
    
    private final void navigateToWhatIsJetpackScreen() {
    }
    
    private final void navigateToLearnMoreAboutJetpackScreen() {
    }
    
    private final void navigateToHelpScreen() {
    }
    
    private final void navigateToNeedHelpFindingEmailScreen() {
    }
    
    private final void onLogout() {
    }
    
    @java.lang.Override()
    public void onEmailNeedMoreHelpClicked() {
    }
}