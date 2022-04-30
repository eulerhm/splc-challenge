package com.google.samples.apps.iosched.tests.ui;

import java.lang.System;

/**
 * Espresso tests for the Info screen, covering main use case.
 */
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0007R\u001c\u0010\u0003\u001a\u00020\u00048GX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u00020\n8GX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\u000f\u001a\u00020\u00108GX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\n \u0017*\u0004\u0018\u00010\u00160\u0016X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001a"}, d2 = {"Lcom/google/samples/apps/iosched/tests/ui/InfoTest;", "Lcom/google/samples/apps/iosched/tests/SensorConditionsTest;", "()V", "activityRule", "Lcom/google/samples/apps/iosched/tests/ui/MainActivityTestRule;", "getActivityRule", "()Lcom/google/samples/apps/iosched/tests/ui/MainActivityTestRule;", "setActivityRule", "(Lcom/google/samples/apps/iosched/tests/ui/MainActivityTestRule;)V", "hiltRule", "Ldagger/hilt/android/testing/HiltAndroidRule;", "getHiltRule", "()Ldagger/hilt/android/testing/HiltAndroidRule;", "setHiltRule", "(Ldagger/hilt/android/testing/HiltAndroidRule;)V", "preferencesRule", "Lcom/google/samples/apps/iosched/tests/SetPreferencesRule;", "getPreferencesRule", "()Lcom/google/samples/apps/iosched/tests/SetPreferencesRule;", "setPreferencesRule", "(Lcom/google/samples/apps/iosched/tests/SetPreferencesRule;)V", "resources", "Landroid/content/res/Resources;", "kotlin.jvm.PlatformType", "info_basicViewsDisplayed", "", "mobile_staging"})
@org.junit.runner.RunWith(value = androidx.test.ext.junit.runners.AndroidJUnit4.class)
@dagger.hilt.android.testing.UninstallModules(value = {com.google.samples.apps.iosched.di.CoroutinesModule.class})
@dagger.hilt.android.testing.HiltAndroidTest()
public final class InfoTest extends com.google.samples.apps.iosched.tests.SensorConditionsTest {
    @org.jetbrains.annotations.NotNull()
    private dagger.hilt.android.testing.HiltAndroidRule hiltRule;
    @org.jetbrains.annotations.NotNull()
    private com.google.samples.apps.iosched.tests.SetPreferencesRule preferencesRule;
    @org.jetbrains.annotations.NotNull()
    private com.google.samples.apps.iosched.tests.ui.MainActivityTestRule activityRule;
    private final android.content.res.Resources resources = null;
    
    @org.jetbrains.annotations.NotNull()
    @org.junit.Rule(order = 0)
    public final dagger.hilt.android.testing.HiltAndroidRule getHiltRule() {
        return null;
    }
    
    public final void setHiltRule(@org.jetbrains.annotations.NotNull()
    dagger.hilt.android.testing.HiltAndroidRule p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @org.junit.Rule(order = 1)
    public final com.google.samples.apps.iosched.tests.SetPreferencesRule getPreferencesRule() {
        return null;
    }
    
    public final void setPreferencesRule(@org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.tests.SetPreferencesRule p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @org.junit.Rule(order = 2)
    public final com.google.samples.apps.iosched.tests.ui.MainActivityTestRule getActivityRule() {
        return null;
    }
    
    public final void setActivityRule(@org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.tests.ui.MainActivityTestRule p0) {
    }
    
    @org.junit.Test()
    public final void info_basicViewsDisplayed() {
    }
    
    public InfoTest() {
        super();
    }
}