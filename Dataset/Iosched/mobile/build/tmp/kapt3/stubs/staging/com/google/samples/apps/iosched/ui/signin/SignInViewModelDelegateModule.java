package com.google.samples.apps.iosched.ui.signin;

import java.lang.System;

@dagger.hilt.InstallIn(value = {dagger.hilt.android.components.ApplicationComponent.class})
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J6\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010\t\u001a\u00020\n2\b\b\u0001\u0010\u000b\u001a\u00020\n2\b\b\u0001\u0010\f\u001a\u00020\rH\u0007\u00a8\u0006\u000e"}, d2 = {"Lcom/google/samples/apps/iosched/ui/signin/SignInViewModelDelegateModule;", "", "()V", "provideSignInViewModelDelegate", "Lcom/google/samples/apps/iosched/ui/signin/SignInViewModelDelegate;", "dataSource", "Lcom/google/samples/apps/iosched/shared/domain/auth/ObserveUserAuthStateUseCase;", "notificationsPrefIsShownUseCase", "Lcom/google/samples/apps/iosched/shared/domain/prefs/NotificationsPrefIsShownUseCase;", "ioDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "mainDispatcher", "isReservationEnabledByRemoteConfig", "", "mobile_staging"})
@dagger.Module()
public final class SignInViewModelDelegateModule {
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final com.google.samples.apps.iosched.ui.signin.SignInViewModelDelegate provideSignInViewModelDelegate(@org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.shared.domain.auth.ObserveUserAuthStateUseCase dataSource, @org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.shared.domain.prefs.NotificationsPrefIsShownUseCase notificationsPrefIsShownUseCase, @org.jetbrains.annotations.NotNull()
    @com.google.samples.apps.iosched.shared.di.IoDispatcher()
    kotlinx.coroutines.CoroutineDispatcher ioDispatcher, @org.jetbrains.annotations.NotNull()
    @com.google.samples.apps.iosched.shared.di.MainDispatcher()
    kotlinx.coroutines.CoroutineDispatcher mainDispatcher, @com.google.samples.apps.iosched.shared.di.ReservationEnabledFlag()
    boolean isReservationEnabledByRemoteConfig) {
        return null;
    }
    
    public SignInViewModelDelegateModule() {
        super();
    }
}