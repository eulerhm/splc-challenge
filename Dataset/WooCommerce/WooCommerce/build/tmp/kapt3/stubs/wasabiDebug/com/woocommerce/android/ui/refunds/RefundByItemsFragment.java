package com.woocommerce.android.ui.refunds;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u0010+\u001a\u00020,H\u0002J\b\u0010-\u001a\u00020,H\u0016J\u0018\u0010.\u001a\u00020,2\u0006\u0010/\u001a\u0002002\u0006\u00101\u001a\u000202H\u0016J\b\u00103\u001a\u00020,H\u0016J\u0018\u00104\u001a\u00020,2\u0006\u0010/\u001a\u0002002\u0006\u00101\u001a\u000202H\u0016J\u001a\u00105\u001a\u00020,2\u0006\u00106\u001a\u0002072\b\u00108\u001a\u0004\u0018\u000109H\u0016J\b\u0010:\u001a\u00020,H\u0002J\u0010\u0010;\u001a\u00020,2\u0006\u0010<\u001a\u00020=H\u0002R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\u00020\u00068BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0010\u001a\u00020\u00118\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\b8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u001e\u0010\u0019\u001a\u00020\u001a8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u0014\u0010\u001f\u001a\u00020\n8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b \u0010!R\u0014\u0010\"\u001a\u00020\f8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b#\u0010$R\u001b\u0010%\u001a\u00020&8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b\'\u0010(\u00a8\u0006>"}, d2 = {"Lcom/woocommerce/android/ui/refunds/RefundByItemsFragment;", "Lcom/woocommerce/android/ui/base/BaseFragment;", "Lcom/woocommerce/android/ui/refunds/RefundShippingListAdapter$OnCheckedChangeListener;", "Lcom/woocommerce/android/ui/refunds/RefundFeeListAdapter$OnFeeLineCheckedChangeListener;", "()V", "_binding", "Lcom/woocommerce/android/databinding/FragmentRefundByItemsBinding;", "_feeLinesBinding", "Lcom/woocommerce/android/databinding/RefundByItemsFeesBinding;", "_productsBinding", "Lcom/woocommerce/android/databinding/RefundByItemsProductsBinding;", "_shippingLinesBinding", "Lcom/woocommerce/android/databinding/RefundByItemsShippingBinding;", "binding", "getBinding", "()Lcom/woocommerce/android/databinding/FragmentRefundByItemsBinding;", "currencyFormatter", "Lcom/woocommerce/android/util/CurrencyFormatter;", "getCurrencyFormatter", "()Lcom/woocommerce/android/util/CurrencyFormatter;", "setCurrencyFormatter", "(Lcom/woocommerce/android/util/CurrencyFormatter;)V", "feeLinesBinding", "getFeeLinesBinding", "()Lcom/woocommerce/android/databinding/RefundByItemsFeesBinding;", "imageMap", "Lcom/woocommerce/android/tools/ProductImageMap;", "getImageMap", "()Lcom/woocommerce/android/tools/ProductImageMap;", "setImageMap", "(Lcom/woocommerce/android/tools/ProductImageMap;)V", "productsBinding", "getProductsBinding", "()Lcom/woocommerce/android/databinding/RefundByItemsProductsBinding;", "shippingLinesBinding", "getShippingLinesBinding", "()Lcom/woocommerce/android/databinding/RefundByItemsShippingBinding;", "viewModel", "Lcom/woocommerce/android/ui/refunds/IssueRefundViewModel;", "getViewModel", "()Lcom/woocommerce/android/ui/refunds/IssueRefundViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "initializeViews", "", "onDestroyView", "onFeeLineSwitchChanged", "isChecked", "", "itemId", "", "onResume", "onShippingLineSwitchChanged", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "setupObservers", "updateRefundNoticeView", "refundNoticeText", "", "WooCommerce_wasabiDebug"})
@dagger.hilt.android.AndroidEntryPoint
public final class RefundByItemsFragment extends com.woocommerce.android.ui.base.BaseFragment implements com.woocommerce.android.ui.refunds.RefundShippingListAdapter.OnCheckedChangeListener, com.woocommerce.android.ui.refunds.RefundFeeListAdapter.OnFeeLineCheckedChangeListener {
    @javax.inject.Inject
    public com.woocommerce.android.util.CurrencyFormatter currencyFormatter;
    @javax.inject.Inject
    public com.woocommerce.android.tools.ProductImageMap imageMap;
    private com.woocommerce.android.databinding.FragmentRefundByItemsBinding _binding;
    private com.woocommerce.android.databinding.RefundByItemsProductsBinding _productsBinding;
    private com.woocommerce.android.databinding.RefundByItemsShippingBinding _shippingLinesBinding;
    private com.woocommerce.android.databinding.RefundByItemsFeesBinding _feeLinesBinding;
    private final kotlin.Lazy viewModel$delegate = null;
    
    public RefundByItemsFragment() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.woocommerce.android.util.CurrencyFormatter getCurrencyFormatter() {
        return null;
    }
    
    public final void setCurrencyFormatter(@org.jetbrains.annotations.NotNull
    com.woocommerce.android.util.CurrencyFormatter p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.woocommerce.android.tools.ProductImageMap getImageMap() {
        return null;
    }
    
    public final void setImageMap(@org.jetbrains.annotations.NotNull
    com.woocommerce.android.tools.ProductImageMap p0) {
    }
    
    private final com.woocommerce.android.databinding.FragmentRefundByItemsBinding getBinding() {
        return null;
    }
    
    private final com.woocommerce.android.databinding.RefundByItemsProductsBinding getProductsBinding() {
        return null;
    }
    
    private final com.woocommerce.android.databinding.RefundByItemsShippingBinding getShippingLinesBinding() {
        return null;
    }
    
    private final com.woocommerce.android.databinding.RefundByItemsFeesBinding getFeeLinesBinding() {
        return null;
    }
    
    private final com.woocommerce.android.ui.refunds.IssueRefundViewModel getViewModel() {
        return null;
    }
    
    @java.lang.Override
    public void onResume() {
    }
    
    @java.lang.Override
    public void onViewCreated(@org.jetbrains.annotations.NotNull
    android.view.View view, @org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override
    public void onDestroyView() {
    }
    
    private final void initializeViews() {
    }
    
    private final void setupObservers() {
    }
    
    private final void updateRefundNoticeView(java.lang.String refundNoticeText) {
    }
    
    @java.lang.Override
    public void onShippingLineSwitchChanged(boolean isChecked, long itemId) {
    }
    
    @java.lang.Override
    public void onFeeLineSwitchChanged(boolean isChecked, long itemId) {
    }
}