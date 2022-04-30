package com.google.samples.apps.iosched.shared.domain.sessions;

import com.google.samples.apps.iosched.shared.data.userevent.SessionAndUserEventRepository;
import com.google.samples.apps.iosched.shared.notifications.SessionAlarmManager;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;
import kotlinx.coroutines.CoroutineScope;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class NotificationAlarmUpdater_Factory implements Factory<NotificationAlarmUpdater> {
  private final Provider<SessionAlarmManager> alarmManagerProvider;

  private final Provider<SessionAndUserEventRepository> repositoryProvider;

  private final Provider<CoroutineScope> externalScopeProvider;

  public NotificationAlarmUpdater_Factory(Provider<SessionAlarmManager> alarmManagerProvider,
      Provider<SessionAndUserEventRepository> repositoryProvider,
      Provider<CoroutineScope> externalScopeProvider) {
    this.alarmManagerProvider = alarmManagerProvider;
    this.repositoryProvider = repositoryProvider;
    this.externalScopeProvider = externalScopeProvider;
  }

  @Override
  public NotificationAlarmUpdater get() {
    return newInstance(alarmManagerProvider.get(), repositoryProvider.get(), externalScopeProvider.get());
  }

  public static NotificationAlarmUpdater_Factory create(
      Provider<SessionAlarmManager> alarmManagerProvider,
      Provider<SessionAndUserEventRepository> repositoryProvider,
      Provider<CoroutineScope> externalScopeProvider) {
    return new NotificationAlarmUpdater_Factory(alarmManagerProvider, repositoryProvider, externalScopeProvider);
  }

  public static NotificationAlarmUpdater newInstance(SessionAlarmManager alarmManager,
      SessionAndUserEventRepository repository, CoroutineScope externalScope) {
    return new NotificationAlarmUpdater(alarmManager, repository, externalScope);
  }
}
