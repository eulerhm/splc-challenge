package com.woocommerce.android.di;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016\u00a8\u0006\u000b"}, d2 = {"Lcom/woocommerce/android/di/AndroidNotifier;", "Lcom/github/tomakehurst/wiremock/common/Notifier;", "()V", "error", "", "message", "", "t", "", "info", "Companion", "WooCommerce_vanillaDebug"})
public final class AndroidNotifier implements com.github.tomakehurst.wiremock.common.Notifier {
    @org.jetbrains.annotations.NotNull()
    public static final com.woocommerce.android.di.AndroidNotifier.Companion Companion = null;
    private static final java.lang.String TAG = "WooCommerceMocks";
    
    public AndroidNotifier() {
        super();
    }
    
    @java.lang.Override()
    public void info(@org.jetbrains.annotations.NotNull()
    java.lang.String message) {
    }
    
    @java.lang.Override()
    public void error(@org.jetbrains.annotations.NotNull()
    java.lang.String message) {
    }
    
    @java.lang.Override()
    public void error(@org.jetbrains.annotations.NotNull()
    java.lang.String message, @org.jetbrains.annotations.NotNull()
    java.lang.Throwable t) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/woocommerce/android/di/AndroidNotifier$Companion;", "", "()V", "TAG", "", "WooCommerce_vanillaDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}