package com.google.samples.apps.iosched.shared.data.userevent;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\"\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\b2\n\u0010\t\u001a\u00060\bj\u0002`\nH&J\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00052\u0006\u0010\u0007\u001a\u00020\bH&J\u001e\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0007\u001a\u00020\b2\n\u0010\t\u001a\u00060\bj\u0002`\nH&J\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00102\u0006\u0010\u0007\u001a\u00020\bH&J\'\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\u00122\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u000eH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0014J/\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u00122\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0016H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001aJ\'\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00122\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u000eH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0014J/\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00122\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020\u00182\u0006\u0010 \u001a\u00020\u0018H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010!\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\""}, d2 = {"Lcom/google/samples/apps/iosched/shared/data/userevent/UserEventDataSource;", "", "clearSingleEventSubscriptions", "", "getObservableUserEvent", "Lkotlinx/coroutines/flow/Flow;", "Lcom/google/samples/apps/iosched/shared/data/userevent/UserEventResult;", "userId", "", "eventId", "Lcom/google/samples/apps/iosched/model/SessionId;", "getObservableUserEvents", "Lcom/google/samples/apps/iosched/shared/data/userevent/UserEventsResult;", "getUserEvent", "Lcom/google/samples/apps/iosched/model/userdata/UserEvent;", "getUserEvents", "", "recordFeedbackSent", "Lcom/google/samples/apps/iosched/shared/result/Result;", "userEvent", "(Ljava/lang/String;Lcom/google/samples/apps/iosched/model/userdata/UserEvent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "requestReservation", "Lcom/google/samples/apps/iosched/shared/domain/users/ReservationRequestAction;", "session", "Lcom/google/samples/apps/iosched/model/Session;", "action", "(Ljava/lang/String;Lcom/google/samples/apps/iosched/model/Session;Lcom/google/samples/apps/iosched/shared/domain/users/ReservationRequestAction;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "starEvent", "Lcom/google/samples/apps/iosched/shared/domain/users/StarUpdatedStatus;", "swapReservation", "Lcom/google/samples/apps/iosched/shared/domain/users/SwapRequestAction;", "fromSession", "toSession", "(Ljava/lang/String;Lcom/google/samples/apps/iosched/model/Session;Lcom/google/samples/apps/iosched/model/Session;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "shared_staging"})
public abstract interface UserEventDataSource {
    
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<com.google.samples.apps.iosched.shared.data.userevent.UserEventsResult> getObservableUserEvents(@org.jetbrains.annotations.NotNull()
    java.lang.String userId);
    
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<com.google.samples.apps.iosched.shared.data.userevent.UserEventResult> getObservableUserEvent(@org.jetbrains.annotations.NotNull()
    java.lang.String userId, @org.jetbrains.annotations.NotNull()
    java.lang.String eventId);
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<com.google.samples.apps.iosched.model.userdata.UserEvent> getUserEvents(@org.jetbrains.annotations.NotNull()
    java.lang.String userId);
    
    @org.jetbrains.annotations.Nullable()
    public abstract com.google.samples.apps.iosched.model.userdata.UserEvent getUserEvent(@org.jetbrains.annotations.NotNull()
    java.lang.String userId, @org.jetbrains.annotations.NotNull()
    java.lang.String eventId);
    
    /**
     * Toggle the isStarred status for an event.
     *
     * @param userId the userId ([FirebaseUser#uid]) of the current logged in user
     * @param userEvent the [UserEvent], which isStarred is going to be the updated status
     * @return the LiveData that represents the status of the star operation.
     */
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
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object requestReservation(@org.jetbrains.annotations.NotNull()
    java.lang.String userId, @org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.model.Session session, @org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.shared.domain.users.ReservationRequestAction action, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.google.samples.apps.iosched.shared.result.Result<? extends com.google.samples.apps.iosched.shared.domain.users.ReservationRequestAction>> p3);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object swapReservation(@org.jetbrains.annotations.NotNull()
    java.lang.String userId, @org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.model.Session fromSession, @org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.model.Session toSession, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.google.samples.apps.iosched.shared.result.Result<com.google.samples.apps.iosched.shared.domain.users.SwapRequestAction>> p3);
    
    public abstract void clearSingleEventSubscriptions();
}