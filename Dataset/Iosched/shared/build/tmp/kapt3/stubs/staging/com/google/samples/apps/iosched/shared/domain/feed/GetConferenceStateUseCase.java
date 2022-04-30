package com.google.samples.apps.iosched.shared.domain.feed;

import java.lang.System;

/**
 * Gets the current [ConferenceState].
 */
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\u0018\u00002\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0019\b\u0007\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ#\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\r0\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002H\u0014\u00a2\u0006\u0002\u0010\u000fJ\u0016\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u0011H\u0002J\u000e\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\fH\u0002R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lcom/google/samples/apps/iosched/shared/domain/feed/GetConferenceStateUseCase;", "Lcom/google/samples/apps/iosched/shared/domain/FlowUseCase;", "", "Lcom/google/samples/apps/iosched/shared/domain/feed/ConferenceState;", "mainDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "timeProvider", "Lcom/google/samples/apps/iosched/shared/time/TimeProvider;", "(Lkotlinx/coroutines/CoroutineDispatcher;Lcom/google/samples/apps/iosched/shared/time/TimeProvider;)V", "getMainDispatcher", "()Lkotlinx/coroutines/CoroutineDispatcher;", "execute", "Lkotlinx/coroutines/flow/Flow;", "Lcom/google/samples/apps/iosched/shared/result/Result;", "parameters", "(Lkotlin/Unit;)Lkotlinx/coroutines/flow/Flow;", "getNextStateWithDelay", "Lkotlin/Pair;", "", "moveToNextState", "shared_staging"})
public final class GetConferenceStateUseCase extends com.google.samples.apps.iosched.shared.domain.FlowUseCase<kotlin.Unit, com.google.samples.apps.iosched.shared.domain.feed.ConferenceState> {
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.CoroutineDispatcher mainDispatcher = null;
    private final com.google.samples.apps.iosched.shared.time.TimeProvider timeProvider = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    protected kotlinx.coroutines.flow.Flow<com.google.samples.apps.iosched.shared.result.Result<com.google.samples.apps.iosched.shared.domain.feed.ConferenceState>> execute(@org.jetbrains.annotations.Nullable()
    kotlin.Unit parameters) {
        return null;
    }
    
    private final kotlinx.coroutines.flow.Flow<com.google.samples.apps.iosched.shared.domain.feed.ConferenceState> moveToNextState() {
        return null;
    }
    
    private final kotlin.Pair<com.google.samples.apps.iosched.shared.domain.feed.ConferenceState, java.lang.Long> getNextStateWithDelay() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.CoroutineDispatcher getMainDispatcher() {
        return null;
    }
    
    @javax.inject.Inject()
    public GetConferenceStateUseCase(@org.jetbrains.annotations.NotNull()
    @com.google.samples.apps.iosched.shared.di.MainDispatcher()
    kotlinx.coroutines.CoroutineDispatcher mainDispatcher, @org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.shared.time.TimeProvider timeProvider) {
        super(null);
    }
}