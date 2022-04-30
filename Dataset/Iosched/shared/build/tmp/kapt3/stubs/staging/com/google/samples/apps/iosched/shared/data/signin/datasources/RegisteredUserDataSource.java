package com.google.samples.apps.iosched.shared.data.signin.datasources;

import java.lang.System;

/**
 * A data source that listens to changes in the user data related to event
 * registration.
 */
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u001e\u0010\u0002\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00040\u00032\u0006\u0010\u0006\u001a\u00020\u0007H&\u00a8\u0006\b"}, d2 = {"Lcom/google/samples/apps/iosched/shared/data/signin/datasources/RegisteredUserDataSource;", "", "observeUserChanges", "Lkotlinx/coroutines/flow/Flow;", "Lcom/google/samples/apps/iosched/shared/result/Result;", "", "userId", "", "shared_staging"})
public abstract interface RegisteredUserDataSource {
    
    /**
     * Returns the holder of the result of listening to the data source.
     */
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<com.google.samples.apps.iosched.shared.result.Result<java.lang.Boolean>> observeUserChanges(@org.jetbrains.annotations.NotNull()
    java.lang.String userId);
}