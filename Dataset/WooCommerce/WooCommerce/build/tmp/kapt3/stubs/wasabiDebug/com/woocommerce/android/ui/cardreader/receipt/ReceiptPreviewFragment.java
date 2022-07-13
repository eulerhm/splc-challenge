package com.woocommerce.android.ui.cardreader.receipt;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0002J\u0010\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u001a\u0010\u001f\u001a\u00020\u001b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010 \u001a\u0004\u0018\u00010!H\u0002J\u0018\u0010\"\u001a\u00020\u001b2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&H\u0016J\b\u0010\'\u001a\u00020\u001bH\u0016J\u0010\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+H\u0016J\b\u0010,\u001a\u00020\u001bH\u0016J\u0010\u0010-\u001a\u00020\u001b2\u0006\u0010.\u001a\u00020!H\u0016J\u001a\u0010/\u001a\u00020\u001b2\u0006\u00100\u001a\u0002012\b\u0010 \u001a\u0004\u0018\u00010!H\u0016R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u00020\u00048BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u001e\u0010\b\u001a\u00020\t8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001e\u0010\u000e\u001a\u00020\u000f8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0014\u001a\u00020\u00158FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0016\u0010\u0017\u00a8\u00062"}, d2 = {"Lcom/woocommerce/android/ui/cardreader/receipt/ReceiptPreviewFragment;", "Lcom/woocommerce/android/ui/base/BaseFragment;", "()V", "_binding", "Lcom/woocommerce/android/databinding/FragmentReceiptPreviewBinding;", "binding", "getBinding", "()Lcom/woocommerce/android/databinding/FragmentReceiptPreviewBinding;", "printHtmlHelper", "Lcom/woocommerce/android/util/PrintHtmlHelper;", "getPrintHtmlHelper", "()Lcom/woocommerce/android/util/PrintHtmlHelper;", "setPrintHtmlHelper", "(Lcom/woocommerce/android/util/PrintHtmlHelper;)V", "uiMessageResolver", "Lcom/woocommerce/android/ui/base/UIMessageResolver;", "getUiMessageResolver", "()Lcom/woocommerce/android/ui/base/UIMessageResolver;", "setUiMessageResolver", "(Lcom/woocommerce/android/ui/base/UIMessageResolver;)V", "viewModel", "Lcom/woocommerce/android/ui/cardreader/receipt/ReceiptPreviewViewModel;", "getViewModel", "()Lcom/woocommerce/android/ui/cardreader/receipt/ReceiptPreviewViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "composeEmail", "", "event", "Lcom/woocommerce/android/ui/cardreader/receipt/ReceiptEvent$SendReceipt;", "initObservers", "initViews", "savedInstanceState", "Landroid/os/Bundle;", "onCreateOptionsMenu", "menu", "Landroid/view/Menu;", "inflater", "Landroid/view/MenuInflater;", "onDestroyView", "onOptionsItemSelected", "", "item", "Landroid/view/MenuItem;", "onResume", "onSaveInstanceState", "outState", "onViewCreated", "view", "Landroid/view/View;", "WooCommerce_wasabiDebug"})
@dagger.hilt.android.AndroidEntryPoint
public final class ReceiptPreviewFragment extends com.woocommerce.android.ui.base.BaseFragment {
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy viewModel$delegate = null;
    @javax.inject.Inject
    public com.woocommerce.android.util.PrintHtmlHelper printHtmlHelper;
    @javax.inject.Inject
    public com.woocommerce.android.ui.base.UIMessageResolver uiMessageResolver;
    private com.woocommerce.android.databinding.FragmentReceiptPreviewBinding _binding;
    
    public ReceiptPreviewFragment() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.woocommerce.android.ui.cardreader.receipt.ReceiptPreviewViewModel getViewModel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.woocommerce.android.util.PrintHtmlHelper getPrintHtmlHelper() {
        return null;
    }
    
    public final void setPrintHtmlHelper(@org.jetbrains.annotations.NotNull
    com.woocommerce.android.util.PrintHtmlHelper p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.woocommerce.android.ui.base.UIMessageResolver getUiMessageResolver() {
        return null;
    }
    
    public final void setUiMessageResolver(@org.jetbrains.annotations.NotNull
    com.woocommerce.android.ui.base.UIMessageResolver p0) {
    }
    
    private final com.woocommerce.android.databinding.FragmentReceiptPreviewBinding getBinding() {
        return null;
    }
    
    @java.lang.Override
    public void onViewCreated(@org.jetbrains.annotations.NotNull
    android.view.View view, @org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override
    public void onCreateOptionsMenu(@org.jetbrains.annotations.NotNull
    android.view.Menu menu, @org.jetbrains.annotations.NotNull
    android.view.MenuInflater inflater) {
    }
    
    @java.lang.Override
    public boolean onOptionsItemSelected(@org.jetbrains.annotations.NotNull
    android.view.MenuItem item) {
        return false;
    }
    
    @java.lang.Override
    public void onResume() {
    }
    
    @java.lang.Override
    public void onSaveInstanceState(@org.jetbrains.annotations.NotNull
    android.os.Bundle outState) {
    }
    
    @java.lang.Override
    public void onDestroyView() {
    }
    
    private final void initViews(com.woocommerce.android.databinding.FragmentReceiptPreviewBinding binding, android.os.Bundle savedInstanceState) {
    }
    
    private final void initObservers(com.woocommerce.android.databinding.FragmentReceiptPreviewBinding binding) {
    }
    
    private final void composeEmail(com.woocommerce.android.ui.cardreader.receipt.ReceiptEvent.SendReceipt event) {
    }
}