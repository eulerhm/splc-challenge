package com.woocommerce.android.ui.cardreader.payment;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u0013\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\rJ\u0019\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\fH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0011R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0012"}, d2 = {"Lcom/woocommerce/android/ui/cardreader/payment/CardReaderPaymentCurrencySupportedChecker;", "", "dispatchers", "Lcom/woocommerce/android/util/CoroutineDispatchers;", "wooStore", "Lorg/wordpress/android/fluxc/store/WooCommerceStore;", "selectedSite", "Lcom/woocommerce/android/tools/SelectedSite;", "cardReaderCountryConfigProvider", "Lcom/woocommerce/android/ui/cardreader/CardReaderCountryConfigProvider;", "(Lcom/woocommerce/android/util/CoroutineDispatchers;Lorg/wordpress/android/fluxc/store/WooCommerceStore;Lcom/woocommerce/android/tools/SelectedSite;Lcom/woocommerce/android/ui/cardreader/CardReaderCountryConfigProvider;)V", "getStoreCountryCode", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isCurrencySupported", "", "currency", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "WooCommerce_wasabiDebug"})
public final class CardReaderPaymentCurrencySupportedChecker {
    private final com.woocommerce.android.util.CoroutineDispatchers dispatchers = null;
    private final org.wordpress.android.fluxc.store.WooCommerceStore wooStore = null;
    private final com.woocommerce.android.tools.SelectedSite selectedSite = null;
    private final com.woocommerce.android.ui.cardreader.CardReaderCountryConfigProvider cardReaderCountryConfigProvider = null;
    
    @javax.inject.Inject
    public CardReaderPaymentCurrencySupportedChecker(@org.jetbrains.annotations.NotNull
    com.woocommerce.android.util.CoroutineDispatchers dispatchers, @org.jetbrains.annotations.NotNull
    org.wordpress.android.fluxc.store.WooCommerceStore wooStore, @org.jetbrains.annotations.NotNull
    com.woocommerce.android.tools.SelectedSite selectedSite, @org.jetbrains.annotations.NotNull
    com.woocommerce.android.ui.cardreader.CardReaderCountryConfigProvider cardReaderCountryConfigProvider) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object isCurrencySupported(@org.jetbrains.annotations.NotNull
    java.lang.String currency, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
        return null;
    }
    
    private final java.lang.Object getStoreCountryCode(kotlin.coroutines.Continuation<? super java.lang.String> continuation) {
        return null;
    }
}