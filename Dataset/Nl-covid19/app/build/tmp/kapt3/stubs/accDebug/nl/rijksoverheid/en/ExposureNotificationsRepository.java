package nl.rijksoverheid.en;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0082\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001Bm\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0015\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0017\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0019\u00a2\u0006\u0002\u0010\u001aJ\u001b\u0010!\u001a\u00020\"2\b\b\u0002\u0010#\u001a\u00020\u0015H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010$J\u0011\u0010%\u001a\u00020\u001dH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010&J\u0011\u0010\'\u001a\u00020(H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010&J\u0011\u0010)\u001a\u00020*H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010&J\u0010\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020(H\u0002J\u0010\u0010.\u001a\u00020/2\u0006\u0010-\u001a\u00020(H\u0002J\u000e\u00100\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001010\u001cJ\u0013\u00102\u001a\u0004\u0018\u000101H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010&J\u0013\u00103\u001a\u0004\u0018\u000101H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010&J\f\u00104\u001a\b\u0012\u0004\u0012\u00020*0\u001cJ\b\u00105\u001a\u00020\u0015H\u0002J\u0011\u00106\u001a\u00020\u0015H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010&J\u0006\u00107\u001a\u00020\u0015J\u0018\u00108\u001a\u00020\u00152\u0006\u00109\u001a\u00020:2\u0006\u0010;\u001a\u00020<H\u0002J\u0018\u0010=\u001a\u00020\u00152\u0006\u0010>\u001a\u00020:2\u0006\u0010;\u001a\u00020<H\u0002J\u0011\u0010?\u001a\u00020\u0015H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010&J\u000e\u0010@\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010A0\u001cJ\u000e\u0010B\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010A0\u001cJ\u000e\u0010C\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001010\u001cJ\u001b\u0010D\u001a\u00020E2\u0006\u0010F\u001a\u00020GH\u0081@\u00f8\u0001\u0000\u00a2\u0006\u0004\bH\u0010IJ\u0011\u0010J\u001a\u00020KH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010&J\u0011\u0010L\u001a\u00020MH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010&J\u0011\u0010N\u001a\u00020OH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010&J\u0011\u0010P\u001a\u00020OH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010&J\u0011\u0010Q\u001a\u00020\u001dH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010&J\u0011\u0010R\u001a\u00020\u001dH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010&J\u0011\u0010S\u001a\u00020\u001dH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010&J\u0011\u0010T\u001a\u00020\u001dH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010&J\'\u0010U\u001a\u00020\u001d2\f\u0010V\u001a\b\u0012\u0004\u0012\u00020X0W2\u0006\u0010F\u001a\u00020GH\u0083@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010YJ%\u0010Z\u001a\u00020[2\u0006\u0010\\\u001a\u00020X2\u0006\u0010]\u001a\u00020^2\u0006\u0010_\u001a\u00020`H\u0001\u00a2\u0006\u0002\baJ\"\u0010b\u001a\u00020\u00152\u0006\u0010\\\u001a\u00020X2\b\u0010c\u001a\u0004\u0018\u00010d2\u0006\u0010_\u001a\u00020`H\u0002J-\u0010e\u001a\u00020[2\u0006\u0010\\\u001a\u00020X2\u0012\u0010f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020i0h0gH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010jR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001cX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001cX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020 0\u001cX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006k"}, d2 = {"Lnl/rijksoverheid/en/ExposureNotificationsRepository;", "", "context", "Landroid/content/Context;", "exposureNotificationsApi", "Lnl/rijksoverheid/en/enapi/ExposureNotificationApi;", "api", "Lnl/rijksoverheid/en/api/CdnService;", "preferences", "Lnl/rijksoverheid/en/preferences/AsyncSharedPreferences;", "manifestWorkerScheduler", "Lnl/rijksoverheid/en/job/BackgroundWorkScheduler;", "appLifecycleManager", "Lnl/rijksoverheid/en/applifecycle/AppLifecycleManager;", "statusCache", "Lnl/rijksoverheid/en/status/StatusCache;", "appConfigManager", "Lnl/rijksoverheid/en/config/AppConfigManager;", "clock", "Ljava/time/Clock;", "signatureValidation", "", "signatureValidator", "Lnl/rijksoverheid/en/signing/ResponseSignatureValidator;", "lifecycleOwner", "Landroidx/lifecycle/LifecycleOwner;", "(Landroid/content/Context;Lnl/rijksoverheid/en/enapi/ExposureNotificationApi;Lnl/rijksoverheid/en/api/CdnService;Lnl/rijksoverheid/en/preferences/AsyncSharedPreferences;Lnl/rijksoverheid/en/job/BackgroundWorkScheduler;Lnl/rijksoverheid/en/applifecycle/AppLifecycleManager;Lnl/rijksoverheid/en/status/StatusCache;Lnl/rijksoverheid/en/config/AppConfigManager;Ljava/time/Clock;ZLnl/rijksoverheid/en/signing/ResponseSignatureValidator;Landroidx/lifecycle/LifecycleOwner;)V", "preconditionsChanged", "Lkotlinx/coroutines/flow/Flow;", "", "refreshOnStart", "triggers", "Lnl/rijksoverheid/en/status/StatusCache$CachedStatus;", "addExposure", "Lnl/rijksoverheid/en/AddExposureResult;", "testExposure", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "cleanupPreviouslyKnownExposures", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCachedRiskCalculationParameters", "Lnl/rijksoverheid/en/api/model/RiskCalculationParameters;", "getCurrentStatus", "Lnl/rijksoverheid/en/enapi/StatusResult;", "getDailySummariesConfig", "Lcom/google/android/gms/nearby/exposurenotification/DailySummariesConfig;", "riskCalculationParameters", "getDiagnosisKeysMapping", "Lcom/google/android/gms/nearby/exposurenotification/DiagnosisKeysDataMapping;", "getLastExposureDate", "Ljava/time/LocalDate;", "getLastNotificationReceivedDate", "getPreviouslyKnownExposureDate", "getStatus", "isBluetoothEnabled", "isExposureNotificationApiUpdateRequired", "isLocationPreconditionSatisfied", "isValidInfectiousnessWeight", "infectiousness", "", "weight", "", "isValidReportTypeWeight", "reportType", "keyProcessingOverdue", "lastKeyProcessed", "", "notificationsEnabledTimestamp", "previouslyKnownExposureDate", "processExposureKeySets", "Lnl/rijksoverheid/en/ProcessExposureKeysResult;", "manifest", "Lnl/rijksoverheid/en/api/model/Manifest;", "processExposureKeySets$app_accDebug", "(Lnl/rijksoverheid/en/api/model/Manifest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "processManifest", "Lnl/rijksoverheid/en/ProcessManifestResult;", "requestDisableNotifications", "Lnl/rijksoverheid/en/enapi/DisableNotificationsResult;", "requestEnableNotifications", "Lnl/rijksoverheid/en/enapi/EnableNotificationsResult;", "requestEnableNotificationsForcingConsent", "rescheduleBackgroundJobs", "resetExposures", "resetNotificationsEnabledTimestamp", "scheduleBackgroundJobs", "updateProcessedExposureKeySets", "processed", "", "", "(Ljava/util/Set;Lnl/rijksoverheid/en/api/model/Manifest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "validateAndWrite", "Lnl/rijksoverheid/en/ExposureKeySet;", "id", "zip", "Ljava/util/zip/ZipInputStream;", "file", "Ljava/io/File;", "validateAndWrite$app_accDebug", "validateSignature", "signature", "", "writeExposureKeyFile", "responseAsync", "Lkotlinx/coroutines/Deferred;", "Lretrofit2/Response;", "Lokhttp3/ResponseBody;", "(Ljava/lang/String;Lkotlinx/coroutines/Deferred;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_accDebug"})
public final class ExposureNotificationsRepository {
    private final kotlinx.coroutines.flow.Flow<kotlin.Unit> refreshOnStart = null;
    private final kotlinx.coroutines.flow.Flow<kotlin.Unit> preconditionsChanged = null;
    private final kotlinx.coroutines.flow.Flow<nl.rijksoverheid.en.status.StatusCache.CachedStatus> triggers = null;
    private final android.content.Context context = null;
    private final nl.rijksoverheid.en.enapi.ExposureNotificationApi exposureNotificationsApi = null;
    private final nl.rijksoverheid.en.api.CdnService api = null;
    private final nl.rijksoverheid.en.preferences.AsyncSharedPreferences preferences = null;
    private final nl.rijksoverheid.en.job.BackgroundWorkScheduler manifestWorkerScheduler = null;
    private final nl.rijksoverheid.en.applifecycle.AppLifecycleManager appLifecycleManager = null;
    private final nl.rijksoverheid.en.status.StatusCache statusCache = null;
    private final nl.rijksoverheid.en.config.AppConfigManager appConfigManager = null;
    private final java.time.Clock clock = null;
    private final boolean signatureValidation = false;
    private final nl.rijksoverheid.en.signing.ResponseSignatureValidator signatureValidator = null;
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object keyProcessingOverdue(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Boolean> p0) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object requestEnableNotifications(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super nl.rijksoverheid.en.enapi.EnableNotificationsResult> p0) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object rescheduleBackgroundJobs(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p0) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object resetNotificationsEnabledTimestamp(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p0) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object requestEnableNotificationsForcingConsent(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super nl.rijksoverheid.en.enapi.EnableNotificationsResult> p0) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object requestDisableNotifications(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super nl.rijksoverheid.en.enapi.DisableNotificationsResult> p0) {
        return null;
    }
    
    /**
     * Directly emits a cached [StatusResult] from cache, followed up by the up to date value from
     * the API. Any updates to the permissions and framework state will lead to new values being
     * emitted.
     */
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<nl.rijksoverheid.en.enapi.StatusResult> getStatus() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getCurrentStatus(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super nl.rijksoverheid.en.enapi.StatusResult> p0) {
        return null;
    }
    
    private final boolean isBluetoothEnabled() {
        return false;
    }
    
    /**
     * Check the location manager to see if location is enabled.
     * @return false if location is not enabled, true if the [LocationManager] service is null or if running on Android R and up
     */
    public final boolean isLocationPreconditionSatisfied() {
        return false;
    }
    
    /**
     * Downloads new exposure key sets from the server and processes them
     */
    @org.jetbrains.annotations.Nullable()
    @androidx.annotation.VisibleForTesting()
    public final java.lang.Object processExposureKeySets$app_accDebug(@org.jetbrains.annotations.NotNull()
    nl.rijksoverheid.en.api.model.Manifest manifest, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super nl.rijksoverheid.en.ProcessExposureKeysResult> p1) {
        return null;
    }
    
    private final com.google.android.gms.nearby.exposurenotification.DailySummariesConfig getDailySummariesConfig(nl.rijksoverheid.en.api.model.RiskCalculationParameters riskCalculationParameters) {
        return null;
    }
    
    private final boolean isValidInfectiousnessWeight(int infectiousness, double weight) {
        return false;
    }
    
    private final boolean isValidReportTypeWeight(int reportType, double weight) {
        return false;
    }
    
    private final com.google.android.gms.nearby.exposurenotification.DiagnosisKeysDataMapping getDiagnosisKeysMapping(nl.rijksoverheid.en.api.model.RiskCalculationParameters riskCalculationParameters) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @androidx.annotation.VisibleForTesting()
    public final nl.rijksoverheid.en.ExposureKeySet validateAndWrite$app_accDebug(@org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    java.util.zip.ZipInputStream zip, @org.jetbrains.annotations.NotNull()
    java.io.File file) {
        return null;
    }
    
    private final boolean validateSignature(java.lang.String id, byte[] signature, java.io.File file) {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object processManifest(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super nl.rijksoverheid.en.ProcessManifestResult> p0) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<java.lang.Long> lastKeyProcessed() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<java.lang.Long> notificationsEnabledTimestamp() {
        return null;
    }
    
    /**
     * Return the exposure status
     * @return true if exposures are reported, false otherwise
     */
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<java.time.LocalDate> getLastExposureDate() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getLastNotificationReceivedDate(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.time.LocalDate> p0) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getPreviouslyKnownExposureDate(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.time.LocalDate> p0) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<java.time.LocalDate> previouslyKnownExposureDate() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object resetExposures(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p0) {
        return null;
    }
    
    /**
     * Removes previously known expiration date from sharedPreferences when older than 14 days
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object cleanupPreviouslyKnownExposures(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p0) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object addExposure(boolean testExposure, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super nl.rijksoverheid.en.AddExposureResult> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object isExposureNotificationApiUpdateRequired(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Boolean> p0) {
        return null;
    }
    
    public ExposureNotificationsRepository(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    nl.rijksoverheid.en.enapi.ExposureNotificationApi exposureNotificationsApi, @org.jetbrains.annotations.NotNull()
    nl.rijksoverheid.en.api.CdnService api, @org.jetbrains.annotations.NotNull()
    nl.rijksoverheid.en.preferences.AsyncSharedPreferences preferences, @org.jetbrains.annotations.NotNull()
    nl.rijksoverheid.en.job.BackgroundWorkScheduler manifestWorkerScheduler, @org.jetbrains.annotations.NotNull()
    nl.rijksoverheid.en.applifecycle.AppLifecycleManager appLifecycleManager, @org.jetbrains.annotations.NotNull()
    nl.rijksoverheid.en.status.StatusCache statusCache, @org.jetbrains.annotations.NotNull()
    nl.rijksoverheid.en.config.AppConfigManager appConfigManager, @org.jetbrains.annotations.NotNull()
    java.time.Clock clock, boolean signatureValidation, @org.jetbrains.annotations.NotNull()
    nl.rijksoverheid.en.signing.ResponseSignatureValidator signatureValidator, @org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LifecycleOwner lifecycleOwner) {
        super();
    }
}