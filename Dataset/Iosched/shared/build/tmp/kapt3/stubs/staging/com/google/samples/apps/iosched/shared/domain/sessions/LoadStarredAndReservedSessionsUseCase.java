package com.google.samples.apps.iosched.shared.domain.sessions;

import java.lang.System;

/**
 * Load starred and reserved [UserSession]s for a given user.
 */
@kotlinx.coroutines.ExperimentalCoroutinesApi()
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0001\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ$\u0010\n\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\f0\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u0002H\u0014R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lcom/google/samples/apps/iosched/shared/domain/sessions/LoadStarredAndReservedSessionsUseCase;", "Lcom/google/samples/apps/iosched/shared/domain/FlowUseCase;", "", "", "Lcom/google/samples/apps/iosched/model/userdata/UserSession;", "userEventRepository", "Lcom/google/samples/apps/iosched/shared/data/userevent/DefaultSessionAndUserEventRepository;", "dispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "(Lcom/google/samples/apps/iosched/shared/data/userevent/DefaultSessionAndUserEventRepository;Lkotlinx/coroutines/CoroutineDispatcher;)V", "execute", "Lkotlinx/coroutines/flow/Flow;", "Lcom/google/samples/apps/iosched/shared/result/Result;", "parameters", "shared_staging"})
public final class LoadStarredAndReservedSessionsUseCase extends com.google.samples.apps.iosched.shared.domain.FlowUseCase<java.lang.String, java.util.List<? extends com.google.samples.apps.iosched.model.userdata.UserSession>> {
    private final com.google.samples.apps.iosched.shared.data.userevent.DefaultSessionAndUserEventRepository userEventRepository = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    protected kotlinx.coroutines.flow.Flow<com.google.samples.apps.iosched.shared.result.Result<java.util.List<com.google.samples.apps.iosched.model.userdata.UserSession>>> execute(@org.jetbrains.annotations.Nullable()
    java.lang.String parameters) {
        return null;
    }
    
    @javax.inject.Inject()
    public LoadStarredAndReservedSessionsUseCase(@org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.shared.data.userevent.DefaultSessionAndUserEventRepository userEventRepository, @org.jetbrains.annotations.NotNull()
    @com.google.samples.apps.iosched.shared.di.IoDispatcher()
    kotlinx.coroutines.CoroutineDispatcher dispatcher) {
        super(null);
    }
}