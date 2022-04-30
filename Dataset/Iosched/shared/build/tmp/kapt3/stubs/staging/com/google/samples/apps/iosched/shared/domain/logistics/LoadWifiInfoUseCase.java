package com.google.samples.apps.iosched.shared.domain.logistics;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0017\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0019\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0002H\u0094@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\f"}, d2 = {"Lcom/google/samples/apps/iosched/shared/domain/logistics/LoadWifiInfoUseCase;", "Lcom/google/samples/apps/iosched/shared/domain/UseCase;", "", "Lcom/google/samples/apps/iosched/model/ConferenceWifiInfo;", "appConfigDataSource", "Lcom/google/samples/apps/iosched/shared/data/config/AppConfigDataSource;", "dispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "(Lcom/google/samples/apps/iosched/shared/data/config/AppConfigDataSource;Lkotlinx/coroutines/CoroutineDispatcher;)V", "execute", "parameters", "(Lkotlin/Unit;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "shared_staging"})
@javax.inject.Singleton()
public class LoadWifiInfoUseCase extends com.google.samples.apps.iosched.shared.domain.UseCase<kotlin.Unit, com.google.samples.apps.iosched.model.ConferenceWifiInfo> {
    private final com.google.samples.apps.iosched.shared.data.config.AppConfigDataSource appConfigDataSource = null;
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    protected java.lang.Object execute(@org.jetbrains.annotations.NotNull()
    kotlin.Unit p0, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.google.samples.apps.iosched.model.ConferenceWifiInfo> p1) {
        return null;
    }
    
    @javax.inject.Inject()
    public LoadWifiInfoUseCase(@org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.shared.data.config.AppConfigDataSource appConfigDataSource, @org.jetbrains.annotations.NotNull()
    @com.google.samples.apps.iosched.shared.di.IoDispatcher()
    kotlinx.coroutines.CoroutineDispatcher dispatcher) {
        super(null);
    }
}