package com.google.samples.apps.iosched.tests.ui;

import java.lang.System;

/**
 * Basic Espresso tests for the schedule screen.
 */
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 !2\u00020\u0001:\u0001!B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u001e\u001a\u00020\u001fH\u0007J\b\u0010 \u001a\u00020\u001fH\u0007R\u001c\u0010\u0003\u001a\u00020\u00048GX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u00020\n8GX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\u000f\u001a\u00020\u00108GX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\n \u0017*\u0004\u0018\u00010\u00160\u0016X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0018\u001a\u00020\u00198GX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001d\u00a8\u0006\""}, d2 = {"Lcom/google/samples/apps/iosched/tests/ui/ScheduleTestSensorConditionsTest;", "", "()V", "activityRule", "Lcom/google/samples/apps/iosched/tests/ui/MainActivityTestRule;", "getActivityRule", "()Lcom/google/samples/apps/iosched/tests/ui/MainActivityTestRule;", "setActivityRule", "(Lcom/google/samples/apps/iosched/tests/ui/MainActivityTestRule;)V", "hiltRule", "Ldagger/hilt/android/testing/HiltAndroidRule;", "getHiltRule", "()Ldagger/hilt/android/testing/HiltAndroidRule;", "setHiltRule", "(Ldagger/hilt/android/testing/HiltAndroidRule;)V", "preferencesRule", "Lcom/google/samples/apps/iosched/tests/SetPreferencesRule;", "getPreferencesRule", "()Lcom/google/samples/apps/iosched/tests/SetPreferencesRule;", "setPreferencesRule", "(Lcom/google/samples/apps/iosched/tests/SetPreferencesRule;)V", "resources", "Landroid/content/res/Resources;", "kotlin.jvm.PlatformType", "timeProviderRule", "Lcom/google/samples/apps/iosched/tests/FixedTimeRule;", "getTimeProviderRule", "()Lcom/google/samples/apps/iosched/tests/FixedTimeRule;", "setTimeProviderRule", "(Lcom/google/samples/apps/iosched/tests/FixedTimeRule;)V", "clickOnFirstItem_detailsShown", "", "showFirstDay_sessionOnFirstDayShown", "Companion", "mobile_staging"})
@org.junit.runner.RunWith(value = androidx.test.ext.junit.runners.AndroidJUnit4.class)
@dagger.hilt.android.testing.UninstallModules(value = {com.google.samples.apps.iosched.di.CoroutinesModule.class})
@dagger.hilt.android.testing.HiltAndroidTest()
public final class ScheduleTestSensorConditionsTest {
    @org.jetbrains.annotations.NotNull()
    private dagger.hilt.android.testing.HiltAndroidRule hiltRule;
    @org.jetbrains.annotations.NotNull()
    private com.google.samples.apps.iosched.tests.FixedTimeRule timeProviderRule;
    @org.jetbrains.annotations.NotNull()
    private com.google.samples.apps.iosched.tests.SetPreferencesRule preferencesRule;
    @org.jetbrains.annotations.NotNull()
    private com.google.samples.apps.iosched.tests.ui.MainActivityTestRule activityRule;
    private final android.content.res.Resources resources = null;
    private static final java.lang.String FAKE_SESSION_ON_DAY1 = "Fake session on day 1";
    public static final com.google.samples.apps.iosched.tests.ui.ScheduleTestSensorConditionsTest.Companion Companion = null;
    
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
    public final com.google.samples.apps.iosched.tests.FixedTimeRule getTimeProviderRule() {
        return null;
    }
    
    public final void setTimeProviderRule(@org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.tests.FixedTimeRule p0) {
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
    public final void showFirstDay_sessionOnFirstDayShown() {
    }
    
    @org.junit.Test()
    public final void clickOnFirstItem_detailsShown() {
    }
    
    public ScheduleTestSensorConditionsTest() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/google/samples/apps/iosched/tests/ui/ScheduleTestSensorConditionsTest$Companion;", "", "()V", "FAKE_SESSION_ON_DAY1", "", "mobile_staging"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}