package com.woocommerce.android.screenshots.util;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b&\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\n\u001a\u00020\u0004H&J\n\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016J\b\u0010\r\u001a\u00020\u000eH\u0002J\b\u0010\u000f\u001a\u00020\u000eH\u0016J\u0010\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0004H\u0016J\b\u0010\u0011\u001a\u00020\u0004H\u0016J\u0012\u0010\u0012\u001a\u00020\u000e2\b\u0010\u0013\u001a\u0004\u0018\u00010\bH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082D\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0006X\u0082D\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lcom/woocommerce/android/screenshots/util/TestIdler;", "Landroidx/test/espresso/IdlingResource;", "()V", "mConditionWasMet", "", "mNumberOfTries", "", "mResourceCallback", "Landroidx/test/espresso/IdlingResource$ResourceCallback;", "mRetryInterval", "checkCondition", "getName", "", "idle", "", "idleUntilReady", "failIfUnsatisfied", "isIdleNow", "registerIdleTransitionCallback", "resourceCallback", "WooCommerce_vanillaDebug"})
public abstract class TestIdler implements androidx.test.espresso.IdlingResource {
    private androidx.test.espresso.IdlingResource.ResourceCallback mResourceCallback;
    private boolean mConditionWasMet = false;
    private final int mNumberOfTries = 100;
    private final int mRetryInterval = 100;
    
    public TestIdler() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.String getName() {
        return null;
    }
    
    @java.lang.Override()
    public boolean isIdleNow() {
        return false;
    }
    
    public abstract boolean checkCondition();
    
    public void idleUntilReady() {
    }
    
    public void idleUntilReady(boolean failIfUnsatisfied) {
    }
    
    private final void idle() {
    }
    
    @java.lang.Override()
    public void registerIdleTransitionCallback(@org.jetbrains.annotations.Nullable()
    androidx.test.espresso.IdlingResource.ResourceCallback resourceCallback) {
    }
}