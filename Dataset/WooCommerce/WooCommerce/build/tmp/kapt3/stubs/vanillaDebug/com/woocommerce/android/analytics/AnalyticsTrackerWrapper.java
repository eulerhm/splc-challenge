package com.woocommerce.android.analytics;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007\b\u0007\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004J,\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\tJ\"\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0012\b\u0002\u0010\f\u001a\f\u0012\u0004\u0012\u00020\t\u0012\u0002\b\u00030\rJ@\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010\r2\b\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\tJ\u000e\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0001\u00a8\u0006\u0010"}, d2 = {"Lcom/woocommerce/android/analytics/AnalyticsTrackerWrapper;", "", "()V", "flush", "", "track", "stat", "Lcom/woocommerce/android/analytics/AnalyticsEvent;", "errorContext", "", "errorType", "errorDescription", "properties", "", "trackViewShown", "view", "WooCommerce_vanillaDebug"})
@dagger.Reusable()
public final class AnalyticsTrackerWrapper {
    
    @javax.inject.Inject()
    public AnalyticsTrackerWrapper() {
        super();
    }
    
    public final void track(@org.jetbrains.annotations.NotNull()
    com.woocommerce.android.analytics.AnalyticsEvent stat, @org.jetbrains.annotations.NotNull()
    java.util.Map<java.lang.String, ?> properties) {
    }
    
    /**
     * A convenience method for logging an error event with some additional meta data.
     * @param stat The stat to track.
     * @param errorContext A string providing additional context (if any) about the error.
     * @param errorType The type of error.
     * @param errorDescription The error text or other description.
     */
    public final void track(@org.jetbrains.annotations.NotNull()
    com.woocommerce.android.analytics.AnalyticsEvent stat, @org.jetbrains.annotations.Nullable()
    java.lang.String errorContext, @org.jetbrains.annotations.Nullable()
    java.lang.String errorType, @org.jetbrains.annotations.Nullable()
    java.lang.String errorDescription) {
    }
    
    /**
     * A convenience method for logging an error event with some additional meta data.
     * @param stat The stat to track.
     * @param properties Map of additional properties
     * @param errorContext A string providing additional context (if any) about the error.
     * @param errorType The type of error.
     * @param errorDescription The error text or other description.
     */
    public final void track(@org.jetbrains.annotations.NotNull()
    com.woocommerce.android.analytics.AnalyticsEvent stat, @org.jetbrains.annotations.NotNull()
    java.util.Map<java.lang.String, ? extends java.lang.Object> properties, @org.jetbrains.annotations.Nullable()
    java.lang.String errorContext, @org.jetbrains.annotations.Nullable()
    java.lang.String errorType, @org.jetbrains.annotations.Nullable()
    java.lang.String errorDescription) {
    }
    
    /**
     * A convenience method for tracking views shown during a session.
     * @param view The view to be tracked
     */
    public final void trackViewShown(@org.jetbrains.annotations.NotNull()
    java.lang.Object view) {
    }
    
    public final void flush() {
    }
}