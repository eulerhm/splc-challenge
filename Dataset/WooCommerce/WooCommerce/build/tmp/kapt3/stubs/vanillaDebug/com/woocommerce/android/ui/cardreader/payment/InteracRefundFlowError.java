package com.woocommerce.android.ui.cardreader.payment;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\t\u0007\b\t\n\u000b\f\r\u000e\u000fB\u0011\b\u0004\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0007\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u00a8\u0006\u0017"}, d2 = {"Lcom/woocommerce/android/ui/cardreader/payment/InteracRefundFlowError;", "", "message", "", "(I)V", "getMessage", "()I", "Cancelled", "Declined", "FetchingOrderFailed", "Generic", "NoNetwork", "NonRetryableError", "NonRetryableGeneric", "Server", "Unknown", "Lcom/woocommerce/android/ui/cardreader/payment/InteracRefundFlowError$FetchingOrderFailed;", "Lcom/woocommerce/android/ui/cardreader/payment/InteracRefundFlowError$NoNetwork;", "Lcom/woocommerce/android/ui/cardreader/payment/InteracRefundFlowError$Server;", "Lcom/woocommerce/android/ui/cardreader/payment/InteracRefundFlowError$Generic;", "Lcom/woocommerce/android/ui/cardreader/payment/InteracRefundFlowError$NonRetryableGeneric;", "Lcom/woocommerce/android/ui/cardreader/payment/InteracRefundFlowError$Cancelled;", "Lcom/woocommerce/android/ui/cardreader/payment/InteracRefundFlowError$Declined;", "WooCommerce_vanillaDebug"})
public abstract class InteracRefundFlowError {
    private final int message = 0;
    
    private InteracRefundFlowError(@androidx.annotation.StringRes()
    int message) {
        super();
    }
    
    public final int getMessage() {
        return 0;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/woocommerce/android/ui/cardreader/payment/InteracRefundFlowError$FetchingOrderFailed;", "Lcom/woocommerce/android/ui/cardreader/payment/InteracRefundFlowError;", "()V", "WooCommerce_vanillaDebug"})
    public static final class FetchingOrderFailed extends com.woocommerce.android.ui.cardreader.payment.InteracRefundFlowError {
        @org.jetbrains.annotations.NotNull()
        public static final com.woocommerce.android.ui.cardreader.payment.InteracRefundFlowError.FetchingOrderFailed INSTANCE = null;
        
        private FetchingOrderFailed() {
            super(0);
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/woocommerce/android/ui/cardreader/payment/InteracRefundFlowError$NoNetwork;", "Lcom/woocommerce/android/ui/cardreader/payment/InteracRefundFlowError;", "()V", "WooCommerce_vanillaDebug"})
    public static final class NoNetwork extends com.woocommerce.android.ui.cardreader.payment.InteracRefundFlowError {
        @org.jetbrains.annotations.NotNull()
        public static final com.woocommerce.android.ui.cardreader.payment.InteracRefundFlowError.NoNetwork INSTANCE = null;
        
        private NoNetwork() {
            super(0);
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/woocommerce/android/ui/cardreader/payment/InteracRefundFlowError$Server;", "Lcom/woocommerce/android/ui/cardreader/payment/InteracRefundFlowError;", "()V", "WooCommerce_vanillaDebug"})
    public static final class Server extends com.woocommerce.android.ui.cardreader.payment.InteracRefundFlowError {
        @org.jetbrains.annotations.NotNull()
        public static final com.woocommerce.android.ui.cardreader.payment.InteracRefundFlowError.Server INSTANCE = null;
        
        private Server() {
            super(0);
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/woocommerce/android/ui/cardreader/payment/InteracRefundFlowError$Generic;", "Lcom/woocommerce/android/ui/cardreader/payment/InteracRefundFlowError;", "()V", "WooCommerce_vanillaDebug"})
    public static final class Generic extends com.woocommerce.android.ui.cardreader.payment.InteracRefundFlowError {
        @org.jetbrains.annotations.NotNull()
        public static final com.woocommerce.android.ui.cardreader.payment.InteracRefundFlowError.Generic INSTANCE = null;
        
        private Generic() {
            super(0);
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lcom/woocommerce/android/ui/cardreader/payment/InteracRefundFlowError$NonRetryableGeneric;", "Lcom/woocommerce/android/ui/cardreader/payment/InteracRefundFlowError;", "Lcom/woocommerce/android/ui/cardreader/payment/InteracRefundFlowError$NonRetryableError;", "()V", "WooCommerce_vanillaDebug"})
    public static final class NonRetryableGeneric extends com.woocommerce.android.ui.cardreader.payment.InteracRefundFlowError implements com.woocommerce.android.ui.cardreader.payment.InteracRefundFlowError.NonRetryableError {
        @org.jetbrains.annotations.NotNull()
        public static final com.woocommerce.android.ui.cardreader.payment.InteracRefundFlowError.NonRetryableGeneric INSTANCE = null;
        
        private NonRetryableGeneric() {
            super(0);
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/woocommerce/android/ui/cardreader/payment/InteracRefundFlowError$Cancelled;", "Lcom/woocommerce/android/ui/cardreader/payment/InteracRefundFlowError;", "()V", "WooCommerce_vanillaDebug"})
    public static final class Cancelled extends com.woocommerce.android.ui.cardreader.payment.InteracRefundFlowError {
        @org.jetbrains.annotations.NotNull()
        public static final com.woocommerce.android.ui.cardreader.payment.InteracRefundFlowError.Cancelled INSTANCE = null;
        
        private Cancelled() {
            super(0);
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/woocommerce/android/ui/cardreader/payment/InteracRefundFlowError$Unknown;", "Lcom/woocommerce/android/ui/cardreader/payment/InteracRefundFlowError$Declined;", "()V", "WooCommerce_vanillaDebug"})
    public static final class Unknown extends com.woocommerce.android.ui.cardreader.payment.InteracRefundFlowError.Declined {
        @org.jetbrains.annotations.NotNull()
        public static final com.woocommerce.android.ui.cardreader.payment.InteracRefundFlowError.Unknown INSTANCE = null;
        
        private Unknown() {
            super(0);
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u000f\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013B\u000f\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004\u0082\u0001\u0010\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#\u00a8\u0006$"}, d2 = {"Lcom/woocommerce/android/ui/cardreader/payment/InteracRefundFlowError$Declined;", "Lcom/woocommerce/android/ui/cardreader/payment/InteracRefundFlowError;", "message", "", "(I)V", "CardNotSupported", "CurrencyNotSupported", "DuplicateTransaction", "ExpiredCard", "Fraud", "Generic", "IncorrectPostalCode", "InsufficientFunds", "InvalidAccount", "InvalidAmount", "PinRequired", "Temporary", "TestCard", "TestModeLiveCard", "TooManyPinTries", "Lcom/woocommerce/android/ui/cardreader/payment/InteracRefundFlowError$Unknown;", "Lcom/woocommerce/android/ui/cardreader/payment/InteracRefundFlowError$Declined$Temporary;", "Lcom/woocommerce/android/ui/cardreader/payment/InteracRefundFlowError$Declined$Fraud;", "Lcom/woocommerce/android/ui/cardreader/payment/InteracRefundFlowError$Declined$Generic;", "Lcom/woocommerce/android/ui/cardreader/payment/InteracRefundFlowError$Declined$InvalidAccount;", "Lcom/woocommerce/android/ui/cardreader/payment/InteracRefundFlowError$Declined$CardNotSupported;", "Lcom/woocommerce/android/ui/cardreader/payment/InteracRefundFlowError$Declined$CurrencyNotSupported;", "Lcom/woocommerce/android/ui/cardreader/payment/InteracRefundFlowError$Declined$DuplicateTransaction;", "Lcom/woocommerce/android/ui/cardreader/payment/InteracRefundFlowError$Declined$ExpiredCard;", "Lcom/woocommerce/android/ui/cardreader/payment/InteracRefundFlowError$Declined$IncorrectPostalCode;", "Lcom/woocommerce/android/ui/cardreader/payment/InteracRefundFlowError$Declined$InsufficientFunds;", "Lcom/woocommerce/android/ui/cardreader/payment/InteracRefundFlowError$Declined$InvalidAmount;", "Lcom/woocommerce/android/ui/cardreader/payment/InteracRefundFlowError$Declined$PinRequired;", "Lcom/woocommerce/android/ui/cardreader/payment/InteracRefundFlowError$Declined$TooManyPinTries;", "Lcom/woocommerce/android/ui/cardreader/payment/InteracRefundFlowError$Declined$TestCard;", "Lcom/woocommerce/android/ui/cardreader/payment/InteracRefundFlowError$Declined$TestModeLiveCard;", "WooCommerce_vanillaDebug"})
    public static abstract class Declined extends com.woocommerce.android.ui.cardreader.payment.InteracRefundFlowError {
        
        private Declined(int message) {
            super(0);
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/woocommerce/android/ui/cardreader/payment/InteracRefundFlowError$Declined$Temporary;", "Lcom/woocommerce/android/ui/cardreader/payment/InteracRefundFlowError$Declined;", "()V", "WooCommerce_vanillaDebug"})
        public static final class Temporary extends com.woocommerce.android.ui.cardreader.payment.InteracRefundFlowError.Declined {
            @org.jetbrains.annotations.NotNull()
            public static final com.woocommerce.android.ui.cardreader.payment.InteracRefundFlowError.Declined.Temporary INSTANCE = null;
            
            private Temporary() {
                super(0);
            }
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lcom/woocommerce/android/ui/cardreader/payment/InteracRefundFlowError$Declined$Fraud;", "Lcom/woocommerce/android/ui/cardreader/payment/InteracRefundFlowError$Declined;", "Lcom/woocommerce/android/ui/cardreader/payment/InteracRefundFlowError$NonRetryableError;", "()V", "WooCommerce_vanillaDebug"})
        public static final class Fraud extends com.woocommerce.android.ui.cardreader.payment.InteracRefundFlowError.Declined implements com.woocommerce.android.ui.cardreader.payment.InteracRefundFlowError.NonRetryableError {
            @org.jetbrains.annotations.NotNull()
            public static final com.woocommerce.android.ui.cardreader.payment.InteracRefundFlowError.Declined.Fraud INSTANCE = null;
            
            private Fraud() {
                super(0);
            }
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/woocommerce/android/ui/cardreader/payment/InteracRefundFlowError$Declined$Generic;", "Lcom/woocommerce/android/ui/cardreader/payment/InteracRefundFlowError$Declined;", "()V", "WooCommerce_vanillaDebug"})
        public static final class Generic extends com.woocommerce.android.ui.cardreader.payment.InteracRefundFlowError.Declined {
            @org.jetbrains.annotations.NotNull()
            public static final com.woocommerce.android.ui.cardreader.payment.InteracRefundFlowError.Declined.Generic INSTANCE = null;
            
            private Generic() {
                super(0);
            }
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lcom/woocommerce/android/ui/cardreader/payment/InteracRefundFlowError$Declined$InvalidAccount;", "Lcom/woocommerce/android/ui/cardreader/payment/InteracRefundFlowError$Declined;", "Lcom/woocommerce/android/ui/cardreader/payment/InteracRefundFlowError$NonRetryableError;", "()V", "WooCommerce_vanillaDebug"})
        public static final class InvalidAccount extends com.woocommerce.android.ui.cardreader.payment.InteracRefundFlowError.Declined implements com.woocommerce.android.ui.cardreader.payment.InteracRefundFlowError.NonRetryableError {
            @org.jetbrains.annotations.NotNull()
            public static final com.woocommerce.android.ui.cardreader.payment.InteracRefundFlowError.Declined.InvalidAccount INSTANCE = null;
            
            private InvalidAccount() {
                super(0);
            }
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/woocommerce/android/ui/cardreader/payment/InteracRefundFlowError$Declined$CardNotSupported;", "Lcom/woocommerce/android/ui/cardreader/payment/InteracRefundFlowError$Declined;", "()V", "WooCommerce_vanillaDebug"})
        public static final class CardNotSupported extends com.woocommerce.android.ui.cardreader.payment.InteracRefundFlowError.Declined {
            @org.jetbrains.annotations.NotNull()
            public static final com.woocommerce.android.ui.cardreader.payment.InteracRefundFlowError.Declined.CardNotSupported INSTANCE = null;
            
            private CardNotSupported() {
                super(0);
            }
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lcom/woocommerce/android/ui/cardreader/payment/InteracRefundFlowError$Declined$CurrencyNotSupported;", "Lcom/woocommerce/android/ui/cardreader/payment/InteracRefundFlowError$Declined;", "Lcom/woocommerce/android/ui/cardreader/payment/InteracRefundFlowError$NonRetryableError;", "()V", "WooCommerce_vanillaDebug"})
        public static final class CurrencyNotSupported extends com.woocommerce.android.ui.cardreader.payment.InteracRefundFlowError.Declined implements com.woocommerce.android.ui.cardreader.payment.InteracRefundFlowError.NonRetryableError {
            @org.jetbrains.annotations.NotNull()
            public static final com.woocommerce.android.ui.cardreader.payment.InteracRefundFlowError.Declined.CurrencyNotSupported INSTANCE = null;
            
            private CurrencyNotSupported() {
                super(0);
            }
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lcom/woocommerce/android/ui/cardreader/payment/InteracRefundFlowError$Declined$DuplicateTransaction;", "Lcom/woocommerce/android/ui/cardreader/payment/InteracRefundFlowError$Declined;", "Lcom/woocommerce/android/ui/cardreader/payment/InteracRefundFlowError$NonRetryableError;", "()V", "WooCommerce_vanillaDebug"})
        public static final class DuplicateTransaction extends com.woocommerce.android.ui.cardreader.payment.InteracRefundFlowError.Declined implements com.woocommerce.android.ui.cardreader.payment.InteracRefundFlowError.NonRetryableError {
            @org.jetbrains.annotations.NotNull()
            public static final com.woocommerce.android.ui.cardreader.payment.InteracRefundFlowError.Declined.DuplicateTransaction INSTANCE = null;
            
            private DuplicateTransaction() {
                super(0);
            }
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/woocommerce/android/ui/cardreader/payment/InteracRefundFlowError$Declined$ExpiredCard;", "Lcom/woocommerce/android/ui/cardreader/payment/InteracRefundFlowError$Declined;", "()V", "WooCommerce_vanillaDebug"})
        public static final class ExpiredCard extends com.woocommerce.android.ui.cardreader.payment.InteracRefundFlowError.Declined {
            @org.jetbrains.annotations.NotNull()
            public static final com.woocommerce.android.ui.cardreader.payment.InteracRefundFlowError.Declined.ExpiredCard INSTANCE = null;
            
            private ExpiredCard() {
                super(0);
            }
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lcom/woocommerce/android/ui/cardreader/payment/InteracRefundFlowError$Declined$IncorrectPostalCode;", "Lcom/woocommerce/android/ui/cardreader/payment/InteracRefundFlowError$Declined;", "Lcom/woocommerce/android/ui/cardreader/payment/InteracRefundFlowError$NonRetryableError;", "()V", "WooCommerce_vanillaDebug"})
        public static final class IncorrectPostalCode extends com.woocommerce.android.ui.cardreader.payment.InteracRefundFlowError.Declined implements com.woocommerce.android.ui.cardreader.payment.InteracRefundFlowError.NonRetryableError {
            @org.jetbrains.annotations.NotNull()
            public static final com.woocommerce.android.ui.cardreader.payment.InteracRefundFlowError.Declined.IncorrectPostalCode INSTANCE = null;
            
            private IncorrectPostalCode() {
                super(0);
            }
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/woocommerce/android/ui/cardreader/payment/InteracRefundFlowError$Declined$InsufficientFunds;", "Lcom/woocommerce/android/ui/cardreader/payment/InteracRefundFlowError$Declined;", "()V", "WooCommerce_vanillaDebug"})
        public static final class InsufficientFunds extends com.woocommerce.android.ui.cardreader.payment.InteracRefundFlowError.Declined {
            @org.jetbrains.annotations.NotNull()
            public static final com.woocommerce.android.ui.cardreader.payment.InteracRefundFlowError.Declined.InsufficientFunds INSTANCE = null;
            
            private InsufficientFunds() {
                super(0);
            }
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lcom/woocommerce/android/ui/cardreader/payment/InteracRefundFlowError$Declined$InvalidAmount;", "Lcom/woocommerce/android/ui/cardreader/payment/InteracRefundFlowError$Declined;", "Lcom/woocommerce/android/ui/cardreader/payment/InteracRefundFlowError$NonRetryableError;", "()V", "WooCommerce_vanillaDebug"})
        public static final class InvalidAmount extends com.woocommerce.android.ui.cardreader.payment.InteracRefundFlowError.Declined implements com.woocommerce.android.ui.cardreader.payment.InteracRefundFlowError.NonRetryableError {
            @org.jetbrains.annotations.NotNull()
            public static final com.woocommerce.android.ui.cardreader.payment.InteracRefundFlowError.Declined.InvalidAmount INSTANCE = null;
            
            private InvalidAmount() {
                super(0);
            }
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/woocommerce/android/ui/cardreader/payment/InteracRefundFlowError$Declined$PinRequired;", "Lcom/woocommerce/android/ui/cardreader/payment/InteracRefundFlowError$Declined;", "()V", "WooCommerce_vanillaDebug"})
        public static final class PinRequired extends com.woocommerce.android.ui.cardreader.payment.InteracRefundFlowError.Declined {
            @org.jetbrains.annotations.NotNull()
            public static final com.woocommerce.android.ui.cardreader.payment.InteracRefundFlowError.Declined.PinRequired INSTANCE = null;
            
            private PinRequired() {
                super(0);
            }
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/woocommerce/android/ui/cardreader/payment/InteracRefundFlowError$Declined$TooManyPinTries;", "Lcom/woocommerce/android/ui/cardreader/payment/InteracRefundFlowError$Declined;", "()V", "WooCommerce_vanillaDebug"})
        public static final class TooManyPinTries extends com.woocommerce.android.ui.cardreader.payment.InteracRefundFlowError.Declined {
            @org.jetbrains.annotations.NotNull()
            public static final com.woocommerce.android.ui.cardreader.payment.InteracRefundFlowError.Declined.TooManyPinTries INSTANCE = null;
            
            private TooManyPinTries() {
                super(0);
            }
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/woocommerce/android/ui/cardreader/payment/InteracRefundFlowError$Declined$TestCard;", "Lcom/woocommerce/android/ui/cardreader/payment/InteracRefundFlowError$Declined;", "()V", "WooCommerce_vanillaDebug"})
        public static final class TestCard extends com.woocommerce.android.ui.cardreader.payment.InteracRefundFlowError.Declined {
            @org.jetbrains.annotations.NotNull()
            public static final com.woocommerce.android.ui.cardreader.payment.InteracRefundFlowError.Declined.TestCard INSTANCE = null;
            
            private TestCard() {
                super(0);
            }
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/woocommerce/android/ui/cardreader/payment/InteracRefundFlowError$Declined$TestModeLiveCard;", "Lcom/woocommerce/android/ui/cardreader/payment/InteracRefundFlowError$Declined;", "()V", "WooCommerce_vanillaDebug"})
        public static final class TestModeLiveCard extends com.woocommerce.android.ui.cardreader.payment.InteracRefundFlowError.Declined {
            @org.jetbrains.annotations.NotNull()
            public static final com.woocommerce.android.ui.cardreader.payment.InteracRefundFlowError.Declined.TestModeLiveCard INSTANCE = null;
            
            private TestModeLiveCard() {
                super(0);
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001\u00a8\u0006\u0002"}, d2 = {"Lcom/woocommerce/android/ui/cardreader/payment/InteracRefundFlowError$NonRetryableError;", "", "WooCommerce_vanillaDebug"})
    public static abstract interface NonRetryableError {
    }
}