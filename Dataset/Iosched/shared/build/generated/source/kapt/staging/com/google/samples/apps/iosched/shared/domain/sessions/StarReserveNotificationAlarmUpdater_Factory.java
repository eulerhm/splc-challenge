package com.google.samples.apps.iosched.shared.domain.sessions;

import com.google.samples.apps.iosched.shared.notifications.SessionAlarmManager;
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
public final class StarReserveNotificationAlarmUpdater_Factory implements Factory<StarReserveNotificationAlarmUpdater> {
  private final Provider<SessionAlarmManager> alarmManagerProvider;

  public StarReserveNotificationAlarmUpdater_Factory(
      Provider<SessionAlarmManager> alarmManagerProvider) {
    this.alarmManagerProvider = alarmManagerProvider;
  }

  @Override
  public StarReserveNotificationAlarmUpdater get() {
    return newInstance(alarmManagerProvider.get());
  }

  public static StarReserveNotificationAlarmUpdater_Factory create(
      Provider<SessionAlarmManager> alarmManagerProvider) {
    return new StarReserveNotificationAlarmUpdater_Factory(alarmManagerProvider);
  }

  public static StarReserveNotificationAlarmUpdater newInstance(SessionAlarmManager alarmManager) {
    return new StarReserveNotificationAlarmUpdater(alarmManager);
  }
}
