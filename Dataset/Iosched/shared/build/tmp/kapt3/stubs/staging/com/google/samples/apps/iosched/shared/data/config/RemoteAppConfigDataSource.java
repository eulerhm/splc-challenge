package com.google.samples.apps.iosched.shared.data.config;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u0000  2\u00020\u0001:\u0001 B!\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00102\u0006\u0010\u0011\u001a\u00020\u000bH\u0016J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0015H\u0016J\b\u0010\u0017\u001a\u00020\u0015H\u0016J\b\u0010\u0018\u001a\u00020\u0015H\u0016J\b\u0010\u0019\u001a\u00020\u0015H\u0016J\b\u0010\u001a\u001a\u00020\u0015H\u0016J\b\u0010\u001b\u001a\u00020\u0015H\u0016J\u0011\u0010\u001c\u001a\u00020\u001dH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001eJ\b\u0010\u001f\u001a\u00020\u001dH\u0002R \u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\f0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006!"}, d2 = {"Lcom/google/samples/apps/iosched/shared/data/config/RemoteAppConfigDataSource;", "Lcom/google/samples/apps/iosched/shared/data/config/AppConfigDataSource;", "firebaseRemoteConfig", "Lcom/google/firebase/remoteconfig/FirebaseRemoteConfig;", "configSettings", "Lcom/google/firebase/remoteconfig/FirebaseRemoteConfigSettings;", "ioDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "(Lcom/google/firebase/remoteconfig/FirebaseRemoteConfig;Lcom/google/firebase/remoteconfig/FirebaseRemoteConfigSettings;Lkotlinx/coroutines/CoroutineDispatcher;)V", "_attributesLiveDataMap", "", "", "Landroidx/lifecycle/MutableLiveData;", "cacheExpirySeconds", "", "getStringLiveData", "Landroidx/lifecycle/LiveData;", "key", "getWifiInfo", "Lcom/google/samples/apps/iosched/model/ConferenceWifiInfo;", "isAssistantAppFeatureEnabled", "", "isCodelabsFeatureEnabled", "isExploreArFeatureEnabled", "isMapFeatureEnabled", "isReservationFeatureEnabled", "isSearchScheduleFeatureEnabled", "isSearchUsingRoomFeatureEnabled", "syncStrings", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateStrings", "Companion", "shared_staging"})
public final class RemoteAppConfigDataSource implements com.google.samples.apps.iosched.shared.data.config.AppConfigDataSource {
    private final java.util.Map<java.lang.String, androidx.lifecycle.MutableLiveData<java.lang.String>> _attributesLiveDataMap = null;
    private final long cacheExpirySeconds = 0L;
    private final com.google.firebase.remoteconfig.FirebaseRemoteConfig firebaseRemoteConfig = null;
    private final kotlinx.coroutines.CoroutineDispatcher ioDispatcher = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String WIFI_SSID_KEY = "wifi_ssid";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String WIFI_PASSWORD_KEY = "wifi_password";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String BADGE_PICK_UP_DAY0_START_TIME = "badge_pick_up_day0_start_time";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String BADGE_PICK_UP_DAY0_END_TIME = "badge_pick_up_day0_end_time";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String BADGE_PICK_UP_DAY1_START_TIME = "badge_pick_up_day1_start_time";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String BADGE_PICK_UP_DAY1_END_TIME = "badge_pick_up_day1_end_time";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String BREAKFAST_DAY1_START_TIME = "breakfast_day1_start_time";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String BREAKFAST_DAY1_END_TIME = "breakfast_day1_end_time";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String GOOGLE_KEYNOTE_START_TIME = "google_keynote_start_time";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String GOOGLE_KEYNOTE_END_TIME = "google_keynote_end_time";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String IO_STORE_DAY1_START_TIME = "io_store_day1_start_time";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String IO_STORE_DAY1_END_TIME = "io_store_day1_end_time";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String LUNCH_DAY1_START_TIME = "lunch_day1_start_time";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String LUNCH_DAY1_END_TIME = "lunch_day1_end_time";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String DEVELOPER_KEYNOTE_START_TIME = "developer_keynote_start_time";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String DEVELOPER_KEYNOTE_END_TIME = "developer_keynote_end_time";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String SESSIONS_DAY1_START_TIME = "sessions_day1_start_time";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String SESSIONS_DAY1_END_TIME = "sessions_day1_end_time";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String CODELABS_DAY1_START_TIME = "codelabs_day1_start_time";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String CODELABS_DAY1_END_TIME = "codelabs_day1_end_time";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String OFFICE_HOURS_DAY1_START_TIME = "office_hours_day1_start_time";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String OFFICE_HOURS_DAY1_END_TIME = "office_hours_day1_end_time";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String SANDBOXES_DAY1_START_TIME = "sandboxes_day1_start_time";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String SANDBOXES_DAY1_END_TIME = "sandboxes_day1_end_time";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String AFTER_DARK_START_TIME = "after_dark_start_time";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String AFTER_DARK_END_TIME = "after_dark_end_time";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String BADGE_DEVICE_PICK_UP_DAY2_START_TIME = "badge_device_pick_up_day2_start_time";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String BADGE_DEVICE_PICK_UP_DAY2_END_TIME = "badge_device_pick_up_day2_end_time";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String BREAKFAST_DAY2_START_TIME = "breakfast_day2_start_time";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String BREAKFAST_DAY2_END_TIME = "breakfast_day2_end_time";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String IO_STORE_DAY2_START_TIME = "io_store_day2_start_time";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String IO_STORE_DAY2_END_TIME = "io_store_day2_end_time";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String LUNCH_DAY2_START_TIME = "lunch_day2_start_time";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String LUNCH_DAY2_END_TIME = "lunch_day2_end_time";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String SESSIONS_DAY2_START_TIME = "sessions_day2_start_time";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String SESSIONS_DAY2_END_TIME = "sessions_day2_end_time";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String CODELABS_DAY2_START_TIME = "codelabs_day2_start_time";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String CODELABS_DAY2_END_TIME = "codelabs_day2_end_time";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String OFFICE_HOURS_DAY2_START_TIME = "office_hours_day2_start_time";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String OFFICE_HOURS_DAY2_END_TIME = "office_hours_day2_end_time";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String SANDBOXES_DAY2_START_TIME = "sandboxes_day2_start_time";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String SANDBOXES_DAY2_END_TIME = "sandboxes_day2_end_time";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String CONCERT_START_TIME = "concert_start_time";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String CONCERT_END_TIME = "concert_end_time";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String BADGE_DEVICE_PICK_UP_DAY3_START_TIME = "badge_device_pick_up_day3_start_time";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String BADGE_DEVICE_PICK_UP_DAY3_END_TIME = "badge_device_pick_up_day3_end_time";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String BREAKFAST_DAY3_START_TIME = "breakfast_day3_start_time";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String BREAKFAST_DAY3_END_TIME = "breakfast_day3_end_time";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String IO_STORE_DAY3_START_TIME = "io_store_day3_start_time";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String IO_STORE_DAY3_END_TIME = "io_store_day3_end_time";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String LUNCH_DAY3_START_TIME = "lunch_day3_start_time";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String LUNCH_DAY3_END_TIME = "lunch_day3_end_time";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String SESSIONS_DAY3_START_TIME = "sessions_day3_start_time";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String SESSIONS_DAY3_END_TIME = "sessions_day3_end_time";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String CODELABS_DAY3_START_TIME = "codelabs_day3_start_time";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String CODELABS_DAY3_END_TIME = "codelabs_day3_end_time";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String OFFICE_HOURS_DAY3_START_TIME = "office_hours_day3_start_time";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String OFFICE_HOURS_DAY3_END_TIME = "office_hours_day3_end_time";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String SANDBOXES_DAY3_START_TIME = "sandboxes_day3_start_time";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String SANDBOXES_DAY3_END_TIME = "sandboxes_day3_end_time";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String MAP_FEATURE_ENABLED = "map_enabled";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String EXPLORE_AR_FEATURE_ENABLED = "explore_ar_enabled";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String CODELABS_FEATURE_ENABLED = "codelabs_enabled";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String SEARCH_SCHEDULE_FEATURE_ENABLED = "search_schedule_enabled";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String SEARCH_USING_ROOM_FEATURE_ENABLED = "search_using_room_enabled";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ASSISTANT_APP_FEATURE_ENABLED = "io_assistant_app_enabled";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String RESERVATION_FEATURE_ENABLED = "reservation_enabled";
    private static final long DEFAULT_CACHE_EXPIRY_S = 0L;
    public static final com.google.samples.apps.iosched.shared.data.config.RemoteAppConfigDataSource.Companion Companion = null;
    
    private final void updateStrings() {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object syncStrings(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p0) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.lifecycle.LiveData<java.lang.String> getStringLiveData(@org.jetbrains.annotations.NotNull()
    java.lang.String key) {
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
    
    @javax.inject.Inject()
    public RemoteAppConfigDataSource(@org.jetbrains.annotations.NotNull()
    com.google.firebase.remoteconfig.FirebaseRemoteConfig firebaseRemoteConfig, @org.jetbrains.annotations.NotNull()
    com.google.firebase.remoteconfig.FirebaseRemoteConfigSettings configSettings, @org.jetbrains.annotations.NotNull()
    @com.google.samples.apps.iosched.shared.di.IoDispatcher()
    kotlinx.coroutines.CoroutineDispatcher ioDispatcher) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u001a\n\u0002\u0010\t\n\u0002\b,\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u001e\u001a\u00020\u001f\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u000e\u0010\"\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\'\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010+\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010,\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010-\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010.\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010/\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u00100\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u00101\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u00102\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u00103\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u00104\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u00105\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u00106\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u00107\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u00108\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u00109\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010:\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010;\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010<\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010=\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010>\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010?\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010@\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010A\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010B\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010C\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010D\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010E\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010F\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010G\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010H\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010I\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010J\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006K"}, d2 = {"Lcom/google/samples/apps/iosched/shared/data/config/RemoteAppConfigDataSource$Companion;", "", "()V", "AFTER_DARK_END_TIME", "", "AFTER_DARK_START_TIME", "ASSISTANT_APP_FEATURE_ENABLED", "BADGE_DEVICE_PICK_UP_DAY2_END_TIME", "BADGE_DEVICE_PICK_UP_DAY2_START_TIME", "BADGE_DEVICE_PICK_UP_DAY3_END_TIME", "BADGE_DEVICE_PICK_UP_DAY3_START_TIME", "BADGE_PICK_UP_DAY0_END_TIME", "BADGE_PICK_UP_DAY0_START_TIME", "BADGE_PICK_UP_DAY1_END_TIME", "BADGE_PICK_UP_DAY1_START_TIME", "BREAKFAST_DAY1_END_TIME", "BREAKFAST_DAY1_START_TIME", "BREAKFAST_DAY2_END_TIME", "BREAKFAST_DAY2_START_TIME", "BREAKFAST_DAY3_END_TIME", "BREAKFAST_DAY3_START_TIME", "CODELABS_DAY1_END_TIME", "CODELABS_DAY1_START_TIME", "CODELABS_DAY2_END_TIME", "CODELABS_DAY2_START_TIME", "CODELABS_DAY3_END_TIME", "CODELABS_DAY3_START_TIME", "CODELABS_FEATURE_ENABLED", "CONCERT_END_TIME", "CONCERT_START_TIME", "DEFAULT_CACHE_EXPIRY_S", "", "getDEFAULT_CACHE_EXPIRY_S", "()J", "DEVELOPER_KEYNOTE_END_TIME", "DEVELOPER_KEYNOTE_START_TIME", "EXPLORE_AR_FEATURE_ENABLED", "GOOGLE_KEYNOTE_END_TIME", "GOOGLE_KEYNOTE_START_TIME", "IO_STORE_DAY1_END_TIME", "IO_STORE_DAY1_START_TIME", "IO_STORE_DAY2_END_TIME", "IO_STORE_DAY2_START_TIME", "IO_STORE_DAY3_END_TIME", "IO_STORE_DAY3_START_TIME", "LUNCH_DAY1_END_TIME", "LUNCH_DAY1_START_TIME", "LUNCH_DAY2_END_TIME", "LUNCH_DAY2_START_TIME", "LUNCH_DAY3_END_TIME", "LUNCH_DAY3_START_TIME", "MAP_FEATURE_ENABLED", "OFFICE_HOURS_DAY1_END_TIME", "OFFICE_HOURS_DAY1_START_TIME", "OFFICE_HOURS_DAY2_END_TIME", "OFFICE_HOURS_DAY2_START_TIME", "OFFICE_HOURS_DAY3_END_TIME", "OFFICE_HOURS_DAY3_START_TIME", "RESERVATION_FEATURE_ENABLED", "SANDBOXES_DAY1_END_TIME", "SANDBOXES_DAY1_START_TIME", "SANDBOXES_DAY2_END_TIME", "SANDBOXES_DAY2_START_TIME", "SANDBOXES_DAY3_END_TIME", "SANDBOXES_DAY3_START_TIME", "SEARCH_SCHEDULE_FEATURE_ENABLED", "SEARCH_USING_ROOM_FEATURE_ENABLED", "SESSIONS_DAY1_END_TIME", "SESSIONS_DAY1_START_TIME", "SESSIONS_DAY2_END_TIME", "SESSIONS_DAY2_START_TIME", "SESSIONS_DAY3_END_TIME", "SESSIONS_DAY3_START_TIME", "WIFI_PASSWORD_KEY", "WIFI_SSID_KEY", "shared_staging"})
    public static final class Companion {
        
        public final long getDEFAULT_CACHE_EXPIRY_S() {
            return 0L;
        }
        
        private Companion() {
            super();
        }
    }
}