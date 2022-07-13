package com.woocommerce.android.ui.prefs;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u00a8\u0006\u0004"}, d2 = {"Lcom/woocommerce/android/ui/prefs/AppSettingsContract;", "", "Presenter", "View", "WooCommerce_wasabiDebug"})
public abstract interface AppSettingsContract {
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0004H&J\b\u0010\u0005\u001a\u00020\u0006H&J\b\u0010\u0007\u001a\u00020\bH&\u00a8\u0006\t"}, d2 = {"Lcom/woocommerce/android/ui/prefs/AppSettingsContract$Presenter;", "Lcom/woocommerce/android/ui/base/BasePresenter;", "Lcom/woocommerce/android/ui/prefs/AppSettingsContract$View;", "getAccountDisplayName", "", "logout", "", "userIsLoggedIn", "", "WooCommerce_wasabiDebug"})
    public static abstract interface Presenter extends com.woocommerce.android.ui.base.BasePresenter<com.woocommerce.android.ui.prefs.AppSettingsContract.View> {
        
        public abstract void logout();
        
        public abstract boolean userIsLoggedIn();
        
        @org.jetbrains.annotations.NotNull
        public abstract java.lang.String getAccountDisplayName();
        
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
            com.woocommerce.android.ui.prefs.AppSettingsContract.Presenter $this) {
            }
            
            @org.jetbrains.annotations.NotNull
            @java.lang.Override
            public static kotlinx.coroutines.CoroutineScope getCoroutineScope(@org.jetbrains.annotations.NotNull
            com.woocommerce.android.ui.prefs.AppSettingsContract.Presenter $this) {
                return null;
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0004H&J\b\u0010\u0005\u001a\u00020\u0004H&J\b\u0010\u0006\u001a\u00020\u0004H&\u00a8\u0006\u0007"}, d2 = {"Lcom/woocommerce/android/ui/prefs/AppSettingsContract$View;", "Lcom/woocommerce/android/ui/base/BaseView;", "Lcom/woocommerce/android/ui/prefs/AppSettingsContract$Presenter;", "close", "", "confirmLogout", "finishLogout", "WooCommerce_wasabiDebug"})
    public static abstract interface View extends com.woocommerce.android.ui.base.BaseView<com.woocommerce.android.ui.prefs.AppSettingsContract.Presenter> {
        
        public abstract void close();
        
        public abstract void finishLogout();
        
        public abstract void confirmLogout();
    }
}