package nl.rijksoverheid.en.factory;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 2, d1 = {"\u0000d\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r\u001a\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\r\u001a\u000e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\r\u001a\u001a\u0010\u0012\u001a\f\u0012\u0004\u0012\u00020\u00140\u0013j\u0002`\u00152\u0006\u0010\f\u001a\u00020\rH\u0002\u001a\u000e\u0010\u0016\u001a\u00020\u00172\u0006\u0010\f\u001a\u00020\r\u001a\u0010\u0010\u0018\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\rH\u0002\u001a\"\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\f\u001a\u00020\r2\u0012\b\u0002\u0010\u001b\u001a\f\u0012\u0004\u0012\u00020\u00140\u0013j\u0002`\u0015\u001a\u000e\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\f\u001a\u00020\r\u001a\u0010\u0010\u001e\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\rH\u0002\u001a\u000e\u0010\u001f\u001a\u00020 2\u0006\u0010\f\u001a\u00020\r\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006!"}, d2 = {"MINIMUM_PLAY_SERVICES_VERSION", "", "cdnService", "Lnl/rijksoverheid/en/api/CdnService;", "labTestService", "Lnl/rijksoverheid/en/api/LabTestService;", "notificationPreferences", "Lnl/rijksoverheid/en/preferences/AsyncSharedPreferences;", "statusCache", "Lnl/rijksoverheid/en/status/StatusCache;", "createAppConfigManager", "Lnl/rijksoverheid/en/config/AppConfigManager;", "context", "Landroid/content/Context;", "createAppLifecycleManager", "Lnl/rijksoverheid/en/applifecycle/AppLifecycleManager;", "createExposureNotificationsRepository", "Lnl/rijksoverheid/en/ExposureNotificationsRepository;", "createGooglePlayServicesChecker", "Lkotlin/Function0;", "", "Lnl/rijksoverheid/en/onboarding/GooglePlayServicesUpToDateChecker;", "createLabTestRepository", "Lnl/rijksoverheid/en/labtest/LabTestRepository;", "createLabTestService", "createOnboardingRepository", "Lnl/rijksoverheid/en/onboarding/OnboardingRepository;", "checker", "createResourceBundleManager", "Lnl/rijksoverheid/en/resource/ResourceBundleManager;", "createSecurePreferences", "createSettingsRepository", "Lnl/rijksoverheid/en/settings/SettingsRepository;", "app_accDebug"})
public final class RepositoriesKt {
    private static nl.rijksoverheid.en.api.CdnService cdnService;
    private static nl.rijksoverheid.en.api.LabTestService labTestService;
    private static nl.rijksoverheid.en.preferences.AsyncSharedPreferences notificationPreferences;
    private static nl.rijksoverheid.en.status.StatusCache statusCache;
    private static final int MINIMUM_PLAY_SERVICES_VERSION = 202665000;
    
    @org.jetbrains.annotations.NotNull()
    public static final nl.rijksoverheid.en.ExposureNotificationsRepository createExposureNotificationsRepository(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    private static final kotlin.jvm.functions.Function0<java.lang.Boolean> createGooglePlayServicesChecker(android.content.Context context) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final nl.rijksoverheid.en.onboarding.OnboardingRepository createOnboardingRepository(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<java.lang.Boolean> checker) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final nl.rijksoverheid.en.labtest.LabTestRepository createLabTestRepository(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    private static final nl.rijksoverheid.en.api.LabTestService createLabTestService(android.content.Context context) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final nl.rijksoverheid.en.config.AppConfigManager createAppConfigManager(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final nl.rijksoverheid.en.applifecycle.AppLifecycleManager createAppLifecycleManager(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final nl.rijksoverheid.en.resource.ResourceBundleManager createResourceBundleManager(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final nl.rijksoverheid.en.settings.SettingsRepository createSettingsRepository(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    @kotlin.Suppress(names = {"BlockingMethodInNonBlockingContext"})
    private static final nl.rijksoverheid.en.preferences.AsyncSharedPreferences createSecurePreferences(android.content.Context context) {
        return null;
    }
}