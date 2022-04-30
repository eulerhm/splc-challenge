package com.google.samples.apps.iosched.shared.domain.feed;

import com.google.samples.apps.iosched.shared.time.TimeProvider;
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
public final class GetConferenceStateUseCase_Factory implements Factory<GetConferenceStateUseCase> {
  private final Provider<CoroutineDispatcher> mainDispatcherProvider;

  private final Provider<TimeProvider> timeProvider;

  public GetConferenceStateUseCase_Factory(Provider<CoroutineDispatcher> mainDispatcherProvider,
      Provider<TimeProvider> timeProvider) {
    this.mainDispatcherProvider = mainDispatcherProvider;
    this.timeProvider = timeProvider;
  }

  @Override
  public GetConferenceStateUseCase get() {
    return newInstance(mainDispatcherProvider.get(), timeProvider.get());
  }

  public static GetConferenceStateUseCase_Factory create(
      Provider<CoroutineDispatcher> mainDispatcherProvider, Provider<TimeProvider> timeProvider) {
    return new GetConferenceStateUseCase_Factory(mainDispatcherProvider, timeProvider);
  }

  public static GetConferenceStateUseCase newInstance(CoroutineDispatcher mainDispatcher,
      TimeProvider timeProvider) {
    return new GetConferenceStateUseCase(mainDispatcher, timeProvider);
  }
}
