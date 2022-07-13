package com.woocommerce.android.ui.orders.shippinglabels.creation;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 42\u00020\u00012\u00020\u0002:\u00014B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u001b\u001a\u00020\u001cH\u0016J\b\u0010\u001d\u001a\u00020\u001eH\u0002J\u0012\u0010\u001f\u001a\u00020\u001e2\b\u0010 \u001a\u0004\u0018\u00010!H\u0016J\u0018\u0010\"\u001a\u00020\u001e2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&H\u0016J\u0010\u0010\'\u001a\u00020(2\u0006\u0010)\u001a\u00020\u0005H\u0016J\b\u0010*\u001a\u00020(H\u0016J\u001a\u0010+\u001a\u00020\u001e2\u0006\u0010,\u001a\u00020-2\b\u0010 \u001a\u0004\u0018\u00010!H\u0016J\u0010\u0010.\u001a\u00020\u001e2\u0006\u0010/\u001a\u000200H\u0002J\b\u00101\u001a\u00020\u001eH\u0002J\b\u00102\u001a\u00020\u001eH\u0002J\u000e\u00103\u001a\u00020\u001e2\u0006\u0010/\u001a\u000200R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0006\u001a\u00020\u00078BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0010\u001a\u00020\u00118\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001b\u0010\u0016\u001a\u00020\u00178BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001a\u0010\u000b\u001a\u0004\b\u0018\u0010\u0019\u00a8\u00065"}, d2 = {"Lcom/woocommerce/android/ui/orders/shippinglabels/creation/EditShippingLabelPaymentFragment;", "Lcom/woocommerce/android/ui/base/BaseFragment;", "Lcom/woocommerce/android/ui/main/MainActivity$Companion$BackPressListener;", "()V", "doneMenuItem", "Landroid/view/MenuItem;", "paymentMethodsAdapter", "Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelPaymentMethodsAdapter;", "getPaymentMethodsAdapter", "()Lcom/woocommerce/android/ui/orders/shippinglabels/creation/ShippingLabelPaymentMethodsAdapter;", "paymentMethodsAdapter$delegate", "Lkotlin/Lazy;", "progressDialog", "Lcom/woocommerce/android/widgets/CustomProgressDialog;", "skeletonView", "Lcom/woocommerce/android/widgets/SkeletonView;", "uiMessageResolver", "Lcom/woocommerce/android/ui/base/UIMessageResolver;", "getUiMessageResolver", "()Lcom/woocommerce/android/ui/base/UIMessageResolver;", "setUiMessageResolver", "(Lcom/woocommerce/android/ui/base/UIMessageResolver;)V", "viewModel", "Lcom/woocommerce/android/ui/orders/shippinglabels/creation/EditShippingLabelPaymentViewModel;", "getViewModel", "()Lcom/woocommerce/android/ui/orders/shippinglabels/creation/EditShippingLabelPaymentViewModel;", "viewModel$delegate", "getFragmentTitle", "", "hideProgressDialog", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateOptionsMenu", "menu", "Landroid/view/Menu;", "inflater", "Landroid/view/MenuInflater;", "onOptionsItemSelected", "", "item", "onRequestAllowBackPress", "onViewCreated", "view", "Landroid/view/View;", "setupObservers", "binding", "Lcom/woocommerce/android/databinding/FragmentEditShippingLabelPaymentBinding;", "setupResultHandlers", "showSavingProgressDialog", "showSkeleton", "Companion", "WooCommerce_vanillaDebug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class EditShippingLabelPaymentFragment extends com.woocommerce.android.ui.base.BaseFragment implements com.woocommerce.android.ui.main.MainActivity.Companion.BackPressListener {
    @org.jetbrains.annotations.NotNull()
    public static final com.woocommerce.android.ui.orders.shippinglabels.creation.EditShippingLabelPaymentFragment.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String EDIT_PAYMENTS_CLOSED = "edit_payments_closed";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String EDIT_PAYMENTS_RESULT = "edit_payments_result";
    @javax.inject.Inject()
    public com.woocommerce.android.ui.base.UIMessageResolver uiMessageResolver;
    private final com.woocommerce.android.widgets.SkeletonView skeletonView = null;
    private final kotlin.Lazy viewModel$delegate = null;
    private final kotlin.Lazy paymentMethodsAdapter$delegate = null;
    private android.view.MenuItem doneMenuItem;
    private com.woocommerce.android.widgets.CustomProgressDialog progressDialog;
    
    public EditShippingLabelPaymentFragment() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.woocommerce.android.ui.base.UIMessageResolver getUiMessageResolver() {
        return null;
    }
    
    public final void setUiMessageResolver(@org.jetbrains.annotations.NotNull()
    com.woocommerce.android.ui.base.UIMessageResolver p0) {
    }
    
    private final com.woocommerce.android.ui.orders.shippinglabels.creation.EditShippingLabelPaymentViewModel getViewModel() {
        return null;
    }
    
    private final com.woocommerce.android.ui.orders.shippinglabels.creation.ShippingLabelPaymentMethodsAdapter getPaymentMethodsAdapter() {
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
    public void onCreateOptionsMenu(@org.jetbrains.annotations.NotNull()
    android.view.Menu menu, @org.jetbrains.annotations.NotNull()
    android.view.MenuInflater inflater) {
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
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
    
    private final void setupObservers(com.woocommerce.android.databinding.FragmentEditShippingLabelPaymentBinding binding) {
    }
    
    private final void setupResultHandlers() {
    }
    
    public final void showSkeleton(@org.jetbrains.annotations.NotNull()
    com.woocommerce.android.databinding.FragmentEditShippingLabelPaymentBinding binding) {
    }
    
    private final void showSavingProgressDialog() {
    }
    
    private final void hideProgressDialog() {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/woocommerce/android/ui/orders/shippinglabels/creation/EditShippingLabelPaymentFragment$Companion;", "", "()V", "EDIT_PAYMENTS_CLOSED", "", "EDIT_PAYMENTS_RESULT", "WooCommerce_vanillaDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}