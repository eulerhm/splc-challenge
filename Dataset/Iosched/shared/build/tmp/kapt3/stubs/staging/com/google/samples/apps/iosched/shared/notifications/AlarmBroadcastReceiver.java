package com.google.samples.apps.iosched.shared.notifications;

import java.lang.System;

/**
 * Receives broadcast intents with information for session notifications.
 */
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u0000 E2\u00020\u0001:\u0001EB\u0005\u00a2\u0006\u0002\u0010\u0002J)\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020-H\u0083@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010/J)\u00100\u001a\u00020)2\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020-H\u0083@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010/J)\u00101\u001a\n\u0012\u0004\u0012\u000203\u0018\u0001022\u0006\u0010.\u001a\u00020-2\u0006\u0010,\u001a\u00020-H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u00104J\u0010\u00105\u001a\u0002062\u0006\u00107\u001a\u000208H\u0002J\u0018\u00109\u001a\u00020)2\u0006\u0010*\u001a\u00020+2\u0006\u0010:\u001a\u00020;H\u0003J\u0018\u0010<\u001a\u00020)2\u0006\u0010*\u001a\u00020+2\u0006\u0010:\u001a\u00020;H\u0003J!\u0010=\u001a\u00020)2\u0006\u0010,\u001a\u00020-2\u0006\u0010*\u001a\u00020+H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010>J\u0018\u0010?\u001a\u00020)2\u0006\u0010*\u001a\u00020+2\u0006\u0010@\u001a\u00020AH\u0016J\u0018\u0010B\u001a\u00020C2\u0006\u0010*\u001a\u00020+2\u0006\u00107\u001a\u000208H\u0003J\u0018\u0010D\u001a\u00020C2\u0006\u0010*\u001a\u00020+2\u0006\u00107\u001a\u000208H\u0003R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR$\u0010\u000f\u001a\u00020\u00108\u0006@\u0006X\u0087.\u00a2\u0006\u0014\n\u0000\u0012\u0004\b\u0011\u0010\u0002\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001e\u0010\u0016\u001a\u00020\u00178\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001e\u0010\u001c\u001a\u00020\u001d8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001e\u0010\"\u001a\u00020#8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010\'\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006F"}, d2 = {"Lcom/google/samples/apps/iosched/shared/notifications/AlarmBroadcastReceiver;", "Landroid/content/BroadcastReceiver;", "()V", "alarmManager", "Lcom/google/samples/apps/iosched/shared/notifications/SessionAlarmManager;", "getAlarmManager", "()Lcom/google/samples/apps/iosched/shared/notifications/SessionAlarmManager;", "setAlarmManager", "(Lcom/google/samples/apps/iosched/shared/notifications/SessionAlarmManager;)V", "authIdDataSource", "Lcom/google/samples/apps/iosched/shared/data/signin/datasources/AuthIdDataSource;", "getAuthIdDataSource", "()Lcom/google/samples/apps/iosched/shared/data/signin/datasources/AuthIdDataSource;", "setAuthIdDataSource", "(Lcom/google/samples/apps/iosched/shared/data/signin/datasources/AuthIdDataSource;)V", "externalScope", "Lkotlinx/coroutines/CoroutineScope;", "externalScope$annotations", "getExternalScope", "()Lkotlinx/coroutines/CoroutineScope;", "setExternalScope", "(Lkotlinx/coroutines/CoroutineScope;)V", "loadSession", "Lcom/google/samples/apps/iosched/shared/domain/sessions/LoadSessionOneShotUseCase;", "getLoadSession", "()Lcom/google/samples/apps/iosched/shared/domain/sessions/LoadSessionOneShotUseCase;", "setLoadSession", "(Lcom/google/samples/apps/iosched/shared/domain/sessions/LoadSessionOneShotUseCase;)V", "loadUserSession", "Lcom/google/samples/apps/iosched/shared/domain/sessions/LoadUserSessionOneShotUseCase;", "getLoadUserSession", "()Lcom/google/samples/apps/iosched/shared/domain/sessions/LoadUserSessionOneShotUseCase;", "setLoadUserSession", "(Lcom/google/samples/apps/iosched/shared/domain/sessions/LoadUserSessionOneShotUseCase;)V", "sharedPreferencesStorage", "Lcom/google/samples/apps/iosched/shared/data/prefs/SharedPreferenceStorage;", "getSharedPreferencesStorage", "()Lcom/google/samples/apps/iosched/shared/data/prefs/SharedPreferenceStorage;", "setSharedPreferencesStorage", "(Lcom/google/samples/apps/iosched/shared/data/prefs/SharedPreferenceStorage;)V", "checkThenShowPostSessionNotification", "", "context", "Landroid/content/Context;", "sessionId", "", "userId", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "checkThenShowPreSessionNotification", "getUserEvent", "Lcom/google/samples/apps/iosched/shared/result/Result;", "Lcom/google/samples/apps/iosched/model/userdata/UserSession;", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isSessionCurrent", "", "session", "Lcom/google/samples/apps/iosched/model/Session;", "makeNotificationChannelForPostSession", "notificationManager", "Landroid/app/NotificationManager;", "makeNotificationChannelForPreSession", "notifyWithoutUserEvent", "(Ljava/lang/String;Landroid/content/Context;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onReceive", "intent", "Landroid/content/Intent;", "showPostSessionNotification", "", "showPreSessionNotification", "Companion", "shared_staging"})
@dagger.hilt.android.AndroidEntryPoint()
public final class AlarmBroadcastReceiver extends android.content.BroadcastReceiver {
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.google.samples.apps.iosched.shared.data.prefs.SharedPreferenceStorage sharedPreferencesStorage;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.google.samples.apps.iosched.shared.domain.sessions.LoadUserSessionOneShotUseCase loadUserSession;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.google.samples.apps.iosched.shared.domain.sessions.LoadSessionOneShotUseCase loadSession;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.google.samples.apps.iosched.shared.notifications.SessionAlarmManager alarmManager;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.google.samples.apps.iosched.shared.data.signin.datasources.AuthIdDataSource authIdDataSource;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public kotlinx.coroutines.CoroutineScope externalScope;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String EXTRA_NOTIFICATION_CHANNEL = "notification_channel";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String EXTRA_SESSION_ID = "user_event_extra";
    
    /**
     * If this flag it set to true in session detail, the show rate dialog should be opened
     */
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String EXTRA_SHOW_RATE_SESSION_FLAG = "show_rate_session_extra";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String QUERY_SESSION_ID = "session_id";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String CHANNEL_ID_UPCOMING = "upcoming_channel_id";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String CHANNEL_ID_FEEDBACK = "feedback_channel_id";
    public static final com.google.samples.apps.iosched.shared.notifications.AlarmBroadcastReceiver.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.google.samples.apps.iosched.shared.data.prefs.SharedPreferenceStorage getSharedPreferencesStorage() {
        return null;
    }
    
    public final void setSharedPreferencesStorage(@org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.shared.data.prefs.SharedPreferenceStorage p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.google.samples.apps.iosched.shared.domain.sessions.LoadUserSessionOneShotUseCase getLoadUserSession() {
        return null;
    }
    
    public final void setLoadUserSession(@org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.shared.domain.sessions.LoadUserSessionOneShotUseCase p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.google.samples.apps.iosched.shared.domain.sessions.LoadSessionOneShotUseCase getLoadSession() {
        return null;
    }
    
    public final void setLoadSession(@org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.shared.domain.sessions.LoadSessionOneShotUseCase p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.google.samples.apps.iosched.shared.notifications.SessionAlarmManager getAlarmManager() {
        return null;
    }
    
    public final void setAlarmManager(@org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.shared.notifications.SessionAlarmManager p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.google.samples.apps.iosched.shared.data.signin.datasources.AuthIdDataSource getAuthIdDataSource() {
        return null;
    }
    
    public final void setAuthIdDataSource(@org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.shared.data.signin.datasources.AuthIdDataSource p0) {
    }
    
    @com.google.samples.apps.iosched.shared.di.ApplicationScope()
    @java.lang.Deprecated()
    public static void externalScope$annotations() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.CoroutineScope getExternalScope() {
        return null;
    }
    
    public final void setExternalScope(@org.jetbrains.annotations.NotNull()
    kotlinx.coroutines.CoroutineScope p0) {
    }
    
    @java.lang.Override()
    public void onReceive(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    android.content.Intent intent) {
    }
    
    @androidx.annotation.WorkerThread()
    private final int showPreSessionNotification(android.content.Context context, com.google.samples.apps.iosched.model.Session session) {
        return 0;
    }
    
    @androidx.annotation.WorkerThread()
    private final int showPostSessionNotification(android.content.Context context, com.google.samples.apps.iosched.model.Session session) {
        return 0;
    }
    
    @androidx.annotation.RequiresApi(value = android.os.Build.VERSION_CODES.O)
    private final void makeNotificationChannelForPreSession(android.content.Context context, android.app.NotificationManager notificationManager) {
    }
    
    @androidx.annotation.RequiresApi(value = android.os.Build.VERSION_CODES.O)
    private final void makeNotificationChannelForPostSession(android.content.Context context, android.app.NotificationManager notificationManager) {
    }
    
    private final boolean isSessionCurrent(com.google.samples.apps.iosched.model.Session session) {
        return false;
    }
    
    public AlarmBroadcastReceiver() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lcom/google/samples/apps/iosched/shared/notifications/AlarmBroadcastReceiver$Companion;", "", "()V", "CHANNEL_ID_FEEDBACK", "", "CHANNEL_ID_UPCOMING", "EXTRA_NOTIFICATION_CHANNEL", "EXTRA_SESSION_ID", "EXTRA_SHOW_RATE_SESSION_FLAG", "QUERY_SESSION_ID", "shared_staging"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}