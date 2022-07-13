package com.woocommerce.android.util.encryptedlogging;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\t\u0010\t\u001a\u00020\nH\u0086\u0002J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\rH\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lcom/woocommerce/android/util/encryptedlogging/ObserveEncryptedLogsUploadResult;", "", "eventBusDispatcher", "Lorg/wordpress/android/fluxc/Dispatcher;", "analyticsTracker", "Lcom/woocommerce/android/analytics/AnalyticsTrackerWrapper;", "logger", "Lorg/wordpress/android/fluxc/utils/AppLogWrapper;", "(Lorg/wordpress/android/fluxc/Dispatcher;Lcom/woocommerce/android/analytics/AnalyticsTrackerWrapper;Lorg/wordpress/android/fluxc/utils/AppLogWrapper;)V", "invoke", "", "onEncryptedLogUploaded", "event", "Lorg/wordpress/android/fluxc/store/EncryptedLogStore$OnEncryptedLogUploaded;", "WooCommerce_vanillaDebug"})
@javax.inject.Singleton()
public final class ObserveEncryptedLogsUploadResult {
    private final org.wordpress.android.fluxc.Dispatcher eventBusDispatcher = null;
    private final com.woocommerce.android.analytics.AnalyticsTrackerWrapper analyticsTracker = null;
    private final org.wordpress.android.fluxc.utils.AppLogWrapper logger = null;
    
    @javax.inject.Inject()
    public ObserveEncryptedLogsUploadResult(@org.jetbrains.annotations.NotNull()
    org.wordpress.android.fluxc.Dispatcher eventBusDispatcher, @org.jetbrains.annotations.NotNull()
    com.woocommerce.android.analytics.AnalyticsTrackerWrapper analyticsTracker, @org.jetbrains.annotations.NotNull()
    org.wordpress.android.fluxc.utils.AppLogWrapper logger) {
        super();
    }
    
    public final void invoke() {
    }
    
    @kotlin.Suppress(names = {"unused"})
    @org.greenrobot.eventbus.Subscribe(threadMode = org.greenrobot.eventbus.ThreadMode.ASYNC)
    public final void onEncryptedLogUploaded(@org.jetbrains.annotations.NotNull()
    org.wordpress.android.fluxc.store.EncryptedLogStore.OnEncryptedLogUploaded event) {
    }
}