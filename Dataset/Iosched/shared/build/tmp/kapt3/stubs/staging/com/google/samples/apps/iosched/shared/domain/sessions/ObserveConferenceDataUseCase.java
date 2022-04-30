package com.google.samples.apps.iosched.shared.domain.sessions;

import java.lang.System;

/**
 * Forces a refresh in the conference data repository.
 */
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ!\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u000b0\n2\u0006\u0010\f\u001a\u00020\u0002H\u0014\u00a2\u0006\u0002\u0010\rR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lcom/google/samples/apps/iosched/shared/domain/sessions/ObserveConferenceDataUseCase;", "Lcom/google/samples/apps/iosched/shared/domain/FlowUseCase;", "", "", "repository", "Lcom/google/samples/apps/iosched/shared/data/ConferenceDataRepository;", "dispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "(Lcom/google/samples/apps/iosched/shared/data/ConferenceDataRepository;Lkotlinx/coroutines/CoroutineDispatcher;)V", "execute", "Lkotlinx/coroutines/flow/Flow;", "Lcom/google/samples/apps/iosched/shared/result/Result;", "parameters", "(Lkotlin/Unit;)Lkotlinx/coroutines/flow/Flow;", "shared_staging"})
public class ObserveConferenceDataUseCase extends com.google.samples.apps.iosched.shared.domain.FlowUseCase<kotlin.Unit, java.lang.Long> {
    private final com.google.samples.apps.iosched.shared.data.ConferenceDataRepository repository = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    protected kotlinx.coroutines.flow.Flow<com.google.samples.apps.iosched.shared.result.Result<java.lang.Long>> execute(@org.jetbrains.annotations.NotNull()
    kotlin.Unit parameters) {
        return null;
    }
    
    @javax.inject.Inject()
    public ObserveConferenceDataUseCase(@org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.shared.data.ConferenceDataRepository repository, @org.jetbrains.annotations.NotNull()
    @com.google.samples.apps.iosched.shared.di.IoDispatcher()
    kotlinx.coroutines.CoroutineDispatcher dispatcher) {
        super(null);
    }
}