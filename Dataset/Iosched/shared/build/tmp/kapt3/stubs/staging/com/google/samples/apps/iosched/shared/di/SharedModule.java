package com.google.samples.apps.iosched.shared.di;

import java.lang.System;

/**
 * Module where classes created in the shared module are created.
 */
@dagger.hilt.InstallIn(value = {dagger.hilt.android.components.ApplicationComponent.class})
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007J\b\u0010\u0005\u001a\u00020\u0006H\u0007J\b\u0010\u0007\u001a\u00020\bH\u0007J\b\u0010\t\u001a\u00020\nH\u0007J$\u0010\u000b\u001a\u00020\f2\b\b\u0001\u0010\r\u001a\u00020\n2\b\b\u0001\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u0010H\u0007J\b\u0010\u0011\u001a\u00020\nH\u0007J\u0018\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0016H\u0007J\b\u0010\u0017\u001a\u00020\u0018H\u0007J\b\u0010\u0019\u001a\u00020\u0016H\u0007J\u0018\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fH\u0007J\u0010\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\fH\u0007J\u001a\u0010\"\u001a\u00020#2\b\b\u0001\u0010$\u001a\u00020%2\u0006\u0010\u000f\u001a\u00020\u0010H\u0007J\b\u0010&\u001a\u00020\'H\u0007J\b\u0010(\u001a\u00020)H\u0007J\b\u0010*\u001a\u00020\u001dH\u0007\u00a8\u0006+"}, d2 = {"Lcom/google/samples/apps/iosched/shared/di/SharedModule;", "", "()V", "provideAnnouncementDataSource", "Lcom/google/samples/apps/iosched/shared/data/feed/AnnouncementDataSource;", "provideAppConfigDataSource", "Lcom/google/samples/apps/iosched/shared/data/config/AppConfigDataSource;", "provideArDebugFlagEndpoint", "Lcom/google/samples/apps/iosched/shared/data/ar/ArDebugFlagEndpoint;", "provideBootstrapRemoteSessionDataSource", "Lcom/google/samples/apps/iosched/shared/data/ConferenceDataSource;", "provideConferenceDataRepository", "Lcom/google/samples/apps/iosched/shared/data/ConferenceDataRepository;", "remoteDataSource", "boostrapDataSource", "appDatabase", "Lcom/google/samples/apps/iosched/shared/data/db/AppDatabase;", "provideConferenceDataSource", "provideFeedRepository", "Lcom/google/samples/apps/iosched/shared/data/feed/FeedRepository;", "announcementDataSource", "momentDataSource", "Lcom/google/samples/apps/iosched/shared/data/feed/MomentDataSource;", "provideFeedbackEndpoint", "Lcom/google/samples/apps/iosched/shared/data/feedback/FeedbackEndpoint;", "provideMomentDataSource", "provideSessionAndUserEventRepository", "Lcom/google/samples/apps/iosched/shared/data/userevent/SessionAndUserEventRepository;", "userEventDataSource", "Lcom/google/samples/apps/iosched/shared/data/userevent/UserEventDataSource;", "sessionRepository", "Lcom/google/samples/apps/iosched/shared/data/session/SessionRepository;", "provideSessionRepository", "conferenceDataRepository", "provideSessionTextMatchStrategy", "Lcom/google/samples/apps/iosched/shared/domain/search/SessionTextMatchStrategy;", "useRoom", "", "provideTimeProvider", "Lcom/google/samples/apps/iosched/shared/time/TimeProvider;", "provideTopicSubscriber", "Lcom/google/samples/apps/iosched/shared/fcm/TopicSubscriber;", "provideUserEventDataSource", "shared_staging"})
@dagger.Module()
public final class SharedModule {
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Named(value = "remoteConfDatasource")
    @dagger.Provides()
    @javax.inject.Singleton()
    public final com.google.samples.apps.iosched.shared.data.ConferenceDataSource provideConferenceDataSource() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Named(value = "bootstrapConfDataSource")
    @dagger.Provides()
    @javax.inject.Singleton()
    public final com.google.samples.apps.iosched.shared.data.ConferenceDataSource provideBootstrapRemoteSessionDataSource() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final com.google.samples.apps.iosched.shared.data.ConferenceDataRepository provideConferenceDataRepository(@org.jetbrains.annotations.NotNull()
    @javax.inject.Named(value = "remoteConfDatasource")
    com.google.samples.apps.iosched.shared.data.ConferenceDataSource remoteDataSource, @org.jetbrains.annotations.NotNull()
    @javax.inject.Named(value = "bootstrapConfDataSource")
    com.google.samples.apps.iosched.shared.data.ConferenceDataSource boostrapDataSource, @org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.shared.data.db.AppDatabase appDatabase) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final com.google.samples.apps.iosched.shared.data.session.SessionRepository provideSessionRepository(@org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.shared.data.ConferenceDataRepository conferenceDataRepository) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final com.google.samples.apps.iosched.shared.data.userevent.UserEventDataSource provideUserEventDataSource() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final com.google.samples.apps.iosched.shared.data.feedback.FeedbackEndpoint provideFeedbackEndpoint() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final com.google.samples.apps.iosched.shared.data.userevent.SessionAndUserEventRepository provideSessionAndUserEventRepository(@org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.shared.data.userevent.UserEventDataSource userEventDataSource, @org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.shared.data.session.SessionRepository sessionRepository) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final com.google.samples.apps.iosched.shared.fcm.TopicSubscriber provideTopicSubscriber() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final com.google.samples.apps.iosched.shared.data.config.AppConfigDataSource provideAppConfigDataSource() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final com.google.samples.apps.iosched.shared.time.TimeProvider provideTimeProvider() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final com.google.samples.apps.iosched.shared.data.feed.AnnouncementDataSource provideAnnouncementDataSource() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final com.google.samples.apps.iosched.shared.data.feed.MomentDataSource provideMomentDataSource() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final com.google.samples.apps.iosched.shared.data.feed.FeedRepository provideFeedRepository(@org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.shared.data.feed.AnnouncementDataSource announcementDataSource, @org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.shared.data.feed.MomentDataSource momentDataSource) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final com.google.samples.apps.iosched.shared.data.ar.ArDebugFlagEndpoint provideArDebugFlagEndpoint() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final com.google.samples.apps.iosched.shared.domain.search.SessionTextMatchStrategy provideSessionTextMatchStrategy(@SearchUsingRoomEnabledFlag()
    boolean useRoom, @org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.shared.data.db.AppDatabase appDatabase) {
        return null;
    }
    
    public SharedModule() {
        super();
    }
}