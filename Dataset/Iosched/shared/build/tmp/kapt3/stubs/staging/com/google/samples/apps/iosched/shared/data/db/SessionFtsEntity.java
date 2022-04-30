package com.google.samples.apps.iosched.shared.data.db;

import java.lang.System;

/**
 * This class represents [Session] data for searching with FTS.
 *
 * The [ColumnInfo] name is explicitly declared to allow flexibility for renaming the data class
 * properties without requiring changing the column name.
 */
@androidx.room.Fts4()
@androidx.room.Entity(tableName = "sessionsFts")
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000e\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0010\u001a\u00020\u0003H\u00c6\u0003J1\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0015\u001a\u00020\u0016H\u00d6\u0001J\t\u0010\u0017\u001a\u00020\u0003H\u00d6\u0001R\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t\u00a8\u0006\u0018"}, d2 = {"Lcom/google/samples/apps/iosched/shared/data/db/SessionFtsEntity;", "", "sessionId", "", "title", "description", "speakers", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getDescription", "()Ljava/lang/String;", "getSessionId", "getSpeakers", "getTitle", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "shared_staging"})
public final class SessionFtsEntity {
    
    /**
     * Unique string identifying this session.
     */
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "sessionId")
    private final java.lang.String sessionId = null;
    
    /**
     * Session title.
     */
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "title")
    private final java.lang.String title = null;
    
    /**
     * Body of text with the session's description.
     */
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "description")
    private final java.lang.String description = null;
    
    /**
     * The session speaker(s), stored as a CSV String.
     */
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "speakers")
    private final java.lang.String speakers = null;
    
    /**
     * Unique string identifying this session.
     */
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getSessionId() {
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
     * Body of text with the session's description.
     */
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDescription() {
        return null;
    }
    
    /**
     * The session speaker(s), stored as a CSV String.
     */
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getSpeakers() {
        return null;
    }
    
    public SessionFtsEntity(@org.jetbrains.annotations.NotNull()
    java.lang.String sessionId, @org.jetbrains.annotations.NotNull()
    java.lang.String title, @org.jetbrains.annotations.NotNull()
    java.lang.String description, @org.jetbrains.annotations.NotNull()
    java.lang.String speakers) {
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
     * Session title.
     */
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component2() {
        return null;
    }
    
    /**
     * Body of text with the session's description.
     */
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component3() {
        return null;
    }
    
    /**
     * The session speaker(s), stored as a CSV String.
     */
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component4() {
        return null;
    }
    
    /**
     * This class represents [Session] data for searching with FTS.
     *
     * The [ColumnInfo] name is explicitly declared to allow flexibility for renaming the data class
     * properties without requiring changing the column name.
     */
    @org.jetbrains.annotations.NotNull()
    public final com.google.samples.apps.iosched.shared.data.db.SessionFtsEntity copy(@org.jetbrains.annotations.NotNull()
    java.lang.String sessionId, @org.jetbrains.annotations.NotNull()
    java.lang.String title, @org.jetbrains.annotations.NotNull()
    java.lang.String description, @org.jetbrains.annotations.NotNull()
    java.lang.String speakers) {
        return null;
    }
    
    /**
     * This class represents [Session] data for searching with FTS.
     *
     * The [ColumnInfo] name is explicitly declared to allow flexibility for renaming the data class
     * properties without requiring changing the column name.
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    /**
     * This class represents [Session] data for searching with FTS.
     *
     * The [ColumnInfo] name is explicitly declared to allow flexibility for renaming the data class
     * properties without requiring changing the column name.
     */
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    /**
     * This class represents [Session] data for searching with FTS.
     *
     * The [ColumnInfo] name is explicitly declared to allow flexibility for renaming the data class
     * properties without requiring changing the column name.
     */
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
        return false;
    }
}