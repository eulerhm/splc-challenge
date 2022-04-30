package com.google.samples.apps.iosched.shared.data.userevent;

import java.lang.System;

/**
 * Single point of access to user events data associated with a user for the presentation layer.
 */
@kotlinx.coroutines.ExperimentalCoroutinesApi()
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0017\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J3\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000b2\n\u0010\f\u001a\u00060\u000bj\u0002`\r2\u0006\u0010\u000e\u001a\u00020\tH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J<\u0010\u0014\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\t2\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00130\u00162\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00110\u0018H\u0002J\u000e\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0018H\u0016J*\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\b0\u001c2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\u0010\u001e\u001a\u00060\u000bj\u0002`\rH\u0016J\u001e\u0010\u001f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\b0\u001c2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0017J\u0018\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00110\u00182\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016J\u001c\u0010\"\u001a\u00020#2\u0006\u0010\n\u001a\u00020\u000b2\n\u0010\f\u001a\u00060\u000bj\u0002`\rH\u0016J&\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\u00182\b\u0010%\u001a\u0004\u0018\u00010&2\f\u0010\'\u001a\b\u0012\u0004\u0012\u00020\u00130\u0018H\u0003J\'\u0010(\u001a\b\u0012\u0004\u0012\u00020)0\b2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010*\u001a\u00020\u0011H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010+J\'\u0010,\u001a\b\u0012\u0004\u0012\u00020-0\b2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010*\u001a\u00020\u0011H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010+J7\u0010.\u001a\b\u0012\u0004\u0012\u00020/0\b2\u0006\u0010\n\u001a\u00020\u000b2\n\u00100\u001a\u00060\u000bj\u0002`\r2\n\u00101\u001a\u00060\u000bj\u0002`\rH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u00102R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u00063"}, d2 = {"Lcom/google/samples/apps/iosched/shared/data/userevent/DefaultSessionAndUserEventRepository;", "Lcom/google/samples/apps/iosched/shared/data/userevent/SessionAndUserEventRepository;", "userEventDataSource", "Lcom/google/samples/apps/iosched/shared/data/userevent/UserEventDataSource;", "sessionRepository", "Lcom/google/samples/apps/iosched/shared/data/session/SessionRepository;", "(Lcom/google/samples/apps/iosched/shared/data/userevent/UserEventDataSource;Lcom/google/samples/apps/iosched/shared/data/session/SessionRepository;)V", "changeReservation", "Lcom/google/samples/apps/iosched/shared/result/Result;", "Lcom/google/samples/apps/iosched/shared/domain/users/ReservationRequestAction;", "userId", "", "sessionId", "Lcom/google/samples/apps/iosched/model/SessionId;", "action", "(Ljava/lang/String;Ljava/lang/String;Lcom/google/samples/apps/iosched/shared/domain/users/ReservationRequestAction;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createDefaultUserEvent", "Lcom/google/samples/apps/iosched/model/userdata/UserEvent;", "session", "Lcom/google/samples/apps/iosched/model/Session;", "findOverlappingReservationId", "sessions", "", "userEvents", "", "getConferenceDays", "Lcom/google/samples/apps/iosched/model/ConferenceDay;", "getObservableUserEvent", "Lkotlinx/coroutines/flow/Flow;", "Lcom/google/samples/apps/iosched/shared/domain/sessions/LoadUserSessionUseCaseResult;", "eventId", "getObservableUserEvents", "Lcom/google/samples/apps/iosched/shared/data/userevent/ObservableUserEvents;", "getUserEvents", "getUserSession", "Lcom/google/samples/apps/iosched/model/userdata/UserSession;", "mergeUserDataAndSessions", "userData", "Lcom/google/samples/apps/iosched/shared/data/userevent/UserEventsResult;", "allSessions", "recordFeedbackSent", "", "userEvent", "(Ljava/lang/String;Lcom/google/samples/apps/iosched/model/userdata/UserEvent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "starEvent", "Lcom/google/samples/apps/iosched/shared/domain/users/StarUpdatedStatus;", "swapReservation", "Lcom/google/samples/apps/iosched/shared/domain/users/SwapRequestAction;", "fromId", "toId", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "shared_staging"})
@javax.inject.Singleton()
public class DefaultSessionAndUserEventRepository implements com.google.samples.apps.iosched.shared.data.userevent.SessionAndUserEventRepository {
    private final com.google.samples.apps.iosched.shared.data.userevent.UserEventDataSource userEventDataSource = null;
    private final com.google.samples.apps.iosched.shared.data.session.SessionRepository sessionRepository = null;
    
    @org.jetbrains.annotations.NotNull()
    @androidx.annotation.WorkerThread()
    @java.lang.Override()
    public kotlinx.coroutines.flow.Flow<com.google.samples.apps.iosched.shared.result.Result<com.google.samples.apps.iosched.shared.data.userevent.ObservableUserEvents>> getObservableUserEvents(@org.jetbrains.annotations.Nullable()
    java.lang.String userId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public kotlinx.coroutines.flow.Flow<com.google.samples.apps.iosched.shared.result.Result<com.google.samples.apps.iosched.shared.domain.sessions.LoadUserSessionUseCaseResult>> getObservableUserEvent(@org.jetbrains.annotations.Nullable()
    java.lang.String userId, @org.jetbrains.annotations.NotNull()
    java.lang.String eventId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<com.google.samples.apps.iosched.model.userdata.UserEvent> getUserEvents(@org.jetbrains.annotations.Nullable()
    java.lang.String userId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.google.samples.apps.iosched.model.userdata.UserSession getUserSession(@org.jetbrains.annotations.NotNull()
    java.lang.String userId, @org.jetbrains.annotations.NotNull()
    java.lang.String sessionId) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object starEvent(@org.jetbrains.annotations.NotNull()
    java.lang.String p0, @org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.model.userdata.UserEvent p1, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.google.samples.apps.iosched.shared.result.Result<? extends com.google.samples.apps.iosched.shared.domain.users.StarUpdatedStatus>> p2) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object recordFeedbackSent(@org.jetbrains.annotations.NotNull()
    java.lang.String p0, @org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.model.userdata.UserEvent p1, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.google.samples.apps.iosched.shared.result.Result<kotlin.Unit>> p2) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object changeReservation(@org.jetbrains.annotations.NotNull()
    java.lang.String p0, @org.jetbrains.annotations.NotNull()
    java.lang.String p1, @org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.shared.domain.users.ReservationRequestAction p2, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.google.samples.apps.iosched.shared.result.Result<? extends com.google.samples.apps.iosched.shared.domain.users.ReservationRequestAction>> p3) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object swapReservation(@org.jetbrains.annotations.NotNull()
    java.lang.String p0, @org.jetbrains.annotations.NotNull()
    java.lang.String p1, @org.jetbrains.annotations.NotNull()
    java.lang.String p2, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.google.samples.apps.iosched.shared.result.Result<com.google.samples.apps.iosched.shared.domain.users.SwapRequestAction>> p3) {
        return null;
    }
    
    private final java.lang.String findOverlappingReservationId(com.google.samples.apps.iosched.model.Session session, com.google.samples.apps.iosched.shared.domain.users.ReservationRequestAction action, java.util.Map<java.lang.String, com.google.samples.apps.iosched.model.Session> sessions, java.util.List<com.google.samples.apps.iosched.model.userdata.UserEvent> userEvents) {
        return null;
    }
    
    private final com.google.samples.apps.iosched.model.userdata.UserEvent createDefaultUserEvent(com.google.samples.apps.iosched.model.Session session) {
        return null;
    }
    
    /**
     * Merges user data with sessions.
     */
    @androidx.annotation.WorkerThread()
    private final java.util.List<com.google.samples.apps.iosched.model.userdata.UserSession> mergeUserDataAndSessions(com.google.samples.apps.iosched.shared.data.userevent.UserEventsResult userData, java.util.List<com.google.samples.apps.iosched.model.Session> allSessions) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<com.google.samples.apps.iosched.model.ConferenceDay> getConferenceDays() {
        return null;
    }
    
    @javax.inject.Inject()
    public DefaultSessionAndUserEventRepository(@org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.shared.data.userevent.UserEventDataSource userEventDataSource, @org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.shared.data.session.SessionRepository sessionRepository) {
        super();
    }
}