package com.woocommerce.android.push;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00172\u00020\u0001:\u0002\u0016\u0017B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u0010H\u0016J\"\u0010\u0012\u001a\u00020\u00132\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0013H\u0016R\u0012\u0010\u0003\u001a\u00060\u0004R\u00020\u0000X\u0082.\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n\u00a8\u0006\u0018"}, d2 = {"Lcom/woocommerce/android/push/NotificationsProcessingService;", "Landroid/app/Service;", "()V", "actionProcessor", "Lcom/woocommerce/android/push/NotificationsProcessingService$ActionProcessor;", "notificationMessageHandler", "Lcom/woocommerce/android/push/NotificationMessageHandler;", "getNotificationMessageHandler", "()Lcom/woocommerce/android/push/NotificationMessageHandler;", "setNotificationMessageHandler", "(Lcom/woocommerce/android/push/NotificationMessageHandler;)V", "onBind", "Landroid/os/IBinder;", "intent", "Landroid/content/Intent;", "onCreate", "", "onDestroy", "onStartCommand", "", "flags", "startId", "ActionProcessor", "Companion", "WooCommerce_wasabiDebug"})
@dagger.hilt.android.AndroidEntryPoint
public final class NotificationsProcessingService extends android.app.Service {
    @org.jetbrains.annotations.NotNull
    public static final com.woocommerce.android.push.NotificationsProcessingService.Companion Companion = null;
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String ARG_ACTION_TYPE = "action_type";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String ARG_ACTION_NOTIFICATION_DISMISS = "action_dismiss";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String ARG_PUSH_ID = "notificationId";
    private com.woocommerce.android.push.NotificationsProcessingService.ActionProcessor actionProcessor;
    @javax.inject.Inject
    public com.woocommerce.android.push.NotificationMessageHandler notificationMessageHandler;
    
    public NotificationsProcessingService() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.woocommerce.android.push.NotificationMessageHandler getNotificationMessageHandler() {
        return null;
    }
    
    public final void setNotificationMessageHandler(@org.jetbrains.annotations.NotNull
    com.woocommerce.android.push.NotificationMessageHandler p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public android.os.IBinder onBind(@org.jetbrains.annotations.NotNull
    android.content.Intent intent) {
        return null;
    }
    
    @java.lang.Override
    public void onCreate() {
    }
    
    @java.lang.Override
    public void onDestroy() {
    }
    
    @java.lang.Override
    public int onStartCommand(@org.jetbrains.annotations.Nullable
    android.content.Intent intent, int flags, int startId) {
        return 0;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0006\u0010\u0007\u001a\u00020\bR\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/woocommerce/android/push/NotificationsProcessingService$ActionProcessor;", "", "intent", "Landroid/content/Intent;", "taskId", "", "(Lcom/woocommerce/android/push/NotificationsProcessingService;Landroid/content/Intent;I)V", "process", "", "WooCommerce_wasabiDebug"})
    final class ActionProcessor {
        private final android.content.Intent intent = null;
        private final int taskId = 0;
        
        public ActionProcessor(@org.jetbrains.annotations.Nullable
        android.content.Intent intent, int taskId) {
            super();
        }
        
        public final void process() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lcom/woocommerce/android/push/NotificationsProcessingService$Companion;", "", "()V", "ARG_ACTION_NOTIFICATION_DISMISS", "", "ARG_ACTION_TYPE", "ARG_PUSH_ID", "getPendingIntentForNotificationDismiss", "Landroid/app/PendingIntent;", "context", "Landroid/content/Context;", "pushId", "", "WooCommerce_wasabiDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final android.app.PendingIntent getPendingIntentForNotificationDismiss(@org.jetbrains.annotations.NotNull
        android.content.Context context, int pushId) {
            return null;
        }
    }
}