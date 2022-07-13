package com.woocommerce.android.tracker;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u00102\u00020\u0001:\u0002\u0010\u0011B\'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0086\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lcom/woocommerce/android/tracker/SendTelemetry;", "", "trackerStore", "Lorg/wordpress/android/fluxc/network/rest/wpcom/wc/tracker/TrackerStore;", "trackerRepository", "Lcom/woocommerce/android/tracker/TrackerRepository;", "currentTimeProvider", "Lorg/wordpress/android/fluxc/utils/CurrentTimeProvider;", "selectedSite", "Lcom/woocommerce/android/tools/SelectedSite;", "(Lorg/wordpress/android/fluxc/network/rest/wpcom/wc/tracker/TrackerStore;Lcom/woocommerce/android/tracker/TrackerRepository;Lorg/wordpress/android/fluxc/utils/CurrentTimeProvider;Lcom/woocommerce/android/tools/SelectedSite;)V", "invoke", "Lkotlinx/coroutines/flow/Flow;", "Lcom/woocommerce/android/tracker/SendTelemetry$Result;", "appVersion", "", "Companion", "Result", "WooCommerce_wasabiDebug"})
public final class SendTelemetry {
    private final org.wordpress.android.fluxc.network.rest.wpcom.wc.tracker.TrackerStore trackerStore = null;
    private final com.woocommerce.android.tracker.TrackerRepository trackerRepository = null;
    private final org.wordpress.android.fluxc.utils.CurrentTimeProvider currentTimeProvider = null;
    private final com.woocommerce.android.tools.SelectedSite selectedSite = null;
    @org.jetbrains.annotations.NotNull
    public static final com.woocommerce.android.tracker.SendTelemetry.Companion Companion = null;
    public static final int UPDATE_INTERVAL = 86400000;
    private static final kotlinx.coroutines.flow.Flow<kotlin.Unit> ticker = null;
    
    @javax.inject.Inject
    public SendTelemetry(@org.jetbrains.annotations.NotNull
    org.wordpress.android.fluxc.network.rest.wpcom.wc.tracker.TrackerStore trackerStore, @org.jetbrains.annotations.NotNull
    com.woocommerce.android.tracker.TrackerRepository trackerRepository, @org.jetbrains.annotations.NotNull
    org.wordpress.android.fluxc.utils.CurrentTimeProvider currentTimeProvider, @org.jetbrains.annotations.NotNull
    com.woocommerce.android.tools.SelectedSite selectedSite) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.Flow<com.woocommerce.android.tracker.SendTelemetry.Result> invoke(@org.jetbrains.annotations.NotNull
    java.lang.String appVersion) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/woocommerce/android/tracker/SendTelemetry$Result;", "", "(Ljava/lang/String;I)V", "SENT", "NOT_SENT", "WooCommerce_wasabiDebug"})
    public static enum Result {
        /*public static final*/ SENT /* = new SENT() */,
        /*public static final*/ NOT_SENT /* = new NOT_SENT() */;
        
        Result() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lcom/woocommerce/android/tracker/SendTelemetry$Companion;", "", "()V", "UPDATE_INTERVAL", "", "ticker", "Lkotlinx/coroutines/flow/Flow;", "", "WooCommerce_wasabiDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}