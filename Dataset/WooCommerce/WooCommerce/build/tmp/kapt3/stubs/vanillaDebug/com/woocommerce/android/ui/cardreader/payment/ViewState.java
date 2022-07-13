package com.woocommerce.android.ui.cardreader.payment;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u000e+,-./012345678B{\b\u0004\u0012\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0003\u0010\b\u001a\u00020\u0003\u0012\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u000fR\u0016\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0096\u0004\u00a2\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0014\u0010\u0015R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0096\u0004\u00a2\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0017\u0010\u0015R\u0015\u0010\t\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0018\u0010\u0015R\u0014\u0010\n\u001a\u00020\u000bX\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0019R\u001c\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u001bX\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u001c\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u001bX\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010\u001eR\u001c\u0010!\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u001bX\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001eR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b#\u0010\u0015R\u0011\u0010\b\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0015\u0010\f\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b&\u0010\u0015R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\'\u0010(R\u0015\u0010\r\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b)\u0010\u0015R\u0015\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b*\u0010\u0015\u0082\u0001\u000e9:;<=>?@ABCDEF\u00a8\u0006G"}, d2 = {"Lcom/woocommerce/android/ui/cardreader/payment/ViewState;", "", "hintLabel", "", "headerLabel", "paymentStateLabel", "receiptSentAutomaticallyHint", "Lcom/woocommerce/android/model/UiString;", "paymentStateLabelTopMargin", "illustration", "isProgressVisible", "", "primaryActionLabel", "secondaryActionLabel", "tertiaryActionLabel", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/woocommerce/android/model/UiString;ILjava/lang/Integer;ZLjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "amountWithCurrencyLabel", "", "getAmountWithCurrencyLabel", "()Ljava/lang/String;", "getHeaderLabel", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getHintLabel", "getIllustration", "()Z", "onPrimaryActionClicked", "Lkotlin/Function0;", "", "getOnPrimaryActionClicked", "()Lkotlin/jvm/functions/Function0;", "onSecondaryActionClicked", "getOnSecondaryActionClicked", "onTertiaryActionClicked", "getOnTertiaryActionClicked", "getPaymentStateLabel", "getPaymentStateLabelTopMargin", "()I", "getPrimaryActionLabel", "getReceiptSentAutomaticallyHint", "()Lcom/woocommerce/android/model/UiString;", "getSecondaryActionLabel", "getTertiaryActionLabel", "CapturingPaymentState", "CollectPaymentState", "CollectRefundState", "FailedPaymentState", "FailedRefundState", "LoadingDataState", "PaymentSuccessfulReceiptSentAutomaticallyState", "PaymentSuccessfulState", "PrintingReceiptState", "ProcessingPaymentState", "ProcessingRefundState", "ReFetchingOrderState", "RefundLoadingDataState", "RefundSuccessfulState", "Lcom/woocommerce/android/ui/cardreader/payment/ViewState$LoadingDataState;", "Lcom/woocommerce/android/ui/cardreader/payment/ViewState$FailedPaymentState;", "Lcom/woocommerce/android/ui/cardreader/payment/ViewState$CollectPaymentState;", "Lcom/woocommerce/android/ui/cardreader/payment/ViewState$ProcessingPaymentState;", "Lcom/woocommerce/android/ui/cardreader/payment/ViewState$CapturingPaymentState;", "Lcom/woocommerce/android/ui/cardreader/payment/ViewState$PaymentSuccessfulState;", "Lcom/woocommerce/android/ui/cardreader/payment/ViewState$PaymentSuccessfulReceiptSentAutomaticallyState;", "Lcom/woocommerce/android/ui/cardreader/payment/ViewState$PrintingReceiptState;", "Lcom/woocommerce/android/ui/cardreader/payment/ViewState$ReFetchingOrderState;", "Lcom/woocommerce/android/ui/cardreader/payment/ViewState$RefundLoadingDataState;", "Lcom/woocommerce/android/ui/cardreader/payment/ViewState$FailedRefundState;", "Lcom/woocommerce/android/ui/cardreader/payment/ViewState$CollectRefundState;", "Lcom/woocommerce/android/ui/cardreader/payment/ViewState$ProcessingRefundState;", "Lcom/woocommerce/android/ui/cardreader/payment/ViewState$RefundSuccessfulState;", "WooCommerce_vanillaDebug"})
public abstract class ViewState {
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Integer hintLabel = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Integer headerLabel = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Integer paymentStateLabel = null;
    @org.jetbrains.annotations.Nullable()
    private final com.woocommerce.android.model.UiString receiptSentAutomaticallyHint = null;
    private final int paymentStateLabelTopMargin = 0;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Integer illustration = null;
    private final boolean isProgressVisible = false;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Integer primaryActionLabel = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Integer secondaryActionLabel = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Integer tertiaryActionLabel = null;
    @org.jetbrains.annotations.Nullable()
    private final kotlin.jvm.functions.Function0<kotlin.Unit> onPrimaryActionClicked = null;
    @org.jetbrains.annotations.Nullable()
    private final kotlin.jvm.functions.Function0<kotlin.Unit> onSecondaryActionClicked = null;
    @org.jetbrains.annotations.Nullable()
    private final kotlin.jvm.functions.Function0<kotlin.Unit> onTertiaryActionClicked = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String amountWithCurrencyLabel = null;
    
    private ViewState(@androidx.annotation.StringRes()
    java.lang.Integer hintLabel, @androidx.annotation.StringRes()
    java.lang.Integer headerLabel, @androidx.annotation.StringRes()
    java.lang.Integer paymentStateLabel, com.woocommerce.android.model.UiString receiptSentAutomaticallyHint, @androidx.annotation.DimenRes()
    int paymentStateLabelTopMargin, @androidx.annotation.DrawableRes()
    java.lang.Integer illustration, boolean isProgressVisible, java.lang.Integer primaryActionLabel, java.lang.Integer secondaryActionLabel, java.lang.Integer tertiaryActionLabel) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public java.lang.Integer getHintLabel() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public java.lang.Integer getHeaderLabel() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getPaymentStateLabel() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public com.woocommerce.android.model.UiString getReceiptSentAutomaticallyHint() {
        return null;
    }
    
    public final int getPaymentStateLabelTopMargin() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getIllustration() {
        return null;
    }
    
    public boolean isProgressVisible() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getPrimaryActionLabel() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getSecondaryActionLabel() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getTertiaryActionLabel() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public kotlin.jvm.functions.Function0<kotlin.Unit> getOnPrimaryActionClicked() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public kotlin.jvm.functions.Function0<kotlin.Unit> getOnSecondaryActionClicked() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public kotlin.jvm.functions.Function0<kotlin.Unit> getOnTertiaryActionClicked() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public java.lang.String getAmountWithCurrencyLabel() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u00058VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\b"}, d2 = {"Lcom/woocommerce/android/ui/cardreader/payment/ViewState$LoadingDataState;", "Lcom/woocommerce/android/ui/cardreader/payment/ViewState;", "Lcom/woocommerce/android/ui/cardreader/payment/PaymentFlow;", "()V", "nameForTracking", "", "getNameForTracking", "()Ljava/lang/String;", "WooCommerce_vanillaDebug"})
    public static final class LoadingDataState extends com.woocommerce.android.ui.cardreader.payment.ViewState implements com.woocommerce.android.ui.cardreader.payment.PaymentFlow {
        @org.jetbrains.annotations.NotNull()
        public static final com.woocommerce.android.ui.cardreader.payment.ViewState.LoadingDataState INSTANCE = null;
        
        private LoadingDataState() {
            super(null, null, null, null, 0, null, false, null, null, null);
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String getNameForTracking() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u00a2\u0006\u0002\u0010\u000bJ\t\u0010\u0011\u001a\u00020\u0003H\u00c2\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0007H\u00c2\u0003\u00a2\u0006\u0002\u0010\u0014J\u000f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u00c6\u0003J@\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u00c6\u0001\u00a2\u0006\u0002\u0010\u0017J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u00d6\u0003J\t\u0010\u001c\u001a\u00020\u0007H\u00d6\u0001J\t\u0010\u001d\u001a\u00020\u0005H\u00d6\u0001R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\u0010\u00a8\u0006\u001e"}, d2 = {"Lcom/woocommerce/android/ui/cardreader/payment/ViewState$FailedPaymentState;", "Lcom/woocommerce/android/ui/cardreader/payment/ViewState;", "errorType", "Lcom/woocommerce/android/ui/cardreader/payment/PaymentFlowError;", "amountWithCurrencyLabel", "", "primaryLabel", "", "onPrimaryActionClicked", "Lkotlin/Function0;", "", "(Lcom/woocommerce/android/ui/cardreader/payment/PaymentFlowError;Ljava/lang/String;Ljava/lang/Integer;Lkotlin/jvm/functions/Function0;)V", "getAmountWithCurrencyLabel", "()Ljava/lang/String;", "getOnPrimaryActionClicked", "()Lkotlin/jvm/functions/Function0;", "Ljava/lang/Integer;", "component1", "component2", "component3", "()Ljava/lang/Integer;", "component4", "copy", "(Lcom/woocommerce/android/ui/cardreader/payment/PaymentFlowError;Ljava/lang/String;Ljava/lang/Integer;Lkotlin/jvm/functions/Function0;)Lcom/woocommerce/android/ui/cardreader/payment/ViewState$FailedPaymentState;", "equals", "", "other", "", "hashCode", "toString", "WooCommerce_vanillaDebug"})
    public static final class FailedPaymentState extends com.woocommerce.android.ui.cardreader.payment.ViewState {
        private final com.woocommerce.android.ui.cardreader.payment.PaymentFlowError errorType = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String amountWithCurrencyLabel = null;
        private final java.lang.Integer primaryLabel = null;
        @org.jetbrains.annotations.NotNull()
        private final kotlin.jvm.functions.Function0<kotlin.Unit> onPrimaryActionClicked = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.woocommerce.android.ui.cardreader.payment.ViewState.FailedPaymentState copy(@org.jetbrains.annotations.NotNull()
        com.woocommerce.android.ui.cardreader.payment.PaymentFlowError errorType, @org.jetbrains.annotations.Nullable()
        java.lang.String amountWithCurrencyLabel, @org.jetbrains.annotations.Nullable()
        java.lang.Integer primaryLabel, @org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function0<kotlin.Unit> onPrimaryActionClicked) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        public FailedPaymentState(@org.jetbrains.annotations.NotNull()
        com.woocommerce.android.ui.cardreader.payment.PaymentFlowError errorType, @org.jetbrains.annotations.Nullable()
        java.lang.String amountWithCurrencyLabel, @org.jetbrains.annotations.Nullable()
        java.lang.Integer primaryLabel, @org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function0<kotlin.Unit> onPrimaryActionClicked) {
            super(null, null, null, null, 0, null, false, null, null, null);
        }
        
        private final com.woocommerce.android.ui.cardreader.payment.PaymentFlowError component1() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component2() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        @java.lang.Override()
        public java.lang.String getAmountWithCurrencyLabel() {
            return null;
        }
        
        private final java.lang.Integer component3() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final kotlin.jvm.functions.Function0<kotlin.Unit> component4() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public kotlin.jvm.functions.Function0<kotlin.Unit> getOnPrimaryActionClicked() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002B!\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\bJ\t\u0010\u0010\u001a\u00020\u0004H\u00c6\u0003J\t\u0010\u0011\u001a\u00020\u0006H\u00c6\u0003J\t\u0010\u0012\u001a\u00020\u0006H\u00c6\u0003J\'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u00c6\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u00d6\u0003J\t\u0010\u0018\u001a\u00020\u0006H\u00d6\u0001J\t\u0010\u0019\u001a\u00020\u0004H\u00d6\u0001R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u0007\u001a\u00020\u0006X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0014\u0010\u000e\u001a\u00020\u00048VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000f\u0010\n\u00a8\u0006\u001a"}, d2 = {"Lcom/woocommerce/android/ui/cardreader/payment/ViewState$CollectPaymentState;", "Lcom/woocommerce/android/ui/cardreader/payment/ViewState;", "Lcom/woocommerce/android/ui/cardreader/payment/PaymentFlow;", "amountWithCurrencyLabel", "", "hintLabel", "", "headerLabel", "(Ljava/lang/String;II)V", "getAmountWithCurrencyLabel", "()Ljava/lang/String;", "getHeaderLabel", "()Ljava/lang/Integer;", "getHintLabel", "nameForTracking", "getNameForTracking", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "toString", "WooCommerce_vanillaDebug"})
    public static final class CollectPaymentState extends com.woocommerce.android.ui.cardreader.payment.ViewState implements com.woocommerce.android.ui.cardreader.payment.PaymentFlow {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String amountWithCurrencyLabel = null;
        private final int hintLabel = 0;
        private final int headerLabel = 0;
        
        @org.jetbrains.annotations.NotNull()
        public final com.woocommerce.android.ui.cardreader.payment.ViewState.CollectPaymentState copy(@org.jetbrains.annotations.NotNull()
        java.lang.String amountWithCurrencyLabel, int hintLabel, int headerLabel) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        public CollectPaymentState(@org.jetbrains.annotations.NotNull()
        java.lang.String amountWithCurrencyLabel, int hintLabel, int headerLabel) {
            super(null, null, null, null, 0, null, false, null, null, null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String getAmountWithCurrencyLabel() {
            return null;
        }
        
        public final int component2() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.Integer getHintLabel() {
            return null;
        }
        
        public final int component3() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.Integer getHeaderLabel() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String getNameForTracking() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\t\u0010\n\u001a\u00020\u0004H\u00c6\u0003J\u0013\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0004H\u00c6\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u00d6\u0003J\t\u0010\u0010\u001a\u00020\u0011H\u00d6\u0001J\t\u0010\u0012\u001a\u00020\u0004H\u00d6\u0001R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00048VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\t\u0010\u0007\u00a8\u0006\u0013"}, d2 = {"Lcom/woocommerce/android/ui/cardreader/payment/ViewState$ProcessingPaymentState;", "Lcom/woocommerce/android/ui/cardreader/payment/ViewState;", "Lcom/woocommerce/android/ui/cardreader/payment/PaymentFlow;", "amountWithCurrencyLabel", "", "(Ljava/lang/String;)V", "getAmountWithCurrencyLabel", "()Ljava/lang/String;", "nameForTracking", "getNameForTracking", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "WooCommerce_vanillaDebug"})
    public static final class ProcessingPaymentState extends com.woocommerce.android.ui.cardreader.payment.ViewState implements com.woocommerce.android.ui.cardreader.payment.PaymentFlow {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String amountWithCurrencyLabel = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.woocommerce.android.ui.cardreader.payment.ViewState.ProcessingPaymentState copy(@org.jetbrains.annotations.NotNull()
        java.lang.String amountWithCurrencyLabel) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        public ProcessingPaymentState(@org.jetbrains.annotations.NotNull()
        java.lang.String amountWithCurrencyLabel) {
            super(null, null, null, null, 0, null, false, null, null, null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String getAmountWithCurrencyLabel() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String getNameForTracking() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\t\u0010\n\u001a\u00020\u0004H\u00c6\u0003J\u0013\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0004H\u00c6\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u00d6\u0003J\t\u0010\u0010\u001a\u00020\u0011H\u00d6\u0001J\t\u0010\u0012\u001a\u00020\u0004H\u00d6\u0001R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00048VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\t\u0010\u0007\u00a8\u0006\u0013"}, d2 = {"Lcom/woocommerce/android/ui/cardreader/payment/ViewState$CapturingPaymentState;", "Lcom/woocommerce/android/ui/cardreader/payment/ViewState;", "Lcom/woocommerce/android/ui/cardreader/payment/PaymentFlow;", "amountWithCurrencyLabel", "", "(Ljava/lang/String;)V", "getAmountWithCurrencyLabel", "()Ljava/lang/String;", "nameForTracking", "getNameForTracking", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "WooCommerce_vanillaDebug"})
    public static final class CapturingPaymentState extends com.woocommerce.android.ui.cardreader.payment.ViewState implements com.woocommerce.android.ui.cardreader.payment.PaymentFlow {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String amountWithCurrencyLabel = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.woocommerce.android.ui.cardreader.payment.ViewState.CapturingPaymentState copy(@org.jetbrains.annotations.NotNull()
        java.lang.String amountWithCurrencyLabel) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        public CapturingPaymentState(@org.jetbrains.annotations.NotNull()
        java.lang.String amountWithCurrencyLabel) {
            super(null, null, null, null, 0, null, false, null, null, null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String getAmountWithCurrencyLabel() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String getNameForTracking() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\u0002\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003H\u00c6\u0003J\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u00c6\u0003J\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u00c6\u0003J\u000f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u00c6\u0003JC\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u00c6\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u00d6\u0003J\t\u0010\u0019\u001a\u00020\u001aH\u00d6\u0001J\t\u0010\u001b\u001a\u00020\u0003H\u00d6\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\r\u00a8\u0006\u001c"}, d2 = {"Lcom/woocommerce/android/ui/cardreader/payment/ViewState$PaymentSuccessfulState;", "Lcom/woocommerce/android/ui/cardreader/payment/ViewState;", "amountWithCurrencyLabel", "", "onPrimaryActionClicked", "Lkotlin/Function0;", "", "onSecondaryActionClicked", "onTertiaryActionClicked", "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "getAmountWithCurrencyLabel", "()Ljava/lang/String;", "getOnPrimaryActionClicked", "()Lkotlin/jvm/functions/Function0;", "getOnSecondaryActionClicked", "getOnTertiaryActionClicked", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "", "toString", "WooCommerce_vanillaDebug"})
    public static final class PaymentSuccessfulState extends com.woocommerce.android.ui.cardreader.payment.ViewState {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String amountWithCurrencyLabel = null;
        @org.jetbrains.annotations.NotNull()
        private final kotlin.jvm.functions.Function0<kotlin.Unit> onPrimaryActionClicked = null;
        @org.jetbrains.annotations.NotNull()
        private final kotlin.jvm.functions.Function0<kotlin.Unit> onSecondaryActionClicked = null;
        @org.jetbrains.annotations.NotNull()
        private final kotlin.jvm.functions.Function0<kotlin.Unit> onTertiaryActionClicked = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.woocommerce.android.ui.cardreader.payment.ViewState.PaymentSuccessfulState copy(@org.jetbrains.annotations.NotNull()
        java.lang.String amountWithCurrencyLabel, @org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function0<kotlin.Unit> onPrimaryActionClicked, @org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function0<kotlin.Unit> onSecondaryActionClicked, @org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function0<kotlin.Unit> onTertiaryActionClicked) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        public PaymentSuccessfulState(@org.jetbrains.annotations.NotNull()
        java.lang.String amountWithCurrencyLabel, @org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function0<kotlin.Unit> onPrimaryActionClicked, @org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function0<kotlin.Unit> onSecondaryActionClicked, @org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function0<kotlin.Unit> onTertiaryActionClicked) {
            super(null, null, null, null, 0, null, false, null, null, null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String getAmountWithCurrencyLabel() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final kotlin.jvm.functions.Function0<kotlin.Unit> component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public kotlin.jvm.functions.Function0<kotlin.Unit> getOnPrimaryActionClicked() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final kotlin.jvm.functions.Function0<kotlin.Unit> component3() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public kotlin.jvm.functions.Function0<kotlin.Unit> getOnSecondaryActionClicked() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final kotlin.jvm.functions.Function0<kotlin.Unit> component4() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public kotlin.jvm.functions.Function0<kotlin.Unit> getOnTertiaryActionClicked() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u00a2\u0006\u0002\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0013\u001a\u00020\u0005H\u00c6\u0003J\u000f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u00c6\u0003J\u000f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u00c6\u0003J=\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u00c6\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u00d6\u0003J\t\u0010\u001b\u001a\u00020\u001cH\u00d6\u0001J\t\u0010\u001d\u001a\u00020\u0003H\u00d6\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011\u00a8\u0006\u001e"}, d2 = {"Lcom/woocommerce/android/ui/cardreader/payment/ViewState$PaymentSuccessfulReceiptSentAutomaticallyState;", "Lcom/woocommerce/android/ui/cardreader/payment/ViewState;", "amountWithCurrencyLabel", "", "receiptSentAutomaticallyHint", "Lcom/woocommerce/android/model/UiString;", "onPrimaryActionClicked", "Lkotlin/Function0;", "", "onTertiaryActionClicked", "(Ljava/lang/String;Lcom/woocommerce/android/model/UiString;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "getAmountWithCurrencyLabel", "()Ljava/lang/String;", "getOnPrimaryActionClicked", "()Lkotlin/jvm/functions/Function0;", "getOnTertiaryActionClicked", "getReceiptSentAutomaticallyHint", "()Lcom/woocommerce/android/model/UiString;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "", "toString", "WooCommerce_vanillaDebug"})
    public static final class PaymentSuccessfulReceiptSentAutomaticallyState extends com.woocommerce.android.ui.cardreader.payment.ViewState {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String amountWithCurrencyLabel = null;
        @org.jetbrains.annotations.NotNull()
        private final com.woocommerce.android.model.UiString receiptSentAutomaticallyHint = null;
        @org.jetbrains.annotations.NotNull()
        private final kotlin.jvm.functions.Function0<kotlin.Unit> onPrimaryActionClicked = null;
        @org.jetbrains.annotations.NotNull()
        private final kotlin.jvm.functions.Function0<kotlin.Unit> onTertiaryActionClicked = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.woocommerce.android.ui.cardreader.payment.ViewState.PaymentSuccessfulReceiptSentAutomaticallyState copy(@org.jetbrains.annotations.NotNull()
        java.lang.String amountWithCurrencyLabel, @org.jetbrains.annotations.NotNull()
        com.woocommerce.android.model.UiString receiptSentAutomaticallyHint, @org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function0<kotlin.Unit> onPrimaryActionClicked, @org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function0<kotlin.Unit> onTertiaryActionClicked) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        public PaymentSuccessfulReceiptSentAutomaticallyState(@org.jetbrains.annotations.NotNull()
        java.lang.String amountWithCurrencyLabel, @org.jetbrains.annotations.NotNull()
        com.woocommerce.android.model.UiString receiptSentAutomaticallyHint, @org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function0<kotlin.Unit> onPrimaryActionClicked, @org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function0<kotlin.Unit> onTertiaryActionClicked) {
            super(null, null, null, null, 0, null, false, null, null, null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String getAmountWithCurrencyLabel() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.woocommerce.android.model.UiString component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public com.woocommerce.android.model.UiString getReceiptSentAutomaticallyHint() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final kotlin.jvm.functions.Function0<kotlin.Unit> component3() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public kotlin.jvm.functions.Function0<kotlin.Unit> getOnPrimaryActionClicked() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final kotlin.jvm.functions.Function0<kotlin.Unit> component4() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public kotlin.jvm.functions.Function0<kotlin.Unit> getOnTertiaryActionClicked() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0006J\t\u0010\u000e\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0010\u001a\u00020\u0003H\u00c6\u0003J\'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u0012\u001a\u00020\u000b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u00d6\u0003J\t\u0010\u0015\u001a\u00020\u0016H\u00d6\u0001J\t\u0010\u0017\u001a\u00020\u0003H\u00d6\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0014\u0010\n\u001a\u00020\u000bX\u0096D\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\b\u00a8\u0006\u0018"}, d2 = {"Lcom/woocommerce/android/ui/cardreader/payment/ViewState$PrintingReceiptState;", "Lcom/woocommerce/android/ui/cardreader/payment/ViewState;", "amountWithCurrencyLabel", "", "receiptUrl", "documentName", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAmountWithCurrencyLabel", "()Ljava/lang/String;", "getDocumentName", "isProgressVisible", "", "()Z", "getReceiptUrl", "component1", "component2", "component3", "copy", "equals", "other", "", "hashCode", "", "toString", "WooCommerce_vanillaDebug"})
    public static final class PrintingReceiptState extends com.woocommerce.android.ui.cardreader.payment.ViewState {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String amountWithCurrencyLabel = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String receiptUrl = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String documentName = null;
        private final boolean isProgressVisible = true;
        
        @org.jetbrains.annotations.NotNull()
        public final com.woocommerce.android.ui.cardreader.payment.ViewState.PrintingReceiptState copy(@org.jetbrains.annotations.NotNull()
        java.lang.String amountWithCurrencyLabel, @org.jetbrains.annotations.NotNull()
        java.lang.String receiptUrl, @org.jetbrains.annotations.NotNull()
        java.lang.String documentName) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        public PrintingReceiptState(@org.jetbrains.annotations.NotNull()
        java.lang.String amountWithCurrencyLabel, @org.jetbrains.annotations.NotNull()
        java.lang.String receiptUrl, @org.jetbrains.annotations.NotNull()
        java.lang.String documentName) {
            super(null, null, null, null, 0, null, false, null, null, null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String getAmountWithCurrencyLabel() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getReceiptUrl() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component3() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getDocumentName() {
            return null;
        }
        
        @java.lang.Override()
        public boolean isProgressVisible() {
            return false;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/woocommerce/android/ui/cardreader/payment/ViewState$ReFetchingOrderState;", "Lcom/woocommerce/android/ui/cardreader/payment/ViewState;", "()V", "WooCommerce_vanillaDebug"})
    public static final class ReFetchingOrderState extends com.woocommerce.android.ui.cardreader.payment.ViewState {
        @org.jetbrains.annotations.NotNull()
        public static final com.woocommerce.android.ui.cardreader.payment.ViewState.ReFetchingOrderState INSTANCE = null;
        
        private ReFetchingOrderState() {
            super(null, null, null, null, 0, null, false, null, null, null);
        }
    }
    
    /**
     * ********************************************************
     * Interac Refund UI States
     */
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u00058VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\b"}, d2 = {"Lcom/woocommerce/android/ui/cardreader/payment/ViewState$RefundLoadingDataState;", "Lcom/woocommerce/android/ui/cardreader/payment/ViewState;", "Lcom/woocommerce/android/ui/cardreader/payment/InteracRefundFlow;", "()V", "nameForTracking", "", "getNameForTracking", "()Ljava/lang/String;", "WooCommerce_vanillaDebug"})
    public static final class RefundLoadingDataState extends com.woocommerce.android.ui.cardreader.payment.ViewState implements com.woocommerce.android.ui.cardreader.payment.InteracRefundFlow {
        @org.jetbrains.annotations.NotNull()
        public static final com.woocommerce.android.ui.cardreader.payment.ViewState.RefundLoadingDataState INSTANCE = null;
        
        private RefundLoadingDataState() {
            super(null, null, null, null, 0, null, false, null, null, null);
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String getNameForTracking() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u00a2\u0006\u0002\u0010\u000bJ\t\u0010\u0011\u001a\u00020\u0003H\u00c2\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0007H\u00c2\u0003\u00a2\u0006\u0002\u0010\u0014J\u000f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u00c6\u0003J@\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u00c6\u0001\u00a2\u0006\u0002\u0010\u0017J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u00d6\u0003J\t\u0010\u001c\u001a\u00020\u0007H\u00d6\u0001J\t\u0010\u001d\u001a\u00020\u0005H\u00d6\u0001R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\u0010\u00a8\u0006\u001e"}, d2 = {"Lcom/woocommerce/android/ui/cardreader/payment/ViewState$FailedRefundState;", "Lcom/woocommerce/android/ui/cardreader/payment/ViewState;", "errorType", "Lcom/woocommerce/android/ui/cardreader/payment/InteracRefundFlowError;", "amountWithCurrencyLabel", "", "primaryLabel", "", "onPrimaryActionClicked", "Lkotlin/Function0;", "", "(Lcom/woocommerce/android/ui/cardreader/payment/InteracRefundFlowError;Ljava/lang/String;Ljava/lang/Integer;Lkotlin/jvm/functions/Function0;)V", "getAmountWithCurrencyLabel", "()Ljava/lang/String;", "getOnPrimaryActionClicked", "()Lkotlin/jvm/functions/Function0;", "Ljava/lang/Integer;", "component1", "component2", "component3", "()Ljava/lang/Integer;", "component4", "copy", "(Lcom/woocommerce/android/ui/cardreader/payment/InteracRefundFlowError;Ljava/lang/String;Ljava/lang/Integer;Lkotlin/jvm/functions/Function0;)Lcom/woocommerce/android/ui/cardreader/payment/ViewState$FailedRefundState;", "equals", "", "other", "", "hashCode", "toString", "WooCommerce_vanillaDebug"})
    public static final class FailedRefundState extends com.woocommerce.android.ui.cardreader.payment.ViewState {
        private final com.woocommerce.android.ui.cardreader.payment.InteracRefundFlowError errorType = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String amountWithCurrencyLabel = null;
        private final java.lang.Integer primaryLabel = null;
        @org.jetbrains.annotations.NotNull()
        private final kotlin.jvm.functions.Function0<kotlin.Unit> onPrimaryActionClicked = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.woocommerce.android.ui.cardreader.payment.ViewState.FailedRefundState copy(@org.jetbrains.annotations.NotNull()
        com.woocommerce.android.ui.cardreader.payment.InteracRefundFlowError errorType, @org.jetbrains.annotations.Nullable()
        java.lang.String amountWithCurrencyLabel, @org.jetbrains.annotations.Nullable()
        java.lang.Integer primaryLabel, @org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function0<kotlin.Unit> onPrimaryActionClicked) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        public FailedRefundState(@org.jetbrains.annotations.NotNull()
        com.woocommerce.android.ui.cardreader.payment.InteracRefundFlowError errorType, @org.jetbrains.annotations.Nullable()
        java.lang.String amountWithCurrencyLabel, @org.jetbrains.annotations.Nullable()
        java.lang.Integer primaryLabel, @org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function0<kotlin.Unit> onPrimaryActionClicked) {
            super(null, null, null, null, 0, null, false, null, null, null);
        }
        
        private final com.woocommerce.android.ui.cardreader.payment.InteracRefundFlowError component1() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component2() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        @java.lang.Override()
        public java.lang.String getAmountWithCurrencyLabel() {
            return null;
        }
        
        private final java.lang.Integer component3() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final kotlin.jvm.functions.Function0<kotlin.Unit> component4() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public kotlin.jvm.functions.Function0<kotlin.Unit> getOnPrimaryActionClicked() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002B!\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\bJ\t\u0010\u0010\u001a\u00020\u0004H\u00c6\u0003J\t\u0010\u0011\u001a\u00020\u0006H\u00c6\u0003J\t\u0010\u0012\u001a\u00020\u0006H\u00c6\u0003J\'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u00c6\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u00d6\u0003J\t\u0010\u0018\u001a\u00020\u0006H\u00d6\u0001J\t\u0010\u0019\u001a\u00020\u0004H\u00d6\u0001R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u0007\u001a\u00020\u0006X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0014\u0010\u000e\u001a\u00020\u00048VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000f\u0010\n\u00a8\u0006\u001a"}, d2 = {"Lcom/woocommerce/android/ui/cardreader/payment/ViewState$CollectRefundState;", "Lcom/woocommerce/android/ui/cardreader/payment/ViewState;", "Lcom/woocommerce/android/ui/cardreader/payment/InteracRefundFlow;", "amountWithCurrencyLabel", "", "hintLabel", "", "headerLabel", "(Ljava/lang/String;II)V", "getAmountWithCurrencyLabel", "()Ljava/lang/String;", "getHeaderLabel", "()Ljava/lang/Integer;", "getHintLabel", "nameForTracking", "getNameForTracking", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "toString", "WooCommerce_vanillaDebug"})
    public static final class CollectRefundState extends com.woocommerce.android.ui.cardreader.payment.ViewState implements com.woocommerce.android.ui.cardreader.payment.InteracRefundFlow {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String amountWithCurrencyLabel = null;
        private final int hintLabel = 0;
        private final int headerLabel = 0;
        
        @org.jetbrains.annotations.NotNull()
        public final com.woocommerce.android.ui.cardreader.payment.ViewState.CollectRefundState copy(@org.jetbrains.annotations.NotNull()
        java.lang.String amountWithCurrencyLabel, int hintLabel, int headerLabel) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        public CollectRefundState(@org.jetbrains.annotations.NotNull()
        java.lang.String amountWithCurrencyLabel, int hintLabel, int headerLabel) {
            super(null, null, null, null, 0, null, false, null, null, null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String getAmountWithCurrencyLabel() {
            return null;
        }
        
        public final int component2() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.Integer getHintLabel() {
            return null;
        }
        
        public final int component3() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.Integer getHeaderLabel() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String getNameForTracking() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\t\u0010\n\u001a\u00020\u0004H\u00c6\u0003J\u0013\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0004H\u00c6\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u00d6\u0003J\t\u0010\u0010\u001a\u00020\u0011H\u00d6\u0001J\t\u0010\u0012\u001a\u00020\u0004H\u00d6\u0001R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00048VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\t\u0010\u0007\u00a8\u0006\u0013"}, d2 = {"Lcom/woocommerce/android/ui/cardreader/payment/ViewState$ProcessingRefundState;", "Lcom/woocommerce/android/ui/cardreader/payment/ViewState;", "Lcom/woocommerce/android/ui/cardreader/payment/InteracRefundFlow;", "amountWithCurrencyLabel", "", "(Ljava/lang/String;)V", "getAmountWithCurrencyLabel", "()Ljava/lang/String;", "nameForTracking", "getNameForTracking", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "WooCommerce_vanillaDebug"})
    public static final class ProcessingRefundState extends com.woocommerce.android.ui.cardreader.payment.ViewState implements com.woocommerce.android.ui.cardreader.payment.InteracRefundFlow {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String amountWithCurrencyLabel = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.woocommerce.android.ui.cardreader.payment.ViewState.ProcessingRefundState copy(@org.jetbrains.annotations.NotNull()
        java.lang.String amountWithCurrencyLabel) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        public ProcessingRefundState(@org.jetbrains.annotations.NotNull()
        java.lang.String amountWithCurrencyLabel) {
            super(null, null, null, null, 0, null, false, null, null, null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String getAmountWithCurrencyLabel() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String getNameForTracking() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0003H\u00d6\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0010"}, d2 = {"Lcom/woocommerce/android/ui/cardreader/payment/ViewState$RefundSuccessfulState;", "Lcom/woocommerce/android/ui/cardreader/payment/ViewState;", "amountWithCurrencyLabel", "", "(Ljava/lang/String;)V", "getAmountWithCurrencyLabel", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "WooCommerce_vanillaDebug"})
    public static final class RefundSuccessfulState extends com.woocommerce.android.ui.cardreader.payment.ViewState {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String amountWithCurrencyLabel = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.woocommerce.android.ui.cardreader.payment.ViewState.RefundSuccessfulState copy(@org.jetbrains.annotations.NotNull()
        java.lang.String amountWithCurrencyLabel) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        public RefundSuccessfulState(@org.jetbrains.annotations.NotNull()
        java.lang.String amountWithCurrencyLabel) {
            super(null, null, null, null, 0, null, false, null, null, null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String getAmountWithCurrencyLabel() {
            return null;
        }
    }
}