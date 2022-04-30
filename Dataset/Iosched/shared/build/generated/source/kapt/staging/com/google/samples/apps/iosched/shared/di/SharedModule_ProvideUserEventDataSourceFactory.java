package com.google.samples.apps.iosched.shared.di;

import com.google.samples.apps.iosched.shared.data.userevent.UserEventDataSource;
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
public final class SharedModule_ProvideUserEventDataSourceFactory implements Factory<UserEventDataSource> {
  private final SharedModule module;

  public SharedModule_ProvideUserEventDataSourceFactory(SharedModule module) {
    this.module = module;
  }

  @Override
  public UserEventDataSource get() {
    return provideUserEventDataSource(module);
  }

  public static SharedModule_ProvideUserEventDataSourceFactory create(SharedModule module) {
    return new SharedModule_ProvideUserEventDataSourceFactory(module);
  }

  public static UserEventDataSource provideUserEventDataSource(SharedModule instance) {
    return Preconditions.checkNotNull(instance.provideUserEventDataSource(), "Cannot return null from a non-@Nullable @Provides method");
  }
}
