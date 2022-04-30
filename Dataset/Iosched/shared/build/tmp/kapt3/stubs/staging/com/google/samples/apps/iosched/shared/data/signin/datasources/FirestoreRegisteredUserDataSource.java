package com.google.samples.apps.iosched.shared.data.signin.datasources;

import java.lang.System;

/**
 * A [RegisteredUserDataSource] that listens to changes in firestore to indicate whether the
 * current user is registered in the event or not as an attendee.
 */
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001e\u0010\u0007\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\t0\b2\u0006\u0010\u000b\u001a\u00020\fH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u000e"}, d2 = {"Lcom/google/samples/apps/iosched/shared/data/signin/datasources/FirestoreRegisteredUserDataSource;", "Lcom/google/samples/apps/iosched/shared/data/signin/datasources/RegisteredUserDataSource;", "firestore", "Lcom/google/firebase/firestore/FirebaseFirestore;", "(Lcom/google/firebase/firestore/FirebaseFirestore;)V", "getFirestore", "()Lcom/google/firebase/firestore/FirebaseFirestore;", "observeUserChanges", "Lkotlinx/coroutines/flow/Flow;", "Lcom/google/samples/apps/iosched/shared/result/Result;", "", "userId", "", "Companion", "shared_staging"})
public final class FirestoreRegisteredUserDataSource implements com.google.samples.apps.iosched.shared.data.signin.datasources.RegisteredUserDataSource {
    @org.jetbrains.annotations.NotNull()
    private final com.google.firebase.firestore.FirebaseFirestore firestore = null;
    private static final java.lang.String USERS_COLLECTION = "users";
    private static final java.lang.String REGISTERED_KEY = "registered";
    public static final com.google.samples.apps.iosched.shared.data.signin.datasources.FirestoreRegisteredUserDataSource.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public kotlinx.coroutines.flow.Flow<com.google.samples.apps.iosched.shared.result.Result<java.lang.Boolean>> observeUserChanges(@org.jetbrains.annotations.NotNull()
    java.lang.String userId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.google.firebase.firestore.FirebaseFirestore getFirestore() {
        return null;
    }
    
    @javax.inject.Inject()
    public FirestoreRegisteredUserDataSource(@org.jetbrains.annotations.NotNull()
    com.google.firebase.firestore.FirebaseFirestore firestore) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/google/samples/apps/iosched/shared/data/signin/datasources/FirestoreRegisteredUserDataSource$Companion;", "", "()V", "REGISTERED_KEY", "", "USERS_COLLECTION", "shared_staging"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}