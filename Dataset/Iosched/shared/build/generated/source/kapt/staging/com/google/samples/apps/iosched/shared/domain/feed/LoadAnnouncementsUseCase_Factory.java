package com.google.samples.apps.iosched.shared.domain.feed;

import com.google.samples.apps.iosched.shared.data.feed.FeedRepository;
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
public final class LoadAnnouncementsUseCase_Factory implements Factory<LoadAnnouncementsUseCase> {
  private final Provider<FeedRepository> repositoryProvider;

  private final Provider<CoroutineDispatcher> dispatcherProvider;

  public LoadAnnouncementsUseCase_Factory(Provider<FeedRepository> repositoryProvider,
      Provider<CoroutineDispatcher> dispatcherProvider) {
    this.repositoryProvider = repositoryProvider;
    this.dispatcherProvider = dispatcherProvider;
  }

  @Override
  public LoadAnnouncementsUseCase get() {
    return newInstance(repositoryProvider.get(), dispatcherProvider.get());
  }

  public static LoadAnnouncementsUseCase_Factory create(Provider<FeedRepository> repositoryProvider,
      Provider<CoroutineDispatcher> dispatcherProvider) {
    return new LoadAnnouncementsUseCase_Factory(repositoryProvider, dispatcherProvider);
  }

  public static LoadAnnouncementsUseCase newInstance(FeedRepository repository,
      CoroutineDispatcher dispatcher) {
    return new LoadAnnouncementsUseCase(repository, dispatcher);
  }
}
