package com.google.samples.apps.iosched.shared.notifications;

import java.lang.System;

/**
 * Manages setting and cancelling alarms for sessions.
 */
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u0000  2\u00020\u0001:\u0001 B\u0011\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u0014\u0010\r\u001a\u00020\n2\n\u0010\u000e\u001a\u00060\u000fj\u0002`\u0010H\u0016J\u000e\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u0013J\u001e\u0010\u0014\u001a\u0004\u0018\u00010\f2\n\u0010\u000e\u001a\u00060\u000fj\u0002`\u00102\u0006\u0010\u0015\u001a\u00020\u000fH\u0002J(\u0010\u0016\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u000fH\u0002J\u0018\u0010\u001b\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\u0018\u0010\u001c\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\u000e\u0010\u001d\u001a\u00020\n2\u0006\u0010\u001e\u001a\u00020\u001fR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006!"}, d2 = {"Lcom/google/samples/apps/iosched/shared/notifications/SessionAlarmManager;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "getContext", "()Landroid/content/Context;", "systemAlarmManager", "Landroid/app/AlarmManager;", "cancelAlarmFor", "", "pendingIntent", "Landroid/app/PendingIntent;", "cancelAlarmForSession", "sessionId", "", "Lcom/google/samples/apps/iosched/model/SessionId;", "dismissNotificationInFiveMinutes", "notificationId", "", "makePendingIntent", "channel", "scheduleAlarmFor", "session", "Lcom/google/samples/apps/iosched/model/Session;", "triggerAtMillis", "", "scheduleAlarmForPostSession", "scheduleAlarmForPreSession", "setAlarmForSession", "userSession", "Lcom/google/samples/apps/iosched/model/userdata/UserSession;", "Companion", "shared_staging"})
public class SessionAlarmManager {
    private final android.app.AlarmManager systemAlarmManager = null;
    @org.jetbrains.annotations.NotNull()
    private final android.content.Context context = null;
    private static final long alarmTimeDelta = 0L;
    public static final com.google.samples.apps.iosched.shared.notifications.SessionAlarmManager.Companion Companion = null;
    
    /**
     * Schedules an alarm for a session.
     */
    public final void setAlarmForSession(@org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.model.userdata.UserSession userSession) {
    }
    
    public void cancelAlarmForSession(@org.jetbrains.annotations.NotNull()
    java.lang.String sessionId) {
    }
    
    private final android.app.PendingIntent makePendingIntent(java.lang.String sessionId, java.lang.String channel) {
        return null;
    }
    
    private final void cancelAlarmFor(android.app.PendingIntent pendingIntent) {
    }
    
    private final void scheduleAlarmForPreSession(android.app.PendingIntent pendingIntent, com.google.samples.apps.iosched.model.Session session) {
    }
    
    private final void scheduleAlarmForPostSession(android.app.PendingIntent pendingIntent, com.google.samples.apps.iosched.model.Session session) {
    }
    
    private final void scheduleAlarmFor(android.app.PendingIntent pendingIntent, com.google.samples.apps.iosched.model.Session session, long triggerAtMillis, java.lang.String channel) {
    }
    
    public final void dismissNotificationInFiveMinutes(int notificationId) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Context getContext() {
        return null;
    }
    
    @javax.inject.Inject()
    public SessionAlarmManager(@org.jetbrains.annotations.NotNull()
    @dagger.hilt.android.qualifiers.ApplicationContext()
    android.content.Context context) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/google/samples/apps/iosched/shared/notifications/SessionAlarmManager$Companion;", "", "()V", "alarmTimeDelta", "", "shared_staging"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}