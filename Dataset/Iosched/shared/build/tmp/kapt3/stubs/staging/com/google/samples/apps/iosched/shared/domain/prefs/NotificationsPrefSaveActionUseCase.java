package com.google.samples.apps.iosched.shared.domain.prefs;

import java.lang.System;

/**
 * Records the user preference if the user wants to receive notifications from iosched.
 */
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\u0019\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0002H\u0094@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000b"}, d2 = {"Lcom/google/samples/apps/iosched/shared/domain/prefs/NotificationsPrefSaveActionUseCase;", "Lcom/google/samples/apps/iosched/shared/domain/UseCase;", "", "preferenceStorage", "Lcom/google/samples/apps/iosched/shared/data/prefs/PreferenceStorage;", "dispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "(Lcom/google/samples/apps/iosched/shared/data/prefs/PreferenceStorage;Lkotlinx/coroutines/CoroutineDispatcher;)V", "execute", "parameters", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "shared_staging"})
public class NotificationsPrefSaveActionUseCase extends com.google.samples.apps.iosched.shared.domain.UseCase<java.lang.Boolean, java.lang.Boolean> {
    private final com.google.samples.apps.iosched.shared.data.prefs.PreferenceStorage preferenceStorage = null;
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    protected java.lang.Object execute(boolean p0, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Boolean> p1) {
        return null;
    }
    
    @javax.inject.Inject()
    public NotificationsPrefSaveActionUseCase(@org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.shared.data.prefs.PreferenceStorage preferenceStorage, @org.jetbrains.annotations.NotNull()
    @com.google.samples.apps.iosched.shared.di.IoDispatcher()
    kotlinx.coroutines.CoroutineDispatcher dispatcher) {
        super(null);
    }
}