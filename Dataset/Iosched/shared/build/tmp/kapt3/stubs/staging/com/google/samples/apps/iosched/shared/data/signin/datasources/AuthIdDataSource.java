package com.google.samples.apps.iosched.shared.data.signin.datasources;

import java.lang.System;

/**
 * Interface to simply get the current authenticated user ID.
 */
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\n\u0010\u0002\u001a\u0004\u0018\u00010\u0003H&\u00a8\u0006\u0004"}, d2 = {"Lcom/google/samples/apps/iosched/shared/data/signin/datasources/AuthIdDataSource;", "", "getUserId", "", "shared_staging"})
public abstract interface AuthIdDataSource {
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.String getUserId();
}