package com.woocommerce.android.ui.cardreader.payment;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 42\u00020\u0001:\u00014B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J \u0010\u001b\u001a\u00020\u00162\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u001fH\u0002J\b\u0010!\u001a\u00020\u0016H\u0002J\u0010\u0010\"\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\b\u0010#\u001a\u00020\u0016H\u0002J\u0012\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010\'H\u0016J&\u0010(\u001a\u0004\u0018\u00010)2\u0006\u0010*\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010-2\b\u0010&\u001a\u0004\u0018\u00010\'H\u0016J\b\u0010.\u001a\u00020\u0016H\u0016J\b\u0010/\u001a\u00020\u0016H\u0016J\u001a\u00100\u001a\u00020\u00162\u0006\u00101\u001a\u00020)2\b\u0010&\u001a\u0004\u0018\u00010\'H\u0016J\b\u00102\u001a\u00020\u0016H\u0002J\b\u00103\u001a\u00020\u0016H\u0002R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001b\u0010\u000f\u001a\u00020\u00108FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0012\u00a8\u00065"}, d2 = {"Lcom/woocommerce/android/ui/cardreader/payment/CardReaderPaymentDialogFragment;", "Landroidx/fragment/app/DialogFragment;", "()V", "printHtmlHelper", "Lcom/woocommerce/android/util/PrintHtmlHelper;", "getPrintHtmlHelper", "()Lcom/woocommerce/android/util/PrintHtmlHelper;", "setPrintHtmlHelper", "(Lcom/woocommerce/android/util/PrintHtmlHelper;)V", "uiMessageResolver", "Lcom/woocommerce/android/ui/base/UIMessageResolver;", "getUiMessageResolver", "()Lcom/woocommerce/android/ui/base/UIMessageResolver;", "setUiMessageResolver", "(Lcom/woocommerce/android/ui/base/UIMessageResolver;)V", "viewModel", "Lcom/woocommerce/android/ui/cardreader/payment/CardReaderPaymentViewModel;", "getViewModel", "()Lcom/woocommerce/android/ui/cardreader/payment/CardReaderPaymentViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "announceForAccessibility", "", "binding", "Lcom/woocommerce/android/databinding/CardReaderPaymentDialogBinding;", "viewState", "Lcom/woocommerce/android/ui/cardreader/payment/ViewState;", "composeEmail", "address", "", "subject", "Lcom/woocommerce/android/model/UiString;", "content", "disableDigitalWallets", "initObservers", "initViewModel", "onCreateDialog", "Landroid/app/Dialog;", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onPause", "onResume", "onViewCreated", "view", "playChaChing", "reEnableDigitalWallets", "Companion", "WooCommerce_vanillaDebug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class CardReaderPaymentDialogFragment extends androidx.fragment.app.DialogFragment {
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy viewModel$delegate = null;
    @javax.inject.Inject()
    public com.woocommerce.android.util.PrintHtmlHelper printHtmlHelper;
    @javax.inject.Inject()
    public com.woocommerce.android.ui.base.UIMessageResolver uiMessageResolver;
    @org.jetbrains.annotations.NotNull()
    public static final com.woocommerce.android.ui.cardreader.payment.CardReaderPaymentDialogFragment.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String KEY_CARD_PAYMENT_RESULT = "key_card_payment_result";
    
    public CardReaderPaymentDialogFragment() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.woocommerce.android.ui.cardreader.payment.CardReaderPaymentViewModel getViewModel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.woocommerce.android.util.PrintHtmlHelper getPrintHtmlHelper() {
        return null;
    }
    
    public final void setPrintHtmlHelper(@org.jetbrains.annotations.NotNull()
    com.woocommerce.android.util.PrintHtmlHelper p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.woocommerce.android.ui.base.UIMessageResolver getUiMessageResolver() {
        return null;
    }
    
    public final void setUiMessageResolver(@org.jetbrains.annotations.NotNull()
    com.woocommerce.android.ui.base.UIMessageResolver p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.app.Dialog onCreateDialog(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void initViewModel() {
    }
    
    private final void initObservers(com.woocommerce.android.databinding.CardReaderPaymentDialogBinding binding) {
    }
    
    private final void announceForAccessibility(com.woocommerce.android.databinding.CardReaderPaymentDialogBinding binding, com.woocommerce.android.ui.cardreader.payment.ViewState viewState) {
    }
    
    private final void playChaChing() {
    }
    
    private final void composeEmail(java.lang.String address, com.woocommerce.android.model.UiString subject, com.woocommerce.android.model.UiString content) {
    }
    
    @java.lang.Override()
    public void onResume() {
    }
    
    @java.lang.Override()
    public void onPause() {
    }
    
    /**
     * Disables digital wallets (eg. Google Pay) in order to prevent the merchant from accidentally charging themselves
     * instead of the customer.
     */
    private final void disableDigitalWallets() {
    }
    
    private final void reEnableDigitalWallets() {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/woocommerce/android/ui/cardreader/payment/CardReaderPaymentDialogFragment$Companion;", "", "()V", "KEY_CARD_PAYMENT_RESULT", "", "WooCommerce_vanillaDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}