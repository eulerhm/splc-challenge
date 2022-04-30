package com.haroldadmin.moonshot.models.launch;

import java.lang.System;

/**
 * Model class for an API Launch.
 *
 * Does not store launch_date_local because Java lacks proper support for
 * ISO8601 compliant dates with offset which the API uses.
 */
@androidx.room.Entity()
@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010$\n\u0002\b*\b\u0087\b\u0018\u00002\u00020\u0001B\u00bb\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\f\u0012\b\u0010 \u001a\u0004\u0018\u00010\n\u00a2\u0006\u0002\u0010!J\t\u0010F\u001a\u00020\u0003H\u00c6\u0003J\t\u0010G\u001a\u00020\u0013H\u00c6\u0003J\u000f\u0010H\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007H\u00c6\u0003J\u000b\u0010I\u001a\u0004\u0018\u00010\u0016H\u00c6\u0003J\u000b\u0010J\u001a\u0004\u0018\u00010\u0018H\u00c6\u0003J\u0010\u0010K\u001a\u0004\u0018\u00010\fH\u00c6\u0003\u00a2\u0006\u0002\u0010\'J\u000b\u0010L\u001a\u0004\u0018\u00010\u001bH\u00c6\u0003J\u000b\u0010M\u001a\u0004\u0018\u00010\u001dH\u00c6\u0003J\u000b\u0010N\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u0010\u0010O\u001a\u0004\u0018\u00010\fH\u00c6\u0003\u00a2\u0006\u0002\u0010\'J\u000b\u0010P\u001a\u0004\u0018\u00010\nH\u00c6\u0003J\t\u0010Q\u001a\u00020\u0005H\u00c6\u0003J\u000f\u0010R\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007H\u00c6\u0003J\t\u0010S\u001a\u00020\u0005H\u00c6\u0003J\t\u0010T\u001a\u00020\nH\u00c6\u0003J\t\u0010U\u001a\u00020\fH\u00c6\u0003J\t\u0010V\u001a\u00020\u000eH\u00c6\u0003J\t\u0010W\u001a\u00020\fH\u00c6\u0003J\u0010\u0010X\u001a\u0004\u0018\u00010\u0011H\u00c6\u0003\u00a2\u0006\u0002\u0010/J\u00ea\u0001\u0010Y\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00072\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u00072\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\nH\u00c6\u0001\u00a2\u0006\u0002\u0010ZJ\u0013\u0010[\u001a\u00020\f2\b\u0010\\\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010]\u001a\u00020\u0003H\u00d6\u0001J\t\u0010^\u001a\u00020\u0005H\u00d6\u0001R\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0016\u0010\u000b\u001a\u00020\f8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010&R\u001a\u0010\u001f\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010(\u001a\u0004\b\u001f\u0010\'R\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00188\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u001a\u0010\u0019\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010(\u001a\u0004\b-\u0010\'R\u001a\u0010\u0010\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u00100\u001a\u0004\b.\u0010/R\u0016\u0010\b\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b1\u0010#R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u001b8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b2\u00103R\"\u00104\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b6\u00107R\u001c\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00078\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b8\u00109R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b:\u0010#R\u0016\u0010\u0012\u001a\u00020\u00138\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b;\u0010<R\u001c\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u00078\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b=\u00109R\u0018\u0010 \u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b>\u0010*R\u0016\u0010\u000f\u001a\u00020\f8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b?\u0010&R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00168\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b@\u0010AR\u0016\u0010\r\u001a\u00020\u000e8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bB\u0010CR\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u001d8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bD\u0010E\u00a8\u0006_"}, d2 = {"Lcom/haroldadmin/moonshot/models/launch/Launch;", "", "flightNumber", "", "missionName", "", "missionId", "", "launchYear", "launchDateUtc", "Ljava/util/Date;", "isTentative", "", "tentativeMaxPrecision", "Lcom/haroldadmin/moonshot/models/DatePrecision;", "tbd", "launchWindow", "", "rocket", "Lcom/haroldadmin/moonshot/models/launch/Rocket;", "ships", "telemetry", "Lcom/haroldadmin/moonshot/models/launch/Telemetry;", "launchSite", "Lcom/haroldadmin/moonshot/models/launch/LaunchSite;", "launchSuccess", "links", "Lcom/haroldadmin/moonshot/models/launch/Links;", "timeline", "Lcom/haroldadmin/moonshot/models/launch/Timeline;", "details", "isUpcoming", "staticFireDateUtc", "(ILjava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/Date;ZLcom/haroldadmin/moonshot/models/DatePrecision;ZLjava/lang/Long;Lcom/haroldadmin/moonshot/models/launch/Rocket;Ljava/util/List;Lcom/haroldadmin/moonshot/models/launch/Telemetry;Lcom/haroldadmin/moonshot/models/launch/LaunchSite;Ljava/lang/Boolean;Lcom/haroldadmin/moonshot/models/launch/Links;Lcom/haroldadmin/moonshot/models/launch/Timeline;Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/Date;)V", "getDetails", "()Ljava/lang/String;", "getFlightNumber", "()I", "()Z", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getLaunchDateUtc", "()Ljava/util/Date;", "getLaunchSite", "()Lcom/haroldadmin/moonshot/models/launch/LaunchSite;", "getLaunchSuccess", "getLaunchWindow", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getLaunchYear", "getLinks", "()Lcom/haroldadmin/moonshot/models/launch/Links;", "linksToPreview", "", "getLinksToPreview", "()Ljava/util/Map;", "getMissionId", "()Ljava/util/List;", "getMissionName", "getRocket", "()Lcom/haroldadmin/moonshot/models/launch/Rocket;", "getShips", "getStaticFireDateUtc", "getTbd", "getTelemetry", "()Lcom/haroldadmin/moonshot/models/launch/Telemetry;", "getTentativeMaxPrecision", "()Lcom/haroldadmin/moonshot/models/DatePrecision;", "getTimeline", "()Lcom/haroldadmin/moonshot/models/launch/Timeline;", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(ILjava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/Date;ZLcom/haroldadmin/moonshot/models/DatePrecision;ZLjava/lang/Long;Lcom/haroldadmin/moonshot/models/launch/Rocket;Ljava/util/List;Lcom/haroldadmin/moonshot/models/launch/Telemetry;Lcom/haroldadmin/moonshot/models/launch/LaunchSite;Ljava/lang/Boolean;Lcom/haroldadmin/moonshot/models/launch/Links;Lcom/haroldadmin/moonshot/models/launch/Timeline;Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/Date;)Lcom/haroldadmin/moonshot/models/launch/Launch;", "equals", "other", "hashCode", "toString", "models_debug"})
public final class Launch {
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Ignore()
    private final java.util.Map<java.lang.String, java.lang.String> linksToPreview = null;
    @androidx.room.ColumnInfo(name = "flight_number")
    @androidx.room.PrimaryKey()
    private final int flightNumber = 0;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "mission_name")
    private final java.lang.String missionName = null;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "mission_id")
    private final java.util.List<java.lang.String> missionId = null;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "launch_year")
    private final java.lang.String launchYear = null;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "launch_date_utc")
    private final java.util.Date launchDateUtc = null;
    @androidx.room.ColumnInfo(name = "is_tentative")
    private final boolean isTentative = false;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "tentative_max_precision")
    private final com.haroldadmin.moonshot.models.DatePrecision tentativeMaxPrecision = null;
    @androidx.room.ColumnInfo(name = "tbd")
    private final boolean tbd = false;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "launch_window")
    private final java.lang.Long launchWindow = null;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Embedded()
    private final com.haroldadmin.moonshot.models.launch.Rocket rocket = null;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "ships")
    private final java.util.List<java.lang.String> ships = null;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Embedded()
    private final com.haroldadmin.moonshot.models.launch.Telemetry telemetry = null;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Embedded()
    private final com.haroldadmin.moonshot.models.launch.LaunchSite launchSite = null;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "launch_success")
    private final java.lang.Boolean launchSuccess = null;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Embedded()
    private final com.haroldadmin.moonshot.models.launch.Links links = null;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Embedded()
    private final com.haroldadmin.moonshot.models.launch.Timeline timeline = null;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "details")
    private final java.lang.String details = null;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "upcoming")
    private final java.lang.Boolean isUpcoming = null;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "static_fire_date_utc")
    private final java.util.Date staticFireDateUtc = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Map<java.lang.String, java.lang.String> getLinksToPreview() {
        return null;
    }
    
    public final int getFlightNumber() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getMissionName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> getMissionId() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getLaunchYear() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Date getLaunchDateUtc() {
        return null;
    }
    
    public final boolean isTentative() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.haroldadmin.moonshot.models.DatePrecision getTentativeMaxPrecision() {
        return null;
    }
    
    public final boolean getTbd() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long getLaunchWindow() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.haroldadmin.moonshot.models.launch.Rocket getRocket() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> getShips() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.haroldadmin.moonshot.models.launch.Telemetry getTelemetry() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.haroldadmin.moonshot.models.launch.LaunchSite getLaunchSite() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean getLaunchSuccess() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.haroldadmin.moonshot.models.launch.Links getLinks() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.haroldadmin.moonshot.models.launch.Timeline getTimeline() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getDetails() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean isUpcoming() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.Date getStaticFireDateUtc() {
        return null;
    }
    
    public Launch(int flightNumber, @org.jetbrains.annotations.NotNull()
    java.lang.String missionName, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> missionId, @org.jetbrains.annotations.NotNull()
    java.lang.String launchYear, @org.jetbrains.annotations.NotNull()
    java.util.Date launchDateUtc, boolean isTentative, @org.jetbrains.annotations.NotNull()
    com.haroldadmin.moonshot.models.DatePrecision tentativeMaxPrecision, boolean tbd, @org.jetbrains.annotations.Nullable()
    java.lang.Long launchWindow, @org.jetbrains.annotations.NotNull()
    com.haroldadmin.moonshot.models.launch.Rocket rocket, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> ships, @org.jetbrains.annotations.Nullable()
    com.haroldadmin.moonshot.models.launch.Telemetry telemetry, @org.jetbrains.annotations.Nullable()
    com.haroldadmin.moonshot.models.launch.LaunchSite launchSite, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean launchSuccess, @org.jetbrains.annotations.Nullable()
    com.haroldadmin.moonshot.models.launch.Links links, @org.jetbrains.annotations.Nullable()
    com.haroldadmin.moonshot.models.launch.Timeline timeline, @org.jetbrains.annotations.Nullable()
    java.lang.String details, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean isUpcoming, @org.jetbrains.annotations.Nullable()
    java.util.Date staticFireDateUtc) {
        super();
    }
    
    public final int component1() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Date component5() {
        return null;
    }
    
    public final boolean component6() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.haroldadmin.moonshot.models.DatePrecision component7() {
        return null;
    }
    
    public final boolean component8() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long component9() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.haroldadmin.moonshot.models.launch.Rocket component10() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> component11() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.haroldadmin.moonshot.models.launch.Telemetry component12() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.haroldadmin.moonshot.models.launch.LaunchSite component13() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean component14() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.haroldadmin.moonshot.models.launch.Links component15() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.haroldadmin.moonshot.models.launch.Timeline component16() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component17() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean component18() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.Date component19() {
        return null;
    }
    
    /**
     * Model class for an API Launch.
     *
     * Does not store launch_date_local because Java lacks proper support for
     * ISO8601 compliant dates with offset which the API uses.
     */
    @org.jetbrains.annotations.NotNull()
    public final com.haroldadmin.moonshot.models.launch.Launch copy(int flightNumber, @org.jetbrains.annotations.NotNull()
    java.lang.String missionName, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> missionId, @org.jetbrains.annotations.NotNull()
    java.lang.String launchYear, @org.jetbrains.annotations.NotNull()
    java.util.Date launchDateUtc, boolean isTentative, @org.jetbrains.annotations.NotNull()
    com.haroldadmin.moonshot.models.DatePrecision tentativeMaxPrecision, boolean tbd, @org.jetbrains.annotations.Nullable()
    java.lang.Long launchWindow, @org.jetbrains.annotations.NotNull()
    com.haroldadmin.moonshot.models.launch.Rocket rocket, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> ships, @org.jetbrains.annotations.Nullable()
    com.haroldadmin.moonshot.models.launch.Telemetry telemetry, @org.jetbrains.annotations.Nullable()
    com.haroldadmin.moonshot.models.launch.LaunchSite launchSite, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean launchSuccess, @org.jetbrains.annotations.Nullable()
    com.haroldadmin.moonshot.models.launch.Links links, @org.jetbrains.annotations.Nullable()
    com.haroldadmin.moonshot.models.launch.Timeline timeline, @org.jetbrains.annotations.Nullable()
    java.lang.String details, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean isUpcoming, @org.jetbrains.annotations.Nullable()
    java.util.Date staticFireDateUtc) {
        return null;
    }
    
    /**
     * Model class for an API Launch.
     *
     * Does not store launch_date_local because Java lacks proper support for
     * ISO8601 compliant dates with offset which the API uses.
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    /**
     * Model class for an API Launch.
     *
     * Does not store launch_date_local because Java lacks proper support for
     * ISO8601 compliant dates with offset which the API uses.
     */
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    /**
     * Model class for an API Launch.
     *
     * Does not store launch_date_local because Java lacks proper support for
     * ISO8601 compliant dates with offset which the API uses.
     */
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
        return false;
    }
}