package com.haroldadmin.moonshot.models;

import java.lang.System;

@androidx.room.Entity()
@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b!\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B[\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\t\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\u0006\u0010\r\u001a\u00020\u0005\u0012\u0006\u0010\u000e\u001a\u00020\u0005\u0012\u0006\u0010\u000f\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0010J\t\u0010\u001f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010 \u001a\u00020\u0005H\u00c6\u0003J\t\u0010!\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\"\u001a\u00020\u0007H\u00c6\u0003J\u000f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00050\tH\u00c6\u0003J\t\u0010$\u001a\u00020\u0003H\u00c6\u0003J\t\u0010%\u001a\u00020\u0003H\u00c6\u0003J\t\u0010&\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\'\u001a\u00020\u0005H\u00c6\u0003J\t\u0010(\u001a\u00020\u0005H\u00c6\u0003Js\u0010)\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\t2\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00052\b\b\u0002\u0010\r\u001a\u00020\u00052\b\b\u0002\u0010\u000e\u001a\u00020\u00052\b\b\u0002\u0010\u000f\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010*\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010-\u001a\u00020\u0003H\u00d6\u0001J\t\u0010.\u001a\u00020\u0005H\u00d6\u0001R\u0016\u0010\n\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\r\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\u000e\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0014R\u0016\u0010\u000f\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0014R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0014R\u0016\u0010\u000b\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0012R\u001c\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\t8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0016\u0010\f\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0014\u00a8\u0006/"}, d2 = {"Lcom/haroldadmin/moonshot/models/LaunchPad;", "", "id", "", "status", "", "location", "Lcom/haroldadmin/moonshot/models/common/Location;", "vehiclesLanded", "", "attemptedLaunches", "successfulLaunches", "wikipedia", "details", "siteId", "siteNameLong", "(ILjava/lang/String;Lcom/haroldadmin/moonshot/models/common/Location;Ljava/util/List;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAttemptedLaunches", "()I", "getDetails", "()Ljava/lang/String;", "getId", "getLocation", "()Lcom/haroldadmin/moonshot/models/common/Location;", "getSiteId", "getSiteNameLong", "getStatus", "getSuccessfulLaunches", "getVehiclesLanded", "()Ljava/util/List;", "getWikipedia", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "models_debug"})
public final class LaunchPad {
    @androidx.room.ColumnInfo(name = "id")
    @androidx.room.PrimaryKey()
    private final int id = 0;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "status")
    private final java.lang.String status = null;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Embedded()
    private final com.haroldadmin.moonshot.models.common.Location location = null;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "vehicles_landed")
    private final java.util.List<java.lang.String> vehiclesLanded = null;
    @androidx.room.ColumnInfo(name = "attempted_launches")
    private final int attemptedLaunches = 0;
    @androidx.room.ColumnInfo(name = "succesfulLaunches")
    private final int successfulLaunches = 0;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "wikipedia")
    private final java.lang.String wikipedia = null;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "details")
    private final java.lang.String details = null;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "site_id")
    private final java.lang.String siteId = null;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "site_name_long")
    private final java.lang.String siteNameLong = null;
    
    public final int getId() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getStatus() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.haroldadmin.moonshot.models.common.Location getLocation() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> getVehiclesLanded() {
        return null;
    }
    
    public final int getAttemptedLaunches() {
        return 0;
    }
    
    public final int getSuccessfulLaunches() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getWikipedia() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDetails() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getSiteId() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getSiteNameLong() {
        return null;
    }
    
    public LaunchPad(int id, @org.jetbrains.annotations.NotNull()
    java.lang.String status, @org.jetbrains.annotations.NotNull()
    com.haroldadmin.moonshot.models.common.Location location, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> vehiclesLanded, int attemptedLaunches, int successfulLaunches, @org.jetbrains.annotations.NotNull()
    java.lang.String wikipedia, @org.jetbrains.annotations.NotNull()
    java.lang.String details, @org.jetbrains.annotations.NotNull()
    java.lang.String siteId, @org.jetbrains.annotations.NotNull()
    java.lang.String siteNameLong) {
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
    public final com.haroldadmin.moonshot.models.common.Location component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> component4() {
        return null;
    }
    
    public final int component5() {
        return 0;
    }
    
    public final int component6() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component7() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component8() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component9() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component10() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.haroldadmin.moonshot.models.LaunchPad copy(int id, @org.jetbrains.annotations.NotNull()
    java.lang.String status, @org.jetbrains.annotations.NotNull()
    com.haroldadmin.moonshot.models.common.Location location, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> vehiclesLanded, int attemptedLaunches, int successfulLaunches, @org.jetbrains.annotations.NotNull()
    java.lang.String wikipedia, @org.jetbrains.annotations.NotNull()
    java.lang.String details, @org.jetbrains.annotations.NotNull()
    java.lang.String siteId, @org.jetbrains.annotations.NotNull()
    java.lang.String siteNameLong) {
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