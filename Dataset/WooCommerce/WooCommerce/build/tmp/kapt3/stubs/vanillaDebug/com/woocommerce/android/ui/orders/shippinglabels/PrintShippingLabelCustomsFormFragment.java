package com.woocommerce.android.ui.orders.shippinglabels;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u001d\u001a\u00020\u001eH\u0016J\u0012\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\"H\u0016J\b\u0010#\u001a\u00020$H\u0016J\u001a\u0010%\u001a\u00020 2\u0006\u0010&\u001a\u00020\'2\b\u0010!\u001a\u0004\u0018\u00010\"H\u0016J\u0010\u0010(\u001a\u00020 2\u0006\u0010)\u001a\u00020*H\u0002J\u0010\u0010+\u001a\u00020 2\u0006\u0010,\u001a\u00020-H\u0002J\u0010\u0010.\u001a\u00020 2\u0006\u0010,\u001a\u00020-H\u0002J\u0010\u0010/\u001a\u00020 2\u0006\u00100\u001a\u00020$H\u0002R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0012\u001a\u00020\u00138\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001b\u0010\u0018\u001a\u00020\u00198BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001c\u0010\t\u001a\u0004\b\u001a\u0010\u001b\u00a8\u00061"}, d2 = {"Lcom/woocommerce/android/ui/orders/shippinglabels/PrintShippingLabelCustomsFormFragment;", "Lcom/woocommerce/android/ui/base/BaseFragment;", "Lcom/woocommerce/android/ui/main/MainActivity$Companion$BackPressListener;", "()V", "invoicesAdapter", "Lcom/woocommerce/android/ui/orders/shippinglabels/PrintCustomsFormAdapter;", "getInvoicesAdapter", "()Lcom/woocommerce/android/ui/orders/shippinglabels/PrintCustomsFormAdapter;", "invoicesAdapter$delegate", "Lkotlin/Lazy;", "navArgs", "Lcom/woocommerce/android/ui/orders/shippinglabels/PrintShippingLabelCustomsFormFragmentArgs;", "getNavArgs", "()Lcom/woocommerce/android/ui/orders/shippinglabels/PrintShippingLabelCustomsFormFragmentArgs;", "navArgs$delegate", "Landroidx/navigation/NavArgsLazy;", "progressDialog", "Lcom/woocommerce/android/widgets/CustomProgressDialog;", "uiMessageResolver", "Lcom/woocommerce/android/ui/base/UIMessageResolver;", "getUiMessageResolver", "()Lcom/woocommerce/android/ui/base/UIMessageResolver;", "setUiMessageResolver", "(Lcom/woocommerce/android/ui/base/UIMessageResolver;)V", "viewModel", "Lcom/woocommerce/android/ui/orders/shippinglabels/PrintShippingLabelCustomsFormViewModel;", "getViewModel", "()Lcom/woocommerce/android/ui/orders/shippinglabels/PrintShippingLabelCustomsFormViewModel;", "viewModel$delegate", "getFragmentTitle", "", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onRequestAllowBackPress", "", "onViewCreated", "view", "Landroid/view/View;", "printFile", "file", "Ljava/io/File;", "setupObservers", "binding", "Lcom/woocommerce/android/databinding/FragmentPrintLabelCustomsFormBinding;", "setupView", "showProgressDialog", "show", "WooCommerce_vanillaDebug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class PrintShippingLabelCustomsFormFragment extends com.woocommerce.android.ui.base.BaseFragment implements com.woocommerce.android.ui.main.MainActivity.Companion.BackPressListener {
    private final kotlin.Lazy viewModel$delegate = null;
    @javax.inject.Inject()
    public com.woocommerce.android.ui.base.UIMessageResolver uiMessageResolver;
    private com.woocommerce.android.widgets.CustomProgressDialog progressDialog;
    private final androidx.navigation.NavArgsLazy navArgs$delegate = null;
    private final kotlin.Lazy invoicesAdapter$delegate = null;
    
    public PrintShippingLabelCustomsFormFragment() {
        super();
    }
    
    private final com.woocommerce.android.ui.orders.shippinglabels.PrintShippingLabelCustomsFormViewModel getViewModel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.woocommerce.android.ui.base.UIMessageResolver getUiMessageResolver() {
        return null;
    }
    
    public final void setUiMessageResolver(@org.jetbrains.annotations.NotNull()
    com.woocommerce.android.ui.base.UIMessageResolver p0) {
    }
    
    private final com.woocommerce.android.ui.orders.shippinglabels.PrintShippingLabelCustomsFormFragmentArgs getNavArgs() {
        return null;
    }
    
    private final com.woocommerce.android.ui.orders.shippinglabels.PrintCustomsFormAdapter getInvoicesAdapter() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getFragmentTitle() {
        return null;
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void setupObservers(com.woocommerce.android.databinding.FragmentPrintLabelCustomsFormBinding binding) {
    }
    
    /**
     * This just opens the default PDF reader of the device
     */
    private final void printFile(java.io.File file) {
    }
    
    private final void setupView(com.woocommerce.android.databinding.FragmentPrintLabelCustomsFormBinding binding) {
    }
    
    private final void showProgressDialog(boolean show) {
    }
    
    @java.lang.Override()
    public boolean onRequestAllowBackPress() {
        return false;
    }
}