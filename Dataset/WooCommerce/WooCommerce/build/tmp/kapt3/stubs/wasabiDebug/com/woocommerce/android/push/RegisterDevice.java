package com.woocommerce.android.push;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\u0012B\'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u0019\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0086B\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fJ\u0011\u0010\u0010\u001a\u00020\fH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0011R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0013"}, d2 = {"Lcom/woocommerce/android/push/RegisterDevice;", "", "appPrefsWrapper", "Lcom/woocommerce/android/AppPrefsWrapper;", "accountStore", "Lorg/wordpress/android/fluxc/store/AccountStore;", "notificationRepository", "Lcom/woocommerce/android/push/NotificationRepository;", "getDeviceRegistrationStatus", "Lorg/wordpress/android/fluxc/store/GetDeviceRegistrationStatus;", "(Lcom/woocommerce/android/AppPrefsWrapper;Lorg/wordpress/android/fluxc/store/AccountStore;Lcom/woocommerce/android/push/NotificationRepository;Lorg/wordpress/android/fluxc/store/GetDeviceRegistrationStatus;)V", "invoke", "", "mode", "Lcom/woocommerce/android/push/RegisterDevice$Mode;", "(Lcom/woocommerce/android/push/RegisterDevice$Mode;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sendToken", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Mode", "WooCommerce_wasabiDebug"})
public final class RegisterDevice {
    private final com.woocommerce.android.AppPrefsWrapper appPrefsWrapper = null;
    private final org.wordpress.android.fluxc.store.AccountStore accountStore = null;
    private final com.woocommerce.android.push.NotificationRepository notificationRepository = null;
    private final org.wordpress.android.fluxc.store.GetDeviceRegistrationStatus getDeviceRegistrationStatus = null;
    
    @javax.inject.Inject
    public RegisterDevice(@org.jetbrains.annotations.NotNull
    com.woocommerce.android.AppPrefsWrapper appPrefsWrapper, @org.jetbrains.annotations.NotNull
    org.wordpress.android.fluxc.store.AccountStore accountStore, @org.jetbrains.annotations.NotNull
    com.woocommerce.android.push.NotificationRepository notificationRepository, @org.jetbrains.annotations.NotNull
    org.wordpress.android.fluxc.store.GetDeviceRegistrationStatus getDeviceRegistrationStatus) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object invoke(@org.jetbrains.annotations.NotNull
    com.woocommerce.android.push.RegisterDevice.Mode mode, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    private final java.lang.Object sendToken(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/woocommerce/android/push/RegisterDevice$Mode;", "", "(Ljava/lang/String;I)V", "IF_NEEDED", "FORCEFULLY", "WooCommerce_wasabiDebug"})
    public static enum Mode {
        /*public static final*/ IF_NEEDED /* = new IF_NEEDED() */,
        /*public static final*/ FORCEFULLY /* = new FORCEFULLY() */;
        
        Mode() {
        }
    }
}