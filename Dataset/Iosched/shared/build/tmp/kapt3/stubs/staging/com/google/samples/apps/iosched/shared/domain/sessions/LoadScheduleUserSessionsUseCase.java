package com.google.samples.apps.iosched.shared.domain.sessions;

import java.lang.System;

/**
 * Loads sorted sessions for the Schedule.
 */
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0016\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0002J\u001c\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00100\u000f2\u0006\u0010\u0011\u001a\u00020\u0002H\u0014J\u001e\u0010\u0012\u001a\u00020\u00132\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u0015\u001a\u00020\u0016H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Lcom/google/samples/apps/iosched/shared/domain/sessions/LoadScheduleUserSessionsUseCase;", "Lcom/google/samples/apps/iosched/shared/domain/FlowUseCase;", "Lcom/google/samples/apps/iosched/shared/domain/sessions/LoadScheduleUserSessionsParameters;", "Lcom/google/samples/apps/iosched/shared/domain/sessions/LoadScheduleUserSessionsResult;", "userEventRepository", "Lcom/google/samples/apps/iosched/shared/data/userevent/DefaultSessionAndUserEventRepository;", "dispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "(Lcom/google/samples/apps/iosched/shared/data/userevent/DefaultSessionAndUserEventRepository;Lkotlinx/coroutines/CoroutineDispatcher;)V", "buildConferenceDayIndexer", "Lcom/google/samples/apps/iosched/shared/domain/sessions/ConferenceDayIndexer;", "sessions", "", "Lcom/google/samples/apps/iosched/model/userdata/UserSession;", "execute", "Lkotlinx/coroutines/flow/Flow;", "Lcom/google/samples/apps/iosched/shared/result/Result;", "parameters", "findFirstUnfinishedSession", "", "userSessions", "now", "Lorg/threeten/bp/ZonedDateTime;", "shared_staging"})
public class LoadScheduleUserSessionsUseCase extends com.google.samples.apps.iosched.shared.domain.FlowUseCase<com.google.samples.apps.iosched.shared.domain.sessions.LoadScheduleUserSessionsParameters, com.google.samples.apps.iosched.shared.domain.sessions.LoadScheduleUserSessionsResult> {
    private final com.google.samples.apps.iosched.shared.data.userevent.DefaultSessionAndUserEventRepository userEventRepository = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    protected kotlinx.coroutines.flow.Flow<com.google.samples.apps.iosched.shared.result.Result<com.google.samples.apps.iosched.shared.domain.sessions.LoadScheduleUserSessionsResult>> execute(@org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.shared.domain.sessions.LoadScheduleUserSessionsParameters parameters) {
        return null;
    }
    
    /**
     * During the conference, find the first session which has not finished so that the UI can
     * scroll to it.
     */
    private final int findFirstUnfinishedSession(java.util.List<com.google.samples.apps.iosched.model.userdata.UserSession> userSessions, org.threeten.bp.ZonedDateTime now) {
        return 0;
    }
    
    /**
     * Finds indices in [sessions] where each ConferenceDay begins. This method assumes [sessions]
     * is sorted by start time.
     */
    private final com.google.samples.apps.iosched.shared.domain.sessions.ConferenceDayIndexer buildConferenceDayIndexer(java.util.List<com.google.samples.apps.iosched.model.userdata.UserSession> sessions) {
        return null;
    }
    
    @javax.inject.Inject()
    public LoadScheduleUserSessionsUseCase(@org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.shared.data.userevent.DefaultSessionAndUserEventRepository userEventRepository, @org.jetbrains.annotations.NotNull()
    @com.google.samples.apps.iosched.shared.di.IoDispatcher()
    kotlinx.coroutines.CoroutineDispatcher dispatcher) {
        super(null);
    }
}