package com.google.samples.apps.iosched.shared.domain.sessions;

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
public final class LoadSessionUseCase_Factory implements Factory<LoadSessionUseCase> {
  private final Provider<SessionRepository> repositoryProvider;

  public LoadSessionUseCase_Factory(Provider<SessionRepository> repositoryProvider) {
    this.repositoryProvider = repositoryProvider;
  }

  @Override
  public LoadSessionUseCase get() {
    return newInstance(repositoryProvider.get());
  }

  public static LoadSessionUseCase_Factory create(Provider<SessionRepository> repositoryProvider) {
    return new LoadSessionUseCase_Factory(repositoryProvider);
  }

  public static LoadSessionUseCase newInstance(SessionRepository repository) {
    return new LoadSessionUseCase(repository);
  }
}
