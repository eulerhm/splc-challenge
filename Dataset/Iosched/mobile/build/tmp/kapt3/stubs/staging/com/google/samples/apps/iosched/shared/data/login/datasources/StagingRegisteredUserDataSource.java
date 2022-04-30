package com.google.samples.apps.iosched.shared.data.login.datasources;

import java.lang.System;

/**
 * A configurable [RegisteredUserDataSource] used for staging.
 *
 * @see LoginModule
 */
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001e\u0010\u0006\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\b0\u00072\u0006\u0010\t\u001a\u00020\nH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0005\u00a8\u0006\u000b"}, d2 = {"Lcom/google/samples/apps/iosched/shared/data/login/datasources/StagingRegisteredUserDataSource;", "Lcom/google/samples/apps/iosched/shared/data/signin/datasources/RegisteredUserDataSource;", "isRegistered", "", "(Z)V", "()Z", "observeUserChanges", "Lkotlinx/coroutines/flow/Flow;", "Lcom/google/samples/apps/iosched/shared/result/Result;", "userId", "", "mobile_staging"})
public final class StagingRegisteredUserDataSource implements com.google.samples.apps.iosched.shared.data.signin.datasources.RegisteredUserDataSource {
    private final boolean isRegistered = false;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public kotlinx.coroutines.flow.Flow<com.google.samples.apps.iosched.shared.result.Result<java.lang.Boolean>> observeUserChanges(@org.jetbrains.annotations.NotNull()
    java.lang.String userId) {
        return null;
    }
    
    public final boolean isRegistered() {
        return false;
    }
    
    public StagingRegisteredUserDataSource(boolean isRegistered) {
        super();
    }
}