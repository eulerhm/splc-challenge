package com.google.samples.apps.iosched.tests;

import java.lang.System;

/**
 * Fix the TimeProvider to a fixed time
 */
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004B\r\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\b\u0010\b\u001a\u00020\u0006H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/google/samples/apps/iosched/tests/FixedTimeProvider;", "Lcom/google/samples/apps/iosched/shared/time/TimeProvider;", "timeInMilis", "", "(J)V", "instant", "Lorg/threeten/bp/Instant;", "(Lorg/threeten/bp/Instant;)V", "now", "mobile_staging"})
public final class FixedTimeProvider implements com.google.samples.apps.iosched.shared.time.TimeProvider {
    private org.threeten.bp.Instant instant;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.threeten.bp.Instant now() {
        return null;
    }
    
    public FixedTimeProvider(@org.jetbrains.annotations.NotNull()
    org.threeten.bp.Instant instant) {
        super();
    }
    
    public FixedTimeProvider(long timeInMilis) {
        super();
    }
}