package com.woocommerce.android.push;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u001f\u001a\u00020 H\u0016J\u0010\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020#H\u0016J\u0010\u0010$\u001a\u00020 2\u0006\u0010%\u001a\u00020&H\u0016R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0011\u001a\u00020\u00128\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001e\u0010\u0017\u001a\u00020\u00188\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u000e\u0010\u001d\u001a\u00020\u001eX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\'"}, d2 = {"Lcom/woocommerce/android/push/FCMMessageService;", "Lcom/google/firebase/messaging/FirebaseMessagingService;", "()V", "appPrefsWrapper", "Lcom/woocommerce/android/AppPrefsWrapper;", "getAppPrefsWrapper", "()Lcom/woocommerce/android/AppPrefsWrapper;", "setAppPrefsWrapper", "(Lcom/woocommerce/android/AppPrefsWrapper;)V", "invalidateDeviceRegistration", "Lorg/wordpress/android/fluxc/store/InvalidateDeviceRegistration;", "getInvalidateDeviceRegistration", "()Lorg/wordpress/android/fluxc/store/InvalidateDeviceRegistration;", "setInvalidateDeviceRegistration", "(Lorg/wordpress/android/fluxc/store/InvalidateDeviceRegistration;)V", "job", "Lkotlinx/coroutines/CompletableJob;", "notificationMessageHandler", "Lcom/woocommerce/android/push/NotificationMessageHandler;", "getNotificationMessageHandler", "()Lcom/woocommerce/android/push/NotificationMessageHandler;", "setNotificationMessageHandler", "(Lcom/woocommerce/android/push/NotificationMessageHandler;)V", "registerDevice", "Lcom/woocommerce/android/push/RegisterDevice;", "getRegisterDevice", "()Lcom/woocommerce/android/push/RegisterDevice;", "setRegisterDevice", "(Lcom/woocommerce/android/push/RegisterDevice;)V", "serviceScope", "Lkotlinx/coroutines/CoroutineScope;", "onDestroy", "", "onMessageReceived", "message", "Lcom/google/firebase/messaging/RemoteMessage;", "onNewToken", "newToken", "", "WooCommerce_vanillaDebug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class FCMMessageService extends com.google.firebase.messaging.FirebaseMessagingService {
    @javax.inject.Inject()
    public com.woocommerce.android.push.NotificationMessageHandler notificationMessageHandler;
    @javax.inject.Inject()
    public com.woocommerce.android.AppPrefsWrapper appPrefsWrapper;
    @javax.inject.Inject()
    public com.woocommerce.android.push.RegisterDevice registerDevice;
    @javax.inject.Inject()
    public org.wordpress.android.fluxc.store.InvalidateDeviceRegistration invalidateDeviceRegistration;
    private final kotlinx.coroutines.CompletableJob job = null;
    private final kotlinx.coroutines.CoroutineScope serviceScope = null;
    
    public FCMMessageService() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.woocommerce.android.push.NotificationMessageHandler getNotificationMessageHandler() {
        return null;
    }
    
    public final void setNotificationMessageHandler(@org.jetbrains.annotations.NotNull()
    com.woocommerce.android.push.NotificationMessageHandler p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.woocommerce.android.AppPrefsWrapper getAppPrefsWrapper() {
        return null;
    }
    
    public final void setAppPrefsWrapper(@org.jetbrains.annotations.NotNull()
    com.woocommerce.android.AppPrefsWrapper p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.woocommerce.android.push.RegisterDevice getRegisterDevice() {
        return null;
    }
    
    public final void setRegisterDevice(@org.jetbrains.annotations.NotNull()
    com.woocommerce.android.push.RegisterDevice p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.wordpress.android.fluxc.store.InvalidateDeviceRegistration getInvalidateDeviceRegistration() {
        return null;
    }
    
    public final void setInvalidateDeviceRegistration(@org.jetbrains.annotations.NotNull()
    org.wordpress.android.fluxc.store.InvalidateDeviceRegistration p0) {
    }
    
    @java.lang.Override()
    public void onNewToken(@org.jetbrains.annotations.NotNull()
    java.lang.String newToken) {
    }
    
    @java.lang.Override()
    public void onMessageReceived(@org.jetbrains.annotations.NotNull()
    com.google.firebase.messaging.RemoteMessage message) {
    }
    
    @java.lang.Override()
    public void onDestroy() {
    }
}