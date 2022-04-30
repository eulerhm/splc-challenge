package com.google.samples.apps.iosched.shared.domain.sessions;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/google/samples/apps/iosched/shared/domain/sessions/StarReserveNotificationAlarmUpdater;", "", "alarmManager", "Lcom/google/samples/apps/iosched/shared/notifications/SessionAlarmManager;", "(Lcom/google/samples/apps/iosched/shared/notifications/SessionAlarmManager;)V", "updateSession", "", "userSession", "Lcom/google/samples/apps/iosched/model/userdata/UserSession;", "requestNotification", "", "shared_staging"})
@javax.inject.Singleton()
public class StarReserveNotificationAlarmUpdater {
    private final com.google.samples.apps.iosched.shared.notifications.SessionAlarmManager alarmManager = null;
    
    public void updateSession(@org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.model.userdata.UserSession userSession, boolean requestNotification) {
    }
    
    @javax.inject.Inject()
    public StarReserveNotificationAlarmUpdater(@org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.shared.notifications.SessionAlarmManager alarmManager) {
        super();
    }
}