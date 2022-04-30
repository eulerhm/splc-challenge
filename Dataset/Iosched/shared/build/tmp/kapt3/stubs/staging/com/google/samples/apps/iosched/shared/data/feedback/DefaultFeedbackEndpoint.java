package com.google.samples.apps.iosched.shared.data.feedback;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J7\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\n\u0010\b\u001a\u00060\tj\u0002`\n2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\r0\fH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000f"}, d2 = {"Lcom/google/samples/apps/iosched/shared/data/feedback/DefaultFeedbackEndpoint;", "Lcom/google/samples/apps/iosched/shared/data/feedback/FeedbackEndpoint;", "functions", "Lcom/google/firebase/functions/FirebaseFunctions;", "(Lcom/google/firebase/functions/FirebaseFunctions;)V", "sendFeedback", "Lcom/google/samples/apps/iosched/shared/result/Result;", "", "sessionId", "", "Lcom/google/samples/apps/iosched/model/SessionId;", "responses", "", "", "(Ljava/lang/String;Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "shared_staging"})
public final class DefaultFeedbackEndpoint implements com.google.samples.apps.iosched.shared.data.feedback.FeedbackEndpoint {
    private final com.google.firebase.functions.FirebaseFunctions functions = null;
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object sendFeedback(@org.jetbrains.annotations.NotNull()
    java.lang.String sessionId, @org.jetbrains.annotations.NotNull()
    java.util.Map<java.lang.String, java.lang.Integer> responses, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.google.samples.apps.iosched.shared.result.Result<kotlin.Unit>> p2) {
        return null;
    }
    
    @javax.inject.Inject()
    public DefaultFeedbackEndpoint(@org.jetbrains.annotations.NotNull()
    com.google.firebase.functions.FirebaseFunctions functions) {
        super();
    }
}