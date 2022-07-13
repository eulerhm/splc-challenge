package com.woocommerce.android.ui.main;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001BG\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u00a2\u0006\u0002\u0010\u0012J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u0019H\u0016J\b\u0010\u001b\u001a\u00020\u0019H\u0016J\b\u0010\u001c\u001a\u00020\u0014H\u0016J\b\u0010\u001d\u001a\u00020\u0014H\u0016J\u0010\u0010\u001e\u001a\u00020\u00192\u0006\u0010\u001f\u001a\u00020 H\u0007J\u0010\u0010!\u001a\u00020\u00192\u0006\u0010\u001f\u001a\u00020\"H\u0007J\u0010\u0010#\u001a\u00020\u00192\u0006\u0010\u001f\u001a\u00020$H\u0007J\u0010\u0010#\u001a\u00020\u00192\u0006\u0010\u001f\u001a\u00020%H\u0007J\u000e\u0010#\u001a\u00020\u00192\u0006\u0010\u001f\u001a\u00020&J\u0010\u0010\'\u001a\u00020\u00192\u0006\u0010\u001f\u001a\u00020(H\u0007J\u0010\u0010)\u001a\u00020\u00192\u0006\u0010*\u001a\u00020+H\u0016J\u0010\u0010,\u001a\u00020\u00192\u0006\u0010-\u001a\u00020.H\u0016J\u0010\u0010/\u001a\u00020\u00192\u0006\u00100\u001a\u00020\u0016H\u0016J\b\u00101\u001a\u00020\u0014H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0014X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u00062"}, d2 = {"Lcom/woocommerce/android/ui/main/MainPresenter;", "Lcom/woocommerce/android/ui/main/MainContract$Presenter;", "dispatcher", "Lorg/wordpress/android/fluxc/Dispatcher;", "accountStore", "Lorg/wordpress/android/fluxc/store/AccountStore;", "wooCommerceStore", "Lorg/wordpress/android/fluxc/store/WooCommerceStore;", "selectedSite", "Lcom/woocommerce/android/tools/SelectedSite;", "productImageMap", "Lcom/woocommerce/android/tools/ProductImageMap;", "appPrefsWrapper", "Lcom/woocommerce/android/AppPrefsWrapper;", "wcOrderStore", "Lorg/wordpress/android/fluxc/store/WCOrderStore;", "clearCardReaderDataAction", "Lcom/woocommerce/android/ui/cardreader/ClearCardReaderDataAction;", "(Lorg/wordpress/android/fluxc/Dispatcher;Lorg/wordpress/android/fluxc/store/AccountStore;Lorg/wordpress/android/fluxc/store/WooCommerceStore;Lcom/woocommerce/android/tools/SelectedSite;Lcom/woocommerce/android/tools/ProductImageMap;Lcom/woocommerce/android/AppPrefsWrapper;Lorg/wordpress/android/fluxc/store/WCOrderStore;Lcom/woocommerce/android/ui/cardreader/ClearCardReaderDataAction;)V", "isHandlingMagicLink", "", "mainView", "Lcom/woocommerce/android/ui/main/MainContract$View;", "pendingUnfilledOrderCountCheck", "dropView", "", "fetchSitesAfterDowngrade", "fetchUnfilledOrderCount", "hasMultipleStores", "isUserEligible", "onAccountChanged", "event", "Lorg/wordpress/android/fluxc/store/AccountStore$OnAccountChanged;", "onAuthenticationChanged", "Lorg/wordpress/android/fluxc/store/AccountStore$OnAuthenticationChanged;", "onEventMainThread", "Lcom/woocommerce/android/extensions/NotificationReceivedEvent;", "Lcom/woocommerce/android/network/ConnectionChangeReceiver$ConnectionChangeEvent;", "Lcom/woocommerce/android/tools/SelectedSite$SelectedSiteChangedEvent;", "onOrderChanged", "Lorg/wordpress/android/fluxc/store/WCOrderStore$OnOrderChanged;", "selectedSiteChanged", "site", "Lorg/wordpress/android/fluxc/model/SiteModel;", "storeMagicLinkToken", "token", "", "takeView", "view", "userIsLoggedIn", "WooCommerce_wasabiDebug"})
public final class MainPresenter implements com.woocommerce.android.ui.main.MainContract.Presenter {
    private final org.wordpress.android.fluxc.Dispatcher dispatcher = null;
    private final org.wordpress.android.fluxc.store.AccountStore accountStore = null;
    private final org.wordpress.android.fluxc.store.WooCommerceStore wooCommerceStore = null;
    private final com.woocommerce.android.tools.SelectedSite selectedSite = null;
    private final com.woocommerce.android.tools.ProductImageMap productImageMap = null;
    private final com.woocommerce.android.AppPrefsWrapper appPrefsWrapper = null;
    private final org.wordpress.android.fluxc.store.WCOrderStore wcOrderStore = null;
    private final com.woocommerce.android.ui.cardreader.ClearCardReaderDataAction clearCardReaderDataAction = null;
    private com.woocommerce.android.ui.main.MainContract.View mainView;
    private boolean isHandlingMagicLink = false;
    private boolean pendingUnfilledOrderCountCheck = false;
    
    @javax.inject.Inject
    public MainPresenter(@org.jetbrains.annotations.NotNull
    org.wordpress.android.fluxc.Dispatcher dispatcher, @org.jetbrains.annotations.NotNull
    org.wordpress.android.fluxc.store.AccountStore accountStore, @org.jetbrains.annotations.NotNull
    org.wordpress.android.fluxc.store.WooCommerceStore wooCommerceStore, @org.jetbrains.annotations.NotNull
    com.woocommerce.android.tools.SelectedSite selectedSite, @org.jetbrains.annotations.NotNull
    com.woocommerce.android.tools.ProductImageMap productImageMap, @org.jetbrains.annotations.NotNull
    com.woocommerce.android.AppPrefsWrapper appPrefsWrapper, @org.jetbrains.annotations.NotNull
    org.wordpress.android.fluxc.store.WCOrderStore wcOrderStore, @org.jetbrains.annotations.NotNull
    com.woocommerce.android.ui.cardreader.ClearCardReaderDataAction clearCardReaderDataAction) {
        super();
    }
    
    @java.lang.Override
    public void takeView(@org.jetbrains.annotations.NotNull
    com.woocommerce.android.ui.main.MainContract.View view) {
    }
    
    @java.lang.Override
    public void dropView() {
    }
    
    @java.lang.Override
    public boolean userIsLoggedIn() {
        return false;
    }
    
    @java.lang.Override
    public void storeMagicLinkToken(@org.jetbrains.annotations.NotNull
    java.lang.String token) {
    }
    
    @java.lang.Override
    public boolean hasMultipleStores() {
        return false;
    }
    
    @java.lang.Override
    public void selectedSiteChanged(@org.jetbrains.annotations.NotNull
    org.wordpress.android.fluxc.model.SiteModel site) {
    }
    
    @java.lang.Override
    public void fetchUnfilledOrderCount() {
    }
    
    @java.lang.Override
    public void fetchSitesAfterDowngrade() {
    }
    
    @java.lang.Override
    public boolean isUserEligible() {
        return false;
    }
    
    @kotlin.Suppress(names = {"unused"})
    @org.greenrobot.eventbus.Subscribe(threadMode = org.greenrobot.eventbus.ThreadMode.MAIN)
    public final void onAuthenticationChanged(@org.jetbrains.annotations.NotNull
    org.wordpress.android.fluxc.store.AccountStore.OnAuthenticationChanged event) {
    }
    
    @kotlin.Suppress(names = {"unused"})
    @org.greenrobot.eventbus.Subscribe(threadMode = org.greenrobot.eventbus.ThreadMode.MAIN)
    public final void onAccountChanged(@org.jetbrains.annotations.NotNull
    org.wordpress.android.fluxc.store.AccountStore.OnAccountChanged event) {
    }
    
    @kotlin.Suppress(names = {"unused"})
    @org.greenrobot.eventbus.Subscribe(threadMode = org.greenrobot.eventbus.ThreadMode.MAIN)
    public final void onOrderChanged(@org.jetbrains.annotations.NotNull
    org.wordpress.android.fluxc.store.WCOrderStore.OnOrderChanged event) {
    }
    
    @kotlin.Suppress(names = {"unused"})
    @org.greenrobot.eventbus.Subscribe(threadMode = org.greenrobot.eventbus.ThreadMode.MAIN)
    public final void onEventMainThread(@org.jetbrains.annotations.NotNull
    com.woocommerce.android.network.ConnectionChangeReceiver.ConnectionChangeEvent event) {
    }
    
    @kotlin.Suppress(names = {"unused"})
    @org.greenrobot.eventbus.Subscribe(threadMode = org.greenrobot.eventbus.ThreadMode.MAIN)
    public final void onEventMainThread(@org.jetbrains.annotations.NotNull
    com.woocommerce.android.extensions.NotificationReceivedEvent event) {
    }
    
    public final void onEventMainThread(@org.jetbrains.annotations.NotNull
    com.woocommerce.android.tools.SelectedSite.SelectedSiteChangedEvent event) {
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public kotlinx.coroutines.CoroutineScope getCoroutineScope() {
        return null;
    }
}