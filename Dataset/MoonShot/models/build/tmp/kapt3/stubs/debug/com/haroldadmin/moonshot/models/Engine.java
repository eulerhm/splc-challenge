package com.haroldadmin.moonshot.models;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u001f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B[\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u00a2\u0006\u0002\u0010\u0010J\t\u0010\"\u001a\u00020\u0003H\u00c6\u0003J\u0010\u0010#\u001a\u0004\u0018\u00010\u000fH\u00c6\u0003\u00a2\u0006\u0002\u0010\u001dJ\t\u0010$\u001a\u00020\u0005H\u00c6\u0003J\t\u0010%\u001a\u00020\u0005H\u00c6\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u0010\u0010\'\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0012J\t\u0010(\u001a\u00020\u0005H\u00c6\u0003J\t\u0010)\u001a\u00020\u0005H\u00c6\u0003J\t\u0010*\u001a\u00020\fH\u00c6\u0003J\t\u0010+\u001a\u00020\fH\u00c6\u0003Jx\u0010,\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u00c6\u0001\u00a2\u0006\u0002\u0010-J\u0013\u0010.\u001a\u00020/2\b\u00100\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u00101\u001a\u00020\u0003H\u00d6\u0001J\t\u00102\u001a\u00020\u0005H\u00d6\u0001R\u0015\u0010\b\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\t\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0015R\u0011\u0010\n\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0015R\u0016\u0010\u000b\u001a\u00020\f8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0015\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u00a2\u0006\n\n\u0002\u0010\u001e\u001a\u0004\b\u001c\u0010\u001dR\u0016\u0010\r\u001a\u00020\f8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001bR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010\u0015R\u0011\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0015\u00a8\u00063"}, d2 = {"Lcom/haroldadmin/moonshot/models/Engine;", "", "number", "", "type", "", "version", "layout", "engineLossMax", "propellant1", "propellant2", "thrustSeaLevel", "Lcom/haroldadmin/moonshot/models/common/Thrust;", "thrustVacuum", "thrustToWeight", "", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Lcom/haroldadmin/moonshot/models/common/Thrust;Lcom/haroldadmin/moonshot/models/common/Thrust;Ljava/lang/Double;)V", "getEngineLossMax", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getLayout", "()Ljava/lang/String;", "getNumber", "()I", "getPropellant1", "getPropellant2", "getThrustSeaLevel", "()Lcom/haroldadmin/moonshot/models/common/Thrust;", "getThrustToWeight", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getThrustVacuum", "getType", "getVersion", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Lcom/haroldadmin/moonshot/models/common/Thrust;Lcom/haroldadmin/moonshot/models/common/Thrust;Ljava/lang/Double;)Lcom/haroldadmin/moonshot/models/Engine;", "equals", "", "other", "hashCode", "toString", "models_debug"})
public final class Engine {
    private final int number = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String type = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String version = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String layout = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Integer engineLossMax = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String propellant1 = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String propellant2 = null;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Embedded(prefix = "thrust_sea_level_")
    private final com.haroldadmin.moonshot.models.common.Thrust thrustSeaLevel = null;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Embedded(prefix = "thrust_vacuum_")
    private final com.haroldadmin.moonshot.models.common.Thrust thrustVacuum = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Double thrustToWeight = null;
    
    public final int getNumber() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getType() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getVersion() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getLayout() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getEngineLossMax() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPropellant1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPropellant2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.haroldadmin.moonshot.models.common.Thrust getThrustSeaLevel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.haroldadmin.moonshot.models.common.Thrust getThrustVacuum() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double getThrustToWeight() {
        return null;
    }
    
    public Engine(int number, @org.jetbrains.annotations.NotNull()
    java.lang.String type, @org.jetbrains.annotations.NotNull()
    java.lang.String version, @org.jetbrains.annotations.Nullable()
    java.lang.String layout, @org.jetbrains.annotations.Nullable()
    java.lang.Integer engineLossMax, @org.jetbrains.annotations.NotNull()
    java.lang.String propellant1, @org.jetbrains.annotations.NotNull()
    java.lang.String propellant2, @org.jetbrains.annotations.NotNull()
    com.haroldadmin.moonshot.models.common.Thrust thrustSeaLevel, @org.jetbrains.annotations.NotNull()
    com.haroldadmin.moonshot.models.common.Thrust thrustVacuum, @org.jetbrains.annotations.Nullable()
    java.lang.Double thrustToWeight) {
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
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component7() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.haroldadmin.moonshot.models.common.Thrust component8() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.haroldadmin.moonshot.models.common.Thrust component9() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double component10() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.haroldadmin.moonshot.models.Engine copy(int number, @org.jetbrains.annotations.NotNull()
    java.lang.String type, @org.jetbrains.annotations.NotNull()
    java.lang.String version, @org.jetbrains.annotations.Nullable()
    java.lang.String layout, @org.jetbrains.annotations.Nullable()
    java.lang.Integer engineLossMax, @org.jetbrains.annotations.NotNull()
    java.lang.String propellant1, @org.jetbrains.annotations.NotNull()
    java.lang.String propellant2, @org.jetbrains.annotations.NotNull()
    com.haroldadmin.moonshot.models.common.Thrust thrustSeaLevel, @org.jetbrains.annotations.NotNull()
    com.haroldadmin.moonshot.models.common.Thrust thrustVacuum, @org.jetbrains.annotations.Nullable()
    java.lang.Double thrustToWeight) {
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