package com.woocommerce.android.push;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u0000 <2\u00020\u0001:\u0001<BW\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u00a2\u0006\u0002\u0010\u0016J\b\u0010\u0017\u001a\u00020\u0018H\u0002J\u0010\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J\u0018\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u001dH\u0002J\u0018\u0010 \u001a\u00020\u001d2\u0006\u0010!\u001a\u00020\"2\u0006\u0010\u001f\u001a\u00020\u001dH\u0002J\u0010\u0010#\u001a\u00020\u00182\u0006\u0010$\u001a\u00020%H\u0002J\b\u0010&\u001a\u00020\'H\u0002J\u0010\u0010(\u001a\u00020\'2\u0006\u0010$\u001a\u00020%H\u0002J\u000e\u0010)\u001a\u00020\u00182\u0006\u0010*\u001a\u00020\"J\u000e\u0010+\u001a\u00020\u00182\u0006\u0010,\u001a\u00020-J\"\u0010.\u001a\u00020\u00182\u0012\u0010/\u001a\u000e\u0012\u0004\u0012\u000201\u0012\u0004\u0012\u000201002\u0006\u00102\u001a\u000203J\u000e\u00104\u001a\u00020\u00182\u0006\u00105\u001a\u00020\u001dJ\u0006\u00106\u001a\u00020\u0018J\u000e\u00107\u001a\u00020\u00182\u0006\u00105\u001a\u00020\u001dJ\u000e\u00108\u001a\u00020\u00182\u0006\u0010*\u001a\u00020\"J\u0016\u00109\u001a\u00020\u00182\u0006\u0010,\u001a\u00020-2\u0006\u0010:\u001a\u00020\"J\b\u0010;\u001a\u00020\u0018H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006="}, d2 = {"Lcom/woocommerce/android/push/NotificationMessageHandler;", "", "accountStore", "Lorg/wordpress/android/fluxc/store/AccountStore;", "wooLogWrapper", "Lcom/woocommerce/android/util/WooLogWrapper;", "dispatcher", "Lorg/wordpress/android/fluxc/Dispatcher;", "siteStore", "Lorg/wordpress/android/fluxc/store/SiteStore;", "appPrefsWrapper", "Lcom/woocommerce/android/AppPrefsWrapper;", "resourceProvider", "Lcom/woocommerce/android/viewmodel/ResourceProvider;", "notificationBuilder", "Lcom/woocommerce/android/push/WooNotificationBuilder;", "analyticsTracker", "Lcom/woocommerce/android/push/NotificationAnalyticsTracker;", "zendeskHelper", "Lcom/woocommerce/android/support/ZendeskHelper;", "notificationsParser", "Lcom/woocommerce/android/util/NotificationsParser;", "(Lorg/wordpress/android/fluxc/store/AccountStore;Lcom/woocommerce/android/util/WooLogWrapper;Lorg/wordpress/android/fluxc/Dispatcher;Lorg/wordpress/android/fluxc/store/SiteStore;Lcom/woocommerce/android/AppPrefsWrapper;Lcom/woocommerce/android/viewmodel/ResourceProvider;Lcom/woocommerce/android/push/WooNotificationBuilder;Lcom/woocommerce/android/push/NotificationAnalyticsTracker;Lcom/woocommerce/android/support/ZendeskHelper;Lcom/woocommerce/android/util/NotificationsParser;)V", "clearNotifications", "", "dispatchBackgroundEvents", "notificationModel", "Lorg/wordpress/android/fluxc/model/notification/NotificationModel;", "getLocalPushId", "", "wpComNoteId", "randomNumber", "getLocalPushIdForNoteId", "noteId", "", "handleWooNotification", "notification", "Lcom/woocommerce/android/model/Notification;", "hasNotifications", "", "isNotificationOptionEnabled", "markNotificationTapped", "remoteNoteId", "markNotificationsOfTypeTapped", "type", "Lcom/woocommerce/android/push/NotificationChannelType;", "onNewMessageReceived", "messageData", "", "", "appContext", "Landroid/content/Context;", "onNotificationDismissed", "localPushId", "removeAllNotificationsFromSystemsBar", "removeNotificationByPushIdFromSystemsBar", "removeNotificationByRemoteIdFromSystemsBar", "removeNotificationsOfTypeFromSystemsBar", "remoteSiteId", "updateNotificationsState", "Companion", "WooCommerce_vanillaDebug"})
@javax.inject.Singleton()
public final class NotificationMessageHandler {
    private final org.wordpress.android.fluxc.store.AccountStore accountStore = null;
    private final com.woocommerce.android.util.WooLogWrapper wooLogWrapper = null;
    private final org.wordpress.android.fluxc.Dispatcher dispatcher = null;
    private final org.wordpress.android.fluxc.store.SiteStore siteStore = null;
    private final com.woocommerce.android.AppPrefsWrapper appPrefsWrapper = null;
    private final com.woocommerce.android.viewmodel.ResourceProvider resourceProvider = null;
    private final com.woocommerce.android.push.WooNotificationBuilder notificationBuilder = null;
    private final com.woocommerce.android.push.NotificationAnalyticsTracker analyticsTracker = null;
    private final com.woocommerce.android.support.ZendeskHelper zendeskHelper = null;
    private final com.woocommerce.android.util.NotificationsParser notificationsParser = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.woocommerce.android.push.NotificationMessageHandler.Companion Companion = null;
    private static final java.lang.String KEY_PUSH_TYPE_ZENDESK = "zendesk";
    private static final java.lang.String KEY_ZENDESK_REQUEST_ID = "zendesk_sdk_request_id";
    private static final int ZENDESK_PUSH_NOTIFICATION_ID = 1999999999;
    private static final int PUSH_NOTIFICATION_ID = 10000;
    private static final java.lang.String PUSH_ARG_USER = "user";
    private static final int MAX_INBOX_ITEMS = 5;
    private static final java.util.Map<java.lang.Integer, com.woocommerce.android.model.Notification> ACTIVE_NOTIFICATIONS_MAP = null;
    
    @javax.inject.Inject()
    public NotificationMessageHandler(@org.jetbrains.annotations.NotNull()
    org.wordpress.android.fluxc.store.AccountStore accountStore, @org.jetbrains.annotations.NotNull()
    com.woocommerce.android.util.WooLogWrapper wooLogWrapper, @org.jetbrains.annotations.NotNull()
    org.wordpress.android.fluxc.Dispatcher dispatcher, @org.jetbrains.annotations.NotNull()
    org.wordpress.android.fluxc.store.SiteStore siteStore, @org.jetbrains.annotations.NotNull()
    com.woocommerce.android.AppPrefsWrapper appPrefsWrapper, @org.jetbrains.annotations.NotNull()
    com.woocommerce.android.viewmodel.ResourceProvider resourceProvider, @org.jetbrains.annotations.NotNull()
    com.woocommerce.android.push.WooNotificationBuilder notificationBuilder, @org.jetbrains.annotations.NotNull()
    com.woocommerce.android.push.NotificationAnalyticsTracker analyticsTracker, @org.jetbrains.annotations.NotNull()
    com.woocommerce.android.support.ZendeskHelper zendeskHelper, @org.jetbrains.annotations.NotNull()
    com.woocommerce.android.util.NotificationsParser notificationsParser) {
        super();
    }
    
    @kotlin.jvm.Synchronized()
    public final synchronized void onNotificationDismissed(int localPushId) {
    }
    
    @kotlin.Suppress(names = {"ReturnCount", "ComplexMethod"})
    public final void onNewMessageReceived(@org.jetbrains.annotations.NotNull()
    java.util.Map<java.lang.String, java.lang.String> messageData, @org.jetbrains.annotations.NotNull()
    android.content.Context appContext) {
    }
    
    private final void dispatchBackgroundEvents(org.wordpress.android.fluxc.model.notification.NotificationModel notificationModel) {
    }
    
    /**
     * Don't display the notification if user chose to disable this type of notification -
     * note that we skip this for API 26+ since Oreo added per-app notification settings via channels
     */
    private final boolean isNotificationOptionEnabled(com.woocommerce.android.model.Notification notification) {
        return false;
    }
    
    private final void handleWooNotification(com.woocommerce.android.model.Notification notification) {
    }
    
    private final int getLocalPushId(int wpComNoteId, int randomNumber) {
        return 0;
    }
    
    private final int getLocalPushIdForNoteId(long noteId, int randomNumber) {
        return 0;
    }
    
    private final boolean hasNotifications() {
        return false;
    }
    
    private final void clearNotifications() {
    }
    
    /**
     * Find the matching notification and send a track event for [PUSH_NOTIFICATION_TAPPED].
     */
    public final void markNotificationTapped(long remoteNoteId) {
    }
    
    /**
     * Loop over all active notifications and send the [PUSH_NOTIFICATION_TAPPED] track event for each one.
     */
    public final void markNotificationsOfTypeTapped(@org.jetbrains.annotations.NotNull()
    com.woocommerce.android.push.NotificationChannelType type) {
    }
    
    public final void removeAllNotificationsFromSystemsBar() {
    }
    
    @kotlin.jvm.Synchronized()
    public final synchronized void removeNotificationByRemoteIdFromSystemsBar(long remoteNoteId) {
    }
    
    @kotlin.jvm.Synchronized()
    public final synchronized void removeNotificationByPushIdFromSystemsBar(int localPushId) {
    }
    
    @kotlin.jvm.Synchronized()
    public final synchronized void removeNotificationsOfTypeFromSystemsBar(@org.jetbrains.annotations.NotNull()
    com.woocommerce.android.push.NotificationChannelType type, long remoteSiteId) {
    }
    
    private final void updateNotificationsState() {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\bX\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lcom/woocommerce/android/push/NotificationMessageHandler$Companion;", "", "()V", "ACTIVE_NOTIFICATIONS_MAP", "", "", "Lcom/woocommerce/android/model/Notification;", "KEY_PUSH_TYPE_ZENDESK", "", "KEY_ZENDESK_REQUEST_ID", "MAX_INBOX_ITEMS", "PUSH_ARG_USER", "PUSH_NOTIFICATION_ID", "ZENDESK_PUSH_NOTIFICATION_ID", "WooCommerce_vanillaDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}