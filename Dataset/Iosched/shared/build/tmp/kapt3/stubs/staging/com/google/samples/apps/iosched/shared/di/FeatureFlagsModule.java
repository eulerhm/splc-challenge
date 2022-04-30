package com.google.samples.apps.iosched.shared.di;

import java.lang.System;

@dagger.hilt.InstallIn(value = {dagger.hilt.android.components.ApplicationComponent.class})
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007\u00a8\u0006\r"}, d2 = {"Lcom/google/samples/apps/iosched/shared/di/FeatureFlagsModule;", "", "()V", "provideAssistantAppEnabledFlag", "", "appConfig", "Lcom/google/samples/apps/iosched/shared/data/config/AppConfigDataSource;", "provideCodelabsEnabledFlag", "provideEnableExploreArFlag", "provideMapFeatureEnabledFlag", "provideReservationEnabledFlag", "provideSearchScheduleEnabledFlag", "provideSearchUsingRoomEnabledFlag", "shared_staging"})
@dagger.Module()
public final class FeatureFlagsModule {
    
    @ExploreArEnabledFlag()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final boolean provideEnableExploreArFlag(@org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.shared.data.config.AppConfigDataSource appConfig) {
        return false;
    }
    
    @MapFeatureEnabledFlag()
    @dagger.Provides()
    public final boolean provideMapFeatureEnabledFlag(@org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.shared.data.config.AppConfigDataSource appConfig) {
        return false;
    }
    
    @CodelabsEnabledFlag()
    @dagger.Provides()
    public final boolean provideCodelabsEnabledFlag(@org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.shared.data.config.AppConfigDataSource appConfig) {
        return false;
    }
    
    @SearchScheduleEnabledFlag()
    @dagger.Provides()
    public final boolean provideSearchScheduleEnabledFlag(@org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.shared.data.config.AppConfigDataSource appConfig) {
        return false;
    }
    
    @SearchUsingRoomEnabledFlag()
    @dagger.Provides()
    public final boolean provideSearchUsingRoomEnabledFlag(@org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.shared.data.config.AppConfigDataSource appConfig) {
        return false;
    }
    
    @AssistantAppEnabledFlag()
    @dagger.Provides()
    public final boolean provideAssistantAppEnabledFlag(@org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.shared.data.config.AppConfigDataSource appConfig) {
        return false;
    }
    
    @ReservationEnabledFlag()
    @dagger.Provides()
    public final boolean provideReservationEnabledFlag(@org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.shared.data.config.AppConfigDataSource appConfig) {
        return false;
    }
    
    public FeatureFlagsModule() {
        super();
    }
}