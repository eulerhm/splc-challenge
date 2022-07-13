package com.woocommerce.android.tools;

import java.lang.System;

/**
 * A wrapper for the currently active [SiteModel] for the app.
 * Persists and restores the selected site to/from the app preferences.
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u001a2\u00020\u0001:\u0002\u001a\u001bB\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0006\u0010\n\u001a\u00020\u000bJ\u0006\u0010\f\u001a\u00020\tJ\b\u0010\r\u001a\u0004\u0018\u00010\tJ\u0010\u0010\u000e\u001a\n \u0010*\u0004\u0018\u00010\u000f0\u000fH\u0002J\n\u0010\u0011\u001a\u0004\u0018\u00010\tH\u0002J\u0006\u0010\u0012\u001a\u00020\u0013J\u000e\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0015J\u0006\u0010\u0016\u001a\u00020\u0017J\u000e\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001c"}, d2 = {"Lcom/woocommerce/android/tools/SelectedSite;", "", "context", "Landroid/content/Context;", "siteStore", "Lorg/wordpress/android/fluxc/store/SiteStore;", "(Landroid/content/Context;Lorg/wordpress/android/fluxc/store/SiteStore;)V", "state", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lorg/wordpress/android/fluxc/model/SiteModel;", "exists", "", "get", "getIfExists", "getPreferences", "Landroid/content/SharedPreferences;", "kotlin.jvm.PlatformType", "getSelectedSiteFromPersistance", "getSelectedSiteId", "", "observe", "Lkotlinx/coroutines/flow/Flow;", "reset", "", "set", "siteModel", "Companion", "SelectedSiteChangedEvent", "WooCommerce_vanillaDebug"})
@javax.inject.Singleton()
public final class SelectedSite {
    private final android.content.Context context = null;
    private final org.wordpress.android.fluxc.store.SiteStore siteStore = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.woocommerce.android.tools.SelectedSite.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String SELECTED_SITE_LOCAL_ID = "SELECTED_SITE_LOCAL_ID";
    private final kotlinx.coroutines.flow.MutableStateFlow<org.wordpress.android.fluxc.model.SiteModel> state = null;
    
    public SelectedSite(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    org.wordpress.android.fluxc.store.SiteStore siteStore) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<org.wordpress.android.fluxc.model.SiteModel> observe() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.wordpress.android.fluxc.model.SiteModel get() {
        return null;
    }
    
    public final void set(@org.jetbrains.annotations.NotNull()
    org.wordpress.android.fluxc.model.SiteModel siteModel) {
    }
    
    public final boolean exists() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.wordpress.android.fluxc.model.SiteModel getIfExists() {
        return null;
    }
    
    public final int getSelectedSiteId() {
        return 0;
    }
    
    public final void reset() {
    }
    
    private final android.content.SharedPreferences getPreferences() {
        return null;
    }
    
    private final org.wordpress.android.fluxc.model.SiteModel getSelectedSiteFromPersistance() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/woocommerce/android/tools/SelectedSite$SelectedSiteChangedEvent;", "", "site", "Lorg/wordpress/android/fluxc/model/SiteModel;", "(Lorg/wordpress/android/fluxc/model/SiteModel;)V", "getSite", "()Lorg/wordpress/android/fluxc/model/SiteModel;", "WooCommerce_vanillaDebug"})
    @java.lang.Deprecated()
    public static final class SelectedSiteChangedEvent {
        @org.jetbrains.annotations.NotNull()
        private final org.wordpress.android.fluxc.model.SiteModel site = null;
        
        public SelectedSiteChangedEvent(@org.jetbrains.annotations.NotNull()
        org.wordpress.android.fluxc.model.SiteModel site) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final org.wordpress.android.fluxc.model.SiteModel getSite() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0005\u001a\u00020\u0006R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"}, d2 = {"Lcom/woocommerce/android/tools/SelectedSite$Companion;", "", "()V", "SELECTED_SITE_LOCAL_ID", "", "getEventBus", "Lorg/greenrobot/eventbus/EventBus;", "WooCommerce_vanillaDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final org.greenrobot.eventbus.EventBus getEventBus() {
            return null;
        }
    }
}