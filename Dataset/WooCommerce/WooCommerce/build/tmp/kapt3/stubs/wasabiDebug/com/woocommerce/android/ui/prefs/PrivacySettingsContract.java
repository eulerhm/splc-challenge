package com.woocommerce.android.ui.prefs;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u00a8\u0006\u0004"}, d2 = {"Lcom/woocommerce/android/ui/prefs/PrivacySettingsContract;", "", "Presenter", "View", "WooCommerce_wasabiDebug"})
public abstract interface PrivacySettingsContract {
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0004H&J\b\u0010\u0005\u001a\u00020\u0004H&J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0004H&J\u0010\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u0004H&\u00a8\u0006\r"}, d2 = {"Lcom/woocommerce/android/ui/prefs/PrivacySettingsContract$Presenter;", "Lcom/woocommerce/android/ui/base/BasePresenter;", "Lcom/woocommerce/android/ui/prefs/PrivacySettingsContract$View;", "getCrashReportingEnabled", "", "getSendUsageStats", "setCrashReportingEnabled", "", "context", "Landroid/content/Context;", "enabled", "setSendUsageStats", "sendUsageStats", "WooCommerce_wasabiDebug"})
    public static abstract interface Presenter extends com.woocommerce.android.ui.base.BasePresenter<com.woocommerce.android.ui.prefs.PrivacySettingsContract.View> {
        
        public abstract boolean getSendUsageStats();
        
        public abstract void setSendUsageStats(boolean sendUsageStats);
        
        public abstract boolean getCrashReportingEnabled();
        
        public abstract void setCrashReportingEnabled(@org.jetbrains.annotations.NotNull
        android.content.Context context, boolean enabled);
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 3)
        public static final class DefaultImpls {
            
            /**
             * This method would need to be called by the inherited classes if
             * [coroutineScope] is being actively used, in order to cancel the coroutine
             *
             * See [OrderDetailPresenter] for more details
             */
            @java.lang.Override
            public static void dropView(@org.jetbrains.annotations.NotNull
            com.woocommerce.android.ui.prefs.PrivacySettingsContract.Presenter $this) {
            }
            
            @org.jetbrains.annotations.NotNull
            @java.lang.Override
            public static kotlinx.coroutines.CoroutineScope getCoroutineScope(@org.jetbrains.annotations.NotNull
            com.woocommerce.android.ui.prefs.PrivacySettingsContract.Presenter $this) {
                return null;
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0004H&J\b\u0010\u0005\u001a\u00020\u0004H&\u00a8\u0006\u0006"}, d2 = {"Lcom/woocommerce/android/ui/prefs/PrivacySettingsContract$View;", "Lcom/woocommerce/android/ui/base/BaseView;", "Lcom/woocommerce/android/ui/prefs/PrivacySettingsContract$Presenter;", "showCookiePolicy", "", "showPrivacyPolicy", "WooCommerce_wasabiDebug"})
    public static abstract interface View extends com.woocommerce.android.ui.base.BaseView<com.woocommerce.android.ui.prefs.PrivacySettingsContract.Presenter> {
        
        public abstract void showCookiePolicy();
        
        public abstract void showPrivacyPolicy();
    }
}