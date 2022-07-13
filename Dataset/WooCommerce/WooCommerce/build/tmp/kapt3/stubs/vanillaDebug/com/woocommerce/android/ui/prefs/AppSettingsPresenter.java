package com.woocommerce.android.ui.prefs;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\b\u0010\r\u001a\u00020\u000eH\u0016J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u000eH\u0016J\u0010\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0014H\u0007J\u0010\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0016H\u0007J\u0010\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\fH\u0016J\b\u0010\u0019\u001a\u00020\u001aH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001b"}, d2 = {"Lcom/woocommerce/android/ui/prefs/AppSettingsPresenter;", "Lcom/woocommerce/android/ui/prefs/AppSettingsContract$Presenter;", "dispatcher", "Lorg/wordpress/android/fluxc/Dispatcher;", "accountStore", "Lorg/wordpress/android/fluxc/store/AccountStore;", "notificationStore", "Lorg/wordpress/android/fluxc/store/NotificationStore;", "clearCardReaderDataAction", "Lcom/woocommerce/android/ui/cardreader/ClearCardReaderDataAction;", "(Lorg/wordpress/android/fluxc/Dispatcher;Lorg/wordpress/android/fluxc/store/AccountStore;Lorg/wordpress/android/fluxc/store/NotificationStore;Lcom/woocommerce/android/ui/cardreader/ClearCardReaderDataAction;)V", "appSettingsView", "Lcom/woocommerce/android/ui/prefs/AppSettingsContract$View;", "dropView", "", "getAccountDisplayName", "", "logout", "onAuthenticationChanged", "event", "Lorg/wordpress/android/fluxc/store/AccountStore$OnAuthenticationChanged;", "onDeviceUnregistered", "Lorg/wordpress/android/fluxc/store/NotificationStore$OnDeviceUnregistered;", "takeView", "view", "userIsLoggedIn", "", "WooCommerce_vanillaDebug"})
public final class AppSettingsPresenter implements com.woocommerce.android.ui.prefs.AppSettingsContract.Presenter {
    private final org.wordpress.android.fluxc.Dispatcher dispatcher = null;
    private final org.wordpress.android.fluxc.store.AccountStore accountStore = null;
    private final org.wordpress.android.fluxc.store.NotificationStore notificationStore = null;
    private final com.woocommerce.android.ui.cardreader.ClearCardReaderDataAction clearCardReaderDataAction = null;
    private com.woocommerce.android.ui.prefs.AppSettingsContract.View appSettingsView;
    
    @javax.inject.Inject()
    public AppSettingsPresenter(@org.jetbrains.annotations.NotNull()
    org.wordpress.android.fluxc.Dispatcher dispatcher, @org.jetbrains.annotations.NotNull()
    org.wordpress.android.fluxc.store.AccountStore accountStore, @org.jetbrains.annotations.NotNull()
    @kotlin.Suppress(names = {"unused"})
    org.wordpress.android.fluxc.store.NotificationStore notificationStore, @org.jetbrains.annotations.NotNull()
    com.woocommerce.android.ui.cardreader.ClearCardReaderDataAction clearCardReaderDataAction) {
        super();
    }
    
    @java.lang.Override()
    public void takeView(@org.jetbrains.annotations.NotNull()
    com.woocommerce.android.ui.prefs.AppSettingsContract.View view) {
    }
    
    @java.lang.Override()
    public void dropView() {
    }
    
    @java.lang.Override()
    public void logout() {
    }
    
    @java.lang.Override()
    public boolean userIsLoggedIn() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getAccountDisplayName() {
        return null;
    }
    
    @kotlin.Suppress(names = {"unused"})
    @org.greenrobot.eventbus.Subscribe(threadMode = org.greenrobot.eventbus.ThreadMode.MAIN)
    public final void onDeviceUnregistered(@org.jetbrains.annotations.NotNull()
    org.wordpress.android.fluxc.store.NotificationStore.OnDeviceUnregistered event) {
    }
    
    @kotlin.Suppress(names = {"unused"})
    @org.greenrobot.eventbus.Subscribe(threadMode = org.greenrobot.eventbus.ThreadMode.MAIN)
    public final void onAuthenticationChanged(@org.jetbrains.annotations.NotNull()
    org.wordpress.android.fluxc.store.AccountStore.OnAuthenticationChanged event) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public kotlinx.coroutines.CoroutineScope getCoroutineScope() {
        return null;
    }
}