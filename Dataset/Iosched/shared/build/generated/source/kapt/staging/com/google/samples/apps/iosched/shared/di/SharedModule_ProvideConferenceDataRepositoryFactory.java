package com.google.samples.apps.iosched.shared.di;

import com.google.samples.apps.iosched.shared.data.ConferenceDataRepository;
import com.google.samples.apps.iosched.shared.data.ConferenceDataSource;
import com.google.samples.apps.iosched.shared.data.db.AppDatabase;
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
public final class SharedModule_ProvideConferenceDataRepositoryFactory implements Factory<ConferenceDataRepository> {
  private final SharedModule module;

  private final Provider<ConferenceDataSource> remoteDataSourceProvider;

  private final Provider<ConferenceDataSource> boostrapDataSourceProvider;

  private final Provider<AppDatabase> appDatabaseProvider;

  public SharedModule_ProvideConferenceDataRepositoryFactory(SharedModule module,
      Provider<ConferenceDataSource> remoteDataSourceProvider,
      Provider<ConferenceDataSource> boostrapDataSourceProvider,
      Provider<AppDatabase> appDatabaseProvider) {
    this.module = module;
    this.remoteDataSourceProvider = remoteDataSourceProvider;
    this.boostrapDataSourceProvider = boostrapDataSourceProvider;
    this.appDatabaseProvider = appDatabaseProvider;
  }

  @Override
  public ConferenceDataRepository get() {
    return provideConferenceDataRepository(module, remoteDataSourceProvider.get(), boostrapDataSourceProvider.get(), appDatabaseProvider.get());
  }

  public static SharedModule_ProvideConferenceDataRepositoryFactory create(SharedModule module,
      Provider<ConferenceDataSource> remoteDataSourceProvider,
      Provider<ConferenceDataSource> boostrapDataSourceProvider,
      Provider<AppDatabase> appDatabaseProvider) {
    return new SharedModule_ProvideConferenceDataRepositoryFactory(module, remoteDataSourceProvider, boostrapDataSourceProvider, appDatabaseProvider);
  }

  public static ConferenceDataRepository provideConferenceDataRepository(SharedModule instance,
      ConferenceDataSource remoteDataSource, ConferenceDataSource boostrapDataSource,
      AppDatabase appDatabase) {
    return Preconditions.checkNotNull(instance.provideConferenceDataRepository(remoteDataSource, boostrapDataSource, appDatabase), "Cannot return null from a non-@Nullable @Provides method");
  }
}
