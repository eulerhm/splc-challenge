package com.haroldadmin.moonshot.models;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u00a2\u0006\u0002\u0010\u000bJ\t\u0010\u0016\u001a\u00020\u0003H\u00c6\u0003J\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010\rJ\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010\rJ\t\u0010\u0019\u001a\u00020\bH\u00c6\u0003J\t\u0010\u001a\u001a\u00020\nH\u00c6\u0003JD\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nH\u00c6\u0001\u00a2\u0006\u0002\u0010\u001cJ\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010 \u001a\u00020\u0003H\u00d6\u0001J\t\u0010!\u001a\u00020\"H\u00d6\u0001R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\u0011\u0010\rR\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015\u00a8\u0006#"}, d2 = {"Lcom/haroldadmin/moonshot/models/SecondStage;", "", "engines", "", "fuelAmountTons", "", "burnTimeSec", "thrust", "Lcom/haroldadmin/moonshot/models/common/Thrust;", "payloads", "Lcom/haroldadmin/moonshot/models/Payloads;", "(ILjava/lang/Double;Ljava/lang/Double;Lcom/haroldadmin/moonshot/models/common/Thrust;Lcom/haroldadmin/moonshot/models/Payloads;)V", "getBurnTimeSec", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getEngines", "()I", "getFuelAmountTons", "getPayloads", "()Lcom/haroldadmin/moonshot/models/Payloads;", "getThrust", "()Lcom/haroldadmin/moonshot/models/common/Thrust;", "component1", "component2", "component3", "component4", "component5", "copy", "(ILjava/lang/Double;Ljava/lang/Double;Lcom/haroldadmin/moonshot/models/common/Thrust;Lcom/haroldadmin/moonshot/models/Payloads;)Lcom/haroldadmin/moonshot/models/SecondStage;", "equals", "", "other", "hashCode", "toString", "", "models_debug"})
public final class SecondStage {
    private final int engines = 0;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Double fuelAmountTons = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Double burnTimeSec = null;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Embedded(prefix = "thrust_")
    private final com.haroldadmin.moonshot.models.common.Thrust thrust = null;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Embedded(prefix = "payloads_")
    private final com.haroldadmin.moonshot.models.Payloads payloads = null;
    
    public final int getEngines() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double getFuelAmountTons() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double getBurnTimeSec() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.haroldadmin.moonshot.models.common.Thrust getThrust() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.haroldadmin.moonshot.models.Payloads getPayloads() {
        return null;
    }
    
    public SecondStage(int engines, @org.jetbrains.annotations.Nullable()
    java.lang.Double fuelAmountTons, @org.jetbrains.annotations.Nullable()
    java.lang.Double burnTimeSec, @org.jetbrains.annotations.NotNull()
    com.haroldadmin.moonshot.models.common.Thrust thrust, @org.jetbrains.annotations.NotNull()
    com.haroldadmin.moonshot.models.Payloads payloads) {
        super();
    }
    
    public final int component1() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.haroldadmin.moonshot.models.common.Thrust component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.haroldadmin.moonshot.models.Payloads component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.haroldadmin.moonshot.models.SecondStage copy(int engines, @org.jetbrains.annotations.Nullable()
    java.lang.Double fuelAmountTons, @org.jetbrains.annotations.Nullable()
    java.lang.Double burnTimeSec, @org.jetbrains.annotations.NotNull()
    com.haroldadmin.moonshot.models.common.Thrust thrust, @org.jetbrains.annotations.NotNull()
    com.haroldadmin.moonshot.models.Payloads payloads) {
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