package com.woocommerce.android.ui.prefs;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010\t\u001a\u00020\nH\u0016J\b\u0010\u000b\u001a\u00020\fH\u0016J\b\u0010\r\u001a\u00020\fH\u0016J\u0010\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u0010H\u0007J\u0018\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\fH\u0016J\u0010\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\fH\u0016J\u0010\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\bH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001a"}, d2 = {"Lcom/woocommerce/android/ui/prefs/PrivacySettingsPresenter;", "Lcom/woocommerce/android/ui/prefs/PrivacySettingsContract$Presenter;", "dispatcher", "Lorg/wordpress/android/fluxc/Dispatcher;", "accountStore", "Lorg/wordpress/android/fluxc/store/AccountStore;", "(Lorg/wordpress/android/fluxc/Dispatcher;Lorg/wordpress/android/fluxc/store/AccountStore;)V", "privacySettingsFragmentView", "Lcom/woocommerce/android/ui/prefs/PrivacySettingsContract$View;", "dropView", "", "getCrashReportingEnabled", "", "getSendUsageStats", "onAccountChanged", "event", "Lorg/wordpress/android/fluxc/store/AccountStore$OnAccountChanged;", "setCrashReportingEnabled", "context", "Landroid/content/Context;", "enabled", "setSendUsageStats", "sendUsageStats", "takeView", "view", "Companion", "WooCommerce_vanillaDebug"})
public final class PrivacySettingsPresenter implements com.woocommerce.android.ui.prefs.PrivacySettingsContract.Presenter {
    private final org.wordpress.android.fluxc.Dispatcher dispatcher = null;
    private final org.wordpress.android.fluxc.store.AccountStore accountStore = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.woocommerce.android.ui.prefs.PrivacySettingsPresenter.Companion Companion = null;
    private static final java.lang.String SETTING_TRACKS_OPT_OUT = "tracks_opt_out";
    private com.woocommerce.android.ui.prefs.PrivacySettingsContract.View privacySettingsFragmentView;
    
    @javax.inject.Inject()
    public PrivacySettingsPresenter(@org.jetbrains.annotations.NotNull()
    org.wordpress.android.fluxc.Dispatcher dispatcher, @org.jetbrains.annotations.NotNull()
    org.wordpress.android.fluxc.store.AccountStore accountStore) {
        super();
    }
    
    @java.lang.Override()
    public void takeView(@org.jetbrains.annotations.NotNull()
    com.woocommerce.android.ui.prefs.PrivacySettingsContract.View view) {
    }
    
    @java.lang.Override()
    public void dropView() {
    }
    
    @java.lang.Override()
    public boolean getSendUsageStats() {
        return false;
    }
    
    @java.lang.Override()
    public void setSendUsageStats(boolean sendUsageStats) {
    }
    
    @java.lang.Override()
    public boolean getCrashReportingEnabled() {
        return false;
    }
    
    @java.lang.Override()
    public void setCrashReportingEnabled(@org.jetbrains.annotations.NotNull()
    android.content.Context context, boolean enabled) {
    }
    
    @kotlin.Suppress(names = {"unused"})
    @org.greenrobot.eventbus.Subscribe(threadMode = org.greenrobot.eventbus.ThreadMode.MAIN)
    public final void onAccountChanged(@org.jetbrains.annotations.NotNull()
    org.wordpress.android.fluxc.store.AccountStore.OnAccountChanged event) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public kotlinx.coroutines.CoroutineScope getCoroutineScope() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/woocommerce/android/ui/prefs/PrivacySettingsPresenter$Companion;", "", "()V", "SETTING_TRACKS_OPT_OUT", "", "WooCommerce_vanillaDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}