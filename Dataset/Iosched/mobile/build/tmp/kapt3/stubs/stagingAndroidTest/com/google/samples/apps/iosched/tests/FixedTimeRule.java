package com.google.samples.apps.iosched.tests;

import java.lang.System;

/**
 * Rule to be used in tests that sets the clocked used by DefaultTimeProvider.
 */
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0012\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0014J\u0012\u0010\t\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0014R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lcom/google/samples/apps/iosched/tests/FixedTimeRule;", "Lorg/junit/rules/TestWatcher;", "fixedTime", "Lcom/google/samples/apps/iosched/tests/FixedTimeProvider;", "(Lcom/google/samples/apps/iosched/tests/FixedTimeProvider;)V", "finished", "", "description", "Lorg/junit/runner/Description;", "starting", "mobile_staging"})
public final class FixedTimeRule extends org.junit.rules.TestWatcher {
    private final com.google.samples.apps.iosched.tests.FixedTimeProvider fixedTime = null;
    
    @java.lang.Override()
    protected void starting(@org.jetbrains.annotations.Nullable()
    org.junit.runner.Description description) {
    }
    
    @java.lang.Override()
    protected void finished(@org.jetbrains.annotations.Nullable()
    org.junit.runner.Description description) {
    }
    
    public FixedTimeRule(@org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.tests.FixedTimeProvider fixedTime) {
        super();
    }
    
    public FixedTimeRule() {
        super();
    }
}