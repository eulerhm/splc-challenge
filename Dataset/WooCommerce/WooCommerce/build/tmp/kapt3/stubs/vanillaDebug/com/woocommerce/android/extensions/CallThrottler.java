package com.woocommerce.android.extensions;

import java.lang.System;

/**
 * Prevents crashes caused by rapidly double-clicking views which navigate to the same
 * destination twice
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0014\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\nR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/woocommerce/android/extensions/CallThrottler;", "", "()V", "DELAY", "", "lastTime", "", "throttle", "", "call", "Lkotlin/Function0;", "WooCommerce_vanillaDebug"})
public final class CallThrottler {
    @org.jetbrains.annotations.NotNull()
    public static final com.woocommerce.android.extensions.CallThrottler INSTANCE = null;
    private static final int DELAY = 200;
    private static long lastTime = 0L;
    
    private CallThrottler() {
        super();
    }
    
    public final void throttle(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> call) {
    }
}