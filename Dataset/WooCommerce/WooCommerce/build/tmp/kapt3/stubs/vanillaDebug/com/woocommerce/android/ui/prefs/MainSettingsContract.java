package com.woocommerce.android.ui.prefs;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u00a8\u0006\u0004"}, d2 = {"Lcom/woocommerce/android/ui/prefs/MainSettingsContract;", "", "Presenter", "View", "WooCommerce_vanillaDebug"})
public abstract interface MainSettingsContract {
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0004H&J\b\u0010\u0005\u001a\u00020\u0004H&J\b\u0010\u0006\u001a\u00020\u0007H&J\b\u0010\b\u001a\u00020\tH&J\b\u0010\n\u001a\u00020\tH&\u00a8\u0006\u000b"}, d2 = {"Lcom/woocommerce/android/ui/prefs/MainSettingsContract$Presenter;", "Lcom/woocommerce/android/ui/base/BasePresenter;", "Lcom/woocommerce/android/ui/prefs/MainSettingsContract$View;", "getStoreDomainName", "", "getUserDisplayName", "hasMultipleStores", "", "setupAnnouncementOption", "", "setupJetpackInstallOption", "WooCommerce_vanillaDebug"})
    public static abstract interface Presenter extends com.woocommerce.android.ui.base.BasePresenter<com.woocommerce.android.ui.prefs.MainSettingsContract.View> {
        
        @org.jetbrains.annotations.NotNull()
        public abstract java.lang.String getUserDisplayName();
        
        @org.jetbrains.annotations.NotNull()
        public abstract java.lang.String getStoreDomainName();
        
        public abstract boolean hasMultipleStores();
        
        public abstract void setupAnnouncementOption();
        
        public abstract void setupJetpackInstallOption();
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 3)
        public static final class DefaultImpls {
            
            /**
             * This method would need to be called by the inherited classes if
             * [coroutineScope] is being actively used, in order to cancel the coroutine
             *
             * See [OrderDetailPresenter] for more details
             */
            @java.lang.Override()
            public static void dropView(@org.jetbrains.annotations.NotNull()
            com.woocommerce.android.ui.prefs.MainSettingsContract.Presenter $this) {
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public static kotlinx.coroutines.CoroutineScope getCoroutineScope(@org.jetbrains.annotations.NotNull()
            com.woocommerce.android.ui.prefs.MainSettingsContract.Presenter $this) {
                return null;
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H&J\b\u0010\u0007\u001a\u00020\u0004H&J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\nH&\u00a8\u0006\u000b"}, d2 = {"Lcom/woocommerce/android/ui/prefs/MainSettingsContract$View;", "Lcom/woocommerce/android/ui/base/BaseView;", "Lcom/woocommerce/android/ui/prefs/MainSettingsContract$Presenter;", "handleJetpackInstallOption", "", "isJetpackCPSite", "", "showDeviceAppNotificationSettings", "showLatestAnnouncementOption", "announcement", "Lcom/woocommerce/android/model/FeatureAnnouncement;", "WooCommerce_vanillaDebug"})
    public static abstract interface View extends com.woocommerce.android.ui.base.BaseView<com.woocommerce.android.ui.prefs.MainSettingsContract.Presenter> {
        
        public abstract void showDeviceAppNotificationSettings();
        
        public abstract void showLatestAnnouncementOption(@org.jetbrains.annotations.NotNull()
        com.woocommerce.android.model.FeatureAnnouncement announcement);
        
        public abstract void handleJetpackInstallOption(boolean isJetpackCPSite);
    }
}