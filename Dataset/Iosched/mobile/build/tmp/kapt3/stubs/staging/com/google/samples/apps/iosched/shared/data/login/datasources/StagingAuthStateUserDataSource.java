package com.google.samples.apps.iosched.shared.data.login.datasources;

import java.lang.System;

/**
 * A configurable [AuthStateUserDataSource] used for staging.
 *
 * @see LoginModule
 */
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u00a2\u0006\u0002\u0010\u000bJ\u0016\u0010\u0013\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u00150\u0014H\u0016R\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u000eR\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012\u00a8\u0006\u0017"}, d2 = {"Lcom/google/samples/apps/iosched/shared/data/login/datasources/StagingAuthStateUserDataSource;", "Lcom/google/samples/apps/iosched/shared/data/signin/datasources/AuthStateUserDataSource;", "isSignedIn", "", "isRegistered", "userId", "", "context", "Landroid/content/Context;", "notificationAlarmUpdater", "Lcom/google/samples/apps/iosched/shared/domain/sessions/NotificationAlarmUpdater;", "(ZZLjava/lang/String;Landroid/content/Context;Lcom/google/samples/apps/iosched/shared/domain/sessions/NotificationAlarmUpdater;)V", "getContext", "()Landroid/content/Context;", "()Z", "getNotificationAlarmUpdater", "()Lcom/google/samples/apps/iosched/shared/domain/sessions/NotificationAlarmUpdater;", "getUserId", "()Ljava/lang/String;", "getBasicUserInfo", "Lkotlinx/coroutines/flow/Flow;", "Lcom/google/samples/apps/iosched/shared/result/Result;", "Lcom/google/samples/apps/iosched/shared/data/signin/AuthenticatedUserInfoBasic;", "mobile_staging"})
public final class StagingAuthStateUserDataSource implements com.google.samples.apps.iosched.shared.data.signin.datasources.AuthStateUserDataSource {
    private final boolean isSignedIn = false;
    private final boolean isRegistered = false;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String userId = null;
    @org.jetbrains.annotations.NotNull()
    private final android.content.Context context = null;
    @org.jetbrains.annotations.NotNull()
    private final com.google.samples.apps.iosched.shared.domain.sessions.NotificationAlarmUpdater notificationAlarmUpdater = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public kotlinx.coroutines.flow.Flow<com.google.samples.apps.iosched.shared.result.Result<com.google.samples.apps.iosched.shared.data.signin.AuthenticatedUserInfoBasic>> getBasicUserInfo() {
        return null;
    }
    
    public final boolean isSignedIn() {
        return false;
    }
    
    public final boolean isRegistered() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getUserId() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Context getContext() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.google.samples.apps.iosched.shared.domain.sessions.NotificationAlarmUpdater getNotificationAlarmUpdater() {
        return null;
    }
    
    public StagingAuthStateUserDataSource(boolean isSignedIn, boolean isRegistered, @org.jetbrains.annotations.Nullable()
    java.lang.String userId, @org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.shared.domain.sessions.NotificationAlarmUpdater notificationAlarmUpdater) {
        super();
    }
}