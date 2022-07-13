package com.woocommerce.android.ui.orders.shippinglabels;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 92\u00020\u00012\u00020\u0002:\u00019B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0012\u0010\u001e\u001a\u00020\u001f2\b\b\u0001\u0010 \u001a\u00020!H\u0002J\b\u0010\"\u001a\u00020#H\u0016J\b\u0010$\u001a\u00020\u001fH\u0002J\u0010\u0010%\u001a\u00020\u001f2\u0006\u0010&\u001a\u00020\'H\u0002J\b\u0010(\u001a\u00020\u001fH\u0002J\b\u0010)\u001a\u00020*H\u0016J\u001a\u0010+\u001a\u00020\u001f2\u0006\u0010,\u001a\u00020-2\b\u0010.\u001a\u0004\u0018\u00010/H\u0016J\u0010\u00100\u001a\u00020\u001f2\u0006\u00101\u001a\u000202H\u0002J\u0018\u00103\u001a\u00020\u001f2\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010&\u001a\u00020\'H\u0002J\u0010\u00104\u001a\u00020\u001f2\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J\u0010\u00105\u001a\u00020\u001f2\u0006\u00106\u001a\u00020*H\u0002J\u0010\u00107\u001a\u00020\u001f2\u0006\u00108\u001a\u00020#H\u0002R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001e\u0010\n\u001a\u00020\u000b8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0012\u001a\u00020\u00138\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001b\u0010\u0018\u001a\u00020\u00198BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001a\u0010\u001b\u00a8\u0006:"}, d2 = {"Lcom/woocommerce/android/ui/orders/shippinglabels/PrintShippingLabelFragment;", "Lcom/woocommerce/android/ui/base/BaseFragment;", "Lcom/woocommerce/android/ui/main/MainActivity$Companion$BackPressListener;", "()V", "navArgs", "Lcom/woocommerce/android/ui/orders/shippinglabels/PrintShippingLabelFragmentArgs;", "getNavArgs", "()Lcom/woocommerce/android/ui/orders/shippinglabels/PrintShippingLabelFragmentArgs;", "navArgs$delegate", "Landroidx/navigation/NavArgsLazy;", "navigator", "Lcom/woocommerce/android/ui/orders/OrderNavigator;", "getNavigator", "()Lcom/woocommerce/android/ui/orders/OrderNavigator;", "setNavigator", "(Lcom/woocommerce/android/ui/orders/OrderNavigator;)V", "progressDialog", "Lcom/woocommerce/android/widgets/CustomProgressDialog;", "uiMessageResolver", "Lcom/woocommerce/android/ui/base/UIMessageResolver;", "getUiMessageResolver", "()Lcom/woocommerce/android/ui/base/UIMessageResolver;", "setUiMessageResolver", "(Lcom/woocommerce/android/ui/base/UIMessageResolver;)V", "viewModel", "Lcom/woocommerce/android/ui/orders/shippinglabels/PrintShippingLabelViewModel;", "getViewModel", "()Lcom/woocommerce/android/ui/orders/shippinglabels/PrintShippingLabelViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "displayError", "", "messageId", "", "getFragmentTitle", "", "hideProgressDialog", "initUi", "binding", "Lcom/woocommerce/android/databinding/FragmentPrintShippingLabelBinding;", "navigateBackAndNotifyOrderDetails", "onRequestAllowBackPress", "", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "openShippingLabelPreview", "file", "Ljava/io/File;", "setupObservers", "setupResultHandlers", "showProgressDialog", "show", "writeShippingLabelToFile", "base", "Companion", "WooCommerce_wasabiDebug"})
@dagger.hilt.android.AndroidEntryPoint
public final class PrintShippingLabelFragment extends com.woocommerce.android.ui.base.BaseFragment implements com.woocommerce.android.ui.main.MainActivity.Companion.BackPressListener {
    @org.jetbrains.annotations.NotNull
    public static final com.woocommerce.android.ui.orders.shippinglabels.PrintShippingLabelFragment.Companion Companion = null;
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String KEY_LABEL_PURCHASED = "key-label-purchased";
    @javax.inject.Inject
    public com.woocommerce.android.ui.orders.OrderNavigator navigator;
    @javax.inject.Inject
    public com.woocommerce.android.ui.base.UIMessageResolver uiMessageResolver;
    private final kotlin.Lazy viewModel$delegate = null;
    private final androidx.navigation.NavArgsLazy navArgs$delegate = null;
    private com.woocommerce.android.widgets.CustomProgressDialog progressDialog;
    
    public PrintShippingLabelFragment() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.woocommerce.android.ui.orders.OrderNavigator getNavigator() {
        return null;
    }
    
    public final void setNavigator(@org.jetbrains.annotations.NotNull
    com.woocommerce.android.ui.orders.OrderNavigator p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.woocommerce.android.ui.base.UIMessageResolver getUiMessageResolver() {
        return null;
    }
    
    public final void setUiMessageResolver(@org.jetbrains.annotations.NotNull
    com.woocommerce.android.ui.base.UIMessageResolver p0) {
    }
    
    private final com.woocommerce.android.ui.orders.shippinglabels.PrintShippingLabelViewModel getViewModel() {
        return null;
    }
    
    private final com.woocommerce.android.ui.orders.shippinglabels.PrintShippingLabelFragmentArgs getNavArgs() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.lang.String getFragmentTitle() {
        return null;
    }
    
    @java.lang.Override
    public void onViewCreated(@org.jetbrains.annotations.NotNull
    android.view.View view, @org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    private final void initUi(com.woocommerce.android.databinding.FragmentPrintShippingLabelBinding binding) {
    }
    
    private final void setupObservers(com.woocommerce.android.ui.orders.shippinglabels.PrintShippingLabelViewModel viewModel, com.woocommerce.android.databinding.FragmentPrintShippingLabelBinding binding) {
    }
    
    private final void setupResultHandlers(com.woocommerce.android.ui.orders.shippinglabels.PrintShippingLabelViewModel viewModel) {
    }
    
    private final void showProgressDialog(boolean show) {
    }
    
    private final void hideProgressDialog() {
    }
    
    private final void displayError(@androidx.annotation.StringRes
    int messageId) {
    }
    
    private final void writeShippingLabelToFile(java.lang.String base) {
    }
    
    private final void openShippingLabelPreview(java.io.File file) {
    }
    
    @java.lang.Override
    public boolean onRequestAllowBackPress() {
        return false;
    }
    
    private final void navigateBackAndNotifyOrderDetails() {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/woocommerce/android/ui/orders/shippinglabels/PrintShippingLabelFragment$Companion;", "", "()V", "KEY_LABEL_PURCHASED", "", "WooCommerce_wasabiDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}