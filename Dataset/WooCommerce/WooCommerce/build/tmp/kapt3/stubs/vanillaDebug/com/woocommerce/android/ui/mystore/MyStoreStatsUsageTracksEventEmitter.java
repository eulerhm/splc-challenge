package com.woocommerce.android.ui.mystore;

import java.lang.System;

/**
 * Accepts interaction events from the Analytics / My Store UI and decides whether the group of interactions can be
 * considered as a _usage_ of the UI.
 *
 * See p91TBi-6Cl-p2 for more information about the algorithm.
 *
 * The UI should call [interacted] when these events happen:
 *
 * - Scrolling
 * - Pull-to-refresh
 * - Tapping on the bars in the chart
 * - Changing the tab
 * - Navigating to the My Store tab
 * - Tapping on a product in the Top Performers list
 *
 * If we ever change the algorithm in the future, we should probably consider renaming the Tracks event to avoid
 * incorrect comparisons with old events. We should also make sure to change the iOS code if we're changing anything
 * in here. Both platforms should have the same algorithm so we are able to compare both.
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B!\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0010\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\nJ\b\u0010\u0011\u001a\u00020\u000fH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lcom/woocommerce/android/ui/mystore/MyStoreStatsUsageTracksEventEmitter;", "", "analyticsTrackerWrapper", "Lcom/woocommerce/android/analytics/AnalyticsTrackerWrapper;", "appCoroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "selectedSite", "Lcom/woocommerce/android/tools/SelectedSite;", "(Lcom/woocommerce/android/analytics/AnalyticsTrackerWrapper;Lkotlinx/coroutines/CoroutineScope;Lcom/woocommerce/android/tools/SelectedSite;)V", "firstInteractionTime", "Ljava/util/Date;", "interactions", "", "lastInteractionTime", "interacted", "", "interactionTime", "reset", "Companion", "WooCommerce_vanillaDebug"})
@javax.inject.Singleton()
public final class MyStoreStatsUsageTracksEventEmitter {
    private final com.woocommerce.android.analytics.AnalyticsTrackerWrapper analyticsTrackerWrapper = null;
    private final kotlinx.coroutines.CoroutineScope appCoroutineScope = null;
    private final com.woocommerce.android.tools.SelectedSite selectedSite = null;
    @org.jetbrains.annotations.NotNull()
    private static final com.woocommerce.android.ui.mystore.MyStoreStatsUsageTracksEventEmitter.Companion Companion = null;
    
    /**
     * The minimum amount of time (seconds) that the merchant have interacted with the
     * Analytics UI before an event is triggered.
     */
    @java.lang.Deprecated()
    public static final int MINIMUM_INTERACTION_TIME = 10;
    
    /**
     * The minimum number of Analytics UI interactions before an event is triggered.
     */
    @java.lang.Deprecated()
    public static final int INTERACTIONS_THRESHOLD = 5;
    
    /**
     * The maximum number of seconds in between interactions before we will consider the
     * merchant to have been idle. If they were idle, the time and interactions counting
     * will be reset.
     */
    @java.lang.Deprecated()
    public static final int IDLE_TIME_THRESHOLD = 20;
    private int interactions = 0;
    private java.util.Date firstInteractionTime;
    private java.util.Date lastInteractionTime;
    
    @javax.inject.Inject()
    public MyStoreStatsUsageTracksEventEmitter(@org.jetbrains.annotations.NotNull()
    com.woocommerce.android.analytics.AnalyticsTrackerWrapper analyticsTrackerWrapper, @org.jetbrains.annotations.NotNull()
    @com.woocommerce.android.di.AppCoroutineScope()
    kotlinx.coroutines.CoroutineScope appCoroutineScope, @org.jetbrains.annotations.NotNull()
    com.woocommerce.android.tools.SelectedSite selectedSite) {
        super();
    }
    
    public final void interacted(@org.jetbrains.annotations.NotNull()
    java.util.Date interactionTime) {
    }
    
    private final void reset() {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"}, d2 = {"Lcom/woocommerce/android/ui/mystore/MyStoreStatsUsageTracksEventEmitter$Companion;", "", "()V", "IDLE_TIME_THRESHOLD", "", "INTERACTIONS_THRESHOLD", "MINIMUM_INTERACTION_TIME", "WooCommerce_vanillaDebug"})
    static final class Companion {
        
        private Companion() {
            super();
        }
    }
}