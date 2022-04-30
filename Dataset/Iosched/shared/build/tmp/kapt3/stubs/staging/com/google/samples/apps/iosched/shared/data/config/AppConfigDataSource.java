package com.google.samples.apps.iosched.shared.data.config;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0004H&J\b\u0010\u0006\u001a\u00020\u0007H&J\b\u0010\b\u001a\u00020\tH&J\b\u0010\n\u001a\u00020\tH&J\b\u0010\u000b\u001a\u00020\tH&J\b\u0010\f\u001a\u00020\tH&J\b\u0010\r\u001a\u00020\tH&J\b\u0010\u000e\u001a\u00020\tH&J\b\u0010\u000f\u001a\u00020\tH&J\u0011\u0010\u0010\u001a\u00020\u0011H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0012\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0013"}, d2 = {"Lcom/google/samples/apps/iosched/shared/data/config/AppConfigDataSource;", "", "getStringLiveData", "Landroidx/lifecycle/LiveData;", "", "key", "getWifiInfo", "Lcom/google/samples/apps/iosched/model/ConferenceWifiInfo;", "isAssistantAppFeatureEnabled", "", "isCodelabsFeatureEnabled", "isExploreArFeatureEnabled", "isMapFeatureEnabled", "isReservationFeatureEnabled", "isSearchScheduleFeatureEnabled", "isSearchUsingRoomFeatureEnabled", "syncStrings", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "shared_staging"})
public abstract interface AppConfigDataSource {
    
    @org.jetbrains.annotations.NotNull()
    public abstract androidx.lifecycle.LiveData<java.lang.String> getStringLiveData(@org.jetbrains.annotations.NotNull()
    java.lang.String key);
    
    /**
     * Sync the strings with the latest values with Remote Config
     */
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object syncStrings(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p0);
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.google.samples.apps.iosched.model.ConferenceWifiInfo getWifiInfo();
    
    public abstract boolean isMapFeatureEnabled();
    
    public abstract boolean isExploreArFeatureEnabled();
    
    public abstract boolean isCodelabsFeatureEnabled();
    
    public abstract boolean isSearchScheduleFeatureEnabled();
    
    public abstract boolean isSearchUsingRoomFeatureEnabled();
    
    public abstract boolean isAssistantAppFeatureEnabled();
    
    public abstract boolean isReservationFeatureEnabled();
}