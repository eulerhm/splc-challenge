package com.google.samples.apps.iosched.shared.domain.search;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0001B!\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\b\u0001\u0010\t\u001a\u00020\n\u00a2\u0006\u0002\u0010\u000bJ\"\u0010\f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u000e0\r2\u0006\u0010\u000f\u001a\u00020\u0002H\u0014R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lcom/google/samples/apps/iosched/shared/domain/search/SessionSearchUseCase;", "Lcom/google/samples/apps/iosched/shared/domain/FlowUseCase;", "Lcom/google/samples/apps/iosched/shared/domain/search/SessionSearchUseCaseParams;", "", "Lcom/google/samples/apps/iosched/model/userdata/UserSession;", "repository", "Lcom/google/samples/apps/iosched/shared/data/userevent/SessionAndUserEventRepository;", "textMatchStrategy", "Lcom/google/samples/apps/iosched/shared/domain/search/SessionTextMatchStrategy;", "dispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "(Lcom/google/samples/apps/iosched/shared/data/userevent/SessionAndUserEventRepository;Lcom/google/samples/apps/iosched/shared/domain/search/SessionTextMatchStrategy;Lkotlinx/coroutines/CoroutineDispatcher;)V", "execute", "Lkotlinx/coroutines/flow/Flow;", "Lcom/google/samples/apps/iosched/shared/result/Result;", "parameters", "shared_staging"})
public final class SessionSearchUseCase extends com.google.samples.apps.iosched.shared.domain.FlowUseCase<com.google.samples.apps.iosched.shared.domain.search.SessionSearchUseCaseParams, java.util.List<? extends com.google.samples.apps.iosched.model.userdata.UserSession>> {
    private final com.google.samples.apps.iosched.shared.data.userevent.SessionAndUserEventRepository repository = null;
    private final com.google.samples.apps.iosched.shared.domain.search.SessionTextMatchStrategy textMatchStrategy = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    protected kotlinx.coroutines.flow.Flow<com.google.samples.apps.iosched.shared.result.Result<java.util.List<com.google.samples.apps.iosched.model.userdata.UserSession>>> execute(@org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.shared.domain.search.SessionSearchUseCaseParams parameters) {
        return null;
    }
    
    @javax.inject.Inject()
    public SessionSearchUseCase(@org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.shared.data.userevent.SessionAndUserEventRepository repository, @org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.shared.domain.search.SessionTextMatchStrategy textMatchStrategy, @org.jetbrains.annotations.NotNull()
    @com.google.samples.apps.iosched.shared.di.IoDispatcher()
    kotlinx.coroutines.CoroutineDispatcher dispatcher) {
        super(null);
    }
}