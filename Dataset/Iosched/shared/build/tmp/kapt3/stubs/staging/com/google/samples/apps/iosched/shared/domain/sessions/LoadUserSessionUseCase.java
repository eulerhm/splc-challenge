package com.google.samples.apps.iosched.shared.domain.sessions;

import java.lang.System;

@kotlinx.coroutines.ExperimentalCoroutinesApi()
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0017\u0018\u00002 \u0012\u0016\u0012\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\b\u0012\u00060\u0003j\u0002`\u00040\u0002\u0012\u0004\u0012\u00020\u00050\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0001\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ.\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\r0\f2\u0018\u0010\u000e\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\b\u0012\u00060\u0003j\u0002`\u00040\u0002H\u0014R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lcom/google/samples/apps/iosched/shared/domain/sessions/LoadUserSessionUseCase;", "Lcom/google/samples/apps/iosched/shared/domain/FlowUseCase;", "Lkotlin/Pair;", "", "Lcom/google/samples/apps/iosched/model/SessionId;", "Lcom/google/samples/apps/iosched/shared/domain/sessions/LoadUserSessionUseCaseResult;", "userEventRepository", "Lcom/google/samples/apps/iosched/shared/data/userevent/DefaultSessionAndUserEventRepository;", "ioDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "(Lcom/google/samples/apps/iosched/shared/data/userevent/DefaultSessionAndUserEventRepository;Lkotlinx/coroutines/CoroutineDispatcher;)V", "execute", "Lkotlinx/coroutines/flow/Flow;", "Lcom/google/samples/apps/iosched/shared/result/Result;", "parameters", "shared_staging"})
public class LoadUserSessionUseCase extends com.google.samples.apps.iosched.shared.domain.FlowUseCase<kotlin.Pair<? extends java.lang.String, ? extends java.lang.String>, com.google.samples.apps.iosched.shared.domain.sessions.LoadUserSessionUseCaseResult> {
    private final com.google.samples.apps.iosched.shared.data.userevent.DefaultSessionAndUserEventRepository userEventRepository = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    protected kotlinx.coroutines.flow.Flow<com.google.samples.apps.iosched.shared.result.Result<com.google.samples.apps.iosched.shared.domain.sessions.LoadUserSessionUseCaseResult>> execute(@org.jetbrains.annotations.NotNull()
    kotlin.Pair<java.lang.String, java.lang.String> parameters) {
        return null;
    }
    
    @javax.inject.Inject()
    public LoadUserSessionUseCase(@org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.shared.data.userevent.DefaultSessionAndUserEventRepository userEventRepository, @org.jetbrains.annotations.NotNull()
    @com.google.samples.apps.iosched.shared.di.IoDispatcher()
    kotlinx.coroutines.CoroutineDispatcher ioDispatcher) {
        super(null);
    }
}