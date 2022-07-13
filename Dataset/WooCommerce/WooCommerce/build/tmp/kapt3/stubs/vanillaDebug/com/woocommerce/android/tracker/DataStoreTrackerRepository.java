package com.woocommerce.android.tracker;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u000e\b\u0001\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\u0002\u0010\u0005J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\t\u001a\u00020\nH\u0016J!\u0010\u000b\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000eR\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000f"}, d2 = {"Lcom/woocommerce/android/tracker/DataStoreTrackerRepository;", "Lcom/woocommerce/android/tracker/TrackerRepository;", "dataStore", "Landroidx/datastore/core/DataStore;", "Landroidx/datastore/preferences/core/Preferences;", "(Landroidx/datastore/core/DataStore;)V", "observeLastSendingDate", "Lkotlinx/coroutines/flow/Flow;", "", "site", "Lorg/wordpress/android/fluxc/model/SiteModel;", "updateLastSendingDate", "", "lastUpdateMillis", "(Lorg/wordpress/android/fluxc/model/SiteModel;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "WooCommerce_vanillaDebug"})
public final class DataStoreTrackerRepository implements com.woocommerce.android.tracker.TrackerRepository {
    private final androidx.datastore.core.DataStore<androidx.datastore.preferences.core.Preferences> dataStore = null;
    
    @javax.inject.Inject()
    public DataStoreTrackerRepository(@org.jetbrains.annotations.NotNull()
    @com.woocommerce.android.datastore.DataStoreQualifier(value = com.woocommerce.android.datastore.DataStoreType.TRACKER)
    androidx.datastore.core.DataStore<androidx.datastore.preferences.core.Preferences> dataStore) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public kotlinx.coroutines.flow.Flow<java.lang.Long> observeLastSendingDate(@org.jetbrains.annotations.NotNull()
    org.wordpress.android.fluxc.model.SiteModel site) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object updateLastSendingDate(@org.jetbrains.annotations.NotNull()
    org.wordpress.android.fluxc.model.SiteModel site, long lastUpdateMillis, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
}