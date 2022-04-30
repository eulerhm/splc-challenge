package com.haroldadmin.moonshot.models;

import java.lang.System;

@androidx.room.Entity()
@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b>\b\u0087\b\u0018\u00002\u00020\u0001B\u00af\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\u000b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\u0006\u0010\u0016\u001a\u00020\u0013\u0012\u0006\u0010\u0017\u001a\u00020\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0019\u0012\u0006\u0010\u001a\u001a\u00020\u001b\u0012\u0006\u0010\u001c\u001a\u00020\u001d\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\u0006\u0010\u001f\u001a\u00020\u0003\u0012\u0006\u0010 \u001a\u00020\u0003\u00a2\u0006\u0002\u0010!J\t\u0010A\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010B\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010C\u001a\u00020\u0011H\u00c6\u0003J\t\u0010D\u001a\u00020\u0013H\u00c6\u0003J\t\u0010E\u001a\u00020\u0015H\u00c6\u0003J\t\u0010F\u001a\u00020\u0013H\u00c6\u0003J\t\u0010G\u001a\u00020\u0015H\u00c6\u0003J\t\u0010H\u001a\u00020\u0019H\u00c6\u0003J\t\u0010I\u001a\u00020\u001bH\u00c6\u0003J\t\u0010J\u001a\u00020\u001dH\u00c6\u0003J\t\u0010K\u001a\u00020\u001dH\u00c6\u0003J\t\u0010L\u001a\u00020\u0003H\u00c6\u0003J\t\u0010M\u001a\u00020\u0003H\u00c6\u0003J\t\u0010N\u001a\u00020\u0003H\u00c6\u0003J\t\u0010O\u001a\u00020\u0003H\u00c6\u0003J\t\u0010P\u001a\u00020\u0007H\u00c6\u0003J\t\u0010Q\u001a\u00020\tH\u00c6\u0003J\t\u0010R\u001a\u00020\u000bH\u00c6\u0003J\t\u0010S\u001a\u00020\u000bH\u00c6\u0003J\t\u0010T\u001a\u00020\u000bH\u00c6\u0003J\t\u0010U\u001a\u00020\u000bH\u00c6\u0003J\u00dd\u0001\u0010V\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\u000b2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u00132\b\b\u0002\u0010\u0017\u001a\u00020\u00152\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u001b2\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\b\b\u0002\u0010\u001e\u001a\u00020\u001d2\b\b\u0002\u0010\u001f\u001a\u00020\u00032\b\b\u0002\u0010 \u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010W\u001a\u00020\u00072\b\u0010X\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010Y\u001a\u00020\tH\u00d6\u0001J\t\u0010Z\u001a\u00020\u0003H\u00d6\u0001R\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0016\u0010 \u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010\'R\u0016\u0010\u001e\u001a\u00020\u001d8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b*\u0010\'R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b+\u0010\'R\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b,\u0010\'R\u0016\u0010\r\u001a\u00020\u000b8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u0016\u0010\u000e\u001a\u00020\u000b8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b/\u0010.R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b0\u0010\'R\u0016\u0010\u0010\u001a\u00020\u00118\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b1\u00102R\u0016\u0010\u001c\u001a\u00020\u001d8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b3\u0010)R\u0016\u0010\u0012\u001a\u00020\u00138\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b4\u00105R\u0016\u0010\u0014\u001a\u00020\u00158\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b6\u00107R\u0016\u0010\f\u001a\u00020\u000b8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b8\u0010.R\u0016\u0010\u0018\u001a\u00020\u00198\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b9\u0010:R\u0016\u0010\u0016\u001a\u00020\u00138\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b;\u00105R\u0016\u0010\u0017\u001a\u00020\u00158\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b<\u00107R\u0016\u0010\n\u001a\u00020\u000b8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b=\u0010.R\u0016\u0010\u001a\u001a\u00020\u001b8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b>\u0010?R\u0016\u0010\u001f\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b@\u0010\'\u00a8\u0006["}, d2 = {"Lcom/haroldadmin/moonshot/models/Dragon;", "", "dragonId", "", "dragonName", "dragonType", "active", "", "crewCapacity", "", "sideWallAngleDeg", "", "orbitDurationYear", "dryMassKg", "dryMassLb", "firstFlight", "heatShield", "Lcom/haroldadmin/moonshot/models/HeatShield;", "launchPayloadMass", "Lcom/haroldadmin/moonshot/models/common/Mass;", "launchPayloadVol", "Lcom/haroldadmin/moonshot/models/common/Volume;", "returnPayloadMass", "returnPayloadVol", "pressurizedCapsule", "Lcom/haroldadmin/moonshot/models/PressurizedCapsule;", "trunk", "Lcom/haroldadmin/moonshot/models/Trunk;", "heightWTrunk", "Lcom/haroldadmin/moonshot/models/common/Length;", "diameter", "wikipedia", "description", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZIDDDDLjava/lang/String;Lcom/haroldadmin/moonshot/models/HeatShield;Lcom/haroldadmin/moonshot/models/common/Mass;Lcom/haroldadmin/moonshot/models/common/Volume;Lcom/haroldadmin/moonshot/models/common/Mass;Lcom/haroldadmin/moonshot/models/common/Volume;Lcom/haroldadmin/moonshot/models/PressurizedCapsule;Lcom/haroldadmin/moonshot/models/Trunk;Lcom/haroldadmin/moonshot/models/common/Length;Lcom/haroldadmin/moonshot/models/common/Length;Ljava/lang/String;Ljava/lang/String;)V", "getActive", "()Z", "getCrewCapacity", "()I", "getDescription", "()Ljava/lang/String;", "getDiameter", "()Lcom/haroldadmin/moonshot/models/common/Length;", "getDragonId", "getDragonName", "getDragonType", "getDryMassKg", "()D", "getDryMassLb", "getFirstFlight", "getHeatShield", "()Lcom/haroldadmin/moonshot/models/HeatShield;", "getHeightWTrunk", "getLaunchPayloadMass", "()Lcom/haroldadmin/moonshot/models/common/Mass;", "getLaunchPayloadVol", "()Lcom/haroldadmin/moonshot/models/common/Volume;", "getOrbitDurationYear", "getPressurizedCapsule", "()Lcom/haroldadmin/moonshot/models/PressurizedCapsule;", "getReturnPayloadMass", "getReturnPayloadVol", "getSideWallAngleDeg", "getTrunk", "()Lcom/haroldadmin/moonshot/models/Trunk;", "getWikipedia", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "models_debug"})
public final class Dragon {
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "id")
    @androidx.room.PrimaryKey()
    private final java.lang.String dragonId = null;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "name")
    private final java.lang.String dragonName = null;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "type")
    private final java.lang.String dragonType = null;
    @androidx.room.ColumnInfo(name = "active")
    private final boolean active = false;
    @androidx.room.ColumnInfo(name = "crew_capacity")
    private final int crewCapacity = 0;
    @androidx.room.ColumnInfo(name = "sidewall_angle_deg")
    private final double sideWallAngleDeg = 0.0;
    @androidx.room.ColumnInfo(name = "orbit_duration_yr")
    private final double orbitDurationYear = 0.0;
    @androidx.room.ColumnInfo(name = "dry_mass_kg")
    private final double dryMassKg = 0.0;
    @androidx.room.ColumnInfo(name = "dry_mass_lb")
    private final double dryMassLb = 0.0;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "first_flight")
    private final java.lang.String firstFlight = null;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Embedded()
    private final com.haroldadmin.moonshot.models.HeatShield heatShield = null;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Embedded(prefix = "launch_payload_")
    private final com.haroldadmin.moonshot.models.common.Mass launchPayloadMass = null;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Embedded(prefix = "launch_payload_")
    private final com.haroldadmin.moonshot.models.common.Volume launchPayloadVol = null;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Embedded(prefix = "return_payload_")
    private final com.haroldadmin.moonshot.models.common.Mass returnPayloadMass = null;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Embedded(prefix = "return_payload_")
    private final com.haroldadmin.moonshot.models.common.Volume returnPayloadVol = null;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Embedded(prefix = "pressurized_capsule")
    private final com.haroldadmin.moonshot.models.PressurizedCapsule pressurizedCapsule = null;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Embedded()
    private final com.haroldadmin.moonshot.models.Trunk trunk = null;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Embedded(prefix = "height_w_trunk_")
    private final com.haroldadmin.moonshot.models.common.Length heightWTrunk = null;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Embedded(prefix = "diameter_")
    private final com.haroldadmin.moonshot.models.common.Length diameter = null;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "wikipedia")
    private final java.lang.String wikipedia = null;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "description")
    private final java.lang.String description = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDragonId() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDragonName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDragonType() {
        return null;
    }
    
    public final boolean getActive() {
        return false;
    }
    
    public final int getCrewCapacity() {
        return 0;
    }
    
    public final double getSideWallAngleDeg() {
        return 0.0;
    }
    
    public final double getOrbitDurationYear() {
        return 0.0;
    }
    
    public final double getDryMassKg() {
        return 0.0;
    }
    
    public final double getDryMassLb() {
        return 0.0;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getFirstFlight() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.haroldadmin.moonshot.models.HeatShield getHeatShield() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.haroldadmin.moonshot.models.common.Mass getLaunchPayloadMass() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.haroldadmin.moonshot.models.common.Volume getLaunchPayloadVol() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.haroldadmin.moonshot.models.common.Mass getReturnPayloadMass() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.haroldadmin.moonshot.models.common.Volume getReturnPayloadVol() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.haroldadmin.moonshot.models.PressurizedCapsule getPressurizedCapsule() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.haroldadmin.moonshot.models.Trunk getTrunk() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.haroldadmin.moonshot.models.common.Length getHeightWTrunk() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.haroldadmin.moonshot.models.common.Length getDiameter() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getWikipedia() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDescription() {
        return null;
    }
    
    public Dragon(@org.jetbrains.annotations.NotNull()
    java.lang.String dragonId, @org.jetbrains.annotations.NotNull()
    java.lang.String dragonName, @org.jetbrains.annotations.NotNull()
    java.lang.String dragonType, boolean active, int crewCapacity, double sideWallAngleDeg, double orbitDurationYear, double dryMassKg, double dryMassLb, @org.jetbrains.annotations.Nullable()
    java.lang.String firstFlight, @org.jetbrains.annotations.NotNull()
    com.haroldadmin.moonshot.models.HeatShield heatShield, @org.jetbrains.annotations.NotNull()
    com.haroldadmin.moonshot.models.common.Mass launchPayloadMass, @org.jetbrains.annotations.NotNull()
    com.haroldadmin.moonshot.models.common.Volume launchPayloadVol, @org.jetbrains.annotations.NotNull()
    com.haroldadmin.moonshot.models.common.Mass returnPayloadMass, @org.jetbrains.annotations.NotNull()
    com.haroldadmin.moonshot.models.common.Volume returnPayloadVol, @org.jetbrains.annotations.NotNull()
    com.haroldadmin.moonshot.models.PressurizedCapsule pressurizedCapsule, @org.jetbrains.annotations.NotNull()
    com.haroldadmin.moonshot.models.Trunk trunk, @org.jetbrains.annotations.NotNull()
    com.haroldadmin.moonshot.models.common.Length heightWTrunk, @org.jetbrains.annotations.NotNull()
    com.haroldadmin.moonshot.models.common.Length diameter, @org.jetbrains.annotations.NotNull()
    java.lang.String wikipedia, @org.jetbrains.annotations.NotNull()
    java.lang.String description) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component3() {
        return null;
    }
    
    public final boolean component4() {
        return false;
    }
    
    public final int component5() {
        return 0;
    }
    
    public final double component6() {
        return 0.0;
    }
    
    public final double component7() {
        return 0.0;
    }
    
    public final double component8() {
        return 0.0;
    }
    
    public final double component9() {
        return 0.0;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component10() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.haroldadmin.moonshot.models.HeatShield component11() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.haroldadmin.moonshot.models.common.Mass component12() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.haroldadmin.moonshot.models.common.Volume component13() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.haroldadmin.moonshot.models.common.Mass component14() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.haroldadmin.moonshot.models.common.Volume component15() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.haroldadmin.moonshot.models.PressurizedCapsule component16() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.haroldadmin.moonshot.models.Trunk component17() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.haroldadmin.moonshot.models.common.Length component18() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.haroldadmin.moonshot.models.common.Length component19() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component20() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component21() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.haroldadmin.moonshot.models.Dragon copy(@org.jetbrains.annotations.NotNull()
    java.lang.String dragonId, @org.jetbrains.annotations.NotNull()
    java.lang.String dragonName, @org.jetbrains.annotations.NotNull()
    java.lang.String dragonType, boolean active, int crewCapacity, double sideWallAngleDeg, double orbitDurationYear, double dryMassKg, double dryMassLb, @org.jetbrains.annotations.Nullable()
    java.lang.String firstFlight, @org.jetbrains.annotations.NotNull()
    com.haroldadmin.moonshot.models.HeatShield heatShield, @org.jetbrains.annotations.NotNull()
    com.haroldadmin.moonshot.models.common.Mass launchPayloadMass, @org.jetbrains.annotations.NotNull()
    com.haroldadmin.moonshot.models.common.Volume launchPayloadVol, @org.jetbrains.annotations.NotNull()
    com.haroldadmin.moonshot.models.common.Mass returnPayloadMass, @org.jetbrains.annotations.NotNull()
    com.haroldadmin.moonshot.models.common.Volume returnPayloadVol, @org.jetbrains.annotations.NotNull()
    com.haroldadmin.moonshot.models.PressurizedCapsule pressurizedCapsule, @org.jetbrains.annotations.NotNull()
    com.haroldadmin.moonshot.models.Trunk trunk, @org.jetbrains.annotations.NotNull()
    com.haroldadmin.moonshot.models.common.Length heightWTrunk, @org.jetbrains.annotations.NotNull()
    com.haroldadmin.moonshot.models.common.Length diameter, @org.jetbrains.annotations.NotNull()
    java.lang.String wikipedia, @org.jetbrains.annotations.NotNull()
    java.lang.String description) {
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