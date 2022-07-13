package com.woocommerce.android.ui.orders.shippinglabels.creation;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u001a\u001a\u00020\u001bH\u0016J\b\u0010\u001c\u001a\u00020\u001dH\u0002J\u0010\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020 H\u0002J\u0010\u0010!\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020 H\u0002J\b\u0010\"\u001a\u00020#H\u0016J\b\u0010$\u001a\u00020\u001dH\u0016J\u001a\u0010%\u001a\u00020\u001d2\u0006\u0010&\u001a\u00020\'2\b\u0010(\u001a\u0004\u0018\u00010)H\u0016J\b\u0010*\u001a\u00020\u001dH\u0002J\u001c\u0010+\u001a\u00020\u001d2\b\b\u0001\u0010,\u001a\u00020-2\b\b\u0001\u0010.\u001a\u00020-H\u0002J\u0016\u0010/\u001a\u00020\u001d2\u0006\u00100\u001a\u00020#2\u0006\u0010\u001f\u001a\u00020 J\u0010\u00101\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020 H\u0002J\u0014\u00102\u001a\u00020\u001d*\u0002032\u0006\u00104\u001a\u000205H\u0002J\u0014\u00102\u001a\u00020\u001d*\u0002062\u0006\u00107\u001a\u000208H\u0002R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u000e\u001a\u00020\u000f8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0014\u001a\u00020\u00158FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0016\u0010\u0017\u00a8\u00069"}, d2 = {"Lcom/woocommerce/android/ui/orders/shippinglabels/creation/CreateShippingLabelFragment;", "Lcom/woocommerce/android/ui/base/BaseFragment;", "Lcom/woocommerce/android/ui/main/MainActivity$Companion$BackPressListener;", "()V", "currencyFormatter", "Lcom/woocommerce/android/util/CurrencyFormatter;", "getCurrencyFormatter", "()Lcom/woocommerce/android/util/CurrencyFormatter;", "setCurrencyFormatter", "(Lcom/woocommerce/android/util/CurrencyFormatter;)V", "progressDialog", "Lcom/woocommerce/android/widgets/CustomProgressDialog;", "skeletonView", "Lcom/woocommerce/android/widgets/SkeletonView;", "uiMessageResolver", "Lcom/woocommerce/android/ui/base/UIMessageResolver;", "getUiMessageResolver", "()Lcom/woocommerce/android/ui/base/UIMessageResolver;", "setUiMessageResolver", "(Lcom/woocommerce/android/ui/base/UIMessageResolver;)V", "viewModel", "Lcom/woocommerce/android/ui/orders/shippinglabels/creation/CreateShippingLabelViewModel;", "getViewModel", "()Lcom/woocommerce/android/ui/orders/shippinglabels/creation/CreateShippingLabelViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "getFragmentTitle", "", "hideProgressDialog", "", "initializeViewModel", "binding", "Lcom/woocommerce/android/databinding/FragmentCreateShippingLabelBinding;", "initializeViews", "onRequestAllowBackPress", "", "onStop", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "setupResultHandlers", "showProgressDialog", "title", "", "message", "showSkeleton", "show", "subscribeObservers", "update", "Lcom/woocommerce/android/databinding/ViewShippingLabelOrderSummaryBinding;", "state", "Lcom/woocommerce/android/ui/orders/shippinglabels/creation/CreateShippingLabelViewModel$OrderSummaryState;", "Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelCreationStepView;", "data", "Lcom/woocommerce/android/ui/orders/shippinglabels/creation/CreateShippingLabelViewModel$StepUiState;", "WooCommerce_wasabiDebug"})
@dagger.hilt.android.AndroidEntryPoint
public final class CreateShippingLabelFragment extends com.woocommerce.android.ui.base.BaseFragment implements com.woocommerce.android.ui.main.MainActivity.Companion.BackPressListener {
    private com.woocommerce.android.widgets.CustomProgressDialog progressDialog;
    @javax.inject.Inject
    public com.woocommerce.android.ui.base.UIMessageResolver uiMessageResolver;
    @javax.inject.Inject
    public com.woocommerce.android.util.CurrencyFormatter currencyFormatter;
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy viewModel$delegate = null;
    private final com.woocommerce.android.widgets.SkeletonView skeletonView = null;
    
    public CreateShippingLabelFragment() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.woocommerce.android.ui.base.UIMessageResolver getUiMessageResolver() {
        return null;
    }
    
    public final void setUiMessageResolver(@org.jetbrains.annotations.NotNull
    com.woocommerce.android.ui.base.UIMessageResolver p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.woocommerce.android.util.CurrencyFormatter getCurrencyFormatter() {
        return null;
    }
    
    public final void setCurrencyFormatter(@org.jetbrains.annotations.NotNull
    com.woocommerce.android.util.CurrencyFormatter p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.woocommerce.android.ui.orders.shippinglabels.creation.CreateShippingLabelViewModel getViewModel() {
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
    
    @java.lang.Override
    public void onStop() {
    }
    
    private final void initializeViewModel(com.woocommerce.android.databinding.FragmentCreateShippingLabelBinding binding) {
    }
    
    private final void setupResultHandlers() {
    }
    
    private final void subscribeObservers(com.woocommerce.android.databinding.FragmentCreateShippingLabelBinding binding) {
    }
    
    private final void showProgressDialog(@androidx.annotation.StringRes
    int title, @androidx.annotation.StringRes
    int message) {
    }
    
    private final void hideProgressDialog() {
    }
    
    public final void showSkeleton(boolean show, @org.jetbrains.annotations.NotNull
    com.woocommerce.android.databinding.FragmentCreateShippingLabelBinding binding) {
    }
    
    private final void initializeViews(com.woocommerce.android.databinding.FragmentCreateShippingLabelBinding binding) {
    }
    
    @java.lang.Override
    public boolean onRequestAllowBackPress() {
        return false;
    }
    
    private final void update(com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelCreationStepView $this$update, com.woocommerce.android.ui.orders.shippinglabels.creation.CreateShippingLabelViewModel.StepUiState data) {
    }
    
    private final void update(com.woocommerce.android.databinding.ViewShippingLabelOrderSummaryBinding $this$update, com.woocommerce.android.ui.orders.shippinglabels.creation.CreateShippingLabelViewModel.OrderSummaryState state) {
    }
}