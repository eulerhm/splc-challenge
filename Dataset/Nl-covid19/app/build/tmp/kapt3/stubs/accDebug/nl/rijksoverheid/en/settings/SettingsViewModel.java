package nl.rijksoverheid.en.settings;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u001b\u001a\u00020\bJ\u0006\u0010\u001c\u001a\u00020\bJ\u000e\u0010\u001d\u001a\u00020\b2\u0006\u0010\u001e\u001a\u00020\u001fR\u001d\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001d\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0019\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0010\u001a\u00020\u00118F\u00a2\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u001f\u0010\u0014\u001a\u0010\u0012\f\u0012\n \u0016*\u0004\u0018\u00010\u00110\u00110\u0015\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u001d\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\n\u00a8\u0006 "}, d2 = {"Lnl/rijksoverheid/en/settings/SettingsViewModel;", "Landroidx/lifecycle/ViewModel;", "repository", "Lnl/rijksoverheid/en/settings/SettingsRepository;", "(Lnl/rijksoverheid/en/settings/SettingsRepository;)V", "enableExposureNotificationsRequested", "Landroidx/lifecycle/LiveData;", "Lnl/rijksoverheid/en/lifecyle/Event;", "", "getEnableExposureNotificationsRequested", "()Landroidx/lifecycle/LiveData;", "pauseRequested", "getPauseRequested", "pausedState", "Lnl/rijksoverheid/en/settings/Settings$PausedState$Paused;", "getPausedState", "skipPauseConfirmation", "", "getSkipPauseConfirmation", "()Z", "wifiOnly", "Landroidx/lifecycle/MutableLiveData;", "kotlin.jvm.PlatformType", "getWifiOnly", "()Landroidx/lifecycle/MutableLiveData;", "wifiOnlyChanged", "getWifiOnlyChanged", "enableExposureNotifications", "requestPauseExposureNotifications", "setExposureNotificationsPaused", "until", "Ljava/time/LocalDateTime;", "app_accDebug"})
public final class SettingsViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<nl.rijksoverheid.en.settings.Settings.PausedState.Paused> pausedState = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> wifiOnly = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<nl.rijksoverheid.en.lifecyle.Event<java.lang.Boolean>> wifiOnlyChanged = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<nl.rijksoverheid.en.lifecyle.Event<kotlin.Unit>> pauseRequested = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<nl.rijksoverheid.en.lifecyle.Event<kotlin.Unit>> enableExposureNotificationsRequested = null;
    private final nl.rijksoverheid.en.settings.SettingsRepository repository = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<nl.rijksoverheid.en.settings.Settings.PausedState.Paused> getPausedState() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getWifiOnly() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<nl.rijksoverheid.en.lifecyle.Event<java.lang.Boolean>> getWifiOnlyChanged() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<nl.rijksoverheid.en.lifecyle.Event<kotlin.Unit>> getPauseRequested() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<nl.rijksoverheid.en.lifecyle.Event<kotlin.Unit>> getEnableExposureNotificationsRequested() {
        return null;
    }
    
    public final boolean getSkipPauseConfirmation() {
        return false;
    }
    
    public final void requestPauseExposureNotifications() {
    }
    
    public final void setExposureNotificationsPaused(@org.jetbrains.annotations.NotNull()
    java.time.LocalDateTime until) {
    }
    
    public final void enableExposureNotifications() {
    }
    
    public SettingsViewModel(@org.jetbrains.annotations.NotNull()
    nl.rijksoverheid.en.settings.SettingsRepository repository) {
        super();
    }
}