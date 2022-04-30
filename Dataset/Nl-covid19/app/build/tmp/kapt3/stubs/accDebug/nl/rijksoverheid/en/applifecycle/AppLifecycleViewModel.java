package nl.rijksoverheid.en.applifecycle;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u000fB\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0006\u0010\r\u001a\u00020\u000eR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\u0010"}, d2 = {"Lnl/rijksoverheid/en/applifecycle/AppLifecycleViewModel;", "Landroidx/lifecycle/ViewModel;", "appLifecycleManager", "Lnl/rijksoverheid/en/applifecycle/AppLifecycleManager;", "appConfigManager", "Lnl/rijksoverheid/en/config/AppConfigManager;", "(Lnl/rijksoverheid/en/applifecycle/AppLifecycleManager;Lnl/rijksoverheid/en/config/AppConfigManager;)V", "updateEvent", "Landroidx/lifecycle/LiveData;", "Lnl/rijksoverheid/en/lifecyle/Event;", "Lnl/rijksoverheid/en/applifecycle/AppLifecycleViewModel$AppLifecycleStatus;", "getUpdateEvent", "()Landroidx/lifecycle/LiveData;", "checkForForcedAppUpdate", "", "AppLifecycleStatus", "app_accDebug"})
public final class AppLifecycleViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<nl.rijksoverheid.en.lifecyle.Event<nl.rijksoverheid.en.applifecycle.AppLifecycleViewModel.AppLifecycleStatus>> updateEvent = null;
    private final nl.rijksoverheid.en.applifecycle.AppLifecycleManager appLifecycleManager = null;
    private final nl.rijksoverheid.en.config.AppConfigManager appConfigManager = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<nl.rijksoverheid.en.lifecyle.Event<nl.rijksoverheid.en.applifecycle.AppLifecycleViewModel.AppLifecycleStatus>> getUpdateEvent() {
        return null;
    }
    
    public final void checkForForcedAppUpdate() {
    }
    
    public AppLifecycleViewModel(@org.jetbrains.annotations.NotNull()
    nl.rijksoverheid.en.applifecycle.AppLifecycleManager appLifecycleManager, @org.jetbrains.annotations.NotNull()
    nl.rijksoverheid.en.config.AppConfigManager appConfigManager) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006\u00a8\u0006\u0007"}, d2 = {"Lnl/rijksoverheid/en/applifecycle/AppLifecycleViewModel$AppLifecycleStatus;", "", "()V", "EndOfLife", "Update", "Lnl/rijksoverheid/en/applifecycle/AppLifecycleViewModel$AppLifecycleStatus$Update;", "Lnl/rijksoverheid/en/applifecycle/AppLifecycleViewModel$AppLifecycleStatus$EndOfLife;", "app_accDebug"})
    public static abstract class AppLifecycleStatus {
        
        private AppLifecycleStatus() {
            super();
        }
        
        @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Lnl/rijksoverheid/en/applifecycle/AppLifecycleViewModel$AppLifecycleStatus$Update;", "Lnl/rijksoverheid/en/applifecycle/AppLifecycleViewModel$AppLifecycleStatus;", "update", "Lnl/rijksoverheid/en/applifecycle/AppLifecycleManager$UpdateState;", "(Lnl/rijksoverheid/en/applifecycle/AppLifecycleManager$UpdateState;)V", "getUpdate", "()Lnl/rijksoverheid/en/applifecycle/AppLifecycleManager$UpdateState;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "app_accDebug"})
        public static final class Update extends nl.rijksoverheid.en.applifecycle.AppLifecycleViewModel.AppLifecycleStatus {
            @org.jetbrains.annotations.NotNull()
            private final nl.rijksoverheid.en.applifecycle.AppLifecycleManager.UpdateState update = null;
            
            @org.jetbrains.annotations.NotNull()
            public final nl.rijksoverheid.en.applifecycle.AppLifecycleManager.UpdateState getUpdate() {
                return null;
            }
            
            public Update(@org.jetbrains.annotations.NotNull()
            nl.rijksoverheid.en.applifecycle.AppLifecycleManager.UpdateState update) {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            public final nl.rijksoverheid.en.applifecycle.AppLifecycleManager.UpdateState component1() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final nl.rijksoverheid.en.applifecycle.AppLifecycleViewModel.AppLifecycleStatus.Update copy(@org.jetbrains.annotations.NotNull()
            nl.rijksoverheid.en.applifecycle.AppLifecycleManager.UpdateState update) {
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
        
        @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lnl/rijksoverheid/en/applifecycle/AppLifecycleViewModel$AppLifecycleStatus$EndOfLife;", "Lnl/rijksoverheid/en/applifecycle/AppLifecycleViewModel$AppLifecycleStatus;", "()V", "app_accDebug"})
        public static final class EndOfLife extends nl.rijksoverheid.en.applifecycle.AppLifecycleViewModel.AppLifecycleStatus {
            @org.jetbrains.annotations.NotNull()
            public static final nl.rijksoverheid.en.applifecycle.AppLifecycleViewModel.AppLifecycleStatus.EndOfLife INSTANCE = null;
            
            private EndOfLife() {
                super();
            }
        }
    }
}