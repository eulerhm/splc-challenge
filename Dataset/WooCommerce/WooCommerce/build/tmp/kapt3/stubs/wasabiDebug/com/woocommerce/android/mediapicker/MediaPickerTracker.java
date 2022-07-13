package com.woocommerce.android.mediapicker;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007\b\u0007\u00a2\u0006\u0002\u0010\u0002J&\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\n0\bH\u0016J\f\u0010\u000b\u001a\u00020\f*\u00020\u0006H\u0002\u00a8\u0006\r"}, d2 = {"Lcom/woocommerce/android/mediapicker/MediaPickerTracker;", "Lorg/wordpress/android/mediapicker/api/Tracker;", "()V", "track", "", "event", "Lorg/wordpress/android/mediapicker/api/Tracker$Event;", "properties", "", "", "", "toStat", "Lcom/woocommerce/android/analytics/AnalyticsEvent;", "WooCommerce_wasabiDebug"})
public final class MediaPickerTracker implements org.wordpress.android.mediapicker.api.Tracker {
    
    @javax.inject.Inject
    public MediaPickerTracker() {
        super();
    }
    
    @java.lang.Override
    public void track(@org.jetbrains.annotations.NotNull
    org.wordpress.android.mediapicker.api.Tracker.Event event, @org.jetbrains.annotations.NotNull
    java.util.Map<java.lang.String, ? extends java.lang.Object> properties) {
    }
    
    @kotlin.Suppress(names = {"ComplexMethod"})
    private final com.woocommerce.android.analytics.AnalyticsEvent toStat(org.wordpress.android.mediapicker.api.Tracker.Event $this$toStat) {
        return null;
    }
}