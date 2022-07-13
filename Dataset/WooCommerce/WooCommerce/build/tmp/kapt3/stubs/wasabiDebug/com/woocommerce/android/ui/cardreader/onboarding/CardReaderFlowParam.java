package com.woocommerce.android.ui.cardreader.onboarding;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/woocommerce/android/ui/cardreader/onboarding/CardReaderFlowParam;", "Landroid/os/Parcelable;", "()V", "CardReadersHub", "PaymentOrRefund", "Lcom/woocommerce/android/ui/cardreader/onboarding/CardReaderFlowParam$CardReadersHub;", "Lcom/woocommerce/android/ui/cardreader/onboarding/CardReaderFlowParam$PaymentOrRefund;", "WooCommerce_wasabiDebug"})
public abstract class CardReaderFlowParam implements android.os.Parcelable {
    
    private CardReaderFlowParam() {
        super();
    }
    
    @kotlinx.parcelize.Parcelize
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004H\u00d6\u0001J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004H\u00d6\u0001\u00a8\u0006\n"}, d2 = {"Lcom/woocommerce/android/ui/cardreader/onboarding/CardReaderFlowParam$CardReadersHub;", "Lcom/woocommerce/android/ui/cardreader/onboarding/CardReaderFlowParam;", "()V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "WooCommerce_wasabiDebug"})
    public static final class CardReadersHub extends com.woocommerce.android.ui.cardreader.onboarding.CardReaderFlowParam {
        @org.jetbrains.annotations.NotNull
        public static final com.woocommerce.android.ui.cardreader.onboarding.CardReaderFlowParam.CardReadersHub INSTANCE = null;
        public static final android.os.Parcelable.Creator<com.woocommerce.android.ui.cardreader.onboarding.CardReaderFlowParam.CardReadersHub> CREATOR = null;
        
        private CardReadersHub() {
            super();
        }
        
        @java.lang.Override
        public int describeContents() {
            return 0;
        }
        
        @java.lang.Override
        public void writeToParcel(@org.jetbrains.annotations.NotNull
        android.os.Parcel parcel, int flags) {
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 3)
        public static final class Creator implements android.os.Parcelable.Creator<com.woocommerce.android.ui.cardreader.onboarding.CardReaderFlowParam.CardReadersHub> {
            
            public Creator() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull
            @java.lang.Override
            public final com.woocommerce.android.ui.cardreader.onboarding.CardReaderFlowParam.CardReadersHub createFromParcel(@org.jetbrains.annotations.NotNull
            android.os.Parcel in) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull
            @java.lang.Override
            public final com.woocommerce.android.ui.cardreader.onboarding.CardReaderFlowParam.CardReadersHub[] newArray(int size) {
                return null;
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0007\bB\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002R\u0012\u0010\u0003\u001a\u00020\u0004X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0002\t\n\u00a8\u0006\u000b"}, d2 = {"Lcom/woocommerce/android/ui/cardreader/onboarding/CardReaderFlowParam$PaymentOrRefund;", "Lcom/woocommerce/android/ui/cardreader/onboarding/CardReaderFlowParam;", "()V", "orderId", "", "getOrderId", "()J", "Payment", "Refund", "Lcom/woocommerce/android/ui/cardreader/onboarding/CardReaderFlowParam$PaymentOrRefund$Payment;", "Lcom/woocommerce/android/ui/cardreader/onboarding/CardReaderFlowParam$PaymentOrRefund$Refund;", "WooCommerce_wasabiDebug"})
    public static abstract class PaymentOrRefund extends com.woocommerce.android.ui.cardreader.onboarding.CardReaderFlowParam {
        
        private PaymentOrRefund() {
            super();
        }
        
        public abstract long getOrderId();
        
        @kotlinx.parcelize.Parcelize
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\t\u0010\t\u001a\u00020\nH\u00d6\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u00d6\u0003J\t\u0010\u000f\u001a\u00020\nH\u00d6\u0001J\t\u0010\u0010\u001a\u00020\u0011H\u00d6\u0001J\u0019\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\nH\u00d6\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0017"}, d2 = {"Lcom/woocommerce/android/ui/cardreader/onboarding/CardReaderFlowParam$PaymentOrRefund$Payment;", "Lcom/woocommerce/android/ui/cardreader/onboarding/CardReaderFlowParam$PaymentOrRefund;", "orderId", "", "(J)V", "getOrderId", "()J", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "WooCommerce_wasabiDebug"})
        public static final class Payment extends com.woocommerce.android.ui.cardreader.onboarding.CardReaderFlowParam.PaymentOrRefund {
            private final long orderId = 0L;
            public static final android.os.Parcelable.Creator<com.woocommerce.android.ui.cardreader.onboarding.CardReaderFlowParam.PaymentOrRefund.Payment> CREATOR = null;
            
            @org.jetbrains.annotations.NotNull
            public final com.woocommerce.android.ui.cardreader.onboarding.CardReaderFlowParam.PaymentOrRefund.Payment copy(long orderId) {
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
            
            public Payment(long orderId) {
                super();
            }
            
            public final long component1() {
                return 0L;
            }
            
            @java.lang.Override
            public long getOrderId() {
                return 0L;
            }
            
            @java.lang.Override
            public int describeContents() {
                return 0;
            }
            
            @java.lang.Override
            public void writeToParcel(@org.jetbrains.annotations.NotNull
            android.os.Parcel parcel, int flags) {
            }
            
            @kotlin.Metadata(mv = {1, 6, 0}, k = 3)
            public static final class Creator implements android.os.Parcelable.Creator<com.woocommerce.android.ui.cardreader.onboarding.CardReaderFlowParam.PaymentOrRefund.Payment> {
                
                public Creator() {
                    super();
                }
                
                @org.jetbrains.annotations.NotNull
                @java.lang.Override
                public final com.woocommerce.android.ui.cardreader.onboarding.CardReaderFlowParam.PaymentOrRefund.Payment createFromParcel(@org.jetbrains.annotations.NotNull
                android.os.Parcel in) {
                    return null;
                }
                
                @org.jetbrains.annotations.NotNull
                @java.lang.Override
                public final com.woocommerce.android.ui.cardreader.onboarding.CardReaderFlowParam.PaymentOrRefund.Payment[] newArray(int size) {
                    return null;
                }
            }
        }
        
        @kotlinx.parcelize.Parcelize
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\f\u001a\u00020\u0005H\u00c6\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001J\t\u0010\u000e\u001a\u00020\u000fH\u00d6\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u00d6\u0003J\t\u0010\u0014\u001a\u00020\u000fH\u00d6\u0001J\t\u0010\u0015\u001a\u00020\u0016H\u00d6\u0001J\u0019\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u000fH\u00d6\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u001c"}, d2 = {"Lcom/woocommerce/android/ui/cardreader/onboarding/CardReaderFlowParam$PaymentOrRefund$Refund;", "Lcom/woocommerce/android/ui/cardreader/onboarding/CardReaderFlowParam$PaymentOrRefund;", "orderId", "", "refundAmount", "Ljava/math/BigDecimal;", "(JLjava/math/BigDecimal;)V", "getOrderId", "()J", "getRefundAmount", "()Ljava/math/BigDecimal;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "WooCommerce_wasabiDebug"})
        public static final class Refund extends com.woocommerce.android.ui.cardreader.onboarding.CardReaderFlowParam.PaymentOrRefund {
            private final long orderId = 0L;
            @org.jetbrains.annotations.NotNull
            private final java.math.BigDecimal refundAmount = null;
            public static final android.os.Parcelable.Creator<com.woocommerce.android.ui.cardreader.onboarding.CardReaderFlowParam.PaymentOrRefund.Refund> CREATOR = null;
            
            @org.jetbrains.annotations.NotNull
            public final com.woocommerce.android.ui.cardreader.onboarding.CardReaderFlowParam.PaymentOrRefund.Refund copy(long orderId, @org.jetbrains.annotations.NotNull
            java.math.BigDecimal refundAmount) {
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
            
            public Refund(long orderId, @org.jetbrains.annotations.NotNull
            java.math.BigDecimal refundAmount) {
                super();
            }
            
            public final long component1() {
                return 0L;
            }
            
            @java.lang.Override
            public long getOrderId() {
                return 0L;
            }
            
            @org.jetbrains.annotations.NotNull
            public final java.math.BigDecimal component2() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull
            public final java.math.BigDecimal getRefundAmount() {
                return null;
            }
            
            @java.lang.Override
            public int describeContents() {
                return 0;
            }
            
            @java.lang.Override
            public void writeToParcel(@org.jetbrains.annotations.NotNull
            android.os.Parcel parcel, int flags) {
            }
            
            @kotlin.Metadata(mv = {1, 6, 0}, k = 3)
            public static final class Creator implements android.os.Parcelable.Creator<com.woocommerce.android.ui.cardreader.onboarding.CardReaderFlowParam.PaymentOrRefund.Refund> {
                
                public Creator() {
                    super();
                }
                
                @org.jetbrains.annotations.NotNull
                @java.lang.Override
                public final com.woocommerce.android.ui.cardreader.onboarding.CardReaderFlowParam.PaymentOrRefund.Refund createFromParcel(@org.jetbrains.annotations.NotNull
                android.os.Parcel in) {
                    return null;
                }
                
                @org.jetbrains.annotations.NotNull
                @java.lang.Override
                public final com.woocommerce.android.ui.cardreader.onboarding.CardReaderFlowParam.PaymentOrRefund.Refund[] newArray(int size) {
                    return null;
                }
            }
        }
    }
}