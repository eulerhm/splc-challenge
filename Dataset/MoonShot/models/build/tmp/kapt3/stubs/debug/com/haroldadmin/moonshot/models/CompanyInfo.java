package com.haroldadmin.moonshot.models;

import java.lang.System;

@androidx.room.Entity(tableName = "company_info")
@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b$\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001Bu\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0014J\t\u0010\'\u001a\u00020\u0003H\u00c6\u0003J\t\u0010(\u001a\u00020\u0003H\u00c6\u0003J\t\u0010)\u001a\u00020\u0003H\u00c6\u0003J\t\u0010*\u001a\u00020\u0010H\u00c6\u0003J\t\u0010+\u001a\u00020\u0012H\u00c6\u0003J\t\u0010,\u001a\u00020\u0003H\u00c6\u0003J\t\u0010-\u001a\u00020\u0003H\u00c6\u0003J\t\u0010.\u001a\u00020\u0006H\u00c6\u0003J\t\u0010/\u001a\u00020\u0006H\u00c6\u0003J\t\u00100\u001a\u00020\u0006H\u00c6\u0003J\t\u00101\u001a\u00020\u0006H\u00c6\u0003J\t\u00102\u001a\u00020\u0006H\u00c6\u0003J\t\u00103\u001a\u00020\u0003H\u00c6\u0003J\t\u00104\u001a\u00020\u0003H\u00c6\u0003J\u0095\u0001\u00105\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u0003H\u00c6\u0001J\u0013\u00106\u001a\u0002072\b\u00108\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u00109\u001a\u00020\u0006H\u00d6\u0001J\t\u0010:\u001a\u00020\u0003H\u00d6\u0001R\u0016\u0010\u000b\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\r\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0016\u0010\f\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0016R\u0016\u0010\u000e\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0016R\u0016\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0016R\u0016\u0010\u0011\u001a\u00020\u00128\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0016\u0010\t\u001a\u00020\u00068\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010\u001bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0016R\u0016\u0010\u0013\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0016R\u0016\u0010\n\u001a\u00020\u00068\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001bR\u0016\u0010\u000f\u001a\u00020\u00108\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0016\u0010\b\u001a\u00020\u00068\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001b\u00a8\u0006;"}, d2 = {"Lcom/haroldadmin/moonshot/models/CompanyInfo;", "", "name", "", "founder", "foundedYear", "", "employees", "vehicles", "launchSites", "testSites", "ceo", "cto", "coo", "ctoPropulsion", "valuation", "", "headquarters", "Lcom/haroldadmin/moonshot/models/Headquarters;", "summary", "(Ljava/lang/String;Ljava/lang/String;IIIIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLcom/haroldadmin/moonshot/models/Headquarters;Ljava/lang/String;)V", "getCeo", "()Ljava/lang/String;", "getCoo", "getCto", "getCtoPropulsion", "getEmployees", "()I", "getFoundedYear", "getFounder", "getHeadquarters", "()Lcom/haroldadmin/moonshot/models/Headquarters;", "getLaunchSites", "getName", "getSummary", "getTestSites", "getValuation", "()J", "getVehicles", "component1", "component10", "component11", "component12", "component13", "component14", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "models_debug"})
public final class CompanyInfo {
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "name")
    @androidx.room.PrimaryKey()
    private final java.lang.String name = null;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "founder")
    private final java.lang.String founder = null;
    @androidx.room.ColumnInfo(name = "founded")
    private final int foundedYear = 0;
    @androidx.room.ColumnInfo(name = "employees")
    private final int employees = 0;
    @androidx.room.ColumnInfo(name = "vehicles")
    private final int vehicles = 0;
    @androidx.room.ColumnInfo(name = "launch_sites")
    private final int launchSites = 0;
    @androidx.room.ColumnInfo(name = "test_sites")
    private final int testSites = 0;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "ceo")
    private final java.lang.String ceo = null;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "cto")
    private final java.lang.String cto = null;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "coo")
    private final java.lang.String coo = null;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "cto_propulsion")
    private final java.lang.String ctoPropulsion = null;
    @androidx.room.ColumnInfo(name = "valuation")
    private final long valuation = 0L;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Embedded()
    private final com.haroldadmin.moonshot.models.Headquarters headquarters = null;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "summary")
    private final java.lang.String summary = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getFounder() {
        return null;
    }
    
    public final int getFoundedYear() {
        return 0;
    }
    
    public final int getEmployees() {
        return 0;
    }
    
    public final int getVehicles() {
        return 0;
    }
    
    public final int getLaunchSites() {
        return 0;
    }
    
    public final int getTestSites() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCeo() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCto() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCoo() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCtoPropulsion() {
        return null;
    }
    
    public final long getValuation() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.haroldadmin.moonshot.models.Headquarters getHeadquarters() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getSummary() {
        return null;
    }
    
    public CompanyInfo(@org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    java.lang.String founder, int foundedYear, int employees, int vehicles, int launchSites, int testSites, @org.jetbrains.annotations.NotNull()
    java.lang.String ceo, @org.jetbrains.annotations.NotNull()
    java.lang.String cto, @org.jetbrains.annotations.NotNull()
    java.lang.String coo, @org.jetbrains.annotations.NotNull()
    java.lang.String ctoPropulsion, long valuation, @org.jetbrains.annotations.NotNull()
    com.haroldadmin.moonshot.models.Headquarters headquarters, @org.jetbrains.annotations.NotNull()
    java.lang.String summary) {
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
    
    public final int component3() {
        return 0;
    }
    
    public final int component4() {
        return 0;
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
    public final java.lang.String component11() {
        return null;
    }
    
    public final long component12() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.haroldadmin.moonshot.models.Headquarters component13() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component14() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.haroldadmin.moonshot.models.CompanyInfo copy(@org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    java.lang.String founder, int foundedYear, int employees, int vehicles, int launchSites, int testSites, @org.jetbrains.annotations.NotNull()
    java.lang.String ceo, @org.jetbrains.annotations.NotNull()
    java.lang.String cto, @org.jetbrains.annotations.NotNull()
    java.lang.String coo, @org.jetbrains.annotations.NotNull()
    java.lang.String ctoPropulsion, long valuation, @org.jetbrains.annotations.NotNull()
    com.haroldadmin.moonshot.models.Headquarters headquarters, @org.jetbrains.annotations.NotNull()
    java.lang.String summary) {
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