package com.google.samples.apps.iosched.shared.time;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0001R\u000e\u0010\u0003\u001a\u00020\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/google/samples/apps/iosched/shared/time/DefaultTimeProvider;", "Lcom/google/samples/apps/iosched/shared/time/TimeProvider;", "()V", "delegate", "now", "Lorg/threeten/bp/Instant;", "setDelegate", "", "newDelegate", "shared_staging"})
public final class DefaultTimeProvider implements com.google.samples.apps.iosched.shared.time.TimeProvider {
    private static com.google.samples.apps.iosched.shared.time.TimeProvider delegate;
    public static final com.google.samples.apps.iosched.shared.time.DefaultTimeProvider INSTANCE = null;
    
    public final void setDelegate(@org.jetbrains.annotations.Nullable()
    com.google.samples.apps.iosched.shared.time.TimeProvider newDelegate) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.threeten.bp.Instant now() {
        return null;
    }
    
    private DefaultTimeProvider() {
        super();
    }
}