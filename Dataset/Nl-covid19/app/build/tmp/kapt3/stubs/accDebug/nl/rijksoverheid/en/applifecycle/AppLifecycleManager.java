package nl.rijksoverheid.en.applifecycle;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0019B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u00a2\u0006\u0002\u0010\rJ\n\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0002J\u0011\u0010\u0013\u001a\u00020\u0014H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0015J\u0016\u0010\u0016\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\u0018R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\u00020\t8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u001a"}, d2 = {"Lnl/rijksoverheid/en/applifecycle/AppLifecycleManager;", "", "context", "Landroid/content/Context;", "preferences", "Landroid/content/SharedPreferences;", "appUpdateManager", "Lcom/google/android/play/core/appupdate/AppUpdateManager;", "currentVersionCode", "", "onShowAppUpdateNotification", "Lkotlin/Function0;", "", "(Landroid/content/Context;Landroid/content/SharedPreferences;Lcom/google/android/play/core/appupdate/AppUpdateManager;ILkotlin/jvm/functions/Function0;)V", "minimumVersionCode", "getMinimumVersionCode", "()I", "getInstallPackageName", "", "getUpdateState", "Lnl/rijksoverheid/en/applifecycle/AppLifecycleManager$UpdateState;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "verifyMinimumVersion", "notify", "", "UpdateState", "app_accDebug"})
public final class AppLifecycleManager {
    private final android.content.Context context = null;
    private final android.content.SharedPreferences preferences = null;
    private final com.google.android.play.core.appupdate.AppUpdateManager appUpdateManager = null;
    private final int currentVersionCode = 0;
    private final kotlin.jvm.functions.Function0<kotlin.Unit> onShowAppUpdateNotification = null;
    
    private final int getMinimumVersionCode() {
        return 0;
    }
    
    /**
     * Saves the minimum version of the app so it can be checked on app open.
     * Sends a push notification if this app's version is outdated if [notify] is true
     * @param minimumVersionCode the minimum version code required
     * @param notify whether to show a notification to the user
     */
    public final void verifyMinimumVersion(int minimumVersionCode, boolean notify) {
    }
    
    /**
     * Checks if a forced update is necessary and if so returns the manager and info to force the update.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getUpdateState(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super nl.rijksoverheid.en.applifecycle.AppLifecycleManager.UpdateState> p0) {
        return null;
    }
    
    private final java.lang.String getInstallPackageName() {
        return null;
    }
    
    public AppLifecycleManager(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    android.content.SharedPreferences preferences, @org.jetbrains.annotations.NotNull()
    com.google.android.play.core.appupdate.AppUpdateManager appUpdateManager, int currentVersionCode, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onShowAppUpdateNotification) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0003\u0004\u0005\u0006B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0004\u0007\b\t\n\u00a8\u0006\u000b"}, d2 = {"Lnl/rijksoverheid/en/applifecycle/AppLifecycleManager$UpdateState;", "", "()V", "Error", "InAppUpdate", "UpToDate", "UpdateRequired", "Lnl/rijksoverheid/en/applifecycle/AppLifecycleManager$UpdateState$InAppUpdate;", "Lnl/rijksoverheid/en/applifecycle/AppLifecycleManager$UpdateState$UpdateRequired;", "Lnl/rijksoverheid/en/applifecycle/AppLifecycleManager$UpdateState$Error;", "Lnl/rijksoverheid/en/applifecycle/AppLifecycleManager$UpdateState$UpToDate;", "app_accDebug"})
    public static abstract class UpdateState {
        
        private UpdateState() {
            super();
        }
        
        @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\f\u001a\u00020\u0005H\u00c6\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u00d6\u0003J\t\u0010\u0012\u001a\u00020\u0013H\u00d6\u0001J\t\u0010\u0014\u001a\u00020\u0015H\u00d6\u0001R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u0016"}, d2 = {"Lnl/rijksoverheid/en/applifecycle/AppLifecycleManager$UpdateState$InAppUpdate;", "Lnl/rijksoverheid/en/applifecycle/AppLifecycleManager$UpdateState;", "appUpdateManager", "Lcom/google/android/play/core/appupdate/AppUpdateManager;", "appUpdateInfo", "Lcom/google/android/play/core/appupdate/AppUpdateInfo;", "(Lcom/google/android/play/core/appupdate/AppUpdateManager;Lcom/google/android/play/core/appupdate/AppUpdateInfo;)V", "getAppUpdateInfo", "()Lcom/google/android/play/core/appupdate/AppUpdateInfo;", "getAppUpdateManager", "()Lcom/google/android/play/core/appupdate/AppUpdateManager;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "app_accDebug"})
        public static final class InAppUpdate extends nl.rijksoverheid.en.applifecycle.AppLifecycleManager.UpdateState {
            @org.jetbrains.annotations.NotNull()
            private final com.google.android.play.core.appupdate.AppUpdateManager appUpdateManager = null;
            @org.jetbrains.annotations.NotNull()
            private final com.google.android.play.core.appupdate.AppUpdateInfo appUpdateInfo = null;
            
            @org.jetbrains.annotations.NotNull()
            public final com.google.android.play.core.appupdate.AppUpdateManager getAppUpdateManager() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.google.android.play.core.appupdate.AppUpdateInfo getAppUpdateInfo() {
                return null;
            }
            
            public InAppUpdate(@org.jetbrains.annotations.NotNull()
            com.google.android.play.core.appupdate.AppUpdateManager appUpdateManager, @org.jetbrains.annotations.NotNull()
            com.google.android.play.core.appupdate.AppUpdateInfo appUpdateInfo) {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.google.android.play.core.appupdate.AppUpdateManager component1() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.google.android.play.core.appupdate.AppUpdateInfo component2() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final nl.rijksoverheid.en.applifecycle.AppLifecycleManager.UpdateState.InAppUpdate copy(@org.jetbrains.annotations.NotNull()
            com.google.android.play.core.appupdate.AppUpdateManager appUpdateManager, @org.jetbrains.annotations.NotNull()
            com.google.android.play.core.appupdate.AppUpdateInfo appUpdateInfo) {
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
        
        @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0004J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0015\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0003H\u00d6\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0010"}, d2 = {"Lnl/rijksoverheid/en/applifecycle/AppLifecycleManager$UpdateState$UpdateRequired;", "Lnl/rijksoverheid/en/applifecycle/AppLifecycleManager$UpdateState;", "installerPackageName", "", "(Ljava/lang/String;)V", "getInstallerPackageName", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_accDebug"})
        public static final class UpdateRequired extends nl.rijksoverheid.en.applifecycle.AppLifecycleManager.UpdateState {
            @org.jetbrains.annotations.Nullable()
            private final java.lang.String installerPackageName = null;
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String getInstallerPackageName() {
                return null;
            }
            
            public UpdateRequired(@org.jetbrains.annotations.Nullable()
            java.lang.String installerPackageName) {
                super();
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.String component1() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final nl.rijksoverheid.en.applifecycle.AppLifecycleManager.UpdateState.UpdateRequired copy(@org.jetbrains.annotations.Nullable()
            java.lang.String installerPackageName) {
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
        
        @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004\u00a2\u0006\u0002\u0010\u0005J\r\u0010\b\u001a\u00060\u0003j\u0002`\u0004H\u00c6\u0003J\u0017\u0010\t\u001a\u00020\u00002\f\b\u0002\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u00c6\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u00d6\u0003J\t\u0010\u000e\u001a\u00020\u000fH\u00d6\u0001J\t\u0010\u0010\u001a\u00020\u0011H\u00d6\u0001R\u0015\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0012"}, d2 = {"Lnl/rijksoverheid/en/applifecycle/AppLifecycleManager$UpdateState$Error;", "Lnl/rijksoverheid/en/applifecycle/AppLifecycleManager$UpdateState;", "ex", "Ljava/lang/Exception;", "Lkotlin/Exception;", "(Ljava/lang/Exception;)V", "getEx", "()Ljava/lang/Exception;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "app_accDebug"})
        public static final class Error extends nl.rijksoverheid.en.applifecycle.AppLifecycleManager.UpdateState {
            @org.jetbrains.annotations.NotNull()
            private final java.lang.Exception ex = null;
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.Exception getEx() {
                return null;
            }
            
            public Error(@org.jetbrains.annotations.NotNull()
            java.lang.Exception ex) {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.Exception component1() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final nl.rijksoverheid.en.applifecycle.AppLifecycleManager.UpdateState.Error copy(@org.jetbrains.annotations.NotNull()
            java.lang.Exception ex) {
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
        
        @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lnl/rijksoverheid/en/applifecycle/AppLifecycleManager$UpdateState$UpToDate;", "Lnl/rijksoverheid/en/applifecycle/AppLifecycleManager$UpdateState;", "()V", "app_accDebug"})
        public static final class UpToDate extends nl.rijksoverheid.en.applifecycle.AppLifecycleManager.UpdateState {
            @org.jetbrains.annotations.NotNull()
            public static final nl.rijksoverheid.en.applifecycle.AppLifecycleManager.UpdateState.UpToDate INSTANCE = null;
            
            private UpToDate() {
                super();
            }
        }
    }
}