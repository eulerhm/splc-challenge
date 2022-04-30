package com.google.samples.apps.iosched.tests.ui;

import java.lang.System;

/**
 * ActivityTestRule for [MainActivity] that can launch with any initial navigation target.
 */
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lcom/google/samples/apps/iosched/tests/ui/MainActivityTestRule;", "Landroidx/test/rule/ActivityTestRule;", "Lcom/google/samples/apps/iosched/ui/MainActivity;", "initialNavId", "", "(I)V", "getActivityIntent", "Landroid/content/Intent;", "mobile_staging"})
public final class MainActivityTestRule extends androidx.test.rule.ActivityTestRule<com.google.samples.apps.iosched.ui.MainActivity> {
    private final int initialNavId = 0;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    protected android.content.Intent getActivityIntent() {
        return null;
    }
    
    public MainActivityTestRule(int initialNavId) {
        super(null);
    }
}