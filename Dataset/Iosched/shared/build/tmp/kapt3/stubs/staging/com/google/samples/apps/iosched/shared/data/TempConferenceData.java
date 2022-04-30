package com.google.samples.apps.iosched.shared.data;

import java.lang.System;

/**
 * Temporary data type for conference data where some collections are lists of IDs instead
 * of lists of domain objects.
 */
@androidx.annotation.Keep()
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BY\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0003\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0003\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u00a2\u0006\u0002\u0010\u0011J\u000f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\u0015\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006H\u00c6\u0003J\u000f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\n0\u0003H\u00c6\u0003J\u000f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\f0\u0003H\u00c6\u0003J\u000f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0003H\u00c6\u0003J\t\u0010 \u001a\u00020\u0010H\u00c6\u0003Ji\u0010!\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00032\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00032\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u0010H\u00c6\u0001J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010%\u001a\u00020\u0010H\u00d6\u0001J\t\u0010&\u001a\u00020\u0007H\u00d6\u0001R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u001d\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0013R\u0011\u0010\u000f\u001a\u00020\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a\u00a8\u0006\'"}, d2 = {"Lcom/google/samples/apps/iosched/shared/data/TempConferenceData;", "", "sessions", "", "Lcom/google/samples/apps/iosched/shared/data/session/json/SessionTemp;", "speakers", "", "", "Lcom/google/samples/apps/iosched/model/Speaker;", "rooms", "Lcom/google/samples/apps/iosched/model/Room;", "codelabs", "Lcom/google/samples/apps/iosched/shared/data/session/json/CodelabTemp;", "tags", "Lcom/google/samples/apps/iosched/model/Tag;", "version", "", "(Ljava/util/List;Ljava/util/Map;Ljava/util/List;Ljava/util/List;Ljava/util/List;I)V", "getCodelabs", "()Ljava/util/List;", "getRooms", "getSessions", "getSpeakers", "()Ljava/util/Map;", "getTags", "getVersion", "()I", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "shared_staging"})
public final class TempConferenceData {
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.google.samples.apps.iosched.shared.data.session.json.SessionTemp> sessions = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.Map<java.lang.String, com.google.samples.apps.iosched.model.Speaker> speakers = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.google.samples.apps.iosched.model.Room> rooms = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.google.samples.apps.iosched.shared.data.session.json.CodelabTemp> codelabs = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.google.samples.apps.iosched.model.Tag> tags = null;
    private final int version = 0;
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.google.samples.apps.iosched.shared.data.session.json.SessionTemp> getSessions() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Map<java.lang.String, com.google.samples.apps.iosched.model.Speaker> getSpeakers() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.google.samples.apps.iosched.model.Room> getRooms() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.google.samples.apps.iosched.shared.data.session.json.CodelabTemp> getCodelabs() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.google.samples.apps.iosched.model.Tag> getTags() {
        return null;
    }
    
    public final int getVersion() {
        return 0;
    }
    
    public TempConferenceData(@org.jetbrains.annotations.NotNull()
    java.util.List<com.google.samples.apps.iosched.shared.data.session.json.SessionTemp> sessions, @org.jetbrains.annotations.NotNull()
    java.util.Map<java.lang.String, com.google.samples.apps.iosched.model.Speaker> speakers, @org.jetbrains.annotations.NotNull()
    java.util.List<com.google.samples.apps.iosched.model.Room> rooms, @org.jetbrains.annotations.NotNull()
    java.util.List<com.google.samples.apps.iosched.shared.data.session.json.CodelabTemp> codelabs, @org.jetbrains.annotations.NotNull()
    java.util.List<com.google.samples.apps.iosched.model.Tag> tags, int version) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.google.samples.apps.iosched.shared.data.session.json.SessionTemp> component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Map<java.lang.String, com.google.samples.apps.iosched.model.Speaker> component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.google.samples.apps.iosched.model.Room> component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.google.samples.apps.iosched.shared.data.session.json.CodelabTemp> component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.google.samples.apps.iosched.model.Tag> component5() {
        return null;
    }
    
    public final int component6() {
        return 0;
    }
    
    /**
     * Temporary data type for conference data where some collections are lists of IDs instead
     * of lists of domain objects.
     */
    @org.jetbrains.annotations.NotNull()
    public final com.google.samples.apps.iosched.shared.data.TempConferenceData copy(@org.jetbrains.annotations.NotNull()
    java.util.List<com.google.samples.apps.iosched.shared.data.session.json.SessionTemp> sessions, @org.jetbrains.annotations.NotNull()
    java.util.Map<java.lang.String, com.google.samples.apps.iosched.model.Speaker> speakers, @org.jetbrains.annotations.NotNull()
    java.util.List<com.google.samples.apps.iosched.model.Room> rooms, @org.jetbrains.annotations.NotNull()
    java.util.List<com.google.samples.apps.iosched.shared.data.session.json.CodelabTemp> codelabs, @org.jetbrains.annotations.NotNull()
    java.util.List<com.google.samples.apps.iosched.model.Tag> tags, int version) {
        return null;
    }
    
    /**
     * Temporary data type for conference data where some collections are lists of IDs instead
     * of lists of domain objects.
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    /**
     * Temporary data type for conference data where some collections are lists of IDs instead
     * of lists of domain objects.
     */
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    /**
     * Temporary data type for conference data where some collections are lists of IDs instead
     * of lists of domain objects.
     */
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
        return false;
    }
}