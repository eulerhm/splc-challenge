package com.woocommerce.android.ui.products;

import java.lang.System;

/**
 * Similar to PostStatus except only draft, pending, private, and publish are supported
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\u0001\u0018\u0000 \u00152\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0015B\u001b\b\u0002\u0012\b\b\u0003\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0018\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000fJ\b\u0010\u0010\u001a\u00020\u0005H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nj\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014\u00a8\u0006\u0016"}, d2 = {"Lcom/woocommerce/android/ui/products/ProductStatus;", "", "stringResource", "", "value", "", "(Ljava/lang/String;IILjava/lang/String;)V", "getStringResource", "()I", "getValue", "()Ljava/lang/String;", "toLocalizedString", "context", "Landroid/content/Context;", "long", "", "toString", "PUBLISH", "DRAFT", "PENDING", "PRIVATE", "Companion", "WooCommerce_wasabiDebug"})
public enum ProductStatus {
    /*public static final*/ PUBLISH /* = new PUBLISH(0, null) */,
    /*public static final*/ DRAFT /* = new DRAFT(0, null) */,
    /*public static final*/ PENDING /* = new PENDING(0, null) */,
    /*public static final*/ PRIVATE /* = new PRIVATE(0, null) */;
    private final int stringResource = 0;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String value = null;
    @org.jetbrains.annotations.NotNull
    public static final com.woocommerce.android.ui.products.ProductStatus.Companion Companion = null;
    
    ProductStatus(@androidx.annotation.StringRes
    int stringResource, java.lang.String value) {
    }
    
    public final int getStringResource() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getValue() {
        return null;
    }
    
    /**
     * Returns a localized string used when displaying the status in the UI. The "long" parameter
     * determines how we show private status - in most cases we want to show only "Private" but
     * in others we want to show "Privately published."
     */
    @org.jetbrains.annotations.NotNull
    public final java.lang.String toLocalizedString(@org.jetbrains.annotations.NotNull
    android.content.Context context, boolean p1_1663806) {
        return null;
    }
    
    /**
     * This ensures the status is passed as lowercase when updating a product in FluxC (passing
     * it as uppercase fails with "HTTP 400 Invalid parameter "status")
     */
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.lang.String toString() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/woocommerce/android/ui/products/ProductStatus$Companion;", "", "()V", "fromString", "Lcom/woocommerce/android/ui/products/ProductStatus;", "status", "", "WooCommerce_wasabiDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.Nullable
        public final com.woocommerce.android.ui.products.ProductStatus fromString(@org.jetbrains.annotations.NotNull
        java.lang.String status) {
            return null;
        }
    }
}