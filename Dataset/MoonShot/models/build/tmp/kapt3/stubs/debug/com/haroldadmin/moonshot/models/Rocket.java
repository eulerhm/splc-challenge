package com.haroldadmin.moonshot.models;

import java.lang.System;

@androidx.room.Entity()
@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\bA\b\u0087\b\u0018\u00002\u00020\u0001B\u00ad\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u000f\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u0012\u0006\u0010\u0015\u001a\u00020\u0016\u0012\u0006\u0010\u0017\u001a\u00020\u0018\u0012\u0006\u0010\u0019\u001a\u00020\u001a\u0012\u0006\u0010\u001b\u001a\u00020\u001c\u0012\u0006\u0010\u001d\u001a\u00020\r\u0012\u0006\u0010\u001e\u001a\u00020\r\u0012\u0006\u0010\u001f\u001a\u00020\r\u0012\u0006\u0010 \u001a\u00020\r\u0012\u0006\u0010!\u001a\u00020\r\u00a2\u0006\u0002\u0010\"J\t\u0010C\u001a\u00020\u0003H\u00c6\u0003J\t\u0010D\u001a\u00020\u0011H\u00c6\u0003J\t\u0010E\u001a\u00020\u0011H\u00c6\u0003J\t\u0010F\u001a\u00020\u0014H\u00c6\u0003J\t\u0010G\u001a\u00020\u0016H\u00c6\u0003J\t\u0010H\u001a\u00020\u0018H\u00c6\u0003J\t\u0010I\u001a\u00020\u001aH\u00c6\u0003J\t\u0010J\u001a\u00020\u001cH\u00c6\u0003J\t\u0010K\u001a\u00020\rH\u00c6\u0003J\t\u0010L\u001a\u00020\rH\u00c6\u0003J\t\u0010M\u001a\u00020\rH\u00c6\u0003J\t\u0010N\u001a\u00020\u0005H\u00c6\u0003J\t\u0010O\u001a\u00020\rH\u00c6\u0003J\t\u0010P\u001a\u00020\rH\u00c6\u0003J\t\u0010Q\u001a\u00020\u0007H\u00c6\u0003J\t\u0010R\u001a\u00020\u0007H\u00c6\u0003J\t\u0010S\u001a\u00020\u0003H\u00c6\u0003J\t\u0010T\u001a\u00020\u000bH\u00c6\u0003J\t\u0010U\u001a\u00020\rH\u00c6\u0003J\t\u0010V\u001a\u00020\rH\u00c6\u0003J\t\u0010W\u001a\u00020\rH\u00c6\u0003J\u00db\u0001\u0010X\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u00182\b\b\u0002\u0010\u0019\u001a\u00020\u001a2\b\b\u0002\u0010\u001b\u001a\u00020\u001c2\b\b\u0002\u0010\u001d\u001a\u00020\r2\b\b\u0002\u0010\u001e\u001a\u00020\r2\b\b\u0002\u0010\u001f\u001a\u00020\r2\b\b\u0002\u0010 \u001a\u00020\r2\b\b\u0002\u0010!\u001a\u00020\rH\u00c6\u0001J\u0013\u0010Y\u001a\u00020\u00052\b\u0010Z\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010[\u001a\u00020\u0007H\u00d6\u0001J\t\u0010\\\u001a\u00020\rH\u00d6\u0001R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0016\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0016\u0010\u000f\u001a\u00020\r8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\'\u0010(R\u0016\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0016\u0010\u000e\u001a\u00020\r8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b+\u0010(R\u0016\u0010\u001e\u001a\u00020\r8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b,\u0010(R\u0016\u0010\u0012\u001a\u00020\u00118\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u0016\u0010\u0019\u001a\u00020\u001a8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b/\u00100R\u0016\u0010\f\u001a\u00020\r8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b1\u0010(R\u0016\u0010\u0015\u001a\u00020\u00168\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b2\u00103R\u0016\u0010\u0010\u001a\u00020\u00118\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b4\u0010.R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b5\u0010*R\u0016\u0010\u001b\u001a\u00020\u001c8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b6\u00107R\u0016\u0010\u0013\u001a\u00020\u00148\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b8\u00109R\u0016\u0010!\u001a\u00020\r8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b:\u0010(R\u0016\u0010\u001f\u001a\u00020\r8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b;\u0010(R\u0016\u0010 \u001a\u00020\r8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b<\u0010(R\u0016\u0010\u0017\u001a\u00020\u00188\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b=\u0010>R\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b?\u0010&R\u0016\u0010\n\u001a\u00020\u000b8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b@\u0010AR\u0016\u0010\u001d\u001a\u00020\r8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bB\u0010(\u00a8\u0006]"}, d2 = {"Lcom/haroldadmin/moonshot/models/Rocket;", "", "id", "", "active", "", "stages", "", "boosters", "costPerLaunch", "successRatePercentage", "", "firstFlight", "", "country", "company", "height", "Lcom/haroldadmin/moonshot/models/common/Length;", "diameter", "mass", "Lcom/haroldadmin/moonshot/models/common/Mass;", "firstStage", "Lcom/haroldadmin/moonshot/models/FirstStage;", "secondStage", "Lcom/haroldadmin/moonshot/models/SecondStage;", "engines", "Lcom/haroldadmin/moonshot/models/Engine;", "landingLegs", "Lcom/haroldadmin/moonshot/models/LandingLegs;", "wikipedia", "description", "rocketName", "rocketType", "rocketId", "(JZIIJDLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/haroldadmin/moonshot/models/common/Length;Lcom/haroldadmin/moonshot/models/common/Length;Lcom/haroldadmin/moonshot/models/common/Mass;Lcom/haroldadmin/moonshot/models/FirstStage;Lcom/haroldadmin/moonshot/models/SecondStage;Lcom/haroldadmin/moonshot/models/Engine;Lcom/haroldadmin/moonshot/models/LandingLegs;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getActive", "()Z", "getBoosters", "()I", "getCompany", "()Ljava/lang/String;", "getCostPerLaunch", "()J", "getCountry", "getDescription", "getDiameter", "()Lcom/haroldadmin/moonshot/models/common/Length;", "getEngines", "()Lcom/haroldadmin/moonshot/models/Engine;", "getFirstFlight", "getFirstStage", "()Lcom/haroldadmin/moonshot/models/FirstStage;", "getHeight", "getId", "getLandingLegs", "()Lcom/haroldadmin/moonshot/models/LandingLegs;", "getMass", "()Lcom/haroldadmin/moonshot/models/common/Mass;", "getRocketId", "getRocketName", "getRocketType", "getSecondStage", "()Lcom/haroldadmin/moonshot/models/SecondStage;", "getStages", "getSuccessRatePercentage", "()D", "getWikipedia", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "models_debug"})
public final class Rocket {
    @androidx.room.ColumnInfo(name = "id")
    @androidx.room.PrimaryKey()
    private final long id = 0L;
    @androidx.room.ColumnInfo(name = "active")
    private final boolean active = false;
    @androidx.room.ColumnInfo(name = "stages")
    private final int stages = 0;
    @androidx.room.ColumnInfo(name = "boosters")
    private final int boosters = 0;
    @androidx.room.ColumnInfo(name = "cost_per_launch")
    private final long costPerLaunch = 0L;
    @androidx.room.ColumnInfo(name = "success_rate_pct")
    private final double successRatePercentage = 0.0;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "first_flight")
    private final java.lang.String firstFlight = null;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "country")
    private final java.lang.String country = null;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "company")
    private final java.lang.String company = null;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Embedded(prefix = "height_")
    private final com.haroldadmin.moonshot.models.common.Length height = null;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Embedded(prefix = "diameter_")
    private final com.haroldadmin.moonshot.models.common.Length diameter = null;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Embedded(prefix = "mass_")
    private final com.haroldadmin.moonshot.models.common.Mass mass = null;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Embedded(prefix = "first_stage_")
    private final com.haroldadmin.moonshot.models.FirstStage firstStage = null;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Embedded(prefix = "second_stage_")
    private final com.haroldadmin.moonshot.models.SecondStage secondStage = null;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Embedded(prefix = "engine_")
    private final com.haroldadmin.moonshot.models.Engine engines = null;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Embedded()
    private final com.haroldadmin.moonshot.models.LandingLegs landingLegs = null;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "wikipedia")
    private final java.lang.String wikipedia = null;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "description")
    private final java.lang.String description = null;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "rocket_name")
    private final java.lang.String rocketName = null;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "rocket_type")
    private final java.lang.String rocketType = null;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "rocket_id")
    private final java.lang.String rocketId = null;
    
    public final long getId() {
        return 0L;
    }
    
    public final boolean getActive() {
        return false;
    }
    
    public final int getStages() {
        return 0;
    }
    
    public final int getBoosters() {
        return 0;
    }
    
    public final long getCostPerLaunch() {
        return 0L;
    }
    
    public final double getSuccessRatePercentage() {
        return 0.0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getFirstFlight() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCountry() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCompany() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.haroldadmin.moonshot.models.common.Length getHeight() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.haroldadmin.moonshot.models.common.Length getDiameter() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.haroldadmin.moonshot.models.common.Mass getMass() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.haroldadmin.moonshot.models.FirstStage getFirstStage() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.haroldadmin.moonshot.models.SecondStage getSecondStage() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.haroldadmin.moonshot.models.Engine getEngines() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.haroldadmin.moonshot.models.LandingLegs getLandingLegs() {
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
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getRocketName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getRocketType() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getRocketId() {
        return null;
    }
    
    public Rocket(long id, boolean active, int stages, int boosters, long costPerLaunch, double successRatePercentage, @org.jetbrains.annotations.NotNull()
    java.lang.String firstFlight, @org.jetbrains.annotations.NotNull()
    java.lang.String country, @org.jetbrains.annotations.NotNull()
    java.lang.String company, @org.jetbrains.annotations.NotNull()
    com.haroldadmin.moonshot.models.common.Length height, @org.jetbrains.annotations.NotNull()
    com.haroldadmin.moonshot.models.common.Length diameter, @org.jetbrains.annotations.NotNull()
    com.haroldadmin.moonshot.models.common.Mass mass, @org.jetbrains.annotations.NotNull()
    com.haroldadmin.moonshot.models.FirstStage firstStage, @org.jetbrains.annotations.NotNull()
    com.haroldadmin.moonshot.models.SecondStage secondStage, @org.jetbrains.annotations.NotNull()
    com.haroldadmin.moonshot.models.Engine engines, @org.jetbrains.annotations.NotNull()
    com.haroldadmin.moonshot.models.LandingLegs landingLegs, @org.jetbrains.annotations.NotNull()
    java.lang.String wikipedia, @org.jetbrains.annotations.NotNull()
    java.lang.String description, @org.jetbrains.annotations.NotNull()
    java.lang.String rocketName, @org.jetbrains.annotations.NotNull()
    java.lang.String rocketType, @org.jetbrains.annotations.NotNull()
    java.lang.String rocketId) {
        super();
    }
    
    public final long component1() {
        return 0L;
    }
    
    public final boolean component2() {
        return false;
    }
    
    public final int component3() {
        return 0;
    }
    
    public final int component4() {
        return 0;
    }
    
    public final long component5() {
        return 0L;
    }
    
    public final double component6() {
        return 0.0;
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
    public final com.haroldadmin.moonshot.models.common.Length component10() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.haroldadmin.moonshot.models.common.Length component11() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.haroldadmin.moonshot.models.common.Mass component12() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.haroldadmin.moonshot.models.FirstStage component13() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.haroldadmin.moonshot.models.SecondStage component14() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.haroldadmin.moonshot.models.Engine component15() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.haroldadmin.moonshot.models.LandingLegs component16() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component17() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component18() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component19() {
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
    public final com.haroldadmin.moonshot.models.Rocket copy(long id, boolean active, int stages, int boosters, long costPerLaunch, double successRatePercentage, @org.jetbrains.annotations.NotNull()
    java.lang.String firstFlight, @org.jetbrains.annotations.NotNull()
    java.lang.String country, @org.jetbrains.annotations.NotNull()
    java.lang.String company, @org.jetbrains.annotations.NotNull()
    com.haroldadmin.moonshot.models.common.Length height, @org.jetbrains.annotations.NotNull()
    com.haroldadmin.moonshot.models.common.Length diameter, @org.jetbrains.annotations.NotNull()
    com.haroldadmin.moonshot.models.common.Mass mass, @org.jetbrains.annotations.NotNull()
    com.haroldadmin.moonshot.models.FirstStage firstStage, @org.jetbrains.annotations.NotNull()
    com.haroldadmin.moonshot.models.SecondStage secondStage, @org.jetbrains.annotations.NotNull()
    com.haroldadmin.moonshot.models.Engine engines, @org.jetbrains.annotations.NotNull()
    com.haroldadmin.moonshot.models.LandingLegs landingLegs, @org.jetbrains.annotations.NotNull()
    java.lang.String wikipedia, @org.jetbrains.annotations.NotNull()
    java.lang.String description, @org.jetbrains.annotations.NotNull()
    java.lang.String rocketName, @org.jetbrains.annotations.NotNull()
    java.lang.String rocketType, @org.jetbrains.annotations.NotNull()
    java.lang.String rocketId) {
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