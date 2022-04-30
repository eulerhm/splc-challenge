package com.google.samples.apps.iosched.shared.domain.search;

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
public final class FtsMatchStrategy_Factory implements Factory<FtsMatchStrategy> {
  private final Provider<AppDatabase> appDatabaseProvider;

  public FtsMatchStrategy_Factory(Provider<AppDatabase> appDatabaseProvider) {
    this.appDatabaseProvider = appDatabaseProvider;
  }

  @Override
  public FtsMatchStrategy get() {
    return newInstance(appDatabaseProvider.get());
  }

  public static FtsMatchStrategy_Factory create(Provider<AppDatabase> appDatabaseProvider) {
    return new FtsMatchStrategy_Factory(appDatabaseProvider);
  }

  public static FtsMatchStrategy newInstance(AppDatabase appDatabase) {
    return new FtsMatchStrategy(appDatabase);
  }
}
