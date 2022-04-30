package com.google.samples.apps.iosched.shared.di;

import com.google.samples.apps.iosched.shared.data.feed.AnnouncementDataSource;
import com.google.samples.apps.iosched.shared.data.feed.FeedRepository;
import com.google.samples.apps.iosched.shared.data.feed.MomentDataSource;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
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
public final class SharedModule_ProvideFeedRepositoryFactory implements Factory<FeedRepository> {
  private final SharedModule module;

  private final Provider<AnnouncementDataSource> announcementDataSourceProvider;

  private final Provider<MomentDataSource> momentDataSourceProvider;

  public SharedModule_ProvideFeedRepositoryFactory(SharedModule module,
      Provider<AnnouncementDataSource> announcementDataSourceProvider,
      Provider<MomentDataSource> momentDataSourceProvider) {
    this.module = module;
    this.announcementDataSourceProvider = announcementDataSourceProvider;
    this.momentDataSourceProvider = momentDataSourceProvider;
  }

  @Override
  public FeedRepository get() {
    return provideFeedRepository(module, announcementDataSourceProvider.get(), momentDataSourceProvider.get());
  }

  public static SharedModule_ProvideFeedRepositoryFactory create(SharedModule module,
      Provider<AnnouncementDataSource> announcementDataSourceProvider,
      Provider<MomentDataSource> momentDataSourceProvider) {
    return new SharedModule_ProvideFeedRepositoryFactory(module, announcementDataSourceProvider, momentDataSourceProvider);
  }

  public static FeedRepository provideFeedRepository(SharedModule instance,
      AnnouncementDataSource announcementDataSource, MomentDataSource momentDataSource) {
    return Preconditions.checkNotNull(instance.provideFeedRepository(announcementDataSource, momentDataSource), "Cannot return null from a non-@Nullable @Provides method");
  }
}
