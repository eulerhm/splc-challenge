package com.google.samples.apps.iosched.shared.di;

import com.google.samples.apps.iosched.shared.data.session.SessionRepository;
import com.google.samples.apps.iosched.shared.data.userevent.SessionAndUserEventRepository;
import com.google.samples.apps.iosched.shared.data.userevent.UserEventDataSource;
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
public final class SharedModule_ProvideSessionAndUserEventRepositoryFactory implements Factory<SessionAndUserEventRepository> {
  private final SharedModule module;

  private final Provider<UserEventDataSource> userEventDataSourceProvider;

  private final Provider<SessionRepository> sessionRepositoryProvider;

  public SharedModule_ProvideSessionAndUserEventRepositoryFactory(SharedModule module,
      Provider<UserEventDataSource> userEventDataSourceProvider,
      Provider<SessionRepository> sessionRepositoryProvider) {
    this.module = module;
    this.userEventDataSourceProvider = userEventDataSourceProvider;
    this.sessionRepositoryProvider = sessionRepositoryProvider;
  }

  @Override
  public SessionAndUserEventRepository get() {
    return provideSessionAndUserEventRepository(module, userEventDataSourceProvider.get(), sessionRepositoryProvider.get());
  }

  public static SharedModule_ProvideSessionAndUserEventRepositoryFactory create(SharedModule module,
      Provider<UserEventDataSource> userEventDataSourceProvider,
      Provider<SessionRepository> sessionRepositoryProvider) {
    return new SharedModule_ProvideSessionAndUserEventRepositoryFactory(module, userEventDataSourceProvider, sessionRepositoryProvider);
  }

  public static SessionAndUserEventRepository provideSessionAndUserEventRepository(
      SharedModule instance, UserEventDataSource userEventDataSource,
      SessionRepository sessionRepository) {
    return Preconditions.checkNotNull(instance.provideSessionAndUserEventRepository(userEventDataSource, sessionRepository), "Cannot return null from a non-@Nullable @Provides method");
  }
}
