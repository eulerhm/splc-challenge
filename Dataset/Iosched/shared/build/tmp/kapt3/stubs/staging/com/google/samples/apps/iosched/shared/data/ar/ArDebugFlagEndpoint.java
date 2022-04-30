package com.google.samples.apps.iosched.shared.data.ar;

import java.lang.System;

/**
 * Interface that checkes if a signed user is able to demo the AR feature
 */
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003H&\u00a8\u0006\u0006"}, d2 = {"Lcom/google/samples/apps/iosched/shared/data/ar/ArDebugFlagEndpoint;", "", "canDemoAr", "Landroidx/lifecycle/LiveData;", "Lcom/google/samples/apps/iosched/shared/result/Result;", "", "shared_staging"})
public abstract interface ArDebugFlagEndpoint {
    
    /**
     * Asks if the signed in user can demo the AR feature (bypass the teaser page)
     */
    @org.jetbrains.annotations.NotNull()
    public abstract androidx.lifecycle.LiveData<com.google.samples.apps.iosched.shared.result.Result<java.lang.Boolean>> canDemoAr();
}