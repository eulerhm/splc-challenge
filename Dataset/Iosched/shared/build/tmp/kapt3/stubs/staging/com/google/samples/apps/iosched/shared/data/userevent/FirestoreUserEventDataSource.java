package com.google.samples.apps.iosched.shared.data.userevent;

import java.lang.System;

/**
 * The data source for user data stored in firestore. It observes user data and also updates
 * stars and reservations.
 */
@kotlinx.coroutines.ExperimentalCoroutinesApi()
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 +2\u00020\u0001:\u0001+B\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010\t\u001a\u00020\nH\u0016J\"\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\u000f2\n\u0010\u0010\u001a\u00060\u000fj\u0002`\u0011H\u0016J\u0016\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J\u0010\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J\u001e\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u000e\u001a\u00020\u000f2\n\u0010\u0010\u001a\u00060\u000fj\u0002`\u0011H\u0016J\u0016\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u001b2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\'\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\n0\u001d2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u001e\u001a\u00020\u0019H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001fJ/\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00160\u001d2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010!\u001a\u00020\"2\u0006\u0010\u0015\u001a\u00020\u0016H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010#J\'\u0010$\u001a\b\u0012\u0004\u0012\u00020%0\u001d2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u001e\u001a\u00020\u0019H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001fJ/\u0010&\u001a\b\u0012\u0004\u0012\u00020\'0\u001d2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010(\u001a\u00020\"2\u0006\u0010)\u001a\u00020\"H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010*R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006,"}, d2 = {"Lcom/google/samples/apps/iosched/shared/data/userevent/FirestoreUserEventDataSource;", "Lcom/google/samples/apps/iosched/shared/data/userevent/UserEventDataSource;", "firestore", "Lcom/google/firebase/firestore/FirebaseFirestore;", "ioDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "(Lcom/google/firebase/firestore/FirebaseFirestore;Lkotlinx/coroutines/CoroutineDispatcher;)V", "getFirestore", "()Lcom/google/firebase/firestore/FirebaseFirestore;", "clearSingleEventSubscriptions", "", "getObservableUserEvent", "Lkotlinx/coroutines/flow/Flow;", "Lcom/google/samples/apps/iosched/shared/data/userevent/UserEventResult;", "userId", "", "eventId", "Lcom/google/samples/apps/iosched/model/SessionId;", "getObservableUserEvents", "Lcom/google/samples/apps/iosched/shared/data/userevent/UserEventsResult;", "getReservationRequestedEventAction", "action", "Lcom/google/samples/apps/iosched/shared/domain/users/ReservationRequestAction;", "getReservationRequestedQueueAction", "getUserEvent", "Lcom/google/samples/apps/iosched/model/userdata/UserEvent;", "getUserEvents", "", "recordFeedbackSent", "Lcom/google/samples/apps/iosched/shared/result/Result;", "userEvent", "(Ljava/lang/String;Lcom/google/samples/apps/iosched/model/userdata/UserEvent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "requestReservation", "session", "Lcom/google/samples/apps/iosched/model/Session;", "(Ljava/lang/String;Lcom/google/samples/apps/iosched/model/Session;Lcom/google/samples/apps/iosched/shared/domain/users/ReservationRequestAction;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "starEvent", "Lcom/google/samples/apps/iosched/shared/domain/users/StarUpdatedStatus;", "swapReservation", "Lcom/google/samples/apps/iosched/shared/domain/users/SwapRequestAction;", "fromSession", "toSession", "(Ljava/lang/String;Lcom/google/samples/apps/iosched/model/Session;Lcom/google/samples/apps/iosched/model/Session;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "shared_staging"})
public final class FirestoreUserEventDataSource implements com.google.samples.apps.iosched.shared.data.userevent.UserEventDataSource {
    @org.jetbrains.annotations.NotNull()
    private final com.google.firebase.firestore.FirebaseFirestore firestore = null;
    private final kotlinx.coroutines.CoroutineDispatcher ioDispatcher = null;
    
    /**
     * Firestore constants.
     */
    private static final java.lang.String USERS_COLLECTION = "users";
    private static final java.lang.String EVENTS_COLLECTION = "events";
    private static final java.lang.String QUEUE_COLLECTION = "queue";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ID = "id";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String IS_STARRED = "isStarred";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String REVIEWED = "reviewed";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String RESERVATION_REQUEST_KEY = "reservationRequest";
    private static final java.lang.String RESERVE_REQ_ACTION = "RESERVE_REQUESTED";
    private static final java.lang.String RESERVE_CANCEL_ACTION = "CANCEL_REQUESTED";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String RESERVATION_REQUEST_ACTION_KEY = "action";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String RESERVATION_REQUEST_REQUEST_ID_KEY = "requestId";
    private static final java.lang.String RESERVATION_REQUEST_TIMESTAMP_KEY = "timestamp";
    private static final java.lang.String REQUEST_QUEUE_ACTION_KEY = "action";
    private static final java.lang.String REQUEST_QUEUE_SESSION_KEY = "sessionId";
    private static final java.lang.String REQUEST_QUEUE_REQUEST_ID_KEY = "requestId";
    private static final java.lang.String REQUEST_QUEUE_ACTION_RESERVE = "RESERVE";
    private static final java.lang.String REQUEST_QUEUE_ACTION_CANCEL = "CANCEL";
    private static final java.lang.String REQUEST_QUEUE_ACTION_SWAP = "SWAP";
    private static final java.lang.String SWAP_QUEUE_RESERVE_SESSION_ID_KEY = "reserveSessionId";
    private static final java.lang.String SWAP_QUEUE_CANCEL_SESSION_ID_KEY = "cancelSessionId";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String RESERVATION_RESULT_KEY = "reservationResult";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String RESERVATION_RESULT_TIME_KEY = "timestamp";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String RESERVATION_RESULT_RESULT_KEY = "requestResult";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String RESERVATION_RESULT_REQ_ID_KEY = "requestId";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String RESERVATION_STATUS_KEY = "reservationStatus";
    public static final com.google.samples.apps.iosched.shared.data.userevent.FirestoreUserEventDataSource.Companion Companion = null;
    
    /**
     * Asynchronous method to get the user events.
     *
     * This method generates important messages to the user if a reservation is confirmed or
     * waitlisted.
     */
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
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<com.google.samples.apps.iosched.model.userdata.UserEvent> getUserEvents(@org.jetbrains.annotations.NotNull()
    java.lang.String userId) {
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
    
    /**
     * Stars or unstars an event.
     *
     * @returns a result via as a [Result].
     */
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object starEvent(@org.jetbrains.annotations.NotNull()
    java.lang.String userId, @org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.model.userdata.UserEvent userEvent, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.google.samples.apps.iosched.shared.result.Result<? extends com.google.samples.apps.iosched.shared.domain.users.StarUpdatedStatus>> p2) {
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
    
    /**
     * Requests a reservation for an event.
     *
     * This method makes two write operations at once.
     *
     * @return a LiveData indicating whether the request was successful (not whether the event
     * was reserved)
     */
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object requestReservation(@org.jetbrains.annotations.NotNull()
    java.lang.String userId, @org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.model.Session session, @org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.shared.domain.users.ReservationRequestAction action, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.google.samples.apps.iosched.shared.result.Result<? extends com.google.samples.apps.iosched.shared.domain.users.ReservationRequestAction>> p3) {
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
    
    private final java.lang.String getReservationRequestedEventAction(com.google.samples.apps.iosched.shared.domain.users.ReservationRequestAction action) {
        return null;
    }
    
    private final java.lang.String getReservationRequestedQueueAction(com.google.samples.apps.iosched.shared.domain.users.ReservationRequestAction action) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.google.firebase.firestore.FirebaseFirestore getFirestore() {
        return null;
    }
    
    @javax.inject.Inject()
    public FirestoreUserEventDataSource(@org.jetbrains.annotations.NotNull()
    com.google.firebase.firestore.FirebaseFirestore firestore, @org.jetbrains.annotations.NotNull()
    @com.google.samples.apps.iosched.shared.di.IoDispatcher()
    kotlinx.coroutines.CoroutineDispatcher ioDispatcher) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0019\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0080T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0080T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0080T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0080T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0080T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004X\u0080T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0004X\u0080T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0004X\u0080T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0004X\u0080T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0004X\u0080T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0004X\u0080T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001d"}, d2 = {"Lcom/google/samples/apps/iosched/shared/data/userevent/FirestoreUserEventDataSource$Companion;", "", "()V", "EVENTS_COLLECTION", "", "ID", "IS_STARRED", "QUEUE_COLLECTION", "REQUEST_QUEUE_ACTION_CANCEL", "REQUEST_QUEUE_ACTION_KEY", "REQUEST_QUEUE_ACTION_RESERVE", "REQUEST_QUEUE_ACTION_SWAP", "REQUEST_QUEUE_REQUEST_ID_KEY", "REQUEST_QUEUE_SESSION_KEY", "RESERVATION_REQUEST_ACTION_KEY", "RESERVATION_REQUEST_KEY", "RESERVATION_REQUEST_REQUEST_ID_KEY", "RESERVATION_REQUEST_TIMESTAMP_KEY", "RESERVATION_RESULT_KEY", "RESERVATION_RESULT_REQ_ID_KEY", "RESERVATION_RESULT_RESULT_KEY", "RESERVATION_RESULT_TIME_KEY", "RESERVATION_STATUS_KEY", "RESERVE_CANCEL_ACTION", "RESERVE_REQ_ACTION", "REVIEWED", "SWAP_QUEUE_CANCEL_SESSION_ID_KEY", "SWAP_QUEUE_RESERVE_SESSION_ID_KEY", "USERS_COLLECTION", "shared_staging"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}