package com.google.samples.apps.iosched.shared.data.ar;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0014\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004H\u0016\u00a8\u0006\u0007"}, d2 = {"Lcom/google/samples/apps/iosched/shared/data/ar/FakeArDebugFlagEndpoint;", "Lcom/google/samples/apps/iosched/shared/data/ar/ArDebugFlagEndpoint;", "()V", "canDemoAr", "Landroidx/lifecycle/LiveData;", "Lcom/google/samples/apps/iosched/shared/result/Result;", "", "shared_staging"})
public final class FakeArDebugFlagEndpoint implements com.google.samples.apps.iosched.shared.data.ar.ArDebugFlagEndpoint {
    public static final com.google.samples.apps.iosched.shared.data.ar.FakeArDebugFlagEndpoint INSTANCE = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.lifecycle.LiveData<com.google.samples.apps.iosched.shared.result.Result<java.lang.Boolean>> canDemoAr() {
        return null;
    }
    
    private FakeArDebugFlagEndpoint() {
        super();
    }
}