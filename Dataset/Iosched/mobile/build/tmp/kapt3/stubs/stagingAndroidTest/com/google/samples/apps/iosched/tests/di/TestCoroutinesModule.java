package com.google.samples.apps.iosched.tests.di;

import java.lang.System;

@dagger.hilt.InstallIn(value = {dagger.hilt.android.components.ApplicationComponent.class})
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007J\b\u0010\u0005\u001a\u00020\u0004H\u0007J\b\u0010\u0006\u001a\u00020\u0004H\u0007J\b\u0010\u0007\u001a\u00020\u0004H\u0007\u00a8\u0006\b"}, d2 = {"Lcom/google/samples/apps/iosched/tests/di/TestCoroutinesModule;", "", "()V", "providesDefaultDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "providesIoDispatcher", "providesMainDispatcher", "providesMainImmediateDispatcher", "mobile_staging"})
@dagger.Module()
public final class TestCoroutinesModule {
    public static final com.google.samples.apps.iosched.tests.di.TestCoroutinesModule INSTANCE = null;
    
    @org.jetbrains.annotations.NotNull()
    @com.google.samples.apps.iosched.shared.di.DefaultDispatcher()
    @dagger.Provides()
    public final kotlinx.coroutines.CoroutineDispatcher providesDefaultDispatcher() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @com.google.samples.apps.iosched.shared.di.IoDispatcher()
    @dagger.Provides()
    public final kotlinx.coroutines.CoroutineDispatcher providesIoDispatcher() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @com.google.samples.apps.iosched.shared.di.MainDispatcher()
    @dagger.Provides()
    public final kotlinx.coroutines.CoroutineDispatcher providesMainDispatcher() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @com.google.samples.apps.iosched.shared.di.MainImmediateDispatcher()
    @dagger.Provides()
    public final kotlinx.coroutines.CoroutineDispatcher providesMainImmediateDispatcher() {
        return null;
    }
    
    private TestCoroutinesModule() {
        super();
    }
}