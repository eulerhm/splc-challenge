package com.haroldadmin.moonshot.models;

import java.lang.System;

@androidx.room.Entity()
@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b%\b\u0087\b\u0018\u00002\u00020\u0001Ba\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\u0006\u0010\r\u001a\u00020\u0005\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0011J\t\u0010#\u001a\u00020\u0003H\u00c6\u0003J\t\u0010$\u001a\u00020\u000fH\u00c6\u0003J\t\u0010%\u001a\u00020\u0003H\u00c6\u0003J\u0010\u0010&\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0016J\t\u0010\'\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\bH\u00c6\u0003J\t\u0010)\u001a\u00020\u0005H\u00c6\u0003J\t\u0010*\u001a\u00020\u0005H\u00c6\u0003J\t\u0010+\u001a\u00020\u0005H\u00c6\u0003J\t\u0010,\u001a\u00020\u0005H\u00c6\u0003J\t\u0010-\u001a\u00020\u0005H\u00c6\u0003J\u0080\u0001\u0010.\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\u00052\b\b\u0002\u0010\r\u001a\u00020\u00052\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u0003H\u00c6\u0001\u00a2\u0006\u0002\u0010/J\u0013\u00100\u001a\u00020\u000f2\b\u00101\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u00102\u001a\u00020\u0005H\u00d6\u0001J\t\u00103\u001a\u00020\u0003H\u00d6\u0001R\u0016\u0010\f\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\r\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0010\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0016\u0010\t\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0013R\u0016\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0013R\u0016\u0010\u000b\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0013R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0019R\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010\u0019R\u0016\u0010\u000e\u001a\u00020\u000f8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\"\u00a8\u00064"}, d2 = {"Lcom/haroldadmin/moonshot/models/Core;", "", "serial", "", "block", "", "status", "originalLaunch", "Ljava/util/Date;", "reuseCount", "rtlsAttempts", "rtlsLandings", "asdsAttempts", "asdsLandings", "waterLanding", "", "details", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/Date;IIIIIZLjava/lang/String;)V", "getAsdsAttempts", "()I", "getAsdsLandings", "getBlock", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getDetails", "()Ljava/lang/String;", "getOriginalLaunch", "()Ljava/util/Date;", "getReuseCount", "getRtlsAttempts", "getRtlsLandings", "getSerial", "getStatus", "getWaterLanding", "()Z", "component1", "component10", "component11", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/Date;IIIIIZLjava/lang/String;)Lcom/haroldadmin/moonshot/models/Core;", "equals", "other", "hashCode", "toString", "models_debug"})
public final class Core {
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "core_serial")
    @androidx.room.PrimaryKey()
    private final java.lang.String serial = null;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "block")
    private final java.lang.Integer block = null;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "status")
    private final java.lang.String status = null;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "original_launch")
    private final java.util.Date originalLaunch = null;
    @androidx.room.ColumnInfo(name = "reuse_count")
    private final int reuseCount = 0;
    @androidx.room.ColumnInfo(name = "rtls_attempts")
    private final int rtlsAttempts = 0;
    @androidx.room.ColumnInfo(name = "rtls_landings")
    private final int rtlsLandings = 0;
    @androidx.room.ColumnInfo(name = "asds_attempts")
    private final int asdsAttempts = 0;
    @androidx.room.ColumnInfo(name = "asds_landings")
    private final int asdsLandings = 0;
    @androidx.room.ColumnInfo(name = "water_landing")
    private final boolean waterLanding = false;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "details")
    private final java.lang.String details = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getSerial() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getBlock() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getStatus() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.Date getOriginalLaunch() {
        return null;
    }
    
    public final int getReuseCount() {
        return 0;
    }
    
    public final int getRtlsAttempts() {
        return 0;
    }
    
    public final int getRtlsLandings() {
        return 0;
    }
    
    public final int getAsdsAttempts() {
        return 0;
    }
    
    public final int getAsdsLandings() {
        return 0;
    }
    
    public final boolean getWaterLanding() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDetails() {
        return null;
    }
    
    public Core(@org.jetbrains.annotations.NotNull()
    java.lang.String serial, @org.jetbrains.annotations.Nullable()
    java.lang.Integer block, @org.jetbrains.annotations.NotNull()
    java.lang.String status, @org.jetbrains.annotations.Nullable()
    java.util.Date originalLaunch, int reuseCount, int rtlsAttempts, int rtlsLandings, int asdsAttempts, int asdsLandings, boolean waterLanding, @org.jetbrains.annotations.NotNull()
    java.lang.String details) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.Date component4() {
        return null;
    }
    
    public final int component5() {
        return 0;
    }
    
    public final int component6() {
        return 0;
    }
    
    public final int component7() {
        return 0;
    }
    
    public final int component8() {
        return 0;
    }
    
    public final int component9() {
        return 0;
    }
    
    public final boolean component10() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component11() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.haroldadmin.moonshot.models.Core copy(@org.jetbrains.annotations.NotNull()
    java.lang.String serial, @org.jetbrains.annotations.Nullable()
    java.lang.Integer block, @org.jetbrains.annotations.NotNull()
    java.lang.String status, @org.jetbrains.annotations.Nullable()
    java.util.Date originalLaunch, int reuseCount, int rtlsAttempts, int rtlsLandings, int asdsAttempts, int asdsLandings, boolean waterLanding, @org.jetbrains.annotations.NotNull()
    java.lang.String details) {
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