package com.google.samples.apps.iosched.shared.di;

import com.google.samples.apps.iosched.shared.data.ConferenceDataSource;
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
public final class SharedModule_ProvideBootstrapRemoteSessionDataSourceFactory implements Factory<ConferenceDataSource> {
  private final SharedModule module;

  public SharedModule_ProvideBootstrapRemoteSessionDataSourceFactory(SharedModule module) {
    this.module = module;
  }

  @Override
  public ConferenceDataSource get() {
    return provideBootstrapRemoteSessionDataSource(module);
  }

  public static SharedModule_ProvideBootstrapRemoteSessionDataSourceFactory create(
      SharedModule module) {
    return new SharedModule_ProvideBootstrapRemoteSessionDataSourceFactory(module);
  }

  public static ConferenceDataSource provideBootstrapRemoteSessionDataSource(
      SharedModule instance) {
    return Preconditions.checkNotNull(instance.provideBootstrapRemoteSessionDataSource(), "Cannot return null from a non-@Nullable @Provides method");
  }
}
