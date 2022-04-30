package com.google.samples.apps.iosched.shared.data;

import java.lang.System;

/**
 * Downloads and parses conference data.
 */
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\n\u0010\t\u001a\u0004\u0018\u00010\nH\u0016J\n\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lcom/google/samples/apps/iosched/shared/data/NetworkConferenceDataSource;", "Lcom/google/samples/apps/iosched/shared/data/ConferenceDataSource;", "context", "Landroid/content/Context;", "networkUtils", "Lcom/google/samples/apps/iosched/shared/util/NetworkUtils;", "(Landroid/content/Context;Lcom/google/samples/apps/iosched/shared/util/NetworkUtils;)V", "getContext", "()Landroid/content/Context;", "getOfflineConferenceData", "Lcom/google/samples/apps/iosched/model/ConferenceData;", "getRemoteConferenceData", "shared_staging"})
public final class NetworkConferenceDataSource implements com.google.samples.apps.iosched.shared.data.ConferenceDataSource {
    @org.jetbrains.annotations.NotNull()
    private final android.content.Context context = null;
    private final com.google.samples.apps.iosched.shared.util.NetworkUtils networkUtils = null;
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public com.google.samples.apps.iosched.model.ConferenceData getRemoteConferenceData() {
        return null;
    }
    
    /**
     * Returns the cached conference data or null if there's no cache.
     */
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public com.google.samples.apps.iosched.model.ConferenceData getOfflineConferenceData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Context getContext() {
        return null;
    }
    
    @javax.inject.Inject()
    public NetworkConferenceDataSource(@org.jetbrains.annotations.NotNull()
    @dagger.hilt.android.qualifiers.ApplicationContext()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.shared.util.NetworkUtils networkUtils) {
        super();
    }
}