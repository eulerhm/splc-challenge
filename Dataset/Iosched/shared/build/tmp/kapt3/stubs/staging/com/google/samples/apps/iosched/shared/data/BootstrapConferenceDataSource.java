package com.google.samples.apps.iosched.shared.data;

import java.lang.System;

/**
 * Loads bootstrap data file from resources and parses it.
 */
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\n\u0010\u0003\u001a\u0004\u0018\u00010\u0004H\u0016J\n\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\u0006\u0010\u0006\u001a\u00020\u0004\u00a8\u0006\u0007"}, d2 = {"Lcom/google/samples/apps/iosched/shared/data/BootstrapConferenceDataSource;", "Lcom/google/samples/apps/iosched/shared/data/ConferenceDataSource;", "()V", "getOfflineConferenceData", "Lcom/google/samples/apps/iosched/model/ConferenceData;", "getRemoteConferenceData", "loadAndParseBootstrapData", "shared_staging"})
public final class BootstrapConferenceDataSource implements com.google.samples.apps.iosched.shared.data.ConferenceDataSource {
    public static final com.google.samples.apps.iosched.shared.data.BootstrapConferenceDataSource INSTANCE = null;
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public com.google.samples.apps.iosched.model.ConferenceData getRemoteConferenceData() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public com.google.samples.apps.iosched.model.ConferenceData getOfflineConferenceData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.google.samples.apps.iosched.model.ConferenceData loadAndParseBootstrapData() {
        return null;
    }
    
    private BootstrapConferenceDataSource() {
        super();
    }
}