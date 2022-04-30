package com.google.samples.apps.iosched.shared.domain.internal;

import java.lang.System;

/**
 * Main thread handler to be used across ioshced.
 */
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0018\u0010\t\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\bH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lcom/google/samples/apps/iosched/shared/domain/internal/IOSchedMainHandler;", "Lcom/google/samples/apps/iosched/shared/domain/internal/IOSchedHandler;", "()V", "handler", "Landroid/os/Handler;", "post", "", "runnable", "Ljava/lang/Runnable;", "postDelayed", "millis", "", "removeCallbacks", "", "shared_staging"})
public final class IOSchedMainHandler implements com.google.samples.apps.iosched.shared.domain.internal.IOSchedHandler {
    private final android.os.Handler handler = null;
    
    @java.lang.Override()
    public boolean post(@org.jetbrains.annotations.NotNull()
    java.lang.Runnable runnable) {
        return false;
    }
    
    @java.lang.Override()
    public boolean postDelayed(@org.jetbrains.annotations.NotNull()
    java.lang.Runnable runnable, long millis) {
        return false;
    }
    
    @java.lang.Override()
    public void removeCallbacks(@org.jetbrains.annotations.NotNull()
    java.lang.Runnable runnable) {
    }
    
    public IOSchedMainHandler() {
        super();
    }
}