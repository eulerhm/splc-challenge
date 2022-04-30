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
public final class FeatureFlagsModule_ProvideReservationEnabledFlagFactory implements Factory<Boolean> {
  private final FeatureFlagsModule module;

  private final Provider<AppConfigDataSource> appConfigProvider;

  public FeatureFlagsModule_ProvideReservationEnabledFlagFactory(FeatureFlagsModule module,
      Provider<AppConfigDataSource> appConfigProvider) {
    this.module = module;
    this.appConfigProvider = appConfigProvider;
  }

  @Override
  public Boolean get() {
    return provideReservationEnabledFlag(module, appConfigProvider.get());
  }

  public static FeatureFlagsModule_ProvideReservationEnabledFlagFactory create(
      FeatureFlagsModule module, Provider<AppConfigDataSource> appConfigProvider) {
    return new FeatureFlagsModule_ProvideReservationEnabledFlagFactory(module, appConfigProvider);
  }

  public static boolean provideReservationEnabledFlag(FeatureFlagsModule instance,
      AppConfigDataSource appConfig) {
    return instance.provideReservationEnabledFlag(appConfig);
  }
}
