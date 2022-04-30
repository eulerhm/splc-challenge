package com.google.samples.apps.iosched.shared.data.userevent;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J3\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00062\n\u0010\u0007\u001a\u00060\u0006j\u0002`\b2\u0006\u0010\t\u001a\u00020\u0004H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nJ\u000e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fH&J*\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u00030\u000f2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\u0010\u0011\u001a\u00060\u0006j\u0002`\bH&J\u001e\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00030\u000f2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H&J\u0018\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\f2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H&J\u001c\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0005\u001a\u00020\u00062\n\u0010\u0007\u001a\u00060\u0006j\u0002`\bH&J\'\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u0015H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001bJ\'\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u0015H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001bJ7\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\u00032\u0006\u0010\u0005\u001a\u00020\u00062\n\u0010 \u001a\u00060\u0006j\u0002`\b2\n\u0010!\u001a\u00060\u0006j\u0002`\bH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\"\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006#"}, d2 = {"Lcom/google/samples/apps/iosched/shared/data/userevent/SessionAndUserEventRepository;", "", "changeReservation", "Lcom/google/samples/apps/iosched/shared/result/Result;", "Lcom/google/samples/apps/iosched/shared/domain/users/ReservationRequestAction;", "userId", "", "sessionId", "Lcom/google/samples/apps/iosched/model/SessionId;", "action", "(Ljava/lang/String;Ljava/lang/String;Lcom/google/samples/apps/iosched/shared/domain/users/ReservationRequestAction;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getConferenceDays", "", "Lcom/google/samples/apps/iosched/model/ConferenceDay;", "getObservableUserEvent", "Lkotlinx/coroutines/flow/Flow;", "Lcom/google/samples/apps/iosched/shared/domain/sessions/LoadUserSessionUseCaseResult;", "eventId", "getObservableUserEvents", "Lcom/google/samples/apps/iosched/shared/data/userevent/ObservableUserEvents;", "getUserEvents", "Lcom/google/samples/apps/iosched/model/userdata/UserEvent;", "getUserSession", "Lcom/google/samples/apps/iosched/model/userdata/UserSession;", "recordFeedbackSent", "", "userEvent", "(Ljava/lang/String;Lcom/google/samples/apps/iosched/model/userdata/UserEvent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "starEvent", "Lcom/google/samples/apps/iosched/shared/domain/users/StarUpdatedStatus;", "swapReservation", "Lcom/google/samples/apps/iosched/shared/domain/users/SwapRequestAction;", "fromId", "toId", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "shared_staging"})
public abstract interface SessionAndUserEventRepository {
    
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<com.google.samples.apps.iosched.shared.result.Result<com.google.samples.apps.iosched.shared.data.userevent.ObservableUserEvents>> getObservableUserEvents(@org.jetbrains.annotations.Nullable()
    java.lang.String userId);
    
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<com.google.samples.apps.iosched.shared.result.Result<com.google.samples.apps.iosched.shared.domain.sessions.LoadUserSessionUseCaseResult>> getObservableUserEvent(@org.jetbrains.annotations.Nullable()
    java.lang.String userId, @org.jetbrains.annotations.NotNull()
    java.lang.String eventId);
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<com.google.samples.apps.iosched.model.userdata.UserEvent> getUserEvents(@org.jetbrains.annotations.Nullable()
    java.lang.String userId);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object changeReservation(@org.jetbrains.annotations.NotNull()
    java.lang.String userId, @org.jetbrains.annotations.NotNull()
    java.lang.String sessionId, @org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.shared.domain.users.ReservationRequestAction action, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.google.samples.apps.iosched.shared.result.Result<? extends com.google.samples.apps.iosched.shared.domain.users.ReservationRequestAction>> p3);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object swapReservation(@org.jetbrains.annotations.NotNull()
    java.lang.String userId, @org.jetbrains.annotations.NotNull()
    java.lang.String fromId, @org.jetbrains.annotations.NotNull()
    java.lang.String toId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.google.samples.apps.iosched.shared.result.Result<com.google.samples.apps.iosched.shared.domain.users.SwapRequestAction>> p3);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object starEvent(@org.jetbrains.annotations.NotNull()
    java.lang.String userId, @org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.model.userdata.UserEvent userEvent, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.google.samples.apps.iosched.shared.result.Result<? extends com.google.samples.apps.iosched.shared.domain.users.StarUpdatedStatus>> p2);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object recordFeedbackSent(@org.jetbrains.annotations.NotNull()
    java.lang.String userId, @org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.model.userdata.UserEvent userEvent, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.google.samples.apps.iosched.shared.result.Result<kotlin.Unit>> p2);
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<com.google.samples.apps.iosched.model.ConferenceDay> getConferenceDays();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.google.samples.apps.iosched.model.userdata.UserSession getUserSession(@org.jetbrains.annotations.NotNull()
    java.lang.String userId, @org.jetbrains.annotations.NotNull()
    java.lang.String sessionId);
}