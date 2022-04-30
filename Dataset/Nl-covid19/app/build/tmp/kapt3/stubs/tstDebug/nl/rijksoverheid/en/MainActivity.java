package nl.rijksoverheid.en;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0017H\u0002J\u0010\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J\u0012\u0010\u001b\u001a\u00020\u00172\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0014J\u0012\u0010\u001e\u001a\u00020\u00172\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0014J\b\u0010\u001f\u001a\u00020\u0017H\u0014J\b\u0010 \u001a\u00020\u0017H\u0014R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u000b\u001a\u0010\u0012\f\u0012\n \u000e*\u0004\u0018\u00010\r0\r0\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u000f\u001a\u00020\u00108BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0013\u0010\b\u001a\u0004\b\u0011\u0010\u0012\u00a8\u0006!"}, d2 = {"Lnl/rijksoverheid/en/MainActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "appLifecycleViewModel", "Lnl/rijksoverheid/en/applifecycle/AppLifecycleViewModel;", "getAppLifecycleViewModel", "()Lnl/rijksoverheid/en/applifecycle/AppLifecycleViewModel;", "appLifecycleViewModel$delegate", "Lkotlin/Lazy;", "binding", "Lnl/rijksoverheid/en/databinding/ActivityMainBinding;", "requestConsent", "Landroidx/activity/result/ActivityResultLauncher;", "Landroidx/activity/result/IntentSenderRequest;", "kotlin.jvm.PlatformType", "viewModel", "Lnl/rijksoverheid/en/ExposureNotificationsViewModel;", "getViewModel", "()Lnl/rijksoverheid/en/ExposureNotificationsViewModel;", "viewModel$delegate", "getDefaultViewModelProviderFactory", "Landroidx/lifecycle/ViewModelProvider$Factory;", "handleEndOfLifeState", "", "handleUpdateState", "update", "Lnl/rijksoverheid/en/applifecycle/AppLifecycleManager$UpdateState;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onPostCreate", "onResume", "onStart", "app_tstDebug"})
public final class MainActivity extends androidx.appcompat.app.AppCompatActivity {
    private final kotlin.Lazy viewModel$delegate = null;
    private final kotlin.Lazy appLifecycleViewModel$delegate = null;
    private nl.rijksoverheid.en.databinding.ActivityMainBinding binding;
    private final androidx.activity.result.ActivityResultLauncher<androidx.activity.result.IntentSenderRequest> requestConsent = null;
    
    private final nl.rijksoverheid.en.ExposureNotificationsViewModel getViewModel() {
        return null;
    }
    
    private final nl.rijksoverheid.en.applifecycle.AppLifecycleViewModel getAppLifecycleViewModel() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void handleUpdateState(nl.rijksoverheid.en.applifecycle.AppLifecycleManager.UpdateState update) {
    }
    
    private final void handleEndOfLifeState() {
    }
    
    @java.lang.Override()
    protected void onPostCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    protected void onStart() {
    }
    
    @java.lang.Override()
    protected void onResume() {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.lifecycle.ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        return null;
    }
    
    public MainActivity() {
        super();
    }
}