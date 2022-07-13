package com.woocommerce.android.ui.prefs;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B/\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\fJ\b\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\b\u0010\u0015\u001a\u00020\u0014H\u0016J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u0012H\u0016J\b\u0010\u0019\u001a\u00020\u0012H\u0016J\u0010\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\u000eH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001c"}, d2 = {"Lcom/woocommerce/android/ui/prefs/MainSettingsPresenter;", "Lcom/woocommerce/android/ui/prefs/MainSettingsContract$Presenter;", "selectedSite", "Lcom/woocommerce/android/tools/SelectedSite;", "accountStore", "Lorg/wordpress/android/fluxc/store/AccountStore;", "wooCommerceStore", "Lorg/wordpress/android/fluxc/store/WooCommerceStore;", "featureAnnouncementRepository", "Lcom/woocommerce/android/ui/whatsnew/FeatureAnnouncementRepository;", "buildConfigWrapper", "Lcom/woocommerce/android/util/BuildConfigWrapper;", "(Lcom/woocommerce/android/tools/SelectedSite;Lorg/wordpress/android/fluxc/store/AccountStore;Lorg/wordpress/android/fluxc/store/WooCommerceStore;Lcom/woocommerce/android/ui/whatsnew/FeatureAnnouncementRepository;Lcom/woocommerce/android/util/BuildConfigWrapper;)V", "appSettingsFragmentView", "Lcom/woocommerce/android/ui/prefs/MainSettingsContract$View;", "jetpackMonitoringJob", "Lkotlinx/coroutines/Job;", "dropView", "", "getStoreDomainName", "", "getUserDisplayName", "hasMultipleStores", "", "setupAnnouncementOption", "setupJetpackInstallOption", "takeView", "view", "WooCommerce_wasabiDebug"})
public final class MainSettingsPresenter implements com.woocommerce.android.ui.prefs.MainSettingsContract.Presenter {
    private final com.woocommerce.android.tools.SelectedSite selectedSite = null;
    private final org.wordpress.android.fluxc.store.AccountStore accountStore = null;
    private final org.wordpress.android.fluxc.store.WooCommerceStore wooCommerceStore = null;
    private final com.woocommerce.android.ui.whatsnew.FeatureAnnouncementRepository featureAnnouncementRepository = null;
    private final com.woocommerce.android.util.BuildConfigWrapper buildConfigWrapper = null;
    private com.woocommerce.android.ui.prefs.MainSettingsContract.View appSettingsFragmentView;
    private kotlinx.coroutines.Job jetpackMonitoringJob;
    
    @javax.inject.Inject
    public MainSettingsPresenter(@org.jetbrains.annotations.NotNull
    com.woocommerce.android.tools.SelectedSite selectedSite, @org.jetbrains.annotations.NotNull
    org.wordpress.android.fluxc.store.AccountStore accountStore, @org.jetbrains.annotations.NotNull
    org.wordpress.android.fluxc.store.WooCommerceStore wooCommerceStore, @org.jetbrains.annotations.NotNull
    com.woocommerce.android.ui.whatsnew.FeatureAnnouncementRepository featureAnnouncementRepository, @org.jetbrains.annotations.NotNull
    com.woocommerce.android.util.BuildConfigWrapper buildConfigWrapper) {
        super();
    }
    
    @java.lang.Override
    public void takeView(@org.jetbrains.annotations.NotNull
    com.woocommerce.android.ui.prefs.MainSettingsContract.View view) {
    }
    
    @java.lang.Override
    public void dropView() {
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.lang.String getUserDisplayName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.lang.String getStoreDomainName() {
        return null;
    }
    
    @java.lang.Override
    public boolean hasMultipleStores() {
        return false;
    }
    
    @java.lang.Override
    public void setupAnnouncementOption() {
    }
    
    @java.lang.Override
    public void setupJetpackInstallOption() {
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public kotlinx.coroutines.CoroutineScope getCoroutineScope() {
        return null;
    }
}