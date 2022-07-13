package com.woocommerce.android.ui.cardreader.receipt;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/woocommerce/android/ui/cardreader/receipt/ReceiptEvent;", "Lcom/woocommerce/android/viewmodel/MultiLiveEvent$Event;", "()V", "PrintReceipt", "SendReceipt", "Lcom/woocommerce/android/ui/cardreader/receipt/ReceiptEvent$PrintReceipt;", "Lcom/woocommerce/android/ui/cardreader/receipt/ReceiptEvent$SendReceipt;", "WooCommerce_wasabiDebug"})
public abstract class ReceiptEvent extends com.woocommerce.android.viewmodel.MultiLiveEvent.Event {
    
    private ReceiptEvent() {
        super(false);
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\n\u001a\u00020\u0003H\u00c6\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u00d6\u0003J\t\u0010\u0010\u001a\u00020\u0011H\u00d6\u0001J\t\u0010\u0012\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007\u00a8\u0006\u0013"}, d2 = {"Lcom/woocommerce/android/ui/cardreader/receipt/ReceiptEvent$PrintReceipt;", "Lcom/woocommerce/android/ui/cardreader/receipt/ReceiptEvent;", "receiptUrl", "", "documentName", "(Ljava/lang/String;Ljava/lang/String;)V", "getDocumentName", "()Ljava/lang/String;", "getReceiptUrl", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "WooCommerce_wasabiDebug"})
    public static final class PrintReceipt extends com.woocommerce.android.ui.cardreader.receipt.ReceiptEvent {
        @org.jetbrains.annotations.NotNull
        private final java.lang.String receiptUrl = null;
        @org.jetbrains.annotations.NotNull
        private final java.lang.String documentName = null;
        
        @org.jetbrains.annotations.NotNull
        public final com.woocommerce.android.ui.cardreader.receipt.ReceiptEvent.PrintReceipt copy(@org.jetbrains.annotations.NotNull
        java.lang.String receiptUrl, @org.jetbrains.annotations.NotNull
        java.lang.String documentName) {
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
        
        public PrintReceipt(@org.jetbrains.annotations.NotNull
        java.lang.String receiptUrl, @org.jetbrains.annotations.NotNull
        java.lang.String documentName) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getReceiptUrl() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getDocumentName() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000e\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000f\u001a\u00020\u0006H\u00c6\u0003J\'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006H\u00c6\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u00d6\u0003J\t\u0010\u0015\u001a\u00020\u0016H\u00d6\u0001J\t\u0010\u0017\u001a\u00020\u0006H\u00d6\u0001R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b\u00a8\u0006\u0018"}, d2 = {"Lcom/woocommerce/android/ui/cardreader/receipt/ReceiptEvent$SendReceipt;", "Lcom/woocommerce/android/ui/cardreader/receipt/ReceiptEvent;", "content", "Lcom/woocommerce/android/model/UiString;", "subject", "address", "", "(Lcom/woocommerce/android/model/UiString;Lcom/woocommerce/android/model/UiString;Ljava/lang/String;)V", "getAddress", "()Ljava/lang/String;", "getContent", "()Lcom/woocommerce/android/model/UiString;", "getSubject", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "WooCommerce_wasabiDebug"})
    public static final class SendReceipt extends com.woocommerce.android.ui.cardreader.receipt.ReceiptEvent {
        @org.jetbrains.annotations.NotNull
        private final com.woocommerce.android.model.UiString content = null;
        @org.jetbrains.annotations.NotNull
        private final com.woocommerce.android.model.UiString subject = null;
        @org.jetbrains.annotations.NotNull
        private final java.lang.String address = null;
        
        @org.jetbrains.annotations.NotNull
        public final com.woocommerce.android.ui.cardreader.receipt.ReceiptEvent.SendReceipt copy(@org.jetbrains.annotations.NotNull
        com.woocommerce.android.model.UiString content, @org.jetbrains.annotations.NotNull
        com.woocommerce.android.model.UiString subject, @org.jetbrains.annotations.NotNull
        java.lang.String address) {
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
        
        public SendReceipt(@org.jetbrains.annotations.NotNull
        com.woocommerce.android.model.UiString content, @org.jetbrains.annotations.NotNull
        com.woocommerce.android.model.UiString subject, @org.jetbrains.annotations.NotNull
        java.lang.String address) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.woocommerce.android.model.UiString component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.woocommerce.android.model.UiString getContent() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.woocommerce.android.model.UiString component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.woocommerce.android.model.UiString getSubject() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String component3() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getAddress() {
            return null;
        }
    }
}