package nl.rijksoverheid.en.settings;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0006\u0010\r\u001a\u00020\u000eJ\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010J\u0006\u0010\u0012\u001a\u00020\bJ\u0006\u0010\u0013\u001a\u00020\u000eJ\u000e\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u0016J\u000e\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0007\u001a\u00020\b8F\u00a2\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0011\u0010\u000b\u001a\u00020\b8F\u00a2\u0006\u0006\u001a\u0004\b\f\u0010\n\u00a8\u0006\u0019"}, d2 = {"Lnl/rijksoverheid/en/settings/SettingsRepository;", "", "context", "Landroid/content/Context;", "settings", "Lnl/rijksoverheid/en/settings/Settings;", "(Landroid/content/Context;Lnl/rijksoverheid/en/settings/Settings;)V", "skipPauseConfirmation", "", "getSkipPauseConfirmation", "()Z", "wifiOnly", "getWifiOnly", "clearExposureNotificationsPaused", "", "exposureNotificationsPausedState", "Lkotlinx/coroutines/flow/Flow;", "Lnl/rijksoverheid/en/settings/Settings$PausedState;", "isPaused", "rescheduleReminder", "setExposureNotificationsPaused", "until", "Ljava/time/LocalDateTime;", "setSkipPauseConfirmation", "setWifiOnly", "app_accDebug"})
public final class SettingsRepository {
    private final android.content.Context context = null;
    private final nl.rijksoverheid.en.settings.Settings settings = null;
    
    public final boolean getWifiOnly() {
        return false;
    }
    
    public final void setWifiOnly(boolean wifiOnly) {
    }
    
    public final boolean getSkipPauseConfirmation() {
        return false;
    }
    
    public final void setSkipPauseConfirmation(boolean skipPauseConfirmation) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<nl.rijksoverheid.en.settings.Settings.PausedState> exposureNotificationsPausedState() {
        return null;
    }
    
    public final boolean isPaused() {
        return false;
    }
    
    public final void setExposureNotificationsPaused(@org.jetbrains.annotations.NotNull()
    java.time.LocalDateTime until) {
    }
    
    public final void rescheduleReminder() {
    }
    
    public final void clearExposureNotificationsPaused() {
    }
    
    public SettingsRepository(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    nl.rijksoverheid.en.settings.Settings settings) {
        super();
    }
}