package nl.rijksoverheid.en.settings;

import java.lang.System;

/**
 * Thin wrapper around the default app preferences
 */
@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u001eB\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0006\u0010\u0017\u001a\u00020\u0018J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00000\u001aJ\u000e\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u001dR$\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0011\u0010\u000e\u001a\u00020\u000f8F\u00a2\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R$\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u0012\u0010\u000b\"\u0004\b\u0013\u0010\rR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R$\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u0015\u0010\u000b\"\u0004\b\u0016\u0010\r\u00a8\u0006\u001f"}, d2 = {"Lnl/rijksoverheid/en/settings/Settings;", "", "context", "Landroid/content/Context;", "preferences", "Landroid/content/SharedPreferences;", "(Landroid/content/Context;Landroid/content/SharedPreferences;)V", "value", "", "checkOnWifiOnly", "getCheckOnWifiOnly", "()Z", "setCheckOnWifiOnly", "(Z)V", "exposureStatePausedState", "Lnl/rijksoverheid/en/settings/Settings$PausedState;", "getExposureStatePausedState", "()Lnl/rijksoverheid/en/settings/Settings$PausedState;", "isAppSetToDutch", "setAppSetToDutch", "skipPauseConfirmation", "getSkipPauseConfirmation", "setSkipPauseConfirmation", "clearExposureNotificationsPaused", "", "observeChanges", "Lkotlinx/coroutines/flow/Flow;", "setExposureNotificationsPaused", "until", "Ljava/time/LocalDateTime;", "PausedState", "app_accDebug"})
public final class Settings {
    private final android.content.SharedPreferences preferences = null;
    
    public final boolean getCheckOnWifiOnly() {
        return false;
    }
    
    public final void setCheckOnWifiOnly(boolean value) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final nl.rijksoverheid.en.settings.Settings.PausedState getExposureStatePausedState() {
        return null;
    }
    
    public final boolean getSkipPauseConfirmation() {
        return false;
    }
    
    public final void setSkipPauseConfirmation(boolean value) {
    }
    
    public final void setExposureNotificationsPaused(@org.jetbrains.annotations.NotNull()
    java.time.LocalDateTime until) {
    }
    
    public final void clearExposureNotificationsPaused() {
    }
    
    public final boolean isAppSetToDutch() {
        return false;
    }
    
    public final void setAppSetToDutch(boolean value) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<nl.rijksoverheid.en.settings.Settings> observeChanges() {
        return null;
    }
    
    public Settings(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    android.content.SharedPreferences preferences) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006\u00a8\u0006\u0007"}, d2 = {"Lnl/rijksoverheid/en/settings/Settings$PausedState;", "", "()V", "Enabled", "Paused", "Lnl/rijksoverheid/en/settings/Settings$PausedState$Enabled;", "Lnl/rijksoverheid/en/settings/Settings$PausedState$Paused;", "app_accDebug"})
    public static abstract class PausedState {
        
        private PausedState() {
            super();
        }
        
        @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lnl/rijksoverheid/en/settings/Settings$PausedState$Enabled;", "Lnl/rijksoverheid/en/settings/Settings$PausedState;", "()V", "app_accDebug"})
        public static final class Enabled extends nl.rijksoverheid.en.settings.Settings.PausedState {
            @org.jetbrains.annotations.NotNull()
            public static final nl.rijksoverheid.en.settings.Settings.PausedState.Enabled INSTANCE = null;
            
            private Enabled() {
                super();
            }
        }
        
        @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Lnl/rijksoverheid/en/settings/Settings$PausedState$Paused;", "Lnl/rijksoverheid/en/settings/Settings$PausedState;", "pausedUntil", "Ljava/time/LocalDateTime;", "(Ljava/time/LocalDateTime;)V", "getPausedUntil", "()Ljava/time/LocalDateTime;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "app_accDebug"})
        public static final class Paused extends nl.rijksoverheid.en.settings.Settings.PausedState {
            @org.jetbrains.annotations.NotNull()
            private final java.time.LocalDateTime pausedUntil = null;
            
            @org.jetbrains.annotations.NotNull()
            public final java.time.LocalDateTime getPausedUntil() {
                return null;
            }
            
            public Paused(@org.jetbrains.annotations.NotNull()
            java.time.LocalDateTime pausedUntil) {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.time.LocalDateTime component1() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final nl.rijksoverheid.en.settings.Settings.PausedState.Paused copy(@org.jetbrains.annotations.NotNull()
            java.time.LocalDateTime pausedUntil) {
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