package com.google.samples.apps.iosched.tests;

import java.lang.System;

/**
 * Rule to be used in tests that sets the SharedPreferences needed for avoiding onboarding flows,
 * resetting filters, etc.
 */
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0007B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0014\u00a8\u0006\b"}, d2 = {"Lcom/google/samples/apps/iosched/tests/SetPreferencesRule;", "Lorg/junit/rules/TestWatcher;", "()V", "starting", "", "description", "Lorg/junit/runner/Description;", "SetPreferencesRuleEntryPoint", "mobile_staging"})
public final class SetPreferencesRule extends org.junit.rules.TestWatcher {
    
    @java.lang.Override()
    protected void starting(@org.jetbrains.annotations.Nullable()
    org.junit.runner.Description description) {
    }
    
    public SetPreferencesRule() {
        super();
    }
    
    @dagger.hilt.EntryPoint()
    @dagger.hilt.InstallIn(value = {dagger.hilt.android.components.ApplicationComponent.class})
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&\u00a8\u0006\u0004"}, d2 = {"Lcom/google/samples/apps/iosched/tests/SetPreferencesRule$SetPreferencesRuleEntryPoint;", "", "preferenceStorage", "Lcom/google/samples/apps/iosched/shared/data/prefs/PreferenceStorage;", "mobile_staging"})
    public static abstract interface SetPreferencesRuleEntryPoint {
        
        @org.jetbrains.annotations.NotNull()
        public abstract com.google.samples.apps.iosched.shared.data.prefs.PreferenceStorage preferenceStorage();
    }
}