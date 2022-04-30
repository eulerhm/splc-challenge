package com.google.samples.apps.iosched.shared.domain.users;

import com.google.samples.apps.iosched.shared.data.userevent.SessionAndUserEventRepository;
import com.google.samples.apps.iosched.shared.domain.sessions.StarReserveNotificationAlarmUpdater;
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
public final class ReservationActionUseCase_Factory implements Factory<ReservationActionUseCase> {
  private final Provider<SessionAndUserEventRepository> repositoryProvider;

  private final Provider<StarReserveNotificationAlarmUpdater> alarmUpdaterProvider;

  private final Provider<CoroutineDispatcher> ioDispatcherProvider;

  public ReservationActionUseCase_Factory(
      Provider<SessionAndUserEventRepository> repositoryProvider,
      Provider<StarReserveNotificationAlarmUpdater> alarmUpdaterProvider,
      Provider<CoroutineDispatcher> ioDispatcherProvider) {
    this.repositoryProvider = repositoryProvider;
    this.alarmUpdaterProvider = alarmUpdaterProvider;
    this.ioDispatcherProvider = ioDispatcherProvider;
  }

  @Override
  public ReservationActionUseCase get() {
    return newInstance(repositoryProvider.get(), alarmUpdaterProvider.get(), ioDispatcherProvider.get());
  }

  public static ReservationActionUseCase_Factory create(
      Provider<SessionAndUserEventRepository> repositoryProvider,
      Provider<StarReserveNotificationAlarmUpdater> alarmUpdaterProvider,
      Provider<CoroutineDispatcher> ioDispatcherProvider) {
    return new ReservationActionUseCase_Factory(repositoryProvider, alarmUpdaterProvider, ioDispatcherProvider);
  }

  public static ReservationActionUseCase newInstance(SessionAndUserEventRepository repository,
      StarReserveNotificationAlarmUpdater alarmUpdater, CoroutineDispatcher ioDispatcher) {
    return new ReservationActionUseCase(repository, alarmUpdater, ioDispatcher);
  }
}
