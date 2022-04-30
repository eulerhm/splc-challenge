package com.google.samples.apps.iosched.shared.data;

import com.google.samples.apps.iosched.shared.data.db.AppDatabase;
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
public final class ConferenceDataRepository_Factory implements Factory<ConferenceDataRepository> {
  private final Provider<ConferenceDataSource> remoteDataSourceProvider;

  private final Provider<ConferenceDataSource> boostrapDataSourceProvider;

  private final Provider<AppDatabase> appDatabaseProvider;

  public ConferenceDataRepository_Factory(Provider<ConferenceDataSource> remoteDataSourceProvider,
      Provider<ConferenceDataSource> boostrapDataSourceProvider,
      Provider<AppDatabase> appDatabaseProvider) {
    this.remoteDataSourceProvider = remoteDataSourceProvider;
    this.boostrapDataSourceProvider = boostrapDataSourceProvider;
    this.appDatabaseProvider = appDatabaseProvider;
  }

  @Override
  public ConferenceDataRepository get() {
    return newInstance(remoteDataSourceProvider.get(), boostrapDataSourceProvider.get(), appDatabaseProvider.get());
  }

  public static ConferenceDataRepository_Factory create(
      Provider<ConferenceDataSource> remoteDataSourceProvider,
      Provider<ConferenceDataSource> boostrapDataSourceProvider,
      Provider<AppDatabase> appDatabaseProvider) {
    return new ConferenceDataRepository_Factory(remoteDataSourceProvider, boostrapDataSourceProvider, appDatabaseProvider);
  }

  public static ConferenceDataRepository newInstance(ConferenceDataSource remoteDataSource,
      ConferenceDataSource boostrapDataSource, AppDatabase appDatabase) {
    return new ConferenceDataRepository(remoteDataSource, boostrapDataSource, appDatabase);
  }
}
