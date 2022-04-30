package com.google.samples.apps.iosched.shared.data.session.json;

import java.lang.System;

/**
 * Like `Session` but with list of IDs instead of objects in tags, speakers and related sessions.
 */
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0010\"\n\u0002\b\'\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u008b\u0001\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u0011\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00030\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0003\u0012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00030\u0013\u00a2\u0006\u0002\u0010\u0016J\r\u0010)\u001a\u00060\u0003j\u0002`\u0004H\u00c6\u0003J\t\u0010*\u001a\u00020\u0003H\u00c6\u0003J\u000f\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00030\u0011H\u00c6\u0003J\u000f\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00030\u0013H\u00c6\u0003J\t\u0010-\u001a\u00020\u0003H\u00c6\u0003J\u000f\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00030\u0013H\u00c6\u0003J\t\u0010/\u001a\u00020\u0006H\u00c6\u0003J\t\u00100\u001a\u00020\u0006H\u00c6\u0003J\t\u00101\u001a\u00020\u0003H\u00c6\u0003J\t\u00102\u001a\u00020\u0003H\u00c6\u0003J\t\u00103\u001a\u00020\u0003H\u00c6\u0003J\t\u00104\u001a\u00020\u0003H\u00c6\u0003J\t\u00105\u001a\u00020\rH\u00c6\u0003J\t\u00106\u001a\u00020\u0003H\u00c6\u0003J\u00ab\u0001\u00107\u001a\u00020\u00002\f\b\u0002\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00032\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u00112\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00030\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00032\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00030\u0013H\u00c6\u0001J\u0013\u00108\u001a\u00020\r2\b\u00109\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010:\u001a\u00020;H\u00d6\u0001J\t\u0010<\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\t\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u000f\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018R\u0011\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0015\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0018R\u0011\u0010\f\u001a\u00020\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u001dR\u0011\u0010\u0014\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0018R\u0017\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00030\u0013\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0011\u0010\u000b\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0018R\u0011\u0010\n\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0018R\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00030\u0013\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010 R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001bR\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0011\u0010\b\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\'\u0010\u0018R\u0011\u0010\u000e\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b(\u0010\u0018\u00a8\u0006="}, d2 = {"Lcom/google/samples/apps/iosched/shared/data/session/json/SessionTemp;", "", "id", "", "Lcom/google/samples/apps/iosched/model/SessionId;", "startTime", "Lorg/threeten/bp/ZonedDateTime;", "endTime", "title", "description", "sessionUrl", "room", "isLivestream", "", "youTubeUrl", "doryLink", "tagNames", "", "speakers", "", "photoUrl", "relatedSessions", "(Ljava/lang/String;Lorg/threeten/bp/ZonedDateTime;Lorg/threeten/bp/ZonedDateTime;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/Set;Ljava/lang/String;Ljava/util/Set;)V", "getDescription", "()Ljava/lang/String;", "getDoryLink", "getEndTime", "()Lorg/threeten/bp/ZonedDateTime;", "getId", "()Z", "getPhotoUrl", "getRelatedSessions", "()Ljava/util/Set;", "getRoom", "getSessionUrl", "getSpeakers", "getStartTime", "getTagNames", "()Ljava/util/List;", "getTitle", "getYouTubeUrl", "component1", "component10", "component11", "component12", "component13", "component14", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "", "toString", "shared_staging"})
public final class SessionTemp {
    
    /**
     * Unique string identifying this session.
     */
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String id = null;
    
    /**
     * Start time of the session
     */
    @org.jetbrains.annotations.NotNull()
    private final org.threeten.bp.ZonedDateTime startTime = null;
    
    /**
     * End time of the session
     */
    @org.jetbrains.annotations.NotNull()
    private final org.threeten.bp.ZonedDateTime endTime = null;
    
    /**
     * Session title.
     */
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String title = null;
    
    /**
     * Body of text explaining this session in detail.
     */
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String description = null;
    
    /**
     * Full URL for the session online.
     */
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String sessionUrl = null;
    
    /**
     * The session room.
     */
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String room = null;
    
    /**
     * Indicates if the Session has a live stream.
     */
    private final boolean isLivestream = false;
    
    /**
     * Full URL to YouTube.
     */
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String youTubeUrl = null;
    
    /**
     * URL to the Dory page.
     */
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String doryLink = null;
    
    /**
     * IDs of the `Tag`s associated with the session. Ordered, with the most important tags
     * appearing first.
     */
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<java.lang.String> tagNames = null;
    
    /**
     * IDs of the session speakers.
     */
    @org.jetbrains.annotations.NotNull()
    private final java.util.Set<java.lang.String> speakers = null;
    
    /**
     * The session's photo URL.
     */
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String photoUrl = null;
    
    /**
     * IDs of the sessions related to this session.
     */
    @org.jetbrains.annotations.NotNull()
    private final java.util.Set<java.lang.String> relatedSessions = null;
    
    /**
     * Unique string identifying this session.
     */
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getId() {
        return null;
    }
    
    /**
     * Start time of the session
     */
    @org.jetbrains.annotations.NotNull()
    public final org.threeten.bp.ZonedDateTime getStartTime() {
        return null;
    }
    
    /**
     * End time of the session
     */
    @org.jetbrains.annotations.NotNull()
    public final org.threeten.bp.ZonedDateTime getEndTime() {
        return null;
    }
    
    /**
     * Session title.
     */
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTitle() {
        return null;
    }
    
    /**
     * Body of text explaining this session in detail.
     */
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDescription() {
        return null;
    }
    
    /**
     * Full URL for the session online.
     */
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getSessionUrl() {
        return null;
    }
    
    /**
     * The session room.
     */
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getRoom() {
        return null;
    }
    
    /**
     * Indicates if the Session has a live stream.
     */
    public final boolean isLivestream() {
        return false;
    }
    
    /**
     * Full URL to YouTube.
     */
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getYouTubeUrl() {
        return null;
    }
    
    /**
     * URL to the Dory page.
     */
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDoryLink() {
        return null;
    }
    
    /**
     * IDs of the `Tag`s associated with the session. Ordered, with the most important tags
     * appearing first.
     */
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> getTagNames() {
        return null;
    }
    
    /**
     * IDs of the session speakers.
     */
    @org.jetbrains.annotations.NotNull()
    public final java.util.Set<java.lang.String> getSpeakers() {
        return null;
    }
    
    /**
     * The session's photo URL.
     */
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPhotoUrl() {
        return null;
    }
    
    /**
     * IDs of the sessions related to this session.
     */
    @org.jetbrains.annotations.NotNull()
    public final java.util.Set<java.lang.String> getRelatedSessions() {
        return null;
    }
    
    public SessionTemp(@org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    org.threeten.bp.ZonedDateTime startTime, @org.jetbrains.annotations.NotNull()
    org.threeten.bp.ZonedDateTime endTime, @org.jetbrains.annotations.NotNull()
    java.lang.String title, @org.jetbrains.annotations.NotNull()
    java.lang.String description, @org.jetbrains.annotations.NotNull()
    java.lang.String sessionUrl, @org.jetbrains.annotations.NotNull()
    java.lang.String room, boolean isLivestream, @org.jetbrains.annotations.NotNull()
    java.lang.String youTubeUrl, @org.jetbrains.annotations.NotNull()
    java.lang.String doryLink, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> tagNames, @org.jetbrains.annotations.NotNull()
    java.util.Set<java.lang.String> speakers, @org.jetbrains.annotations.NotNull()
    java.lang.String photoUrl, @org.jetbrains.annotations.NotNull()
    java.util.Set<java.lang.String> relatedSessions) {
        super();
    }
    
    /**
     * Unique string identifying this session.
     */
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component1() {
        return null;
    }
    
    /**
     * Start time of the session
     */
    @org.jetbrains.annotations.NotNull()
    public final org.threeten.bp.ZonedDateTime component2() {
        return null;
    }
    
    /**
     * End time of the session
     */
    @org.jetbrains.annotations.NotNull()
    public final org.threeten.bp.ZonedDateTime component3() {
        return null;
    }
    
    /**
     * Session title.
     */
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component4() {
        return null;
    }
    
    /**
     * Body of text explaining this session in detail.
     */
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component5() {
        return null;
    }
    
    /**
     * Full URL for the session online.
     */
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component6() {
        return null;
    }
    
    /**
     * The session room.
     */
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component7() {
        return null;
    }
    
    /**
     * Indicates if the Session has a live stream.
     */
    public final boolean component8() {
        return false;
    }
    
    /**
     * Full URL to YouTube.
     */
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component9() {
        return null;
    }
    
    /**
     * URL to the Dory page.
     */
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component10() {
        return null;
    }
    
    /**
     * IDs of the `Tag`s associated with the session. Ordered, with the most important tags
     * appearing first.
     */
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> component11() {
        return null;
    }
    
    /**
     * IDs of the session speakers.
     */
    @org.jetbrains.annotations.NotNull()
    public final java.util.Set<java.lang.String> component12() {
        return null;
    }
    
    /**
     * The session's photo URL.
     */
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component13() {
        return null;
    }
    
    /**
     * IDs of the sessions related to this session.
     */
    @org.jetbrains.annotations.NotNull()
    public final java.util.Set<java.lang.String> component14() {
        return null;
    }
    
    /**
     * Like `Session` but with list of IDs instead of objects in tags, speakers and related sessions.
     */
    @org.jetbrains.annotations.NotNull()
    public final com.google.samples.apps.iosched.shared.data.session.json.SessionTemp copy(@org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    org.threeten.bp.ZonedDateTime startTime, @org.jetbrains.annotations.NotNull()
    org.threeten.bp.ZonedDateTime endTime, @org.jetbrains.annotations.NotNull()
    java.lang.String title, @org.jetbrains.annotations.NotNull()
    java.lang.String description, @org.jetbrains.annotations.NotNull()
    java.lang.String sessionUrl, @org.jetbrains.annotations.NotNull()
    java.lang.String room, boolean isLivestream, @org.jetbrains.annotations.NotNull()
    java.lang.String youTubeUrl, @org.jetbrains.annotations.NotNull()
    java.lang.String doryLink, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> tagNames, @org.jetbrains.annotations.NotNull()
    java.util.Set<java.lang.String> speakers, @org.jetbrains.annotations.NotNull()
    java.lang.String photoUrl, @org.jetbrains.annotations.NotNull()
    java.util.Set<java.lang.String> relatedSessions) {
        return null;
    }
    
    /**
     * Like `Session` but with list of IDs instead of objects in tags, speakers and related sessions.
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    /**
     * Like `Session` but with list of IDs instead of objects in tags, speakers and related sessions.
     */
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    /**
     * Like `Session` but with list of IDs instead of objects in tags, speakers and related sessions.
     */
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
        return false;
    }
}