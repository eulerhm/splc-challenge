package com.google.samples.apps.iosched.shared.di;

import com.google.samples.apps.iosched.shared.time.TimeProvider;
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
public final class SharedModule_ProvideTimeProviderFactory implements Factory<TimeProvider> {
  private final SharedModule module;

  public SharedModule_ProvideTimeProviderFactory(SharedModule module) {
    this.module = module;
  }

  @Override
  public TimeProvider get() {
    return provideTimeProvider(module);
  }

  public static SharedModule_ProvideTimeProviderFactory create(SharedModule module) {
    return new SharedModule_ProvideTimeProviderFactory(module);
  }

  public static TimeProvider provideTimeProvider(SharedModule instance) {
    return Preconditions.checkNotNull(instance.provideTimeProvider(), "Cannot return null from a non-@Nullable @Provides method");
  }
}
