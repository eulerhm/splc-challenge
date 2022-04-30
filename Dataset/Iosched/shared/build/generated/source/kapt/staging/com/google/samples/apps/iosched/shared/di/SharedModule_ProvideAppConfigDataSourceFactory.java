package com.google.samples.apps.iosched.shared.di;

import com.google.samples.apps.iosched.shared.data.config.AppConfigDataSource;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class SharedModule_ProvideAppConfigDataSourceFactory implements Factory<AppConfigDataSource> {
  private final SharedModule module;

  public SharedModule_ProvideAppConfigDataSourceFactory(SharedModule module) {
    this.module = module;
  }

  @Override
  public AppConfigDataSource get() {
    return provideAppConfigDataSource(module);
  }

  public static SharedModule_ProvideAppConfigDataSourceFactory create(SharedModule module) {
    return new SharedModule_ProvideAppConfigDataSourceFactory(module);
  }

  public static AppConfigDataSource provideAppConfigDataSource(SharedModule instance) {
    return Preconditions.checkNotNull(instance.provideAppConfigDataSource(), "Cannot return null from a non-@Nullable @Provides method");
  }
}
