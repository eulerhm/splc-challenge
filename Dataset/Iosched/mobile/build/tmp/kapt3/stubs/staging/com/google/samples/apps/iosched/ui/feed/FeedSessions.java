package com.google.samples.apps.iosched.ui.feed;

import java.lang.System;

/**
 * A data class representing the state of FeedSEssionsContainer
 */
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0015\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001BA\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\rJ\t\u0010\u0016\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0017\u001a\u00020\u0003H\u00c6\u0003J\u000f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u00c6\u0003J\t\u0010\u0019\u001a\u00020\tH\u00c6\u0003J\t\u0010\u001a\u001a\u00020\u000bH\u00c6\u0003J\t\u0010\u001b\u001a\u00020\u000bH\u00c6\u0003JK\u0010\u001c\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000bH\u00c6\u0001J\u0013\u0010\u001d\u001a\u00020\u000b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001f\u001a\u00020\u0003H\u00d6\u0001J\t\u0010 \u001a\u00020!H\u00d6\u0001R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\f\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0010R\u0011\u0010\n\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0010R\u0011\u0010\b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015\u00a8\u0006\""}, d2 = {"Lcom/google/samples/apps/iosched/ui/feed/FeedSessions;", "", "titleId", "", "actionTextId", "userSessions", "", "Lcom/google/samples/apps/iosched/model/userdata/UserSession;", "timeZoneId", "Lorg/threeten/bp/ZoneId;", "isMapFeatureEnabled", "", "isLoading", "(IILjava/util/List;Lorg/threeten/bp/ZoneId;ZZ)V", "getActionTextId", "()I", "()Z", "getTimeZoneId", "()Lorg/threeten/bp/ZoneId;", "getTitleId", "getUserSessions", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "toString", "", "mobile_staging"})
public final class FeedSessions {
    private final int titleId = 0;
    private final int actionTextId = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.google.samples.apps.iosched.model.userdata.UserSession> userSessions = null;
    @org.jetbrains.annotations.NotNull()
    private final org.threeten.bp.ZoneId timeZoneId = null;
    private final boolean isMapFeatureEnabled = false;
    private final boolean isLoading = false;
    
    public final int getTitleId() {
        return 0;
    }
    
    public final int getActionTextId() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.google.samples.apps.iosched.model.userdata.UserSession> getUserSessions() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.threeten.bp.ZoneId getTimeZoneId() {
        return null;
    }
    
    public final boolean isMapFeatureEnabled() {
        return false;
    }
    
    public final boolean isLoading() {
        return false;
    }
    
    public FeedSessions(@androidx.annotation.StringRes()
    int titleId, @androidx.annotation.StringRes()
    int actionTextId, @org.jetbrains.annotations.NotNull()
    java.util.List<com.google.samples.apps.iosched.model.userdata.UserSession> userSessions, @org.jetbrains.annotations.NotNull()
    org.threeten.bp.ZoneId timeZoneId, boolean isMapFeatureEnabled, boolean isLoading) {
        super();
    }
    
    public final int component1() {
        return 0;
    }
    
    public final int component2() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.google.samples.apps.iosched.model.userdata.UserSession> component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.threeten.bp.ZoneId component4() {
        return null;
    }
    
    public final boolean component5() {
        return false;
    }
    
    public final boolean component6() {
        return false;
    }
    
    /**
     * A data class representing the state of FeedSEssionsContainer
     */
    @org.jetbrains.annotations.NotNull()
    public final com.google.samples.apps.iosched.ui.feed.FeedSessions copy(@androidx.annotation.StringRes()
    int titleId, @androidx.annotation.StringRes()
    int actionTextId, @org.jetbrains.annotations.NotNull()
    java.util.List<com.google.samples.apps.iosched.model.userdata.UserSession> userSessions, @org.jetbrains.annotations.NotNull()
    org.threeten.bp.ZoneId timeZoneId, boolean isMapFeatureEnabled, boolean isLoading) {
        return null;
    }
    
    /**
     * A data class representing the state of FeedSEssionsContainer
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    /**
     * A data class representing the state of FeedSEssionsContainer
     */
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    /**
     * A data class representing the state of FeedSEssionsContainer
     */
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
        return false;
    }
}