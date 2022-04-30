package com.google.samples.apps.iosched.shared.domain.search;

import java.lang.System;

/**
 * Searches sessions using FTS.
 */
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J-\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\t\u001a\u00020\nH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\f"}, d2 = {"Lcom/google/samples/apps/iosched/shared/domain/search/FtsMatchStrategy;", "Lcom/google/samples/apps/iosched/shared/domain/search/SessionTextMatchStrategy;", "appDatabase", "Lcom/google/samples/apps/iosched/shared/data/db/AppDatabase;", "(Lcom/google/samples/apps/iosched/shared/data/db/AppDatabase;)V", "searchSessions", "", "Lcom/google/samples/apps/iosched/model/userdata/UserSession;", "userSessions", "query", "", "(Ljava/util/List;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "shared_staging"})
public final class FtsMatchStrategy implements com.google.samples.apps.iosched.shared.domain.search.SessionTextMatchStrategy {
    private final com.google.samples.apps.iosched.shared.data.db.AppDatabase appDatabase = null;
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object searchSessions(@org.jetbrains.annotations.NotNull()
    java.util.List<com.google.samples.apps.iosched.model.userdata.UserSession> userSessions, @org.jetbrains.annotations.NotNull()
    java.lang.String query, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.google.samples.apps.iosched.model.userdata.UserSession>> p2) {
        return null;
    }
    
    @javax.inject.Inject()
    public FtsMatchStrategy(@org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.shared.data.db.AppDatabase appDatabase) {
        super();
    }
}