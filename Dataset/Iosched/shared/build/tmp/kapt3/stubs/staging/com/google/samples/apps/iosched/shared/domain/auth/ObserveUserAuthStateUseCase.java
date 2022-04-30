package com.google.samples.apps.iosched.shared.domain.auth;

import java.lang.System;

/**
 * A [FlowUseCase] that observes two data sources to generate an [AuthenticatedUserInfo]
 * that includes whether the user is registered (is an attendee).
 *
 * [AuthStateUserDataSource] provides general user information, like user IDs, while
 * [RegisteredUserDataSource] observes a different data source to provide a flag indicating
 * whether the user is registered.
 */
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0017\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B3\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\b\u0001\u0010\n\u001a\u00020\u000b\u0012\b\b\u0001\u0010\f\u001a\u00020\r\u00a2\u0006\u0002\u0010\u000eJ\u001c\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00130\u00122\u0006\u0010\u0014\u001a\u00020\u0002H\u0014J\b\u0010\u0015\u001a\u00020\u0016H\u0002J\b\u0010\u0017\u001a\u00020\u0016H\u0002J)\u0010\u0018\u001a\u00020\u0016*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00130\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001cJ1\u0010\u001d\u001a\u00020\u0016*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00130\u00192\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010\u001a\u001a\u00020\u001bH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010 J\"\u0010!\u001a\u00020\u0016*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00130\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\""}, d2 = {"Lcom/google/samples/apps/iosched/shared/domain/auth/ObserveUserAuthStateUseCase;", "Lcom/google/samples/apps/iosched/shared/domain/FlowUseCase;", "", "Lcom/google/samples/apps/iosched/shared/data/signin/AuthenticatedUserInfo;", "registeredUserDataSource", "Lcom/google/samples/apps/iosched/shared/data/signin/datasources/RegisteredUserDataSource;", "authStateUserDataSource", "Lcom/google/samples/apps/iosched/shared/data/signin/datasources/AuthStateUserDataSource;", "topicSubscriber", "Lcom/google/samples/apps/iosched/shared/fcm/TopicSubscriber;", "externalScope", "Lkotlinx/coroutines/CoroutineScope;", "ioDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "(Lcom/google/samples/apps/iosched/shared/data/signin/datasources/RegisteredUserDataSource;Lcom/google/samples/apps/iosched/shared/data/signin/datasources/AuthStateUserDataSource;Lcom/google/samples/apps/iosched/shared/fcm/TopicSubscriber;Lkotlinx/coroutines/CoroutineScope;Lkotlinx/coroutines/CoroutineDispatcher;)V", "observeUserRegisteredChangesJob", "Lkotlinx/coroutines/Job;", "execute", "Lkotlinx/coroutines/flow/Flow;", "Lcom/google/samples/apps/iosched/shared/result/Result;", "parameters", "subscribeToRegisteredTopic", "", "unsubscribeFromRegisteredTopic", "processUserData", "Lkotlinx/coroutines/channels/ProducerScope;", "userData", "Lcom/google/samples/apps/iosched/shared/data/signin/AuthenticatedUserInfoBasic;", "(Lkotlinx/coroutines/channels/ProducerScope;Lcom/google/samples/apps/iosched/shared/data/signin/AuthenticatedUserInfoBasic;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "userSignedIn", "userId", "", "(Lkotlinx/coroutines/channels/ProducerScope;Ljava/lang/String;Lcom/google/samples/apps/iosched/shared/data/signin/AuthenticatedUserInfoBasic;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "userSignedOut", "shared_staging"})
@javax.inject.Singleton()
public class ObserveUserAuthStateUseCase extends com.google.samples.apps.iosched.shared.domain.FlowUseCase<java.lang.Object, com.google.samples.apps.iosched.shared.data.signin.AuthenticatedUserInfo> {
    private kotlinx.coroutines.Job observeUserRegisteredChangesJob;
    private final com.google.samples.apps.iosched.shared.data.signin.datasources.RegisteredUserDataSource registeredUserDataSource = null;
    private final com.google.samples.apps.iosched.shared.data.signin.datasources.AuthStateUserDataSource authStateUserDataSource = null;
    private final com.google.samples.apps.iosched.shared.fcm.TopicSubscriber topicSubscriber = null;
    private final kotlinx.coroutines.CoroutineScope externalScope = null;
    private final kotlinx.coroutines.CoroutineDispatcher ioDispatcher = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    protected kotlinx.coroutines.flow.Flow<com.google.samples.apps.iosched.shared.result.Result<com.google.samples.apps.iosched.shared.data.signin.AuthenticatedUserInfo>> execute(@org.jetbrains.annotations.NotNull()
    java.lang.Object parameters) {
        return null;
    }
    
    private final void subscribeToRegisteredTopic() {
    }
    
    private final void unsubscribeFromRegisteredTopic() {
    }
    
    private final void userSignedOut(@org.jetbrains.annotations.NotNull()
    kotlinx.coroutines.channels.ProducerScope<? super com.google.samples.apps.iosched.shared.result.Result<? extends com.google.samples.apps.iosched.shared.data.signin.AuthenticatedUserInfo>> $this$userSignedOut, com.google.samples.apps.iosched.shared.data.signin.AuthenticatedUserInfoBasic userData) {
    }
    
    @javax.inject.Inject()
    public ObserveUserAuthStateUseCase(@org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.shared.data.signin.datasources.RegisteredUserDataSource registeredUserDataSource, @org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.shared.data.signin.datasources.AuthStateUserDataSource authStateUserDataSource, @org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.shared.fcm.TopicSubscriber topicSubscriber, @org.jetbrains.annotations.NotNull()
    @com.google.samples.apps.iosched.shared.di.ApplicationScope()
    kotlinx.coroutines.CoroutineScope externalScope, @org.jetbrains.annotations.NotNull()
    @com.google.samples.apps.iosched.shared.di.IoDispatcher()
    kotlinx.coroutines.CoroutineDispatcher ioDispatcher) {
        super(null);
    }
}