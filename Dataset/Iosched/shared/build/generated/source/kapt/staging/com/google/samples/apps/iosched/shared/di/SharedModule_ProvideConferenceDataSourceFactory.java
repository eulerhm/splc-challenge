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
public final class SharedModule_ProvideConferenceDataSourceFactory implements Factory<ConferenceDataSource> {
  private final SharedModule module;

  public SharedModule_ProvideConferenceDataSourceFactory(SharedModule module) {
    this.module = module;
  }

  @Override
  public ConferenceDataSource get() {
    return provideConferenceDataSource(module);
  }

  public static SharedModule_ProvideConferenceDataSourceFactory create(SharedModule module) {
    return new SharedModule_ProvideConferenceDataSourceFactory(module);
  }

  public static ConferenceDataSource provideConferenceDataSource(SharedModule instance) {
    return Preconditions.checkNotNull(instance.provideConferenceDataSource(), "Cannot return null from a non-@Nullable @Provides method");
  }
}
