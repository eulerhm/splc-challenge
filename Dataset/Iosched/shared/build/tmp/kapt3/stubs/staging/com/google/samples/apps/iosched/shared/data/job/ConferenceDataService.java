package com.google.samples.apps.iosched.shared.data.job;

import java.lang.System;

/**
 * A Job that refreshes the conference data in the repository (if the app is active) and
 * in the cache (if the app is not active).
 */
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u000b\u001a\u00020\fH\u0016J\u0012\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016J\u0012\u0010\u0011\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lcom/google/samples/apps/iosched/shared/data/job/ConferenceDataService;", "Landroid/app/job/JobService;", "()V", "refreshEventDataUseCase", "Lcom/google/samples/apps/iosched/shared/domain/RefreshConferenceDataUseCase;", "getRefreshEventDataUseCase", "()Lcom/google/samples/apps/iosched/shared/domain/RefreshConferenceDataUseCase;", "setRefreshEventDataUseCase", "(Lcom/google/samples/apps/iosched/shared/domain/RefreshConferenceDataUseCase;)V", "serviceScope", "Lkotlinx/coroutines/CoroutineScope;", "onDestroy", "", "onStartJob", "", "params", "Landroid/app/job/JobParameters;", "onStopJob", "Companion", "shared_staging"})
@dagger.hilt.android.AndroidEntryPoint()
public final class ConferenceDataService extends android.app.job.JobService {
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.google.samples.apps.iosched.shared.domain.RefreshConferenceDataUseCase refreshEventDataUseCase;
    private final kotlinx.coroutines.CoroutineScope serviceScope = null;
    public static final int JOB_ID = 16650208;
    public static final com.google.samples.apps.iosched.shared.data.job.ConferenceDataService.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.google.samples.apps.iosched.shared.domain.RefreshConferenceDataUseCase getRefreshEventDataUseCase() {
        return null;
    }
    
    public final void setRefreshEventDataUseCase(@org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.shared.domain.RefreshConferenceDataUseCase p0) {
    }
    
    @java.lang.Override()
    public boolean onStartJob(@org.jetbrains.annotations.Nullable()
    android.app.job.JobParameters params) {
        return false;
    }
    
    @java.lang.Override()
    public boolean onStopJob(@org.jetbrains.annotations.Nullable()
    android.app.job.JobParameters params) {
        return false;
    }
    
    @java.lang.Override()
    public void onDestroy() {
    }
    
    public ConferenceDataService() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/google/samples/apps/iosched/shared/data/job/ConferenceDataService$Companion;", "", "()V", "JOB_ID", "", "shared_staging"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}