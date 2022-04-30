package com.google.samples.apps.iosched.shared.data.signin;

import java.lang.System;

/**
 * Uses an HTTP client to hit an endpoint when the user changes.
 */
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J!\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fR\u001b\u0010\u0003\u001a\u00020\u00048BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0010"}, d2 = {"Lcom/google/samples/apps/iosched/shared/data/signin/AuthenticatedUserRegistration;", "", "()V", "client", "Lokhttp3/OkHttpClient;", "getClient", "()Lokhttp3/OkHttpClient;", "client$delegate", "Lkotlin/Lazy;", "callRegistrationEndpoint", "", "token", "", "coroutineDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "(Ljava/lang/String;Lkotlinx/coroutines/CoroutineDispatcher;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "shared_staging"})
public final class AuthenticatedUserRegistration {
    private static final kotlin.Lazy client$delegate = null;
    public static final com.google.samples.apps.iosched.shared.data.signin.AuthenticatedUserRegistration INSTANCE = null;
    
    private final okhttp3.OkHttpClient getClient() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object callRegistrationEndpoint(@org.jetbrains.annotations.NotNull()
    java.lang.String token, @org.jetbrains.annotations.NotNull()
    kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p2) {
        return null;
    }
    
    private AuthenticatedUserRegistration() {
        super();
    }
}