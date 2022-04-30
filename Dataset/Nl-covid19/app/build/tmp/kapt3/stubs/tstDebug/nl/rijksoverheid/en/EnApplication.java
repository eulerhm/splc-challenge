package nl.rijksoverheid.en;

import java.lang.System;

@kotlin.Suppress(names = {"ConstantConditionIf"})
@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\n\u001a\u00020\u000bH\u0016J\b\u0010\f\u001a\u00020\rH\u0017R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u000e"}, d2 = {"Lnl/rijksoverheid/en/EnApplication;", "Landroid/app/Application;", "Landroidx/work/Configuration$Provider;", "()V", "notificationsRepository", "Lnl/rijksoverheid/en/notifier/NotificationsRepository;", "getNotificationsRepository", "()Lnl/rijksoverheid/en/notifier/NotificationsRepository;", "notificationsRepository$delegate", "Lkotlin/Lazy;", "getWorkManagerConfiguration", "Landroidx/work/Configuration;", "onCreate", "", "app_tstDebug"})
public final class EnApplication extends android.app.Application implements androidx.work.Configuration.Provider {
    private final kotlin.Lazy notificationsRepository$delegate = null;
    
    private final nl.rijksoverheid.en.notifier.NotificationsRepository getNotificationsRepository() {
        return null;
    }
    
    @android.annotation.SuppressLint(value = {"RestrictedApi"})
    @java.lang.Override()
    public void onCreate() {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.work.Configuration getWorkManagerConfiguration() {
        return null;
    }
    
    public EnApplication() {
        super();
    }
}