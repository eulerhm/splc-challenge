package nl.rijksoverheid.en.labtest;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\u0018\u00002\u00020\u0001:\u0002\"#B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0006\u0010\u001b\u001a\u00020\nJ\u0011\u0010\u001c\u001a\u00020\u0016H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001dJ\u0006\u0010\u001e\u001a\u00020\nJ\u0010\u0010\u001f\u001a\u00020\n2\u0006\u0010 \u001a\u00020\u0013H\u0002J\u0006\u0010!\u001a\u00020\nR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\n0\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\fR\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006$"}, d2 = {"Lnl/rijksoverheid/en/labtest/LabTestViewModel;", "Landroidx/lifecycle/ViewModel;", "labTestRepository", "Lnl/rijksoverheid/en/labtest/LabTestRepository;", "appConfigManager", "Lnl/rijksoverheid/en/config/AppConfigManager;", "(Lnl/rijksoverheid/en/labtest/LabTestRepository;Lnl/rijksoverheid/en/config/AppConfigManager;)V", "keyExpiredEvent", "Landroidx/lifecycle/LiveData;", "Lnl/rijksoverheid/en/lifecyle/Event;", "", "getKeyExpiredEvent", "()Landroidx/lifecycle/LiveData;", "keyState", "Lnl/rijksoverheid/en/labtest/LabTestViewModel$KeyState;", "getKeyState", "refresh", "Landroidx/lifecycle/MutableLiveData;", "uploadResult", "Lnl/rijksoverheid/en/labtest/LabTestViewModel$UploadResult;", "getUploadResult", "usedKey", "", "getUsedKey", "()Ljava/lang/String;", "setUsedKey", "(Ljava/lang/String;)V", "checkKeyExpiration", "getShareKeyUrl", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "retry", "updateResult", "result", "upload", "KeyState", "UploadResult", "app_accDebug"})
public final class LabTestViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<nl.rijksoverheid.en.lifecyle.Event<nl.rijksoverheid.en.labtest.LabTestViewModel.UploadResult>> uploadResult = null;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String usedKey;
    private final androidx.lifecycle.MutableLiveData<kotlin.Unit> refresh = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<nl.rijksoverheid.en.labtest.LabTestViewModel.KeyState> keyState = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<nl.rijksoverheid.en.lifecyle.Event<kotlin.Unit>> keyExpiredEvent = null;
    private final nl.rijksoverheid.en.labtest.LabTestRepository labTestRepository = null;
    private final nl.rijksoverheid.en.config.AppConfigManager appConfigManager = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<nl.rijksoverheid.en.lifecyle.Event<nl.rijksoverheid.en.labtest.LabTestViewModel.UploadResult>> getUploadResult() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getUsedKey() {
        return null;
    }
    
    public final void setUsedKey(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<nl.rijksoverheid.en.labtest.LabTestViewModel.KeyState> getKeyState() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<nl.rijksoverheid.en.lifecyle.Event<kotlin.Unit>> getKeyExpiredEvent() {
        return null;
    }
    
    public final void retry() {
    }
    
    public final void upload() {
    }
    
    public final void checkKeyExpiration() {
    }
    
    private final void updateResult(nl.rijksoverheid.en.labtest.LabTestViewModel.UploadResult result) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getShareKeyUrl(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.String> p0) {
        return null;
    }
    
    public LabTestViewModel(@org.jetbrains.annotations.NotNull()
    nl.rijksoverheid.en.labtest.LabTestRepository labTestRepository, @org.jetbrains.annotations.NotNull()
    nl.rijksoverheid.en.config.AppConfigManager appConfigManager) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0003\u0006\u0007\b\u00a8\u0006\t"}, d2 = {"Lnl/rijksoverheid/en/labtest/LabTestViewModel$UploadResult;", "", "()V", "Error", "RequestConsent", "Success", "Lnl/rijksoverheid/en/labtest/LabTestViewModel$UploadResult$RequestConsent;", "Lnl/rijksoverheid/en/labtest/LabTestViewModel$UploadResult$Success;", "Lnl/rijksoverheid/en/labtest/LabTestViewModel$UploadResult$Error;", "app_accDebug"})
    public static abstract class UploadResult {
        
        private UploadResult() {
            super();
        }
        
        @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Lnl/rijksoverheid/en/labtest/LabTestViewModel$UploadResult$RequestConsent;", "Lnl/rijksoverheid/en/labtest/LabTestViewModel$UploadResult;", "resolution", "Landroid/app/PendingIntent;", "(Landroid/app/PendingIntent;)V", "getResolution", "()Landroid/app/PendingIntent;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "app_accDebug"})
        public static final class RequestConsent extends nl.rijksoverheid.en.labtest.LabTestViewModel.UploadResult {
            @org.jetbrains.annotations.NotNull()
            private final android.app.PendingIntent resolution = null;
            
            @org.jetbrains.annotations.NotNull()
            public final android.app.PendingIntent getResolution() {
                return null;
            }
            
            public RequestConsent(@org.jetbrains.annotations.NotNull()
            android.app.PendingIntent resolution) {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            public final android.app.PendingIntent component1() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final nl.rijksoverheid.en.labtest.LabTestViewModel.UploadResult.RequestConsent copy(@org.jetbrains.annotations.NotNull()
            android.app.PendingIntent resolution) {
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
        
        @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0010"}, d2 = {"Lnl/rijksoverheid/en/labtest/LabTestViewModel$UploadResult$Success;", "Lnl/rijksoverheid/en/labtest/LabTestViewModel$UploadResult;", "usedKey", "", "(Ljava/lang/String;)V", "getUsedKey", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_accDebug"})
        public static final class Success extends nl.rijksoverheid.en.labtest.LabTestViewModel.UploadResult {
            @org.jetbrains.annotations.NotNull()
            private final java.lang.String usedKey = null;
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String getUsedKey() {
                return null;
            }
            
            public Success(@org.jetbrains.annotations.NotNull()
            java.lang.String usedKey) {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String component1() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final nl.rijksoverheid.en.labtest.LabTestViewModel.UploadResult.Success copy(@org.jetbrains.annotations.NotNull()
            java.lang.String usedKey) {
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
        
        @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lnl/rijksoverheid/en/labtest/LabTestViewModel$UploadResult$Error;", "Lnl/rijksoverheid/en/labtest/LabTestViewModel$UploadResult;", "()V", "app_accDebug"})
        public static final class Error extends nl.rijksoverheid.en.labtest.LabTestViewModel.UploadResult {
            @org.jetbrains.annotations.NotNull()
            public static final nl.rijksoverheid.en.labtest.LabTestViewModel.UploadResult.Error INSTANCE = null;
            
            private Error() {
                super();
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0003\u0006\u0007\b\u00a8\u0006\t"}, d2 = {"Lnl/rijksoverheid/en/labtest/LabTestViewModel$KeyState;", "", "()V", "Error", "Loading", "Success", "Lnl/rijksoverheid/en/labtest/LabTestViewModel$KeyState$Loading;", "Lnl/rijksoverheid/en/labtest/LabTestViewModel$KeyState$Success;", "Lnl/rijksoverheid/en/labtest/LabTestViewModel$KeyState$Error;", "app_accDebug"})
    public static abstract class KeyState {
        
        private KeyState() {
            super();
        }
        
        @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lnl/rijksoverheid/en/labtest/LabTestViewModel$KeyState$Loading;", "Lnl/rijksoverheid/en/labtest/LabTestViewModel$KeyState;", "()V", "app_accDebug"})
        public static final class Loading extends nl.rijksoverheid.en.labtest.LabTestViewModel.KeyState {
            @org.jetbrains.annotations.NotNull()
            public static final nl.rijksoverheid.en.labtest.LabTestViewModel.KeyState.Loading INSTANCE = null;
            
            private Loading() {
                super();
            }
        }
        
        @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\n\u001a\u00020\u0003H\u00c2\u0003J\u0013\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u00d6\u0003J\t\u0010\u0010\u001a\u00020\u0011H\u00d6\u0001J\t\u0010\u0012\u001a\u00020\u0003H\u00d6\u0001R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007\u00a8\u0006\u0013"}, d2 = {"Lnl/rijksoverheid/en/labtest/LabTestViewModel$KeyState$Success;", "Lnl/rijksoverheid/en/labtest/LabTestViewModel$KeyState;", "code", "", "(Ljava/lang/String;)V", "displayKey", "getDisplayKey", "()Ljava/lang/String;", "key", "getKey", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_accDebug"})
        public static final class Success extends nl.rijksoverheid.en.labtest.LabTestViewModel.KeyState {
            @org.jetbrains.annotations.NotNull()
            private final java.lang.String displayKey = null;
            @org.jetbrains.annotations.NotNull()
            private final java.lang.String key = null;
            private final java.lang.String code = null;
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String getDisplayKey() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String getKey() {
                return null;
            }
            
            public Success(@org.jetbrains.annotations.NotNull()
            java.lang.String code) {
                super();
            }
            
            private final java.lang.String component1() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final nl.rijksoverheid.en.labtest.LabTestViewModel.KeyState.Success copy(@org.jetbrains.annotations.NotNull()
            java.lang.String code) {
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
        
        @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lnl/rijksoverheid/en/labtest/LabTestViewModel$KeyState$Error;", "Lnl/rijksoverheid/en/labtest/LabTestViewModel$KeyState;", "()V", "app_accDebug"})
        public static final class Error extends nl.rijksoverheid.en.labtest.LabTestViewModel.KeyState {
            @org.jetbrains.annotations.NotNull()
            public static final nl.rijksoverheid.en.labtest.LabTestViewModel.KeyState.Error INSTANCE = null;
            
            private Error() {
                super();
            }
        }
    }
}