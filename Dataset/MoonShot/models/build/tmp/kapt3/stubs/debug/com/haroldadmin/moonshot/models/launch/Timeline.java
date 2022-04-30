package com.haroldadmin.moonshot.models.launch;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\bG\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u00e1\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0019J\u0010\u00102\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u001bJ\u0010\u00103\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u001bJ\u0010\u00104\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u001bJ\u0010\u00105\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u001bJ\u0010\u00106\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u001bJ\u0010\u00107\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u001bJ\u0010\u00108\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u001bJ\u0010\u00109\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u001bJ\u0010\u0010:\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u001bJ\u0010\u0010;\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u001bJ\u0010\u0010<\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u001bJ\u0010\u0010=\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u001bJ\u0010\u0010>\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u001bJ\u0010\u0010?\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u001bJ\u0010\u0010@\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u001bJ\u0010\u0010A\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u001bJ\u0010\u0010B\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u001bJ\u0010\u0010C\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u001bJ\u0010\u0010D\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u001bJ\u0010\u0010E\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u001bJ\u0010\u0010F\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u001bJ\u0010\u0010G\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u001bJ\u0096\u0002\u0010H\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001\u00a2\u0006\u0002\u0010IJ\u0013\u0010J\u001a\u00020K2\b\u0010L\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010M\u001a\u00020\u0003H\u00d6\u0001J\t\u0010N\u001a\u00020OH\u00d6\u0001R\u0015\u0010\b\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b\u001a\u0010\u001bR\u0015\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b\u001d\u0010\u001bR\u0015\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b\u001e\u0010\u001bR\u0015\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b\u001f\u0010\u001bR\u0015\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b \u0010\u001bR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b!\u0010\u001bR\u0015\u0010\f\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b\"\u0010\u001bR\u0015\u0010\r\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b#\u0010\u001bR\u0015\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b$\u0010\u001bR\u0015\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b%\u0010\u001bR\u0015\u0010\u0018\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b&\u0010\u001bR\u0015\u0010\t\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b\'\u0010\u001bR\u0015\u0010\n\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b(\u0010\u001bR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b)\u0010\u001bR\u0015\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b*\u0010\u001bR\u0015\u0010\u0017\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b+\u0010\u001bR\u0015\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b,\u0010\u001bR\u0015\u0010\u0016\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b-\u0010\u001bR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b.\u0010\u001bR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b/\u0010\u001bR\u0015\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b0\u0010\u001bR\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b1\u0010\u001b\u00a8\u0006P"}, d2 = {"Lcom/haroldadmin/moonshot/models/launch/Timeline;", "", "webcastLiftoff", "", "goForPropLoading", "rp1Loading", "stage1LoxLoading", "stage2LoxLoading", "engineChill", "prelaunchChecks", "propellantPressurization", "goForLaunch", "ignition", "liftoff", "maxq", "meco", "stageSeparation", "secondStageIgnition", "fairingDeploy", "firstStageEntryBurn", "seco1", "firstStageLanding", "secondStageRestart", "seco2", "payloadDeploy", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "getEngineChill", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getFairingDeploy", "getFirstStageEntryBurn", "getFirstStageLanding", "getGoForLaunch", "getGoForPropLoading", "getIgnition", "getLiftoff", "getMaxq", "getMeco", "getPayloadDeploy", "getPrelaunchChecks", "getPropellantPressurization", "getRp1Loading", "getSeco1", "getSeco2", "getSecondStageIgnition", "getSecondStageRestart", "getStage1LoxLoading", "getStage2LoxLoading", "getStageSeparation", "getWebcastLiftoff", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/haroldadmin/moonshot/models/launch/Timeline;", "equals", "", "other", "hashCode", "toString", "", "models_debug"})
public final class Timeline {
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Integer webcastLiftoff = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Integer goForPropLoading = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Integer rp1Loading = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Integer stage1LoxLoading = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Integer stage2LoxLoading = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Integer engineChill = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Integer prelaunchChecks = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Integer propellantPressurization = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Integer goForLaunch = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Integer ignition = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Integer liftoff = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Integer maxq = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Integer meco = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Integer stageSeparation = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Integer secondStageIgnition = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Integer fairingDeploy = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Integer firstStageEntryBurn = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Integer seco1 = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Integer firstStageLanding = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Integer secondStageRestart = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Integer seco2 = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Integer payloadDeploy = null;
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getWebcastLiftoff() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getGoForPropLoading() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getRp1Loading() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getStage1LoxLoading() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getStage2LoxLoading() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getEngineChill() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getPrelaunchChecks() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getPropellantPressurization() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getGoForLaunch() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getIgnition() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getLiftoff() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getMaxq() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getMeco() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getStageSeparation() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getSecondStageIgnition() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getFairingDeploy() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getFirstStageEntryBurn() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getSeco1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getFirstStageLanding() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getSecondStageRestart() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getSeco2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getPayloadDeploy() {
        return null;
    }
    
    public Timeline(@org.jetbrains.annotations.Nullable()
    java.lang.Integer webcastLiftoff, @org.jetbrains.annotations.Nullable()
    java.lang.Integer goForPropLoading, @org.jetbrains.annotations.Nullable()
    java.lang.Integer rp1Loading, @org.jetbrains.annotations.Nullable()
    java.lang.Integer stage1LoxLoading, @org.jetbrains.annotations.Nullable()
    java.lang.Integer stage2LoxLoading, @org.jetbrains.annotations.Nullable()
    java.lang.Integer engineChill, @org.jetbrains.annotations.Nullable()
    java.lang.Integer prelaunchChecks, @org.jetbrains.annotations.Nullable()
    java.lang.Integer propellantPressurization, @org.jetbrains.annotations.Nullable()
    java.lang.Integer goForLaunch, @org.jetbrains.annotations.Nullable()
    java.lang.Integer ignition, @org.jetbrains.annotations.Nullable()
    java.lang.Integer liftoff, @org.jetbrains.annotations.Nullable()
    java.lang.Integer maxq, @org.jetbrains.annotations.Nullable()
    java.lang.Integer meco, @org.jetbrains.annotations.Nullable()
    java.lang.Integer stageSeparation, @org.jetbrains.annotations.Nullable()
    java.lang.Integer secondStageIgnition, @org.jetbrains.annotations.Nullable()
    java.lang.Integer fairingDeploy, @org.jetbrains.annotations.Nullable()
    java.lang.Integer firstStageEntryBurn, @org.jetbrains.annotations.Nullable()
    java.lang.Integer seco1, @org.jetbrains.annotations.Nullable()
    java.lang.Integer firstStageLanding, @org.jetbrains.annotations.Nullable()
    java.lang.Integer secondStageRestart, @org.jetbrains.annotations.Nullable()
    java.lang.Integer seco2, @org.jetbrains.annotations.Nullable()
    java.lang.Integer payloadDeploy) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component6() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component7() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component8() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component9() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component10() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component11() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component12() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component13() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component14() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component15() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component16() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component17() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component18() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component19() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component20() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component21() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component22() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.haroldadmin.moonshot.models.launch.Timeline copy(@org.jetbrains.annotations.Nullable()
    java.lang.Integer webcastLiftoff, @org.jetbrains.annotations.Nullable()
    java.lang.Integer goForPropLoading, @org.jetbrains.annotations.Nullable()
    java.lang.Integer rp1Loading, @org.jetbrains.annotations.Nullable()
    java.lang.Integer stage1LoxLoading, @org.jetbrains.annotations.Nullable()
    java.lang.Integer stage2LoxLoading, @org.jetbrains.annotations.Nullable()
    java.lang.Integer engineChill, @org.jetbrains.annotations.Nullable()
    java.lang.Integer prelaunchChecks, @org.jetbrains.annotations.Nullable()
    java.lang.Integer propellantPressurization, @org.jetbrains.annotations.Nullable()
    java.lang.Integer goForLaunch, @org.jetbrains.annotations.Nullable()
    java.lang.Integer ignition, @org.jetbrains.annotations.Nullable()
    java.lang.Integer liftoff, @org.jetbrains.annotations.Nullable()
    java.lang.Integer maxq, @org.jetbrains.annotations.Nullable()
    java.lang.Integer meco, @org.jetbrains.annotations.Nullable()
    java.lang.Integer stageSeparation, @org.jetbrains.annotations.Nullable()
    java.lang.Integer secondStageIgnition, @org.jetbrains.annotations.Nullable()
    java.lang.Integer fairingDeploy, @org.jetbrains.annotations.Nullable()
    java.lang.Integer firstStageEntryBurn, @org.jetbrains.annotations.Nullable()
    java.lang.Integer seco1, @org.jetbrains.annotations.Nullable()
    java.lang.Integer firstStageLanding, @org.jetbrains.annotations.Nullable()
    java.lang.Integer secondStageRestart, @org.jetbrains.annotations.Nullable()
    java.lang.Integer seco2, @org.jetbrains.annotations.Nullable()
    java.lang.Integer payloadDeploy) {
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