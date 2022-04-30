package com.google.samples.apps.iosched.shared.domain.search;

import java.lang.System;

/**
 * Searches sessions by simple string comparison against title and description.
 */
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J-\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0007\u001a\u00020\bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\t\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\n"}, d2 = {"Lcom/google/samples/apps/iosched/shared/domain/search/SimpleMatchStrategy;", "Lcom/google/samples/apps/iosched/shared/domain/search/SessionTextMatchStrategy;", "()V", "searchSessions", "", "Lcom/google/samples/apps/iosched/model/userdata/UserSession;", "userSessions", "query", "", "(Ljava/util/List;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "shared_staging"})
public final class SimpleMatchStrategy implements com.google.samples.apps.iosched.shared.domain.search.SessionTextMatchStrategy {
    public static final com.google.samples.apps.iosched.shared.domain.search.SimpleMatchStrategy INSTANCE = null;
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object searchSessions(@org.jetbrains.annotations.NotNull()
    java.util.List<com.google.samples.apps.iosched.model.userdata.UserSession> userSessions, @org.jetbrains.annotations.NotNull()
    java.lang.String query, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.google.samples.apps.iosched.model.userdata.UserSession>> p2) {
        return null;
    }
    
    private SimpleMatchStrategy() {
        super();
    }
}