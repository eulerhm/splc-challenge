package com.woocommerce.android.ui.prefs;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\b\u0010\t\u001a\u00020\nH\u0002J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lcom/woocommerce/android/ui/prefs/AboutConfigBuilder;", "", "analyticsTrackerWrapper", "Lcom/woocommerce/android/analytics/AnalyticsTrackerWrapper;", "(Lcom/woocommerce/android/analytics/AnalyticsTrackerWrapper;)V", "createAboutConfig", "Lcom/automattic/about/model/AboutConfig;", "activity", "Landroidx/appcompat/app/AppCompatActivity;", "createAnalyticsConfig", "Lcom/automattic/about/model/AnalyticsConfig;", "createShareConfig", "Lcom/automattic/about/model/ShareConfig;", "context", "Landroid/content/Context;", "WooCommerce_wasabiDebug"})
public final class AboutConfigBuilder {
    private final com.woocommerce.android.analytics.AnalyticsTrackerWrapper analyticsTrackerWrapper = null;
    
    @javax.inject.Inject
    public AboutConfigBuilder(@org.jetbrains.annotations.NotNull
    com.woocommerce.android.analytics.AnalyticsTrackerWrapper analyticsTrackerWrapper) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.automattic.about.model.AboutConfig createAboutConfig(@org.jetbrains.annotations.NotNull
    androidx.appcompat.app.AppCompatActivity activity) {
        return null;
    }
    
    private final com.automattic.about.model.ShareConfig createShareConfig(android.content.Context context) {
        return null;
    }
    
    private final com.automattic.about.model.AnalyticsConfig createAnalyticsConfig() {
        return null;
    }
}