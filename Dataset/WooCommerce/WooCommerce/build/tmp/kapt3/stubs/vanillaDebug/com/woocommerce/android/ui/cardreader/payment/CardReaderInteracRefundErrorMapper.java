package com.woocommerce.android.ui.cardreader.payment;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007\b\u0007\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n\u00a8\u0006\u000b"}, d2 = {"Lcom/woocommerce/android/ui/cardreader/payment/CardReaderInteracRefundErrorMapper;", "", "()V", "mapRefundDeclinedErrorType", "Lcom/woocommerce/android/ui/cardreader/payment/InteracRefundFlowError$Declined;", "interacRefundStatusErrorType", "Lcom/woocommerce/android/cardreader/payments/CardInteracRefundStatus$RefundStatusErrorType$DeclinedByBackendError;", "mapRefundErrorToUiError", "Lcom/woocommerce/android/ui/cardreader/payment/InteracRefundFlowError;", "errorType", "Lcom/woocommerce/android/cardreader/payments/CardInteracRefundStatus$RefundStatusErrorType;", "WooCommerce_vanillaDebug"})
public final class CardReaderInteracRefundErrorMapper {
    
    @javax.inject.Inject()
    public CardReaderInteracRefundErrorMapper() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.woocommerce.android.ui.cardreader.payment.InteracRefundFlowError mapRefundErrorToUiError(@org.jetbrains.annotations.NotNull()
    com.woocommerce.android.cardreader.payments.CardInteracRefundStatus.RefundStatusErrorType errorType) {
        return null;
    }
    
    @kotlin.Suppress(names = {"ComplexMethod"})
    private final com.woocommerce.android.ui.cardreader.payment.InteracRefundFlowError.Declined mapRefundDeclinedErrorType(com.woocommerce.android.cardreader.payments.CardInteracRefundStatus.RefundStatusErrorType.DeclinedByBackendError interacRefundStatusErrorType) {
        return null;
    }
}