package com.google.samples.apps.iosched.shared.data.feed;

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
public final class DefaultFeedRepository_Factory implements Factory<DefaultFeedRepository> {
  private final Provider<AnnouncementDataSource> announcementDataSourceProvider;

  private final Provider<MomentDataSource> momentDataSourceProvider;

  public DefaultFeedRepository_Factory(
      Provider<AnnouncementDataSource> announcementDataSourceProvider,
      Provider<MomentDataSource> momentDataSourceProvider) {
    this.announcementDataSourceProvider = announcementDataSourceProvider;
    this.momentDataSourceProvider = momentDataSourceProvider;
  }

  @Override
  public DefaultFeedRepository get() {
    return newInstance(announcementDataSourceProvider.get(), momentDataSourceProvider.get());
  }

  public static DefaultFeedRepository_Factory create(
      Provider<AnnouncementDataSource> announcementDataSourceProvider,
      Provider<MomentDataSource> momentDataSourceProvider) {
    return new DefaultFeedRepository_Factory(announcementDataSourceProvider, momentDataSourceProvider);
  }

  public static DefaultFeedRepository newInstance(AnnouncementDataSource announcementDataSource,
      MomentDataSource momentDataSource) {
    return new DefaultFeedRepository(announcementDataSource, momentDataSource);
  }
}
