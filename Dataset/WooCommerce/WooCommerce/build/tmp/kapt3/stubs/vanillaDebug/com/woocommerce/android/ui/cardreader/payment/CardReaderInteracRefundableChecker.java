package com.woocommerce.android.ui.cardreader.payment;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0019\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\f"}, d2 = {"Lcom/woocommerce/android/ui/cardreader/payment/CardReaderInteracRefundableChecker;", "", "orderDetailRepository", "Lcom/woocommerce/android/ui/orders/details/OrderDetailRepository;", "cardReaderPaymentCurrencySupportedChecker", "Lcom/woocommerce/android/ui/cardreader/payment/CardReaderPaymentCurrencySupportedChecker;", "(Lcom/woocommerce/android/ui/orders/details/OrderDetailRepository;Lcom/woocommerce/android/ui/cardreader/payment/CardReaderPaymentCurrencySupportedChecker;)V", "isRefundable", "", "order", "Lcom/woocommerce/android/model/Order;", "(Lcom/woocommerce/android/model/Order;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "WooCommerce_vanillaDebug"})
public final class CardReaderInteracRefundableChecker {
    private final com.woocommerce.android.ui.orders.details.OrderDetailRepository orderDetailRepository = null;
    private final com.woocommerce.android.ui.cardreader.payment.CardReaderPaymentCurrencySupportedChecker cardReaderPaymentCurrencySupportedChecker = null;
    
    @javax.inject.Inject()
    public CardReaderInteracRefundableChecker(@org.jetbrains.annotations.NotNull()
    com.woocommerce.android.ui.orders.details.OrderDetailRepository orderDetailRepository, @org.jetbrains.annotations.NotNull()
    com.woocommerce.android.ui.cardreader.payment.CardReaderPaymentCurrencySupportedChecker cardReaderPaymentCurrencySupportedChecker) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object isRefundable(@org.jetbrains.annotations.NotNull()
    com.woocommerce.android.model.Order order, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
        return null;
    }
}