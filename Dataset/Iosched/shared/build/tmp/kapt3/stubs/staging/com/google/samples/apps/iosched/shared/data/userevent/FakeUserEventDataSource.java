package com.google.samples.apps.iosched.shared.data.userevent;

import java.lang.System;

/**
 * Returns data loaded from a local JSON file for development and testing.
 */
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\b\u0010\b\u001a\u00020\tH\u0016J\"\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\r\u001a\u00020\u000e2\n\u0010\u000f\u001a\u00060\u000ej\u0002`\u0010H\u0016J\u0016\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u000b2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u001e\u0010\u0013\u001a\u0004\u0018\u00010\u00072\u0006\u0010\r\u001a\u00020\u000e2\n\u0010\u000f\u001a\u00060\u000ej\u0002`\u0010H\u0016J\u0016\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00070\u00152\u0006\u0010\r\u001a\u00020\u000eH\u0016J\'\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\t0\u00172\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u0007H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0019J/\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00172\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001fJ+\u0010 \u001a\b\u0012\u0004\u0012\u00020\"0!2\n\u0010\r\u001a\u00060\u000ej\u0002`\u00102\u0006\u0010\u0018\u001a\u00020\u0007H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0019J/\u0010#\u001a\b\u0012\u0004\u0012\u00020$0\u00172\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010%\u001a\u00020\u001d2\u0006\u0010&\u001a\u00020\u001dH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\'R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006("}, d2 = {"Lcom/google/samples/apps/iosched/shared/data/userevent/FakeUserEventDataSource;", "Lcom/google/samples/apps/iosched/shared/data/userevent/UserEventDataSource;", "()V", "conferenceData", "Lcom/google/samples/apps/iosched/model/ConferenceData;", "userEvents", "Ljava/util/ArrayList;", "Lcom/google/samples/apps/iosched/model/userdata/UserEvent;", "clearSingleEventSubscriptions", "", "getObservableUserEvent", "Lkotlinx/coroutines/flow/Flow;", "Lcom/google/samples/apps/iosched/shared/data/userevent/UserEventResult;", "userId", "", "eventId", "Lcom/google/samples/apps/iosched/model/SessionId;", "getObservableUserEvents", "Lcom/google/samples/apps/iosched/shared/data/userevent/UserEventsResult;", "getUserEvent", "getUserEvents", "", "recordFeedbackSent", "Lcom/google/samples/apps/iosched/shared/result/Result;", "userEvent", "(Ljava/lang/String;Lcom/google/samples/apps/iosched/model/userdata/UserEvent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "requestReservation", "Lcom/google/samples/apps/iosched/shared/domain/users/ReservationRequestAction;", "session", "Lcom/google/samples/apps/iosched/model/Session;", "action", "(Ljava/lang/String;Lcom/google/samples/apps/iosched/model/Session;Lcom/google/samples/apps/iosched/shared/domain/users/ReservationRequestAction;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "starEvent", "Lcom/google/samples/apps/iosched/shared/result/Result$Success;", "Lcom/google/samples/apps/iosched/shared/domain/users/StarUpdatedStatus;", "swapReservation", "Lcom/google/samples/apps/iosched/shared/domain/users/SwapRequestAction;", "fromSession", "toSession", "(Ljava/lang/String;Lcom/google/samples/apps/iosched/model/Session;Lcom/google/samples/apps/iosched/model/Session;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "shared_staging"})
public final class FakeUserEventDataSource implements com.google.samples.apps.iosched.shared.data.userevent.UserEventDataSource {
    private static final com.google.samples.apps.iosched.model.ConferenceData conferenceData = null;
    private static final java.util.ArrayList<com.google.samples.apps.iosched.model.userdata.UserEvent> userEvents = null;
    public static final com.google.samples.apps.iosched.shared.data.userevent.FakeUserEventDataSource INSTANCE = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public kotlinx.coroutines.flow.Flow<com.google.samples.apps.iosched.shared.data.userevent.UserEventsResult> getObservableUserEvents(@org.jetbrains.annotations.NotNull()
    java.lang.String userId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public kotlinx.coroutines.flow.Flow<com.google.samples.apps.iosched.shared.data.userevent.UserEventResult> getObservableUserEvent(@org.jetbrains.annotations.NotNull()
    java.lang.String userId, @org.jetbrains.annotations.NotNull()
    java.lang.String eventId) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object starEvent(@org.jetbrains.annotations.NotNull()
    java.lang.String userId, @org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.model.userdata.UserEvent userEvent, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.google.samples.apps.iosched.shared.result.Result.Success<? extends com.google.samples.apps.iosched.shared.domain.users.StarUpdatedStatus>> p2) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object recordFeedbackSent(@org.jetbrains.annotations.NotNull()
    java.lang.String userId, @org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.model.userdata.UserEvent userEvent, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.google.samples.apps.iosched.shared.result.Result<kotlin.Unit>> p2) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object requestReservation(@org.jetbrains.annotations.NotNull()
    java.lang.String userId, @org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.model.Session session, @org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.shared.domain.users.ReservationRequestAction action, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.google.samples.apps.iosched.shared.result.Result<? extends com.google.samples.apps.iosched.shared.domain.users.ReservationRequestAction>> p3) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<com.google.samples.apps.iosched.model.userdata.UserEvent> getUserEvents(@org.jetbrains.annotations.NotNull()
    java.lang.String userId) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object swapReservation(@org.jetbrains.annotations.NotNull()
    java.lang.String userId, @org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.model.Session fromSession, @org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.model.Session toSession, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.google.samples.apps.iosched.shared.result.Result<com.google.samples.apps.iosched.shared.domain.users.SwapRequestAction>> p3) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public com.google.samples.apps.iosched.model.userdata.UserEvent getUserEvent(@org.jetbrains.annotations.NotNull()
    java.lang.String userId, @org.jetbrains.annotations.NotNull()
    java.lang.String eventId) {
        return null;
    }
    
    @java.lang.Override()
    public void clearSingleEventSubscriptions() {
    }
    
    private FakeUserEventDataSource() {
        super();
    }
}