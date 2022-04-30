package com.google.samples.apps.iosched.shared.data;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J7\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\n\u0010\u0006\u001a\u00060\u0007j\u0002`\b2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u000b0\nH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\f\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\r"}, d2 = {"Lcom/google/samples/apps/iosched/shared/data/FakeFeedbackEndpoint;", "Lcom/google/samples/apps/iosched/shared/data/feedback/FeedbackEndpoint;", "()V", "sendFeedback", "Lcom/google/samples/apps/iosched/shared/result/Result;", "", "sessionId", "", "Lcom/google/samples/apps/iosched/model/SessionId;", "responses", "", "", "(Ljava/lang/String;Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "shared_staging"})
public final class FakeFeedbackEndpoint implements com.google.samples.apps.iosched.shared.data.feedback.FeedbackEndpoint {
    public static final com.google.samples.apps.iosched.shared.data.FakeFeedbackEndpoint INSTANCE = null;
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object sendFeedback(@org.jetbrains.annotations.NotNull()
    java.lang.String sessionId, @org.jetbrains.annotations.NotNull()
    java.util.Map<java.lang.String, java.lang.Integer> responses, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.google.samples.apps.iosched.shared.result.Result<kotlin.Unit>> p2) {
        return null;
    }
    
    private FakeFeedbackEndpoint() {
        super();
    }
}