package com.google.samples.apps.iosched.shared.domain.sessions;

import java.lang.System;

/**
 * A [UseCase] that returns the [UserSession]s for a user.
 */
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u001e\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0003\u0012\b\u0012\u00060\u0003j\u0002`\u00040\u0002\u0012\u0004\u0012\u00020\u00050\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0001\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ)\u0010\u000b\u001a\u00020\u00052\u0016\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\b\u0012\u00060\u0003j\u0002`\u00040\u0002H\u0094@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\rR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000e"}, d2 = {"Lcom/google/samples/apps/iosched/shared/domain/sessions/LoadUserSessionOneShotUseCase;", "Lcom/google/samples/apps/iosched/shared/domain/UseCase;", "Lkotlin/Pair;", "", "Lcom/google/samples/apps/iosched/model/SessionId;", "Lcom/google/samples/apps/iosched/model/userdata/UserSession;", "userEventRepository", "Lcom/google/samples/apps/iosched/shared/data/userevent/DefaultSessionAndUserEventRepository;", "dispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "(Lcom/google/samples/apps/iosched/shared/data/userevent/DefaultSessionAndUserEventRepository;Lkotlinx/coroutines/CoroutineDispatcher;)V", "execute", "parameters", "(Lkotlin/Pair;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "shared_staging"})
public final class LoadUserSessionOneShotUseCase extends com.google.samples.apps.iosched.shared.domain.UseCase<kotlin.Pair<? extends java.lang.String, ? extends java.lang.String>, com.google.samples.apps.iosched.model.userdata.UserSession> {
    private final com.google.samples.apps.iosched.shared.data.userevent.DefaultSessionAndUserEventRepository userEventRepository = null;
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    protected java.lang.Object execute(@org.jetbrains.annotations.NotNull()
    kotlin.Pair<java.lang.String, java.lang.String> parameters, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.google.samples.apps.iosched.model.userdata.UserSession> p1) {
        return null;
    }
    
    @javax.inject.Inject()
    public LoadUserSessionOneShotUseCase(@org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.shared.data.userevent.DefaultSessionAndUserEventRepository userEventRepository, @org.jetbrains.annotations.NotNull()
    @com.google.samples.apps.iosched.shared.di.IoDispatcher()
    kotlinx.coroutines.CoroutineDispatcher dispatcher) {
        super(null);
    }
}