package com.woocommerce.android.ui.jetpack;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u001c2\u00020\u0001:\u0004\u001c\u001d\u001e\u001fB\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ \u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u0012J\u001b\u0010\u0013\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u000e\u001a\u00020\u000fH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0014J\u001c\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u00162\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u000fJ\u0006\u0010\u0018\u001a\u00020\rJ\u0010\u0010\u0019\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\u001bH\u0007R\u0016\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006 "}, d2 = {"Lcom/woocommerce/android/ui/jetpack/PluginRepository;", "", "dispatcher", "Lorg/wordpress/android/fluxc/Dispatcher;", "selectedSite", "Lcom/woocommerce/android/tools/SelectedSite;", "pluginStore", "Lorg/wordpress/android/fluxc/store/PluginStore;", "(Lorg/wordpress/android/fluxc/Dispatcher;Lcom/woocommerce/android/tools/SelectedSite;Lorg/wordpress/android/fluxc/store/PluginStore;)V", "continuationFetchJetpackSitePlugin", "Lcom/woocommerce/android/util/ContinuationWrapper;", "Lorg/wordpress/android/fluxc/model/plugin/SitePluginModel;", "activatePlugin", "", "name", "", "slug", "enableAutoUpdate", "", "fetchJetpackSitePlugin", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "installPlugin", "Lkotlinx/coroutines/flow/Flow;", "Lcom/woocommerce/android/ui/jetpack/PluginRepository$PluginStatus;", "onCleanup", "onSitePluginFetched", "event", "Lorg/wordpress/android/fluxc/store/PluginStore$OnJetpackSitePluginFetched;", "Companion", "PluginActionListener", "PluginException", "PluginStatus", "WooCommerce_wasabiDebug"})
public final class PluginRepository {
    private final org.wordpress.android.fluxc.Dispatcher dispatcher = null;
    private final com.woocommerce.android.tools.SelectedSite selectedSite = null;
    private final org.wordpress.android.fluxc.store.PluginStore pluginStore = null;
    @org.jetbrains.annotations.NotNull
    public static final com.woocommerce.android.ui.jetpack.PluginRepository.Companion Companion = null;
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String GENERIC_ERROR = "Unknown issue.";
    public static final int ATTEMPT_LIMIT = 2;
    private com.woocommerce.android.util.ContinuationWrapper<org.wordpress.android.fluxc.model.plugin.SitePluginModel> continuationFetchJetpackSitePlugin;
    
    @javax.inject.Inject
    public PluginRepository(@org.jetbrains.annotations.NotNull
    org.wordpress.android.fluxc.Dispatcher dispatcher, @org.jetbrains.annotations.NotNull
    com.woocommerce.android.tools.SelectedSite selectedSite, @org.jetbrains.annotations.NotNull
    @kotlin.Suppress(names = {"unused"})
    org.wordpress.android.fluxc.store.PluginStore pluginStore) {
        super();
    }
    
    public final void onCleanup() {
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.Flow<com.woocommerce.android.ui.jetpack.PluginRepository.PluginStatus> installPlugin(@org.jetbrains.annotations.NotNull
    java.lang.String slug, @org.jetbrains.annotations.NotNull
    java.lang.String name) {
        return null;
    }
    
    private final java.lang.Object fetchJetpackSitePlugin(java.lang.String name, kotlin.coroutines.Continuation<? super org.wordpress.android.fluxc.model.plugin.SitePluginModel> continuation) {
        return null;
    }
    
    public final void activatePlugin(@org.jetbrains.annotations.NotNull
    java.lang.String name, @org.jetbrains.annotations.NotNull
    java.lang.String slug, boolean enableAutoUpdate) {
    }
    
    @kotlin.Suppress(names = {"unused"})
    @org.greenrobot.eventbus.Subscribe(threadMode = org.greenrobot.eventbus.ThreadMode.MAIN)
    public final void onSitePluginFetched(@org.jetbrains.annotations.NotNull
    org.wordpress.android.fluxc.store.PluginStore.OnJetpackSitePluginFetched event) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\u0002\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0007J\u0010\u0010\n\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u000bH\u0007R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lcom/woocommerce/android/ui/jetpack/PluginRepository$PluginActionListener;", "", "producerScope", "Lkotlinx/coroutines/channels/ProducerScope;", "Lcom/woocommerce/android/ui/jetpack/PluginRepository$PluginStatus;", "(Lcom/woocommerce/android/ui/jetpack/PluginRepository;Lkotlinx/coroutines/channels/ProducerScope;)V", "onSitePluginConfigured", "", "event", "Lorg/wordpress/android/fluxc/store/PluginStore$OnSitePluginConfigured;", "onSitePluginInstalled", "Lorg/wordpress/android/fluxc/store/PluginStore$OnSitePluginInstalled;", "WooCommerce_wasabiDebug"})
    final class PluginActionListener {
        private final kotlinx.coroutines.channels.ProducerScope<com.woocommerce.android.ui.jetpack.PluginRepository.PluginStatus> producerScope = null;
        
        public PluginActionListener(@org.jetbrains.annotations.NotNull
        kotlinx.coroutines.channels.ProducerScope<? super com.woocommerce.android.ui.jetpack.PluginRepository.PluginStatus> producerScope) {
            super();
        }
        
        @kotlin.Suppress(names = {"unused"})
        @org.greenrobot.eventbus.Subscribe(threadMode = org.greenrobot.eventbus.ThreadMode.MAIN)
        public final void onSitePluginInstalled(@org.jetbrains.annotations.NotNull
        org.wordpress.android.fluxc.store.PluginStore.OnSitePluginInstalled event) {
        }
        
        @kotlin.Suppress(names = {"unused"})
        @org.greenrobot.eventbus.Subscribe(threadMode = org.greenrobot.eventbus.ThreadMode.MAIN)
        public final void onSitePluginConfigured(@org.jetbrains.annotations.NotNull
        org.wordpress.android.fluxc.store.PluginStore.OnSitePluginConfigured event) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0003\u0004\u0005\u0006B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0004\u0007\b\t\n\u00a8\u0006\u000b"}, d2 = {"Lcom/woocommerce/android/ui/jetpack/PluginRepository$PluginStatus;", "Landroid/os/Parcelable;", "()V", "PluginActivated", "PluginActivationFailed", "PluginInstallFailed", "PluginInstalled", "Lcom/woocommerce/android/ui/jetpack/PluginRepository$PluginStatus$PluginInstalled;", "Lcom/woocommerce/android/ui/jetpack/PluginRepository$PluginStatus$PluginInstallFailed;", "Lcom/woocommerce/android/ui/jetpack/PluginRepository$PluginStatus$PluginActivated;", "Lcom/woocommerce/android/ui/jetpack/PluginRepository$PluginStatus$PluginActivationFailed;", "WooCommerce_wasabiDebug"})
    public static abstract class PluginStatus implements android.os.Parcelable {
        
        private PluginStatus() {
            super();
        }
        
        @kotlinx.parcelize.Parcelize
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\f\u001a\u00020\u0005H\u00c6\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001J\t\u0010\u000e\u001a\u00020\u000fH\u00d6\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u00d6\u0003J\t\u0010\u0014\u001a\u00020\u000fH\u00d6\u0001J\t\u0010\u0015\u001a\u00020\u0003H\u00d6\u0001J\u0019\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u000fH\u00d6\u0001R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u001b"}, d2 = {"Lcom/woocommerce/android/ui/jetpack/PluginRepository$PluginStatus$PluginInstalled;", "Lcom/woocommerce/android/ui/jetpack/PluginRepository$PluginStatus;", "slug", "", "site", "Lorg/wordpress/android/fluxc/model/SiteModel;", "(Ljava/lang/String;Lorg/wordpress/android/fluxc/model/SiteModel;)V", "getSite", "()Lorg/wordpress/android/fluxc/model/SiteModel;", "getSlug", "()Ljava/lang/String;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "WooCommerce_wasabiDebug"})
        public static final class PluginInstalled extends com.woocommerce.android.ui.jetpack.PluginRepository.PluginStatus {
            @org.jetbrains.annotations.NotNull
            private final java.lang.String slug = null;
            @org.jetbrains.annotations.NotNull
            private final org.wordpress.android.fluxc.model.SiteModel site = null;
            public static final android.os.Parcelable.Creator<com.woocommerce.android.ui.jetpack.PluginRepository.PluginStatus.PluginInstalled> CREATOR = null;
            
            @org.jetbrains.annotations.NotNull
            public final com.woocommerce.android.ui.jetpack.PluginRepository.PluginStatus.PluginInstalled copy(@org.jetbrains.annotations.NotNull
            java.lang.String slug, @org.jetbrains.annotations.NotNull
            org.wordpress.android.fluxc.model.SiteModel site) {
                return null;
            }
            
            @java.lang.Override
            public boolean equals(@org.jetbrains.annotations.Nullable
            java.lang.Object other) {
                return false;
            }
            
            @java.lang.Override
            public int hashCode() {
                return 0;
            }
            
            @org.jetbrains.annotations.NotNull
            @java.lang.Override
            public java.lang.String toString() {
                return null;
            }
            
            public PluginInstalled(@org.jetbrains.annotations.NotNull
            java.lang.String slug, @org.jetbrains.annotations.NotNull
            org.wordpress.android.fluxc.model.SiteModel site) {
                super();
            }
            
            @org.jetbrains.annotations.NotNull
            public final java.lang.String component1() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull
            public final java.lang.String getSlug() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull
            public final org.wordpress.android.fluxc.model.SiteModel component2() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull
            public final org.wordpress.android.fluxc.model.SiteModel getSite() {
                return null;
            }
            
            @java.lang.Override
            public int describeContents() {
                return 0;
            }
            
            @java.lang.Override
            public void writeToParcel(@org.jetbrains.annotations.NotNull
            android.os.Parcel parcel, int flags) {
            }
            
            @kotlin.Metadata(mv = {1, 6, 0}, k = 3)
            public static final class Creator implements android.os.Parcelable.Creator<com.woocommerce.android.ui.jetpack.PluginRepository.PluginStatus.PluginInstalled> {
                
                public Creator() {
                    super();
                }
                
                @org.jetbrains.annotations.NotNull
                @java.lang.Override
                public final com.woocommerce.android.ui.jetpack.PluginRepository.PluginStatus.PluginInstalled createFromParcel(@org.jetbrains.annotations.NotNull
                android.os.Parcel in) {
                    return null;
                }
                
                @org.jetbrains.annotations.NotNull
                @java.lang.Override
                public final com.woocommerce.android.ui.jetpack.PluginRepository.PluginStatus.PluginInstalled[] newArray(int size) {
                    return null;
                }
            }
        }
        
        @kotlinx.parcelize.Parcelize
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\n\u001a\u00020\u0003H\u00c6\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u00c6\u0001J\t\u0010\f\u001a\u00020\rH\u00d6\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u00d6\u0003J\t\u0010\u0012\u001a\u00020\rH\u00d6\u0001J\t\u0010\u0013\u001a\u00020\u0003H\u00d6\u0001J\u0019\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\rH\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007\u00a8\u0006\u0019"}, d2 = {"Lcom/woocommerce/android/ui/jetpack/PluginRepository$PluginStatus$PluginInstallFailed;", "Lcom/woocommerce/android/ui/jetpack/PluginRepository$PluginStatus;", "errorDescription", "", "errorType", "(Ljava/lang/String;Ljava/lang/String;)V", "getErrorDescription", "()Ljava/lang/String;", "getErrorType", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "WooCommerce_wasabiDebug"})
        public static final class PluginInstallFailed extends com.woocommerce.android.ui.jetpack.PluginRepository.PluginStatus {
            @org.jetbrains.annotations.NotNull
            private final java.lang.String errorDescription = null;
            @org.jetbrains.annotations.NotNull
            private final java.lang.String errorType = null;
            public static final android.os.Parcelable.Creator<com.woocommerce.android.ui.jetpack.PluginRepository.PluginStatus.PluginInstallFailed> CREATOR = null;
            
            @org.jetbrains.annotations.NotNull
            public final com.woocommerce.android.ui.jetpack.PluginRepository.PluginStatus.PluginInstallFailed copy(@org.jetbrains.annotations.NotNull
            java.lang.String errorDescription, @org.jetbrains.annotations.NotNull
            java.lang.String errorType) {
                return null;
            }
            
            @java.lang.Override
            public boolean equals(@org.jetbrains.annotations.Nullable
            java.lang.Object other) {
                return false;
            }
            
            @java.lang.Override
            public int hashCode() {
                return 0;
            }
            
            @org.jetbrains.annotations.NotNull
            @java.lang.Override
            public java.lang.String toString() {
                return null;
            }
            
            public PluginInstallFailed(@org.jetbrains.annotations.NotNull
            java.lang.String errorDescription, @org.jetbrains.annotations.NotNull
            java.lang.String errorType) {
                super();
            }
            
            @org.jetbrains.annotations.NotNull
            public final java.lang.String component1() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull
            public final java.lang.String getErrorDescription() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull
            public final java.lang.String component2() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull
            public final java.lang.String getErrorType() {
                return null;
            }
            
            @java.lang.Override
            public int describeContents() {
                return 0;
            }
            
            @java.lang.Override
            public void writeToParcel(@org.jetbrains.annotations.NotNull
            android.os.Parcel parcel, int flags) {
            }
            
            @kotlin.Metadata(mv = {1, 6, 0}, k = 3)
            public static final class Creator implements android.os.Parcelable.Creator<com.woocommerce.android.ui.jetpack.PluginRepository.PluginStatus.PluginInstallFailed> {
                
                public Creator() {
                    super();
                }
                
                @org.jetbrains.annotations.NotNull
                @java.lang.Override
                public final com.woocommerce.android.ui.jetpack.PluginRepository.PluginStatus.PluginInstallFailed createFromParcel(@org.jetbrains.annotations.NotNull
                android.os.Parcel in) {
                    return null;
                }
                
                @org.jetbrains.annotations.NotNull
                @java.lang.Override
                public final com.woocommerce.android.ui.jetpack.PluginRepository.PluginStatus.PluginInstallFailed[] newArray(int size) {
                    return null;
                }
            }
        }
        
        @kotlinx.parcelize.Parcelize
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\f\u001a\u00020\u0005H\u00c6\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001J\t\u0010\u000e\u001a\u00020\u000fH\u00d6\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u00d6\u0003J\t\u0010\u0014\u001a\u00020\u000fH\u00d6\u0001J\t\u0010\u0015\u001a\u00020\u0003H\u00d6\u0001J\u0019\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u000fH\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u001b"}, d2 = {"Lcom/woocommerce/android/ui/jetpack/PluginRepository$PluginStatus$PluginActivated;", "Lcom/woocommerce/android/ui/jetpack/PluginRepository$PluginStatus;", "name", "", "site", "Lorg/wordpress/android/fluxc/model/SiteModel;", "(Ljava/lang/String;Lorg/wordpress/android/fluxc/model/SiteModel;)V", "getName", "()Ljava/lang/String;", "getSite", "()Lorg/wordpress/android/fluxc/model/SiteModel;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "WooCommerce_wasabiDebug"})
        public static final class PluginActivated extends com.woocommerce.android.ui.jetpack.PluginRepository.PluginStatus {
            @org.jetbrains.annotations.NotNull
            private final java.lang.String name = null;
            @org.jetbrains.annotations.NotNull
            private final org.wordpress.android.fluxc.model.SiteModel site = null;
            public static final android.os.Parcelable.Creator<com.woocommerce.android.ui.jetpack.PluginRepository.PluginStatus.PluginActivated> CREATOR = null;
            
            @org.jetbrains.annotations.NotNull
            public final com.woocommerce.android.ui.jetpack.PluginRepository.PluginStatus.PluginActivated copy(@org.jetbrains.annotations.NotNull
            java.lang.String name, @org.jetbrains.annotations.NotNull
            org.wordpress.android.fluxc.model.SiteModel site) {
                return null;
            }
            
            @java.lang.Override
            public boolean equals(@org.jetbrains.annotations.Nullable
            java.lang.Object other) {
                return false;
            }
            
            @java.lang.Override
            public int hashCode() {
                return 0;
            }
            
            @org.jetbrains.annotations.NotNull
            @java.lang.Override
            public java.lang.String toString() {
                return null;
            }
            
            public PluginActivated(@org.jetbrains.annotations.NotNull
            java.lang.String name, @org.jetbrains.annotations.NotNull
            org.wordpress.android.fluxc.model.SiteModel site) {
                super();
            }
            
            @org.jetbrains.annotations.NotNull
            public final java.lang.String component1() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull
            public final java.lang.String getName() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull
            public final org.wordpress.android.fluxc.model.SiteModel component2() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull
            public final org.wordpress.android.fluxc.model.SiteModel getSite() {
                return null;
            }
            
            @java.lang.Override
            public int describeContents() {
                return 0;
            }
            
            @java.lang.Override
            public void writeToParcel(@org.jetbrains.annotations.NotNull
            android.os.Parcel parcel, int flags) {
            }
            
            @kotlin.Metadata(mv = {1, 6, 0}, k = 3)
            public static final class Creator implements android.os.Parcelable.Creator<com.woocommerce.android.ui.jetpack.PluginRepository.PluginStatus.PluginActivated> {
                
                public Creator() {
                    super();
                }
                
                @org.jetbrains.annotations.NotNull
                @java.lang.Override
                public final com.woocommerce.android.ui.jetpack.PluginRepository.PluginStatus.PluginActivated createFromParcel(@org.jetbrains.annotations.NotNull
                android.os.Parcel in) {
                    return null;
                }
                
                @org.jetbrains.annotations.NotNull
                @java.lang.Override
                public final com.woocommerce.android.ui.jetpack.PluginRepository.PluginStatus.PluginActivated[] newArray(int size) {
                    return null;
                }
            }
        }
        
        @kotlinx.parcelize.Parcelize
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\n\u001a\u00020\u0003H\u00c6\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u00c6\u0001J\t\u0010\f\u001a\u00020\rH\u00d6\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u00d6\u0003J\t\u0010\u0012\u001a\u00020\rH\u00d6\u0001J\t\u0010\u0013\u001a\u00020\u0003H\u00d6\u0001J\u0019\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\rH\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007\u00a8\u0006\u0019"}, d2 = {"Lcom/woocommerce/android/ui/jetpack/PluginRepository$PluginStatus$PluginActivationFailed;", "Lcom/woocommerce/android/ui/jetpack/PluginRepository$PluginStatus;", "errorDescription", "", "errorType", "(Ljava/lang/String;Ljava/lang/String;)V", "getErrorDescription", "()Ljava/lang/String;", "getErrorType", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "WooCommerce_wasabiDebug"})
        public static final class PluginActivationFailed extends com.woocommerce.android.ui.jetpack.PluginRepository.PluginStatus {
            @org.jetbrains.annotations.NotNull
            private final java.lang.String errorDescription = null;
            @org.jetbrains.annotations.NotNull
            private final java.lang.String errorType = null;
            public static final android.os.Parcelable.Creator<com.woocommerce.android.ui.jetpack.PluginRepository.PluginStatus.PluginActivationFailed> CREATOR = null;
            
            @org.jetbrains.annotations.NotNull
            public final com.woocommerce.android.ui.jetpack.PluginRepository.PluginStatus.PluginActivationFailed copy(@org.jetbrains.annotations.NotNull
            java.lang.String errorDescription, @org.jetbrains.annotations.NotNull
            java.lang.String errorType) {
                return null;
            }
            
            @java.lang.Override
            public boolean equals(@org.jetbrains.annotations.Nullable
            java.lang.Object other) {
                return false;
            }
            
            @java.lang.Override
            public int hashCode() {
                return 0;
            }
            
            @org.jetbrains.annotations.NotNull
            @java.lang.Override
            public java.lang.String toString() {
                return null;
            }
            
            public PluginActivationFailed(@org.jetbrains.annotations.NotNull
            java.lang.String errorDescription, @org.jetbrains.annotations.NotNull
            java.lang.String errorType) {
                super();
            }
            
            @org.jetbrains.annotations.NotNull
            public final java.lang.String component1() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull
            public final java.lang.String getErrorDescription() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull
            public final java.lang.String component2() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull
            public final java.lang.String getErrorType() {
                return null;
            }
            
            @java.lang.Override
            public int describeContents() {
                return 0;
            }
            
            @java.lang.Override
            public void writeToParcel(@org.jetbrains.annotations.NotNull
            android.os.Parcel parcel, int flags) {
            }
            
            @kotlin.Metadata(mv = {1, 6, 0}, k = 3)
            public static final class Creator implements android.os.Parcelable.Creator<com.woocommerce.android.ui.jetpack.PluginRepository.PluginStatus.PluginActivationFailed> {
                
                public Creator() {
                    super();
                }
                
                @org.jetbrains.annotations.NotNull
                @java.lang.Override
                public final com.woocommerce.android.ui.jetpack.PluginRepository.PluginStatus.PluginActivationFailed createFromParcel(@org.jetbrains.annotations.NotNull
                android.os.Parcel in) {
                    return null;
                }
                
                @org.jetbrains.annotations.NotNull
                @java.lang.Override
                public final com.woocommerce.android.ui.jetpack.PluginRepository.PluginStatus.PluginActivationFailed[] newArray(int size) {
                    return null;
                }
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u000b"}, d2 = {"Lcom/woocommerce/android/ui/jetpack/PluginRepository$PluginException;", "Ljava/lang/Exception;", "errorType", "Lorg/wordpress/android/fluxc/store/Store$OnChangedError;", "errorMessage", "", "(Lorg/wordpress/android/fluxc/store/Store$OnChangedError;Ljava/lang/String;)V", "getErrorMessage", "()Ljava/lang/String;", "getErrorType", "()Lorg/wordpress/android/fluxc/store/Store$OnChangedError;", "WooCommerce_wasabiDebug"})
    static final class PluginException extends java.lang.Exception {
        @org.jetbrains.annotations.NotNull
        private final org.wordpress.android.fluxc.store.Store.OnChangedError errorType = null;
        @org.jetbrains.annotations.NotNull
        private final java.lang.String errorMessage = null;
        
        public PluginException(@org.jetbrains.annotations.NotNull
        org.wordpress.android.fluxc.store.Store.OnChangedError errorType, @org.jetbrains.annotations.NotNull
        java.lang.String errorMessage) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final org.wordpress.android.fluxc.store.Store.OnChangedError getErrorType() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getErrorMessage() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"}, d2 = {"Lcom/woocommerce/android/ui/jetpack/PluginRepository$Companion;", "", "()V", "ATTEMPT_LIMIT", "", "GENERIC_ERROR", "", "WooCommerce_wasabiDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}