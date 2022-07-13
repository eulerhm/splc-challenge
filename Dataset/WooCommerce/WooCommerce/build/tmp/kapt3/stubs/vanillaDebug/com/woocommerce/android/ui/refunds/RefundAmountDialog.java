package com.woocommerce.android.ui.refunds;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001b\u0010\t\u001a\u00020\n8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\u0013"}, d2 = {"Lcom/woocommerce/android/ui/refunds/RefundAmountDialog;", "Lcom/woocommerce/android/widgets/CurrencyAmountDialog;", "()V", "currencyFormatter", "Lcom/woocommerce/android/util/CurrencyFormatter;", "getCurrencyFormatter", "()Lcom/woocommerce/android/util/CurrencyFormatter;", "setCurrencyFormatter", "(Lcom/woocommerce/android/util/CurrencyFormatter;)V", "viewModel", "Lcom/woocommerce/android/ui/refunds/IssueRefundViewModel;", "getViewModel", "()Lcom/woocommerce/android/ui/refunds/IssueRefundViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "returnResult", "", "enteredAmount", "Ljava/math/BigDecimal;", "WooCommerce_vanillaDebug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class RefundAmountDialog extends com.woocommerce.android.widgets.CurrencyAmountDialog {
    @javax.inject.Inject()
    public com.woocommerce.android.util.CurrencyFormatter currencyFormatter;
    private final kotlin.Lazy viewModel$delegate = null;
    
    public RefundAmountDialog() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.woocommerce.android.util.CurrencyFormatter getCurrencyFormatter() {
        return null;
    }
    
    public final void setCurrencyFormatter(@org.jetbrains.annotations.NotNull()
    com.woocommerce.android.util.CurrencyFormatter p0) {
    }
    
    private final com.woocommerce.android.ui.refunds.IssueRefundViewModel getViewModel() {
        return null;
    }
    
    @java.lang.Override()
    public void returnResult(@org.jetbrains.annotations.NotNull()
    java.math.BigDecimal enteredAmount) {
    }
}