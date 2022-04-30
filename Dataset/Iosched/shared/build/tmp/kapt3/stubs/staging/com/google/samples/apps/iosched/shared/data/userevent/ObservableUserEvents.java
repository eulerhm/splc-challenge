package com.google.samples.apps.iosched.shared.data.userevent;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u00a2\u0006\u0002\u0010\tJ\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\bH\u00c6\u0003J1\u0010\u0013\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bH\u00c6\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0017\u001a\u00020\u0018H\u00d6\u0001J\t\u0010\u0019\u001a\u00020\u001aH\u00d6\u0001R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f\u00a8\u0006\u001b"}, d2 = {"Lcom/google/samples/apps/iosched/shared/data/userevent/ObservableUserEvents;", "", "userSessions", "", "Lcom/google/samples/apps/iosched/model/userdata/UserSession;", "userMessage", "Lcom/google/samples/apps/iosched/shared/data/userevent/UserEventMessage;", "userMessageSession", "Lcom/google/samples/apps/iosched/model/Session;", "(Ljava/util/List;Lcom/google/samples/apps/iosched/shared/data/userevent/UserEventMessage;Lcom/google/samples/apps/iosched/model/Session;)V", "getUserMessage", "()Lcom/google/samples/apps/iosched/shared/data/userevent/UserEventMessage;", "getUserMessageSession", "()Lcom/google/samples/apps/iosched/model/Session;", "getUserSessions", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "shared_staging"})
public final class ObservableUserEvents {
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.google.samples.apps.iosched.model.userdata.UserSession> userSessions = null;
    
    /**
     * A message to show to the user with important changes like reservation confirmations
     */
    @org.jetbrains.annotations.Nullable()
    private final com.google.samples.apps.iosched.shared.data.userevent.UserEventMessage userMessage = null;
    
    /**
     * The session the user message is about, if any.
     */
    @org.jetbrains.annotations.Nullable()
    private final com.google.samples.apps.iosched.model.Session userMessageSession = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.google.samples.apps.iosched.model.userdata.UserSession> getUserSessions() {
        return null;
    }
    
    /**
     * A message to show to the user with important changes like reservation confirmations
     */
    @org.jetbrains.annotations.Nullable()
    public final com.google.samples.apps.iosched.shared.data.userevent.UserEventMessage getUserMessage() {
        return null;
    }
    
    /**
     * The session the user message is about, if any.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.google.samples.apps.iosched.model.Session getUserMessageSession() {
        return null;
    }
    
    public ObservableUserEvents(@org.jetbrains.annotations.NotNull()
    java.util.List<com.google.samples.apps.iosched.model.userdata.UserSession> userSessions, @org.jetbrains.annotations.Nullable()
    com.google.samples.apps.iosched.shared.data.userevent.UserEventMessage userMessage, @org.jetbrains.annotations.Nullable()
    com.google.samples.apps.iosched.model.Session userMessageSession) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.google.samples.apps.iosched.model.userdata.UserSession> component1() {
        return null;
    }
    
    /**
     * A message to show to the user with important changes like reservation confirmations
     */
    @org.jetbrains.annotations.Nullable()
    public final com.google.samples.apps.iosched.shared.data.userevent.UserEventMessage component2() {
        return null;
    }
    
    /**
     * The session the user message is about, if any.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.google.samples.apps.iosched.model.Session component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.google.samples.apps.iosched.shared.data.userevent.ObservableUserEvents copy(@org.jetbrains.annotations.NotNull()
    java.util.List<com.google.samples.apps.iosched.model.userdata.UserSession> userSessions, @org.jetbrains.annotations.Nullable()
    com.google.samples.apps.iosched.shared.data.userevent.UserEventMessage userMessage, @org.jetbrains.annotations.Nullable()
    com.google.samples.apps.iosched.model.Session userMessageSession) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
        return false;
    }
}