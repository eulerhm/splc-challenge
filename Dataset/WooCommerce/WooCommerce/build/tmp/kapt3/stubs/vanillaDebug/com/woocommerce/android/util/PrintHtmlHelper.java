package com.woocommerce.android.util;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0012B\u0007\b\u0007\u00a2\u0006\u0002\u0010\u0002J \u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\rH\u0002J\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fJ\u001e\u0010\u0010\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\rR\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lcom/woocommerce/android/util/PrintHtmlHelper;", "", "()V", "printJob", "Landroid/print/PrintJob;", "webViewInstance", "Landroid/webkit/WebView;", "enqueuePrintJob", "", "activity", "Landroid/app/Activity;", "webView", "documentName", "", "getAndClearPrintJobResult", "Lcom/woocommerce/android/util/PrintHtmlHelper$PrintJobResult;", "printReceipt", "receiptUrl", "PrintJobResult", "WooCommerce_vanillaDebug"})
public final class PrintHtmlHelper {
    private android.webkit.WebView webViewInstance;
    private android.print.PrintJob printJob;
    
    @javax.inject.Inject()
    public PrintHtmlHelper() {
        super();
    }
    
    public final void printReceipt(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity, @org.jetbrains.annotations.NotNull()
    java.lang.String receiptUrl, @org.jetbrains.annotations.NotNull()
    java.lang.String documentName) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.woocommerce.android.util.PrintHtmlHelper.PrintJobResult getAndClearPrintJobResult() {
        return null;
    }
    
    private final void enqueuePrintJob(android.app.Activity activity, android.webkit.WebView webView, java.lang.String documentName) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005\u00a8\u0006\u0006"}, d2 = {"Lcom/woocommerce/android/util/PrintHtmlHelper$PrintJobResult;", "", "(Ljava/lang/String;I)V", "CANCELLED", "STARTED", "FAILED", "WooCommerce_vanillaDebug"})
    public static enum PrintJobResult {
        /*public static final*/ CANCELLED /* = new CANCELLED() */,
        /*public static final*/ STARTED /* = new STARTED() */,
        /*public static final*/ FAILED /* = new FAILED() */;
        
        PrintJobResult() {
        }
    }
}