package com.woocommerce.android.util.crashlogging;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 22\u00020\u0001:\u00012B?\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u00a2\u0006\u0002\u0010\u0010J \u0010!\u001a\u0012\u0012\b\u0012\u00060\u0012j\u0002`#\u0012\u0004\u0012\u00020\u00120\"2\u0006\u0010$\u001a\u00020%H\u0002J\u0014\u0010&\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00120\"H\u0016J\b\u0010\'\u001a\u00020\u0016H\u0016J\u0012\u0010(\u001a\f\u0012\b\u0012\u00060\u0012j\u0002`#0)H\u0016J8\u0010*\u001a\u0012\u0012\b\u0012\u00060\u0012j\u0002`#\u0012\u0004\u0012\u00020\u00120\"2\u0016\u0010+\u001a\u0012\u0012\b\u0012\u00060\u0012j\u0002`#\u0012\u0004\u0012\u00020\u00120\"2\u0006\u0010$\u001a\u00020%H\u0016J \u0010,\u001a\u00020\u00162\u0006\u0010-\u001a\u00020\u00122\u0006\u0010.\u001a\u00020\u00122\u0006\u0010/\u001a\u00020\u0012H\u0016J\n\u00100\u001a\u0004\u0018\u000101H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\u00020\u0012X\u0096D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\u0016X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0019\u001a\u0004\u0018\u00010\u001a8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u001d\u001a\u00020\u0012X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0014R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u001f\u001a\u00020\u0012X\u0096D\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010\u0014R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u00063"}, d2 = {"Lcom/woocommerce/android/util/crashlogging/WCCrashLoggingDataProvider;", "Lcom/automattic/android/tracks/crashlogging/CrashLoggingDataProvider;", "localeProvider", "Lcom/woocommerce/android/util/locale/LocaleProvider;", "accountStore", "Lorg/wordpress/android/fluxc/store/AccountStore;", "selectedSite", "Lcom/woocommerce/android/tools/SelectedSite;", "appPrefs", "Lcom/woocommerce/android/AppPrefs;", "enqueueSendingEncryptedLogs", "Lcom/woocommerce/android/util/crashlogging/EnqueueSendingEncryptedLogs;", "uuidGenerator", "Lcom/woocommerce/android/util/crashlogging/UuidGenerator;", "buildConfig", "Lcom/woocommerce/android/util/BuildConfigWrapper;", "(Lcom/woocommerce/android/util/locale/LocaleProvider;Lorg/wordpress/android/fluxc/store/AccountStore;Lcom/woocommerce/android/tools/SelectedSite;Lcom/woocommerce/android/AppPrefs;Lcom/woocommerce/android/util/crashlogging/EnqueueSendingEncryptedLogs;Lcom/woocommerce/android/util/crashlogging/UuidGenerator;Lcom/woocommerce/android/util/BuildConfigWrapper;)V", "buildType", "", "getBuildType", "()Ljava/lang/String;", "enableCrashLoggingLogs", "", "getEnableCrashLoggingLogs", "()Z", "locale", "Ljava/util/Locale;", "getLocale", "()Ljava/util/Locale;", "releaseName", "getReleaseName", "sentryDSN", "getSentryDSN", "appendEncryptedLogsUuid", "", "Lcom/automattic/android/tracks/crashlogging/ExtraKnownKey;", "eventLevel", "Lcom/automattic/android/tracks/crashlogging/EventLevel;", "applicationContextProvider", "crashLoggingEnabled", "extraKnownKeys", "", "provideExtrasForEvent", "currentExtras", "shouldDropWrappingException", "module", "type", "value", "userProvider", "Lcom/automattic/android/tracks/crashlogging/CrashLoggingUser;", "Companion", "WooCommerce_wasabiDebug"})
public final class WCCrashLoggingDataProvider implements com.automattic.android.tracks.crashlogging.CrashLoggingDataProvider {
    private final com.woocommerce.android.util.locale.LocaleProvider localeProvider = null;
    private final org.wordpress.android.fluxc.store.AccountStore accountStore = null;
    private final com.woocommerce.android.tools.SelectedSite selectedSite = null;
    private final com.woocommerce.android.AppPrefs appPrefs = null;
    private final com.woocommerce.android.util.crashlogging.EnqueueSendingEncryptedLogs enqueueSendingEncryptedLogs = null;
    private final com.woocommerce.android.util.crashlogging.UuidGenerator uuidGenerator = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String buildType = "debug";
    private final boolean enableCrashLoggingLogs = false;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String releaseName = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String sentryDSN = "https://00000000000000000000000000000000@sentry.io/0000000";
    @org.jetbrains.annotations.NotNull
    public static final com.woocommerce.android.util.crashlogging.WCCrashLoggingDataProvider.Companion Companion = null;
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String SITE_ID_KEY = "site_id";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String SITE_URL_KEY = "site_url";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String EXTRA_UUID = "uuid";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String DEBUG_RELEASE_NAME = "debug";
    
    @javax.inject.Inject
    public WCCrashLoggingDataProvider(@org.jetbrains.annotations.NotNull
    com.woocommerce.android.util.locale.LocaleProvider localeProvider, @org.jetbrains.annotations.NotNull
    org.wordpress.android.fluxc.store.AccountStore accountStore, @org.jetbrains.annotations.NotNull
    com.woocommerce.android.tools.SelectedSite selectedSite, @org.jetbrains.annotations.NotNull
    com.woocommerce.android.AppPrefs appPrefs, @org.jetbrains.annotations.NotNull
    com.woocommerce.android.util.crashlogging.EnqueueSendingEncryptedLogs enqueueSendingEncryptedLogs, @org.jetbrains.annotations.NotNull
    com.woocommerce.android.util.crashlogging.UuidGenerator uuidGenerator, @org.jetbrains.annotations.NotNull
    com.woocommerce.android.util.BuildConfigWrapper buildConfig) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.lang.String getBuildType() {
        return null;
    }
    
    @java.lang.Override
    public boolean getEnableCrashLoggingLogs() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.util.Locale getLocale() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.lang.String getReleaseName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.lang.String getSentryDSN() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.util.Map<java.lang.String, java.lang.String> applicationContextProvider() {
        return null;
    }
    
    @java.lang.Override
    public boolean crashLoggingEnabled() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.util.List<java.lang.String> extraKnownKeys() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.util.Map<java.lang.String, java.lang.String> provideExtrasForEvent(@org.jetbrains.annotations.NotNull
    java.util.Map<java.lang.String, java.lang.String> currentExtras, @org.jetbrains.annotations.NotNull
    com.automattic.android.tracks.crashlogging.EventLevel eventLevel) {
        return null;
    }
    
    private final java.util.Map<java.lang.String, java.lang.String> appendEncryptedLogsUuid(com.automattic.android.tracks.crashlogging.EventLevel eventLevel) {
        return null;
    }
    
    @java.lang.Override
    public boolean shouldDropWrappingException(@org.jetbrains.annotations.NotNull
    java.lang.String module, @org.jetbrains.annotations.NotNull
    java.lang.String type, @org.jetbrains.annotations.NotNull
    java.lang.String value) {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public com.automattic.android.tracks.crashlogging.CrashLoggingUser userProvider() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lcom/woocommerce/android/util/crashlogging/WCCrashLoggingDataProvider$Companion;", "", "()V", "DEBUG_RELEASE_NAME", "", "EXTRA_UUID", "SITE_ID_KEY", "SITE_URL_KEY", "WooCommerce_wasabiDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}