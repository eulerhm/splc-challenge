package com.google.samples.apps.iosched.shared.data.userevent;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 2, d1 = {"\u0000.\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\"\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u0007\u001a\u001a\u0010\u0007\u001a\u0004\u0018\u00010\u00012\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u001a \u0010\f\u001a\u0004\u0018\u00010\u00012\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0006\u00a8\u0006\u0010"}, d2 = {"compareOldAndNewUserEvents", "Lcom/google/samples/apps/iosched/shared/data/userevent/UserEventMessage;", "oldState", "Lcom/google/samples/apps/iosched/model/userdata/UserEvent;", "newState", "changedId", "", "generateReservationChangeMsg", "snapshot", "Lcom/google/firebase/firestore/QuerySnapshot;", "oldValue", "Lcom/google/samples/apps/iosched/shared/data/userevent/UserEventsResult;", "getUserMessageFromChange", "documentSnapshot", "Lcom/google/firebase/firestore/DocumentSnapshot;", "changeId", "shared_staging"})
public final class UserEventsMessageGeneratorKt {
    
    /**
     * Go through all the changes and generate user messages in case there are reservation changes.
     */
    @org.jetbrains.annotations.Nullable()
    public static final com.google.samples.apps.iosched.shared.data.userevent.UserEventMessage generateReservationChangeMsg(@org.jetbrains.annotations.NotNull()
    com.google.firebase.firestore.QuerySnapshot snapshot, @org.jetbrains.annotations.Nullable()
    com.google.samples.apps.iosched.shared.data.userevent.UserEventsResult oldValue) {
        return null;
    }
    
    /**
     * Given a change in a document, generate a user message to indicate a change in reservations.
     */
    @org.jetbrains.annotations.Nullable()
    public static final com.google.samples.apps.iosched.shared.data.userevent.UserEventMessage getUserMessageFromChange(@org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.model.userdata.UserEvent oldValue, @org.jetbrains.annotations.NotNull()
    com.google.firebase.firestore.DocumentSnapshot documentSnapshot, @org.jetbrains.annotations.NotNull()
    java.lang.String changeId) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @androidx.annotation.VisibleForTesting()
    public static final com.google.samples.apps.iosched.shared.data.userevent.UserEventMessage compareOldAndNewUserEvents(@org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.model.userdata.UserEvent oldState, @org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.model.userdata.UserEvent newState, @org.jetbrains.annotations.NotNull()
    java.lang.String changedId) {
        return null;
    }
}