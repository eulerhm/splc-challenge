package com.google.samples.apps.iosched.shared.data.signin.datasources;

import java.lang.System;

/**
 * An [AuthStateUserDataSource] that listens to changes in [FirebaseAuth].
 *
 * When a [FirebaseUser] is available, it
 * * Posts it to the user observable
 * * Fetches the ID token
 * * Uses the ID token to trigger the registration point
 * * Stores the FCM ID Token in Firestore
 * * Posts the user ID to the observable
 *
 * This data source doesn't find if a user is registered or not (is an attendee). Once the
 * registration point is called, the server will generate a field in the user document, which
 * is observed by [RegisteredUserDataSource] in its implementation
 * [FirestoreRegisteredUserDataSource].
 */
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B)\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0001\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u0016\u0010\u000f\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u00110\u0010H\u0016J!\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u00112\u0006\u0010\u0014\u001a\u00020\u0003H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0015R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0016"}, d2 = {"Lcom/google/samples/apps/iosched/shared/data/signin/datasources/FirebaseAuthStateUserDataSource;", "Lcom/google/samples/apps/iosched/shared/data/signin/datasources/AuthStateUserDataSource;", "firebase", "Lcom/google/firebase/auth/FirebaseAuth;", "tokenUpdater", "Lcom/google/samples/apps/iosched/shared/fcm/FcmTokenUpdater;", "notificationAlarmUpdater", "Lcom/google/samples/apps/iosched/shared/domain/sessions/NotificationAlarmUpdater;", "ioDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "(Lcom/google/firebase/auth/FirebaseAuth;Lcom/google/samples/apps/iosched/shared/fcm/FcmTokenUpdater;Lcom/google/samples/apps/iosched/shared/domain/sessions/NotificationAlarmUpdater;Lkotlinx/coroutines/CoroutineDispatcher;)V", "getFirebase", "()Lcom/google/firebase/auth/FirebaseAuth;", "lastUid", "", "getBasicUserInfo", "Lkotlinx/coroutines/flow/Flow;", "Lcom/google/samples/apps/iosched/shared/result/Result;", "Lcom/google/samples/apps/iosched/shared/data/signin/AuthenticatedUserInfoBasic;", "processAuthState", "auth", "(Lcom/google/firebase/auth/FirebaseAuth;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "shared_staging"})
public final class FirebaseAuthStateUserDataSource implements com.google.samples.apps.iosched.shared.data.signin.datasources.AuthStateUserDataSource {
    private volatile java.lang.String lastUid;
    @org.jetbrains.annotations.NotNull()
    private final com.google.firebase.auth.FirebaseAuth firebase = null;
    private final com.google.samples.apps.iosched.shared.fcm.FcmTokenUpdater tokenUpdater = null;
    private final com.google.samples.apps.iosched.shared.domain.sessions.NotificationAlarmUpdater notificationAlarmUpdater = null;
    private final kotlinx.coroutines.CoroutineDispatcher ioDispatcher = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public kotlinx.coroutines.flow.Flow<com.google.samples.apps.iosched.shared.result.Result<com.google.samples.apps.iosched.shared.data.signin.AuthenticatedUserInfoBasic>> getBasicUserInfo() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.google.firebase.auth.FirebaseAuth getFirebase() {
        return null;
    }
    
    @javax.inject.Inject()
    public FirebaseAuthStateUserDataSource(@org.jetbrains.annotations.NotNull()
    com.google.firebase.auth.FirebaseAuth firebase, @org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.shared.fcm.FcmTokenUpdater tokenUpdater, @org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.shared.domain.sessions.NotificationAlarmUpdater notificationAlarmUpdater, @org.jetbrains.annotations.NotNull()
    @com.google.samples.apps.iosched.shared.di.IoDispatcher()
    kotlinx.coroutines.CoroutineDispatcher ioDispatcher) {
        super();
    }
}