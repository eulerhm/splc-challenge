package com.woocommerce.android.ui.main;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u00a8\u0006\u0004"}, d2 = {"Lcom/woocommerce/android/ui/main/MainContract;", "", "Presenter", "View", "WooCommerce_vanillaDebug"})
public abstract interface MainContract {
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0004H&J\b\u0010\u0005\u001a\u00020\u0004H&J\b\u0010\u0006\u001a\u00020\u0007H&J\b\u0010\b\u001a\u00020\u0007H&J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000bH&J\u0010\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u000eH&J\b\u0010\u000f\u001a\u00020\u0007H&\u00a8\u0006\u0010"}, d2 = {"Lcom/woocommerce/android/ui/main/MainContract$Presenter;", "Lcom/woocommerce/android/ui/base/BasePresenter;", "Lcom/woocommerce/android/ui/main/MainContract$View;", "fetchSitesAfterDowngrade", "", "fetchUnfilledOrderCount", "hasMultipleStores", "", "isUserEligible", "selectedSiteChanged", "site", "Lorg/wordpress/android/fluxc/model/SiteModel;", "storeMagicLinkToken", "token", "", "userIsLoggedIn", "WooCommerce_vanillaDebug"})
    public static abstract interface Presenter extends com.woocommerce.android.ui.base.BasePresenter<com.woocommerce.android.ui.main.MainContract.View> {
        
        public abstract boolean userIsLoggedIn();
        
        public abstract void storeMagicLinkToken(@org.jetbrains.annotations.NotNull()
        java.lang.String token);
        
        public abstract boolean hasMultipleStores();
        
        public abstract void selectedSiteChanged(@org.jetbrains.annotations.NotNull()
        org.wordpress.android.fluxc.model.SiteModel site);
        
        public abstract void fetchUnfilledOrderCount();
        
        public abstract void fetchSitesAfterDowngrade();
        
        public abstract boolean isUserEligible();
        
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
            com.woocommerce.android.ui.main.MainContract.Presenter $this) {
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public static kotlinx.coroutines.CoroutineScope getCoroutineScope(@org.jetbrains.annotations.NotNull()
            com.woocommerce.android.ui.main.MainContract.Presenter $this) {
                return null;
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0004H&J\b\u0010\u0005\u001a\u00020\u0004H&J\b\u0010\u0006\u001a\u00020\u0004H&J\b\u0010\u0007\u001a\u00020\u0004H&J\b\u0010\b\u001a\u00020\u0004H&J\b\u0010\t\u001a\u00020\u0004H&J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\fH&J\u0012\u0010\r\u001a\u00020\u00042\b\b\u0001\u0010\u000e\u001a\u00020\fH&J\b\u0010\u000f\u001a\u00020\u0004H&J\u0010\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0012H&J\u0010\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0012H&J\b\u0010\u0015\u001a\u00020\u0004H&\u00a8\u0006\u0016"}, d2 = {"Lcom/woocommerce/android/ui/main/MainContract$View;", "Lcom/woocommerce/android/ui/base/BaseView;", "Lcom/woocommerce/android/ui/main/MainContract$Presenter;", "hideBottomNav", "", "hideOrderBadge", "hideProgressDialog", "notifyTokenUpdated", "showBottomNav", "showLoginScreen", "showOrderBadge", "count", "", "showProgressDialog", "stringId", "showUserEligibilityErrorScreen", "updateOfflineStatusBar", "isConnected", "", "updateOrderBadge", "hideCountUntilComplete", "updateSelectedSite", "WooCommerce_vanillaDebug"})
    public static abstract interface View extends com.woocommerce.android.ui.base.BaseView<com.woocommerce.android.ui.main.MainContract.Presenter> {
        
        public abstract void notifyTokenUpdated();
        
        public abstract void showLoginScreen();
        
        public abstract void updateSelectedSite();
        
        public abstract void updateOfflineStatusBar(boolean isConnected);
        
        public abstract void hideBottomNav();
        
        public abstract void showBottomNav();
        
        public abstract void hideOrderBadge();
        
        public abstract void showOrderBadge(int count);
        
        public abstract void updateOrderBadge(boolean hideCountUntilComplete);
        
        public abstract void hideProgressDialog();
        
        public abstract void showProgressDialog(@androidx.annotation.StringRes()
        int stringId);
        
        public abstract void showUserEligibilityErrorScreen();
    }
}