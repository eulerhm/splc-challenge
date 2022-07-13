package com.woocommerce.android.util.crashlogging;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001a\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016J\u001a\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016J0\u0010\r\u001a\u00020\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u000f2\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lcom/woocommerce/android/util/crashlogging/FluxCCrashLoggerImpl;", "Lorg/wordpress/android/fluxc/logging/FluxCCrashLogger;", "crashLogging", "Lcom/automattic/android/tracks/crashlogging/CrashLogging;", "(Lcom/automattic/android/tracks/crashlogging/CrashLogging;)V", "recordEvent", "", "message", "", "category", "recordException", "exception", "", "sendReport", "tags", "", "WooCommerce_vanillaDebug"})
public final class FluxCCrashLoggerImpl implements org.wordpress.android.fluxc.logging.FluxCCrashLogger {
    private final com.automattic.android.tracks.crashlogging.CrashLogging crashLogging = null;
    
    public FluxCCrashLoggerImpl(@org.jetbrains.annotations.NotNull()
    com.automattic.android.tracks.crashlogging.CrashLogging crashLogging) {
        super();
    }
    
    @java.lang.Override()
    public void recordEvent(@org.jetbrains.annotations.NotNull()
    java.lang.String message, @org.jetbrains.annotations.Nullable()
    java.lang.String category) {
    }
    
    @java.lang.Override()
    public void recordException(@org.jetbrains.annotations.NotNull()
    java.lang.Throwable exception, @org.jetbrains.annotations.Nullable()
    java.lang.String category) {
    }
    
    @java.lang.Override()
    public void sendReport(@org.jetbrains.annotations.Nullable()
    java.lang.Throwable exception, @org.jetbrains.annotations.NotNull()
    java.util.Map<java.lang.String, java.lang.String> tags, @org.jetbrains.annotations.Nullable()
    java.lang.String message) {
    }
}