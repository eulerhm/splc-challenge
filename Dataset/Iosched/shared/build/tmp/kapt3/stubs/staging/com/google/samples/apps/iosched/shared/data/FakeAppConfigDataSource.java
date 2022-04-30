package com.google.samples.apps.iosched.shared.data;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\n2\u0006\u0010\u000b\u001a\u00020\u0005H\u0016J\b\u0010\f\u001a\u00020\rH\u0016J*\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0018\u0010\u0012\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00060\u0004H\u0002J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\b\u0010\u0015\u001a\u00020\u0014H\u0016J\b\u0010\u0016\u001a\u00020\u0014H\u0016J\b\u0010\u0017\u001a\u00020\u0014H\u0016J\b\u0010\u0018\u001a\u00020\u0014H\u0016J\b\u0010\u0019\u001a\u00020\u0014H\u0016J\b\u0010\u001a\u001a\u00020\u0014H\u0016J\u0011\u0010\u001b\u001a\u00020\u000fH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001cR \u0010\u0003\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00060\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00060\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00060\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u001d"}, d2 = {"Lcom/google/samples/apps/iosched/shared/data/FakeAppConfigDataSource;", "Lcom/google/samples/apps/iosched/shared/data/config/AppConfigDataSource;", "()V", "times1", "", "", "Landroidx/lifecycle/MutableLiveData;", "times2", "times3", "getStringLiveData", "Landroidx/lifecycle/LiveData;", "key", "getWifiInfo", "Lcom/google/samples/apps/iosched/model/ConferenceWifiInfo;", "initTimes", "", "startTimeDay", "Lorg/threeten/bp/ZonedDateTime;", "times", "isAssistantAppFeatureEnabled", "", "isCodelabsFeatureEnabled", "isExploreArFeatureEnabled", "isMapFeatureEnabled", "isReservationFeatureEnabled", "isSearchScheduleFeatureEnabled", "isSearchUsingRoomFeatureEnabled", "syncStrings", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "shared_staging"})
public final class FakeAppConfigDataSource implements com.google.samples.apps.iosched.shared.data.config.AppConfigDataSource {
    private final java.util.Map<java.lang.String, androidx.lifecycle.MutableLiveData<java.lang.String>> times1 = null;
    private final java.util.Map<java.lang.String, androidx.lifecycle.MutableLiveData<java.lang.String>> times2 = null;
    private final java.util.Map<java.lang.String, androidx.lifecycle.MutableLiveData<java.lang.String>> times3 = null;
    
    private final void initTimes(org.threeten.bp.ZonedDateTime startTimeDay, java.util.Map<java.lang.String, ? extends androidx.lifecycle.MutableLiveData<java.lang.String>> times) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.lifecycle.LiveData<java.lang.String> getStringLiveData(@org.jetbrains.annotations.NotNull()
    java.lang.String key) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object syncStrings(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p0) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.google.samples.apps.iosched.model.ConferenceWifiInfo getWifiInfo() {
        return null;
    }
    
    @java.lang.Override()
    public boolean isMapFeatureEnabled() {
        return false;
    }
    
    @java.lang.Override()
    public boolean isExploreArFeatureEnabled() {
        return false;
    }
    
    @java.lang.Override()
    public boolean isCodelabsFeatureEnabled() {
        return false;
    }
    
    @java.lang.Override()
    public boolean isSearchScheduleFeatureEnabled() {
        return false;
    }
    
    @java.lang.Override()
    public boolean isSearchUsingRoomFeatureEnabled() {
        return false;
    }
    
    @java.lang.Override()
    public boolean isAssistantAppFeatureEnabled() {
        return false;
    }
    
    @java.lang.Override()
    public boolean isReservationFeatureEnabled() {
        return false;
    }
    
    public FakeAppConfigDataSource() {
        super();
    }
}