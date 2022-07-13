package com.woocommerce.android.push;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0006\u0010\t\u001a\u00020\nJ\u0016\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lcom/woocommerce/android/push/NotificationAnalyticsTracker;", "", "selectedSite", "Lcom/woocommerce/android/tools/SelectedSite;", "appPrefsWrapper", "Lcom/woocommerce/android/AppPrefsWrapper;", "analyticsTrackerWrapper", "Lcom/woocommerce/android/analytics/AnalyticsTrackerWrapper;", "(Lcom/woocommerce/android/tools/SelectedSite;Lcom/woocommerce/android/AppPrefsWrapper;Lcom/woocommerce/android/analytics/AnalyticsTrackerWrapper;)V", "flush", "", "trackNotificationAnalytics", "stat", "Lcom/woocommerce/android/analytics/AnalyticsEvent;", "notification", "Lcom/woocommerce/android/model/Notification;", "WooCommerce_wasabiDebug"})
@javax.inject.Singleton
public final class NotificationAnalyticsTracker {
    private final com.woocommerce.android.tools.SelectedSite selectedSite = null;
    private final com.woocommerce.android.AppPrefsWrapper appPrefsWrapper = null;
    private final com.woocommerce.android.analytics.AnalyticsTrackerWrapper analyticsTrackerWrapper = null;
    
    @javax.inject.Inject
    public NotificationAnalyticsTracker(@org.jetbrains.annotations.NotNull
    com.woocommerce.android.tools.SelectedSite selectedSite, @org.jetbrains.annotations.NotNull
    com.woocommerce.android.AppPrefsWrapper appPrefsWrapper, @org.jetbrains.annotations.NotNull
    com.woocommerce.android.analytics.AnalyticsTrackerWrapper analyticsTrackerWrapper) {
        super();
    }
    
    public final void trackNotificationAnalytics(@org.jetbrains.annotations.NotNull
    com.woocommerce.android.analytics.AnalyticsEvent stat, @org.jetbrains.annotations.NotNull
    com.woocommerce.android.model.Notification notification) {
    }
    
    public final void flush() {
    }
}