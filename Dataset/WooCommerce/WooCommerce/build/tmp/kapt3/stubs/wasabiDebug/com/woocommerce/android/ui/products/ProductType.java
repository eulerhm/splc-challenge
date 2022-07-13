package com.woocommerce.android.ui.products;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\u0001\u0018\u0000 \u00102\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0010B\u001b\b\u0002\u0012\b\b\u0003\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f\u00a8\u0006\u0011"}, d2 = {"Lcom/woocommerce/android/ui/products/ProductType;", "", "stringResource", "", "value", "", "(Ljava/lang/String;IILjava/lang/String;)V", "getStringResource", "()I", "getValue", "()Ljava/lang/String;", "SIMPLE", "GROUPED", "EXTERNAL", "VARIABLE", "OTHER", "Companion", "WooCommerce_wasabiDebug"})
public enum ProductType {
    /*public static final*/ SIMPLE /* = new SIMPLE(0, null) */,
    /*public static final*/ GROUPED /* = new GROUPED(0, null) */,
    /*public static final*/ EXTERNAL /* = new EXTERNAL(0, null) */,
    /*public static final*/ VARIABLE /* = new VARIABLE(0, null) */,
    /*public static final*/ OTHER /* = new OTHER(0, null) */;
    private final int stringResource = 0;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String value = null;
    @org.jetbrains.annotations.NotNull
    public static final com.woocommerce.android.ui.products.ProductType.Companion Companion = null;
    
    ProductType(@androidx.annotation.StringRes
    int stringResource, java.lang.String value) {
    }
    
    public final int getStringResource() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getValue() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/woocommerce/android/ui/products/ProductType$Companion;", "", "()V", "fromString", "Lcom/woocommerce/android/ui/products/ProductType;", "type", "", "WooCommerce_wasabiDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.woocommerce.android.ui.products.ProductType fromString(@org.jetbrains.annotations.NotNull
        java.lang.String type) {
            return null;
        }
    }
}