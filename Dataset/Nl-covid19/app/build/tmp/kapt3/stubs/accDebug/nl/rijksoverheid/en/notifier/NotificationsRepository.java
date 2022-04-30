package nl.rijksoverheid.en.notifier;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0006\u0010\f\u001a\u00020\u000bJ\u0006\u0010\r\u001a\u00020\u000bJ\u0006\u0010\u000e\u001a\u00020\u000bJ\u0006\u0010\u000f\u001a\u00020\u000bJ.\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\b\b\u0001\u0010\u0014\u001a\u00020\u00152\b\b\u0001\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u0010\u0017\u001a\u00020\u0018H\u0002J,\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u00132\b\b\u0001\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00132\b\b\u0002\u0010\u0017\u001a\u00020\u0018H\u0002J8\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u001b\u001a\u00020\u00132\b\b\u0001\u0010\u001c\u001a\u00020\u00152\b\b\u0001\u0010\u001d\u001a\u00020\u00152\b\b\u0002\u0010\u001e\u001a\u00020\u00182\b\b\u0002\u0010\u001f\u001a\u00020\u0015H\u0002J\u0006\u0010 \u001a\u00020\u000bJ\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00180\nJ\u0006\u0010\"\u001a\u00020\u000bJ\u0006\u0010#\u001a\u00020\u000bJ\u0006\u0010$\u001a\u00020\u000bJ\"\u0010%\u001a\u00020\u000b2\u0006\u0010&\u001a\u00020\'2\b\u0010(\u001a\u0004\u0018\u00010\'2\b\b\u0002\u0010)\u001a\u00020\u0018J\u0018\u0010*\u001a\u00020\u000b2\u0006\u0010\u001b\u001a\u00020\u00152\u0006\u0010+\u001a\u00020,H\u0002J\u0006\u0010-\u001a\u00020\u000bJ\u0006\u0010.\u001a\u00020\u000bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006/"}, d2 = {"Lnl/rijksoverheid/en/notifier/NotificationsRepository;", "", "context", "Landroid/content/Context;", "clock", "Ljava/time/Clock;", "lifecycleOwner", "Landroidx/lifecycle/LifecycleOwner;", "(Landroid/content/Context;Ljava/time/Clock;Landroidx/lifecycle/LifecycleOwner;)V", "refreshOnStart", "Lkotlinx/coroutines/flow/Flow;", "", "cancelExposureNotification", "cancelSyncIssuesNotification", "clearAppInactiveNotification", "clearAppPausedNotification", "createNotification", "Landroidx/core/app/NotificationCompat$Builder;", "channelId", "", "title", "", "message", "autoCancel", "", "channel", "createNotificationChannel", "id", "name", "description", "enableVibration", "lockscreenVisibility", "createOrUpdateNotificationChannels", "exposureNotificationsEnabled", "showAppInactiveNotification", "showAppPausedReminder", "showAppUpdateNotification", "showExposureNotification", "lastExposureDate", "Ljava/time/LocalDate;", "notificationReceivedDate", "reminder", "showNotification", "notification", "Landroid/app/Notification;", "showSyncIssuesNotification", "showUploadKeysFailedNotification", "app_accDebug"})
public final class NotificationsRepository {
    private final kotlinx.coroutines.flow.Flow<kotlin.Unit> refreshOnStart = null;
    private final android.content.Context context = null;
    private final java.time.Clock clock = null;
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<java.lang.Boolean> exposureNotificationsEnabled() {
        return null;
    }
    
    public final void createOrUpdateNotificationChannels() {
    }
    
    public final void showSyncIssuesNotification() {
    }
    
    public final void cancelSyncIssuesNotification() {
    }
    
    public final void showExposureNotification(@org.jetbrains.annotations.NotNull()
    java.time.LocalDate lastExposureDate, @org.jetbrains.annotations.Nullable()
    java.time.LocalDate notificationReceivedDate, boolean reminder) {
    }
    
    public final void cancelExposureNotification() {
    }
    
    public final void showAppUpdateNotification() {
    }
    
    public final void showUploadKeysFailedNotification() {
    }
    
    public final void showAppInactiveNotification() {
    }
    
    public final void clearAppInactiveNotification() {
    }
    
    public final void showAppPausedReminder() {
    }
    
    public final void clearAppPausedNotification() {
    }
    
    private final void showNotification(int id, android.app.Notification notification) {
    }
    
    private final void createNotificationChannel(java.lang.String id, @androidx.annotation.StringRes()
    int name, @androidx.annotation.StringRes()
    int description, boolean enableVibration, int lockscreenVisibility) {
    }
    
    private final androidx.core.app.NotificationCompat.Builder createNotification(java.lang.String channelId, @androidx.annotation.StringRes()
    int title, @androidx.annotation.StringRes()
    int message, boolean autoCancel) {
        return null;
    }
    
    private final androidx.core.app.NotificationCompat.Builder createNotification(java.lang.String channel, @androidx.annotation.StringRes()
    int title, java.lang.String message, boolean autoCancel) {
        return null;
    }
    
    public NotificationsRepository(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.time.Clock clock, @org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LifecycleOwner lifecycleOwner) {
        super();
    }
}