package com.woocommerce.android.ui.products;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B!\b\u0002\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011\u00a8\u0006\u0012"}, d2 = {"Lcom/woocommerce/android/ui/products/GroupedProductListType;", "", "titleId", "", "resultKey", "", "statContext", "Lcom/woocommerce/android/analytics/AnalyticsTracker$Companion$ConnectedProductsListContext;", "(Ljava/lang/String;IILjava/lang/String;Lcom/woocommerce/android/analytics/AnalyticsTracker$Companion$ConnectedProductsListContext;)V", "getResultKey", "()Ljava/lang/String;", "getStatContext", "()Lcom/woocommerce/android/analytics/AnalyticsTracker$Companion$ConnectedProductsListContext;", "getTitleId", "()I", "GROUPED", "UPSELLS", "CROSS_SELLS", "WooCommerce_wasabiDebug"})
public enum GroupedProductListType {
    /*public static final*/ GROUPED /* = new GROUPED(0, null, null) */,
    /*public static final*/ UPSELLS /* = new UPSELLS(0, null, null) */,
    /*public static final*/ CROSS_SELLS /* = new CROSS_SELLS(0, null, null) */;
    private final int titleId = 0;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String resultKey = null;
    @org.jetbrains.annotations.NotNull
    private final com.woocommerce.android.analytics.AnalyticsTracker.Companion.ConnectedProductsListContext statContext;
    
    GroupedProductListType(@androidx.annotation.StringRes
    int titleId, java.lang.String resultKey, com.woocommerce.android.analytics.AnalyticsTracker.Companion.ConnectedProductsListContext statContext) {
    }
    
    public final int getTitleId() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getResultKey() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.woocommerce.android.analytics.AnalyticsTracker.Companion.ConnectedProductsListContext getStatContext() {
        return null;
    }
}