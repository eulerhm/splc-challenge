package com.google.samples.apps.iosched.shared.di;

import com.google.samples.apps.iosched.shared.data.feed.AnnouncementDataSource;
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
public final class SharedModule_ProvideAnnouncementDataSourceFactory implements Factory<AnnouncementDataSource> {
  private final SharedModule module;

  public SharedModule_ProvideAnnouncementDataSourceFactory(SharedModule module) {
    this.module = module;
  }

  @Override
  public AnnouncementDataSource get() {
    return provideAnnouncementDataSource(module);
  }

  public static SharedModule_ProvideAnnouncementDataSourceFactory create(SharedModule module) {
    return new SharedModule_ProvideAnnouncementDataSourceFactory(module);
  }

  public static AnnouncementDataSource provideAnnouncementDataSource(SharedModule instance) {
    return Preconditions.checkNotNull(instance.provideAnnouncementDataSource(), "Cannot return null from a non-@Nullable @Provides method");
  }
}
