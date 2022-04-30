package com.google.samples.apps.iosched.shared.di;

import com.google.samples.apps.iosched.shared.data.db.AppDatabase;
import com.google.samples.apps.iosched.shared.domain.search.SessionTextMatchStrategy;
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
public final class SharedModule_ProvideSessionTextMatchStrategyFactory implements Factory<SessionTextMatchStrategy> {
  private final SharedModule module;

  private final Provider<Boolean> useRoomProvider;

  private final Provider<AppDatabase> appDatabaseProvider;

  public SharedModule_ProvideSessionTextMatchStrategyFactory(SharedModule module,
      Provider<Boolean> useRoomProvider, Provider<AppDatabase> appDatabaseProvider) {
    this.module = module;
    this.useRoomProvider = useRoomProvider;
    this.appDatabaseProvider = appDatabaseProvider;
  }

  @Override
  public SessionTextMatchStrategy get() {
    return provideSessionTextMatchStrategy(module, useRoomProvider.get(), appDatabaseProvider.get());
  }

  public static SharedModule_ProvideSessionTextMatchStrategyFactory create(SharedModule module,
      Provider<Boolean> useRoomProvider, Provider<AppDatabase> appDatabaseProvider) {
    return new SharedModule_ProvideSessionTextMatchStrategyFactory(module, useRoomProvider, appDatabaseProvider);
  }

  public static SessionTextMatchStrategy provideSessionTextMatchStrategy(SharedModule instance,
      boolean useRoom, AppDatabase appDatabase) {
    return Preconditions.checkNotNull(instance.provideSessionTextMatchStrategy(useRoom, appDatabase), "Cannot return null from a non-@Nullable @Provides method");
  }
}
