package com.google.samples.apps.iosched.shared.data.signin.datasources;

import java.lang.System;

/**
 * Listens to an Authentication state data source that emits updates on the current user.
 *
 * @see FirebaseAuthStateUserDataSource
 */
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00040\u0003H&\u00a8\u0006\u0006"}, d2 = {"Lcom/google/samples/apps/iosched/shared/data/signin/datasources/AuthStateUserDataSource;", "", "getBasicUserInfo", "Lkotlinx/coroutines/flow/Flow;", "Lcom/google/samples/apps/iosched/shared/result/Result;", "Lcom/google/samples/apps/iosched/shared/data/signin/AuthenticatedUserInfoBasic;", "shared_staging"})
public abstract interface AuthStateUserDataSource {
    
    /**
     * Returns an observable of the [AuthenticatedUserInfoBasic].
     */
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<com.google.samples.apps.iosched.shared.result.Result<com.google.samples.apps.iosched.shared.data.signin.AuthenticatedUserInfoBasic>> getBasicUserInfo();
}