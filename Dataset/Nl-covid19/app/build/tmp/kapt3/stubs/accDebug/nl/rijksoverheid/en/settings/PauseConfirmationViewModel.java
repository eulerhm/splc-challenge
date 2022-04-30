package nl.rijksoverheid.en.settings;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rJ\u0006\u0010\u000e\u001a\u00020\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t\u00a8\u0006\u000f"}, d2 = {"Lnl/rijksoverheid/en/settings/PauseConfirmationViewModel;", "Landroidx/lifecycle/ViewModel;", "repository", "Lnl/rijksoverheid/en/settings/SettingsRepository;", "(Lnl/rijksoverheid/en/settings/SettingsRepository;)V", "skipConfirmation", "Landroidx/lifecycle/LiveData;", "", "getSkipConfirmation", "()Landroidx/lifecycle/LiveData;", "setExposureNotificationsPaused", "", "until", "Ljava/time/LocalDateTime;", "toggleDontAskForConfirmation", "app_accDebug"})
public final class PauseConfirmationViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.lang.Boolean> skipConfirmation = null;
    private final nl.rijksoverheid.en.settings.SettingsRepository repository = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Boolean> getSkipConfirmation() {
        return null;
    }
    
    public final void toggleDontAskForConfirmation() {
    }
    
    public final void setExposureNotificationsPaused(@org.jetbrains.annotations.NotNull()
    java.time.LocalDateTime until) {
    }
    
    public PauseConfirmationViewModel(@org.jetbrains.annotations.NotNull()
    nl.rijksoverheid.en.settings.SettingsRepository repository) {
        super();
    }
}