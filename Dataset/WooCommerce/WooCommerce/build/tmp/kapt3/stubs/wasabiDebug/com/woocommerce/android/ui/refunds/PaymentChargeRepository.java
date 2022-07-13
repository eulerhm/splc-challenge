package com.woocommerce.android.ui.refunds;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00152\u00020\u0001:\u0002\u0014\u0015B\'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u0019\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fJ\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0012J\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0011H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0012R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0016"}, d2 = {"Lcom/woocommerce/android/ui/refunds/PaymentChargeRepository;", "", "ippStore", "Lorg/wordpress/android/fluxc/store/WCInPersonPaymentsStore;", "selectedSite", "Lcom/woocommerce/android/tools/SelectedSite;", "appPrefs", "Lcom/woocommerce/android/AppPrefs;", "cardReaderOnboardingChecker", "Lcom/woocommerce/android/ui/cardreader/onboarding/CardReaderOnboardingChecker;", "(Lorg/wordpress/android/fluxc/store/WCInPersonPaymentsStore;Lcom/woocommerce/android/tools/SelectedSite;Lcom/woocommerce/android/AppPrefs;Lcom/woocommerce/android/ui/cardreader/onboarding/CardReaderOnboardingChecker;)V", "fetchCardDataUsedForOrderPayment", "Lcom/woocommerce/android/ui/refunds/PaymentChargeRepository$CardDataUsedForOrderPaymentResult;", "chargeId", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchPreferredPlugin", "Lorg/wordpress/android/fluxc/store/WCInPersonPaymentsStore$InPersonPaymentsPluginType;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getActivePlugin", "CardDataUsedForOrderPaymentResult", "Companion", "WooCommerce_wasabiDebug"})
public final class PaymentChargeRepository {
    private final org.wordpress.android.fluxc.store.WCInPersonPaymentsStore ippStore = null;
    private final com.woocommerce.android.tools.SelectedSite selectedSite = null;
    private final com.woocommerce.android.AppPrefs appPrefs = null;
    private final com.woocommerce.android.ui.cardreader.onboarding.CardReaderOnboardingChecker cardReaderOnboardingChecker = null;
    @org.jetbrains.annotations.NotNull
    public static final com.woocommerce.android.ui.refunds.PaymentChargeRepository.Companion Companion = null;
    private static final java.lang.String INTERAC_PRESENT = "interac_present";
    private static final java.lang.String CARD_PRESENT = "card_present";
    
    @javax.inject.Inject
    public PaymentChargeRepository(@org.jetbrains.annotations.NotNull
    org.wordpress.android.fluxc.store.WCInPersonPaymentsStore ippStore, @org.jetbrains.annotations.NotNull
    com.woocommerce.android.tools.SelectedSite selectedSite, @org.jetbrains.annotations.NotNull
    com.woocommerce.android.AppPrefs appPrefs, @org.jetbrains.annotations.NotNull
    com.woocommerce.android.ui.cardreader.onboarding.CardReaderOnboardingChecker cardReaderOnboardingChecker) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object fetchCardDataUsedForOrderPayment(@org.jetbrains.annotations.NotNull
    java.lang.String chargeId, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.woocommerce.android.ui.refunds.PaymentChargeRepository.CardDataUsedForOrderPaymentResult> continuation) {
        return null;
    }
    
    private final java.lang.Object getActivePlugin(kotlin.coroutines.Continuation<? super org.wordpress.android.fluxc.store.WCInPersonPaymentsStore.InPersonPaymentsPluginType> continuation) {
        return null;
    }
    
    private final java.lang.Object fetchPreferredPlugin(kotlin.coroutines.Continuation<? super org.wordpress.android.fluxc.store.WCInPersonPaymentsStore.InPersonPaymentsPluginType> continuation) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/woocommerce/android/ui/refunds/PaymentChargeRepository$CardDataUsedForOrderPaymentResult;", "", "()V", "Error", "Success", "Lcom/woocommerce/android/ui/refunds/PaymentChargeRepository$CardDataUsedForOrderPaymentResult$Error;", "Lcom/woocommerce/android/ui/refunds/PaymentChargeRepository$CardDataUsedForOrderPaymentResult$Success;", "WooCommerce_wasabiDebug"})
    public static abstract class CardDataUsedForOrderPaymentResult {
        
        private CardDataUsedForOrderPaymentResult() {
            super();
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/woocommerce/android/ui/refunds/PaymentChargeRepository$CardDataUsedForOrderPaymentResult$Error;", "Lcom/woocommerce/android/ui/refunds/PaymentChargeRepository$CardDataUsedForOrderPaymentResult;", "()V", "WooCommerce_wasabiDebug"})
        public static final class Error extends com.woocommerce.android.ui.refunds.PaymentChargeRepository.CardDataUsedForOrderPaymentResult {
            @org.jetbrains.annotations.NotNull
            public static final com.woocommerce.android.ui.refunds.PaymentChargeRepository.CardDataUsedForOrderPaymentResult.Error INSTANCE = null;
            
            private Error() {
                super();
            }
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0006J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J-\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u00d6\u0003J\t\u0010\u0013\u001a\u00020\u0014H\u00d6\u0001J\t\u0010\u0015\u001a\u00020\u0003H\u00d6\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b\u00a8\u0006\u0016"}, d2 = {"Lcom/woocommerce/android/ui/refunds/PaymentChargeRepository$CardDataUsedForOrderPaymentResult$Success;", "Lcom/woocommerce/android/ui/refunds/PaymentChargeRepository$CardDataUsedForOrderPaymentResult;", "cardBrand", "", "cardLast4", "paymentMethodType", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCardBrand", "()Ljava/lang/String;", "getCardLast4", "getPaymentMethodType", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "WooCommerce_wasabiDebug"})
        public static final class Success extends com.woocommerce.android.ui.refunds.PaymentChargeRepository.CardDataUsedForOrderPaymentResult {
            @org.jetbrains.annotations.Nullable
            private final java.lang.String cardBrand = null;
            @org.jetbrains.annotations.Nullable
            private final java.lang.String cardLast4 = null;
            @org.jetbrains.annotations.Nullable
            private final java.lang.String paymentMethodType = null;
            
            @org.jetbrains.annotations.NotNull
            public final com.woocommerce.android.ui.refunds.PaymentChargeRepository.CardDataUsedForOrderPaymentResult.Success copy(@org.jetbrains.annotations.Nullable
            java.lang.String cardBrand, @org.jetbrains.annotations.Nullable
            java.lang.String cardLast4, @org.jetbrains.annotations.Nullable
            java.lang.String paymentMethodType) {
                return null;
            }
            
            @java.lang.Override
            public boolean equals(@org.jetbrains.annotations.Nullable
            java.lang.Object other) {
                return false;
            }
            
            @java.lang.Override
            public int hashCode() {
                return 0;
            }
            
            @org.jetbrains.annotations.NotNull
            @java.lang.Override
            public java.lang.String toString() {
                return null;
            }
            
            public Success(@org.jetbrains.annotations.Nullable
            java.lang.String cardBrand, @org.jetbrains.annotations.Nullable
            java.lang.String cardLast4, @org.jetbrains.annotations.Nullable
            java.lang.String paymentMethodType) {
                super();
            }
            
            @org.jetbrains.annotations.Nullable
            public final java.lang.String component1() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable
            public final java.lang.String getCardBrand() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable
            public final java.lang.String component2() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable
            public final java.lang.String getCardLast4() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable
            public final java.lang.String component3() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable
            public final java.lang.String getPaymentMethodType() {
                return null;
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/woocommerce/android/ui/refunds/PaymentChargeRepository$Companion;", "", "()V", "CARD_PRESENT", "", "INTERAC_PRESENT", "WooCommerce_wasabiDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}