package com.google.samples.apps.iosched.shared.domain.sessions;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001BG\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\r\u00a2\u0006\u0002\u0010\u000eJ\u000f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\bH\u00c6\u0003J\t\u0010\u001d\u001a\u00020\nH\u00c6\u0003J\t\u0010\u001e\u001a\u00020\nH\u00c6\u0003J\t\u0010\u001f\u001a\u00020\rH\u00c6\u0003JO\u0010 \u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\rH\u00c6\u0001J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010$\u001a\u00020\nH\u00d6\u0001J\t\u0010%\u001a\u00020&H\u00d6\u0001R\u0011\u0010\f\u001a\u00020\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u000b\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0012R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019\u00a8\u0006\'"}, d2 = {"Lcom/google/samples/apps/iosched/shared/domain/sessions/LoadScheduleUserSessionsResult;", "", "userSessions", "", "Lcom/google/samples/apps/iosched/model/userdata/UserSession;", "userMessage", "Lcom/google/samples/apps/iosched/shared/data/userevent/UserEventMessage;", "userMessageSession", "Lcom/google/samples/apps/iosched/model/Session;", "userSessionCount", "", "firstUnfinishedSessionIndex", "dayIndexer", "Lcom/google/samples/apps/iosched/shared/domain/sessions/ConferenceDayIndexer;", "(Ljava/util/List;Lcom/google/samples/apps/iosched/shared/data/userevent/UserEventMessage;Lcom/google/samples/apps/iosched/model/Session;IILcom/google/samples/apps/iosched/shared/domain/sessions/ConferenceDayIndexer;)V", "getDayIndexer", "()Lcom/google/samples/apps/iosched/shared/domain/sessions/ConferenceDayIndexer;", "getFirstUnfinishedSessionIndex", "()I", "getUserMessage", "()Lcom/google/samples/apps/iosched/shared/data/userevent/UserEventMessage;", "getUserMessageSession", "()Lcom/google/samples/apps/iosched/model/Session;", "getUserSessionCount", "getUserSessions", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "", "shared_staging"})
public final class LoadScheduleUserSessionsResult {
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
    
    /**
     * The total number of sessions.
     */
    private final int userSessionCount = 0;
    
    /**
     * The location of the first session which has not finished.
     */
    private final int firstUnfinishedSessionIndex = 0;
    @org.jetbrains.annotations.NotNull()
    private final com.google.samples.apps.iosched.shared.domain.sessions.ConferenceDayIndexer dayIndexer = null;
    
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
    
    /**
     * The total number of sessions.
     */
    public final int getUserSessionCount() {
        return 0;
    }
    
    /**
     * The location of the first session which has not finished.
     */
    public final int getFirstUnfinishedSessionIndex() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.google.samples.apps.iosched.shared.domain.sessions.ConferenceDayIndexer getDayIndexer() {
        return null;
    }
    
    public LoadScheduleUserSessionsResult(@org.jetbrains.annotations.NotNull()
    java.util.List<com.google.samples.apps.iosched.model.userdata.UserSession> userSessions, @org.jetbrains.annotations.Nullable()
    com.google.samples.apps.iosched.shared.data.userevent.UserEventMessage userMessage, @org.jetbrains.annotations.Nullable()
    com.google.samples.apps.iosched.model.Session userMessageSession, int userSessionCount, int firstUnfinishedSessionIndex, @org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.shared.domain.sessions.ConferenceDayIndexer dayIndexer) {
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
    
    /**
     * The total number of sessions.
     */
    public final int component4() {
        return 0;
    }
    
    /**
     * The location of the first session which has not finished.
     */
    public final int component5() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.google.samples.apps.iosched.shared.domain.sessions.ConferenceDayIndexer component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.google.samples.apps.iosched.shared.domain.sessions.LoadScheduleUserSessionsResult copy(@org.jetbrains.annotations.NotNull()
    java.util.List<com.google.samples.apps.iosched.model.userdata.UserSession> userSessions, @org.jetbrains.annotations.Nullable()
    com.google.samples.apps.iosched.shared.data.userevent.UserEventMessage userMessage, @org.jetbrains.annotations.Nullable()
    com.google.samples.apps.iosched.model.Session userMessageSession, int userSessionCount, int firstUnfinishedSessionIndex, @org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.shared.domain.sessions.ConferenceDayIndexer dayIndexer) {
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