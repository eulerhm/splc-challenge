package com.haroldadmin.moonshot.models;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0002\u0010\fJ\t\u0010\u0019\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001a\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u001b\u001a\u00020\u0007H\u00c6\u0003J\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0002\u0010\u000eJ\t\u0010\u001d\u001a\u00020\nH\u00c6\u0003J\t\u0010\u001e\u001a\u00020\nH\u00c6\u0003JL\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\nH\u00c6\u0001\u00a2\u0006\u0002\u0010 J\u0013\u0010!\u001a\u00020\u00032\b\u0010\"\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010#\u001a\u00020\u0005H\u00d6\u0001J\t\u0010$\u001a\u00020%H\u00d6\u0001R\u0015\u0010\b\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\u000b\u001a\u00020\n8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017\u00a8\u0006&"}, d2 = {"Lcom/haroldadmin/moonshot/models/FirstStage;", "", "reusable", "", "engines", "", "fuelAmountTons", "", "burnTimeSec", "thrustSeaLevel", "Lcom/haroldadmin/moonshot/models/common/Thrust;", "thrustVacuum", "(ZIDLjava/lang/Double;Lcom/haroldadmin/moonshot/models/common/Thrust;Lcom/haroldadmin/moonshot/models/common/Thrust;)V", "getBurnTimeSec", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getEngines", "()I", "getFuelAmountTons", "()D", "getReusable", "()Z", "getThrustSeaLevel", "()Lcom/haroldadmin/moonshot/models/common/Thrust;", "getThrustVacuum", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(ZIDLjava/lang/Double;Lcom/haroldadmin/moonshot/models/common/Thrust;Lcom/haroldadmin/moonshot/models/common/Thrust;)Lcom/haroldadmin/moonshot/models/FirstStage;", "equals", "other", "hashCode", "toString", "", "models_debug"})
public final class FirstStage {
    private final boolean reusable = false;
    private final int engines = 0;
    private final double fuelAmountTons = 0.0;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Double burnTimeSec = null;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Embedded(prefix = "thrust_sea_level_")
    private final com.haroldadmin.moonshot.models.common.Thrust thrustSeaLevel = null;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Embedded(prefix = "thrust_sea_vacuum_")
    private final com.haroldadmin.moonshot.models.common.Thrust thrustVacuum = null;
    
    public final boolean getReusable() {
        return false;
    }
    
    public final int getEngines() {
        return 0;
    }
    
    public final double getFuelAmountTons() {
        return 0.0;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double getBurnTimeSec() {
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
    
    public FirstStage(boolean reusable, int engines, double fuelAmountTons, @org.jetbrains.annotations.Nullable()
    java.lang.Double burnTimeSec, @org.jetbrains.annotations.NotNull()
    com.haroldadmin.moonshot.models.common.Thrust thrustSeaLevel, @org.jetbrains.annotations.NotNull()
    com.haroldadmin.moonshot.models.common.Thrust thrustVacuum) {
        super();
    }
    
    public final boolean component1() {
        return false;
    }
    
    public final int component2() {
        return 0;
    }
    
    public final double component3() {
        return 0.0;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.haroldadmin.moonshot.models.common.Thrust component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.haroldadmin.moonshot.models.common.Thrust component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.haroldadmin.moonshot.models.FirstStage copy(boolean reusable, int engines, double fuelAmountTons, @org.jetbrains.annotations.Nullable()
    java.lang.Double burnTimeSec, @org.jetbrains.annotations.NotNull()
    com.haroldadmin.moonshot.models.common.Thrust thrustSeaLevel, @org.jetbrains.annotations.NotNull()
    com.haroldadmin.moonshot.models.common.Thrust thrustVacuum) {
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