package com.google.samples.apps.iosched.shared.notifications;

import android.content.Context;
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
public final class SessionAlarmManager_Factory implements Factory<SessionAlarmManager> {
  private final Provider<Context> contextProvider;

  public SessionAlarmManager_Factory(Provider<Context> contextProvider) {
    this.contextProvider = contextProvider;
  }

  @Override
  public SessionAlarmManager get() {
    return newInstance(contextProvider.get());
  }

  public static SessionAlarmManager_Factory create(Provider<Context> contextProvider) {
    return new SessionAlarmManager_Factory(contextProvider);
  }

  public static SessionAlarmManager newInstance(Context context) {
    return new SessionAlarmManager(context);
  }
}
