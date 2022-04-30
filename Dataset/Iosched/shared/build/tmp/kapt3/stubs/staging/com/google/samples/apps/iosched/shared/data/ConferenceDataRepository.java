package com.google.samples.apps.iosched.shared.data;

import java.lang.System;

/**
 * Single point of access to session data for the presentation layer.
 *
 * The session data is loaded from the bootstrap file.
 */
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0017\u0018\u00002\u00020\u0001B#\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\b\u0010 \u001a\u00020!H\u0007J\b\u0010\"\u001a\u00020\tH\u0002J\b\u0010#\u001a\u00020\tH\u0002J\u000e\u0010$\u001a\b\u0012\u0004\u0012\u00020&0%H\u0016J\u0006\u0010\'\u001a\u00020\tJ\u0010\u0010(\u001a\u00020!2\u0006\u0010)\u001a\u00020\tH\u0016J\u0006\u0010*\u001a\u00020!R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0011\u0010\n\u001a\u00020\u000b8F\u00a2\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u0012\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R.\u0010\u0018\u001a\n\u0018\u00010\u0016j\u0004\u0018\u0001`\u00172\u000e\u0010\u0015\u001a\n\u0018\u00010\u0016j\u0004\u0018\u0001`\u0017@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u001e\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0015\u001a\u00020\u001b@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u000e\u0010\u001f\u001a\u00020\u0001X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006+"}, d2 = {"Lcom/google/samples/apps/iosched/shared/data/ConferenceDataRepository;", "", "remoteDataSource", "Lcom/google/samples/apps/iosched/shared/data/ConferenceDataSource;", "boostrapDataSource", "appDatabase", "Lcom/google/samples/apps/iosched/shared/data/db/AppDatabase;", "(Lcom/google/samples/apps/iosched/shared/data/ConferenceDataSource;Lcom/google/samples/apps/iosched/shared/data/ConferenceDataSource;Lcom/google/samples/apps/iosched/shared/data/db/AppDatabase;)V", "conferenceDataCache", "Lcom/google/samples/apps/iosched/model/ConferenceData;", "currentConferenceDataVersion", "", "getCurrentConferenceDataVersion", "()I", "dataLastUpdatedChannel", "Lkotlinx/coroutines/channels/BroadcastChannel;", "", "dataLastUpdatedObservable", "Lkotlinx/coroutines/flow/Flow;", "getDataLastUpdatedObservable", "()Lkotlinx/coroutines/flow/Flow;", "<set-?>", "Ljava/lang/Exception;", "Lkotlin/Exception;", "latestException", "getLatestException", "()Ljava/lang/Exception;", "Lcom/google/samples/apps/iosched/shared/data/UpdateSource;", "latestUpdateSource", "getLatestUpdateSource", "()Lcom/google/samples/apps/iosched/shared/data/UpdateSource;", "loadConfDataLock", "closeDataLastUpdatedChannel", "", "getCacheOrBootstrapData", "getCacheOrBootstrapDataAndPopulateSearch", "getConferenceDays", "", "Lcom/google/samples/apps/iosched/model/ConferenceDay;", "getOfflineConferenceData", "populateSearchData", "conferenceData", "refreshCacheWithRemoteConferenceData", "shared_staging"})
@javax.inject.Singleton()
public class ConferenceDataRepository {
    private com.google.samples.apps.iosched.model.ConferenceData conferenceDataCache;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Exception latestException;
    @org.jetbrains.annotations.NotNull()
    private com.google.samples.apps.iosched.shared.data.UpdateSource latestUpdateSource = com.google.samples.apps.iosched.shared.data.UpdateSource.NONE;
    private final kotlinx.coroutines.channels.BroadcastChannel<java.lang.Long> dataLastUpdatedChannel = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.Flow<java.lang.Long> dataLastUpdatedObservable = null;
    private final java.lang.Object loadConfDataLock = null;
    private final com.google.samples.apps.iosched.shared.data.ConferenceDataSource remoteDataSource = null;
    private final com.google.samples.apps.iosched.shared.data.ConferenceDataSource boostrapDataSource = null;
    private final com.google.samples.apps.iosched.shared.data.db.AppDatabase appDatabase = null;
    
    public final int getCurrentConferenceDataVersion() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Exception getLatestException() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.google.samples.apps.iosched.shared.data.UpdateSource getLatestUpdateSource() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<java.lang.Long> getDataLastUpdatedObservable() {
        return null;
    }
    
    @androidx.annotation.VisibleForTesting()
    public final void closeDataLastUpdatedChannel() {
    }
    
    public final void refreshCacheWithRemoteConferenceData() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.google.samples.apps.iosched.model.ConferenceData getOfflineConferenceData() {
        return null;
    }
    
    private final com.google.samples.apps.iosched.model.ConferenceData getCacheOrBootstrapDataAndPopulateSearch() {
        return null;
    }
    
    private final com.google.samples.apps.iosched.model.ConferenceData getCacheOrBootstrapData() {
        return null;
    }
    
    public void populateSearchData(@org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.model.ConferenceData conferenceData) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public java.util.List<com.google.samples.apps.iosched.model.ConferenceDay> getConferenceDays() {
        return null;
    }
    
    @javax.inject.Inject()
    public ConferenceDataRepository(@org.jetbrains.annotations.NotNull()
    @javax.inject.Named(value = "remoteConfDatasource")
    com.google.samples.apps.iosched.shared.data.ConferenceDataSource remoteDataSource, @org.jetbrains.annotations.NotNull()
    @javax.inject.Named(value = "bootstrapConfDataSource")
    com.google.samples.apps.iosched.shared.data.ConferenceDataSource boostrapDataSource, @org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.shared.data.db.AppDatabase appDatabase) {
        super();
    }
}