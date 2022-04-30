package nl.rijksoverheid.en.labtest;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u000389:Bc\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0010\u0010\b\u001a\f\u0012\u0004\u0012\u00020\n0\tj\u0002`\u000b\u0012\u0016\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\n0\rj\u0002`\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0015\u00a2\u0006\u0002\u0010\u0016J\u0011\u0010\u0017\u001a\u00020\nH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0018J\u0011\u0010\u0019\u001a\u00020\nH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0002J\u0013\u0010\u001e\u001a\u0004\u0018\u00010\u001bH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0018J\b\u0010\u001f\u001a\u00020\u000eH\u0002J\u0011\u0010 \u001a\u00020!H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0018J\u0011\u0010\"\u001a\u00020#H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0018J\u0011\u0010$\u001a\u00020%H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0018J\u0011\u0010&\u001a\u00020\nH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0018J\u0011\u0010\'\u001a\u00020(H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0018J\u0019\u0010)\u001a\u00020\n2\u0006\u0010*\u001a\u00020+H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010,J\u0011\u0010-\u001a\u00020.H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0018J\u0011\u0010/\u001a\u00020.H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0018J/\u00100\u001a\u00020\n2\f\u00101\u001a\b\u0012\u0004\u0012\u000203022\u0006\u00104\u001a\u00020\u001b2\u0006\u00105\u001a\u000206H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u00107R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001e\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\n0\rj\u0002`\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0018\u0010\b\u001a\f\u0012\u0004\u0012\u00020\n0\tj\u0002`\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006;"}, d2 = {"Lnl/rijksoverheid/en/labtest/LabTestRepository;", "", "preferences", "Lnl/rijksoverheid/en/preferences/AsyncSharedPreferences;", "exposureNotificationApi", "Lnl/rijksoverheid/en/enapi/ExposureNotificationApi;", "api", "Lnl/rijksoverheid/en/api/LabTestService;", "uploadScheduler", "Lkotlin/Function0;", "", "Lnl/rijksoverheid/en/labtest/UploadScheduler;", "decoyScheduler", "Lkotlin/Function1;", "", "Lnl/rijksoverheid/en/labtest/DecoyScheduler;", "appConfigManager", "Lnl/rijksoverheid/en/config/AppConfigManager;", "clock", "Ljava/time/Clock;", "random", "Lkotlin/random/Random;", "(Lnl/rijksoverheid/en/preferences/AsyncSharedPreferences;Lnl/rijksoverheid/en/enapi/ExposureNotificationApi;Lnl/rijksoverheid/en/api/LabTestService;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lnl/rijksoverheid/en/config/AppConfigManager;Ljava/time/Clock;Lkotlin/random/Random;)V", "clearKeyData", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "clearKeyDataIfExpired", "generateDecoyBucketId", "", "size", "", "getCachedRegistrationCode", "getDecoyRegistrationDelay", "isKeyDataExpired", "", "registerForUpload", "Lnl/rijksoverheid/en/labtest/RegistrationResult;", "requestUploadDiagnosticKeys", "Lnl/rijksoverheid/en/labtest/LabTestRepository$RequestUploadDiagnosisKeysResult;", "scheduleNextDecoyScheduleSequence", "sendDecoyTraffic", "Lnl/rijksoverheid/en/labtest/LabTestRepository$SendDecoyResult;", "storeResult", "result", "Lnl/rijksoverheid/en/api/model/Registration;", "(Lnl/rijksoverheid/en/api/model/Registration;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "uploadDiagnosticKeys", "Lnl/rijksoverheid/en/labtest/LabTestRepository$UploadDiagnosticKeysResult;", "uploadDiagnosticKeysIfPending", "uploadKeys", "requestedKeys", "", "Lcom/google/android/gms/nearby/exposurenotification/TemporaryExposureKey;", "bucketId", "confirmationKey", "", "(Ljava/util/List;Ljava/lang/String;[BLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "RequestUploadDiagnosisKeysResult", "SendDecoyResult", "UploadDiagnosticKeysResult", "app_tstDebug"})
public final class LabTestRepository {
    private final nl.rijksoverheid.en.preferences.AsyncSharedPreferences preferences = null;
    private final nl.rijksoverheid.en.enapi.ExposureNotificationApi exposureNotificationApi = null;
    private final nl.rijksoverheid.en.api.LabTestService api = null;
    private final kotlin.jvm.functions.Function0<kotlin.Unit> uploadScheduler = null;
    private final kotlin.jvm.functions.Function1<java.lang.Long, kotlin.Unit> decoyScheduler = null;
    private final nl.rijksoverheid.en.config.AppConfigManager appConfigManager = null;
    private final java.time.Clock clock = null;
    private final kotlin.random.Random random = null;
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object scheduleNextDecoyScheduleSequence(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p0) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object registerForUpload(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super nl.rijksoverheid.en.labtest.RegistrationResult> p0) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object isKeyDataExpired(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Boolean> p0) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object clearKeyData(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p0) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object uploadDiagnosticKeysIfPending(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super nl.rijksoverheid.en.labtest.LabTestRepository.UploadDiagnosticKeysResult> p0) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object requestUploadDiagnosticKeys(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super nl.rijksoverheid.en.labtest.LabTestRepository.RequestUploadDiagnosisKeysResult> p0) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object sendDecoyTraffic(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super nl.rijksoverheid.en.labtest.LabTestRepository.SendDecoyResult> p0) {
        return null;
    }
    
    private final long getDecoyRegistrationDelay() {
        return 0L;
    }
    
    private final java.lang.String generateDecoyBucketId(int size) {
        return null;
    }
    
    public LabTestRepository(@org.jetbrains.annotations.NotNull()
    nl.rijksoverheid.en.preferences.AsyncSharedPreferences preferences, @org.jetbrains.annotations.NotNull()
    nl.rijksoverheid.en.enapi.ExposureNotificationApi exposureNotificationApi, @org.jetbrains.annotations.NotNull()
    nl.rijksoverheid.en.api.LabTestService api, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> uploadScheduler, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.Long, kotlin.Unit> decoyScheduler, @org.jetbrains.annotations.NotNull()
    nl.rijksoverheid.en.config.AppConfigManager appConfigManager, @org.jetbrains.annotations.NotNull()
    java.time.Clock clock, @org.jetbrains.annotations.NotNull()
    kotlin.random.Random random) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0003\u0006\u0007\b\u00a8\u0006\t"}, d2 = {"Lnl/rijksoverheid/en/labtest/LabTestRepository$RequestUploadDiagnosisKeysResult;", "", "()V", "RequireConsent", "Success", "UnknownError", "Lnl/rijksoverheid/en/labtest/LabTestRepository$RequestUploadDiagnosisKeysResult$Success;", "Lnl/rijksoverheid/en/labtest/LabTestRepository$RequestUploadDiagnosisKeysResult$UnknownError;", "Lnl/rijksoverheid/en/labtest/LabTestRepository$RequestUploadDiagnosisKeysResult$RequireConsent;", "app_tstDebug"})
    public static abstract class RequestUploadDiagnosisKeysResult {
        
        private RequestUploadDiagnosisKeysResult() {
            super();
        }
        
        /**
         * Scheduled successfully or completed immediately
         */
        @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lnl/rijksoverheid/en/labtest/LabTestRepository$RequestUploadDiagnosisKeysResult$Success;", "Lnl/rijksoverheid/en/labtest/LabTestRepository$RequestUploadDiagnosisKeysResult;", "()V", "app_tstDebug"})
        public static final class Success extends nl.rijksoverheid.en.labtest.LabTestRepository.RequestUploadDiagnosisKeysResult {
            @org.jetbrains.annotations.NotNull()
            public static final nl.rijksoverheid.en.labtest.LabTestRepository.RequestUploadDiagnosisKeysResult.Success INSTANCE = null;
            
            private Success() {
                super();
            }
        }
        
        @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lnl/rijksoverheid/en/labtest/LabTestRepository$RequestUploadDiagnosisKeysResult$UnknownError;", "Lnl/rijksoverheid/en/labtest/LabTestRepository$RequestUploadDiagnosisKeysResult;", "()V", "app_tstDebug"})
        public static final class UnknownError extends nl.rijksoverheid.en.labtest.LabTestRepository.RequestUploadDiagnosisKeysResult {
            @org.jetbrains.annotations.NotNull()
            public static final nl.rijksoverheid.en.labtest.LabTestRepository.RequestUploadDiagnosisKeysResult.UnknownError INSTANCE = null;
            
            private UnknownError() {
                super();
            }
        }
        
        /**
         * Consent is required
         */
        @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Lnl/rijksoverheid/en/labtest/LabTestRepository$RequestUploadDiagnosisKeysResult$RequireConsent;", "Lnl/rijksoverheid/en/labtest/LabTestRepository$RequestUploadDiagnosisKeysResult;", "resolution", "Landroid/app/PendingIntent;", "(Landroid/app/PendingIntent;)V", "getResolution", "()Landroid/app/PendingIntent;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "app_tstDebug"})
        public static final class RequireConsent extends nl.rijksoverheid.en.labtest.LabTestRepository.RequestUploadDiagnosisKeysResult {
            @org.jetbrains.annotations.NotNull()
            private final android.app.PendingIntent resolution = null;
            
            @org.jetbrains.annotations.NotNull()
            public final android.app.PendingIntent getResolution() {
                return null;
            }
            
            public RequireConsent(@org.jetbrains.annotations.NotNull()
            android.app.PendingIntent resolution) {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            public final android.app.PendingIntent component1() {
                return null;
            }
            
            /**
             * Consent is required
             */
            @org.jetbrains.annotations.NotNull()
            public final nl.rijksoverheid.en.labtest.LabTestRepository.RequestUploadDiagnosisKeysResult.RequireConsent copy(@org.jetbrains.annotations.NotNull()
            android.app.PendingIntent resolution) {
                return null;
            }
            
            /**
             * Consent is required
             */
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public java.lang.String toString() {
                return null;
            }
            
            /**
             * Consent is required
             */
            @java.lang.Override()
            public int hashCode() {
                return 0;
            }
            
            /**
             * Consent is required
             */
            @java.lang.Override()
            public boolean equals(@org.jetbrains.annotations.Nullable()
            java.lang.Object p0) {
                return false;
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0003\u0006\u0007\b\u00a8\u0006\t"}, d2 = {"Lnl/rijksoverheid/en/labtest/LabTestRepository$UploadDiagnosticKeysResult;", "", "()V", "Expired", "Retry", "Success", "Lnl/rijksoverheid/en/labtest/LabTestRepository$UploadDiagnosticKeysResult$Success;", "Lnl/rijksoverheid/en/labtest/LabTestRepository$UploadDiagnosticKeysResult$Expired;", "Lnl/rijksoverheid/en/labtest/LabTestRepository$UploadDiagnosticKeysResult$Retry;", "app_tstDebug"})
    public static abstract class UploadDiagnosticKeysResult {
        
        private UploadDiagnosticKeysResult() {
            super();
        }
        
        /**
         * The key upload has completed
         */
        @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lnl/rijksoverheid/en/labtest/LabTestRepository$UploadDiagnosticKeysResult$Success;", "Lnl/rijksoverheid/en/labtest/LabTestRepository$UploadDiagnosticKeysResult;", "()V", "app_tstDebug"})
        public static final class Success extends nl.rijksoverheid.en.labtest.LabTestRepository.UploadDiagnosticKeysResult {
            @org.jetbrains.annotations.NotNull()
            public static final nl.rijksoverheid.en.labtest.LabTestRepository.UploadDiagnosticKeysResult.Success INSTANCE = null;
            
            private Success() {
                super();
            }
        }
        
        /**
         * The key upload could not be completed before the registration expired
         */
        @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lnl/rijksoverheid/en/labtest/LabTestRepository$UploadDiagnosticKeysResult$Expired;", "Lnl/rijksoverheid/en/labtest/LabTestRepository$UploadDiagnosticKeysResult;", "()V", "app_tstDebug"})
        public static final class Expired extends nl.rijksoverheid.en.labtest.LabTestRepository.UploadDiagnosticKeysResult {
            @org.jetbrains.annotations.NotNull()
            public static final nl.rijksoverheid.en.labtest.LabTestRepository.UploadDiagnosticKeysResult.Expired INSTANCE = null;
            
            private Expired() {
                super();
            }
        }
        
        /**
         * An error occurred and the key upload should be retried later
         */
        @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lnl/rijksoverheid/en/labtest/LabTestRepository$UploadDiagnosticKeysResult$Retry;", "Lnl/rijksoverheid/en/labtest/LabTestRepository$UploadDiagnosticKeysResult;", "()V", "app_tstDebug"})
        public static final class Retry extends nl.rijksoverheid.en.labtest.LabTestRepository.UploadDiagnosticKeysResult {
            @org.jetbrains.annotations.NotNull()
            public static final nl.rijksoverheid.en.labtest.LabTestRepository.UploadDiagnosticKeysResult.Retry INSTANCE = null;
            
            private Retry() {
                super();
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006\u00a8\u0006\u0007"}, d2 = {"Lnl/rijksoverheid/en/labtest/LabTestRepository$SendDecoyResult;", "", "()V", "Registered", "Success", "Lnl/rijksoverheid/en/labtest/LabTestRepository$SendDecoyResult$Success;", "Lnl/rijksoverheid/en/labtest/LabTestRepository$SendDecoyResult$Registered;", "app_tstDebug"})
    public static abstract class SendDecoyResult {
        
        private SendDecoyResult() {
            super();
        }
        
        @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lnl/rijksoverheid/en/labtest/LabTestRepository$SendDecoyResult$Success;", "Lnl/rijksoverheid/en/labtest/LabTestRepository$SendDecoyResult;", "()V", "app_tstDebug"})
        public static final class Success extends nl.rijksoverheid.en.labtest.LabTestRepository.SendDecoyResult {
            @org.jetbrains.annotations.NotNull()
            public static final nl.rijksoverheid.en.labtest.LabTestRepository.SendDecoyResult.Success INSTANCE = null;
            
            private Success() {
                super();
            }
        }
        
        @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Lnl/rijksoverheid/en/labtest/LabTestRepository$SendDecoyResult$Registered;", "Lnl/rijksoverheid/en/labtest/LabTestRepository$SendDecoyResult;", "delayMillis", "", "(J)V", "getDelayMillis", "()J", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "app_tstDebug"})
        public static final class Registered extends nl.rijksoverheid.en.labtest.LabTestRepository.SendDecoyResult {
            private final long delayMillis = 0L;
            
            public final long getDelayMillis() {
                return 0L;
            }
            
            public Registered(long delayMillis) {
                super();
            }
            
            public final long component1() {
                return 0L;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final nl.rijksoverheid.en.labtest.LabTestRepository.SendDecoyResult.Registered copy(long delayMillis) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public java.lang.String toString() {
                return null;
            }
            
            @java.lang.Override()
            public int hashCode() {
                return 0;
            }
            
            @java.lang.Override()
            public boolean equals(@org.jetbrains.annotations.Nullable()
            java.lang.Object p0) {
                return false;
            }
        }
    }
}