package com.woocommerce.android.ui.main;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0017\u001a\u00020\u0018J\b\u0010\u0019\u001a\u00020\u0018H\u0007R*\u0010\u0003\u001a\u0010\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u00050\u00048GX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0013\u0010\u000b\u001a\u00020\f8G\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u000f\u001a\u00020\u00108G\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0013\u001a\u00020\u00148G\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016\u00a8\u0006\u001a"}, d2 = {"Lcom/woocommerce/android/ui/main/ReviewsUITest;", "Lcom/woocommerce/android/helpers/TestBase;", "()V", "activityRule", "Landroidx/test/rule/ActivityTestRule;", "Lcom/woocommerce/android/ui/main/MainActivity;", "kotlin.jvm.PlatformType", "getActivityRule", "()Landroidx/test/rule/ActivityTestRule;", "setActivityRule", "(Landroidx/test/rule/ActivityTestRule;)V", "composeTestRule", "Landroidx/compose/ui/test/junit4/ComposeContentTestRule;", "getComposeTestRule", "()Landroidx/compose/ui/test/junit4/ComposeContentTestRule;", "initRule", "Lcom/woocommerce/android/helpers/InitializationRule;", "getInitRule", "()Lcom/woocommerce/android/helpers/InitializationRule;", "rule", "Ldagger/hilt/android/testing/HiltAndroidRule;", "getRule", "()Ldagger/hilt/android/testing/HiltAndroidRule;", "reviewListShowsAllReviews", "", "setUp", "WooCommerce_vanillaDebug"})
@dagger.hilt.android.testing.HiltAndroidTest()
public final class ReviewsUITest extends com.woocommerce.android.helpers.TestBase {
    @org.jetbrains.annotations.NotNull()
    private final dagger.hilt.android.testing.HiltAndroidRule rule = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.compose.ui.test.junit4.ComposeContentTestRule composeTestRule = null;
    @org.jetbrains.annotations.NotNull()
    private final com.woocommerce.android.helpers.InitializationRule initRule = null;
    @org.jetbrains.annotations.NotNull()
    private androidx.test.rule.ActivityTestRule<com.woocommerce.android.ui.main.MainActivity> activityRule;
    
    public ReviewsUITest() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @org.junit.Rule(order = 0)
    public final dagger.hilt.android.testing.HiltAndroidRule getRule() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @org.junit.Rule(order = 1)
    public final androidx.compose.ui.test.junit4.ComposeContentTestRule getComposeTestRule() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @org.junit.Rule(order = 2)
    public final com.woocommerce.android.helpers.InitializationRule getInitRule() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @org.junit.Rule(order = 3)
    public final androidx.test.rule.ActivityTestRule<com.woocommerce.android.ui.main.MainActivity> getActivityRule() {
        return null;
    }
    
    public final void setActivityRule(@org.jetbrains.annotations.NotNull()
    androidx.test.rule.ActivityTestRule<com.woocommerce.android.ui.main.MainActivity> p0) {
    }
    
    @org.junit.Before()
    public final void setUp() {
    }
    
    public final void reviewListShowsAllReviews() {
    }
}