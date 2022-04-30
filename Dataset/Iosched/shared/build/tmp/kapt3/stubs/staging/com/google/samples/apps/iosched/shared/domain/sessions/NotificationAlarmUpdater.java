package com.google.samples.apps.iosched.shared.domain.sessions;

import java.lang.System;

/**
 * Sets a notification for each session that is starred or reserved by the user.
 */
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0006\u0010\t\u001a\u00020\nJ\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\rH\u0002J\u0018\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\rH\u0002J\u000e\u0010\u0011\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lcom/google/samples/apps/iosched/shared/domain/sessions/NotificationAlarmUpdater;", "", "alarmManager", "Lcom/google/samples/apps/iosched/shared/notifications/SessionAlarmManager;", "repository", "Lcom/google/samples/apps/iosched/shared/data/userevent/SessionAndUserEventRepository;", "externalScope", "Lkotlinx/coroutines/CoroutineScope;", "(Lcom/google/samples/apps/iosched/shared/notifications/SessionAlarmManager;Lcom/google/samples/apps/iosched/shared/data/userevent/SessionAndUserEventRepository;Lkotlinx/coroutines/CoroutineScope;)V", "cancelAll", "", "cancelAllSessions", "sessions", "Lcom/google/samples/apps/iosched/shared/data/userevent/ObservableUserEvents;", "processEvents", "userId", "", "updateAll", "shared_staging"})
@javax.inject.Singleton()
public final class NotificationAlarmUpdater {
    private final com.google.samples.apps.iosched.shared.notifications.SessionAlarmManager alarmManager = null;
    private final com.google.samples.apps.iosched.shared.data.userevent.SessionAndUserEventRepository repository = null;
    private final kotlinx.coroutines.CoroutineScope externalScope = null;
    
    public final void updateAll(@org.jetbrains.annotations.NotNull()
    java.lang.String userId) {
    }
    
    private final void processEvents(java.lang.String userId, com.google.samples.apps.iosched.shared.data.userevent.ObservableUserEvents sessions) {
    }
    
    public final void cancelAll() {
    }
    
    private final void cancelAllSessions(com.google.samples.apps.iosched.shared.data.userevent.ObservableUserEvents sessions) {
    }
    
    @javax.inject.Inject()
    public NotificationAlarmUpdater(@org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.shared.notifications.SessionAlarmManager alarmManager, @org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.shared.data.userevent.SessionAndUserEventRepository repository, @org.jetbrains.annotations.NotNull()
    @com.google.samples.apps.iosched.shared.di.ApplicationScope()
    kotlinx.coroutines.CoroutineScope externalScope) {
        super();
    }
}