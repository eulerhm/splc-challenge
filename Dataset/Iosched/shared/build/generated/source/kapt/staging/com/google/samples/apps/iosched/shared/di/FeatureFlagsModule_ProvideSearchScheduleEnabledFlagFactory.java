package com.google.samples.apps.iosched.shared.di;

import com.google.samples.apps.iosched.shared.data.config.AppConfigDataSource;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class FeatureFlagsModule_ProvideSearchScheduleEnabledFlagFactory implements Factory<Boolean> {
  private final FeatureFlagsModule module;

  private final Provider<AppConfigDataSource> appConfigProvider;

  public FeatureFlagsModule_ProvideSearchScheduleEnabledFlagFactory(FeatureFlagsModule module,
      Provider<AppConfigDataSource> appConfigProvider) {
    this.module = module;
    this.appConfigProvider = appConfigProvider;
  }

  @Override
  public Boolean get() {
    return provideSearchScheduleEnabledFlag(module, appConfigProvider.get());
  }

  public static FeatureFlagsModule_ProvideSearchScheduleEnabledFlagFactory create(
      FeatureFlagsModule module, Provider<AppConfigDataSource> appConfigProvider) {
    return new FeatureFlagsModule_ProvideSearchScheduleEnabledFlagFactory(module, appConfigProvider);
  }

  public static boolean provideSearchScheduleEnabledFlag(FeatureFlagsModule instance,
      AppConfigDataSource appConfig) {
    return instance.provideSearchScheduleEnabledFlag(appConfig);
  }
}
