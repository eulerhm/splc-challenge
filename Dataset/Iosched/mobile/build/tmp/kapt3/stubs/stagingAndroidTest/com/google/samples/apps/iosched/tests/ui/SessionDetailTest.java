package com.google.samples.apps.iosched.tests.ui;

import java.lang.System;

/**
 * Espresso tests for the details screen.
 *
 * TODO
 * * Youtube intent
 * * Information is correct, titles, tags, date and time
 * * Start event
 * * Related events present
 * * Star related events
 * * Speakers present
 * * Share intent
 * * Map intent
 * * Navigate to related event
 * * Navigate to speaker
 */
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u001c\u001a\u00020\u001dH\u0007R\"\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048GX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\u00020\u000b8GX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0010\u001a\u00020\u00118GX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0016\u001a\u00020\u00178GX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b\u00a8\u0006\u001e"}, d2 = {"Lcom/google/samples/apps/iosched/tests/ui/SessionDetailTest;", "Lcom/google/samples/apps/iosched/tests/SensorConditionsTest;", "()V", "activityRule", "Landroidx/test/rule/ActivityTestRule;", "Lcom/google/samples/apps/iosched/ui/sessiondetail/SessionDetailActivity;", "getActivityRule", "()Landroidx/test/rule/ActivityTestRule;", "setActivityRule", "(Landroidx/test/rule/ActivityTestRule;)V", "hiltRule", "Ldagger/hilt/android/testing/HiltAndroidRule;", "getHiltRule", "()Ldagger/hilt/android/testing/HiltAndroidRule;", "setHiltRule", "(Ldagger/hilt/android/testing/HiltAndroidRule;)V", "preferencesRule", "Lcom/google/samples/apps/iosched/tests/SetPreferencesRule;", "getPreferencesRule", "()Lcom/google/samples/apps/iosched/tests/SetPreferencesRule;", "setPreferencesRule", "(Lcom/google/samples/apps/iosched/tests/SetPreferencesRule;)V", "timeProviderRule", "Lcom/google/samples/apps/iosched/tests/FixedTimeRule;", "getTimeProviderRule", "()Lcom/google/samples/apps/iosched/tests/FixedTimeRule;", "setTimeProviderRule", "(Lcom/google/samples/apps/iosched/tests/FixedTimeRule;)V", "details_basicViewsDisplayed", "", "mobile_staging"})
@org.junit.runner.RunWith(value = androidx.test.ext.junit.runners.AndroidJUnit4.class)
@dagger.hilt.android.testing.UninstallModules(value = {com.google.samples.apps.iosched.di.CoroutinesModule.class})
@dagger.hilt.android.testing.HiltAndroidTest()
public final class SessionDetailTest extends com.google.samples.apps.iosched.tests.SensorConditionsTest {
    @org.jetbrains.annotations.NotNull()
    private dagger.hilt.android.testing.HiltAndroidRule hiltRule;
    @org.jetbrains.annotations.NotNull()
    private com.google.samples.apps.iosched.tests.FixedTimeRule timeProviderRule;
    @org.jetbrains.annotations.NotNull()
    private com.google.samples.apps.iosched.tests.SetPreferencesRule preferencesRule;
    @org.jetbrains.annotations.NotNull()
    private androidx.test.rule.ActivityTestRule<com.google.samples.apps.iosched.ui.sessiondetail.SessionDetailActivity> activityRule;
    
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
    public final androidx.test.rule.ActivityTestRule<com.google.samples.apps.iosched.ui.sessiondetail.SessionDetailActivity> getActivityRule() {
        return null;
    }
    
    public final void setActivityRule(@org.jetbrains.annotations.NotNull()
    androidx.test.rule.ActivityTestRule<com.google.samples.apps.iosched.ui.sessiondetail.SessionDetailActivity> p0) {
    }
    
    @org.junit.Test()
    public final void details_basicViewsDisplayed() {
    }
    
    public SessionDetailTest() {
        super();
    }
}