package com.google.samples.apps.iosched.ui.signin;

import java.lang.System;

/**
 * Implementation of SignInViewModelDelegate that uses Firebase's auth mechanisms.
 */
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B5\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0001\u0010\b\u001a\u00020\u0007\u0012\b\b\u0001\u0010\t\u001a\u00020\n\u00a2\u0006\u0002\u0010\u000bJ\u0011\u0010%\u001a\u00020&H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\'J\u0011\u0010(\u001a\u00020&H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\'J\n\u0010)\u001a\u0004\u0018\u00010*H\u0016J\b\u0010\u0017\u001a\u00020\nH\u0016J\b\u0010\u0019\u001a\u00020\nH\u0016J\u000e\u0010+\u001a\b\u0012\u0004\u0012\u00020\n0\u0011H\u0016J\u000e\u0010,\u001a\b\u0012\u0004\u0012\u00020\n0\u0011H\u0016J\u001c\u0010-\u001a\b\u0012\u0004\u0012\u00020\n0\u001d2\f\u0010.\u001a\b\u0012\u0004\u0012\u00020\n0\u000eH\u0002R\u001c\u0010\f\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u000e0\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u0011X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u0011X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\n0\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0018R\u0014\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\n0\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u000e0\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0\u001d0\u001cX\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R \u0010!\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u001d0\u0011X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0014R\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020\n0\u0011X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0014\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006/"}, d2 = {"Lcom/google/samples/apps/iosched/ui/signin/FirebaseSignInViewModelDelegate;", "Lcom/google/samples/apps/iosched/ui/signin/SignInViewModelDelegate;", "observeUserAuthStateUseCase", "Lcom/google/samples/apps/iosched/shared/domain/auth/ObserveUserAuthStateUseCase;", "notificationsPrefIsShownUseCase", "Lcom/google/samples/apps/iosched/shared/domain/prefs/NotificationsPrefIsShownUseCase;", "ioDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "mainDispatcher", "isReservationEnabledByRemoteConfig", "", "(Lcom/google/samples/apps/iosched/shared/domain/auth/ObserveUserAuthStateUseCase;Lcom/google/samples/apps/iosched/shared/domain/prefs/NotificationsPrefIsShownUseCase;Lkotlinx/coroutines/CoroutineDispatcher;Lkotlinx/coroutines/CoroutineDispatcher;Z)V", "currentFirebaseUser", "Lkotlinx/coroutines/flow/Flow;", "Lcom/google/samples/apps/iosched/shared/result/Result;", "Lcom/google/samples/apps/iosched/shared/data/signin/AuthenticatedUserInfo;", "currentUserImageUri", "Landroidx/lifecycle/LiveData;", "Landroid/net/Uri;", "getCurrentUserImageUri", "()Landroidx/lifecycle/LiveData;", "currentUserInfo", "getCurrentUserInfo", "isRegistered", "()Z", "isSignedIn", "notificationsPrefIsShown", "performSignInEvent", "Landroidx/lifecycle/MutableLiveData;", "Lcom/google/samples/apps/iosched/shared/result/Event;", "Lcom/google/samples/apps/iosched/ui/signin/SignInEvent;", "getPerformSignInEvent", "()Landroidx/lifecycle/MutableLiveData;", "shouldShowNotificationsPrefAction", "getShouldShowNotificationsPrefAction", "showReservations", "getShowReservations", "emitSignInRequest", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "emitSignOutRequest", "getUserId", "", "observeRegisteredUser", "observeSignedInUser", "showNotificationPref", "notificationsPrefIsShownValue", "mobile_staging"})
public final class FirebaseSignInViewModelDelegate implements com.google.samples.apps.iosched.ui.signin.SignInViewModelDelegate {
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.google.samples.apps.iosched.shared.result.Event<com.google.samples.apps.iosched.ui.signin.SignInEvent>> performSignInEvent = null;
    private final kotlinx.coroutines.flow.Flow<com.google.samples.apps.iosched.shared.result.Result<com.google.samples.apps.iosched.shared.data.signin.AuthenticatedUserInfo>> currentFirebaseUser = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.google.samples.apps.iosched.shared.data.signin.AuthenticatedUserInfo> currentUserInfo = null;
    private final androidx.lifecycle.LiveData<com.google.samples.apps.iosched.shared.result.Result<java.lang.Boolean>> notificationsPrefIsShown = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<android.net.Uri> currentUserImageUri = null;
    private final androidx.lifecycle.LiveData<java.lang.Boolean> isRegistered = null;
    private final androidx.lifecycle.LiveData<java.lang.Boolean> isSignedIn = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.google.samples.apps.iosched.shared.result.Event<java.lang.Boolean>> shouldShowNotificationsPrefAction = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.lang.Boolean> showReservations = null;
    private final com.google.samples.apps.iosched.shared.domain.prefs.NotificationsPrefIsShownUseCase notificationsPrefIsShownUseCase = null;
    private final kotlinx.coroutines.CoroutineDispatcher ioDispatcher = null;
    private final kotlinx.coroutines.CoroutineDispatcher mainDispatcher = null;
    private final boolean isReservationEnabledByRemoteConfig = false;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.lifecycle.MutableLiveData<com.google.samples.apps.iosched.shared.result.Event<com.google.samples.apps.iosched.ui.signin.SignInEvent>> getPerformSignInEvent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.lifecycle.LiveData<com.google.samples.apps.iosched.shared.data.signin.AuthenticatedUserInfo> getCurrentUserInfo() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.lifecycle.LiveData<android.net.Uri> getCurrentUserImageUri() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.lifecycle.LiveData<com.google.samples.apps.iosched.shared.result.Event<java.lang.Boolean>> getShouldShowNotificationsPrefAction() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.lifecycle.LiveData<java.lang.Boolean> getShowReservations() {
        return null;
    }
    
    private final com.google.samples.apps.iosched.shared.result.Event<java.lang.Boolean> showNotificationPref(com.google.samples.apps.iosched.shared.result.Result<java.lang.Boolean> notificationsPrefIsShownValue) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object emitSignInRequest(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p0) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object emitSignOutRequest(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p0) {
        return null;
    }
    
    @java.lang.Override()
    public boolean isSignedIn() {
        return false;
    }
    
    @java.lang.Override()
    public boolean isRegistered() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.lifecycle.LiveData<java.lang.Boolean> observeSignedInUser() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.lifecycle.LiveData<java.lang.Boolean> observeRegisteredUser() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.String getUserId() {
        return null;
    }
    
    public final boolean isReservationEnabledByRemoteConfig() {
        return false;
    }
    
    @javax.inject.Inject()
    public FirebaseSignInViewModelDelegate(@org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.shared.domain.auth.ObserveUserAuthStateUseCase observeUserAuthStateUseCase, @org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.shared.domain.prefs.NotificationsPrefIsShownUseCase notificationsPrefIsShownUseCase, @org.jetbrains.annotations.NotNull()
    @com.google.samples.apps.iosched.shared.di.IoDispatcher()
    kotlinx.coroutines.CoroutineDispatcher ioDispatcher, @org.jetbrains.annotations.NotNull()
    @com.google.samples.apps.iosched.shared.di.MainDispatcher()
    kotlinx.coroutines.CoroutineDispatcher mainDispatcher, @com.google.samples.apps.iosched.shared.di.ReservationEnabledFlag()
    boolean isReservationEnabledByRemoteConfig) {
        super();
    }
}