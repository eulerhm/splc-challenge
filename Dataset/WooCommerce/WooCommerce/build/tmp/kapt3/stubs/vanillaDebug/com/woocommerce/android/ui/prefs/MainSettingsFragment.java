package com.woocommerce.android.ui.prefs;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 )2\u00020\u00012\u00020\u0002:\u0002()B\u0005\u00a2\u0006\u0002\u0010\u0003J\u000e\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0002J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u0015H\u0016J\b\u0010\u0019\u001a\u00020\u0015H\u0016J\u001a\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0016J\b\u0010\u001f\u001a\u00020\u0015H\u0016J\u0010\u0010 \u001a\u00020\u00152\u0006\u0010!\u001a\u00020\"H\u0016J\b\u0010#\u001a\u00020\u0015H\u0002J\u0018\u0010$\u001a\u00020\u00152\u0006\u0010%\u001a\u00020\u00132\u0006\u0010&\u001a\u00020\u0017H\u0002J\b\u0010\'\u001a\u00020\u0015H\u0002R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u00058BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u000e\u0010\u000f\u001a\u00020\u0010X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006*"}, d2 = {"Lcom/woocommerce/android/ui/prefs/MainSettingsFragment;", "Landroidx/fragment/app/Fragment;", "Lcom/woocommerce/android/ui/prefs/MainSettingsContract$View;", "()V", "_binding", "Lcom/woocommerce/android/databinding/FragmentSettingsMainBinding;", "binding", "getBinding", "()Lcom/woocommerce/android/databinding/FragmentSettingsMainBinding;", "presenter", "Lcom/woocommerce/android/ui/prefs/MainSettingsContract$Presenter;", "getPresenter", "()Lcom/woocommerce/android/ui/prefs/MainSettingsContract$Presenter;", "setPresenter", "(Lcom/woocommerce/android/ui/prefs/MainSettingsContract$Presenter;)V", "settingsListener", "Lcom/woocommerce/android/ui/prefs/MainSettingsFragment$AppSettingsListener;", "generateBetaFeaturesTitleList", "", "", "handleJetpackInstallOption", "", "isJetpackCPSite", "", "onDestroyView", "onResume", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "showDeviceAppNotificationSettings", "showLatestAnnouncementOption", "announcement", "Lcom/woocommerce/android/model/FeatureAnnouncement;", "showThemeChooser", "trackSettingToggled", "keyName", "newValue", "updateStoreSettings", "AppSettingsListener", "Companion", "WooCommerce_vanillaDebug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class MainSettingsFragment extends androidx.fragment.app.Fragment implements com.woocommerce.android.ui.prefs.MainSettingsContract.View {
    @org.jetbrains.annotations.NotNull()
    public static final com.woocommerce.android.ui.prefs.MainSettingsFragment.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String TAG = "main-settings";
    private static final java.lang.String SETTING_NOTIFS_ORDERS = "notifications_orders";
    private static final java.lang.String SETTING_NOTIFS_REVIEWS = "notifications_reviews";
    private static final java.lang.String SETTING_NOTIFS_TONE = "notifications_tone";
    @javax.inject.Inject()
    public com.woocommerce.android.ui.prefs.MainSettingsContract.Presenter presenter;
    private com.woocommerce.android.databinding.FragmentSettingsMainBinding _binding;
    private com.woocommerce.android.ui.prefs.MainSettingsFragment.AppSettingsListener settingsListener;
    
    public MainSettingsFragment() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.woocommerce.android.ui.prefs.MainSettingsContract.Presenter getPresenter() {
        return null;
    }
    
    public final void setPresenter(@org.jetbrains.annotations.NotNull()
    com.woocommerce.android.ui.prefs.MainSettingsContract.Presenter p0) {
    }
    
    private final com.woocommerce.android.databinding.FragmentSettingsMainBinding getBinding() {
        return null;
    }
    
    @kotlin.Suppress(names = {"ForbiddenComment", "LongMethod"})
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onResume() {
    }
    
    @java.lang.Override()
    public void onDestroyView() {
    }
    
    /**
     * Shows the device's notification settings for this app - only implemented for API 26+ since we only call
     * this on API 26+ devices (will do nothing on older devices)
     */
    @java.lang.Override()
    public void showDeviceAppNotificationSettings() {
    }
    
    @java.lang.Override()
    public void handleJetpackInstallOption(boolean isJetpackCPSite) {
    }
    
    @java.lang.Override()
    public void showLatestAnnouncementOption(@org.jetbrains.annotations.NotNull()
    com.woocommerce.android.model.FeatureAnnouncement announcement) {
    }
    
    private final void updateStoreSettings() {
    }
    
    private final java.util.List<java.lang.String> generateBetaFeaturesTitleList() {
        return null;
    }
    
    /**
     * Called when a boolean setting is changed so we can track it
     */
    private final void trackSettingToggled(java.lang.String keyName, boolean newValue) {
    }
    
    private final void showThemeChooser() {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0007\u001a\u00020\u0003H&\u00a8\u0006\b"}, d2 = {"Lcom/woocommerce/android/ui/prefs/MainSettingsFragment$AppSettingsListener;", "", "onCouponsOptionChanged", "", "enabled", "", "onProductAddonsOptionChanged", "onRequestLogout", "WooCommerce_vanillaDebug"})
    public static abstract interface AppSettingsListener {
        
        public abstract void onRequestLogout();
        
        public abstract void onProductAddonsOptionChanged(boolean enabled);
        
        public abstract void onCouponsOptionChanged(boolean enabled);
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lcom/woocommerce/android/ui/prefs/MainSettingsFragment$Companion;", "", "()V", "SETTING_NOTIFS_ORDERS", "", "SETTING_NOTIFS_REVIEWS", "SETTING_NOTIFS_TONE", "TAG", "WooCommerce_vanillaDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}