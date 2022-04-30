package nl.rijksoverheid.en.job;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B>\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u001c\u0010\b\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\t\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\rJ\u0011\u0010\u000f\u001a\u00020\u0010H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0011R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R)\u0010\b\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\tX\u0082\u0004\u00f8\u0001\u0000\u00a2\u0006\u0004\n\u0002\u0010\u000e\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0013"}, d2 = {"Lnl/rijksoverheid/en/job/UploadDiagnosisKeysJob;", "Landroidx/work/CoroutineWorker;", "context", "Landroid/content/Context;", "params", "Landroidx/work/WorkerParameters;", "notificationsRepository", "Lnl/rijksoverheid/en/notifier/NotificationsRepository;", "uploadTask", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "Lnl/rijksoverheid/en/labtest/LabTestRepository$UploadDiagnosticKeysResult;", "", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Lnl/rijksoverheid/en/notifier/NotificationsRepository;Lkotlin/jvm/functions/Function1;)V", "Lkotlin/jvm/functions/Function1;", "doWork", "Landroidx/work/ListenableWorker$Result;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "app_accDebug"})
public final class UploadDiagnosisKeysJob extends androidx.work.CoroutineWorker {
    private final nl.rijksoverheid.en.notifier.NotificationsRepository notificationsRepository = null;
    private final kotlin.jvm.functions.Function1<kotlin.coroutines.Continuation<? super nl.rijksoverheid.en.labtest.LabTestRepository.UploadDiagnosticKeysResult>, java.lang.Object> uploadTask = null;
    @org.jetbrains.annotations.NotNull()
    public static final nl.rijksoverheid.en.job.UploadDiagnosisKeysJob.Companion Companion = null;
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object doWork(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super androidx.work.ListenableWorker.Result> p0) {
        return null;
    }
    
    public UploadDiagnosisKeysJob(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    androidx.work.WorkerParameters params, @org.jetbrains.annotations.NotNull()
    nl.rijksoverheid.en.notifier.NotificationsRepository notificationsRepository, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super nl.rijksoverheid.en.labtest.LabTestRepository.UploadDiagnosticKeysResult>, ? extends java.lang.Object> uploadTask) {
        super(null, null);
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"}, d2 = {"Lnl/rijksoverheid/en/job/UploadDiagnosisKeysJob$Companion;", "", "()V", "schedule", "", "context", "Landroid/content/Context;", "app_accDebug"})
    public static final class Companion {
        
        public final void schedule(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
        }
        
        private Companion() {
            super();
        }
    }
}