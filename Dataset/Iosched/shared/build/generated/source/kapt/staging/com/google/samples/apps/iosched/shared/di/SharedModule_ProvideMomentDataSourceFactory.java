package com.google.samples.apps.iosched.shared.di;

import com.google.samples.apps.iosched.shared.data.feed.MomentDataSource;
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
public final class SharedModule_ProvideMomentDataSourceFactory implements Factory<MomentDataSource> {
  private final SharedModule module;

  public SharedModule_ProvideMomentDataSourceFactory(SharedModule module) {
    this.module = module;
  }

  @Override
  public MomentDataSource get() {
    return provideMomentDataSource(module);
  }

  public static SharedModule_ProvideMomentDataSourceFactory create(SharedModule module) {
    return new SharedModule_ProvideMomentDataSourceFactory(module);
  }

  public static MomentDataSource provideMomentDataSource(SharedModule instance) {
    return Preconditions.checkNotNull(instance.provideMomentDataSource(), "Cannot return null from a non-@Nullable @Provides method");
  }
}
