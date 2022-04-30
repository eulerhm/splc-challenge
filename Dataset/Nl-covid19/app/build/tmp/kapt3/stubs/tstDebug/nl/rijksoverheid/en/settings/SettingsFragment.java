package nl.rijksoverheid.en.settings;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u0013H\u0016J\u001a\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u0013H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0007\u001a\u00020\b8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR\u001b\u0010\r\u001a\u00020\u000e8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0011\u0010\f\u001a\u0004\b\u000f\u0010\u0010\u00a8\u0006\u001b"}, d2 = {"Lnl/rijksoverheid/en/settings/SettingsFragment;", "Lnl/rijksoverheid/en/BaseFragment;", "()V", "localeHelper", "Lnl/rijksoverheid/en/util/LocaleHelper;", "pausedDurationTimer", "Lnl/rijksoverheid/en/util/SimpleCountdownTimer;", "settingsViewModel", "Lnl/rijksoverheid/en/settings/SettingsViewModel;", "getSettingsViewModel", "()Lnl/rijksoverheid/en/settings/SettingsViewModel;", "settingsViewModel$delegate", "Lkotlin/Lazy;", "viewModel", "Lnl/rijksoverheid/en/ExposureNotificationsViewModel;", "getViewModel", "()Lnl/rijksoverheid/en/ExposureNotificationsViewModel;", "viewModel$delegate", "onPause", "", "onResume", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "showPauseDurationBottomSheet", "app_tstDebug"})
public final class SettingsFragment extends nl.rijksoverheid.en.BaseFragment {
    private final kotlin.Lazy viewModel$delegate = null;
    private final kotlin.Lazy settingsViewModel$delegate = null;
    private final nl.rijksoverheid.en.util.LocaleHelper localeHelper = null;
    private nl.rijksoverheid.en.util.SimpleCountdownTimer pausedDurationTimer;
    
    private final nl.rijksoverheid.en.ExposureNotificationsViewModel getViewModel() {
        return null;
    }
    
    private final nl.rijksoverheid.en.settings.SettingsViewModel getSettingsViewModel() {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onResume() {
    }
    
    @java.lang.Override()
    public void onPause() {
    }
    
    private final void showPauseDurationBottomSheet() {
    }
    
    public SettingsFragment() {
        super(0, null);
    }
}