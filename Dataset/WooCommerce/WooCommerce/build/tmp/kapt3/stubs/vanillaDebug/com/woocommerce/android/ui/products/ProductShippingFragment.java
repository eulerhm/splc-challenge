package com.woocommerce.android.ui.products;

import java.lang.System;

/**
 * Fragment which enables updating product shipping data.
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0002\u00a2\u0006\u0002\u0010\u0016J\b\u0010\u0017\u001a\u00020\u0018H\u0016J\b\u0010\u0019\u001a\u00020\u001aH\u0016J\b\u0010\u001b\u001a\u00020\u001aH\u0016J\u001a\u0010\u001c\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0016J\u0010\u0010!\u001a\u00020\u001a2\u0006\u0010\f\u001a\u00020\rH\u0002J\b\u0010\"\u001a\u00020\u001aH\u0002J\b\u0010#\u001a\u00020\u001aH\u0002J\b\u0010$\u001a\u00020\u001aH\u0002J3\u0010%\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020&2\b\b\u0001\u0010\'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010\u00132\b\u0010*\u001a\u0004\u0018\u00010\u0018H\u0002\u00a2\u0006\u0002\u0010+R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u00020\u00048BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0016\u0010\b\u001a\u0004\u0018\u00010\t8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u001b\u0010\f\u001a\u00020\r8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000f\u00a8\u0006,"}, d2 = {"Lcom/woocommerce/android/ui/products/ProductShippingFragment;", "Lcom/woocommerce/android/ui/products/BaseProductEditorFragment;", "()V", "_binding", "Lcom/woocommerce/android/databinding/FragmentProductShippingBinding;", "binding", "getBinding", "()Lcom/woocommerce/android/databinding/FragmentProductShippingBinding;", "lastEvent", "Lcom/woocommerce/android/viewmodel/MultiLiveEvent$Event;", "getLastEvent", "()Lcom/woocommerce/android/viewmodel/MultiLiveEvent$Event;", "viewModel", "Lcom/woocommerce/android/ui/products/ProductShippingViewModel;", "getViewModel", "()Lcom/woocommerce/android/ui/products/ProductShippingViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "editableToFloat", "", "editable", "Landroid/text/Editable;", "(Landroid/text/Editable;)Ljava/lang/Float;", "getFragmentTitle", "", "onDestroyView", "", "onExit", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "setupObservers", "setupResultHandlers", "setupViews", "showShippingClassFragment", "showValue", "Lcom/woocommerce/android/widgets/WCMaterialOutlinedEditTextView;", "hintRes", "", "value", "unit", "(Lcom/woocommerce/android/widgets/WCMaterialOutlinedEditTextView;ILjava/lang/Float;Ljava/lang/String;)V", "WooCommerce_vanillaDebug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class ProductShippingFragment extends com.woocommerce.android.ui.products.BaseProductEditorFragment {
    private final kotlin.Lazy viewModel$delegate = null;
    private com.woocommerce.android.databinding.FragmentProductShippingBinding _binding;
    
    public ProductShippingFragment() {
        super(0);
    }
    
    private final com.woocommerce.android.ui.products.ProductShippingViewModel getViewModel() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public com.woocommerce.android.viewmodel.MultiLiveEvent.Event getLastEvent() {
        return null;
    }
    
    private final com.woocommerce.android.databinding.FragmentProductShippingBinding getBinding() {
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
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getFragmentTitle() {
        return null;
    }
    
    private final void setupObservers(com.woocommerce.android.ui.products.ProductShippingViewModel viewModel) {
    }
    
    private final void setupResultHandlers() {
    }
    
    private final void setupViews() {
    }
    
    private final java.lang.Float editableToFloat(android.text.Editable editable) {
        return null;
    }
    
    /**
     * Shows the passed weight or dimension value in the passed view and sets the hint so it
     * includes the weight or dimension unit, ex: "Width (in)"
     */
    private final void showValue(com.woocommerce.android.widgets.WCMaterialOutlinedEditTextView view, @androidx.annotation.StringRes()
    int hintRes, java.lang.Float value, java.lang.String unit) {
    }
    
    private final void showShippingClassFragment() {
    }
    
    @java.lang.Override()
    public void onExit() {
    }
}