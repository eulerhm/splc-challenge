package com.google.samples.apps.iosched.shared.domain.sessions;

import java.lang.System;

/**
 * Load a list of pinned (starred or reserved) [UserSession]s for a given user as a json format.
 *
 * Example JSON is structured as
 *
 * { schedule : [
 *  {
 *    "name": "session1",
 *    "location": "Room 1",
 *    "day": "5/07",
 *    "time": "13:30",
 *    "timestamp": 82547983,
 *    "description": "Session description1"
 *  },
 *  {
 *    "name": "session2",
 *    "location": "Room 2",
 *    "day": "5/08",
 *    "time": "13:30",
 *    "timestamp": 19238489,
 *    "description": "Session description2"
 *  }, .....
 *  ]
 * }
 */
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0001\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ\u001c\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\f0\u000b2\u0006\u0010\r\u001a\u00020\u0002H\u0014R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lcom/google/samples/apps/iosched/shared/domain/sessions/LoadPinnedSessionsJsonUseCase;", "Lcom/google/samples/apps/iosched/shared/domain/FlowUseCase;", "", "userEventRepository", "Lcom/google/samples/apps/iosched/shared/data/userevent/DefaultSessionAndUserEventRepository;", "gson", "Lcom/google/gson/Gson;", "ioDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "(Lcom/google/samples/apps/iosched/shared/data/userevent/DefaultSessionAndUserEventRepository;Lcom/google/gson/Gson;Lkotlinx/coroutines/CoroutineDispatcher;)V", "execute", "Lkotlinx/coroutines/flow/Flow;", "Lcom/google/samples/apps/iosched/shared/result/Result;", "parameters", "shared_staging"})
public class LoadPinnedSessionsJsonUseCase extends com.google.samples.apps.iosched.shared.domain.FlowUseCase<java.lang.String, java.lang.String> {
    private final com.google.samples.apps.iosched.shared.data.userevent.DefaultSessionAndUserEventRepository userEventRepository = null;
    private final com.google.gson.Gson gson = null;
    private final kotlinx.coroutines.CoroutineDispatcher ioDispatcher = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    protected kotlinx.coroutines.flow.Flow<com.google.samples.apps.iosched.shared.result.Result<java.lang.String>> execute(@org.jetbrains.annotations.NotNull()
    java.lang.String parameters) {
        return null;
    }
    
    @javax.inject.Inject()
    public LoadPinnedSessionsJsonUseCase(@org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.shared.data.userevent.DefaultSessionAndUserEventRepository userEventRepository, @org.jetbrains.annotations.NotNull()
    com.google.gson.Gson gson, @org.jetbrains.annotations.NotNull()
    @com.google.samples.apps.iosched.shared.di.IoDispatcher()
    kotlinx.coroutines.CoroutineDispatcher ioDispatcher) {
        super(null);
    }
}