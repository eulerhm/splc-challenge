package com.google.samples.apps.iosched.shared.domain.users;

import com.google.samples.apps.iosched.shared.data.feedback.FeedbackEndpoint;
import com.google.samples.apps.iosched.shared.data.userevent.SessionAndUserEventRepository;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;
import kotlinx.coroutines.CoroutineDispatcher;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class FeedbackUseCase_Factory implements Factory<FeedbackUseCase> {
  private final Provider<FeedbackEndpoint> endpointProvider;

  private final Provider<SessionAndUserEventRepository> repositoryProvider;

  private final Provider<CoroutineDispatcher> dispatcherProvider;

  public FeedbackUseCase_Factory(Provider<FeedbackEndpoint> endpointProvider,
      Provider<SessionAndUserEventRepository> repositoryProvider,
      Provider<CoroutineDispatcher> dispatcherProvider) {
    this.endpointProvider = endpointProvider;
    this.repositoryProvider = repositoryProvider;
    this.dispatcherProvider = dispatcherProvider;
  }

  @Override
  public FeedbackUseCase get() {
    return newInstance(endpointProvider.get(), repositoryProvider.get(), dispatcherProvider.get());
  }

  public static FeedbackUseCase_Factory create(Provider<FeedbackEndpoint> endpointProvider,
      Provider<SessionAndUserEventRepository> repositoryProvider,
      Provider<CoroutineDispatcher> dispatcherProvider) {
    return new FeedbackUseCase_Factory(endpointProvider, repositoryProvider, dispatcherProvider);
  }

  public static FeedbackUseCase newInstance(FeedbackEndpoint endpoint,
      SessionAndUserEventRepository repository, CoroutineDispatcher dispatcher) {
    return new FeedbackUseCase(endpoint, repository, dispatcher);
  }
}
