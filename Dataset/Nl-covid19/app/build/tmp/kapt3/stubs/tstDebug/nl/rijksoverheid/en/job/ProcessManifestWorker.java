package nl.rijksoverheid.en.job;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u0011\u0010\u000b\u001a\u00020\fH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\rR\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000f"}, d2 = {"Lnl/rijksoverheid/en/job/ProcessManifestWorker;", "Landroidx/work/CoroutineWorker;", "context", "Landroid/content/Context;", "params", "Landroidx/work/WorkerParameters;", "repository", "Lnl/rijksoverheid/en/ExposureNotificationsRepository;", "notificationsRepository", "Lnl/rijksoverheid/en/notifier/NotificationsRepository;", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Lnl/rijksoverheid/en/ExposureNotificationsRepository;Lnl/rijksoverheid/en/notifier/NotificationsRepository;)V", "doWork", "Landroidx/work/ListenableWorker$Result;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "app_tstDebug"})
public final class ProcessManifestWorker extends androidx.work.CoroutineWorker {
    private final nl.rijksoverheid.en.ExposureNotificationsRepository repository = null;
    private final nl.rijksoverheid.en.notifier.NotificationsRepository notificationsRepository = null;
    @org.jetbrains.annotations.NotNull()
    public static final nl.rijksoverheid.en.job.ProcessManifestWorker.Companion Companion = null;
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object doWork(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super androidx.work.ListenableWorker.Result> p0) {
        return null;
    }
    
    public ProcessManifestWorker(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    androidx.work.WorkerParameters params, @org.jetbrains.annotations.NotNull()
    nl.rijksoverheid.en.ExposureNotificationsRepository repository, @org.jetbrains.annotations.NotNull()
    nl.rijksoverheid.en.notifier.NotificationsRepository notificationsRepository) {
        super(null, null);
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u0018\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\t\u00a8\u0006\n"}, d2 = {"Lnl/rijksoverheid/en/job/ProcessManifestWorker$Companion;", "", "()V", "cancel", "", "context", "Landroid/content/Context;", "queue", "intervalMinutes", "", "app_tstDebug"})
    public static final class Companion {
        
        public final void queue(@org.jetbrains.annotations.NotNull()
        android.content.Context context, int intervalMinutes) {
        }
        
        public final void cancel(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
        }
        
        private Companion() {
            super();
        }
    }
}