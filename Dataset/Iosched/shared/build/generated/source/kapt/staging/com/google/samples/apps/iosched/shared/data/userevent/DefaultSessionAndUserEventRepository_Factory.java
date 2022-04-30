package com.google.samples.apps.iosched.shared.data.userevent;

import com.google.samples.apps.iosched.shared.data.session.SessionRepository;
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
public final class DefaultSessionAndUserEventRepository_Factory implements Factory<DefaultSessionAndUserEventRepository> {
  private final Provider<UserEventDataSource> userEventDataSourceProvider;

  private final Provider<SessionRepository> sessionRepositoryProvider;

  public DefaultSessionAndUserEventRepository_Factory(
      Provider<UserEventDataSource> userEventDataSourceProvider,
      Provider<SessionRepository> sessionRepositoryProvider) {
    this.userEventDataSourceProvider = userEventDataSourceProvider;
    this.sessionRepositoryProvider = sessionRepositoryProvider;
  }

  @Override
  public DefaultSessionAndUserEventRepository get() {
    return newInstance(userEventDataSourceProvider.get(), sessionRepositoryProvider.get());
  }

  public static DefaultSessionAndUserEventRepository_Factory create(
      Provider<UserEventDataSource> userEventDataSourceProvider,
      Provider<SessionRepository> sessionRepositoryProvider) {
    return new DefaultSessionAndUserEventRepository_Factory(userEventDataSourceProvider, sessionRepositoryProvider);
  }

  public static DefaultSessionAndUserEventRepository newInstance(
      UserEventDataSource userEventDataSource, SessionRepository sessionRepository) {
    return new DefaultSessionAndUserEventRepository(userEventDataSource, sessionRepository);
  }
}
